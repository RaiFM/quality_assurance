const { chromium } = require('playwright');

(async () => {
    const browser = await chromium.launch({ headless: false });
    const page = await browser.newPage();

    await page.goto("https://the-internet.herokuapp.com/login");

    await page.fill("#username", "tomsmith");
    await page.fill("#password", "SuperSecretPassword!");
    await page.click('button[type="submit"]');

    const mensagem = await page.textContent("#flash");

    if (mensagem.includes("You logged into a secure area!")) {
        console.log("✔ LOGIN funcionando!");
    } else {
        console.log("❌ LOGIN falhou.");
    }

    await browser.close();
})();

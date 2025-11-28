const axios = require("axios");

(async () => {
    try {
        const resposta = await axios.get("https://jsonplaceholder.typicode.com/posts/1");

        if (resposta.status === 200) {
            console.log("✔ API funcionando!");
            console.log(resposta.data);
        }
    } catch (e) {
        console.log("❌ Erro na API:", e.message);
    }
})();

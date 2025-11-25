package com.example.pedido;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    private Pedido pedido;

    @BeforeAll
    static void setupAll() {
        System.out.println("Iniciando suite de testes do sistema de pedidos...");
    }

    @BeforeEach
    void setup() {
        pedido = new Pedido();
    }

    @Test
    void deveAdicionarItem() {
        Produto produto = new Produto("Teclado", 100);
        ItemDoPedido item = new ItemDoPedido(produto, 1);
        pedido.adicionarItem(item);
        assertEquals(1, pedido.getQuantidadeItens());
        assertTrue(pedido.getItens().contains(item));
    }

    @Test
    void deveCalcularTotal() {
        Produto p1 = new Produto("Monitor", 800);
        Produto p2 = new Produto("Mouse", 50);
        pedido.adicionarItem(new ItemDoPedido(p1, 1));
        pedido.adicionarItem(new ItemDoPedido(p2, 2));
        double total = pedido.calcularTotal();
        assertEquals(900, total);
    }

    @Test
    void deveRemoverItem() {
        Produto produto = new Produto("Fone", 200);
        ItemDoPedido item = new ItemDoPedido(produto, 1);
        pedido.adicionarItem(item);
        pedido.removerItem(item);
        assertEquals(0, pedido.getQuantidadeItens());
        assertFalse(pedido.getItens().contains(item));
    }

    @AfterEach
    void teardown() {
        System.out.println("Teste executado com sucesso.");
    }

    @AfterAll
    static void teardownAll() {
        System.out.println("Todos os testes finalizados.");
    }
}

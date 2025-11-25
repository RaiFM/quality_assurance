package com.example.pedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<ItemDoPedido> itens = new ArrayList<>();

    public void adicionarItem(ItemDoPedido item) {
        itens.add(item);
    }

    public void removerItem(ItemDoPedido item) {
        itens.remove(item);
    }

    public List<ItemDoPedido> getItens() {
        return itens;
    }

    public int getQuantidadeItens() {
        return itens.size();
    }

    public double calcularTotal() {
        return itens.stream()
                .mapToDouble(ItemDoPedido::getSubtotal)
                .sum();
    }
}

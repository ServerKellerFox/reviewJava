package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListReview {

    /* ArrayList */
    List<String> transactions = new ArrayList<>();
    transacoes.add("Depósito: R$1000");
    transacoes.add("Saque: R$500");
    transacoes.add("Transferência: R$200");

    // Acessando rapidamente uma transação específica
    System.out.println(transacoes.get(1)); // Saque: R$500

    /***** LinkedList *****
    * Uso típico: Quando você precisa inserir
    *  e remover elementos com frequência de qualquer
    *  parte da lista (não só do final).*/
    List<String> customer = new LinkedList<>();
    customer.add("Cliente-01");
    customer.add("Cliente-02");
    customer.add("Cliente-03");

    // Atendendo o primeiro cliente da fila
    System.out.println("Atendendo: " + fila.removeFirst()); // Cliente 1

    /***** Vector *****
     * Uso típico: Quando você precisa de um ArrayList,
     * mas precisa que ele seja seguro para uso em múltiplas
     * threads (embora atualmente seja recomendado usar outras
     * técnicas de sincronização)..*/
    List<String> clientes = new Vector<>();
        clientes.add("Cliente A");
        clientes.add("Cliente B");
        clientes.add("Cliente C");

    // Acessando cliente
        System.out.println(clientes.get(2)); // Cliente C





}

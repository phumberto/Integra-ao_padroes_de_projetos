package app;

import factory.ProductStore;
import factory.TelevisionStore;
import model.product.Product;
import observer.Cliente;
import observer.PromocaoTV;
import singleton.GerenciadorDaLoja;

public class Client {

    public static void main(String[] args) {

        ProductStore store = new TelevisionStore();

        Product product = store.orderProduct("smart");
        System.out.println("Customer ordered a " + product.getName());
        product.printNotaFiscal();

        System.out.println();
        GerenciadorDaLoja.getInstance().imprimirProdutosVendidos();

        System.out.println();
        PromocaoTV promocao = new PromocaoTV();
        Cliente carlos = new Cliente("Carlos");
        Cliente maria = new Cliente("Maria");

        promocao.addObserver(carlos);
        promocao.addObserver(maria);

        promocao.colocarEmPromocao("smart tv");

        System.out.println();
        carlos.imprimirNotificacoes();
        maria.imprimirNotificacoes();
    }
}

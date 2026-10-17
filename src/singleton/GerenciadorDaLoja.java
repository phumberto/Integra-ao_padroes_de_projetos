package singleton;

import java.util.ArrayList;
import java.util.List;
import model.product.Product;

public class GerenciadorDaLoja {

    private static GerenciadorDaLoja instance;

    private final List<Product> produtosVendidos = new ArrayList<>();

    private GerenciadorDaLoja() {
    }

    public static synchronized GerenciadorDaLoja getInstance() {
        if (instance == null) {
            instance = new GerenciadorDaLoja();
        }
        return instance;
    }

    public void registrarVenda(Product product) {
        produtosVendidos.add(product);
    }

    public void imprimirProdutosVendidos() {
        System.out.println("========== PRODUTOS VENDIDOS ==========");
        for (Product p : produtosVendidos) {
            System.out.println("- " + p.getName());
        }
        System.out.println("Total de vendas: " + produtosVendidos.size());
    }
}

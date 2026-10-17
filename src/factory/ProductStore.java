package factory;

import model.product.Product;
import singleton.GerenciadorDaLoja;

public abstract class ProductStore {

    public Product orderProduct(String type) {
        Product product = createProduct(type);

        if (product == null) {
            System.out.println("Produto indisponível: " + type);
            return null;
        }

        product.getProduct();
        product.getPrice();

        GerenciadorDaLoja.getInstance().registrarVenda(product);

        return product;
    }

    protected abstract Product createProduct(String type);
}

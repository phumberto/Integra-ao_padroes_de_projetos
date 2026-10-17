package factory;

import factory.abstractFactory.OledTVNotaFiscalAbstractFactory;
import factory.abstractFactory.QledTVNotaFiscalAbstractFactory;
import factory.abstractFactory.SmartTVNotaFiscalAbstractFactory;
import model.product.OledTV;
import model.product.Product;
import model.product.QledTV;
import model.product.SmartTV;

public class TelevisionStore extends ProductStore {

    @Override
    protected Product createProduct(String type) {
        switch (type) {
            case "smart":
                return new SmartTV(new SmartTVNotaFiscalAbstractFactory());
            case "oled":
                return new OledTV(new OledTVNotaFiscalAbstractFactory());
            case "qled":
                return new QledTV(new QledTVNotaFiscalAbstractFactory());
            default:
                return null;
        }
    }
}

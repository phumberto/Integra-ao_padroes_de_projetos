package model.product;

import factory.abstractFactory.NotaFiscalAbstractFactory;

public class SmartTV extends Product {

    public SmartTV(NotaFiscalAbstractFactory nota) {
        super(nota);
        name = "Smart TV";
        price = 2500.0;
    }
}

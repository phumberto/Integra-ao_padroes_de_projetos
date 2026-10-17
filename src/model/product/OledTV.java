package model.product;

import factory.abstractFactory.NotaFiscalAbstractFactory;

public class OledTV extends Product {

    public OledTV(NotaFiscalAbstractFactory nota) {
        super(nota);
        name = "TV OLED";
        price = 6000.0;
    }
}

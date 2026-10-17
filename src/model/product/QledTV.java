package model.product;

import factory.abstractFactory.NotaFiscalAbstractFactory;

public class QledTV extends Product {

    public QledTV(NotaFiscalAbstractFactory nota) {
        super(nota);
        name = "TV QLED";
        price = 4500.0;
    }
}

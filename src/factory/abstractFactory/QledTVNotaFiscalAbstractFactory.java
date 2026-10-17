package factory.abstractFactory;

import model.nota.NotaFiscal;
import model.nota.QledTVNotaFiscal;

public class QledTVNotaFiscalAbstractFactory implements NotaFiscalAbstractFactory {

    @Override
    public NotaFiscal createNotaFiscal() {
        return new QledTVNotaFiscal();
    }
}

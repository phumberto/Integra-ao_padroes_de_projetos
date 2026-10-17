package factory.abstractFactory;

import model.nota.NotaFiscal;
import model.nota.OledTVNotaFiscal;

public class OledTVNotaFiscalAbstractFactory implements NotaFiscalAbstractFactory {

    @Override
    public NotaFiscal createNotaFiscal() {
        return new OledTVNotaFiscal();
    }
}

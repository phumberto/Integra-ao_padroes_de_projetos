package factory.abstractFactory;

import model.nota.NotaFiscal;
import model.nota.SmartTVNotaFiscal;

public class SmartTVNotaFiscalAbstractFactory implements NotaFiscalAbstractFactory {

    @Override
    public NotaFiscal createNotaFiscal() {
        return new SmartTVNotaFiscal();
    }
}

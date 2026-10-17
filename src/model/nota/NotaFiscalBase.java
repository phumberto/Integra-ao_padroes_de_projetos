package model.nota;

public abstract class NotaFiscalBase implements NotaFiscal {

    private static final String LINHA = "=".repeat(32);
    private static final String LOJA = "TV STORE";
    private static final String RESPONSAVEL = "Pedro Humberto";
    private static final String EMAIL = "pedro.humberto@upe.br";

    protected abstract String getNomeProduto();

    @Override
    public String applyNotaFiscal() {
        return LINHA + "\n"
             + "     " + LOJA + "\n"
             + LINHA + "\n"
             + "Responsável: " + RESPONSAVEL + "\n"
             + "E-mail: " + EMAIL + "\n\n"
             + "Nota fiscal da " + getNomeProduto() + "!\n\n"
             + LINHA;
    }
}

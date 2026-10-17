package observer;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements Observer {

    private final String nome;
    private final List<String> notificacoes = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String mensagem) {
        notificacoes.add(mensagem);
        System.out.println(nome + " foi notificado: " + mensagem);
    }

    public void imprimirNotificacoes() {
        System.out.println("Notificações de " + nome + ":");
        for (String n : notificacoes) {
            System.out.println("- " + n);
        }
    }
}

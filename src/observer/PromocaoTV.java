package observer;

import java.util.ArrayList;
import java.util.List;

public class PromocaoTV implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    private String produtoEmPromocao;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update("Produto em promoção: " + produtoEmPromocao);
        }
    }

    public void colocarEmPromocao(String produto) {
        this.produtoEmPromocao = produto;
        System.out.println("Produto entrou em promoção: " + produto);
        notifyObservers();
    }
}

package Vuelos.presentation;

import Vuelos.logic.Ciudad;
import Vuelos.logic.Vuelo;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class VuelosModel extends Observable {
    List<Vuelo> list;
    Vuelo current;

    int changedProps = NONE;

    @Override
    public void addObserver(Observer o) {
        super.addObserver(o);
        commit();
    }

    @Override
    public synchronized void setChanged() {
        super.setChanged();
    }

    public void commit() {
        setChanged();
        notifyObservers(changedProps);
        notifyObservers(LIST);
        changedProps = NONE;
    }

    public VuelosModel() {
    }

    public void init(List<Vuelo> list) {
        setList(list);
        setCurrent(new Vuelo()); // Crea una instancia de Instrumento en lugar de TipoInstrumento
    }

    public List<Vuelo> getList() {
        return list;
    }

    public void setList(List<Vuelo> list) {
        this.list = list;
        changedProps += LIST;
    }

    public Vuelo getCurrent() {
        return current;
    }

    public void setCurrent(Vuelo current) {
        changedProps += CURRENT;
        this.current = current;
    }

    public void delete(Vuelo instrumento) {
        list.remove(instrumento);
        setCurrent(new Vuelo()); // Crea una instancia de Instrumento en lugar de TipoInstrumento
        changedProps |= LIST;
        commit();
    }

    public void enableEditing() {
        setChanged();
        notifyObservers(CURRENT);
    }

    public void update(Vuelo vuelo) {
        list.replaceAll(i -> i.getNumero().equals(vuelo.getNumero()) ? vuelo : i);
        setChanged();
        notifyObservers(LIST);
    }

    public static int NONE = 0;
    public static int LIST = 1;
    public static int CURRENT = 2;

}

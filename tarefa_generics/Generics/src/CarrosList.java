import genericos.Carro;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CarrosList <T extends Carro>{

    private List<T> listCarro;

    public CarrosList(List<T> listCarro) {
        this.listCarro = listCarro;
    }

    public List addCarro(T carro){
        this.listCarro.add(carro);
        return this.listCarro;
    }

    public List<T> getListCarro() {
        return listCarro;
    }
}

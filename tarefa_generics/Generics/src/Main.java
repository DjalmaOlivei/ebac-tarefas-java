import genericos.*;

import java.awt.*;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    CarrosList<Carro> listaDeCarros = new CarrosList<Carro>(new ArrayList<>());
    listaDeCarros.addCarro(new gol(2002, Color.BLACK, 4));
    listaDeCarros.addCarro(new hb20(2012, Color.pink, 4));
    listaDeCarros.addCarro(new estrada(2017, Color.BLUE, 2,100));
    listaDeCarros.addCarro(new civic(2020, Color.white, 4));
    listaDeCarros.addCarro(new estrada(2015, Color.ORANGE, 2));

        for (Carro carro: listaDeCarros.getListCarro()) {
            carro.descreve();
        }


    }

}
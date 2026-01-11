package genericos;

import java.awt.*;

public class estrada extends Carro implements picape {

    public estrada(int anoFabricacao, Color cor, int passageiros) {
        super(anoFabricacao, cor, passageiros);
    }

    public estrada(int anoFabricacao, Color cor, int passageiros, int carga) {
        super(anoFabricacao, cor, passageiros);
        this.carregar(carga);
    }

    @Override
    public void descreve() {
        System.out.println("Modelo :estrada | "+"Ano de fabricação :"+ this.getAnoFabricacao()+" | \n"+"cor :"+ this.getCor().toString()+"\n" );
    }

    @Override
    public void carregar(double carga) {
    System.out.println("carregado \n");
    descreve();
    }
}

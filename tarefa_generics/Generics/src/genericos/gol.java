package genericos;

import java.awt.*;

public class gol extends Carro{

    public gol(int anoFabricacao, Color cor, int passageiros) {
        super(anoFabricacao, cor, passageiros);
    }

    @Override
    public void descreve() {
        System.out.println("Modelo :gol | "+"Ano de fabricação :"+ this.getAnoFabricacao()+" | \n"+"cor :"+ this.getCor().toString()+"\n" );
    }
}

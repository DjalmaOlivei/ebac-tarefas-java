package genericos;

import java.awt.*;

public class civic extends Carro{

    public civic(int anoFabricacao, Color cor, int passageiros) {
        super(anoFabricacao, cor, passageiros);
    }

    @Override
    public void descreve() {
        System.out.println("Modelo :civic | "+"Ano de fabricação :"+ this.getAnoFabricacao()+" | \n"+"cor :"+ this.getCor().toString()+"\n" );
    }
}

package genericos;

import java.awt.*;

public class hb20 extends Carro{

    public hb20(int anoFabricacao, Color cor, int passageiros) {
        super(anoFabricacao, cor, passageiros);
    }

    @Override
    public void descreve() {
        System.out.println("Modelo :HB20 | "+"Ano de fabricação :"+ this.getAnoFabricacao()+" | \n"+"cor :"+ this.getCor().toString()+"\n" );
    }
}

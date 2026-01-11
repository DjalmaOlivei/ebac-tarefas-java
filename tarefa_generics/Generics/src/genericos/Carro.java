package genericos;

import java.awt.*;

public abstract class Carro {

    private int anoFabricacao;
    private Color cor;
    private int passageiros;



    public Carro(int anoFabricacao, Color cor, int passageiros) {
        this.anoFabricacao = anoFabricacao;
        this.passageiros = passageiros;
        this.cor = cor;
    }

    public abstract void descreve();

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}

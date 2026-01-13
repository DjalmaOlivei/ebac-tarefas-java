package domain;

public class Pessoa {

    String nome;
    char sexo;


    public Pessoa(String nome, char sexo ) {
        this.nome = nome;
        this.sexo = sexo;

    }

    public char getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo=" + sexo +
                '}';
    }
}

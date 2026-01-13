package domain;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    String nome;
    char sexo;
    int idade;

    public Pessoa(String nome, char sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public Pessoa(String nome, char sexo) {
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
                ", idade=" + idade +
                '}';
    }
}


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import anotacoes.Tabela;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {

    Annotation[] anots = UsandoTabela.class.getAnnotations();

    for (Annotation ant : anots) System.out.println(ant.toString());

    }
}


import domain.Pessoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Pessoa> Lpessoas = getInput() ;

        Lpessoas.forEach(System.out::println);
        System.out.println("\n \n");
        Lpessoas.stream().filter(n -> n.getSexo() == 'F').forEach(n ->System.out.println(n));

    }

    public static List<Pessoa> getInput(){

        List<Pessoa> LP = new ArrayList<>();

        System.out.println("Insira os dados nome e sexo separados por virgula entre valores," +
                "\n ' ' entre pessoas e seguidos conforme ex : João,M Maria,F");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();

        LP = Arrays.stream(in.split(" "))
                .map(n -> {
                    String[] p = n.split(",");
                    return new Pessoa(p[0],p[1].charAt(0));
                })
                .toList();
        sc.close();
        return LP;
    }

    public static List<Pessoa> populate(){

        List<Pessoa> LP = new ArrayList<>();

        LP.add(new Pessoa("João",'M',21));
        LP.add(new Pessoa("Maria",'F',16));
        LP.add(new Pessoa("Jose",'M',18));
        LP.add(new Pessoa("Mendonça",'M',25));
        LP.add(new Pessoa("Flaviana",'F',27));
        LP.add(new Pessoa("Joseilda",'F',22));
        LP.add(new Pessoa("Florentina",'F',21));
        LP.add(new Pessoa("Marco",'M',29));
        LP.add(new Pessoa("Gael",'M',35));

        return LP;

    }

}
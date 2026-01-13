import domain.Pessoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        List<Pessoa> Lpessoas = populate() ;

        Lpessoas.forEach(System.out::println);
        System.out.println("\n Só Feminino");
        separaFemenino(Lpessoas).forEach(System.out::println);
        //Lpessoas.stream().filter(n -> n.getSexo() == 'F').forEach(n ->System.out.println(n));

    }

    public static List<Pessoa> separaFemenino(List<Pessoa> Lpessoas){
        return Lpessoas.stream().filter(n -> n.getSexo() == 'F').toList();
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

        LP.add(new Pessoa("João",'M'));
        LP.add(new Pessoa("Maria",'F'));
        LP.add(new Pessoa("Jose",'M'));
        LP.add(new Pessoa("Mendonça",'M'));
        LP.add(new Pessoa("Flaviana",'F'));
        LP.add(new Pessoa("Joseilda",'F'));
        LP.add(new Pessoa("Florentina",'F'));
        LP.add(new Pessoa("Marco",'M'));
        LP.add(new Pessoa("Gael",'M'));

        return LP;

    }

}

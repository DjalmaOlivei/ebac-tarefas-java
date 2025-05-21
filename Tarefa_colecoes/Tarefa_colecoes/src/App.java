import java.util.*;
import java.util.stream.Collectors;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {

    List<Pessoa> pessoas = getInput();

    System.out.println("Ordem inserida!! :\n"+pessoas+"]\n");

    pessoas.sort(Pessoa::compareTo);

    System.out.print("Ordem alfabética!! :\n"+pessoas+"]\n");

    System.out.println("Separado por Genero!! :");

    for(Queue grupo:Pessoa.SepararGenero(pessoas))System.out.println(grupo);

    System.out.println("***********************");

    }

    public static List<Pessoa> getInput(){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(",");
        List<Pessoa> pessoas = new LinkedList<>();

        for( String pessoa : input){
            String[] p = pessoa.split(" ");
            pessoas.add(new Pessoa(p[0],p[1]));
        }
        return pessoas;
    }

}
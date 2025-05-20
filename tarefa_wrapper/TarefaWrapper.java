import java.util.Scanner;

public class TarefaWrapper {

    public static void main(String args[]){

        System.out.println("Insert your number to be wrapped an casted!");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Integer A = a;
        Float b = (float)a;
        System.out.println(b +" / "+ A + " / " +a);

    }

}

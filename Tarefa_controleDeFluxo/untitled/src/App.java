import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Double med= null;
        // calculate the avarage
        try {
            if(args[0] == null) throw new Exception();
            // try reading args
            System.out.println("avarage : "+ avarage(catstStringToIntArray(args))) ;
        } catch (Exception e) {
            // try getting user inputs
            med = avarage(getInput());
            System.out.println("avarage : "+ med);
        }
        App.avaliaNota(med);
        System.out.println( "\n      \\    /\\ \r\n" +
                               "       )  ( ')\r\n" + 
                               "      (  /  )\r\n" + 
                               "       \\(__)|");
        
    }

    /**
     * Test Aproval avarage grade 
     * @param nota
     */
    public static void avaliaNota(double nota){

        switch ((int)nota) {
            case 1,2,3,4:
                System.out.println("Reprovado!!");
                break;
            case 5,6:
                System.out.println("Recuperação!!");
                break;
            default:
                System.out.println("Aprovado!!");
                break;
        }

        if(nota >= 7) ;
        else if(nota >=5 && nota < 7) System.out.println("Recuperação!!");
        else System.out.println("Reprovado!!!");
    }


    /**
     * Calculates avarage
     * @param nums
     * @return avarage 
     */
    public static double avarage(int[] nums){
        return ((double) Arrays.stream(nums).sum()) / nums.length;
    }
    /**
     * Cast String[] into int[]
     * @param str
     * @return Array copy in int[]
     */
    public static int[] catstStringToIntArray(String[] str){
        return Arrays.stream(str).mapToInt(
            s -> 
            {
                return Integer.parseInt(s);
            }).toArray();
    }
    /**
     * get user Inputs
     * @return user input
     */
    public static int[] getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your numbers splited by ',' without blank spaces! \n EX. 8,5,4,7");
        try {
            String [] str = sc.nextLine().split(",");
            return catstStringToIntArray(str);
        } catch (Exception e) {
            System.out.println("Try again!");
            int [] i = getInput();
            return i; 
        }
        
        
    }
}

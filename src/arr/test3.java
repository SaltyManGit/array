package arr;

/**
 * Created by student on 11/15/2017.
 */
public class test3 {
    public static void main(String[] args) {

        int[] mass3 = {4, 5, 2, 7, 11};
        double sum = 0;

        for (int i = 0; i < (mass3.length); i++) {
            System.out.print(mass3[i] + " ");
            sum = sum + mass3[i];

        }
        System.out.println("");
        double sr = sum / mass3.length;
        System.out.print(sr);
    }
}

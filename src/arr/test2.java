package arr;

/**
 * Created by student on 11/15/2017.
 */
public class test2 {
    public static void main(String[] args) {

        double[] mass2 = {4.2, 5.4, 2.6, 7.213, 11.54};
        double max = mass2[0];

        for (int i = 0; i < (mass2.length); i++) {
            System.out.print(mass2[i] + " ");

            if (max < mass2[i]){
                max = mass2[i];
            }
        }
        System.out.println("");
        System.out.print(max);
    }
}


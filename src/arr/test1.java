package arr;

public class test1 {
    public static void main(String[] args) {

        int[] mass1 = {4,5,2,7,11};
        int min = mass1[0];

        for (int i = 0; i < (mass1.length); i++) {
            System.out.print(mass1[i] + " ");
            if (min > mass1[i]){
                min = mass1[i];
            }
        }
        System.out.println("");
        System.out.print(min);


    }
}

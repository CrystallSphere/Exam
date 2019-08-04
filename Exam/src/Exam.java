import java.util.Random;


public class Exam {
    public static void main(String [] args) {
        int [] a = {-1, -2,-3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19, -20, -21, -22,
                -23, -24, -25, -26, -27, -28, -29, -30, -31, -32, -33, -34, -35, -36, -37, -38, -39, -40, -41, -42, -43,
                -44, -45, -46, -47, -48, -49, -50};
        int[] mas = new int[100];
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++)
            mas[i] = rand.nextInt(100) -50;
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i] + " ");
        for (int value : a) {
            if (value < 0) {
                System.out.println(value);
            }



        }
    }

}

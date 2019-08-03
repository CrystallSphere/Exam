import java.util.Random;


public class Exam {
    public static void main(String [] args) {
        int start = -50;
        int end = 50;
        int[] mas = new int[100];
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++)
            mas[i] = rand.nextInt(100);
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i] + " ");
    }

}

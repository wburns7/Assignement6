import java.util.Random;

public class Assignement6A {
    public static void main(String[] args){
        Random rand = new Random();


        final int size = 1000000;
        int[] arr = new int[size];

        for (int i=0;i<size;i++)
            arr[i] = i;

        System.out.println("Comparing Linear Search and Binary Search:");
        int target = arr[rand.nextInt(1000001)];
        System.out.println("Our target is "+target);
        

    }
}

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

        int lLoops =0;
        for (int i =0;i<size;i++){
            lLoops++;
            if (arr[i] == target)
                break;
        }

        System.out.println("Linear Search: "+lLoops+" loop(s)");

        int bLoops =0;

        int low=0,mid =0;
        int high = size;
        while (high>low){
            bLoops++;

            mid = (low+high)/2;
            if (target < arr[mid])
                high = mid-1;
            else if (target == arr[mid])
                break;
            else
                low = mid+1;
        }

        System.out.println("Binary Search: "+bLoops+" guess(es)");

        if (lLoops>bLoops)
            System.out.println("Binary Search is faster this time!");
        else if (bLoops>lLoops)
            System.out.println("Linear Search is faster this time");
        else
            System.out.println("Binary and Linear Search are equally fast");

    }
}

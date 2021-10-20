import java.util.Random;
import java.util.Scanner;

public class Assignement6B {

    public static int[] argen (int s, int m){
        Random rand = new Random();

        int[] ar = new int[s];

        for (int i=0;i<s;i++){
            ar[i] = rand.nextInt(m+1);
            System.out.print(ar[i]+", ");
        }

        return ar;

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        System.out.print("How large should the array be? ");
        int size = scan.nextInt();
        System.out.print("What should be the highest number in the sequence? ");
        int max = scan.nextInt();

        int[] arr = argen(size,max);

        System.out.println();

        int menu = 0;

        while (menu != 4){
            System.out.println("[Options]");
            System.out.print("1) Reset the array\n" +
                    "2) Sort (Smallest to Largest)\n" +
                    "3) Sort (Largest to Smallest)\n" +
                    "4) Quit\n" +
                    "Choice? ");
            menu = scan.nextInt();

            System.out.println();

            switch (menu){

                case 1:
                    arr = argen(size,max);
                    break;
                case 2:
                    System.out.println("Using Insertion Sort:");
                    for (int i=1;i<size;i++){
                        int key = arr[i];
                        int position = i;
                        while (position>0 && key < arr[position-1]){
                            arr[position] = arr[position-1];
                            position--;
                        }
                        arr[position] = key;
                    }
                    for (int i:arr)
                        System.out.print(i+", ");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Using Selection Sort:");
                    for (int i=0;i<size;i++){
                        int min = i;
                        for (int j = i+1;j<size;j++){
                            if (arr[j]>arr[min])
                                min =j;
                        }
                        if (i != min && min <size){
                            int temp = arr[min];
                            arr[min] = arr[i];
                            arr[i] = temp;
                        }
                    }
                    for (int i:arr)
                        System.out.print(i+", ");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Closing out...");
                    break;
                default:
                    System.out.println("That is not a valid option, Try again!");
                    break;

            }
            System.out.println();
        }


    }
}

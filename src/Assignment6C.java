import java.util.Random;
import java.util.Scanner;

public class Assignment6C {

    public static void mapPrint(char[][] arr,int size){

        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("[Minesweeper - DOS Edition}");
        System.out.print("What is the grid size? ");
        int grid = scan.nextInt();

        char[][] map = new char[grid][grid];
        int[] bomb = new int[grid];

        for (int i=0;i<grid;i++)
            for (int j=0;j<grid;j++)
                map[i][j] = '?';

            mapPrint(map,grid);

        for (int i=0;i<grid;i++)
            bomb[i] = rand.nextInt(grid);

        boolean game = true;

        int count =0;

        while (game && count<grid){


            System.out.print("Enter your X coordinate: ");
            int x = scan.nextInt();
            System.out.print("Enter your Y coordinate: ");
            int y = scan.nextInt();
            System.out.println();
            while (x>=grid||y>=grid){
                System.out.println("That is not a valid coordinate. Try again!");
                System.out.print("Enter your X coordinate: ");
                x = scan.nextInt();
                System.out.print("Enter your Y coordinate: ");
                y = scan.nextInt();
                System.out.println();
            }

            if (bomb[x] == y){
                System.out.println("Sorry, you hit a mine!");
                map[x][y] = 'X';
                game = false;
            }
            else{
                map[x][y] = '_';
            }

            mapPrint(map,grid);

            count =0;
            for (int i =0;i<grid;i++){
                for (int j =0;j<grid;j++){
                    if (map[i][j] == '_')
                        count++;
                }
            }

        }
        if (count == grid)
            System.out.println("You win!");



    }
}

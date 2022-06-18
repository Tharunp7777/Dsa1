package Dsa1;
import java.util.Scanner;

public class TwoDarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // for input from user

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }

        }

        // for Search in the matrix

        int x= sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                if(numbers[i][j] == x){
                    System.out.println("number found at loaction("+ i +","+j+")");
                }
            }

        //  for (int i = 0; i < rows; i++) {
                //for (int j = 0; j < cols; j++) {
                  //  System.out.println(numbers[i][j] + " ");
                //}
                //System.out.println();
            //}   

        
        }
    }
}

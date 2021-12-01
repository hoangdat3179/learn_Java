package vn.techmaster;

import java.util.Scanner;

public class Exercise_06 {
    public static int[][] createArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số dòng: ");
        int n = sc.nextInt();

        System.out.print("Nhập số cột: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.printf("Nhập phần tử thứ arr[%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }

    public static void printArray(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void findDiagonalLine(int[][] arr){
        System.out.print("Đường chéo chính: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i == j){
                    System.out.print(arr[i][j] + "\t");
                }
            }

        }
    }
}

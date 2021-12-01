package vn.techmaster;

import java.util.Scanner;

public class Exercise_01 {
    static Scanner sc = new Scanner(System.in);
    //Vẽ hình vuông
    public static void drawSquare(){
        System.out.print("Nhập cạnh của hình vuông: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    //Vẽ hình tam giác vuông
    public static void drawRightTriangle(){
        System.out.print("Nhập cạnh của tam giác: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++ ){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    //Vẽ tam giác đều
    public static void drawEquilateralTriangle(){
        System.out.print("Nhập cạnh của tam giác: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = i; j <= n; j++){
                System.out.print("  ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}
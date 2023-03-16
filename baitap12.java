package ad;

import java.util.Scanner;

public class baitap12 {

    public static void main(String[] args) {
        int arr[][], hang, cot, max = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so hang: ");
        hang = sc.nextInt();
        System.out.print("Nhap so cot: ");
        cot = sc.nextInt();
        
        arr = new int[hang][cot];
        
        System.out.print("Nhap phan tu cua ma tran: ");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Ma tran: ");
        for ( int i = 0; i < hang; i++) {
            for ( int j = 0; j < cot; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
        
        System.out.print("phan tu lon nhat cua mang la: ");
        for ( int i = 0; i < hang; i++) {
            for ( int j = 0; j < cot; j++) {
                if (max < arr[i][j]) 
                    max = arr[i][j];               
            }
        }
        System.out.println(max);
    }
    
}
package com.Bach;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j, n, count;
        int size;
        int arr[];

        do {
            System.out.println("Enter a size:");
            size = input.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter element: " + (i + 1) + " : ");
            arr[i] = input.nextInt();
            i++;
        }
        System.out.print("Property in list is: \n");
        for ( j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        System.out.println("\n Nhập phần tử cần xóa: \n");
        int k = input.nextInt();
        for(count = 0, j = 0; j < arr.length; j ++){
            if(arr[j] != k){
                arr[count] = arr[j];
                count++;
            }
        }
        j = count;
        System.out.println("The property value in the list is: " + count);
        for(j = 0; j < count; j ++){
            System.out.print(arr[j] + "\t");
        }
    }
}

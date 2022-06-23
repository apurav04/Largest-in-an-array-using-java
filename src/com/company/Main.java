package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[5];
        Scanner s= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int largest= arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}

package org.example;

import org.example.student.Teacher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers ");
        int [] a=new int[sc.nextInt()];
        System.out.println("Enter massiv");
        for (int i = 0; i < a.length; i++) {
            a[i]= sc.nextInt();
        }
        int katta=0;
        int[] b=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i]<a[j]){
                    katta=a[i];
                    a[i]=a[j];
                    a[j]=katta;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print("   "+a[i]);
        }

    }
}
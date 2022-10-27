/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.java_averagegradecalculator;
import java.util.Scanner;
/**
 *
 * @author Augustus
 */
public class Java_averagegradecalculator {

    public static void main(String[] args) {
    double[] arr = new double[8];
    Scanner scan = new Scanner(System.in);
    System.out.println("Print the Chemistry grade");
    arr[0] = scan.nextInt();
    System.out.println("Print the Math-functions grade");
    arr[1] = scan.nextInt();
    System.out.println("Print the Physics grade");
    arr[2] = scan.nextInt();
    System.out.println("Print the Com-tech grade");
    arr[3] = scan.nextInt();
    System.out.println("Print the Computer-science grade");
    arr[4] = scan.nextInt();
    System.out.println("Print the Accounting grade");
    arr[5] = scan.nextInt();
    System.out.println("Print the Tech-design grade");
    arr[6] = scan.nextInt();
    System.out.println("Print the Anthropology grade");
    arr[7] = scan.nextInt();
    
    double max = arr[0];   
    double avg=0;
    
    for (int i = 0;i < arr.length; i++)
    {
        avg+=arr[i];
        
        if (max < arr[i])
        {
            max = arr[i];    
        }
        
    }
    
    
    System.out.println("Your highest grade is"+max);
    System.out.println("Your total average grade is "+avg/arr.length);
    
    
    
    
    
    
    
    }
}

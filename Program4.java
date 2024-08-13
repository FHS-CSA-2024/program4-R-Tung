//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)

import java.util.Scanner;
public class Program4{
    public static void main(String[] args){
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        double num4 = 0;
      
        Scanner numScanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        num1 = numScanner.nextDouble();
        System.out.println("Enter a number: ");
        num2 = numScanner.nextDouble();
        System.out.println("Enter a number: ");
        num3 = numScanner.nextDouble();
        System.out.println("Enter a number: ");
        num4 = numScanner.nextDouble();
        
        int sum = (int)num1 + (int)num2 + (int)num3 + (int)num4;
        double average = sum / 4.0;
        
        
        
        System.out.println("The sum of the four numbers is " + sum);
        System.out.println();
        System.out.println("The average of the four numbers is " + average);
        
        
    }
}

//Paste console output below:
/*
Enter a number: 
475
Enter a number: 
821
Enter a number: 
369
Enter a number: 
562
The sum of the four numbers is 2227

The average of the four numbers is 556.75

*/

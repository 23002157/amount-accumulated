import java.util.Scanner;
        public class Quiz{
            public static void main(String[]args){
                
                Scanner tendi = new Scanner(System.in);
                System.out.println("enter the principal amount");
                double p = tendi.nextDouble();
                 
                System.out.println("enter the annual interest rate(decimal)");
                double i = tendi.nextDouble();
                
                System.out.println("enter how long the money is invested for(years)");
                double n = tendi.nextDouble();
                
                double a = p* Math.pow(1+i,n);
                
                System.out.println("the amount accumulated is");
            }
        }

package factorial;

import java.util.Scanner;


public class Factorial {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("enter a number: ");
        int number=scan.nextInt();
        int factorial=1;
        for (int i =number ; i >0; i--) {
            factorial*=i;
        }
        
        System.out.printf("%s! = %s ",number,factorial);
    }
    
}

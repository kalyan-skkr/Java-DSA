import java.util.Scanner;

public class euclid {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //input first number
        System.out.println("Enter number 1:");
        int num1 = in.nextInt();

        //input second number
        System.out.println("Enter Number 2:");
        int num2 = in.nextInt();

        //checking the order
        if(num2 > num1){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        helper helper = new helper();
        System.out.println("The GCD of the given numbers is: " + helper.findGCD(num1, num2));

    }
}

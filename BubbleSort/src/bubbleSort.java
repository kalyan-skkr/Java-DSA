import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the count of numbers: ");
        int count = in.nextInt();

        int[] arr = new int[count];

        System.out.println("Enter the numbers and press return/enter after each: ");
        for(int i = 0; i<count; i++){
            arr[i] = in.nextInt();
        }

        helper helper = new helper();

        System.out.println("Numbers before sorting: ");
        helper.printNumbers(arr);

        helper.sortAscending(arr);

        System.out.println("Numbers after sorting in Ascending: ");
        helper.printNumbers(arr);

        helper.sortDescending(arr);

        System.out.println("Numbers after sorting in Descending: ");
        helper.printNumbers(arr);

    }
}

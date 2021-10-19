public class helper {
    public int findGCD(int a, int b){
        //finding the remainder when a is divided by b
        int remainder = a % b;

        //if remainder is 0, then b is the GCD, else recursion takes place for b and remainder
        if(remainder == 0){
            return b;
        }
        else{
            return findGCD(b, remainder);
        }
    }
}

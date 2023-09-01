import java.util.Scanner;

public class NestedFizzBuzz {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        if (num%3==0) {
            if (num % 5 == 0)
                System.out.println("FizzBuzz");
            else {
                System.out.println("Fizz");
            }
        }
        else if(num%5 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(num);
        }
    }
}


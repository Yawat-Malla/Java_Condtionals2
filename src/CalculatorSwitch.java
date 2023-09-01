import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = obj.nextInt();
        int num2= obj.nextInt();
        System.out.println("Enter an operator: +,-,*,/");
//        Scanner obj1 = new Scanner(System.in);
        String opt= obj.next();
        switch(opt){
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid operator.");
                break;
        }
    }
}

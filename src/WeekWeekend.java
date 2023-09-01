import java.util.Scanner;

public class WeekWeekend {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int n_day = obj.nextInt();
        switch (n_day){
            case 1:
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");

        }
    }
}

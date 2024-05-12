import java.sql.SQLOutput;
import java.util.Scanner;

public class weekdays {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the week day: ");
        System.out.println("1-Monday");
        System.out.println("2-Tuesday");
        System.out.println("3-Wednesday");
        System.out.println("4-Thursday");
        System.out.println("5-Wednesday");
        System.out.println("6-Sunday");
        System.out.println("7-Saturday");

        int n = num.nextInt();
        switch (n){
            case 1:
                System.out.println("Monday " );
                break;

            case 2:
                System.out.println("Tuesday " );
                break;

            case 3:
                System.out.println("Wednesday " );
                break;

            case 4:
                System.out.println("Thursday " );
                break;

            case 5:
                System.out.println("Friday " );
                break;

            case 6:
                System.out.println("Sunday" );
                break;

            case 7:
                System.out.println("Saturday" );
                break;
        }

        if(n==6 || n==7){
            System.out.println("Rest Day Of The Week");
        }
        else System.out.println("Work Day Of The Week");
    }
}

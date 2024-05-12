import java.util.Scanner;

public class kabasayear {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a year: ");

        int a = num.nextInt();
        if (a%400==0 && a%4==0 || a%100!=0){
            System.out.println("It is kabisa Year");
        }
        else{
            System.out.println("It is not kabisa year");
        }
    }
}

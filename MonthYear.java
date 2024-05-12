import java.util.Scanner;

public class MonthYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Month");
        int n = scanner.nextInt();

        switch (n){
            case 1:
                System.out.println("1-Month January");
                break;
            case 2:
                System.out.println("2-Month February");
                break;
            case 3:
                System.out.println("3-Month March");
                break;
            case 4:
                System.out.println("4-Month April");
                break;
            case 5:
                System.out.println("5-Month May");
                break;
            case 6:
                System.out.println("6-Month June");
                break;
            case 7:
                System.out.println("7-Month July");
                break;
            case 8:
                System.out.println("8-Month August");
                break;
            case 9:
                System.out.println("9-Month September");
                break;
            case 10:
                System.out.println("10-Month October");
                break;
            case 11:
                System.out.println("11-Month November");
                break;
            case 12:
                System.out.println("12-Month December");
                break;
        }
        if (n==1 || n==2 || n==12){
            System.out.println("Winter Season");
        }
        else if(n==3 || n==4 || n==5){
            System.out.println("Springtime");
        }
        else if(n==6 || n==7 || n==8){
            System.out.println("Summer time");
        }
        else if(n==9 || n==10 || n==11){
            System.out.println("Autumn");
        }
    }
}

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = num.nextInt();
        System.out.print("Enter another number: ");
        int b = num.nextInt();
        if(a>b){
            System.out.println("a-b="+(a-b));
        }
        else{
            System.out.println("b-a="+(b-a));
        }
    }
}

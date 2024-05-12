import java.util.Scanner;

public class kupaytirishj {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.println("a: ");
        double l= num.nextInt();

        if(l%3==0 && l%5==0 || l<0){
            System.out.println("l ning kvadrati" +(l*l));
        }
        else System.out.println("l ning kubi" +(l*l*l));
    }
}

import java.util.Scanner;

public class Tezlik {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.println("enter the kilometre (in km)->");
        double s=key.nextInt();
        s=s*1000;  // convert to the metre
        System.out.println("enter the time in second>");
        double t=key.nextInt();
        t=t*60; // exchange to the second
        double v;
        v=(s/t);
        System.out.println("speed->"+v);
    }
}

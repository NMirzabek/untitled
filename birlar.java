import java.util.Scanner;

public class birlar {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("son ");
        int n=num.nextInt();
        int a,b,c;
        a=n*11;
        b=n*111;
        c=n*1111;
        System.out.println(n+a+b+c);
    }
}

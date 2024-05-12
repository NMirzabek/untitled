import java.util.Scanner;

public class increase {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("a ni kiriting ");
        long a=num.nextInt();
        long b=a,c=a,q;

        a=a*a;
        a=a*a;
        System.out.println("a sonining 4-darajasi->"+a);
        b=b*b;
        b=b*b*b;

        System.out.println("a sonining 6-darajasi->"+b);


        c=c*c*c;   long m=c;
        c=c*c;
        c=c*c;
        c=c*m;
        System.out.println("a sonining 15-darajasi->"+c);


    }
}

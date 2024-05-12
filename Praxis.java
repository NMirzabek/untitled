import java.util.Scanner;

public class Praxis {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("Enter the first number->");
        int n=num.nextInt();
        System.out.println("Enter the second number->");
        int m=num.nextInt();
        System.out.println("1)"+(n+m));
        System.out.println("2)"+(n-m));
        System.out.println("3)"+(n*m));
        System.out.println("4)"+(n/m));

        boolean a,b,result;
        if(n>m){
            a=true;
            b=false;
            System.out.println("Number 1 is big=> "+n);
        }else{
            a=false;
            b=true;
            System.out.println("Number 2 is big=> "+m);

        }
    }
}

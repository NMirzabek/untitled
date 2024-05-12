import java.util.Scanner;

public class TimeLine {
    public static void main(String[] args) {
        Scanner time=new Scanner(System.in);
        System.out.println("Enter the time (second)->");
        int t=time.nextInt();
        int a,b,c;
        a=(t/3600);
        b=(t-a*3600)/60;
        c=((t-a*3600-b*60));
        System.out.println(" "+a+" : "+b+" : "+c);
    }
}


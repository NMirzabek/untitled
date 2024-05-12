import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int max=0, min=0;

//        System.out.println("Enter numbers");
        System.out.print("First NUmber: ");
        int a1=num.nextInt();
        System.out.print("Second Number: ");
        int a2=num.nextInt();
        System.out.print("Third Number: ");
        int a3=num.nextInt();
        System.out.print("Fourth Number: ");
        int a4=num.nextInt();
        System.out.print("Fifth Number: ");
        int a5=num.nextInt();

        if(a1>a2 && a1>a3 && a1>a4 && a1>a5){
            max=a1;
        }
        else if(a2>a1 && a2>a3 && a2>a4 && a2>a5){
            max=a2;
        }
        else if(a3>a1 && a3>a2 && a3>a4 && a3>a5){
            max=a3;
        }
        else if(a4>a1 && a4>a2 && a4>a3 && a4>a5){
            max=a4;
        }
        else if(a5>a1 && a5>a2 && a5>a3 && a5>a4) {
            max = a5;
        }

        if(a1<a2 && a1<a3 && a1<a4 && a1<a5){
            min=a1;
        }
        else if(a2<a1 && a2<a3 && a2<a4 && a2<a5){
            min=a2;
        }
        else if(a3<a1 && a3<a2 && a3<a4 && a3<a5){
            min=a3;
        }
        else if(a4<a1 && a4<a2 && a4<a3 && a4<a5){
            min=a4;
        }
        else if(a5<a1 && a5<a2 && a5<a3 && a5<a4) {
            min=a5;
        }
        System.out.println("- Sonlarning eng kattasi." +max);
        System.out.println("- Sonlarning eng kichigi." +min);

    }
}

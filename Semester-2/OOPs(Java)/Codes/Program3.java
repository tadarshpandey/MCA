import java.util.Scanner;

public class Program3{
    public static void main(String[] args){
        int a, b, c, d, e, f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the six integer type values: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
        if(a>b && a>c && a>d && a>e && a>f)
            System.out.println("here the integer a:" + a + "is the largest among all");
        else if(b>a && b>c && b>d && b>e && b>f)
            System.out.println("here the integer b:" + b + "is the largest among all");
        else if(c>b && c>a && c>d && c>e && c>f)
            System.out.println("here the integer c:" + c + "is the largest among all");
        else if(d>b && d>c && d>a && d>e && d>f)
            System.out.println("here the integer d:" + d + "is the largest among all");
        else if(e>b && e>c && e>d && e>a && e>f)
            System.out.println("here the integer e:" + e + "is the largest among all");
        else
            System.out.println("here the integer f:" + f + "is the largest among all");
        sc.close();
    }
}

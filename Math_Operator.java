import java.util.Scanner;
public class Math_Operator {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        
        int a;
        int b;
        
        System.out.print("Input Value 1 = ");
        a = Scanner.nextInt();

        System.out.print("Input Value 21 = ");
        b = Scanner.nextInt();
        
        System.out.println("positive result = "+(a+b));
        System.out.println("negative result = "+(a-b));
        System.out.println("multiply result = "+(a*b));
        System.out.println("quotient result = "+(a/b));
        System.out.println("fraction result = "+(a%b));

        Scanner.close();
    }    
}

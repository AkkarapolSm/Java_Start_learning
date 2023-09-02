
import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.print("Input first : ");
        int start=Scanner.nextInt();
        System.out.print("Input final : ");
        int stop=Scanner.nextInt();
        
        System.out.print("................... ");
        for(int m=start;m<=stop;m++){
            System.out.println(m);
            for(int x=1;x<=12;x++){
                System.out.println(m+"x"+x+" = "+(m*x));

            }
        }
        Scanner.close();
    }
}

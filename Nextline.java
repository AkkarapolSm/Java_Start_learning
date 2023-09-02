
import java.util.Scanner;
public class Nextline {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.print("in put number : ");
        String text =keyboard.nextLine();
        System.out.println("Number is : "+text);

        keyboard.close();
    }
}


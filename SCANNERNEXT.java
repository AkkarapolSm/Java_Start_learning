import java.util.Scanner;
public class SCANNERNEXT {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        String name;
        int age;
        float shoeSize;

        System.out.print("Please enter you name : ");
        name = Scanner.nextLine();

        System.out.print("Please enter you age : ");
        age = Scanner.nextInt();

        System.out.print("Please enter you shoe size : ");
        shoeSize = Scanner.nextFloat();

        System.out.println("You name is : "+name);
        System.out.println("You age is : "+age);
        System.out.println("You shoesize is : "+shoeSize);

        Scanner.close();
        
        
    }
    
}

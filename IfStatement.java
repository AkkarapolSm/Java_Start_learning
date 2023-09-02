import java.util.Scanner;
public class IfStatement {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        
        System.out.print("Input your age : ");
        int age=Scanner.nextInt();

        if(age>=15){
            System.out.println("Mr./Miss");
            
        }else{
            System.out.println("Boy/Girl");

        }
        System.out.println("END......");

        Scanner.close();
    }
}

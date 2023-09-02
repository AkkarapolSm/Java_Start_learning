import java.util.Scanner;
public class Modloop {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        while(true){
            System.out.print("Input number : ");
            int number=Scanner.nextInt();
            if(number<0)break;
            
            if(number%2 ==0){
                System.out.println("even number : ");
            }else{
                System.out.println("odd number : ");
            Scanner.close();
            }
        }
    }
}
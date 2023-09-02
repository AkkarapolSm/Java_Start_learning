import java.util.Scanner;
public class Whileloop {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        
        int count =1;
        while(true){
            System.out.println("round = "+count+" Hello world");
            count++;
            if(count>100){
                break;
            }
        }
        Scanner.close();
    }
}

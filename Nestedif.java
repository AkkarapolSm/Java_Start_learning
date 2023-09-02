import java.util.Scanner;
public class Nestedif {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        int age;

        System.out.print("input your age : ");
        age=Scanner.nextInt();

        if(age<=15){
            if(age==15){
                System.out.println("M.3");
            }
            else if(age==14){
                System.out.println("M.2");
            }
            else if(age==13){
                System.out.println("M.1");
            }else{
                System.out.println("elementary school");

            }
        }else{
            System.out.println("higt school");

        }
        Scanner.close();
    }
}  

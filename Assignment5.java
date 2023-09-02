import java.util.Scanner;
public class Assignment5 {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        
        int money;
        System.out.print("enter amount = ");
        money=Scanner.nextInt();
        System.out.println("amount = "+money);
        
        if(money>=1000){
            System.out.println("1000 bath= "+(money/1000)+" copy");
            money%=1000;
            System.out.println("fraction "+money);
        }if(money>=500){
            System.out.println("500 bath= "+(money/500)+" copy");
            money%=500;
            System.out.println("fraction "+money);
        }if(money>=100){
            System.out.println("100 bath= "+(money/100)+" copy");
            money%=100;
            System.out.println("fraction "+money);
        }if(money>=50){
            System.out.println("50 bath= "+(money/50)+" copy");
            money%=50;
            System.out.println("fraction "+money);
        }if(money>=20){
            System.out.println("20 bath= "+(money/20)+" copy");
            money%=20;
            System.out.println("fraction "+money);
        }if(money>=10){
            System.out.println("10 bath= "+(money/10)+" coin");
            money%=10;
            System.out.println("fraction "+money);
        }if(money>=5){
            System.out.println("5 bath= "+(money/10)+" coin");
            money%=5;
            System.out.println("fraction "+money);
        }if(money>=5){
            System.out.println("5 bath= "+(money/10)+" coin");
            money%=5;
            System.out.println("fraction "+money);
        }if(money>=2){
            System.out.println("2 bath= "+(money/2)+" coin");
            money%=2;
            System.out.println("fraction "+money);
        }if(money>=1){
            System.out.println("1 bath= "+(money/1)+" coin");
            money%=1;
            System.out.println("fraction "+money);
        }
        Scanner.close();
    }
}

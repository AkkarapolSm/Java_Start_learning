import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        int number;
        System.out.print("Input your number = ");
        number=Scanner.nextInt();
        
        /*
        % number % 2 ลงตัว => คู่
        % number % 2 ไม่ลงตัว => คี่ 
        */
        String result="";

        /*
        if(number%2 == 0){
            result=number+ "even number";
        }else{
            result=number+ "old number";
           
        }
        */
        
        //ternary operator
        //ตัวแปร  = (เงื่อนไข) ? คำสั่งเมื่อเงื่อไขเป็นจริง : คำสั่งเมื่อเงื่อไขเป็นเท็จ;
        result = (number%2 == 0) ? number+ " = even number" : number+ " = old number";
        System.out.print(result);

        Scanner.close();    
    }
}

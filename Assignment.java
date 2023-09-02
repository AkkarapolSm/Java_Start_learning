import java.util.Scanner;
public class Assignment {
    //เขียนโปรแกรมเปรียบเทียบตัวเลข
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Input your number1 : ");
        number1=Scanner.nextInt();
        System.out.print("Input your number2 : ");
        number2=Scanner.nextInt();

        if(number1>number2){
            System.out.println(number1+" more than "+number2);
        }else if(number1<number2){
            System.out.println(number1+" less "+number2);
        }else{
            System.out.println(number1+" equal to "+number2);
        }
        Scanner.close();   

    }
}

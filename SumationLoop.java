import java.util.Scanner;
public class SumationLoop {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        int number,sum=0,count=0;
        while(true){
            System.out.print("Input your number : ");
            number=Scanner.nextInt();
            if(number<0)break;
            count++;
            sum+=number;
        }
        System.out.println("Sum =  "+sum);
        System.out.println("Average =  "+(sum/count));
        Scanner.close();
    }
}

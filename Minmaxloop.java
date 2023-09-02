import java.util.Scanner;
public class Minmaxloop {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        int number,maxNumber=0,minNumber=Integer.MAX_VALUE;
        while(true){
            System.out.print("Input number : ");
            number=Scanner.nextInt();
            if(number<0)break;
            if(number>maxNumber){
                maxNumber=number;
            }
            if(number<minNumber)
            minNumber=number;
        }
        System.out.println("Maximum value = "+maxNumber);
        System.out.println("Minimum value = "+minNumber);
        Scanner.close();
    }
}

import java.util.Scanner;
public class Assignment8 {
    //  ํC=( ํF -32)*5/9
    //  ํF=( ํC * 9/5)+32
    public static void main(String[] args) {

        

        Scanner Scanner=new Scanner(System.in);
        System.out.print("Input fahren = ");
        float Fahren=Scanner.nextFloat();
        float Cel = (Fahren-32)*5/9;
        System.out.println(Fahren+"fahren\t"+ Cel + "Celsius");
        
        Scanner.close();
    }
}

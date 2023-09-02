import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        
        int number;
        
        System.out.print("Input Christian era ");
        number=Scanner.nextInt();
        
        //ประมวณผล
        // 2565-543 => ค.ศ.
        // ค.ศ. + 543 => พ.ศ.
        
        int result = number+543;
        System.out.print("Buddhist era = "+result);

        Scanner.close();
    }
}

// รับค่าข้อมูล
// นำข้อมูลแบบไหน ?
// ช้อความทำอะไร
// ข้อความแบบตัวเลข คำนวณได้  | คำนวณไม่ได้



 
import java.util.Scanner;
public class InputTutorial {
    public static void main(String[] arge) {
        
        // ประกาศใช้งาน Class | new
        Scanner sc=new Scanner(System.in);
        System.out.print("input your name : ");
        String name=sc.nextLine(); // รับค่า String จากแปเนพิมพ์ => name
        
        System.out.print("year is : ");
        int year=sc.nextInt(); // รับค่า Integer จากแป้นพิมพ์ => year
        
        int age=2022 - year; // คำนวณอายุ
        
    System.out.println("your name is : "+name);
    System.out.println("year is : "+year);
    System.out.println("age now : "+age);
    
    sc.close();
    
    
    
    
    }

}


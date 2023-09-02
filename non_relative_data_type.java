public class non_relative_data_type {
    public static void main(String[] args) {
    /*
    string คือ ชนิดข้อมูลที่เก็บชุดข้อมูล
    symbol = ""

    char เก็บตัวอักษร
    symbol = ''
    */
    
    String a="100", b="200";
    System.out.println(b);
    
    // string => Double 
    double c=Double.parseDouble(a); 
     c=c+50;
     System.out.println(c);

    //Integer => String
    int num1=200;
    String age = String.valueOf(num1);
    System.out.println(age);

    }
}
 
public class Logic {
    public static void main(String[] arge) {
        // AND && = และ
        // OR  || = หรือ
        // NOT !  = ไม่ (ตรงกันข้าม)

        int a=10,b=20;
        System.out.println((a==b) && (a<b));
        System.out.println((a==b) || (a<b));
        System.out.println(!(a==b));
        System.out.println(!(a<b));
       
    }
}

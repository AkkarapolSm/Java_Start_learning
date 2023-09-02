public class Compound {
    public static void main(String[] args) {
        int x = 10, y = 5;

        System.out.println("Before "+x);
        x+=y;
        System.out.println("After "+x);
        x-=y;
        System.out.println("After "+x);
        x*=y;
        System.out.println("After "+x);
        x/=y;
        System.out.println("After "+x);
    }
}

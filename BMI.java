import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner BMI=new Scanner(System.in);

        double weight;
        double height;

        System.out.print("Input your Weight(kg) = ");
        weight = BMI.nextDouble();
        System.out.print("Int put your Height(cm) = ");
        height = BMI.nextDouble();

        height/=100;
        double bmi=(weight/(height*height));
        
        System.out.println("height = "+height);
        System.out.println("Weight = "+weight);
        System.out.println("BMI = "+bmi);
        
        BMI.close();
    }

}

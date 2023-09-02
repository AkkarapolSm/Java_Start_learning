import java.util.Scanner;
public class Assignment4BMI {
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
        
        System.out.println("Weight = "+weight);
        System.out.println("height = "+height);
        System.out.println("BMI = "+bmi);
        String predict="";
        
        if(bmi<18){
            predict="underrated";
        }else if(bmi>=18.5 && bmi <=22.9){
            predict="slim";
        }else if(bmi>=23.0 && bmi<=24.9){
            predict="Obesity";
        }else if(bmi>=25.0 && bmi<=29.9){
            predict="dangerous obesity";
        }else{
            predict="unknown value";

        }
        System.out.println("your criteria = "+predict);
        
        BMI.close();
    }

}

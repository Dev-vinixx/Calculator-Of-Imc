import java.util.Scanner;

public class CalculatorImc {
    public static void main(String[] args) {
        //Get weight and height of user.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in kg: ");
        double weight = input.nextDouble();

        System.out.println("Enter your height in meters:");
        double height = input.nextDouble();

        //Calculate IMC
        double imc = calculateImc(weight, height);

        System.out.println("Your imc is: " + imc);
        interpretIMC(imc);

        input.close();
    }
    //Method for calculate imc
    private static double calculateImc(double weight,double height) {
        return weight / (height * height);
    }
    //Method for interpret of result imc
    private static void interpretIMC(double imc) {
        System.out.println("Your condition is");
        if (imc < 18.5) {
            System.out.println("Underweight");
        } else if (imc < 25) {
            System.out.println("Normal weight");
        } else if ( imc < 30) {
            System.out.println("About Weight");
        } else {
            System.out.println("obese");
        }
    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
double weight,height;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your height(meter):");
        height=scan.nextDouble();
        System.out.print("Enter your weight :");
        weight=scan.nextDouble();

        double index =weight/(height*height);
        System.out.println("Your body mass index:"+ index);



    }
}
package controlstatements;
import java.util.Scanner;
public class demo_switchcase {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please Enter vowels");
        String vowels=scan.next();
        switch (vowels)
        {
            case "a":
                System.out.println("A is vowles");
                break;
                case "E":
                System.out.println("E is vowels");
                break;
                case  "I":
                System.out.println("I is Vowels");
                break;
                case "O":
                System.out.println("O is vowels");
                break;
                case "U":
                System.out.println("U is vowels");
                break;

            default:
                System.out.println("Not a vowels");
        }
    }
}


package userinput;

import java.util.Scanner;

public class UserScanner {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        //System.out.println("Enter the Number 1");
//        int value1=scan.nextInt();
//        System.out.println("enter the Number 2");
//        int value2=scan.nextInt();
//        int output=value1+value2;
//        System.out.println("Output IS:"+output);
//        String place;
//        int age,pincode;
//        System.out.println("Tell us fav place ");
//        String favplace=scan.next();
//        System.out.println("Fav Place:"+favplace);
//        age=scan.nextInt();
//        System.out.println("Age is:"+age);
//        pincode=scan.nextInt();
//        System.out.println("Pincode :"+pincode);
//        Scanner scan= new Scanner(System.in);
        System.out.println("what is your name");
        String name=scan.next();
        System.out.println("Name is"+name);
        System.out.println("first letter");
        char initial=scan.next().charAt(3);
        System.out.println("my initial\t"+initial);


    }
}

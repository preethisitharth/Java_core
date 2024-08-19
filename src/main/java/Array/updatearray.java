package Array;
import java.util.Scanner;
import java.util.Arrays;
public class updatearray {
    public static void main(String []agrs){
        String Details[]={"Preethi","sivasankar","priya","deepika","janani"};
        Details[4]="gowthami";
        System.out.println(Arrays.toString(Details));
        updatearray up=new updatearray();
        System.out.println("Before Update data:"+Arrays.toString(Details));
        Scanner scan=new Scanner(System.in);
        System.out.println("which index position:"+(Details.length-1));
        int index=scan.nextInt();
        System.out.println("you are selected position"+index+"position vaues"+Details[index]);
        System.out.println("please enter new name;");
        String name=scan.next();
        Details[index]=name;
        System.out.println("after update value is:"+ Arrays.toString(Details));
    }

}

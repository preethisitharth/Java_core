package methods;
import java.util.Scanner;
public class demo_typemethods {
    //with return type and without arguments
    public void woargs()
    {
        int ofc_count=55;
        int toppercount=15;
        System.out.println("OFFICE COUNT "+ofc_count+""+"TOPPER COUNT"+toppercount);

    }
    //wo returntype wo args
    public  String setname()
    {
        String name ="Annamalai";
        return  name;
    }
    //with return type and with agruments
    public void Passingmethod(float salary,long phnno)
    {
        double age=salary;
        System.out.println("My salary is"+salary);
        System.out.println("Age"+age);
        System.out.println("PHN NO:"+phnno);


    }



    public static void main(String[] args) {
        demo_typemethods dt=new demo_typemethods();
        dt.woargs();
        String getname=dt.setname();
        System.out.println("Getting name :"+getname);
        Scanner ss= new Scanner(System.in);
        System.out.println("Enter contact number");
        Long mblno=ss.nextLong();
        dt.Passingmethod(4.5f,mblno);

    }
}

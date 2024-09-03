package oops_inheritance;

class Management {
    public void manage()
    {
        System.out.println("Nothing more than happiness");

    }

}
class Hod extends Management{
    public void Details()
    {
        System.out.println("CSE department HOD:siva");
        System.out.println("EEE department HOd : Preethi");
    }
}
class advisor extends Hod{
    public void A_details()
    {
        System.out.println("Cse advisor:janani");
        System.out.println("eee advisor : ramya");
    }
}
public class multilevel{
    public static void main(String[]agrs){
        advisor ai=new advisor();
        ai.manage();
        ai.Details();
        ai.A_details();
    }

}
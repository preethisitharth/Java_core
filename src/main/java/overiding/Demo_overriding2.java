package overiding;

public class Demo_overriding2 {
    public void district_name(String district1,String district2)
    {
        if(district1=="Trichy")
        {
            System.out.println("Famous for Mallai kottai");
        }
        else if(district2=="Tiruvarur")
        {
            System.out.println("Famous for Temples");
        }
        else {
            System.out.println("Not Valid");
        }
    }

}

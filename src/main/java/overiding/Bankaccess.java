package overiding;
import javax.print.attribute.standard.JobName;
public class Bankaccess {
    public static void main(String[] args) {
        //Upcasting
        bank bb= new icicbank();
        System.out.println(bb.getrateofinterest());
        bank bb1= new Hdfcbank();
        System.out.println(bb1.getrateofinterest());
        bank bb2= new bank();
        System.out.println(bb2.getrateofinterest());

    }
}

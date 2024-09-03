package overiding;

public class icicbank extends bank{
    public  int getrateofinterest()
    {
        return 9;
    }

    public static void main(String[] args) {
        icicbank ic= new icicbank();
        System.out.println(ic.getrateofinterest());
        bank bb= new bank();
        System.out.println(bb.getrateofinterest());
        Hdfcbank hd= new Hdfcbank();
        System.out.println(hd.getrateofinterest());
    }
}


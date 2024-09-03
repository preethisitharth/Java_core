package oops_inheritance;
    class root
    {
        public void senior()
        {
            System.out.println("He is senoir of the Family");
        }
    }
    class stem extends root{
        public void smallSenior()
        {
            System.out.println("He is root of the Family");
        }
    }
    class branches extends root
    {
        public void children()
        {
            System.out.println("He is branches in the Family");
        }
    }
    class leaves extends stem{
        public void child()
        {
            System.out.println("She is very Clever girl in the Family");
        }
    }
    public class hybrid_inheritance
    {
        public static void main(String[] args)
        {
            leaves ls=new leaves();
            ls.senior();
            ls.smallSenior();
            ls.child();
            branches bs=new branches();
            bs.children();

        }
    }



package oops_inheritance;
 class Reliance
    {
        public void Departments()
        { //Hierarchical(Depends only on Parent class)
            System.out.println("Bakery Things"); //Disadvantage:Only use the methods we declared we have
            System.out.println("House Hold Things"); //create a new object to access the class
            System.out.println("Medical Things");
        }
    }
    class Bakery extends Reliance{
        public void sweets()
        {
            String sweet="Sugar";
            String sweet1="Jamun";
            System.out.println("My Fav Sweet is:"+sweet1);
        }
    }
    class Household extends Reliance{
        public void decorations()
        {
            String light="LED";
            String flower="Rose";
            String utensils="Cooker";
            System.out.println("My Flowers is:"+flower);
        }
    }
    public class hierarchical
    {
        public static void main(String[] args)
        {
            Household ho=new Household();
            ho.Departments();
            ho.decorations();
            Bakery bs=new Bakery();
            bs.sweets();
        }
    }




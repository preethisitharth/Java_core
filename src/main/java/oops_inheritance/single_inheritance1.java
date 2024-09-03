package oops_inheritance;

public class single_inheritance1 extends single_inheritance {
    public void sub(){
        int a=90;
        int b=80;
        int c=a-b;
        System.out.println("sub :"+c);
    }
    public static void main(String[]args){
        single_inheritance1 si=new single_inheritance1();
        si.add();
        si.sub();
    }

}

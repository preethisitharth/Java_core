package overiding;

public class Demo_overriding_Access {
    public static void main(String[] args) {
        Demo_overriding dore = new Demo_overriding();
        dore.district_name("Trichy", "Thiruverumbur");
        Demo_overriding2 dor = new Demo_overriding2();
        dor.district_name("Trichy", "Thanjavur");
    }
}

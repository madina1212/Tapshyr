import person.Builder;
import person.Driver;
import person.Programmer;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Tursunai",19);
        System.out.println(driver.toString());
        Programmer programmer = new Programmer("Madina",14);
        System.out.println(programmer.toString());
        Builder builder = new Builder("Kanykei",16);
        System.out.println(builder.toString());
    }
}
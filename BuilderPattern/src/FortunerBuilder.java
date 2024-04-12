import Models.Fortuner;
import Models.ICar;

public class FortunerBuilder implements ICarBuilder{
    Fortuner f1;
    @Override
    public void buildEngine() {
        System.out.println("Fortuner Engine Inserted");
    }

    @Override
    public void buildChassis() {
        System.out.println("Fortuner Chassis Inserted");
    }

    @Override
    public void buildTyre() {
        System.out.println("Fortuner Tyre Inserted");
    }

    @Override
    public void buildBodyShell() {
        System.out.println("Fortuner Shell Inserted");
    }

    @Override
    public ICar build() {
        System.out.println("Fortuner ready for Delivery");
        return f1;
    }
}

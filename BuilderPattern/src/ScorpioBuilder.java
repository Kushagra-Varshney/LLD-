import Models.ICar;
import Models.Scorpio;

public class ScorpioBuilder implements ICarBuilder{
    Scorpio s1;
    @Override
    public void buildEngine() {
        System.out.println("Scorpio Engine Inserted");
    }

    @Override
    public void buildChassis() {
        System.out.println("Scorpio Chassis Inserted");
    }

    @Override
    public void buildTyre() {
        System.out.println("Scorpio Tyre Inserted");
    }

    @Override
    public void buildBodyShell() {
        System.out.println("Scorpio Shell Inserted");
    }

    @Override
    public ICar build() {
        System.out.println("Scorpio Ready for delivery");
        return s1;
    }
}

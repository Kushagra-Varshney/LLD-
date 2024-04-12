import Models.ICar;

public interface ICarBuilder {
    public void buildEngine();
    public void buildChassis();
    public void buildTyre();
    public void buildBodyShell();

    //build method return the car object
    public ICar build();
}

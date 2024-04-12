public class Director {
    ICarBuilder carBuilder;

    public Director(ICarBuilder builder) {
        this.carBuilder = builder;
    }

    //instructions
    public void construct(boolean engineNeeded, boolean shellNeeded, boolean tyreNeeded, boolean chassisNeeded) {
        if(engineNeeded) {
            carBuilder.buildEngine();
        }
        if(shellNeeded) {
            carBuilder.buildBodyShell();
        }

        if(tyreNeeded) {
            carBuilder.buildTyre();
        }

        if(chassisNeeded) {
            carBuilder.buildChassis();
        }


    }
}

public class Scorpio implements IScorpioPrototype{
    //default engine
    ScorpioEngine engine = new ScorpioEngine();

    @Override
    public void start() {
        System.out.println("Scorpio Started");
    }

    @Override
    public IScorpioPrototype clone() {
        return new Scorpio();
    }

    @Override
    public void setEngine(ScorpioEngine engine) {
        this.engine = engine;
    }
}

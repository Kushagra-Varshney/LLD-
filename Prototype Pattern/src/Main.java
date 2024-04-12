//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //create prototype
        IScorpioPrototype prototype = new Scorpio();

        //create scorpioN
        IScorpioPrototype scorpioN = prototype.clone();
        scorpioN.setEngine(new ScorpioNEngine());

        //create classic
        IScorpioPrototype scorpioClassic = prototype.clone();
        scorpioClassic.setEngine(new scorpioClassicEngine());
    }
}
import Models.ICar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //make a builder
        ICarBuilder builder = new ScorpioBuilder();
        //get a director
        Director director = new Director(builder);
        //director sets up instructions
        director.construct(true, true, true, false);
        //builder builds acc to instruction
        ICar car = builder.build();
    }
}
//lazy init solution for race condition
public class AircraftOneLazy {
    private AircraftOneLazy() {
        //init
    }
    //nested inner class
    private static class Holder {
        private static final AircraftOneLazy INSTANCE = new AircraftOneLazy();
    }

    public static AircraftOneLazy getInstance() {
        return Holder.INSTANCE;
    }
}

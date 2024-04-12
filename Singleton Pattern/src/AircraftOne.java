public class AircraftOne {
    private static AircraftOne aircraftInstance;

    private AircraftOne() {
        //init aircraftOne
    }

     public static AircraftOne getAircraftInstance() {
        if(aircraftInstance == null) {
            aircraftInstance = new AircraftOne();
        }

        return aircraftInstance;
    }
}

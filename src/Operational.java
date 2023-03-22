public class Operational extends  State {


    @Override
    public State handleNextState() {
        System.out.println("Operational");
        return new vehiclesEnabled();
    }
}


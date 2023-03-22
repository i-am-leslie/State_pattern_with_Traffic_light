public class PedestrianEnabled extends State{


    public PedestrianEnabled(){
        signalTraffic=trafficLight.RED;
    }

    @Override
    public State handleNextState() {
        printout();
        return new pedestriansWalk();
    }

    @Override
    public void printout() {
        super.printout();
    }
}

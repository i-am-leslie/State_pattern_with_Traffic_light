public class VehiclesYellow extends State {
    private Timer time;

    public  VehiclesYellow(){
        time=new Timer(3);
        time.start();
        signalTraffic= trafficLight.YELLOW;
    }

    @Override
    public State timeOut() {
        return new PedestrianEnabled();
    }

    @Override
    public State handleNextState() {
        printout();
        while(time.getDuration()!=0){

        }
        time.stop();
        return timeOut();

    }

    @Override
    public void printout() {
        super.printout();
    }
}

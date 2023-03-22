public class pedestriansWalk extends  State{
    private Timer time;

    public  pedestriansWalk(){
        time=new Timer(15);
        time.start();
        signalPedestrian=pedestrian.WALK;
        signalTraffic=trafficLight.RED;
        pedestrianWaitingOrNot=true;


    }

    @Override
    public State timeOut() {
        return new pedestriansFlash();
    }

    @Override
    public State handleNextState() {
        printout();
        while (time.getDuration()!=0){

        }
        time.stop();
        return timeOut();
    }

    @Override
    public void printout() {
        super.printout();
    }
}

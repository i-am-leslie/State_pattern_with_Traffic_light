public class vehiclesGreen extends State{
    private Timer time;


    public vehiclesGreen(){
        signalTraffic=trafficLight.GREEN;
        pedestrianWaitingOrNot=false;
        time=new Timer(10);
        time.start();
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
    public State timeOut() {
        if(pedestrianWaitingOrNot==true){
            return new VehiclesYellow();

        }
        else{
            return new VehiclesGreenInt();
        }
    }
}

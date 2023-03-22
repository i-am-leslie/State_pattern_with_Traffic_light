public class VehiclesGreenInt extends State{


    public VehiclesGreenInt(){
        signalTraffic=trafficLight.GREEN;
        pedestrianWaitingOrNot=false;;
    }

    @Override
    public State handleNextState() {
        printout();
        while(pedestrianWaitingOrNot==false){
            try {
                Thread.sleep(4000); // pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return new VehiclesYellow();
    }


    @Override
    public  void printout(){
        System.out.println(signalPedestrian.toString()+" "+signalTraffic.toString()+"'"+ this.getClass().getSimpleName());
    }
}

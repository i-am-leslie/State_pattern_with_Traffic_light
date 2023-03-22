public class vehiclesEnabled extends State{





    public vehiclesEnabled(){
        signalPedestrian=pedestrian.DONT_WALK;

    }

    @Override
    public State handleNextState() {
        printout();
        return new vehiclesGreen();
    }

    @Override
    public  void printout(){
        System.out.println(signalPedestrian.toString()+" "+signalTraffic.toString()+"'"+ this.getClass().getSimpleName());
    }
}

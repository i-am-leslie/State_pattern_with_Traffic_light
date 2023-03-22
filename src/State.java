public class State {
    public enum pedestrian{DONT_WALK,WALK,BLANK};
    public enum trafficLight{RED,YELLOW,GREEN};
    protected pedestrian signalPedestrian;
    protected trafficLight signalTraffic;
    protected boolean pedestrianWaitingOrNot;


    public State(){
        signalPedestrian=pedestrian.DONT_WALK;
        pedestrianWaitingOrNot=false;
        signalTraffic=trafficLight.RED;
    }
    public void handlePedestrianWaiting(){
        pedestrianWaitingOrNot=true;
    }

    public State handleNextState(){
        return null;
    }

    public State timeOut(){
        return null;
    }

    public static State start_running(){
        return new Operational();

    }
    public  void printout(){
        System.out.println(signalPedestrian.toString()+" "+signalTraffic.toString()+" "+ this.getClass().getSimpleName());
    }
}


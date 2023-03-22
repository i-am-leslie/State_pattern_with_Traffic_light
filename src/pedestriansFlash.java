public class pedestriansFlash  extends State{
    private Timer time;

    private  int pedestrianFlashCtr;

    public pedestriansFlash(){
        time=new Timer(2);
        time.start();
        pedestrianFlashCtr=7;
    }

    @Override
    public State timeOut() {

        while(pedestrianFlashCtr!=0){
            reducePedestrianFlashCtr();
            if(pedestrianFlashCtr%2==0 ){
                signalPedestrian=pedestrian.DONT_WALK;
                time.reset(2);
                printout();
                System.out.println("pedestrianFlashCtr"+" "+ pedestrianFlashCtr);
                try {
                    Thread.sleep(1000); // pause for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else if(pedestrianFlashCtr%2==1){
                signalPedestrian=pedestrian.BLANK;
                time.reset(2);
                printout();
                try {
                    Thread.sleep(4000); // pause for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return new vehiclesEnabled();
    }
    public void reducePedestrianFlashCtr(){
         pedestrianFlashCtr--;

    }

    @Override
    public State handleNextState() {
        printout();
        return timeOut();



    }

    @Override
    public void printout() {
        super.printout();
    }
}

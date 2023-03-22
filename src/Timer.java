public class Timer extends Thread {
    private volatile int duration;
    private volatile boolean stopped;

    public Timer(int duration){
        this.duration=duration;
        this.stopped=false;
    }

    @Override
    public void run() {
        while (!stopped && duration > 0) {
            duration--;
            try {
                if(duration==0){
                    print();
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int getDuration(){
        return duration;
    }

    public void stopTimer(){
        stopped = true;
    }
    public void print(){
        System.out.println(" ");
    }
    public void reset(int time){
        duration=time;
    }
}

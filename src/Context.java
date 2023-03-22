
public class Context {
     private State currentState;

     public Context(){
          currentState=State.start_running();
          Thread t=new Thread(new Runnable() {
               @Override
               public void run() {
                    while (true){
                         currentState=currentState.handleNextState();
                    }
               }
          });
          t.start();

     }

     public State getCurrentState() {
          return currentState;
     }

     public void pedestrianWaiting(){
          currentState.handlePedestrianWaiting();
     }

     public void timeout(){
          currentState=currentState.timeOut();

     }






}

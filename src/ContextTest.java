import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContextTest {
    Context test;

    @Before
    public void setUp(){
        test=new Context();
    }

    @After
    public  void tearDown(){
        test=null;
    }

    @Test
    public void testStateGreen(){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
        test.pedestrianWaiting();
        assertTrue(test.getCurrentState().getClass().getSimpleName().equals("vehiclesGreen"));


    }
    @Test
    public void testState2Greenint(){
        try{
            Thread.sleep(11000);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
        test.pedestrianWaiting();
        assertTrue(test.getCurrentState().getClass().getSimpleName().equals("VehiclesGreenInt"));

    }
    @Test
    public void testPedestrianWaiting(){
        try{
            Thread.sleep(20000);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }

        test.pedestrianWaiting();
        assertTrue(test.getCurrentState().pedestrianWaitingOrNot);

    }
    @Test
    public void testTimeOut(){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
        test.timeout();
        assertTrue(test.getCurrentState().getClass().getSimpleName().equals("VehiclesGreenInt"));
    }



}

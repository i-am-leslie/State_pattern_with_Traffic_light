public class Main {
    public static void main(String[] args) throws InterruptedException {
        Context c =new Context();
        Thread.sleep(15000);
        c.pedestrianWaiting();
        Thread.sleep(20000);
        c.timeout();
        System.out.println("Pushed timeout");
    }
}
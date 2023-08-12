public class MultithreadThing extends Thread {
    @Override
    public void run(){ // run method can contain any code, but must be public
                        // take no arguments, have no return value, and
                        // throw no exceptions
        for(int i = 1; i <=  5; i++){
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

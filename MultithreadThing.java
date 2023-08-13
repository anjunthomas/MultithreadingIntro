public class MultithreadThing extends Thread {
    /* or public class MultiThreadTing implements Runnable*/
    // The benefit of implementing an interface is that you
    // can implement as many interfaces as you want
    // however, you cannot extend more than one class
    // so implement as interface so you can extend another class
    // if you need to.
    private int threadNumber;
    public MultithreadThing(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run(){ // run method can contain any code, but must be public
                        // take no arguments, have no return value, and
                        // throw no exceptions
        for(int i = 1; i <=  5; i++){
            System.out.println(i + "from thread" + threadNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

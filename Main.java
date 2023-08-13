public class Main {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            MultithreadThing myThing = new MultithreadThing(i);
            myThing.start();
            System.out.println(myThing.isAlive()); // prints whether thread is alive or not, boolean value produced
        }
        /*
        MultithreadThing myThing = new MultithreadThing();
        MultithreadThing myThing2 = new MultithreadThing();

        myThing.start();
        myThing2.start();

         */
    }
}


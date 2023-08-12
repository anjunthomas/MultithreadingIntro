public class Main {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            MultithreadThing myThing = new MultithreadThing();
            myThing.start();
        }
        /*
        MultithreadThing myThing = new MultithreadThing();
        MultithreadThing myThing2 = new MultithreadThing();

        myThing.start();
        myThing2.start();

         */
    }
}


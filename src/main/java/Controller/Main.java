package Controller;

/**
 * Created by Andrew on 15.05.2017.
 */
public class Main {
    public static int counter = 0;

    public static void main(String[] args) {

        Thread T = new Thread(new Runnable() {
            public void run() {
                while (true){
                    counter ++;

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        T.start();

    }
}

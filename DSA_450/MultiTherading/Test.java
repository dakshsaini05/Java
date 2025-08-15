package DSA_450.MultiTherading;

public class Test implements Runnable{
    public void run() {
        System.out.println("Task performed my Thread");

        for(int i=1;i<=5;i++) {
            System.out.println("Value of i is " + i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Test mThd = new Test();

        Thread t1 = new Thread(mThd);

//        t1.run();

        Test2 t2 = new Test2();
        t2.start();
    }

}

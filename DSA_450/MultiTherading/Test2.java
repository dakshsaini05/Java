package DSA_450.MultiTherading;

public class Test2 extends Thread{
    public void run() {
        for(int i=10;i>=1;i--) {
            System.out.println("Value of i is "+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

package DSA_450.MultiTherading;

class UserDefinedThread extends Thread {
    public void run() {
        System.out.println("User define thread inside the run method");
    }
}

public class test3 {
    // Thread --> currentThread --> static
    public static void main(String[] args) { // main thread
        System.out.println("Start");
        int x = 10+20;
        System.out.println("x ------------> "+x);
        Thread t1 = Thread.currentThread();
        System.out.println("Current thread name is: "+t1.getName());

        // SetName
        t1.setName("MyMainThread");
        System.out.println("My new thread name is: "+t1.getName());

        // sleep() ------> pause
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}

        System.out.println(t1.getId());
        UserDefinedThread udt = new UserDefinedThread();
        udt.start();
        System.out.println("End");
    }
}

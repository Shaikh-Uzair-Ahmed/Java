package Experiment_8;

class MyThread implements Runnable {
    Thread t;
    String message;
    int duration_seconds;

    // Constructor without parameters
    MyThread() {
        t = new Thread(this, "MyThreadInstance");
    }

    // Constructor with parameters
    MyThread(String m, int ds) {
        t = new Thread(this, "MyThreadInstance");
        message = m;
        duration_seconds = ds;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(duration_seconds * 1000);
            }
        } catch (InterruptedException ie) {
            System.out.println("My Thread printing Interrupted");
        }
    }
}

class MainThread {
    public static void main(String[] args) {
        MyThread bms = new MyThread("BMS College Of Engineering", 10);
        MyThread cse = new MyThread("CSE", 2);
        bms.t.start();
        cse.t.start();
    }
}
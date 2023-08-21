package Multi;

class SharedResource {
    boolean flag = false;

    synchronized void waitForFlagChange() {
        while (!flag) {
            try {
                wait(); // Releases the monitor and waits until notified
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Flag has been changed.");
    }

    synchronized void setFlag() {
        flag = true;
        notify(); // Notifies a waiting thread
    }
}

public class ThreadCommunicationExample {
    public static void main(String[] args) {
        final SharedResource resource = new SharedResource();

        Thread thread1 = new Thread(() -> {
            resource.waitForFlagChange();
        });

        Thread thread2 = new Thread(() -> {
            resource.setFlag();
        });

        thread1.start();

        // Add a slight delay to ensure thread1 starts waiting before thread2 notifies
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
    }
}


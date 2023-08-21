package Multi;
//notify---->inter thread communication
//notifyAll---->inter thread communication
//resume---->resume flow
//suspend---->pause flow
//wait---->inter thread communication
//sleep---->wait for some time
//start---->to run
//join---->to sync threads
//stop---->stop thread
//yield---->to inform that the thread can wait
//interrupt---->stop in safe manner
//setPriority---->to set Priority
class MyThr extends Thread {
	int i =0;
	public void run() {
		for(int i = 0;i<=9;i++) {
			System.out.println("Printing Document "+(i+1)+" in printer 1");
			while(i==5)
				stop();
		}
	}
}

class MyThr1 extends Thread {
	public void run() {
		for(int i = 0;i<=9;i++) {
			System.out.println("Printing Document "+(i+1)+" in printer 2");
		}
	}
}

public class Expl {
	public static void main(String[] args) {
		MyThr t1 = new MyThr();
		MyThr1 t2 = new MyThr1();
		t1.start();
		System.out.println(t1.getName());
		t2.start();
		System.out.println(t2.getName());
		

	}
}

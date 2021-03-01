package thread;

public class TerminateThread extends Thread{
	
	private boolean flag = false;
	int i;
	
	public TerminateThread(String name) {
		super(name);
	}
	
	public void run() {
		while ( !flag ) {
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("end");
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

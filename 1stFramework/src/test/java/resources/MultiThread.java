package resources;

public class MultiThread  implements Runnable{

	@Override
	public void run(){  
		System.out.println("thread is running...");  
		}  
	
	public static void main(String args[]){
		MultiThread m1 = new MultiThread();
		Thread t1 = new Thread(m1);
		t1.start();
	}

}

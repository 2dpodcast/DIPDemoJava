package ghc.threads;

import javax.swing.JProgressBar;

public class MyThread implements Runnable{

	int count = 10;
	
	public MyThread(){		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub	
		while (true) {
			doit();
		}
	}
	
	//线程同步方法
	public synchronized void doit(){
		if (count>0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(count--);
		}
	}
	
	//设置线程优先级
	public void setThreadPriority(String threadName,int priority,Thread thread){
		thread.setPriority(priority);
		thread.setName(threadName);
		thread.start();
	}
	
	public void setProgressBarThread(JProgressBar progressBar){
		Thread thread = new Thread(new Runnable() {			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int count = 0;
				while (true) {
					progressBar.setValue(++count);
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (count == 100) {
						count = 0;
					}
				}
			}
		});
        thread.start();
	}
}

package threaddmo2;

class MinThread implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"输出"+i);
		}
	}

}
public class Test1 {

	public static void main(String[] args) {
		//
		Thread max=new Thread(new MaxThread(),"优先级别高");
		Thread min=new Thread(new MinThread(),"优先级别低");	
		//
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
		//
		max.start();
		min.start();
	}

}

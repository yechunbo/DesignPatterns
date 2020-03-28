package other.keyWord;

/**
* @author YeChunBo
* @time 2019年7月29日 
*
* 类说明 
*/

public class synchronziedDemo implements Runnable{
    
	private static int count = 0;
//	private static int count = 0;
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			count ++;
			System.out.println("Thread id is " + Thread.currentThread().getId() + " ,count = " + count);
		}
		
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new synchronziedDemo());
			thread.start();
		}
		System.out.println("------Result : " + count);
	}

}

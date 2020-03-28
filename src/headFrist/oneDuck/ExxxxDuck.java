package headFrist.oneDuck;

/**
 * @author YeChunBo
 * @time 2020年3月7日
 *
 *       类说明
 */

public class ExxxxDuck extends Duck {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("lllll");
	}

    @Override
    public void swim() {
    	System.out.println("My methon swim ...");
    }
    
	public static void main(String[] args) {
		Duck d = new ExxxxDuck();
		d.display();
		d.swim();
		d.quack();
	}
}

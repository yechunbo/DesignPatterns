package headFrist.oneDuck;

/**
 * @author YeChunBo
 * @time 2020年3月7日
 *
 *       类说明
 */

public class MallardDuck extends Duck {

	@Override
	public void display() {
		System.out.println(this + ",黄色....");
	}

	public static void main(String[] args) {
       MallardDuck md = new MallardDuck();
       md.swim();
       md.quack();
       md.display();
	}
}

package headFrist.oneDuck;

/**
 * @author YeChunBo
 * @time 2020��3��7��
 *
 *       ��˵��
 */

public class MallardDuck extends Duck {

	@Override
	public void display() {
		System.out.println(this + ",��ɫ....");
	}

	public static void main(String[] args) {
       MallardDuck md = new MallardDuck();
       md.swim();
       md.quack();
       md.display();
	}
}

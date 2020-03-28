package factoryPattern.simpleFactory;

/**
 * @author YeChunBo
 * @time 2020��3��12��
 *
 *       ��˵�� ��һ����룬û�����ü򵥹���ģʽ
 */

public class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza = null;
		if ("cheese".equals(type)) {
			pizza = new CheesePizza();
		} else if ("greek".equals(type)) {
			pizza = new GreekPizza();
		} else if ("pepperoni".equals(type)) {
			pizza = new PepperoniPizza();
		}

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}

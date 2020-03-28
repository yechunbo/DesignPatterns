package headFrist.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author YeChunBo
 * @time 2020年3月11日
 *
 *       类说明
 */

public class ObserverTest extends Observable {
	@Override
	public synchronized void deleteObserver(Observer o) {
		// TODO Auto-generated method stub
		super.deleteObserver(o);
	}
	
	@Override
	public synchronized void addObserver(Observer o) {
		// TODO Auto-generated method stub
		super.addObserver(o);
	}
	
	@Override
	public void notifyObservers(Object arg) {
		// TODO Auto-generated method stub
		super.notifyObservers(arg);
	}
}

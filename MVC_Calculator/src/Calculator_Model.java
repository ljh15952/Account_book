import java.util.ArrayList;
import java.util.Observer;

public class Calculator_Model {
	private int data;
	private ArrayList<MYObserver> list = new ArrayList<MYObserver>();

	public void registerObserver(MYObserver o) {
		list.add(o);
	}

	public void notifyObservers() {
		for (MYObserver o : list) {
			o.update(data);
		}
	}

	public void add(int num1, int num2) {
		data = num1 + num2;
		notifyObservers();
	}

}

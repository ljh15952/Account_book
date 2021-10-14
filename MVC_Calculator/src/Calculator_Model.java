import java.util.ArrayList;
import java.util.Observer;

public class Calculator_Model {
	private int data;
	private ArrayList<MYObserver> list = new ArrayList<MYObserver>();

	public void addObserver(MYObserver o) {
		list.add(o);
	}

	public void add(int num1, int num2) {
		data = num1 + num2;
		for (MYObserver o : list) {
			o.updateResult(data);
		}
	}

	public void setNum(int i) {
		for (MYObserver o : list) {
			o.setNum_1_2(i);
		}
	}

	public void reset() {
		for (MYObserver o : list) {
			o.reset();
		}
	}

}

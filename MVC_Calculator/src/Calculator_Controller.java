import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator_Controller implements ActionListener {
	private Calculator_Model model;
	private Calculator_View view;

	public Calculator_Controller(Calculator_Model model, Calculator_View view) {
		this.model = model;
		this.view = view;
		this.view.setCalculatorListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == view.btnCalc) {
			int num1 = view.getNum1();
			int num2 = view.getNum2();
			model.add(num1, num2);
		} else if (e.getSource() == view.btnReset) {
			model.reset();
		} else {
			for (int i = 0; i < 10; i++) {
				if (e.getSource() == view.btns[i]) {
					model.setNum(i);
				}
			}
		}

	}

}

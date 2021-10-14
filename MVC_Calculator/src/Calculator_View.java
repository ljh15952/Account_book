import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator_View extends JFrame implements MYObserver {

	private JPanel panel;

	private JLabel label_1;
	private JLabel label_2;
	private JLabel labelPlus;
	public JButton btnCalc;
	public JButton btnReset;
	private JLabel textResult;
	
	public JButton[] btns;

	public Calculator_View() {
		initWnd();
		initComponents();
		addComponents();
	}

	private void initWnd() {
		setSize(225, 200);
		setTitle("MVC모델 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void initComponents() {
		panel = new JPanel();

		label_1 = new JLabel("0");
		label_2 = new JLabel("0");
		labelPlus = new JLabel("+");
		btnCalc = new JButton("=");
		textResult = new JLabel("0");
		btnReset = new JButton("Reset");
		
		btns = new JButton[10];
	}

	private void addComponents() {
		setLayout(new BorderLayout());
		panel.setLayout(new FlowLayout());

		panel.add(label_1);
		panel.add(labelPlus);
		panel.add(label_2);
		panel.add(btnCalc);
		panel.add(textResult);
		panel.add(btnReset);
		
		for(int i = 0; i < 10; i++) {
			btns[i] = new JButton(Integer.toString(i));
			panel.add(btns[i]);
		}
		
		add(panel);
	}

	public void setNum1(int n) {
		label_1.setText(Integer.toString(n));
	}

	public void setNum2(int n) {
		label_2.setText(Integer.toString(n));
	}

	public int getNum1() {
		return Integer.parseInt(label_1.getText());
	}

	public int getNum2() {
		return Integer.parseInt(label_2.getText());
	}

	public void setResultText(int result) {
		textResult.setText(Integer.toString(result));
	}

	public void setCalculatorListener(ActionListener listener) {
		btnCalc.addActionListener(listener);
		btnReset.addActionListener(listener);
		for(int i = 0; i < 10; i++) {
			btns[i].addActionListener(listener);
		}
	}

	@Override
	public void updateResult(int data) {
		setResultText(data);
	}
	
	@Override
	public void reset() {
		setNum1(0);
		setNum2(0);
		setResultText(0);
	}

	@Override
	public void setNum_1_2(int i) {
		setNum1(i);
		setNum2(i);
	}
}

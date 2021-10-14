
public class Main {
	public static void main(String[] args) {
		Calculator_View view = new Calculator_View();
		Calculator_Model model = new Calculator_Model();
		model.addObserver(view);
		model.reset();
		Calculator_Controller controller = new Calculator_Controller(model, view);
		view.setVisible(true);
	}
}

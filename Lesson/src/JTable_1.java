import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTable_1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Table");
		JPanel panel = new JPanel();
		
		String[] headings = new String[] {"Id","Name","Country"};
		Object[][] data = new Object[][] {
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"1","aaa","Korea"},
			{"2","bbbb","Japan"},
			{"3","cccccc","China"}
		};
		
		JTable table = new JTable(data,headings);
		table.setPreferredScrollableViewportSize(new Dimension(700,600));
		table.setFillsViewportHeight(true);
		panel.add(new JScrollPane(table));
		
		frame.add(panel);
		
		frame.setResizable(false); //화면크기 고정
		frame.setVisible(true);
		frame.setSize(800,640);
		frame.setLocationRelativeTo(null); //화면 가운데
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

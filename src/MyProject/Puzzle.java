package MyProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Puzzle extends JFrame {
	JPanel panel = new JPanel(new GridLayout(3, 3, 1, 1));
	JMenuBar manuBar = null;
	final String fileItems[] = new String[] { "New", "Exit" };
	static Random generate = new Random();
	int[][] nums = new int[3][3];

	public Puzzle() {
		super("Puzzle by c0nst");
		setBounds(200, 200, 300, 300);
		setResizable(false);
		createMenu();
		setJMenuBar(manuBar);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cont = getContentPane();
		init();
		panel.setDoubleBuffered(true);
		cont.add(panel);
		repaintField();
	}

	public void init() {
		int[] invariants = new int[9];

		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				nums[a][b] = 0;
				invariants[a * 3 + b] = 0;
			}
		}

		for (int a = 1; a < 9; a++) {
			int c;
			int d;
			do {
				c = generate.nextInt(100) % 3;
				d = generate.nextInt(100) % 3;
			} while (nums[c][d] != 0);
			nums[c][d] = a;
			invariants[c * 3 + d] = a;
		}

		boolean change = true;
		int counter = 1;
		while (change) {
			change = false;
			for (int a = 0; a < 9; a++) {
				if (invariants[a] != a) {
					for (int b = 0; b < 9; b++) {
						if (invariants[b] == a) {
							int temp = invariants[a];
							invariants[a] = invariants[b];
							invariants[b] = temp;
							change = true;
							counter++;
							break;
						}
					}
					break;
				}
			}
		}

		if (counter % 2 != 0) {
			int temp = nums[0][0];
			nums[0][0] = nums[2][2];
			nums[2][2] = temp;
		}
	}

	private void repaintField() {
		panel.removeAll();
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				JButton button = new JButton(Integer.toString(nums[a][b]));
				button.setFocusable(false);
				panel.add(button);
				if (nums[a][b] == 0) {
					button.setVisible(false);
				} else
					button.addActionListener(new ClickListener());
			}
		}

		panel.validate();
	}

	public boolean checkWin() {
		boolean status = true;
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				if (a == 2 && b > 1)
					break;
				if (nums[a][b] != a * 3 + b + 1) {
					status = false;
				}
			}
		}
		return status;
	}

	private void createMenu() {
		manuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");

		for (int a = 0; a < fileItems.length; a++) {
			JMenuItem item = new JMenuItem(fileItems[a]);
			item.setActionCommand(fileItems[a].toLowerCase());
			item.addActionListener(new NewMenuListener());
			fileMenu.add(item);
		}
		fileMenu.insertSeparator(1);

		manuBar.add(fileMenu);
	}

	private class NewMenuListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if ("exit".equals(command)) {
				System.exit(0);
			}
			if ("new".equals(command)) {
				init();
				repaintField();
			}
		}
	}

	private class ClickListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			button.setVisible(false);
			String name = button.getText();
			change(Integer.parseInt(name));
		}
	}

	public void change(int num) {
		int a = 0, b = 0;
		for (int c = 0; c < 3; c++) {
			for (int d = 0; d < 3; d++) {
				if (nums[c][d] == num) {
					a = c;
					b = d;
				}
			}
		}
		if (a > 0) {
			if (nums[a - 1][b] == 0) {
				nums[a - 1][b] = num;
				nums[a][b] = 0;
			}
		}
		if (a < 2) {
			if (nums[a + 1][b] == 0) {
				nums[a + 1][b] = num;
				nums[a][b] = 0;
			}
		}
		if (b > 0) {
			if (nums[a][b - 1] == 0) {
				nums[a][b - 1] = num;
				nums[a][b] = 0;
			}
		}
		if (b < 2) {
			if (nums[a][b + 1] == 0) {
				nums[a][b + 1] = num;
				nums[a][b] = 0;
			}
		}

		repaintField();
		if (checkWin()) {
			JOptionPane.showMessageDialog(null, "Победа!", "Игра окончена", 1);
			init();
			repaintField();
			setVisible(false);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		JFrame app = new Puzzle();
		app.setVisible(true);
	}

}

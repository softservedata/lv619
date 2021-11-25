package MyProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Puzzle extends JFrame {
	JPanel panel = new JPanel();
	GridLayout layout = new GridLayout(3, 3, 1, 1);
	JMenuBar manuBar = new JMenuBar();
	JMenu control = new JMenu("Управление");
	JMenuItem updateItem = new JMenuItem("Обновить");
	JMenuItem exitItem = new JMenuItem("Выход");
	Random generate = new Random();
	int[][] nums = new int[3][3];
	
	public void init() {
		 int[] invariants = new int[9];
		 
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                nums[i][j] = 0;
	                invariants[i*3 + j] = 0;
	            }
	        }
		
	}

}

package matrix;

import javax.swing.JFrame;

import matrix.samkod;

public class interfeis {
	public static void main(String[] args) {
		samkod sk = new samkod("Вычисление матриц 3-го порядка");
		sk.setVisible(true);
		sk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sk.setSize(65, 170);
		sk.setResizable(false);
		sk.setLocationRelativeTo(null);
	}

}

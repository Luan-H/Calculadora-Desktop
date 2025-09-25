import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class App extends JFrame {
	JTextField resultField = new JTextField();
	JButton Button0 = new JButton();
	JButton Button1 = new JButton();
	JButton Button2 = new JButton();
	JButton Button3 = new JButton();
	JButton Button4 = new JButton();
	JButton Button5 = new JButton();
	JButton Button6 = new JButton();
	JButton Button7 = new JButton();
	JButton Button8 = new JButton();
	JButton Button9 = new JButton();
	JButton ButtonAdd = new JButton();
	JButton ButtonSub = new JButton();
	JButton ButtonDiv = new JButton();
	JButton ButtonMult = new JButton();
	JButton ButtonEqual = new JButton();
	JButton ButtonClear = new JButton();
	String num1 = "";
	String num2 = "";
	boolean val = false;
	int op;

	public void initialize() {
		setTitle("Calculadora");
		setSize(300, 400);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		// Resultado
		resultField.setBounds(30, 20, 230, 30);
		resultField.setEditable(false);
		add(resultField);

		// Linha 1
		Button7.setBounds(30, 70, 50, 50);
		Button7.setText("7");
		Button8.setBounds(90, 70, 50, 50);
		Button8.setText("8");
		Button9.setBounds(150, 70, 50, 50);
		Button9.setText("9");
		ButtonDiv.setBounds(210, 70, 50, 50);
		ButtonDiv.setText("/");
		add(Button7);
		add(Button8);
		add(Button9);
		add(ButtonDiv);

		// Linha 2
		Button4.setBounds(30, 130, 50, 50);
		Button4.setText("4");
		Button5.setBounds(90, 130, 50, 50);
		Button5.setText("5");
		Button6.setBounds(150, 130, 50, 50);
		Button6.setText("6");
		ButtonMult.setBounds(210, 130, 50, 50);
		ButtonMult.setText("*");
		add(Button4);
		add(Button5);
		add(Button6);
		add(ButtonMult);

		// Linha 3
		Button1.setBounds(30, 190, 50, 50);
		Button1.setText("1");
		Button2.setBounds(90, 190, 50, 50);
		Button2.setText("2");
		Button3.setBounds(150, 190, 50, 50);
		Button3.setText("3");
		ButtonSub.setBounds(210, 190, 50, 50);
		ButtonSub.setText("-");
		add(Button1);
		add(Button2);
		add(Button3);
		add(ButtonSub);

		// Linha 3
		ButtonClear.setBounds(30, 250, 50, 50);
		ButtonClear.setText("C");
		Button0.setBounds(90, 250, 50, 50);
		Button0.setText("0");
		ButtonEqual.setBounds(150, 250, 50, 50);
		ButtonEqual.setText("=");
		ButtonAdd.setBounds(210, 250, 50, 50);
		ButtonAdd.setText("+");
		add(ButtonClear);
		add(Button0);
		add(ButtonEqual);
		add(ButtonAdd);

		// Logica
		Button0.addActionListener(e -> {
			if (!val) {
				num1 += "0";
				resultField.setText(num1);
			} else {
				num2 += "0";
				resultField.setText(num2);
			}
		});
		Button1.addActionListener(e -> {
			if (!val) {
				num1 += "1";
				resultField.setText(num1);
			} else {
				num2 += "1";
				resultField.setText(num2);
			}
		});
		Button2.addActionListener(e -> {
			if (!val) {
				num1 += "2";
				resultField.setText(num1);
			} else {
				num2 += "2";
				resultField.setText(num2);
			}
		});
		Button3.addActionListener(e -> {
			if (!val) {
				num1 += "3";
				resultField.setText(num1);
			} else {
				num2 += "3";
				resultField.setText(num2);
			}
		});
		Button4.addActionListener(e -> {
			if (!val) {
				num1 += "4";
				resultField.setText(num1);
			} else {
				num2 += "4";
				resultField.setText(num2);
			}
		});
		Button5.addActionListener(e -> {
			if (!val) {
				num1 += "5";
				resultField.setText(num1);
			} else {
				num2 += "5";
				resultField.setText(num2);
			}
		});
		Button6.addActionListener(e -> {
			if (!val) {
				num1 += "6";
				resultField.setText(num1);
			} else {
				num2 += "6";
				resultField.setText(num2);
			}
		});
		Button7.addActionListener(e -> {
			if (!val) {
				num1 += "7";
				resultField.setText(num1);
			} else {
				num2 += "7";
				resultField.setText(num2);
			}
		});
		Button8.addActionListener(e -> {
			if (!val) {
				num1 += "8";
				resultField.setText(num1);
			} else {
				num2 += "8";
				resultField.setText(num2);
			}
		});
		Button9.addActionListener(e -> {
			if (!val) {
				num1 += "9";
				resultField.setText(num1);
			} else {
				num2 += "9";
				resultField.setText(num2);
			}
		});

		ButtonAdd.addActionListener(e -> {
			if (!val) {
				if (resultField.getText().isEmpty()) {
					num1 = "0";
				} else {
					num1 = resultField.getText();
				}
			} else {
				if (resultField.getText().isEmpty()) {
					num2 = "0";
				} else {
					num2 = resultField.getText();
				}
			}
			op = 1;
			val = true;
			resultField.setText("");
		});
		ButtonSub.addActionListener(e -> {
			if (!val) {
				if (resultField.getText().isEmpty()) {
					num1 = "0";
				} else {
					num1 = resultField.getText();
				}
			} else {
				if (resultField.getText().isEmpty()) {
					num2 = "0";
				} else {
					num2 = resultField.getText();
				}
			}
			op = 2;
			val = true;
			resultField.setText("");
		});
		ButtonMult.addActionListener(e -> {
			if (!val) {
				if (resultField.getText().isEmpty()) {
					num1 = "0";
				} else {
					num1 = resultField.getText();
				}
			} else {
				if (resultField.getText().isEmpty()) {
					num2 = "0";
				} else {
					num2 = resultField.getText();
				}
			}
			op = 3;
			val = true;
			resultField.setText("");
		});
		ButtonDiv.addActionListener(e -> {
			if (!val) {
				if (resultField.getText().isEmpty()) {
					num1 = "0";
				} else {
					num1 = resultField.getText();
				}
			} else {
				if (resultField.getText().isEmpty()) {
					num2 = "0";
				} else {
					num2 = resultField.getText();
				}
			}
			op = 4;
			val = true;
			resultField.setText("");
		});
		ButtonEqual.addActionListener(e -> {
			if (resultField.getText().isEmpty()) {
				num2 = "0";
			} else {
				num2 = resultField.getText();
			}
			double num1Conv = Double.parseDouble(num1);
			double num2Conv = Double.parseDouble(num2);
			if (num2Conv == 0 && op == 4) {
				JOptionPane.showMessageDialog(null, "Divisão por 0!");
			} else if (op == 1) {
				double calc = num1Conv + num2Conv;
				resultField.setText(calc + "");
			} else if (op == 2) {
				double calc = num1Conv - num2Conv;
				resultField.setText(calc + "");
			} else if (op == 3) {
				double calc = num1Conv * num2Conv;
				resultField.setText(calc + "");
			} else {
				double calc = num1Conv / num2Conv;
				resultField.setText(calc + "");
			}
			
			num1 = "";
			num2 = "";
			val = false;
		});

		ButtonClear.addActionListener(e -> {
			num1 = "";
			num2 = "";
			val = false;
			resultField.setText("");
		});

		setVisible(true);
	}

	public App() {
		super();
		initialize();
	}

	public static void main(String[] args) {
		App tela = new App();
	}

}

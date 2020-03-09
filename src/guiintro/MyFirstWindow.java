package guiintro;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;

public class MyFirstWindow {

	protected Shell shell;
	private Text Vorname;
	private Text Eingabe;
	private Button Divise;
	private Button Multiply;
	private Button Subtract;
	private Button Add;
	private Text Ergebnis;
	private Button btnClear;
	private Button btn7;
	private Button btn8;
	private Button btn9;
	private Button btn4;
	private Button btn1;
	private Button btn5;
	private Button btn6;
	private Button btn3;
	private Button btn2;
	private Button btn0;
	private Text temp;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MyFirstWindow window = new MyFirstWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(876, 531);
		shell.setText("SWT Application");

		Button btnMyknopf = new Button(shell, SWT.NONE);
		btnMyknopf.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// System.out.println("MyKnopf wurde gedrückt!!");
				System.out.println(getText().getText());

			}
		});
		btnMyknopf.setBounds(10, 10, 75, 25);
		btnMyknopf.setText("MyKnopf");

		Label lblVorname = new Label(shell, SWT.NONE);
		lblVorname.setBounds(104, 15, 55, 15);
		lblVorname.setText("Vorname");

		Vorname = new Text(shell, SWT.BORDER);
		Vorname.setBounds(165, 12, 76, 21);

		Label lblEingabe = new Label(shell, SWT.NONE);
		lblEingabe.setBounds(306, 74, 55, 15);
		lblEingabe.setText("Eingabe");

		Eingabe = new Text(shell, SWT.BORDER);
		Eingabe.setText("0");
		Eingabe.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		Eingabe.setBounds(387, 60, 237, 40);
		Eingabe.setVisible(false);

		Ergebnis = new Text(shell, SWT.BORDER);
		Ergebnis.setText("0");
		Ergebnis.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		Ergebnis.setBounds(81, 38, 76, 21);

		Add = new Button(shell, SWT.NONE);
		Add.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getEingabe2().getText());
				int zahl = Integer.parseInt(getEingabe().getText());
				ergebnis = ergebnis + zahl;
				getEingabe2().setText(Integer.toString(ergebnis));
				getEingabe().setText("");
				getEingabe().setText("");

			}
		});
		Add.setBounds(631, 106, 75, 25);
		Add.setText("+");

		Subtract = new Button(shell, SWT.NONE);
		Subtract.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getEingabe2().getText());
				int zahl = Integer.parseInt(getEingabe().getText());
				ergebnis = ergebnis - zahl;
				getEingabe2().setText(Integer.toString(ergebnis));
				getEingabe().setText("");
				getEingabe().setText("");
			}
		});
		Subtract.setBounds(631, 137, 75, 25);
		Subtract.setText("-");

		Multiply = new Button(shell, SWT.NONE);
		Multiply.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getEingabe2().getText());
				int zahl = Integer.parseInt(getEingabe().getText());
				ergebnis = ergebnis * zahl;
				getEingabe2().setText(Integer.toString(ergebnis));
				getEingabe().setText("");
				getEingabe().setText("");
			}
		});
		Multiply.setBounds(631, 168, 75, 25);
		Multiply.setText("*");

		Divise = new Button(shell, SWT.NONE);
		Divise.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getEingabe2().getText());
				int zahl = Integer.parseInt(getEingabe().getText());
				ergebnis = ergebnis / zahl;
				getEingabe2().setText(Integer.toString(ergebnis));
				getEingabe().setText("");
				getEingabe().setText("");
			}
		});
		Divise.setBounds(631, 199, 75, 25);
		Divise.setText("/");
		
		btn9 = new Button(shell, SWT.NONE);
		btn9.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
			int temp = Integer.parseInt(getEingabe().getText());
			getEingabe().setText(Integer.toString(temp *10 +9));
			
			
			}
			});
		btn9.setBounds(550, 106, 75, 25);
		btn9.setText("9");
		
		btn8 = new Button(shell, SWT.NONE);
		btn8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int temp = Integer.parseInt(getEingabe().getText());
				getEingabe().setText(Integer.toString(temp *10 +8));
			}
		});
		btn8.setBounds(469, 106, 75, 25);
		btn8.setText("8");
		
		btn7 = new Button(shell, SWT.NONE);
		btn7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int temp = Integer.parseInt(getEingabe().getText());
				getEingabe().setText(Integer.toString(temp *10 +7));
			}
		});
		btn7.setBounds(388, 106, 75, 25);
		btn7.setText("7");
		
		btn6 = new Button(shell, SWT.NONE);
		btn6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int temp = Integer.parseInt(getEingabe().getText());
				getEingabe().setText(Integer.toString(temp *10 +6));}
		});
		btn6.setBounds(550, 137, 75, 25);
		btn6.setText("6");
		
		btn5 = new Button(shell, SWT.NONE);
		btn5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int temp = Integer.parseInt(getEingabe().getText());
				getEingabe().setText(Integer.toString(temp *10 +5));
			}
		});
		btn5.setBounds(469, 137, 75, 25);
		btn5.setText("5");
		
		btn4 = new Button(shell, SWT.NONE);
		btn4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int temp = Integer.parseInt(getEingabe().getText());
				getEingabe().setText(Integer.toString(temp *10 +4));}
		});
		btn4.setBounds(388, 137, 75, 25);
		btn4.setText("4");
		
		btn3 = new Button(shell, SWT.NONE);
		btn3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int temp = Integer.parseInt(getEingabe().getText());
				getEingabe().setText(Integer.toString(temp *10 +3));}
		});
		btn3.setBounds(550, 168, 75, 25);
		btn3.setText("3");
		
		btn2 = new Button(shell, SWT.NONE);
		btn2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int temp = Integer.parseInt(getEingabe().getText());
				getEingabe().setText(Integer.toString(temp *10 +2));}
		});
		btn2.setBounds(469, 168, 75, 25);
		btn2.setText("2");
		
		btn1 = new Button(shell, SWT.NONE);
		btn1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int temp = Integer.parseInt(getEingabe().getText());
				getEingabe().setText(Integer.toString(temp *10 +1));}
		});
		btn1.setBounds(388, 168, 75, 25);
		btn1.setText("1");
		
		btn0 = new Button(shell, SWT.NONE);
		btn0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int temp = Integer.parseInt(getEingabe().getText());
				getEingabe().setText(Integer.toString(temp *10 +0));}
		});
		btn0.setBounds(388, 204, 75, 25);
		btn0.setText("0");
		
		temp = new Text(shell, SWT.BORDER);
		temp.setText("0");
		temp.setBounds(151, 387, 76, 21);
		temp.setVisible(false);

	}

	public Text getText() {
		return Vorname;
	}

	public Text getEingabe() {
		return Eingabe;
	}

	public Button getDivise() {
		return Divise;
	}

	public Button getMultiply() {
		return Multiply;
	}

	public Button getSubtract() {
		return Subtract;
	}

	public Button getAdd() {
		return Add;
	}

	public Text getEingabe2() {
		return Ergebnis;
	}
	public Button getBtn7() {
		return btn7;
	}
	public Button getBtn8() {
		return btn8;
	}
	public Button getBtn9() {
		return btn9;
	}
	public Button getBtn4() {
		return btn4;
	}
	public Button getBtn1() {
		return btn1;
	}
	public Button getBtn5() {
		return btn5;
	}
	public Button getBtn6() {
		return btn6;
	}
	public Button getBtn3() {
		return btn3;
	}
	public Button getBtn2() {
		return btn2;
	}
	public Button getBtn0() {
		return btn0;
	}
	public Text getTemp() {
		return temp;
	}
}

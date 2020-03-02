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
	private Label lblErgebnis;

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
		shell.setSize(450, 300);
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
		lblEingabe.setBounds(81, 88, 55, 15);
		lblEingabe.setText("Eingabe");

		Eingabe = new Text(shell, SWT.BORDER);
		Eingabe.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		Eingabe.setBounds(142, 85, 76, 21);

		Ergebnis = new Text(shell, SWT.BORDER);
		Ergebnis.setText("0");
		Ergebnis.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		Ergebnis.setBounds(142, 112, 76, 21);

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
		Add.setBounds(225, 53, 75, 25);
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
		Subtract.setBounds(224, 83, 75, 25);
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
		Multiply.setBounds(225, 114, 75, 25);
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
		Divise.setBounds(225, 147, 75, 25);
		Divise.setText("/");

		lblErgebnis = new Label(shell, SWT.NONE);
		lblErgebnis.setBounds(81, 118, 55, 15);
		lblErgebnis.setText("Ergebnis");

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

}

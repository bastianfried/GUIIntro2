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
	private Text Eingabe2;

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
		lblEingabe.setBounds(68, 88, 55, 15);
		lblEingabe.setText("Eingabe");

		Eingabe = new Text(shell, SWT.BORDER);
		Eingabe.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = getEingabe().getText();
				Integer zahl = Integer.parseInt(text);

			}
		});
		Eingabe.setBounds(129, 85, 76, 21);

		Eingabe2 = new Text(shell, SWT.BORDER);
		Eingabe2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text2 = getEingabe2().getText();
				Integer zahl2 = Integer.parseInt(text2);

			}
		});
		Eingabe2.setBounds(297, 85, 76, 21);

		Add = new Button(shell, SWT.NONE);
		Add.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		Add.setBounds(211, 54, 75, 25);
		Add.setText("+");

		Subtract = new Button(shell, SWT.NONE);
		Subtract.setBounds(211, 85, 75, 25);
		Subtract.setText("-");

		Multiply = new Button(shell, SWT.NONE);
		Multiply.setBounds(211, 116, 75, 25);
		Multiply.setText("*");

		Divise = new Button(shell, SWT.NONE);
		Divise.setBounds(211, 147, 75, 25);
		Divise.setText("/");

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
		return Eingabe2;
	}
}

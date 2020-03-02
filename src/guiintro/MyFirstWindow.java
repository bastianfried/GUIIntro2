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
	private Text Ergebniss;
	private Button btnEnter;

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

		Eingabe = new Text(shell, SWT.BORDER);
		Eingabe.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

			}
		});
		Eingabe.setBounds(206, 129, 76, 21);

		Ergebniss = new Text(shell, SWT.BORDER);
		Ergebniss.setBounds(206, 176, 76, 21);

		Label lblEingabe = new Label(shell, SWT.NONE);
		lblEingabe.setBounds(128, 135, 55, 15);
		lblEingabe.setText("Eingabe");

		Label lblErgebniss = new Label(shell, SWT.NONE);
		lblErgebniss.setBounds(128, 182, 55, 15);
		lblErgebniss.setText("Ergebniss");

		btnEnter = new Button(shell, SWT.NONE);
		btnEnter.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = getEingabe().getText();
				Integer zahl = Integer.parseInt(text);
				System.out.println(zahl + 5);
			}
		});
		btnEnter.setBounds(300, 127, 75, 25);
		btnEnter.setText("Enter");

	}

	public Text getText() {
		return Vorname;
	}

	public Text getEingabe() {
		return Eingabe;
	}

	public Text getErgebniss() {
		return Ergebniss;
	}

	public Button getBtnEnter() {
		return btnEnter;
	}
}

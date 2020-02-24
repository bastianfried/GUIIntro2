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
	private Text text;

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
			//	System.out.println("MyKnopf wurde gedrückt!!");
				System.out.println(getText().getText());
			
			}
		});
		btnMyknopf.setBounds(128, 142, 75, 25);
		btnMyknopf.setText("MyKnopf");
		
		Label lblVorname = new Label(shell, SWT.NONE);
		lblVorname.setBounds(154, 74, 55, 15);
		lblVorname.setText("Vorname");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(211, 71, 76, 21);

	}
	public Text getText() {
		return text;
	}
}

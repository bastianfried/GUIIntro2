package guiintro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import guiintro.Adress;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.io.File;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdressProject extends JFrame {
	
	ArrayList<Adress> Adressen= new ArrayList<Adress>(); 
	
	/**
	 * 
	 * 
	
	 */
	private static final long serialVersionUID = 1L;
	
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdressProject frame = new AdressProject();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public AdressProject() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vorname:");
		lblNewLabel.setBounds(80, 11, 76, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Plz:");
		lblNewLabel_2.setBounds(87, 71, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ort:");
		lblNewLabel_3.setBounds(80, 102, 38, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Stra\u00DFe:");
		lblNewLabel_4.setBounds(80, 127, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(166, 8, 111, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(166, 39, 111, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(166, 68, 111, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(166, 99, 111, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(166, 124, 111, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nachname :");
		lblNewLabel_1.setBounds(80, 42, 76, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Adress address = new Adress();
                address.setVorname(textField.getText());
                address.setNachname(textField_1.getText());
                address.setOrt(textField_3.getText());
                address.setStraﬂe(textField_4.getText());
                address.setPlz(textField_2.getText());
                Adressen.add(address);
				
				
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				
			}
		});
		btnNewButton.setBounds(176, 155, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton load = new JButton("Load");
		load.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			for(int i = 0;i<Adressen.size();i++) {
				System.out.println(Adressen.get(i).getVorname());
				System.out.println(Adressen.get(i).getNachname());
				System.out.println(Adressen.get(i).getPlz());
				System.out.println(Adressen.get(i).getStraﬂe());
				System.out.println(Adressen.get(i).getOrt()+"\n");
			}
			
			
			
			
			}
		});
		load.setBounds(62, 155, 89, 23);
		contentPane.add(load);
	}
	public JTextField getVorname() {
		return textField;
	}
	public JTextField getNachname() {
		return textField_1;
	} 	
	public JTextField getPLZ() {
		return textField_2;
	}
	public JTextField getOrt() {
		return textField_3;
	}
	public JTextField getStraﬂe() {
		return textField_4;
	}
}

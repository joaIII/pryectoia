package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class DlgConfigurarDescuentos extends JDialog implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel lbl1a5;
	private JLabel lbl6a10;
	private JLabel lbl11a15;
	private JLabel lblmasde15;
	private JLabel lblPorc1;
	private JLabel lblPorc2;
	private JLabel lblPorc3;
	private JLabel lblPorc4;
	private JTextField txt1a5;
	private JTextField txt6a10;
	private JTextField txt11a15;
	private JTextField txtmasde15;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgConfigurarDescuentos dialog = new DlgConfigurarDescuentos();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DlgConfigurarDescuentos() {
		setResizable(false);
		setTitle("Configurar porcentajes de descuento");
		setBounds(100, 100, 450, 180);
		getContentPane().setLayout(null);
		
		lbl1a5 = new JLabel("1 a 5 unidades");
		lbl1a5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl1a5.setForeground(Color.BLACK);
		lbl1a5.setBounds(22, 20, 144, 23);
		getContentPane().add(lbl1a5);
		
		lbl6a10 = new JLabel("6 a 10 unidades");
		lbl6a10.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl6a10.setForeground(Color.BLACK);
		lbl6a10.setBounds(22, 50, 144, 23);
		getContentPane().add(lbl6a10);
		
		lbl11a15 = new JLabel("11 a 15 unidades");
		lbl11a15.setFont(new Font("Arial", Font.PLAIN, 11));
		lbl11a15.setForeground(Color.BLACK);
		lbl11a15.setBounds(22, 80, 144, 23);
		getContentPane().add(lbl11a15);
		
		lblmasde15 = new JLabel("Más de 15 unidades");
		lblmasde15.setFont(new Font("Arial", Font.PLAIN, 11));
		lblmasde15.setForeground(Color.BLACK);
		lblmasde15.setBounds(22, 110, 144, 23);
		getContentPane().add(lblmasde15);
		
		txt1a5 = new JTextField("7.5");
		txt1a5.setBounds(176, 20, 102, 23);
		getContentPane().add(txt1a5);
		txt1a5.setColumns(10);
		
		txt6a10 = new JTextField("10.0");
		txt6a10.setBounds(176, 50, 102, 23);
		getContentPane().add(txt6a10);
		txt6a10.setColumns(10);
		
		txt11a15 = new JTextField("12.5");
		txt11a15.setBounds(176, 80, 102, 23);
		getContentPane().add(txt11a15);
		txt11a15.setColumns(10);
		
		txtmasde15 = new JTextField("15.0");
		txtmasde15.setBounds(176, 110, 102, 23);
		getContentPane().add(txtmasde15);
		txtmasde15.setColumns(10);

		lblPorc1 = new JLabel("%");
		lblPorc1.setForeground(Color.BLACK);
		lblPorc1.setBounds(288, 20, 18, 23);
		getContentPane().add(lblPorc1);
		
		lblPorc2 = new JLabel("%");
		lblPorc2.setForeground(Color.BLACK);
		lblPorc2.setBounds(288, 50, 18, 23);
		getContentPane().add(lblPorc2);
		
		lblPorc3 = new JLabel("%");
		lblPorc3.setForeground(Color.BLACK);
		lblPorc3.setBounds(288, 80, 18, 23);
		getContentPane().add(lblPorc3);
		
		lblPorc4 = new JLabel("%");
		lblPorc4.setForeground(Color.BLACK);
		lblPorc4.setBounds(288, 110, 18, 23);
		getContentPane().add(lblPorc4);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(330, 20, 100, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(330, 50, 100, 23);
		getContentPane().add(btnCancelar);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCancelar) {
		dispose ();
		}
		if (arg0.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(arg0);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent arg0) {
		double porc1;
		double porc2;
		double porc3;
		double porc4;

	
		porc1 = Double.parseDouble(txt1a5.getText());
		porc2 = Double.parseDouble(txt6a10.getText());
		porc3 = Double.parseDouble(txt11a15.getText());
		porc4 = Double.parseDouble(txtmasde15.getText());
			          
	    Proyecto.porcentaje1 = porc1;
	    Proyecto.porcentaje2 = porc2;
	    Proyecto.porcentaje3 = porc3;
	    Proyecto.porcentaje4 = porc4;
	    
	    JOptionPane.showMessageDialog(this, "Guardado");
	}
}

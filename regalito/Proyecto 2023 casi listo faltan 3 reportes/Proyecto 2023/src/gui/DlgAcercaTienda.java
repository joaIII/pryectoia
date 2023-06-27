package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSeparator;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class DlgAcercaTienda extends JDialog implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel lblTienda;
	private JSeparator sprLinea1;
	private JSeparator sprLinea2;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgAcercaTienda dialog = new DlgAcercaTienda();
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
	public DlgAcercaTienda() {
		setResizable(false);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 450, 320);
		getContentPane().setLayout(null);
		
		lblTienda = new JLabel("Cer\u00E1micos 1.0.0");
		lblTienda.setBounds(45, 20, 368, 40);
		lblTienda.setForeground(Color.WHITE);
		lblTienda.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 39));
		getContentPane().add(lblTienda);
		
		sprLinea1 = new JSeparator();
		sprLinea1.setBounds(10, 80, 425, 2);
		sprLinea1.setBackground(Color.BLACK);
		getContentPane().add(sprLinea1);
		
		sprLinea2 = new JSeparator();
		sprLinea2.setBounds(10, 230, 425, 2);
		sprLinea2.setBackground(Color.BLACK);
		getContentPane().add(sprLinea2);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(168, 246, 100, 23);
		btnCerrar.addActionListener(this);
		btnCerrar.setBackground(Color.WHITE);
		getContentPane().add(btnCerrar);
		
		JLabel lblNewLabel = new JLabel("Tatiana Mia Molfino Centeno");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 11));
		lblNewLabel.setBounds(86, 121, 246, 23);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enrique Jos\u00E9 Adaniya Isa");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Yu Gothic", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(86, 155, 246, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblJuanCarlosHurtado = new JLabel("Juan Carlos Hurtado");
		lblJuanCarlosHurtado.setHorizontalAlignment(SwingConstants.CENTER);
		lblJuanCarlosHurtado.setFont(new Font("Yu Gothic", Font.PLAIN, 11));
		lblJuanCarlosHurtado.setBounds(86, 180, 246, 14);
		getContentPane().add(lblJuanCarlosHurtado);
		
		JLabel lblKhaletMackelEscate = new JLabel("Khalet Mackel Escate Linares");
		lblKhaletMackelEscate.setHorizontalAlignment(SwingConstants.CENTER);
		lblKhaletMackelEscate.setFont(new Font("Yu Gothic", Font.PLAIN, 11));
		lblKhaletMackelEscate.setBounds(86, 205, 246, 14);
		getContentPane().add(lblKhaletMackelEscate);
		
		JLabel lblAutores = new JLabel("Autores");
		lblAutores.setHorizontalAlignment(SwingConstants.CENTER);
		lblAutores.setFont(new Font("Verdana", Font.BOLD, 15));
		lblAutores.setBounds(118, 93, 190, 14);
		getContentPane().add(lblAutores);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}

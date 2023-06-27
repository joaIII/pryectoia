package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DlgConfigurarCuotadiaria extends JDialog implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel lblCuotaDiaria;

	private JTextField txtCantidad;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgConfigurarCuotadiaria dialog = new DlgConfigurarCuotadiaria();
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
	public DlgConfigurarCuotadiaria() {
		setResizable(false);
		setTitle("Configurar cantidad \u00F3ptima");
		setBounds(100, 100, 500, 120);
		getContentPane().setLayout(null);
		
		lblCuotaDiaria = new JLabel("Cuota diaria esperada (S/.)");
		lblCuotaDiaria.setForeground(Color.BLACK);
		lblCuotaDiaria.setBounds(20, 20, 250, 23);
		getContentPane().add(lblCuotaDiaria);
		
		txtCantidad = new JTextField(Proyecto.cuotaDiaria + "");
		txtCantidad.setBounds(250, 20, 89, 23);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(390, 20, 90, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(390, 50, 90, 23);
		getContentPane().add(btnCancelar);
		

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
	    String cantidad = txtCantidad.getText();
	    if (cantidad.matches("\\d+")) {
	        Proyecto.cuotaDiaria = Integer.parseInt(cantidad);
	        dispose();
	    } else {
	        // Handle the case where the input is not a valid integer
	    }
	}

	protected void actionPerformedBtnCancelar(ActionEvent e) {
	    dispose();
	}

	
}

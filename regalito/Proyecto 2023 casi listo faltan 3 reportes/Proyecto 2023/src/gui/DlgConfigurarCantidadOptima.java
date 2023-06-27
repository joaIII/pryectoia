package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DlgConfigurarCantidadOptima extends JDialog implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel lblCantidadOptima;
	private JLabel lblImgDialogo;
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
					DlgConfigurarCantidadOptima dialog = new DlgConfigurarCantidadOptima();
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
	public DlgConfigurarCantidadOptima() {
		setResizable(false);
		setTitle("Configurar cantidad \u00F3ptima");
		setBounds(100, 100, 500, 120);
		getContentPane().setLayout(null);
		
		lblCantidadOptima = new JLabel("Cantidad \u00F3ptima de unidades vendidas");
		lblCantidadOptima.setForeground(Color.BLACK);
		lblCantidadOptima.setBounds(20, 20, 250, 23);
		getContentPane().add(lblCantidadOptima);
		
		txtCantidad = new JTextField(Proyecto.cantidadOptima + "");
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
		
		lblImgDialogo = new JLabel();
		lblImgDialogo.setBounds(0, 0, 500, 120);
		lblImgDialogo.setIcon(new ImageIcon("imagenes/dialogo.png"));
		getContentPane().add(lblImgDialogo);
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
	        Proyecto.cantidadOptima = Integer.parseInt(cantidad);
	        dispose();
	    } else {
	        // Handle the case where the input is not a valid integer
	    }
	}

	protected void actionPerformedBtnCancelar(ActionEvent e) {
	    dispose();
	}

	
}

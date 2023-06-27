package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class DlgConsultarCeramico extends JDialog implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblLargo;
	private JLabel lblEspesor;
	private JComboBox <String> cboModelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtLargo;
	private JTextField txtEspesor;
	private JTextField txtContenido;
	private JButton btnCerrar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgConsultarCeramico dialog = new DlgConsultarCeramico();
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
	public DlgConsultarCeramico() {
		setResizable(false);
		setTitle("Consultar Cer\u00E1mico");
		setBounds(100, 100, 537, 275);
		getContentPane().setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblModelo.setForeground(Color.BLACK);
		lblModelo.setBounds(20, 20, 80, 23);
		getContentPane().add(lblModelo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPrecio.setForeground(Color.BLACK);
		lblPrecio.setBounds(20, 48, 80, 23);
		getContentPane().add(lblPrecio);
		
		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAncho.setForeground(Color.BLACK);
		lblAncho.setBounds(20, 80, 80, 23);
		getContentPane().add(lblAncho);
		
		lblLargo = new JLabel("Largo (cm)");
		lblLargo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLargo.setForeground(Color.BLACK);
		lblLargo.setBounds(20, 110, 80, 23);
		getContentPane().add(lblLargo);
		
		lblEspesor = new JLabel("Espesor (cm)");
		lblEspesor.setFont(new Font("Arial", Font.PLAIN, 11));
		lblEspesor.setForeground(Color.BLACK);
		lblEspesor.setBounds(20, 140, 80, 23);
		getContentPane().add(lblEspesor);
		
		cboModelo = new JComboBox <String> ();
		cboModelo.setFont(new Font("Arial", Font.PLAIN, 11));
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel<String>
				(new String[] {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thal\u00EDa"}));
		cboModelo.setBounds(186, 20, 180, 23);
		getContentPane().add(cboModelo);

		txtPrecio = new JTextField(Proyecto.precio0 + "");
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(186, 48, 180, 23);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField(Proyecto.ancho0 + "");
		txtAncho.setEditable(false);
		txtAncho.setBounds(186, 80, 180, 23);
		getContentPane().add(txtAncho);
		txtAncho.setColumns(10);
		
		txtLargo = new JTextField(Proyecto.largo0 + "");
		txtLargo.setEditable(false);
		txtLargo.setBounds(186, 110, 180, 23);
		getContentPane().add(txtLargo);
		txtLargo.setColumns(10);
		
		txtEspesor = new JTextField(Proyecto.espesor0 + "");
		txtEspesor.setEditable(false);
		txtEspesor.setBounds(186, 140, 180, 23);
		getContentPane().add(txtEspesor);
		txtEspesor.setColumns(10);

		txtContenido = new JTextField(Proyecto.contenido0 + "");
		txtContenido.setEditable(false);
		txtContenido.setBounds(186, 170, 180, 23);
		getContentPane().add(txtContenido);
		txtContenido.setColumns(10);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(396, 20, 100, 23);
		getContentPane().add(btnCerrar);
		
		JLabel lblNewLabel = new JLabel("Contenido (uni)");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel.setBounds(20, 174, 141, 14);
		getContentPane().add(lblNewLabel);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboCodigo(e);
		}
	}
	protected void actionPerformedCboCodigo(ActionEvent e) {
		switch (cboModelo.getSelectedIndex()) {
			case 0:
				txtPrecio.setText(Proyecto.precio0 + "");
				txtAncho.setText(Proyecto.ancho0 + "");
				txtLargo.setText(Proyecto.largo0 + "");
				txtEspesor.setText(Proyecto.espesor0 + "");
				txtContenido.setText(Proyecto.contenido0 + "");
				break;
			case 1:
				txtPrecio.setText(Proyecto.precio1 + "");
				txtAncho.setText(Proyecto.ancho1 + "");
				txtLargo.setText(Proyecto.largo1 + "");
				txtEspesor.setText(Proyecto.espesor1 + "");
				txtContenido.setText(Proyecto.contenido1 + "");
				break;
			case 2:
				txtPrecio.setText(Proyecto.precio2 + "");
				txtAncho.setText(Proyecto.ancho2 + "");
				txtLargo.setText(Proyecto.largo2 + "");
				txtEspesor.setText(Proyecto.espesor2 + "");
				txtContenido.setText(Proyecto.contenido2 + "");
				break;
			case 3:
				txtPrecio.setText(Proyecto.precio3 + "");
				txtAncho.setText(Proyecto.ancho3 + "");
				txtLargo.setText(Proyecto.largo3 + "");
				txtEspesor.setText(Proyecto.espesor3 + "");
				txtContenido.setText(Proyecto.contenido3 + "");
				break;
			default:
				txtPrecio.setText(Proyecto.precio4 + "");
				txtAncho.setText(Proyecto.ancho4 + "");
				txtLargo.setText(Proyecto.largo4 + "");
				txtEspesor.setText(Proyecto.espesor4 + "");
				txtContenido.setText(Proyecto.contenido4 + "");
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}

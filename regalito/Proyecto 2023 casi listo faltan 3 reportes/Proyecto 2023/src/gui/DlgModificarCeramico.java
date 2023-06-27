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

public class DlgModificarCeramico extends JDialog implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel lblCodigo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblLargo;
	private JLabel lblEspesor;
	private JLabel lblContenido;
	private JComboBox <String> cboModelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtLargo;
	private JTextField txtEspesor;
	private JTextField txtContenido;
	private JButton btnGrabar;
	private JButton btnCerrar;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgModificarCeramico dialog = new DlgModificarCeramico();
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
	public DlgModificarCeramico() {
		setResizable(false);
		setTitle("Modificar Ceramico");
		setBounds(100, 100, 560, 282);
		getContentPane().setLayout(null);
		
		lblCodigo = new JLabel("Modelo");
		lblCodigo.setForeground(Color.BLACK);
		lblCodigo.setBounds(20, 20, 80, 23);
		getContentPane().add(lblCodigo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(20, 50, 80, 23);
		getContentPane().add(lblPrecio);
		
		lblAncho = new JLabel("Ancho (cm)");

		lblAncho.setBounds(20, 84, 80, 23);
		getContentPane().add(lblAncho);
		
		lblLargo = new JLabel("Largo (cm)");
		lblLargo.setBounds(20, 120, 80, 23);
		getContentPane().add(lblLargo);
		
		lblEspesor = new JLabel("Espesor (cm)");
		lblEspesor.setForeground(Color.BLACK);
		lblEspesor.setBounds(20, 154, 80, 23);
		getContentPane().add(lblEspesor);
		
		lblContenido = new JLabel("Contenido (uni)");
		lblContenido.setBounds(20, 188, 80, 14);
		getContentPane().add(lblContenido);
		
		cboModelo = new JComboBox <String> ();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel <String>
		                  (new String[] {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thalía"}));
		cboModelo.setBounds(170, 20, 180, 23);
		getContentPane().add(cboModelo);

		txtPrecio = new JTextField(Proyecto.precio0 + "");
		txtPrecio.setBounds(170, 50, 180, 23);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField(Proyecto.ancho0 + "");
		txtAncho.setBounds(170, 84, 180, 23);
		getContentPane().add(txtAncho);
		txtAncho.setColumns(10);
		
		txtLargo = new JTextField(Proyecto.largo0 + "");
		txtLargo.setBounds(170, 120, 180, 23);
		getContentPane().add(txtLargo);
		txtLargo.setColumns(10);
		
		txtEspesor = new JTextField(Proyecto.espesor0 + "");
		txtEspesor.setBounds(170, 154, 180, 23);
		getContentPane().add(txtEspesor);
		txtEspesor.setColumns(10);
		
		txtContenido = new JTextField(Proyecto.contenido0 +"");
		txtContenido.setBounds(170, 188, 180, 20);
		getContentPane().add(txtContenido);
		txtContenido.setColumns(10);

		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(415, 20, 100, 23);
		getContentPane().add(btnGrabar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(415, 50, 100, 23);
		getContentPane().add(btnCerrar);
		

		
		
	}
	public void actionPerformed(ActionEvent arg0) {
	
		if (arg0.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(arg0);
		}
		if (arg0.getSource() == cboModelo) {
			actionPerformedCboModelo(arg0);
		}
	}
	protected void actionPerformedCboModelo(ActionEvent arg0) {
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
		}}
	
	protected void actionPerformedBtnCerrar() {
		dispose();
	}

	protected void actionPerformedBtnGrabar(ActionEvent arg0) {
	
		String modelo = cboModelo.getSelectedItem().toString();
	
		    double precio;
		    precio = Double.parseDouble(txtPrecio.getText());
		    double ancho = Double.parseDouble(txtAncho.getText());
		    double largo = Double.parseDouble(txtLargo.getText());
		    double espesor = Double.parseDouble(txtEspesor.getText());
		    int contenido = Integer.parseInt(txtContenido.getText());

		    int selectedIndex = cboModelo.getSelectedIndex();
		    if (selectedIndex >= 0 && selectedIndex <= 4) {
		        switch (selectedIndex) {
		            case 0:
		                Proyecto.modelo0 = modelo;
		                Proyecto.precio0 = precio;
		                Proyecto.ancho0 = ancho;
		                Proyecto.largo0 = largo;
		                Proyecto.espesor0 = espesor;
		                Proyecto.contenido0 = contenido;
		                break;
		            case 1:
		                Proyecto.modelo1 = modelo;
		                Proyecto.precio1 = precio;
		                Proyecto.ancho1 = ancho;
		                Proyecto.largo1 = largo;
		                Proyecto.espesor1 = espesor;
		                Proyecto.contenido0 = contenido;
		                break;
		            case 2:
		                Proyecto.modelo2 = modelo;
		                Proyecto.precio2 = precio;
		                Proyecto.ancho2 = ancho;
		                Proyecto.largo2 = largo;
		                Proyecto.espesor2 = espesor;
		                Proyecto.contenido0 = contenido;
		                break;
		            case 3:
		                Proyecto.modelo3 = modelo;
		                Proyecto.precio3 = precio;
		                Proyecto.ancho3 = ancho;
		                Proyecto.largo3 = largo;
		                Proyecto.espesor3 = espesor;
		                Proyecto.contenido0 = contenido;
		                break;
		            default:
		                Proyecto.modelo4 = modelo;
		                Proyecto.precio4 = precio;
		                Proyecto.ancho4 = ancho;
		                Proyecto.largo4 = largo;
		                Proyecto.espesor4 = espesor;
		                Proyecto.contenido0 = contenido;
		        }}
		    }
			
		    }

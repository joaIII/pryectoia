package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DlgConfigurarObsequio extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JLabel lblCantidad;
	private JLabel lblObsequio;
	private JTextField txtTipoObsequio;
	private JTextField txtcant1;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JTextField txtcant2;
	private JTextField txtcant3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgConfigurarObsequio dialog = new DlgConfigurarObsequio();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DlgConfigurarObsequio() {
		setResizable(false);
		setTitle("Configurar obsequios");
		setBounds(100, 100, 486, 203);
		getContentPane().setLayout(null);

		lblCantidad = new JLabel("Tipo de obsequio");
		lblCantidad.setForeground(Color.BLACK);
		lblCantidad.setBounds(10, 20, 161, 23);
		getContentPane().add(lblCantidad);

		lblObsequio = new JLabel("1 a 5 unidades");
		lblObsequio.setForeground(Color.BLACK);
		lblObsequio.setBounds(10, 50, 161, 23);
		getContentPane().add(lblObsequio);

		txtTipoObsequio = new JTextField("");
		txtTipoObsequio.setBounds(181, 20, 86, 23);
		getContentPane().add(txtTipoObsequio);
		txtTipoObsequio.setColumns(10);

		txtcant1 = new JTextField("");
		txtcant1.setBounds(181, 50, 86, 23);
		getContentPane().add(txtcant1);
		txtcant1.setColumns(10);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(360, 20, 90, 23);
		getContentPane().add(btnAceptar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(360, 50, 90, 23);
		getContentPane().add(btnCancelar);

		JLabel lblNewLabel = new JLabel("6 a 10 unidades");
		lblNewLabel.setBounds(10, 84, 123, 14);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("11 a m\u00E1s unidades");
		lblNewLabel_1.setBounds(10, 112, 150, 14);
		getContentPane().add(lblNewLabel_1);

		txtcant2 = new JTextField();
		txtcant2.setBounds(181, 81, 86, 20);
		getContentPane().add(txtcant2);
		txtcant2.setColumns(10);

		txtcant3 = new JTextField();
		txtcant3.setBounds(181, 109, 86, 20);
		getContentPane().add(txtcant3);
		txtcant3.setColumns(10);

		txtTipoObsequio.setText(Proyecto.obsequio + "");
		txtcant1.setText(Proyecto.obsequioCantidad1 + "");
		txtcant2.setText(Proyecto.obsequioCantidad2 + "");
		txtcant3.setText(Proyecto.obsequioCantidad3 + "");

	}

	protected void actionPerformedBtnAceptar(ActionEvent e) {

		String obsequio = null;
		int cant1 = 0;
		int cant2 = 0;
		int cant3 = 0;

		Proyecto.obsequio = obsequio;
		Proyecto.obsequioCantidad1 = cant1;
		Proyecto.obsequioCantidad2 = cant2;
		Proyecto.obsequioCantidad3 = cant3;

		dispose();
	}

	protected void actionPerformedBtnCancelar() {
		dispose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
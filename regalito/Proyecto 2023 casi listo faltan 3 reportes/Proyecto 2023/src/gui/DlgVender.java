package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

import gui.DlgVender.Tienda;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;


public class DlgVender extends JDialog implements ActionListener, Runnable {
	
	public interface Tienda {

		int numeroVentas = 0;

	}



	private static final long serialVersionUID = 1L;
	
	private JLabel lblCantidad;
	private JLabel lblCodigo;
	private JLabel lblPrecio;
	private JTextField txtCantidad;
	private JTextField txtPrecio;
	private JComboBox <String> cboModel;
	private JButton btnVender;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	private double imp_p;
	
	public static int numeroCliente = 0,
	          
			          cantidadVentasCeramicos0 = 0,
	                  cantidadVentasCeramicos1 = 0,
	                  cantidadVentasCeramicos2 = 0,
	                  cantidadVentasCeramicos3 = 0,
	                  cantidadVentasCeramicos4 = 0,
	          
	                  ceramicosVendidos0 = 0,
	                  ceramicosVendidos1 = 0,
	                  ceramicosVendidos2 = 0,
	                  ceramicosVendidos3 = 0,
	                  ceramicosVendidos4 = 0;
                      
	public static double impAcumuladoCeramicos0 = 0.0,
	                     impAcumuladoCeramicos1 = 0.0,
	                     impAcumuladoCeramicos2 = 0.0,
	                     impAcumuladoCeramicos3 = 0.0,
	                     impAcumuladoCeramicos4 = 0.0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgVender dialog = new DlgVender();
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
	public DlgVender() {
		setResizable(false);
		setTitle("Ventas | Vender");
		setBounds(100, 100, 570, 450);
		getContentPane().setLayout(null);
	
		lblCantidad = new JLabel("Cantidad de Cer\u00E1micos");
		lblCantidad.setForeground(Color.BLACK);
		lblCantidad.setBounds(10, 10, 216, 23);
		getContentPane().add(lblCantidad);
		
		lblCodigo = new JLabel("C\u00F3digo de la Cer\u00E1mico");
		lblCodigo.setForeground(Color.BLACK);
		lblCodigo.setBounds(10, 40, 236, 23);
		getContentPane().add(lblCodigo);
		
		lblPrecio = new JLabel("Precio unitario (S/)");
		lblPrecio.setForeground(Color.BLACK);
		lblPrecio.setBounds(10, 70, 120, 23);
		getContentPane().add(lblPrecio);
		
		txtCantidad = new JTextField();
		txtCantidad.addActionListener(this);
		txtCantidad.setBackground(Color.WHITE);
		txtCantidad.setBounds(270, 10, 137, 23);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);
		
		cboModel = new JComboBox <String> ();
		cboModel.addActionListener(this);
		cboModel.setModel(new DefaultComboBoxModel<String>(new String[] {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thal\u00EDa"}));
		cboModel.setBounds(270, 40, 137, 23);
		getContentPane().add(cboModel);
	
		txtPrecio = new JTextField(Proyecto.precio0 + "");
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(270, 70, 137, 23);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);

		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBounds(460, 10, 90, 23);
		getContentPane().add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(460, 35, 90, 23);
		getContentPane().add(btnCerrar);
	
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 130, 540, 280);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);
		
	}	

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
		
		if (arg0.getSource() == cboModel) {
			actionPerformedCboCodigo(arg0);
		}
		if (arg0.getSource() == txtCantidad  ||  arg0.getSource() == btnVender) {
			actionPerformedBtnVender(arg0);
		}
	}
	protected void actionPerformedBtnVender(ActionEvent arg0) {
		try {
			//Declaración de variables e ingreso de datos 
			int cantidad = Integer.parseInt(txtCantidad.getText());
			double precio = Double.parseDouble(txtPrecio.getText()),
				   importeCompra, descuento;
			String modelo, obsequio; 

			numeroCliente ++;
			
			//Modelo
			switch (cboModel.getSelectedIndex()) {
				case 0:
					modelo = Proyecto.modelo0;
					break;
				case 1:
					modelo = Proyecto.modelo1;
					break;
				case 2:
					modelo = Proyecto.modelo2;
					break;
				case 3:
					modelo = Proyecto.modelo3;
					break;
				default: 
					modelo = Proyecto.modelo4;
			}
			
			//Calculo del importe de compra
			importeCompra = precio * cantidad;
				
			//Calculo del importe de descuento
			if (cantidad <= 3)
				descuento = Proyecto.porcentaje1/100 * importeCompra;
			else
				if (cantidad <= 5)
					descuento = Proyecto.porcentaje2/100 * importeCompra;
				else
					if (cantidad <= 8)
						descuento = Proyecto.porcentaje3/100 * importeCompra;
					else
						descuento = Proyecto.porcentaje4/100 * importeCompra;
				
			//Calculo importe a pagar 
			imp_p = importeCompra - descuento;
			
			
			//Verificar si tiene obsequio				
			if (cantidad >= Proyecto.cuotaDiaria)
				obsequio = Proyecto.obsequio;	
			else
				obsequio = "No tiene";
			
			
			Proyecto.numeroVentas ++;
			Proyecto.imptotgen+=imp_p;
			
			double pocudi=(Proyecto.imptotgen*100)/Proyecto.cuotaDiaria;
			
			if(Proyecto.numeroVentas % 5 == 0  && Proyecto.numeroVentas> 0) 
			{JOptionPane.showMessageDialog(this, "Venta Nro. " + Proyecto.numeroVentas + "\n" + "Importe total general acumulado : S/" +String.format("%.2f", Proyecto.imptotgen) + 
			"\n" + "Porcentaje de la cuota diaria : " + String.format("%.2f", pocudi) + "%", "Avance de ventas", JOptionPane.INFORMATION_MESSAGE);
				}
			
			
						
				
			//Impresión de boleta			
			txtS.setText("");	
			txtS.append("BOLETA DE VENTA"+"\n");
			txtS.append("\n");
			txtS.append("Modelo del producto  	:  " + modelo+"\n");
			txtS.append("Cantidad de ceramicos	:  " + cantidad+"\n");
			txtS.append("Precio unitario      	:  S/" + precio+"\n");
			txtS.append("Importe de la compra 	:  S/" +String.format("%.2f", importeCompra)+"\n");
			txtS.append("Descuento            	:  S/" +String.format("%.2f", descuento)+"\n");		
			txtS.append("Importe a Pagar      	:  S/" +String.format("%.2f",imp_p)+"\n");
			txtS.append("Obsequio             	:  " + obsequio+"\n");

			
			//Contadores: número de ventas,unidades vendidas e importe total
			switch (cboModel.getSelectedIndex()) {
				case 0:
					cantidadVentasCeramicos0 ++;
					ceramicosVendidos0 += cantidad;
					impAcumuladoCeramicos0 += imp_p;
					break;
				case 1:
					cantidadVentasCeramicos1 ++;
					ceramicosVendidos1 += cantidad;
					impAcumuladoCeramicos1 += imp_p;
					break;
				case 2:
					cantidadVentasCeramicos2 ++;
					ceramicosVendidos2 += cantidad;
					impAcumuladoCeramicos2 += imp_p;
					break;
				case 3:
					cantidadVentasCeramicos3 ++;
					ceramicosVendidos3 += cantidad;
					impAcumuladoCeramicos3 += imp_p;
					break;
				default:
					cantidadVentasCeramicos4 ++;
					ceramicosVendidos4 += cantidad;
			        impAcumuladoCeramicos4 += imp_p;
			}}
		finally{}
	}
	
	
	//Imprimir precio	
	protected void actionPerformedCboCodigo(ActionEvent arg0) {
		int pos = cboModel.getSelectedIndex();
		switch (pos) {
			case 0:
				txtPrecio.setText(Proyecto.precio0 + "");
				break;
			case 1:
				txtPrecio.setText(Proyecto.precio1 + "");
				break;
			case 2:
				txtPrecio.setText(Proyecto.precio2 + "");
				break;
			case 3:
				txtPrecio.setText(Proyecto.precio3 + "");
				break;
			default:
				txtPrecio.setText(Proyecto.precio4 + "");
		}
		txtS.setText("");
		txtCantidad.setText("");
		txtCantidad.requestFocus();
	}
			
	
			
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}

	

	@Override
	public void run() {
		
	}
	
	}

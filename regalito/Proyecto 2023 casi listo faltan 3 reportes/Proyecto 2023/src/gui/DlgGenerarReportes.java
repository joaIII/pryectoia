package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class DlgGenerarReportes extends JDialog implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel lblTipoReporte;
	private JComboBox <String> cboTipoReporte;
	private JButton btnCerrar;
	private JScrollPane scrPanel;
	private JTextArea txtS;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgGenerarReportes dialog = new DlgGenerarReportes();
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
	public DlgGenerarReportes() {
		setResizable(false);
		setTitle("Generar reportes");
		setBounds(100, 100, 587, 389);
		getContentPane().setLayout(null);
		
		lblTipoReporte = new JLabel("Tipo de Reporte");
		lblTipoReporte.setForeground(Color.BLACK);
		lblTipoReporte.setBounds(10, 20, 100, 23);
		getContentPane().add(lblTipoReporte);
		
		cboTipoReporte = new JComboBox<String>();
		cboTipoReporte.addActionListener(this);
		cboTipoReporte.setModel(new DefaultComboBoxModel<String>(new String[] {"Ventas por Ceramico", "Comparaci\u00F3n de precios con el precio promedio", "Comparaci\u00F3n de cajas vendidas con la cantidad \u00F3ptima", "Estad\u00EDsticas sobre el precio"}));
		cboTipoReporte.setBounds(120, 20, 315, 23);
		getContentPane().add(cboTipoReporte);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(471, 20, 100, 23);
		getContentPane().add(btnCerrar);
		
		scrPanel = new JScrollPane();
		scrPanel.setBounds(10, 50, 561, 299);
		getContentPane().add(scrPanel);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrPanel.setViewportView(txtS);
		
	
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
		if (arg0.getSource() == cboTipoReporte) {
			actionPerformedCboTipoReporte(arg0);
		}
	}
	
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
	
	protected void actionPerformedCboTipoReporte(ActionEvent arg0) {
		txtS.setText("");
		switch (cboTipoReporte.getSelectedIndex()) {
			case 0:
				ventasPorModelo();
				break;
			case 1:
				comparaciondePreciosconelPrecioPromedio();
				break;
			case 2:
				comparaciondeCajasVendidasconlacantidadOptima();
				break;
			default:
				estadisticaSobreelPrecio();
		}
	}

	//  M�todos tipo void (sin par�metros)
	void ventasPorModelo() {

		txtS.setText("VENTAS POR MODELO\n");
		txtS.append("\n");
		txtS.append("Modelo :  " + Proyecto.modelo0+"\n");
		txtS.append("Cantidad de ventas :  " + DlgVender.cantidadVentasCeramicos0+"\n");
		txtS.append("Cantidad de cajas vendidas :  " + DlgVender.ceramicosVendidos0+"\n");
		txtS.append("Importe total vendido :  S/" + String.format("%.2f", DlgVender.impAcumuladoCeramicos0)+"\n");
		txtS.append("Aporte a la cuota diaria :" + String.format("%.2f", (DlgVender.impAcumuladoCeramicos0*100/Proyecto.cuotaDiaria))+"% \n");
		txtS.append("\n");
		
		txtS.append("Modelo :  " + Proyecto.modelo0+"\n");
		txtS.append("Cantidad de ventas :  " + DlgVender.cantidadVentasCeramicos1+"\n");
		txtS.append("Cantidad de cajas vendidas :  " + DlgVender.ceramicosVendidos1+"\n");
		txtS.append("Importe total vendido :  S/" + String.format("%.2f",DlgVender.impAcumuladoCeramicos1)+"\n");
		txtS.append("Aporte a la cuota diaria :" + String.format("%.2f",(DlgVender.impAcumuladoCeramicos1*100/Proyecto.cuotaDiaria))+"\n");
		
		txtS.append("\n");
		txtS.append("Modelo :  " + Proyecto.modelo0+"\n");
		txtS.append("Cantidad de ventas :  " + DlgVender.cantidadVentasCeramicos2+"\n");
		txtS.append("Cantidad de cajas vendidas :  " + DlgVender.ceramicosVendidos2+"\n");
		txtS.append("Importe total vendido :  S/" + String.format("%.2f",DlgVender.impAcumuladoCeramicos2)+"\n");
		txtS.append("Aporte a la cuota diaria :  " + String.format("%.2f",(DlgVender.impAcumuladoCeramicos2*100/Proyecto.cuotaDiaria))+"\n");
	
		txtS.append("\n");
		txtS.append("Modelo :  " + Proyecto.modelo0+"\n");
		txtS.append("Cantidad de ventas :  " + DlgVender.cantidadVentasCeramicos3+"\n");
		txtS.append("Cantidad de cajas vendidas :  " + DlgVender.ceramicosVendidos3+"\n");
		txtS.append("Importe total vendido :  S/" + String.format("%.2f",DlgVender.impAcumuladoCeramicos3)+"\n");
		txtS.append("Aporte a la cuota diaria :  " + String.format("%.2f",(DlgVender.impAcumuladoCeramicos3*100/Proyecto.cuotaDiaria))+"\n");
		
		txtS.append("\n");
		txtS.append("Modelo :  " + Proyecto.modelo0+"\n");
		txtS.append("Cantidad de ventas :  " + DlgVender.cantidadVentasCeramicos4+"\n");
		txtS.append("Cantidad de cajas vendidas :  " + DlgVender.ceramicosVendidos4+"\n");
		txtS.append("Importe total vendido :  S/" + String.format("%.2f",DlgVender.impAcumuladoCeramicos4)+"\n");
		txtS.append("Aporte a la cuota diaria : " + String.format("%.2f",(DlgVender.impAcumuladoCeramicos4*100/Proyecto.cuotaDiaria))+"\n");
		txtS.append("\n");
	}

	void comparaciondePreciosconelPrecioPromedio() {
		double precioPromedio =(Proyecto.precio0+Proyecto.precio1+Proyecto.precio2+Proyecto.precio3+Proyecto.precio4)/5;
		String comp0;
		double alt0;
		
		
		String comp1;
		double alt1;
		
		
		String comp2;
		double alt2;
		
		String comp3;
		double alt3;	
		
		String comp4;
		double alt4;
	
		
		if (Proyecto.precio0>precioPromedio) {
			alt0= Proyecto.precio0 -	precioPromedio; }
		
		else {alt0= precioPromedio -Proyecto.precio0;}
			
		
		if (Proyecto.precio0 == precioPromedio) {
			comp0= String.format("%.2f",alt0)+ " igual que el precio promedio";
		}
		else if (Proyecto.precio0  < precioPromedio) {
			comp0 = String.format("%.2f",alt0)+ " menos que el precio promedio";
		}
		
		else  {	comp0= String.format("%.2f", alt0) + " más que el precio promedio";
		}
		


		
		if (Proyecto.precio1>precioPromedio) {
			alt1= Proyecto.precio1 -	precioPromedio; }
		
		else {alt1= precioPromedio - Proyecto.precio1;}
			
		
		if (Proyecto.precio1 == precioPromedio) {
			comp1= String.format("%.2f",alt1)+ " igual que el precio promedio";
		}
		else if (Proyecto.precio1  < precioPromedio) {
			comp1 = String.format("%.2f",alt1) + " menos que el precio promedio";
		}
		
		else  {	comp1= String.format("%.2f", alt1) + " más que el precio promedio";
		}
		
		
		
		
		if (Proyecto.precio2>precioPromedio) {
			alt2= Proyecto.precio2 -	precioPromedio; }
		
		else {alt2= precioPromedio - Proyecto.precio2;}
			
		
		if (Proyecto.precio2 == precioPromedio) {
			comp2=String.format("%.2f", alt2)+ " igual que el precio promedio";
		}
		else if (Proyecto.precio2  < precioPromedio) {
			comp2 =String.format("%.2f",alt2)+ " menos que el precio promedio";
		}
		
		else  {	comp2= String.format("%.2f",alt2) + " más que el precio promedio";
		}
		
		
		
		
		if (Proyecto.precio3>precioPromedio) {
			alt3= Proyecto.precio3 -	precioPromedio; }
		
		else {alt3= precioPromedio - Proyecto.precio3;}
			
		
		if (Proyecto.precio3 == precioPromedio) {
			comp3=String.format("%.2f",alt3)+ " igual que el precio promedio";
		}
		else if (Proyecto.precio3  < precioPromedio) {
			comp3 =String.format("%.2f",alt3)+ " menos que el precio promedio";
		}
		
		else  {	comp3= String.format("%.2f", alt3) + " más que el precio promedio";
		}
		


		
		if (Proyecto.precio4>precioPromedio) {
			alt4= Proyecto.precio4 -	precioPromedio; }
		
		else {alt4= precioPromedio - Proyecto.precio4;}
			
		
		if (Proyecto.precio4 == precioPromedio) {
			comp4=String.format("%.2f",alt4)+ " igual que el precio promedio";
		}
		else if (Proyecto.precio3  < precioPromedio) {
			comp4 = String.format("%.2f",alt4)+ " menos que el precio promedio";
		}
		
		else  {	comp4= String.format("%.2f",alt4) + " más que el precio promedio";
		}
		
		
		
		
		txtS.setText("COMPARACION DE PRECIOS CON EL PRECIO PROMEDIO\n");
		txtS.append("\n");
		txtS.append("Modelo 			: " + Proyecto.modelo0+"\n");
		txtS.append("Precio 			: S/   " + Proyecto.precio0+"\n");
		txtS.append("Precio promedio 	: S/   " + String.format("%.2f",  precioPromedio) +"\n");
		txtS.append("Comparación 		: S/   " + comp0+"\n");
		txtS.append("\n");
		
		txtS.append("Modelo 			: " + Proyecto.modelo1+"\n");
		txtS.append("Precio 			: S/	" + Proyecto.precio1+"\n");
		txtS.append("Precio promedio 	: S/	" + String.format("%.2f", precioPromedio) +"\n");
		txtS.append("Comparación 		: S/	" + comp1+"\n");
		txtS.append("\n");
		
		txtS.append("Modelo 			: " + Proyecto.modelo2+"\n");
		txtS.append("Precio 			: S/  " + Proyecto.precio2+"\n");
		txtS.append("Precio promedio  	: S/  " + String.format("%.2f", precioPromedio) +"\n");
		txtS.append("Comparación 		: S/  " + comp2+"\n");
		txtS.append("\n");
		
		txtS.append("Modelo 			: " + Proyecto.modelo3+"\n");
		txtS.append("Precio 			: S/ " + Proyecto.precio3+"\n");
		txtS.append("Precio promedio 	: S/ " +String.format("%.2f", precioPromedio) +"\n");
		txtS.append("Comparación 		: S/ " + comp3+"\n");
		txtS.append("\n");
		
		txtS.append("Modelo 			: " + Proyecto.modelo4+"\n");
		txtS.append("Precio 			: S/ " + Proyecto.precio4+"\n");
		txtS.append("Precio promedio 	: S/ " +String.format("%.2f", precioPromedio) +"\n");
		txtS.append("Comparación		: S/ " + comp4+"\n");
		txtS.append("\n");

	}

	
	
	void comparaciondeCajasVendidasconlacantidadOptima() {
		
		
		double altcc0, altcc1, altcc2, altcc3 , altcc4 ;
		String compcc0, compcc1, compcc2, compcc3, compcc4;
		

						
		if (DlgVender.ceramicosVendidos0>Proyecto.cantidadOptima) {
			altcc0= DlgVender.ceramicosVendidos0 -	Proyecto.cantidadOptima; }
		
		else {altcc0= Proyecto.cantidadOptima -DlgVender.ceramicosVendidos0;}
			
		
		if (DlgVender.ceramicosVendidos0 == Proyecto.cantidadOptima) {
			compcc0= String.format("%.2f",altcc0)+ " igual que la cantidad óptima";
		}
		else if (DlgVender.ceramicosVendidos0  < Proyecto.cantidadOptima) {
			compcc0 = String.format("%.2f",altcc0)+ " menos que la cantidad óptima";
		}
		
		else  {	compcc0= String.format("%.2f", altcc0) + " más que la cantidad óptima";
		}
		
		
		
		
		if (DlgVender.ceramicosVendidos1>Proyecto.cantidadOptima) {
			altcc1= DlgVender.ceramicosVendidos1 -	Proyecto.cantidadOptima; }
		
		else {altcc1= Proyecto.cantidadOptima - DlgVender.ceramicosVendidos1;}
			
		
		if (DlgVender.ceramicosVendidos1 == Proyecto.cantidadOptima) {
			compcc1= String.format("%.2f",altcc1)+ " igual que la cantidad óptima";
		}
		else if (DlgVender.ceramicosVendidos1  < Proyecto.cantidadOptima) {
			compcc1 = String.format("%.2f",altcc1)+ " menos que la cantidad óptima";
		}
		
		else  {	compcc1= String.format("%.2f", altcc1) + " más que la cantidad óptima";
		}
		
		
		
		
		if (DlgVender.ceramicosVendidos2>Proyecto.cantidadOptima) {
			altcc2= DlgVender.ceramicosVendidos2 -	Proyecto.cantidadOptima; }
		
		else {altcc2= Proyecto.cantidadOptima -DlgVender.ceramicosVendidos2;}
			
		
		if (DlgVender.ceramicosVendidos2 == Proyecto.cantidadOptima) {
			compcc2= String.format("%.2f",altcc2)+ " igual que la cantidad óptima";
		}
		else if (DlgVender.ceramicosVendidos2  < Proyecto.cantidadOptima) {
			compcc2 = String.format("%.2f",altcc2)+ " menos que la cantidad óptim";
		}
		
		else  {	compcc2= String.format("%.2f", altcc2) + " más que la cantidad óptim";
		}
		
		
		
		
		if (DlgVender.ceramicosVendidos3>Proyecto.cantidadOptima) {
			altcc3= DlgVender.ceramicosVendidos3 -	Proyecto.cantidadOptima; }
		
		else {altcc3= Proyecto.cantidadOptima -DlgVender.ceramicosVendidos3;}
			
		
		if (DlgVender.ceramicosVendidos3 == Proyecto.cantidadOptima) {
			compcc3= String.format("%.2f",altcc3)+ " igual que la cantidad óptima";
		}
		else if (DlgVender.ceramicosVendidos3  < Proyecto.cantidadOptima) {
			compcc3 = String.format("%.2f",altcc3)+ " menos que la cantidad óptim";
		}
		
		else  {	compcc3= String.format("%.2f", altcc3) + " más que la cantidad óptim";
		}
		
		
		
		
		if (DlgVender.ceramicosVendidos4>Proyecto.cantidadOptima) {
			altcc4= DlgVender.ceramicosVendidos4 -	Proyecto.cantidadOptima; }
		
		else {altcc4= Proyecto.cantidadOptima -DlgVender.ceramicosVendidos4;}
			
		
		if (DlgVender.ceramicosVendidos4 == Proyecto.cantidadOptima) {
			compcc4= String.format("%.2f",altcc4)+ " igual que la cantidad óptima";
		}
		else if (DlgVender.ceramicosVendidos4  < Proyecto.cantidadOptima) {
			compcc4 = String.format("%.2f",altcc4)+ " menos que la cantidad óptim";
		}
		
		else  {	compcc4= String.format("%.2f", altcc4) + " más que la cantidad óptim";
		}
		
			
				
		
		
		txtS.setText("COMPARACION DE PRECIOS CON EL PRECIO PROMEDIO\n");
		txtS.append("\n");
		txtS.append("Modelo 				:   " + Proyecto.modelo0+"\n");
		txtS.append("Cantidad de cajas vendidas 	:   " + DlgVender.ceramicosVendidos0+"\n");
		txtS.append("Cantidad óptima			:   " + Proyecto.cantidadOptima+"\n");
		txtS.append("Comparación 			:   " + compcc0+"\n");
		txtS.append("\n");
		
		txtS.append("Modelo 				:   " + Proyecto.modelo1+"\n");
		txtS.append("Cantidad de cajas vendidas 	:   " + DlgVender.ceramicosVendidos1+"\n");
		txtS.append("Cantidad óptima			:   " + Proyecto.cantidadOptima+"\n");
		txtS.append("Comparación 			:   " + compcc1+"\n");
		txtS.append("\n");
		
		txtS.append("Modelo 				:   " + Proyecto.modelo2+"\n");
		txtS.append("Cantidad de cajas vendidas 	:   " + DlgVender.ceramicosVendidos2+"\n");
		txtS.append("Cantidad óptima			:   " + Proyecto.cantidadOptima+"\n");
		txtS.append("Comparación 			:   " + compcc2+"\n");
		txtS.append("\n");
		
		txtS.append("Modelo 				:   " + Proyecto.modelo3+"\n");
		txtS.append("Cantidad de cajas vendidas 	:   " + DlgVender.ceramicosVendidos3+"\n");
		txtS.append("Cantidad óptima			:   " + Proyecto.cantidadOptima+"\n");
		txtS.append("Comparación 			:   " + compcc3+"\n");
		txtS.append("\n");
		
		txtS.append("Modelo 				:   " + Proyecto.modelo4+"\n");
		txtS.append("Cantidad de cajas vendidas 	:   " + DlgVender.ceramicosVendidos4+"\n");
		txtS.append("Cantidad óptima			:   " + Proyecto.cantidadOptima+"\n");
		txtS.append("Comparación 			:   " + compcc4+"\n");
		txtS.append("\n");

	}
	
	
	
	
	
	void estadisticaSobreelPrecio(){
		double precprom;
		precprom= calcularPromedio();
		calcularMaximo(); 
		calcularMinimo();
		mostrarEstadisticaPrecio(precprom);
	
	}	
	//  M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	//  M�todos que retornan valor (con par�metros)
	double calcularPromedio(double a, double b, double c, double d, double e) {
		 return (a + b + c + d + e) / 5;
	}
	double calcularMinimo(double a, double b, double c, double d, double e) {
		double minimo = a;
		if (minimo > b)
			minimo = b;
		if (minimo > c)
			minimo = c;
		if (minimo > d)
			minimo = d;
		if (minimo > e)
			minimo = e;
		return minimo;
	}
	double calcularMaximo(double a, double b, double c, double d, double e) {
		double maximo = a;
		if (maximo < b)
			maximo = b;
		if (maximo < c)
			maximo = c;
		if (maximo < d)
			maximo = d;
		if (maximo < e)
			maximo = e;
		return maximo;
	

	}
	
void mostrarEstadisticaPrecio(double precprom) {
	txtS.setText("ESTAD�STICA SOBRE EL PRECIO" + "\n" + "\n");
	imprimir("Precio promedio : S/" + precprom);
	imprimir("Precio mayor    : S/" + );
	imprimir("Precio menor    : S/" + );
	
	
	
	void ceramicosConPreciosMenoresAlPrecioPromedio() {
		double precioPromedio = calcularPromedio(Proyecto.precio0, Proyecto.precio1, Proyecto.precio2, 
                                                 Proyecto.precio3, Proyecto.precio4);
		int cantidadCeramicosMenoresAlPrecioPromedio = 0;
		imprimir("CERAMICOS CON PRECIOS MENORES AL PRECIO PROMEDIO");
		imprimir("");
		if (Proyecto.precio0 < precioPromedio) {
			cantidadCeramicosMenoresAlPrecioPromedio ++;
		    imprimir("Modelo :  " + Proyecto.modelo0);
		    imprimir("Precio :  S/" + Proyecto.precio0);
		}
		if (Proyecto.precio1 < precioPromedio) {
			cantidadCeramicosMenoresAlPrecioPromedio ++;
		    imprimir("Modelo :  " + Proyecto.modelo1);
		    imprimir("Precio :  S/" + Proyecto.precio1);
		}
		if (Proyecto.precio2 < precioPromedio) {
			cantidadCeramicosMenoresAlPrecioPromedio ++;
		    imprimir("Modelo :  " + Proyecto.modelo2);
		    imprimir("Precio :  S/" + Proyecto.precio2);
		}
		if (Proyecto.precio3 < precioPromedio) {
			cantidadCeramicosMenoresAlPrecioPromedio ++;
		    imprimir("Modelo :  " + Proyecto.modelo3);
		    imprimir("Precio :  S/" + Proyecto.precio3);
		}
		if (Proyecto.precio4 < precioPromedio) {
			cantidadCeramicosMenoresAlPrecioPromedio ++;
		    imprimir("Modelo :  " + Proyecto.modelo4);
		    imprimir("Precio :  S/" + Proyecto.precio4);
		}
		if (cantidadCeramicosMenoresAlPrecioPromedio == 0)
			imprimir("*** No hay Cer micos con precios menores al precio promedio ***");
		else
			imprimir("Cantidad de Cer micos :  " + cantidadCeramicosMenoresAlPrecioPromedio);
	}
	void ceramicosConPreciosMayoresAlPrecioPromedio() {
		double precioPromedio = calcularPromedio(Proyecto.precio0, Proyecto.precio1, Proyecto.precio2, 
                                                 Proyecto.precio3, Proyecto.precio4);
		int cantidadCeramicosMayoresAlPrecioPromedio = 0;
		imprimir("CERAMICOS CON PRECIOS MAYORES AL PRECIO PROMEDIO");
		imprimir("");
		if (Proyecto.precio0 > precioPromedio) {
			cantidadCeramicosMayoresAlPrecioPromedio ++;
		    imprimir("Modelo :  " + Proyecto.modelo0);
		    imprimir("Precio :  S/" + Proyecto.precio0);
		}
		if (Proyecto.precio1 > precioPromedio) {
			cantidadCeramicosMayoresAlPrecioPromedio ++;
		    imprimir("Modelo :  " + Proyecto.modelo1);
		    imprimir("Precio :  S/" + Proyecto.precio1);
		}
		if (Proyecto.precio2 > precioPromedio) {
			cantidadCeramicosMayoresAlPrecioPromedio ++;
		    imprimir("Modelo :  " + Proyecto.modelo2);
		    imprimir("Precio :  S/" + Proyecto.precio2);
		}
		if (Proyecto.precio3 > precioPromedio) {
			cantidadCeramicosMayoresAlPrecioPromedio ++;
		    imprimir("Modelo :  " + Proyecto.modelo3);
		    imprimir("Precio :  S/" + Proyecto.precio3);
		}
		if (Proyecto.precio4 > precioPromedio) {
			cantidadCeramicosMayoresAlPrecioPromedio ++;
		    imprimir("Modelo :  " + Proyecto.modelo4);
		    imprimir("Precio :  S/" + Proyecto.precio4);
		}
		if (cantidadCeramicosMayoresAlPrecioPromedio == 0)
			imprimir("*** No hay ceramicos con precios mayores al precio promedio ***");
		else
			imprimir("Cantidad de ceramicos :  " + cantidadCeramicosMayoresAlPrecioPromedio);
	}
	
	
	
}
}
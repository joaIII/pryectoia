package gui;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class Proyecto extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JMenuBar menuTienda;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnConfiguracion;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsultarCeramico;
	private JMenuItem mntmModificarCeramico;
	private JMenuItem mntmListarCeramicos;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequio;
	private JMenuItem mntmConfigurarCantidadOptima;
	private JMenuItem mntmConfigurarCuotadiaria;
	private JMenuItem mntmAcercaDeLaTienda;
	
	//  Datos del primer modelo
	public static String codigo0 = "Ceramico0";
	public static String modelo0 = "Cinza Plus";
	public static double precio0 = 92.56;
	public static double ancho0 = 62.0;
	public static double largo0 = 62.0;
	public static double espesor0 = 8;
	public static int contenido0 = 6;

	//  Datos del segundo modelo
	public static String codigo1 = "Ceramico1";
	public static String modelo1 = "Luxury";
	public static double precio1 = 42.77;
	public static double ancho1 = 60;
	public static double largo1 = 60;
	public static double espesor1 = 8.5;
	public static int contenido1 = 4;
	
	//  Datos del tercer modelo
	public static String codigo2 = "Ceramico2";
	public static String modelo2 = "Austria";
	public static double precio2 = 52.45;
	public static double ancho2 = 45;
	public static double largo2 = 45;
	public static double espesor2 = 6.5;
	public static int contenido2 = 12;
	
	//  Datos del cuarto modelo
	public static String codigo3 = "Ceramico3";
	public static String modelo3 = "Yungay Mix";
	public static double precio3 = 55.89;
	public static double ancho3 = 80;
	public static double largo3 = 120.0;
	public static double espesor3 = 6.8;
	public static int contenido3 = 9;
	
	//  Datos del quinto modelo
	public static String codigo4 = "Ceramico4";
	public static String modelo4 = "Thalía";
	public static double precio4 = 45;
	public static double ancho4 = 45;
	public static double largo4 = 11.8;
	public static double espesor4 = 7.2;
	public static int contenido4 = 10;
	
	//  Porcentajes de descuento
	public static double porcentaje1 = 4.0;
	public static double porcentaje2 = 5.5;
	public static double porcentaje3 = 7.0;
	public static double porcentaje4 = 8.5;
	//  Cantidad �ptima de ceramicos vendidas
	public static int cantidadOptima = 10;
	//  Cuota Diaria
	public static int cuotaDiaria = 30000;
	//  Obsequio
	public static String obsequio = "Lapicero";
	public static int obsequioCantidad1 = 2;
	public static int obsequioCantidad2 = 3;
	public static int obsequioCantidad3 = 4;
			
		public static int numeroVentas;
		
		public static double imptotgen;
			
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proyecto frame = new Proyecto();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Proyecto() {
		setResizable(false);
		setTitle("Cer\u00E1micos 1.0.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		this.setIconImage(new ImageIcon("imagenes/PT.png").getImage());
		this.setLocationRelativeTo(null);
		
		menuTienda = new JMenuBar();
		menuTienda.setBackground(SystemColor.inactiveCaptionBorder);
		setJMenuBar(menuTienda);
		
		mnArchivo = new JMenu("Archivo");
		mnArchivo.setFont(new Font("Arial", Font.PLAIN, 12));
		mnArchivo.setForeground(Color.GRAY);
		menuTienda.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setFont(new Font("Arial", Font.PLAIN, 12));
		mnMantenimiento.setForeground(Color.GRAY);
		menuTienda.add(mnMantenimiento);
		
		mntmConsultarCeramico = new JMenuItem("Consultar Ceramico");
		mntmConsultarCeramico.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmConsultarCeramico.addActionListener(this);
		mnMantenimiento.add(mntmConsultarCeramico);
		
		mntmModificarCeramico = new JMenuItem("Modificar Ceramico");
		mntmModificarCeramico.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmModificarCeramico.addActionListener(this);
		mnMantenimiento.add(mntmModificarCeramico);
		
		mntmListarCeramicos = new JMenuItem("Listar Ceramico");
		mntmListarCeramicos.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmListarCeramicos.addActionListener(this);
		mnMantenimiento.add(mntmListarCeramicos);
		
		mnVentas = new JMenu("Ventas");
		mnVentas.setFont(new Font("Arial", Font.PLAIN, 12));
		mnVentas.setForeground(Color.GRAY);
		menuTienda.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar reportes");
		mntmGenerarReportes.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);
		
		mnConfiguracion = new JMenu("Configuraci\u00F3n");
		mnConfiguracion.setFont(new Font("Arial", Font.PLAIN, 12));
		mnConfiguracion.setForeground(Color.GRAY);
		menuTienda.add(mnConfiguracion);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
		mntmConfigurarDescuentos.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmConfigurarDescuentos.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequio = new JMenuItem("Configurar obsequio");
		mntmConfigurarObsequio.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmConfigurarObsequio.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarObsequio);
		
		mntmConfigurarCantidadOptima = new JMenuItem("Configurar cantidad \u00F3ptima");
		mntmConfigurarCantidadOptima.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmConfigurarCantidadOptima.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarCantidadOptima);
		
		mntmConfigurarCuotadiaria = new JMenuItem("Configurar cuota diaria");
		mntmConfigurarCuotadiaria.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmConfigurarCuotadiaria.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarCuotadiaria);
		
		mnAyuda = new JMenu("Ayuda");
		mnAyuda.setFont(new Font("Arial", Font.PLAIN, 12));
		mnAyuda.setForeground(Color.GRAY);
		menuTienda.add(mnAyuda);
		
		mntmAcercaDeLaTienda = new JMenuItem("Acerca de la Tienda");
		mntmAcercaDeLaTienda.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmAcercaDeLaTienda.addActionListener(this);
		mnAyuda.add(mntmAcercaDeLaTienda);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmAcercaDeLaTienda) {
			actionPerformedMntmAcercaDeLaTienda(arg0);
		}
		if (arg0.getSource() == mntmConfigurarCuotadiaria) {
			actionPerformedMntmConfigurarCuotadiaria(arg0);
		}
		if (arg0.getSource() == mntmConfigurarCantidadOptima) {
			actionPerformedMntmConfigurarCantidadOptima(arg0);
		}
		if (arg0.getSource() == mntmConfigurarObsequio) {
			actionPerformedMntmConfigurarObsequio(arg0);
		}
		if (arg0.getSource() == mntmConfigurarDescuentos) {
			actionPerformedMntmConfigurarDescuentos(arg0);
		}
		if (arg0.getSource() == mntmGenerarReportes) {
			actionPerformedMntmGenerarReportes(arg0);
		}
		if (arg0.getSource() == mntmVender) {
			actionPerformedMntmVender(arg0);
		}		
		if (arg0.getSource() == mntmListarCeramicos) {
			actionPerformedMntmListarCeramicos(arg0);
		}		
		if (arg0.getSource() == mntmModificarCeramico) {
			actionPerformedMntmModificarCeramico(arg0);
		}
		if (arg0.getSource() == mntmConsultarCeramico) {
			actionPerformedMntmConsultarCeramico(arg0);
		}
		if (arg0.getSource() == mntmSalir) {
			actionPerformedMntmSalir(arg0);
		}
	}
	protected void actionPerformedMntmSalir(ActionEvent arg0) {
		dispose();
	}
	protected void actionPerformedMntmConsultarCeramico(ActionEvent arg0) {
		DlgConsultarCeramico dcm = new DlgConsultarCeramico();
		dcm.setLocationRelativeTo(this);
		dcm.setVisible(true);
	}
	protected void actionPerformedMntmModificarCeramico(ActionEvent arg0) {
		DlgModificarCeramico dmm = new DlgModificarCeramico();
		dmm.setLocationRelativeTo(this);
		dmm.setVisible(true);
	}
	protected void actionPerformedMntmListarCeramicos(ActionEvent arg0) {
		DlgListarCeramicos dlm = new DlgListarCeramicos();
		dlm.setLocationRelativeTo(this);
		dlm.setVisible(true);
	}
	protected void actionPerformedMntmVender(ActionEvent arg0) {
		DlgVender dv = new DlgVender();
		dv.setLocationRelativeTo(this);
		dv.setVisible(true);
	}
	protected void actionPerformedMntmGenerarReportes(ActionEvent arg0) {
		DlgGenerarReportes dgr = new DlgGenerarReportes();
		dgr.setLocationRelativeTo(this);
		dgr.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarDescuentos(ActionEvent arg0) {
		DlgConfigurarDescuentos dcd = new DlgConfigurarDescuentos();
		dcd.setLocationRelativeTo(this);
		dcd.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarObsequio(ActionEvent arg0) {
		DlgConfigurarObsequio dco = new DlgConfigurarObsequio();
		dco.setLocationRelativeTo(this);
		dco.setVisible(true);
	}	
	protected void actionPerformedMntmConfigurarCantidadOptima(ActionEvent arg0) {
		DlgConfigurarCantidadOptima dccom = new DlgConfigurarCantidadOptima();
		dccom.setLocationRelativeTo(this);
		dccom.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarCuotadiaria(ActionEvent arg0) {
		DlgConfigurarCuotadiaria dcps = new DlgConfigurarCuotadiaria();
		dcps.setLocationRelativeTo(this);
		dcps.setVisible(true);
	}	
	protected void actionPerformedMntmAcercaDeLaTienda(ActionEvent arg0) {
		DlgAcercaTienda dat = new DlgAcercaTienda();
		dat.setLocationRelativeTo(this);
		dat.setVisible(true);		
	}

	//  M�todos tipo void (sin par�metros)
	void restaurarTodo() {
		//  Datos del primer modelo
		modelo0 = "Cinza Plus";
		precio0 = 92.56;
		ancho0 = 62.0;
		largo0 = 62.0;
		espesor0 = 29.2;
		contenido0 = 6;
		
		//  Datos del segundo modelo
		modelo1 = "Luxury";
		precio1 = 42.77;
		ancho1 = 60;
		largo1 = 60;
		espesor1 = 8.5;
		contenido1 = 4;
		//  Datos del tercer modelo

		modelo2 = "Austria";
		precio2 = 52.45;
		ancho2 = 45;
		largo2 = 45;
		espesor2 = 6.5;
		contenido2 = 12;
		//  Datos del cuarto modelo
	
		modelo3 = "Yungay Mix";
		precio3 = 55.89;
		ancho3 = 80.0;
		largo3 = 120.0;
		espesor3 = 6.8;
		contenido3 = 9;
		//  Datos del quinto modelo
		modelo4 = "Thal�a";
		precio4 = 45;
		ancho4 = 45;
		largo4 = 11.8;
		espesor4 = 7.2;
		contenido4 = 10;
		//  Porcentajes de descuento
	    porcentaje1 = 7.5;
		porcentaje2 = 10.0;
		porcentaje3 = 12.5;
		porcentaje4 = 15.0;
		//  Cantidad �ptima de ceramicos vendidas
		cantidadOptima = 10;
		//  Cantidad m�nima de ceramicos adquiridas para obtener el obsequio
		cuotaDiaria = 30000;
		//  Obsequio
		obsequio = "Lapicero";
		String obsequio = "Lapicero";
		int obsequioCantidad1 = 2;
		int obsequioCantidad2 = 3;
		int obsequioCantidad3 = 4;

	}

	}
	
package gui;

import java.awt.BorderLayout;

import javax.swing.border.EmptyBorder;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class DlgListarCeramicos extends JDialog implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private final JPanel contentPanel = new JPanel();
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnCerrar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgListarCeramicos dialog = new DlgListarCeramicos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgListarCeramicos() {
		setResizable(false);
		setTitle("Listado de Ceramicos");
		setBounds(100, 100, 573, 402);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(2, 2, 555, 326);
		contentPanel.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(200, 339, 100, 23);
		contentPanel.add(btnCerrar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtS.setText("");
				listar();
			}
		});
		btnListar.setBounds(310, 339, 89, 23);
		contentPanel.add(btnListar);
		
		listar();
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnListar(ActionEvent arg0) {
		txtS.setText("");
		listar();	
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
	//  Métodos tipo void (sin parámetros)	
	void listar() {
		txtS.append("LISTADO DE MALETAS"+"\n");
		txtS.append("\n");
		txtS.append("Código      :  " + Proyecto.codigo0+"\n");
		txtS.append("Descripción :  " + Proyecto.modelo0+"\n");
		txtS.append("Precio (S/) :  " + formatear(Proyecto.precio0)+"\n");
		txtS.append("Ancho (cm)  :  " + formatear(Proyecto.ancho0)+"\n");
		txtS.append("Largo (cm)   :  " + formatear(Proyecto.largo0)+"\n");
		txtS.append("Espesor (cm)  :  " + formatear(Proyecto.espesor0)+"\n");
		txtS.append("Contenido (uni)	: " + formatear(Proyecto.contenido0)+"\n");
		txtS.append("\n");
		txtS.append("Código      :  " + Proyecto.codigo1+"\n");
		txtS.append("Descripción :  " + Proyecto.modelo1+"\n");
		txtS.append("Precio (S/) :  " + formatear(Proyecto.precio1)+"\n");
		txtS.append("Ancho (cm)  :  " + formatear(Proyecto.ancho1)+"\n");
		txtS.append("Largo (cm)   :  " + formatear(Proyecto.largo1)+"\n");
		txtS.append("Espesor (cm)  :  " + formatear(Proyecto.espesor1)+"\n");
		txtS.append("Contenido (uni)	: " + formatear(Proyecto.contenido1)+"\n");
		txtS.append("\n");
		txtS.append("Código      :  " + Proyecto.codigo2+"\n");
		txtS.append("Descripción :  " + Proyecto.modelo2+"\n");
		txtS.append("Precio (S/) :  " + formatear(Proyecto.precio2)+"\n");
		txtS.append("Ancho (cm)  :  " + formatear(Proyecto.ancho2)+"\n");
		txtS.append("Largo (cm)   :  " + formatear(Proyecto.largo2)+"\n");
		txtS.append("Espesor (cm)  :  " + formatear(Proyecto.espesor2)+"\n");
		txtS.append("Contenido (uni)	: " + formatear(Proyecto.contenido2)+"\n");
		txtS.append("\n");
		txtS.append("Código      :  " + Proyecto.codigo3+"\n");
		txtS.append("Descripción :  " + Proyecto.modelo3+"\n");
		txtS.append("Precio (S/) :  " + formatear(Proyecto.precio3)+"\n");
		txtS.append("Ancho (cm)  :  " + formatear(Proyecto.ancho3)+"\n");
		txtS.append("Largo (cm)   :  " + formatear(Proyecto.largo3)+"\n");
		txtS.append("Espesor (cm)  :  " + formatear(Proyecto.espesor3)+"\n");
		txtS.append("Contenido (uni)	: " + formatear(Proyecto.contenido3)+"\n");
		txtS.append("\n");
		txtS.append("Código      :  " + Proyecto.codigo4+"\n");
		txtS.append("Descripción :  " + Proyecto.modelo4+"\n");
		txtS.append("Precio (S/) :  " + formatear(Proyecto.precio4)+"\n");
		txtS.append("Ancho (cm)  :  " + formatear(Proyecto.ancho4)+"\n");
		txtS.append("Largo (cm)   :  " + formatear(Proyecto.largo4)+"\n");
		txtS.append("Espesor (cm)  :  " + formatear(Proyecto.espesor4)+"\n");
		txtS.append("Contenido (uni)	: " + formatear(Proyecto.contenido0)+"\n");
	}
	
	
	//  Métodos que retornan valor (con parámetros)
	String formatear(double numero) {
	    return String.format("%.2f", numero);
	}	
}

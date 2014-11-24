import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Formulario extends JFrame implements ActionListener
{
	private JPanel panel;
	private JButton botonCrear;
	private JTextField txt_filas;
	private JTextField txt_columnas;
	private JToolBar barra;
	
	
	public Formulario()
	{
		barra = new JToolBar();
		add(barra);
		barra.setBounds(0, 0, 10, 100);
		barra.setVisible(true);
		paint(getGraphics());
		
	}
	
	
	
	
	
	/* Escucha */
	public void actionPerformed(ActionEvent evento) {
		
		
	}
	
	public static void main(String[] args){
		new Formulario();
	}
	
	
	
	
	
	

	
}
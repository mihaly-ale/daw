package Ventanas.ven_etiqueta;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaConEtiqueta extends JFrame {

	public VentanaConEtiqueta(String texto) {
		setSize(300, 200); // ancho, altura
		setTitle("Titulo - VentanaConEtiqueta"); // nombre de pestaña
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null); // deshabilita el Administrador de Diseño (layout manager, por defecto BorderLayout)
		iniciarComponentes(texto);
	}

	public void iniciarComponentes(String texto) {
		JLabel etiqueta = new JLabel("Etiqueta"); // ≈ <span>...</span>
		// NOTE: requisito - setLayout de ventana de padre
		etiqueta.setBounds(0, 100, 300, 50); // x → , y ↓ , ancho, altura
		etiqueta.setOpaque(true); //permite pintar el fondo, NOTE: false hace el fondo transparente, ignora el color del fondo
		etiqueta.setText(texto);
		etiqueta.setForeground(Color.red); // CSS color
		etiqueta.setBackground(Color.BLUE); // CSS background color
		etiqueta.setFont(new Font("Arial", Font.BOLD, 24));
		add(etiqueta); /// *** GOTO: 50 ***
		System.out.println(etiqueta.getParent()); // JPanel - internal content pane of JFrame
		System.out.println(etiqueta.getParent().getParent().getParent().getParent()); 
		// JFrame
		//	└── JRootPane                                                                               
		//		└── JLayeredPane (z-index)                                                                            
		//			└── ContentPane (JPanel)
		//				└── JLabel (etiqueta)
							
	}

}

/*
 Font(String name, int style, int size)
 - Font.PLAIN = 0
 - Font.BOLD = 1
 - Font.ITALIC = 2
 3 = bold + italic 
*/

// https://docs.oracle.com/en/java/javase/21/docs/api/java.desktop/java/awt/Container.html#add(java.awt.Component)
/* ***
public Component add(Component comp)
Appends the specified component to the end of this container.
This is a convenience method for addImpl(java.awt.Component, java.lang.Object, int).

This method changes layout-related information, and therefore, invalidates the component hierarchy. 
If the container has already been displayed, the hierarchy must be validated thereafter in order to display the added component.

public class Container
extends Component
A generic Abstract Window Toolkit(AWT) container object is a component that can contain other AWT components.

Components added to a container are tracked in a list. The order of the list will define the components' front-to-back stacking order within the container. If no index is specified when adding a component to a container, it will be added to the end of the list (and hence to the bottom of the stacking order). 
*/
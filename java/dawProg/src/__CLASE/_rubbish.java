package __CLASE;

import java.util.ArrayList;

interface Comedor {
    void comer(Alimento alimento); //implícitamente public y abstract
}

interface SerVivo {
    default void respirar() {  //implícitamente public
        System.out.println("Respirando oxígeno...");
    }
}

enum Alimento {
    CARNE("carne"),
    PESCADO("pescado"),
    HIERBA("hierba"),
    FRUTA("fruta"),
    VERDURA("verdura"),
    GRANO("grano");

    private final String etiqueta;

    Alimento(String etiqueta) { this.etiqueta = etiqueta; }

    @Override
    public String toString() { return etiqueta; }
} //Alimento

abstract class SerVivoBase implements SerVivo, Comedor {

    private final String nombre;
    //private ArrayList<Alimento> alimentosPermitidos = new ArrayList<>();
    
    public abstract ArrayList<Alimento> alimentosPermitidos();

    public SerVivoBase(String nombre) {
        this.nombre = nombre;
    }

	@Override
	public void comer(Alimento alimento) {
		// TODO Auto-generated method stub
        if (!alimentosPermitidos().contains(alimento)) {
            throw new IllegalArgumentException(
                nombre + " no puede comer " + alimento + "."
            );
        }
            System.out.println(nombre + " está comiendo " + alimento);
        
	}
}

abstract class Animal extends SerVivoBase {
	private final String especie;

    public Animal(String especie, String nombre) {
        super(nombre);
        this.especie = especie;
    }   
}
    
class Gato extends Animal {

        public Gato(String nombre) {
            super(nombre, "Gato");
        }

        @Override
        public ArrayList<Alimento> alimentosPermitidos() {
        	ArrayList<Alimento> lista = new ArrayList<>(); 
        	
        	lista.add(Alimento.CARNE); 
        	lista.add(Alimento.PESCADO); 
        	
        	return lista;
        }
    }


public class _rubbish {
	public static void main(String[] args) {
		Gato gato = new Gato("Mishi");
		
		gato.comer(Alimento.CARNE);
		gato.comer(Alimento.VERDURA);
 }
}

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

 public static void main(String[] args) {

  // JFrame = a GUI window to add components to
  
  JFrame frame = new JFrame(); //creates a frame
  frame.setTitle("JFrame title goes here"); //sets title of frame
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application
  frame.setResizable(false); //prevent frame from being resized
  frame.setSize(420,420); //sets the x-dimension, and y-dimension of frame
  frame.setVisible(true); //make frame visible
  
  ImageIcon image = new ImageIcon("logo.png"); //create an ImageIcon
  frame.setIconImage(image.getImage()); //change icon of frame
  frame.getContentPane().setBackground(new Color(0x123456)); //change color of background
    
 }
}

//JFrame - BorderLayout por defecto
		// JPanel - FlowLayout por defecto




// estable el tamaño de le ventana - JFrame = <html>

//getContentPane().setPreferredSize(new Dimension(400, 400));
// contentPane - área visible (<body>)
 
//pack();
// se establece el área visib
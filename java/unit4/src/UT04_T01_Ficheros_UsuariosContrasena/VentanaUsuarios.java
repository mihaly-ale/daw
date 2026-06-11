package UT04_T01_Ficheros_UsuariosContrasena;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Path;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaUsuarios extends JFrame implements ActionListener {

	JTextField usuarioInput;
	JTextField contrasenaInput;
	JButton btnPrimero;
	JButton btnAnterior;
	JButton btnSiguiente;
	JButton btnUltimo;
	JButton btnTotalUsuarios;

	public VentanaUsuarios() {
		setTitle("listaUsuarios y Contraseñas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setLocationRelativeTo(null);
		setResizable(false);

		iniciarComponentes();
	}

	public void iniciarComponentes() {
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new GridLayout(4, 1));
//		panelPrincipal.setBorder(new EmptyBorder(10,20,20,20));
		// titlePanel, formCenter, botonPanel

		// titlePanel
		JPanel titlePanel = new JPanel();
		JLabel title = new JLabel("VISUALIZACION DE DATOS");
		title.setFont(new Font("Arial", 1, 24));
		title.setHorizontalAlignment(JLabel.CENTER);
		titlePanel.add(title);

		// formPanel
		JPanel formCenter = new JPanel();// center !!!
		JPanel formPanel = new JPanel();
		formPanel.setLayout(new GridLayout(2, 2, 10, 5));

		JLabel usuarioEtiq = new JLabel("Usuario:");
		usuarioEtiq.setFont(new Font("Arial", 1, 16));
		usuarioInput = new JTextField();
		usuarioInput.addActionListener(this);
		JLabel contrasenaEtiq = new JLabel("Contraseña:");
		contrasenaEtiq.setFont(new Font("Arial", 1, 16));
		contrasenaInput = new JTextField();
		contrasenaInput.setPreferredSize(new Dimension(170, 30));
		contrasenaInput.setBackground(Color.LIGHT_GRAY);
		contrasenaInput.setEditable(false);
		formPanel.add(usuarioEtiq);
		formPanel.add(usuarioInput);
		formPanel.add(contrasenaEtiq);
		formPanel.add(contrasenaInput);

		formCenter.add(formPanel);

		// botonesPanel
		JPanel botonesPanel = new JPanel();
		btnPrimero = new JButton("Primero");
		btnPrimero.addActionListener(this); // !!!
		btnAnterior = new JButton("Anterior");
		btnAnterior.addActionListener(this); // !!!
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(this); // !!!
		btnUltimo = new JButton("Último");
		btnUltimo.addActionListener(this); // !!!
		botonesPanel.add(btnPrimero);
		botonesPanel.add(btnAnterior);
		botonesPanel.add(btnSiguiente);
		botonesPanel.add(btnUltimo);

		// btnUltimoPanel
		JPanel btnUltimoPanel = new JPanel();
		btnTotalUsuarios = new JButton("Total Usuarios");
		btnTotalUsuarios.addActionListener(this); // !!!
		btnUltimoPanel.add(btnTotalUsuarios);

		// todos a componente principal
		panelPrincipal.add(titlePanel);
		panelPrincipal.add(formCenter);
		panelPrincipal.add(botonesPanel);
		panelPrincipal.add(btnUltimoPanel);

		add(panelPrincipal);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String rutaArchivolistaUsuarios = "usuarios.dat";
		System.out.println(old.getValidPath());
//		String rutaArchivo = old.getValidPath() + File.separator + rutaArchivolistaUsuarios;
		Path rutaArchivo = Path.of(
			    "C:",
			    "Users",
			    "mihaly.ale.Educa",
			    "OneDrive - Educacyl",
			    "PROG",
			    "prog-ws",
			    "unit4",
			    "src",
			    "UT04_T01_Ficheros_UsuariosContrasena",
			    "creados",
			    rutaArchivolistaUsuarios
			);
		
		ArrayList<String> listaUsuarios = LectorUsuarios.leerUsuarios(rutaArchivo.toString());
		String entrada = usuarioInput.getText();

		// comprobar input
		if (e.getSource() == usuarioInput) {
			boolean usuarioExiste = comprobarUsuario(entrada, listaUsuarios);

			if (!usuarioExiste) {
				System.out.println("Usuario \"" + entrada + "\" no existe.");
				contrasenaInput.setText("-");
				return;
			} else {
				contrasenaInput.setText(obtenerPassword(obtenerIndiceUsuario(entrada), listaUsuarios));
			}
		}

		// anterior
		if (e.getSource() == btnAnterior) {
			boolean usuarioExiste = comprobarUsuario(entrada, listaUsuarios);

			if (entrada.equals("")) {
				System.out.println("Solicita el identificador de usuario!");
				return;
			}

			usuarioExiste = comprobarUsuario(entrada, listaUsuarios);
			if (!usuarioExiste) {
				return;
			}

			int indiceActual = obtenerIndiceUsuario(entrada);
			if (indiceActual <= 0) {
				System.out.println("Este el primero usuario. No existe usuario anterior.");
				contrasenaInput.setText(obtenerPassword(indiceActual, listaUsuarios));
				return;
			}

			int indiceAnterior = indiceActual - 1;
			contrasenaInput.setText(obtenerPassword(indiceAnterior, listaUsuarios));
			String registro = listaUsuarios.get(indiceAnterior);
			usuarioInput.setText(registro.substring(0, 6));
		}

		// siguiente
		if (e.getSource() == btnSiguiente) {
			boolean usuarioExiste = comprobarUsuario(entrada, listaUsuarios);

			if (entrada.equals("")) {
				System.out.println("Solicita el identificador de usuario!");
				return;
			}

			usuarioExiste = comprobarUsuario(entrada, listaUsuarios);
			if (!usuarioExiste) {
				return;
			}

			int indiceActual = obtenerIndiceUsuario(entrada);
			int indiceUltimo = listaUsuarios.size() - 1;
			if (indiceActual >= indiceUltimo) {
				System.out.println("Este el último usuario. No existe usuario siguiente.");
				contrasenaInput.setText(obtenerPassword(indiceActual, listaUsuarios));
				return;
			}

			int indiceSiguiente = indiceActual + 1;
			contrasenaInput.setText(obtenerPassword(indiceSiguiente, listaUsuarios));
			String registro = listaUsuarios.get(indiceSiguiente);
			usuarioInput.setText(registro.substring(0, 6));
		}

		// primero
		if (e.getSource() == btnPrimero) {
			contrasenaInput.setText(obtenerPassword(0, listaUsuarios));
			String registro = listaUsuarios.get(0);
			usuarioInput.setText(registro.substring(0, 6));
		}

		// ultimo
		if (e.getSource() == btnUltimo) {
			System.out.println("here");
			int indiceUltimo = listaUsuarios.size() - 1;

			contrasenaInput.setText(obtenerPassword(indiceUltimo, listaUsuarios));
			String registro = listaUsuarios.get(indiceUltimo);
			usuarioInput.setText(registro.substring(0, 6));
		}

		if (e.getSource() == btnTotalUsuarios) {

			JOptionPane.showMessageDialog(null, "Número de usuarios: " + calcularTotalUsuarios(listaUsuarios),
					"Información", JOptionPane.INFORMATION_MESSAGE);
			// GOTO: 255
		}

	}

	// Métodos
	public int calcularTotalUsuarios(ArrayList<String> listaUsuarios) {
		int contador = 0;
		for (String s : listaUsuarios) {
			contador++;
		}

		return contador;
	}

	public int obtenerIndiceUsuario(String entrada) {
		int indice;

		String indiceStr = entrada.substring(entrada.length() - 2);
		if (indiceStr.charAt(0) == '0') {
			indiceStr = Character.toString(indiceStr.charAt(1));
		}

		indice = Integer.valueOf(indiceStr) - 1;
		return indice;

	}

	public String obtenerPassword(int indice, ArrayList<String> listaUsuarios) {
		final int LONGITUD_CONTRASENA = 15;
		String registro = listaUsuarios.get(indice);

		String contrasena = registro.substring(registro.length() - LONGITUD_CONTRASENA);
		return contrasena;
	}

	public boolean comprobarUsuario(String entrada, ArrayList<String> listaUsuarios) {

		if (!(entrada.matches("user\\d{2}"))) {
			System.out.println("Formato de entrada no válido. Se esperaba: \"user\" seguido de uno o dos dígitos.");
			return false;
		}
		boolean usuarioExiste = false;

		for (String usuario : listaUsuarios) {
			if (usuario.contains(entrada)) {
				usuarioExiste = true;
				break;
			}
		}
		return usuarioExiste;
	}
}

/*
 * JOptionPane.showOptionDialog( Component parentComponent, // null = center of
 * screen Object message, // the message String String title, // dialog title
 * int optionType, // e.g. DEFAULT_OPTION, YES_NO_OPTION int messageType, //
 * e.g. INFORMATION_MESSAGE, WARNING_MESSAGE Icon icon, // custom icon (null =
 * default for messageType) Object[] options, // array of button labels (or
 * components) Object initialValue // the default-selected option ) The key
 * parameters: - optionType — determines which default buttons to show
 * (YES_NO_OPTION, OK_CANCEL_OPTION, etc.), but with DEFAULT_OPTION you only get
 * whatever you pass in options - options — your custom button labels (or
 * JComponents). The dialog creates one button per entry. - initialValue — which
 * option is highlighted by default (typically the first element) - Returns the
 * index from options of the button clicked, or CLOSED_OPTION (-1) if the user
 * closed the dialog
 */
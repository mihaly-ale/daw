package Ventanas.ven_layouts;

import java.awt.FlowLayout;
import java.awt.GridLayout;

public class UsaVentanaConLayouts {

	public static void main(String[] args) {

		// 1.
		System.out.println("BorderLayout:");
		VentanaConBorderLayout ventanaBorderLayout = new VentanaConBorderLayout();
		// ventanaBorderLayout.setVisible(true);
		
		// 2.
		System.out.println("\nFlowLayout:");
		VentanaConFlowLayout ventanaFlowLayout = new VentanaConFlowLayout();
		ventanaFlowLayout.setVisible(true);

		// 3.
		System.out.println("\nGridLayout:");
		VentanaConGrid ventanaConGrid = new VentanaConGrid();
		// ventanaConGrid.setVisible(true);
		System.out.println("\tventanaConGrid (JFrame): " + ventanaConGrid.getContentPane().getLayout());

		// NOTE: setLayout on Jframe is <frame>.getContentPane.setLayout()
		// getLayout on the instance returns the JFrame default layout, that is Border
		// JFrame =/= content pane of the JFrame

		System.out.println("\nGridLayoutExtended");
		ventanaConGridExtended ventanaConGridExtended = new ventanaConGridExtended();
		// ventanaConGridExtended.setVisible(true);
		System.out.println("\tventanaConGridExtended (JFrame): " + ventanaConGridExtended.getContentPane().getLayout());
	}

}

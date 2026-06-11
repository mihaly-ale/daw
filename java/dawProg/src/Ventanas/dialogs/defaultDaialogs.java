package Ventanas.dialogs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class defaultDaialogs implements ActionListener {
	JFrame frame;
	JDialog dialog;
	JButton confirmDialog;
	JButton inputDialog;
	JButton messageDialog;
	JButton optionDialog;
	JButton dialogCloser;

	// 1.
	// NOTE: the frame created with the listener attached to the button
	defaultDaialogs() {
		frame = new JFrame("Principal frame");
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

		// Buttona for opening JOptionPane
		confirmDialog = new JButton("Open ConfirmDialog");
		confirmDialog.addActionListener(this);

		inputDialog = new JButton("Show InputDialog");
		inputDialog.addActionListener(this);

		messageDialog = new JButton("Show MessageDialog");
		messageDialog.addActionListener(this);

		optionDialog = new JButton("Show optionDialog");
		optionDialog.addActionListener(this);

		frame.add(confirmDialog);
		frame.add(inputDialog);
		frame.add(messageDialog);
		frame.add(optionDialog);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new defaultDaialogs();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// for opening
		if (e.getSource() == confirmDialog) {
			int answer = JOptionPane.showConfirmDialog(dialog, "Piña con Pizza?", "Confirm Dialog",
					JOptionPane.YES_NO_CANCEL_OPTION); // return int
			String str = "";
			switch (answer) {
			case 0:
				str = "Yes??? Ar you kidding me?";
				break;
			case 1:
				str = "This is the way!";
				break;
			case 2:
				str = "Part of the Cancel culture?";
				break;
			case -1:
				str = "I wouldn't answer provocative questions either.";
				break;
			}
			System.out.println(str + " (" + answer + ")");
		}

		if (e.getSource() == inputDialog) {
			String name = JOptionPane.showInputDialog(dialog, "What is your name?"); // returns String
			System.out.println("Name is " + name + ".");
		}

		if (e.getSource() == messageDialog) {
			JOptionPane.showMessageDialog(dialog, "Don't do that!"); // returns void
		}

		String[] languages = { "JavaScript", "Java", "PHP" };
		if (e.getSource() == optionDialog) {
			// JOptionPane(Object message, int messageType, int optionType, Icon icon,
			// Object[] options, Object initialValue)
			int index = JOptionPane.showOptionDialog(dialog, "What is your favorite progamming language?",
					"Programming languages", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
					languages, languages[0]);

			if (index == -1) {
				System.out.println("No language has beeen choosen.");
			} else {
				System.out.println("Fav language: " + languages[index]);
			}
		}

		// closing dialog
		if (e.getSource() == dialogCloser) {
			dialog.dispose();
		}
	}
}
// https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html

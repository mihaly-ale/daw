package Ventanas.dialogs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class MyDialog implements ActionListener{
	JFrame frame;
	JDialog dialog;
	JButton dialogOpener;
	JButton dialogCloser;

	// 1.
	// NOTE: the frame created with the listener attached to the button
	MyDialog() {
		frame = new JFrame("Principal frame");
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		// frame.setLayout(new BorderLayout()); // this is by default

		// Button for opening
		dialogOpener = new JButton("Open Dialog");
		dialogOpener.addActionListener(this);
		dialogOpener.setPreferredSize(new Dimension(50,40));
		dialogOpener.setBackground(Color.BLUE);
		dialogOpener.setForeground(Color.YELLOW);

		frame.add(dialogOpener, BorderLayout.NORTH); // otherwise it will go all in with CENTER
		frame.setVisible(true);

	}

	// 2.
	// NOTE: method to create the dialog
	public void createDialog()  {

		dialog = new JDialog(frame, "Dialog", true);
		// new JDialog(parentframe, String title, isModal) - extends Dialog
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		dialog.setSize(200, 150);
		dialog.setLocationRelativeTo(frame);
		dialog.setLayout(new GridLayout(2,1));

		dialogCloser = new JButton("Close Dialog");
		dialogCloser.addActionListener(this);
		dialog.add(dialogCloser);

		JLabel label = new JLabel("Hi there!");
		label.setHorizontalAlignment(0);// parameter is type int
		/// https://docs.oracle.com/javase/8/docs/api/constant-values.html#javax.swing.SwingConstants
		dialog.add(label);
		dialog.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new defaultDaialogs(); // invoke 1.
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == dialogOpener) {
			createDialog(); // invoke 2., when listener activates
		}

		if (e.getSource() == dialogCloser) {
			dialog.dispose();
		}
	}
}

// https://docs.oracle.com/javase/8/docs/api/javax/swing/SwingUtilities.html
// https://www.youtube.com/watch?v=_xa0TXgA9L8
/*
 SwingUtilities.invokeLater(new Runnable() {

     ┌──────────────────────┬──────────────────────────────────────────────────────┐
     │ Word                 │ Meaning                                              │
     ├──────────────────────┼──────────────────────────────────────────────────────┤
     │ SwingUtilities       │ Utility class for Swing threading                    │
     ├──────────────────────┼──────────────────────────────────────────────────────┤
     │ .invokeLater(...)    │ Schedules code to run on the Event Dispatch Thread   │
     │                      │ (EDT) — Swing's single UI thread                     │
     ├──────────────────────┼──────────────────────────────────────────────────────┤
     │ new Runnable() { }   │ Creates an anonymous class implementing Runnable     │
     └──────────────────────┴──────────────────────────────────────────────────────┘
    Runnable - Interface, Thread - class
    	↪ extends 1x, implements many

    @Override
    public void run() {

        ┌──────────────────────┬──────────────────────────────────────────────────┐
        │ Word                 │ Meaning                                          │
        ├──────────────────────┼──────────────────────────────────────────────────┤
        │ public void run()    │ Method from Runnable — code executed on EDT      │
        ├──────────────────────┼──────────────────────────────────────────────────┤
        │ new jdialog()        │ Calls the constructor that creates the JFrame    │
        │                      │ and then the JDialog                             │
        └──────────────────────┴──────────────────────────────────────────────────┘

 Why invokeLater?

 Swing is not thread-safe.
 All UI creation and updates must happen on the EDT.

 invokeLater() places the task into the EDT queue so Swing components
 are created safely on the correct thread.

 Without it, the UI would be created on the main thread, which can
 cause random bugs, visual glitches, or crashes.

 */
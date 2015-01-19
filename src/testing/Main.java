package testing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JLabel;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1021, 716);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlDkShadow);
		panel.setPreferredSize(new Dimension(30,160));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Troy\\Pictures\\fresha.png"));
		panel.add(label);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Arial Unicode MS", Font.PLAIN, 18));
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Add Record", new ImageIcon("C:\\Users\\Troy\\Pictures\\themes-icon.ico"), panel_1, null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(1000,400));
		panel_1.add(panel_4);
		tabbedPane.setBackgroundAt(0, new Color(255, 255, 224));
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("View Records", new ImageIcon("C:\\Users\\Troy\\Pictures\\key.ico"), panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Assignments", new ImageIcon("C:\\Users\\Troy\\Pictures\\counterstrike.ico"), panel_3, null);
		//panel_4.setPreferredSize(arg0);
	}

}

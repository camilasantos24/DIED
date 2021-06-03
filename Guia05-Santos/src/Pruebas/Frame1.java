package Pruebas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Frame1 extends JFrame {

	private JPanel contentPane;
	public JLabel lbl = new JLabel("Holi");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame = new Frame1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton bt1 = new JButton("Boton 1");
		bt1.addActionListener(event -> lbl.setVisible(true));
		bt1.setBounds(54, 105, 89, 33);
		contentPane.add(bt1);
		
		
		lbl.setBounds(61, 37, 95, 33);
		contentPane.add(lbl);
		
		JButton bt2 = new JButton("Boton 2");
		bt2.addActionListener(event -> lbl.setVisible(false));
		bt2.setBounds(252, 105, 89, 33);
		contentPane.add(bt2);
	}
}

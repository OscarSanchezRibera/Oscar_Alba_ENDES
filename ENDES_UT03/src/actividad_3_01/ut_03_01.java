package actividad_3_01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ut_03_01 {

	private JFrame frmEjercicio;
	private JTextField txtN1;
	private JTextField txtN2;
	private JLabel lblSalida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ut_03_01 window = new ut_03_01();
					window.frmEjercicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ut_03_01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjercicio = new JFrame();
		frmEjercicio.setTitle("Ejercicio 16");
		frmEjercicio.setResizable(false);
		frmEjercicio.setBounds(100, 100, 450, 300);
		frmEjercicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjercicio.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NUMERO 1:");
		lblNewLabel.setBounds(10, 11, 68, 14);
		frmEjercicio.getContentPane().add(lblNewLabel);
		
		txtN1 = new JTextField();
		txtN1.setBounds(88, 8, 86, 20);
		frmEjercicio.getContentPane().add(txtN1);
		txtN1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("NUMERO 2:");
		lblNewLabel_1.setBounds(10, 48, 68, 14);
		frmEjercicio.getContentPane().add(lblNewLabel_1);
		
		txtN2 = new JTextField();
		txtN2.setBounds(88, 45, 86, 20);
		frmEjercicio.getContentPane().add(txtN2);
		txtN2.setColumns(10);
		
		JButton botonSum = new JButton("DIVIDIR");
		botonSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1=Integer.parseInt(txtN1.getText());
				int n2=Integer.parseInt(txtN2.getText());
				
				int suma=n1/n2;
				lblSalida.setText(String.format("%d / %d = %d", n1, n2, suma));
			}
		});
		botonSum.setBounds(10, 104, 89, 23);
		frmEjercicio.getContentPane().add(botonSum);
		
		JButton botonLim = new JButton("LIMPIAR");
		botonLim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtN1.setText("");
				txtN2.setText("");
				lblSalida.setText("");
			}
		});
		botonLim.setBounds(109, 104, 89, 23);
		frmEjercicio.getContentPane().add(botonLim);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 133, 414, 117);
		frmEjercicio.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblSalida = new JLabel("RESULTADO");
		lblSalida.setBounds(10, 11, 394, 95);
		panel.add(lblSalida);
		lblSalida.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalida.setFont(new Font("Tahoma", Font.BOLD, 22));
	}
}

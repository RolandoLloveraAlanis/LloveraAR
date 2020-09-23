import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class Ventana1 extends JFrame {
	
	

	private JPanel contentPane;
	public static JTextField txtPrimerNumero;
	public static JTextField txtSegundoNumero;
	private JButton btnInicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
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
	public Ventana1() {
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 249, 173);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese el inicio de la suma");
		lblNewLabel.setBounds(5, 5, 424, 14);
		contentPane.add(lblNewLabel);
		
		txtPrimerNumero = new JTextField();
		txtPrimerNumero.setBounds(5, 21, 86, 20);
		contentPane.add(txtPrimerNumero);
		txtPrimerNumero.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese el tope de la suma");
		lblNewLabel_1.setBounds(5, 47, 147, 14);
		contentPane.add(lblNewLabel_1);
		
		txtSegundoNumero = new JTextField();
		txtSegundoNumero.setBounds(5, 63, 86, 20);
		contentPane.add(txtSegundoNumero);
		txtSegundoNumero.setColumns(10);
		
		
		
		
		
		btnInicio = new JButton("Iniciar suma");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				int x= Integer.parseInt(Ventana1.txtPrimerNumero.getText());
				int x2=x+1;
			    int y =Integer.parseInt(Ventana1.txtSegundoNumero.getText());
			    int R=0;
                 int arreglo [] = new int [y];
                 String acumulador ="";
							
				for(int i=0 ;i<y;i++)
				{
				R = x+x2;
				arreglo [i]=R;
			
				
				
				x2=x;
				x=R;	
				}
				for(int i= 0;i<y;i++)
				{
					acumulador +=arreglo[i];
					acumulador += "     ";
				}
				acumulador += "\n";
				JOptionPane.showMessageDialog(null, acumulador);
				
				
				
				
				
				   
			}
		});
		btnInicio.setBounds(2, 94, 89, 23);
		contentPane.add(btnInicio);
		
		
	}
}

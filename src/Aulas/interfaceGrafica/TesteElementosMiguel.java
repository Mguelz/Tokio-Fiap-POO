package Aulas.interfaceGrafica;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class TesteElementosMiguel {

	private JFrame frame;
	private ButtonGroup agrupandoRadios; // criando a variavel do tipo ButtonGroup

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteElementosMiguel window = new TesteElementosMiguel();
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
	public TesteElementosMiguel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 618, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null); // centraliza o frame na tela
		
		// RADIO BUTTONS
		agrupandoRadios = new ButtonGroup(); // criando o buttonGroup
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Opcao 1");
		rdbtnNewRadioButton.setBounds(17, 205, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		agrupandoRadios.add(rdbtnNewRadioButton); // add ao buttonGroup
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Opcao 2");
		rdbtnNewRadioButton_1.setBounds(17, 234, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		agrupandoRadios.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Opcao 3");
		rdbtnNewRadioButton_2.setBounds(17, 260, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		agrupandoRadios.add(rdbtnNewRadioButton_2); // add ao buttonGroup
		
		// COMBO BOX
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
//		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "Opcao 1", "Opcao 2", "Opcao 3"}));
		comboBox.setBounds(287, 205, 90, 22);
		frame.getContentPane().add(comboBox);
		
		comboBox.setSelectedItem("Selecione"); // selecione o editable no painel propertis
		comboBox.addItem("Opcao 1");
		comboBox.addItem("Opcao 2");
		comboBox.addItem("Opcao 3");
		
		
		// BUTTON
		JButton btnNewButton = new JButton("obtem o comboBox");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(btnNewButton, comboBox.getSelectedItem(), "opcao 3", 0); // confirma a opcao escolhida com o titulo no JOption
			}
		});
		btnNewButton.setBounds(271, 313, 123, 46);
		frame.getContentPane().add(btnNewButton);
		
		// CHECK BOX
		JCheckBox chckbxNewCheckBox = new JCheckBox("Check 1");
		chckbxNewCheckBox.setBounds(454, 205, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Check 2");
		chckbxNewCheckBox_1.setBounds(454, 234, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Check 3");
		chckbxNewCheckBox_2.setBounds(454, 260, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		
	}
}

/*
 * ButtonGroup serve para que somente 1 botao do grupo possa ser selecionado
 * 
 * 
 * 
 * 
 * 
 * 
 */

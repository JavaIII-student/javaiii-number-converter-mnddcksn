import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class NumberConverter implements ActionListener{

	public static void main(String[] args) {
		new NumberConverter().Menu();
	}
	//Create frame
	JFrame frame = new JFrame();
						
	//Create panel
	JPanel panel = new JPanel();
						
	//Create buttons
	JButton binToDec = new JButton("Bin to Dec");
	JButton binToHex = new JButton("Bin to Hex");
	JButton decToBin = new JButton("Dec to Bin");
	JButton decToHex = new JButton("Dec to Hex");
	JButton hexToBin = new JButton("Hex to Bin");
	JButton hexToDec = new JButton("Hex to Dec");
	
	Decimal dec = new Decimal ();
		
	Binary bin = new Binary ();
		
	Hexadecimal hex = new Hexadecimal ();
		
	private void Menu() {
		//Make frame visible
		frame.setVisible(true);
				
		//Add panel to frame
		frame.add(panel);
				
		//Add buttons to panel
		panel.add(binToDec);
		panel.add(binToHex);
		panel.add(decToBin);
		panel.add(decToHex);
		panel.add(hexToBin);
		panel.add(hexToDec);
			
		//Pack the frame to make it just big enough for the buttons
		frame.pack();
				
		//Add action listeners
		binToDec.addActionListener(this);
		binToHex.addActionListener(this);
		decToBin.addActionListener(this);
		decToHex.addActionListener(this);
		hexToBin.addActionListener(this);
		hexToDec.addActionListener(this);
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == binToDec) {
			String binToDecString = JOptionPane.showInputDialog("Enter Binary Number to convert to Decimal");
			//System.out.println(Binary.convertToDecimal(binToDecString));	
			JOptionPane.showMessageDialog(null, Binary.convertToDecimal(binToDecString));
			
		}
		else if (e.getSource() == binToHex) {
			String binToHexString = JOptionPane.showInputDialog( "Enter Binary Number to convert to Hexadecimal");
			//System.out.println(Binary.convertToHexadecimal(binToHexString));
			JOptionPane.showMessageDialog(null, Binary.convertToHexadecimal(binToHexString));
		}
		else if (e.getSource() == decToBin) {
			String decToBinString = JOptionPane.showInputDialog("Enter Decimal Number to convert to Binary");
			//System.out.println(Decimal.convertToBinary(decToBinString));
			JOptionPane.showMessageDialog(null, Decimal.convertToBinary(decToBinString));
		}
		else if (e.getSource() == decToHex) {
			String decToHexString = JOptionPane.showInputDialog("Enter Decimal Number to convert to Hexadecimal");
			//System.out.println(Decimal.convertToHexadecimal(decToHexString));
			JOptionPane.showMessageDialog(null,  Decimal.convertToHexadecimal(decToHexString));
		}
		else if (e.getSource() == hexToBin) {
			String hexToBinString = JOptionPane.showInputDialog("Enter Hexadecimal Number to convert to Binary");
			//System.out.println(Hexadecimal.convertToBinary(hexToBinString));
			JOptionPane.showMessageDialog(null, Hexadecimal.convertToBinary(hexToBinString));
		}
		else if (e.getSource() == hexToDec) {
			String hexToDecString = JOptionPane.showInputDialog("Enter Hexadeicaml Number to convert to Decimal");
			//System.out.println(Hexadecimal.convertToDecimal(hexToDecString));
			JOptionPane.showMessageDialog(null,  Hexadecimal.convertToDecimal(hexToDecString));

		}
		
	}
	
	

}

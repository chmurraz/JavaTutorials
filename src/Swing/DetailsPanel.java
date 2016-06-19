package Swing;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DetailsPanel extends JPanel
{
	public DetailsPanel()
	{
		Dimension size = getPreferredSize();
		size.width = 250;
		setPreferredSize(size);
		
		//	Adds a beveled border
		setBorder(BorderFactory.createTitledBorder("Personal Details"));
		
		JLabel nameLabel = new JLabel("Name: ");
		JLabel occupationLabel = new JLabel("Occupation: ");
		
		//	Parameter is the number of columns for the textfield
		JTextField nameField = new JTextField(10);
		JTextField occupationField = new JTextField(10);
		
		JButton addBtn = new JButton("Add");
		
		//	GridBagLayout lets you add controls in conjunction with a GridBagConstraints class
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		////	First Column (x = 0)	////
		
		gc.anchor = GridBagConstraints.LINE_END;	//	Right justify
		gc.weightx = 0.5;	//	Weights do not have to add up to 1.0
		gc.weighty = 0.5;
		
		gc.gridx = 0;	//	x increasing to right
		gc.gridy = 0;	//	y increasing downwards
		add(nameLabel,gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		add(occupationLabel, gc);
		
		////	Second Column (x = 1)	////
		
		gc.anchor = GridBagConstraints.LINE_START;	//	Left justify
		gc.gridx = 1;
		gc.gridy = 0;
		add(nameField, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		add(occupationField, gc);
		
		////	Final Row	////
		
		//gc.fill = GridBagConstraints.BOTH;	//	This is a good option for some text fields
		gc.weighty = 10;	//	Weight very high to make this "row" take up a lot of space
		gc.anchor = GridBagConstraints.FIRST_LINE_START;	//	Top justify
		gc.gridx = 1;
		gc.gridy = 2;
		add(addBtn,gc);
		
		
		
		
	}
}

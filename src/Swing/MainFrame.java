package Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/*
 * 	RESEARCH ... Interfaces and Anonymous Classes
 */

public class MainFrame extends JFrame
{
	private DetailsPanel detailsPanel;
	
	public MainFrame(String title)
	{
		super(title);
		
		//	Set layout manager
		setLayout(new BorderLayout());
		
		//	Create Swing components
		JTextArea textArea = new JTextArea();
		JButton button = new JButton("Click Me!");
		
		detailsPanel = new DetailsPanel();
		
		detailsPanel.addDetailListener(new DetailListener ()
				{
					public void detailEventOccured(DetailEvent event)
					{
						//	Get the text from the event
						String text = event.getText();
						
						//	Append this text into the text panel
						textArea.append(text);
					}
				});
		
		//	Add Swing components to content pane
		Container c = getContentPane();
		
		c.add(textArea, BorderLayout.CENTER);
		c.add(button, BorderLayout.SOUTH);
		c.add(detailsPanel,BorderLayout.WEST);
	}
}

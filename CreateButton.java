import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateButton {

	public static void main(String[] args) {
	
		JFrame a = new JFrame("Sample Button");
		JButton button = new JButton("Click This");
		
		button.addActionListener(new ActionListener()
				{
				
			public void actionPerformed(ActionEvent evt) {
				{
		
		JOptionPane.showConfirmDialog(null," Your button can function succesfully");
				}
			}
				}			
	);
		

a.add(button);
a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
a.setSize(300/100, 0);
a.setVisible(true);
				}
}

	


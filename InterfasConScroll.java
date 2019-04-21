import javax.swing.*;
public class InterfasConScroll extends JFrame{
	private JTextField textfield1;
	private JScrollPane scroll;
	private JTextarea textarea1;

	public InterfasConScroll(){
		setLayout(null);
		textfield1 = new JTextField();
		textfield1.setBounds(10,10,200,30);
		add(textfield1);

		textarea1 = new JTextArea();
		scroll = new JCrollpane(textarea1);
	}

}
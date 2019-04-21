import javax.swing.*;
public class FormularioSiete extends JFrame{
	private JTextField textfield1;
	private JTextArea textarea;

	public FormularioSiete(){
		setLayout(null);
		textfield1 = new JTextField();
		textfield1.setBounds(10,10,200,30);
		add(textfield1);

		textarea = new JTextArea();
		textarea.setBounds(10,50,350,300);
		add(textarea);

	}
	public static void main(String[]args){
		FormularioSiete formulario7 = new FormularioSiete();

		formulario7.setBounds(0,0,540,400);
		formulario7.setVisible(true);
		formulario7.setResizable(false);
		formulario7.setLocationRelativeTo(null);
	}

}

import javax.swing.*;
import java.awt.event.*;
public class FormularioSeis extends JFrame implements ActionListener{
	private JTextField textfield1;
	private JLabel label1;
	private JButton boton1;

	public FormularioSeis(){
		setLayout(null);
		 label1 = new JLabel("Usuario: ");
		 label1.setBounds(10,10,100,30);
		 add(label1);

		 textfield1 = new JTextField();
		 textfield1.setBounds(120,17,150,20);
		 add(textfield1);

		 boton1 = new JButton("Aceptar");
		 boton1.setBounds(10,80,100,50);
		 add(boton1);
		 boton1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==boton1) {
			//getText() = nos permite obtener o capturar el texto que le usuario
			//haya escrito en algun componente
			String texto = textfield1.getText();
			//ahora diremos con setTitle();que ese texto ingresado se coloque en la ventana de la interfaz
			setTitle(texto);
		}
	}
	public static void main(String[]args){
		FormularioSeis formulario6 = new FormularioSeis();

		formulario6.setBounds(0,0,300,150);
		formulario6.setVisible(true);
		formulario6.setResizable(false);
		formulario6.setLocationRelativeTo(null);
	}
}
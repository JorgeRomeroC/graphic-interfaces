import javax.swing.*;
public class FormularioTres extends JFrame{
	private JLabel label1;
	private JLabel label2;

	//el constructor siempre debe llamarse con el nombre de la clase
	public FormularioTres(){
		setLayout(null);
		label1 = new JLabel("Interfaz de CodigoTipado");
		label1.setBounds(10,20,300,30);
		//y todo lo diseñado hasta ahora sea añadido a la etiqueta label1
		add(label1);

		//segunda etiqueta
		label2 = new JLabel("Version 1.0");
		label2.setBounds(10,100,100,30);
		add(label2);
	}
	public static void main(String[]args){
		//
		FormularioTres formulario3 = new FormularioTres();
		formulario3.setBounds(0,0,300,200);
		//evitar que modifique el tamaño de la interfaz
		formulario3.setResizable(false);
		formulario3.setVisible(true);
		//setLocationRelativeTo(null) = que se muestre en el centro de la pantalla
		formulario3.setLocationRelativeTo(null);
	}

}
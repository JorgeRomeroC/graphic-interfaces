import javax.swing.*;//java.swing = nos permite importar todos los componentes
//java.awt.event.*; = esta libreria nos permite tener el control
//de los componentes que importamos con swing y que tendra nuestra interfaz(botones de  cierre, abrir, etc)
//y darle la funcionalidad a estos
import java.awt.event.*;
/*implements ActionListener = permite al programa estar atento a cualquer evento
que se ejecute dentro del JFrame o de la interfaz grafica, lo cual se hara con la clase*/
public class FormularioCuatro extends JFrame implements ActionListener{
	JButton boton1;
	//diseñamos nuestros elementos (el boton)
	public FormularioCuatro(){
		setLayout(null);
		boton1 = new JButton("Cerrar");
		boton1.setBounds(300,250,100,30);
		add(boton1);
		//addActionListener(this) = agregamos un evento al boton1, y con esto hacemos 
		//uso de la clase implementada arriba ActionListener
		boton1.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e){
		/*getSource() = hara uso del evento que se guardo en el elemento e
		y nos dira que el evento se origino en el boton1 y la condicional
		nos dira que si el evento que esta en la vriable e pertenece el boton1
		entonces ejecute lo mismo
		*/
		if (e.getSource()== boton1) {
			//entonces si concide el evento con el boton1
			//queremos que se cierre la interfaz grafica
			System.exit(0);
		}
	}
	public static void main(String[]args){
		//primero creamos el objeto
		FormularioCuatro formulario4 = new FormularioCuatro();
		//deramos las cordenadas del elemento
		formulario4.setBounds(0,0,400,350);
		formulario4.setVisible(true);
		formulario4.setResizable(false);
		formulario4.setLocationRelativeTo(null);

	}
}
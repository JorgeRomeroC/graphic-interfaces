import javax.swing.*;
public class FormularioDos extends JFrame{
	//constructor
	public FormularioDos(){
		//setLayout() = es que haremos uso de coredenadas para posicionar nuestro
		//elementos
		setLayout(null);
	}
	public static void main(String[]args){
		FormularioDos formulario2 = new FormularioDos();
		//las cordenadas creadas seran para el metodo formlario2

		//0 pegada al la izquierda, 0 en lo mas alto de la pantalla
		//tendra un ancho de 400 px, y 550 alto
		formulario2.setBounds(0,0,400,500);
		formulario2.setVisible(true);
		//cuando se ejecute la interfaz y sin importar las coredenadas siempre apareza cuando se
		//ejecute en el centro de la pantalla
		formulario2.setLocationRelativeTo(null);
		//false = NO permitimos que el usuario pueda modificar el tamaño de la ventana de la interfaz
		formulario2.setResizable(false);
	}
}
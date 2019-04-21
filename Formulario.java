import javax.swing.*;
//el* dice que haremos uso de todos los elementos de la libreria swing
//de otra forma en lugar del * pondriamos solo el nombre de la clase a utilizar
public class Formulario extends JFrame{
/*extends = nos permite hacer uso de las clases que contiene la libreria swing
especificamente la clase JFrame*/

/*private = */
	private JLabel intro1;
/*Formulario: un contrucctor debe llamrse igual que el nombre de mi clase
este construcctor contiene el diseño de la etiqueta*/
	public Formulario(){

	
/*setLayout(null); = nos permite indicarle al programa donde qyeremos colocar los
elementos graficos en la interfaz y la palabra null, impedimos que el metodo setLayout los coloque en cualquier parte
en que no queramos que se vean*/
	setLayout(null);
	intro1 = new JLabel("Jorge Romero, fundador de CodigoTipado");
	//los metodos se unen con un punto intro1.setBounds() cuando se requiere que afecte
	//a un objeto directamente o a un elemento, en este caso queremos que afecte a la etiqueta intro1 
	//coordenadaso ubicacion del campo 10,20 ancho 200 alto 300, medidas pertenecen al boton del texto
	intro1.setBounds(10,20,500,300);
	//add(intro1); = todo lo creado lo colocaremos en la etiqueta intro1
	add(intro1);

	}
	//ahora ejecutaremos el diseño anterior creado
	public static void main(String[]args){
		//creamos un objeto del tipo de la clase Formulario
		Formulario formulario1 = new Formulario();
		//llamamos al objeto creado
		//estas coordenadas y ancho y alto pertenecen a las medidas de la ventana grafica
		formulario1.setBounds(0,0,600,300);
		//setVisible(true) = nos permite hacer que el boton creado se visualice o se pueda ver
		//y si queremos que no se vea sera false
		formulario1.setVisible(true);
		//setLocationRelativeTo(null) = nos permite que al ejecutar la interfas lo haga al centro de la
		//pantalla
		formulario1.setLocationRelativeTo(null);
	}

}
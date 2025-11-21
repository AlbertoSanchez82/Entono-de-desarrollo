package ejercicio2;//Indica la clase que pertenece el paquete

public class Card {//Aqui se declara una clase publica

	public String suit;//Atributo publico llamado "suit" (palo de la carta)
	public String value;//Atributo publico llamado "value" (valor de la carta)
	
	public Card (String suit, String value) {//Contruir una clase llamada Carta y se ejecuta al crear un objeto llamada Carta
											//Recibe dos parametros el "suit" y el "value"
		
		this.suit = suit;//Asigna un parametro "suit" y recibe un atributo de la clase
						// El "this.suit" se refiere al atributo del objeto actual
		
		this.value = value;//Asigna un parametro "value" a un atributo "value" del objeto
	}
	
	public String toString () {//Sobrescribe un metodo "toString()" de la clase objeto
								//Define como se representa una carta cuando se muestra por pantalla
		
		return (this.suit+"-"+this.value);//Devuelve un texto con el formato "suit-value"
	}
}


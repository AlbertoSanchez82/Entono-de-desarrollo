package ejercicio2;//Indica la clase que pertenece el paquete
					//Sirve para organizar el proyecto y clasificar las clases

import java.util.ArrayList;//Importa la clase "ArrayLsit" de la libreria java.util.
							//"Arraylist" es una lista dinamica donde se guardan objetos

public class DeckCards {//Declara una clase publica llamada "DeckCards
						//Contiene un metodo main para ejecutar el programa

	public static void main(String[] args) {//Metodo principal
											//Se ejecuta cuando se inciar el programa

		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };//Crea una "array" de String con los 4 palos de la baraja
		
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };//Crea otra "array" con los 13 valores posibles de una carta

		ArrayList<Card> deck = new ArrayList<Card>();//Crea una "ArrayList vacio llamado "desck"
													//Aqui es donde se guardan las 52 cartas creadas

		for (int i = 0; i < suits.length; i++) {//Primer bucle for: recorre todos los palos
			for (int j = 0; j < values.length; j++) {//Segundo bucle for: recorre todos los valores
				Card card = new Card(suits[i], values[j]);//Crea una carta combinado un palo y un valor
				deck.add(card);//Agrega la carta recien creada al "ArrayList deck"
			}
		}

		for (int i = 0; i < deck.size(); i++) {//Recorre la baraja completa para mezclar
			int j = (int) Math.floor(Math.random() * i);//Calcula un mumero aleatroio
			Card tmp = deck.get(i);//Guarda temporalmente la carta en la posicion 1
									// Esto es necesario para hacer el intercambio sin perder datos
			deck.set(i, deck.get(j));//Pone la posicion i de la crat que estaba en la posicion j
			deck.set(j, tmp);//Coloca en la pocision j la carta guardad anteriormente
		}

		for (int i = 0; i < 5; i++) {// Ultimo bluce donde se imprime las 5 primeras cartas del mazo mezclado
			System.out.println(deck.get(i));//Aqui se mostrara por pantalla
		}

	}

}


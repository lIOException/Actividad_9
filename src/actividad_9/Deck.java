package actividad_9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Deck {
    List<Card> deck = new ArrayList<Card>();

    public void shuffle(){
        HashSet<Card> h = new HashSet<Card>();
        for (Card carta: deck) {
            h.add(carta);
        }
        deck.removeAll(deck);
        for (Card carta: h) {
            deck.add(carta);
        }
        System.out.println("Se mezclo el Deck.");
    }
    public void head(){
        Card carta = deck.get(0);
        deck.remove(0);
        System.out.println( carta.palo + ", " + carta.color + ", " + carta.valor );
        System.out.println("Quedan " + deck.size());
    }

    public void pick(){
        int x = (int) (deck.size() * Math.random() / 1);
        Card carta = deck.get(x);
        deck.remove(x);
        System.out.println( carta.palo + ", " + carta.color + ", " + carta.valor );
        System.out.println("Quedan " + deck.size());
    }

    public void hand(){
        Card carta;
        for ( int i = 0 ; i < 5 ; i++ ) {
            carta = deck.get(0);
            deck.remove(0);
            System.out.println( carta.palo + ", " + carta.color + ", " + carta.valor );
        }
        System.out.println("Quedan " + deck.size());

    }


    public void addCards(){
        String palo = "";
        String color = "";
        deck.removeAll(deck);
        for ( int i = 0 ; i < 4 ; i++ ) {
            for ( int j = 0 ; j < 13 ; j++ ) {
                switch (i){
                    case 0: palo = "trebol"; color = "Negro"; break;
                    case 1: palo = "corazon"; color = "Rojo"; break;
                    case 2: palo = "pica"; color = "Negro"; break;
                    case 3: palo = "diamant"; color = "Rojo"; break;
                }
                deck.add(new Card(palo,color,j+1));
            }
        }
    }

    public void printDeck(){
        for (Card carta: deck) {
            System.out.println( carta.palo + ", " + carta.color + ", " + carta.valor );
        }
    }
}
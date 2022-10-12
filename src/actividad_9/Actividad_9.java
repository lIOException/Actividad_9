package actividad_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad_9 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Deck d = new Deck();
        d.addCards();
        int respuesta = 0;
        do{
            System.out.println("Bienvenido a Poker!\n"
                    + "Selecciona una opción:\n"
                    + "1 Mezclar deck\n"
                    + "2 Sacar una carta\n"
                    + "3 Carta al azar\n"
                    + "4 Generar una mano de 5 cartas\n"
                    + "0 Salir");
            try{
                respuesta = Integer.parseInt(reader.readLine());
            }catch(IOException e){
                System.out.println("Opción no valida");
            }
            
            switch (respuesta){
                case 0: System.out.println("Opción no valida");break;
                case 1: d.shuffle();break;
                case 2: d.head();break;
                case 3: d.pick();break;
                case 4: d.hand();break;
            }
            
        }while(respuesta >= 0 && respuesta <= 4);
    }
    
}

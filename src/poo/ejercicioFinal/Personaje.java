package poo.ejercicioFinal;

import java.util.Random;

public class Personaje {

    String nombre;
    int vida;
    int ataque;

    public int ataqueEspada(int vida) {
        Random rand = new Random();
        int aleatorio = rand.nextInt(2);
        if (aleatorio == 0) {
            return vida;
        }else{
            return vida-8;
        }
    }
    public Personaje(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;

    }



}

package poo.ejercicioFinal;

import java.util.Random;

public class Personaje {

    String nombre;
    String tipo;
    int vida;
    int ataque;

    public int ataqueEspada(int vida,int ataque) {
        Random rand = new Random();
        int aleatorio = rand.nextInt(2);
        if (aleatorio == 0) {
            vida=vida-ataque;
            System.out.println("El ataque con espada ha acertado, la vida del enemigo ahora es de " + vida);
            return vida;
        }else{
            System.out.println("El ataque con espada ha fallado, la vida del enemigo sigue siendo " + vida);
            return vida;
        }
    }
    public int ataqueArco(int vida,int ataque){
        Random rand = new Random();
        int aleatorio = rand.nextInt(4);
        if (aleatorio < 2) {
            vida=vida-ataque;
            System.out.println("El ataque con arco ha acertado, la vida del enemigo ahora es de " + vida);
            return vida;
        }else {
            System.out.println("El ataque con arco ha fallado, la vida del enemigo sigue siendo " + vida);
            return vida;
        }

    }

    public Personaje() {
    }

    public Personaje(String nombre, String tipo, int vida, int ataque) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.ataque = ataque;
    }
}

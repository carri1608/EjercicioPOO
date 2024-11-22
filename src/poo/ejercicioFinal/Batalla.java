package poo.ejercicioFinal;


import java.util.Random;

public class Batalla {

    /*
Ejercicio Final

Se deberá la simulación de una batalla entre dos Personajes ficticios, para ello utilizaremos los conceptos de Clases, Objetos, Atributos, Métodos y Constructores.
Para ello se debe cumplir con una serie de requisitos.
Creación de una clase Personaje con los siguientes atributos obligatorios:
    Nombre
    Tipo
    Vida
    Ataque
Se creará al menos dos métodos de ataque:
    Un método de ataque con espada
    Un método de ataque con arco
Se deberá crear una clase llamada Batalla donde se realizará la simulación.
En la clase Batalla se deberá crear dos objetos personajes:
    Un personaje de tipo Arquero
    Un personaje de tipo Guerrero
Los valores del resto de atributos serán decisión vuestra, pero que tengan diferente nombre.

Se debe saber que:
El Arquero usará el método -> ataque con arco y tendrá un 25% de acertar el ataque al rival.
El Guerrero usará el método-> ataque con espada y tendrá un 50% de acertar el ataque al rival.

El combate lo ganará el personaje que primero reduzca todos los puntos de vida a su rival y
cada vez que se realice un ataque se debería ver si se han bajado los puntos de vida o si ha fallado.
Al final del combate debe aparecer un mensaje con el nombre del ganador.

    * */

    public static void main(String[] args) {
        Personaje arquero = new Personaje("Legolas","Arquero",40,12);
        Personaje guerrero= new Personaje("Aragorn","Guerrero",40,8);


        Random rand = new Random();
        int aleatorio = rand.nextInt(2);
        if(aleatorio==0){
            System.out.println("El guerrero atacará primero");
        }else{
            System.out.println("El arquero atacará primero");
        }
        while(arquero.vida>0 && guerrero.vida>0){
            if(aleatorio==0){
                arquero.vida=guerrero.ataqueEspada(arquero.vida,guerrero.ataque);
                if(arquero.vida>0){
                    guerrero.vida=arquero.ataqueArco(guerrero.vida,arquero.ataque);
                }
            }else{
                guerrero.vida=arquero.ataqueArco(guerrero.vida,arquero.ataque);
                if(guerrero.vida>0){
                    arquero.vida=guerrero.ataqueEspada(arquero.vida,guerrero.ataque);
                }
            }
        }
        if(arquero.vida<=0){
            System.out.println("El guerrero "+ guerrero.nombre+" ha ganado el combate");
        }else{
            System.out.println("El arquero "+arquero.nombre+" ha ganado el combate");
        }


    }

}

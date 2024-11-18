package Ejemplos;


//Se ha creado una clase que se llama Persona
public class Persona {

    //Sus atributos serán nombre y edad

    //El atributo nombre es un String
    String nombre;

    //El atributo edad es un Integer
    int edad;


    public void Saludar(){
        System.out.println("Buenas a todos");
    }

    public void CumplirAnyos(Persona nombre){
        System.out.println("Hoy es mi cumpleaños");
        nombre.edad++;
    }

    public void DecirEdad(int edad){
        System.out.println(edad);
    }

    //Constructor de la clase Persona
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

}

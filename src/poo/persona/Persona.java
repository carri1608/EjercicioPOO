package poo.persona;

//Se ha creado una clase que se llama Persona
public class Persona {

    //Sus atributos serán nombre y edad

    //El atributo nombre es un String
    String nombre;

    //El atributo edad es un Integer
    int edad;


    //Definimos sus metodos
    public void Saludar(){
        System.out.println("Buenas a todos");
    }

    public void CumplirAnyos(){
        System.out.println("Hoy es mi cumpleaños");
        this.edad++;
    }

    public void DecirEdad(int edad){
        System.out.println(edad);
    }

    //Constructor lleno de la clase Persona
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Constructor vacío
    public Persona() {
    }


}

package poo.persona;


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

    //Constructor lleno de la clase Persona
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Constructor vacío
    public Persona() {
    }



    //Para poder compararlos con equals mirando el contenido
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Persona persona = (Persona) o;
//        return edad == persona.edad && Objects.equals(nombre, persona.nombre);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(nombre, edad);
//    }
}

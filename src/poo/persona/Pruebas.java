package poo.persona;

public class Pruebas {

    public static void main(String[] args) {

        //Inicializado con el constructor lleno
        Persona juan = new Persona("juan",10);

        //Inicializado con el constructor vacío
        Persona prueba= new Persona();
        //Luego tendremos que darle los valores
        prueba.edad=10;
        prueba.nombre="juan";


        //Usamos el método para saludar
        juan.saludar();

        //Usamos el método definido para decir la edad, proporcionandole nuestra edad
        juan.decirEdad(juan.edad);

        //Con el objeto persona de juan podemos aumentar su edad con este método
        juan.cumplirAnyos();

        //Volvemos a pedirle la edad
        juan.decirEdad(juan.edad);


    }


    //Un método static (no asociado a una clase) con return int
    public static int suma(){
        return 2+2;
    }
    //Un método static (no asociado a una clase) sin return
    public static void metodoStatic(){
        System.out.println("soy un método static");
    }

}

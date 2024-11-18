package Ejemplos;

public class Pruebas {

    public static void main(String[] args) {
        Persona juan = new Persona("juan",10);


        //Usamos el método para saludar
        juan.Saludar();

        //Usamos el método definido para decir la edad, proporcionandole nuestra edad
        juan.DecirEdad(juan.edad);

        //Con el objeto persona de juan podemos aumentar su edad con este método
        juan.CumplirAnyos(juan);

        //Volvemos a pedirle la edad
        juan.DecirEdad(juan.edad);


    }

}

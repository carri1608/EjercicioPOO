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

        //Porque no se pueden comparar
        if(prueba.equals(juan)){
            System.out.println("Son iguales");
        }
        System.out.println(juan);
        System.out.println(prueba);

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

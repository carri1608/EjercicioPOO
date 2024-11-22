package poo.persona;

public class CompararObjetos {
    public static void main(String[] args) {

        //Creamos dos objetos Persona para compararlos
        Persona juan = new Persona("juan",10);
        Persona juan2 = new Persona("juan",10);

        if(juan2.equals(juan)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }


/*
        System.out.println(juan);
        System.out.println(juan2);
*/
    }

}

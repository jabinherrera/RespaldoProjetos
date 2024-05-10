//Clases abstractas
//Una clase abstracta puede heredar pero no ser instanciada
public abstract class Persona {

    //Los metodos abstractos DEBEN tener cuerpo, si no tienen cuerpo, se le puede agregar "abstract".
    //El metodo debe utilizar "abstract" para que las clases que hereden esta clase esten OBLIGADAS a crear este metodo.
    public abstract void mostrarNombre();

    //Como tiene cuerpo, no necesita el prefijo "abstract"
    public boolean validarRut(){
        return true;
    }


}

import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Persona {
    private String nombre;
    private int edad;
    private String rut;
    private String email;

    public Persona() {
    }

    public Persona(String nombre, int edad, String rut, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
        this.email = email;
    }


    public void crearJSON(Persona persona){
        //Serialization
        //Crea el archivo
        Gson pGson = new Gson();
        String stringJson = pGson.toJson(persona);
        System.out.println("stringJson = " + stringJson);

        //Deserialization
        //Obtiene datos desde el archivo
        Persona p2 = pGson.fromJson(stringJson, Persona.class);
        System.out.println("p2 = " + p2);
        FileWriter writer;
        try{
            writer = new FileWriter("persona.json");
            Gson gson = new GsonBuilder().create();
            gson.toJson(persona,writer);
            writer.close();
        }catch (IOException e){
            System.out.println("No se pudo guardar el archivo");
        }
    }




    /**
     *  Valida rut de la forma XXXXXXXX-X
     */
    public static Boolean validaRut ( String rut ) {
        Pattern pattern = Pattern.compile("^[0-9]+-[0-9kK]{1}$");
        Matcher matcher = pattern.matcher(rut);
        if ( matcher.matches() == false ) return false;
        String[] stringRut = rut.split("-");
        return stringRut[1].toLowerCase().equals(Persona.digitoVerificador(stringRut[0]));
    }

    /**
     * Valida el dígito verificador
     */
    public static String digitoVerificador ( String rut ) {
        Integer M=0,S=1,T=Integer.parseInt(rut);
        for (;T!=0;T=(int) Math.floor(T/=10))
            S=(S+T%10*(9-M++%6))%11;
        return ( S > 0 ) ? String.valueOf(S-1) : "k";
    }

    public void validarEmail(){
        // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        // El email a validar
        String email = "info@programacionextrema.com";

        Matcher mather = pattern.matcher(email);

        if (mather.find() == true) {
            System.out.println("El email ingresado es válido.");
        } else {
            System.out.println("El email ingresado es inválido.");
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", rut='" + rut + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

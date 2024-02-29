package Utilidades;

public class Validar {
    public static boolean validarMatricula(String matricula){
        return matricula.matches("^[0-9]{4}[A-Z]{3}$");
    }
    /*
      Valida si una cadena es una matricula europea (<2000)

      @param matricula String que contiene el valor a validar
      @return True = es una matricula europea (<2000)
     */
    public static boolean validarNumeroPlaza(int numPlaza){
        return (Integer.toString(numPlaza)).matches("^-?[0-9]+$")&&(numPlaza>=0&&numPlaza<10);
    }
}

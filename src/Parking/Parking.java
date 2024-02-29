/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parking;

import java.util.ArrayList;
import java.util.Collections;


public class Parking implements iParking {
    String nombreParking;//nombre del parking
    /*Declaracion array en java
        tipo_dato nombre_array[];
        nombre_array = new tipo_dato[tamanio];
     */
    int numPlazasParking;//numero de plazas del parking

    String[] plazasParking;//array para guardar las matriculas del parking


    public Parking(String nombreParking, int numPlazasParking){
        this.nombreParking = nombreParking;
        this.numPlazasParking = numPlazasParking;
        plazasParking = new String[numPlazasParking];
    }
    public void entrarCoche(int plaza, String matricula){
        if (plazasParking[plaza]!=null){
            System.out.println("La plaza ya está ocupada");
        } else {
            plazasParking[plaza] = matricula;
        }
    }
    public void sacarCoches(int plaza, String matricula){
        if(matricula.equals(plazasParking[plaza])){
            plazasParking[plaza]=null;
        } else if(plazasParking[plaza]==null) {
            System.out.println("La plaza no está ocupada");
        } else {
            System.out.println("La matricula del coche no coincide con la de esta plaza");
        }
    }
    public void plazasLibres(){
        int contadorPlazasLibres = 0;
        for (String s : plazasParking) {
            if (s == null)
                contadorPlazasLibres++;
        }
        System.out.println("Hay " + contadorPlazasLibres + " plazas libres");
    }
    public void buscarCoche(String matricula) {
        boolean estaElCoche = false;
        int plazaQueOcupa=0;
        for (int i=0; i<plazasParking.length; i++) {
            if (matricula.equals(plazasParking[i])){
                estaElCoche=true;
                plazaQueOcupa=i;
            }
        }
        if(estaElCoche){
            System.out.println("El coche se encuentra en la plaza " + plazaQueOcupa);
        } else System.out.println("El coche no está en el parking");
    }
    public void verParking () {
        System.out.println(nombreParking);
        System.out.println("Número total de plazas: " + numPlazasParking);
        plazasLibres();
        System.out.println("Ocupación de las plazas: ");
        for (int i = 0; i < plazasParking.length; i++) {
            String ocupacionDePlaza = (plazasParking[i]==null) ? "No ocupada" : plazasParking[i];
            System.out.println("Plaza " + i + ":" + ocupacionDePlaza);
        }
    }
}

package Parking;

public interface iParking {
    public void entrarCoche(int plaza, String matricula);
    public void sacarCoches(int plaza, String matricula);
    public void plazasLibres();
    public void buscarCoche(String matricula);
    public void verParking ();
}

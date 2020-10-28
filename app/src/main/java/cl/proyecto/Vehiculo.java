package cl.proyecto;

public class Vehiculo {
    private String pat;
    private String marca;
    private String modelo;
    private String linea;

    public static final Vehiculo[] vehiculos={
            new Vehiculo("AB-1234","Ford","Focus","220"),
            new Vehiculo("CD-5678","Chevrolet","Optra","220"),
            new Vehiculo("EF-9012","Daewoo","Lanos","220")
    };

    public Vehiculo(String patente, String marca, String modelo, String linea){
        this.pat = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.linea = linea;
    }

    public String getPat() {
        return pat;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getLinea() {
        return linea;
    }

    @Override
    public String toString() {
        return pat;
    }
}

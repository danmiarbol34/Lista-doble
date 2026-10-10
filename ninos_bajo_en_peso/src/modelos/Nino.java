package modelos;

public class Nino {

    private long NregCivil;
    private String Nombre;
    private float Talla;
    private float Peso;
    private int Edad;
    private String Municipio;

    public Nino(long NregCivil, String Nombre, float Talla, float Peso, int Edad, String Municipio) {
        this.NregCivil = NregCivil;
        this.Nombre = Nombre;
        this.Talla = Talla;
        this.Peso = Peso;
        this.Edad = Edad;
        this.Municipio = Municipio;
    }

    public long getNregCivil() {
        return NregCivil;
    }

    public void setNregCivil(long NregCivil) {
        this.NregCivil = NregCivil;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public float getTalla() {
        return Talla;
    }

    public void setTalla(float Talla) {
        this.Talla = Talla;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public String infoNino() {
        String info = "";
        info = "Datos  del Nino:\n"
                + "Registro civil : " + getNregCivil()
                + "\nNombre: " + getNombre()
                + "\nEdad: " + getEdad()
                + "\nTalla: " + getTalla()
                + "\nPeso: " + getPeso()
                + "\nMunicipio: " + getMunicipio();
        return info;
    }
}

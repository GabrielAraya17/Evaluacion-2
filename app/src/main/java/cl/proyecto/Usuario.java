package cl.proyecto;

public class Usuario {
    private String nombre="";
    private String apellido="";
    private String f_nac="";
    private String correo="";
    private String num_contacto="";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getF_nac() {
        return f_nac;
    }

    public void setF_nac(String f_nac) {
        this.f_nac = f_nac;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNum_contacto() {
        return num_contacto;
    }

    public void setNum_contacto(String num_contacto) {
        this.num_contacto = num_contacto;
    }
}

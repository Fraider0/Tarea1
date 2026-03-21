public class Person {

    public String nombre;
    public String apellido;
    public String correo;
    public int idIdentificacion;

    public Person() {
    }

    public Person(String nombre, String apellido, String correo, int idIdentificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.idIdentificacion = idIdentificacion;
    }


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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getIdIdentificacion() {
        return idIdentificacion;
    }

    public void setIdIdentificacion(int idIdentificacion) {
        this.idIdentificacion = idIdentificacion;
    }
}
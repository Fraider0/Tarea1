public class User extends Person{

    int libroPrestado;
    String rol;

    public User() {
    }

    public User(String nombre, String apellido, String correo, int idIdentificacion, int libroPrestado, String rol) {
        super(nombre, apellido, correo, idIdentificacion);
        this.libroPrestado = libroPrestado;
        this.rol = rol;
    }

    public int getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(int libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
import com.sun.scenario.effect.impl.prism.PrImage;

public class Contacto {
    public Contacto(String nombre, int telefono) {
        this.nombre=nombre;
        this.telefono=telefono;
    }

    public Contacto(String nombre) {
        this.nombre=nombre;
    }

    public Contacto(int telefono) {
        this.telefono=telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return   "Nombre: " + nombre + '\n' +
                "Telefono :" + telefono;
    }

    private String nombre;
    private int telefono;
    private String correo;
    private String direccion;

}

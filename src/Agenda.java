import java.util.Scanner;

public class Agenda {


    private Contacto[] contactos;

    public Agenda(int tamanio) {
        this.contactos = new Contacto[tamanio];
    }

    public void agregarContacto(Contacto c) {
        boolean creado = false;
        for (int i = 0; i < contactos.length && !creado; i++) {
            if (contactos[i] == null) {
                contactos[i] = c;
                creado = true;
            }
        }
    }

    public void listarContacto() {
        for (int i = 0; i < contactos.length; i++) {
            if(contactos[i] != null)
            {
                System.out.println(contactos[i]);

            }
        }
    }

    public boolean eliminarContacto(Contacto c) {
        boolean eliminado = false;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i]!=null && contactos[i].getNombre().equalsIgnoreCase(c.getNombre())) {
                contactos[i]=null;
                eliminado = true;
            }
        }
        return eliminado;
    }

    public Contacto buscarContacto(Contacto c) {
        try{
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i]!=null && contactos[i].getNombre().equalsIgnoreCase(c.getNombre())) {
                    return contactos[i];
                }
            }
        }
       catch (Exception e)
       {
           System.out.println("Se ha producido un error");
       }
        return c=null;

    }
    public boolean existeContacto(String nombre)
    {
        boolean existe= false;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i]!=null && contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                existe = true;
            }
        }
        return existe;
    }

    public boolean modificarNombreContacto(Contacto c) {
        boolean modifico = false;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese Nuevo nombre: ");
        String  nombre=teclado.next();
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i]!=null && contactos[i].getNombre().equalsIgnoreCase(c.getNombre())) {
                contactos[i].setNombre(nombre);
                modifico = true;
            }
        }
        return modifico;
    }
    public boolean modificarTelefonoContacto(Contacto c) {
        boolean modifico = false;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese Nuevo Telefono: ");
        int telefono=teclado.nextInt();

        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i]!=null && contactos[i].getNombre().equalsIgnoreCase(c.getNombre())) {
                contactos[i].setTelefono(telefono);
                modifico = true;
            }
        }
        return modifico;
    }
}

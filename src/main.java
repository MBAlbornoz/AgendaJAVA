import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una opcion: ");
        Agenda agendaContactos = new Agenda(10);
        Contacto contacto;
        String nombre;
        int telefono;
        //System.out.println("El valor ingresado es: "+ opcion);
        boolean salir = false;

        while (!salir) {
            menu.menuPrincipal();
            try {
                int opcion = teclado.nextInt();
                switch ( opcion ) {
                    case 1:
                        System.out.println("Nombre: ");
                        nombre = teclado.next();
                        System.out.println("Telefono: ");
                        telefono = teclado.nextInt();
                        contacto = new Contacto(nombre, telefono);
                        agendaContactos.agregarContacto(contacto);

                        break;
                    case 2:
                        agendaContactos.listarContacto();
                        break;
                    case 3:
                        System.out.println("Ingrese el nombre del contacto a eliminar: ");
                        nombre = teclado.next();
                        contacto = new Contacto(nombre);

                        if (agendaContactos.eliminarContacto(contacto)) {
                            System.out.println("El contacto se elimino correctamente");
                        } else {
                            System.out.println("No existe un contacto con ese nombre");
                        }

                        break;
                    case 4:
                        System.out.println("Ingrese el nombre del contacto a modificar: ");
                        nombre=teclado.next();
                        if (agendaContactos.existeContacto(nombre)) {
                            menu.menuModificar();
                            opcion = teclado.nextInt();
                            if (opcion == 1) {
                                contacto=new Contacto(nombre,0);
                               if( agendaContactos.modificarNombreContacto(contacto))
                               {
                                   System.out.println("se modifico el contacto");
                               }
                               else
                               {
                                   System.out.println("No se realiaron modificaciones");
                               }
                            } else if (opcion == 2) {
                                contacto=new Contacto(nombre,0);
                                if( agendaContactos.modificarTelefonoContacto(contacto))
                                {
                                    System.out.println("se modifico el contacto");
                                }
                                else
                                {
                                    System.out.println("No se realiaron modificaciones");
                                }

                            } else {
                                System.out.println("Opcion incorrecta");
                            }
                        }
                        else
                        {
                            System.out.println("No existe un usuario con ese nombre");
                        }
                        break;
                    case 5:
                        System.out.println("Ingrese el nombre del contacto que desea buscar: ");
                        nombre = teclado.next();
                        contacto = new Contacto(nombre);

                        if (agendaContactos.existeContacto(nombre)) {
                            contacto = agendaContactos.buscarContacto(contacto);
                            System.out.println("Nombre: " + contacto.getNombre());
                            System.out.println("Telefono:" + contacto.getTelefono());
                        } else {
                            System.out.println("No existe un contacto con ese nombre");
                        }
                        break;
                    case 6:
                        salir = true;
                        break;
                    default: {
                        System.out.println("Ingrese una de las opciones");
                    }
                }
            }
            catch (Exception e ) {
                System.out.println("Debe ingresar un numero");
                salir=true;
            }


        }
    }

}
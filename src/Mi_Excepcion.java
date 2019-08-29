public class Mi_Excepcion extends Exception {
    private int codigoError;

    public Mi_Excepcion(int codigoError){
        super();
        this.codigoError=codigoError;
    }

    @Override
    public String getMessage(){

        String mensaje="";

        switch(codigoError){
            case 111:
                mensaje="Error, el numero esta entre 0 y 10";
                break;
            case 222:
                mensaje="Error, el numero esta entre 11 y 20";
                break;
            case 333:
                mensaje="Error, el numero esta entre 21 y 30";
                break;
            default:
                mensaje="Se  ha producido un error";
        }

        return mensaje;

    }
}

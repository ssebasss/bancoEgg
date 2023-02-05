import Entidades.Cuenta;
import Servicio.MovimientosBancario;
import Servicio.ServicioAltaCliente;

public class Main {
    public static void main(String[] args) {

        ServicioAltaCliente svc=new ServicioAltaCliente();
        Cuenta c1=svc.AltaCliente();
        //System.out.println(c1.toString());
        //System.out.println(svc.AltaCliente());
        MovimientosBancario.Menu(c1);

        }


}
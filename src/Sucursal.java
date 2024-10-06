import java.util.ArrayList;

public class Sucursal {
    private ArrayList<Instrumento> listaIns;
    private String nombre;
    private int IDsucursal;
    public Sucursal(String nombre, int ID) {
        this.listaIns = new ArrayList<Instrumento>();
        this.nombre = nombre;
        this.IDsucursal = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIDsucursal() {
        return IDsucursal;
    }

    public void setIDsucursal(int IDsucursal) {
        this.IDsucursal = IDsucursal;
    }

    @Override
    public String toString() {
        return "Sucursal "+ nombre + " ID: " + IDsucursal;
    }
}

import java.util.ArrayList;

public class Fabrica {
    private ArrayList<Sucursal> listaSuc;
    private String nombre;
    public Fabrica(String nombre){
        this.nombre = nombre;
        this.listaSuc = new ArrayList<Sucursal>();
    }
    // AGREGAR SUC
    public void agregarSuc(Sucursal s) {
        listaSuc.add(s);
    }
    //Leer Suc
    public void leerSucursal (int ID) {
        for (Sucursal s: listaSuc) {
            if(s.getIDsucursal()==ID){
                System.out.println(s);
            }
        }
    }
    // leer todos
    public void leerTodas() {
        for (Sucursal s: listaSuc) {
            System.out.println(s.toString());
        }
    }
    //eliminar Suc
    public void eliminarSuc(String nombre) {
        boolean bandera = false;
        for (Sucursal s: listaSuc) {
            if (s.getNombre().equalsIgnoreCase(nombre)) {
                listaSuc.remove(s);
                bandera = true;
                break;
            }
        }
        if(bandera) {
            System.out.println("Se ha encontrado y modificado");
        } else {
            System.out.println("No ha encontrado y modificado");
        }
    }
    //actualizar
    public void actualizarSuc(Sucursal s) {
        for (int i =0; i < listaSuc.size(); i++) {
            if(listaSuc.get(i).getIDsucursal()==s.getIDsucursal()){
                listaSuc.set(i,s);
                System.out.println("Se ha encontrado y modificado");
            }
        }
    }
}

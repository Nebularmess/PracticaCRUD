// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
//        Una fábrica de instrumentos musicales posee una lista con todas sus sucursales. Cada sucursaltiene
//        su nombre y una lista con todos los instrumentos a la venta. De cada uno de ellos se sabe su ID
//        alfanumérico, su precio y su tipo (Percusión, Viento o Cuerda).
            Fabrica f = new Fabrica("Yamaha");
            Sucursal s = new Sucursal("punto", 8);
            Sucursal a = new Sucursal("po", 4);
            Sucursal c = new Sucursal("p", 3);
            f.agregarSuc(s);
            f.agregarSuc(c);
            f.agregarSuc(a);
            f.leerSucursal(8);
            f.eliminarSuc("punto");
            f.leerTodas();
            a.setNombre("la");
            f.actualizarSuc(a);
            f.leerTodas();
    }
}
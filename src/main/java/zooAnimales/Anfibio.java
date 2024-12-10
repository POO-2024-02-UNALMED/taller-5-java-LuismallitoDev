package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
    private static ArrayList<Anfibio> listado = new ArrayList<>();
    private static int ranas = 0;
    private static int salamandras = 0;
    private String colorPiel;
    private boolean venenoso;

    // Constructor vacío
    public Anfibio() {
        listado.add(this);
    }

    // Constructor con parámetros
    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }

    // Métodos de creación específicos
    public static Anfibio crearRana(String nombre, int edad, String genero) {
        ranas++;
        Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
        return rana;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        salamandras++;
        Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
        return salamandra;
    }

    // Métodos estáticos específicos
    public static int cantidadAnfibios() {
        return listado.size();
    }

    @Override
    public String movimiento() {
        return "saltar";
    }

    // Getters y setters
    public static ArrayList<Anfibio> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Anfibio> listado) {
        Anfibio.listado = listado;
    }

    public static int getRanas() {
        return ranas;
    }

    public static void setRanas(int ranas) {
        Anfibio.ranas = ranas;
    }

    public static int getSalamandras() {
        return salamandras;
    }

    public static void setSalamandras(int salamandras) {
        Anfibio.salamandras = salamandras;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
}

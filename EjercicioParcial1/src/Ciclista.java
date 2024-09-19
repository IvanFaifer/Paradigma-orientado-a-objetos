// Clase abstracta Ciclista
abstract class Ciclista {
    private int id;
    private String nombre;
    private double tiempoAcumulado;

    public Ciclista(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.tiempoAcumulado = 0.0;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(double tiempo) {
        this.tiempoAcumulado = tiempo;
    }

    public void imprimirDatos() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo acumulado: " + tiempoAcumulado + " minutos");
    }

    public abstract String imprimirTipo();
}
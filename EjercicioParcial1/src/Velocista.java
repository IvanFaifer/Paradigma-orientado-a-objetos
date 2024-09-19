// Clase Velocista
class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadSprint;

    public Velocista(int id, String nombre, double potenciaPromedio, double velocidadSprint) {
        super(id, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadSprint = velocidadSprint;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadSprint() {
        return velocidadSprint;
    }

    public void setVelocidadSprint(double velocidadSprint) {
        this.velocidadSprint = velocidadSprint;
    }

    @Override
    public String imprimirTipo() {
        return "Es un Velocista";
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Potencia promedio: " + potenciaPromedio + " vatios");
        System.out.println("Velocidad en sprint: " + velocidadSprint + " km/h");
    }
}
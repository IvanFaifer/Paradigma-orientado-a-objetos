import java.util.ArrayList; // Importar ArrayList

// Clase Equipo
class Equipo {
    private String nombre;
    private ArrayList<Ciclista> ciclistas;
    private static double totalTiempo;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.ciclistas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void añadirCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
    }

    public double calcularTotalTiempo() {
        totalTiempo = 0;
        for (Ciclista ciclista : ciclistas) {
            totalTiempo += ciclista.getTiempoAcumulado();
        }
        return totalTiempo;
    }

    public void listarCiclistas() {
        for (Ciclista ciclista : ciclistas) {
            System.out.println(ciclista.getNombre());
        }
    }

    public void imprimirDatosCiclista(int id) {
        for (Ciclista ciclista : ciclistas) {
            if (ciclista.getId() == id) {
                ciclista.imprimirDatos();
                return;
            }
        }
        System.out.println("Ciclista con ID " + id + " no encontrado.");
    }
}

public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Equipo Pro");

        Velocista velocista = new Velocista(1, "Juan Pérez", 400.5, 70.0);
        Escalador escalador = new Escalador(2, "Carlos Martínez", 3.5f, 30.0f);
        Contrarrelojista contrarrelojista = new Contrarrelojista(3, "Ana López", 60.0);

        velocista.setTiempoAcumulado(120);
        escalador.setTiempoAcumulado(130);
        contrarrelojista.setTiempoAcumulado(115);

        equipo.añadirCiclista(velocista);
        equipo.añadirCiclista(escalador);
        equipo.añadirCiclista(contrarrelojista);

        System.out.println("Lista de ciclistas en el equipo:");
        equipo.listarCiclistas();

        System.out.println("\nTotal de tiempos acumulados: " + equipo.calcularTotalTiempo() + " minutos");

        System.out.println("\nImprimir datos de ciclista con ID 2:");
        equipo.imprimirDatosCiclista(2);

        System.out.println("\nImprimir datos de ciclista con ID 5:");
        equipo.imprimirDatosCiclista(5);
    }
}
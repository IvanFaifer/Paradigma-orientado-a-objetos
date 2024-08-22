public class juego {
    public int Vidas;
    public juego (int vidasIniciales) {
        this.Vidas = vidasIniciales;
    }

    public void MuestraVidasRestantes() {
        System.out.println("Vidas restantes: " + Vidas);
    }
}

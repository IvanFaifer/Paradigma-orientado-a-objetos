public class juego {

    public int vidas;
    public int vidasIniciales;

    public juego (int vidasIniciales) {
        this.vidas = vidasIniciales;
        this.vidasIniciales = vidasIniciales;
    }

    public boolean quitaVida() {
        if (vidas > 0) {
            vidas--;
            if (vidas==0) {
                System.out.println("El jugador no tiene mas vidas");
            }
            return vidas > 0;
        }
        return false;
    }

    public void reinciarPartida() {
        vidas= vidasIniciales;
    }
    public int getVidas(){
        return vidas;//metodo para obtener el numero de vidas actuales(opcional)
    }
}

public class Main {
    public static void main(String[] args) {
        juego juego = new juego(3);//inicia el juego con 3 vidas

        //simulacion del juego
        while(juego.quitaVida()){
            System.out.println("Vidas restantes: " + juego.getVidas());
        }
        System.out.println("fin del juego... reinciiando");
        juego.reinciarPartida();
        System.out.println("vidas despues de reinciar " + juego.getVidas());

    }
}
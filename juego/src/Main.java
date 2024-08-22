public class Main {
    public static void main(String[] args){
     juego juego1 = new juego(5);
     juego1.MuestraVidasRestantes();

     juego1.Vidas--;
     juego1.MuestraVidasRestantes();

     juego juego2 = new juego(5);
     juego2.MuestraVidasRestantes();

     juego1.MuestraVidasRestantes();
    }
}
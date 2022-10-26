public class Aeroporto {
    public static void main(String[] args) {
        Avião avião1 = new Avião();
        avião1.partida(10, 900);
        avião1.estadoAvião();

        avião1.ajustarAltitude(-1);
        avião1.ajustarVelocidade(-100);
        avião1.estadoAvião();

        avião1.ajustarAltitude(-10);
        avião1.estadoAvião();
    }
}

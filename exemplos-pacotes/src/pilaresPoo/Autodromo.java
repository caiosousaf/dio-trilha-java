package pilaresPoo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("8908789");
        //jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("92902");
        //z400.ligar();

        Veiculo coringa = jeep;

        coringa.ligar();
    }
}

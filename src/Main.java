import br.com.AluraDesafios.Desafios.modelos.Musica;

public class Main {
    public static void main(String[] args){

        Musica iAmBack = new Musica();
        iAmBack.setNome("I'am back");
        iAmBack.setDuracao(3);
        iAmBack.reproduzir();
        iAmBack.classificar(2);
        iAmBack.curtir();
        System.out.println("Curtidas: " + iAmBack.getCurtidas());
        iAmBack.classificar(9);

    }
}
package br.com.AluraDesafios.Desafios.modelos;

public class Musica extends Audio {
    public void reproduzir() {
        System.out.println("Reproduzindo " + getNome() + "...\n");
        int totalAtualizado = getTotalDeReproducoes() + 1;
        setTotalDeReproducoes(totalAtualizado);
        System.out.println("Total de reproduções atualizado para: " + getTotalDeReproducoes());
    }

    public void classificar(int nota) {
        int classificacaoTotal = nota + getClassificacao();
        System.out.println("Nota atualizadada de " + getClassificacao() + "para" + classificacaoTotal);
        setClassificacao(classificacaoTotal);
    }

    public void curtir() {
        int curtidasTotal = getCurtidas() + 1;
        setCurtidas(curtidasTotal);
    }
}

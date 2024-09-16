package br.com.AluraDesafios.Desafios.modelos;

public class Audio {

        private String nome;
        private int duracao;
        private int totalDeReproducoes;
        private int curtidas;
        private int classificacao;
        private int qntdClassificacoes;

        public int getClassificacao() {
            return classificacao;
        }

        void setClassificacao(int classificacao){
            this.classificacao = classificacao;
        }

        public int getCurtidas() {
            return curtidas;
        }

        void setCurtidas(int curtidas){
            this.curtidas = curtidas;
        }

        public int getDuracao() {
            return duracao;
        }

        public void setDuracao(int duracao) {
            this.duracao = duracao;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getTotalDeReproducoes() {
            return totalDeReproducoes;
        }

        void setTotalDeReproducoes(int totalDeReproducoes){
            this.totalDeReproducoes = totalDeReproducoes;
        }

}

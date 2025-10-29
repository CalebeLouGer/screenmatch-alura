import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme favorito = new Filme("Demon Slayer: Castelo Infinito",2025);
        favorito.setDuracaoEmMinutos(185);
        favorito.setIncluidoNoPlano(true);

        favorito.exibirFichaTecnica();
        favorito.avaliar(9);
        favorito.avaliar(8.4);
        favorito.avaliar(10);

        String mensagemMedia = String.format("Média de avaliações do Filme: %.1f", favorito.retornarMedia());
        //System.out.println(mensagemMedia);

        Serie friends = new Serie("Friends",1990);
        friends.exibirFichaTecnica();
        friends.setAtiva(true);
        friends.setIncluidoNoPlano(true);
        friends.setTemporada(10);
        friends.setEpisodioPorTemporada(20);
        friends.setMinutosPorEpisodio(23);
        //System.out.println("Duração para maratonar Friends: "+friends.getDuracaoEmMinutos());

        CalculadoraDeTempo calc = new CalculadoraDeTempo();

        Filme outroFilme = new Filme("Quarteto Fantástico: Origem",2025);
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.setIncluidoNoPlano(true);

        calc.incluir(favorito);
        calc.incluir(outroFilme);
        calc.incluir(friends);
        System.out.println("Tempo Total: "+calc.getTempoTotal());

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(favorito);

        Episodio ep = new Episodio();
        ep.setNumero(1);
        ep.setSerie(friends);
        ep.setTotalVisualizacoes(90);
        filtro.filtra(ep);

        var filmeBom = new Filme("Harry Potter e o Cálice de Fogo",2004);
        filmeBom.setDuracaoEmMinutos(200);
        filmeBom.avaliar(9.4);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(favorito);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(filmeBom);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
    }
}

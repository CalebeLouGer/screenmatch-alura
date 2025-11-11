package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.exception.AnoInvalidoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> listaDeFilmes = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!busca.equalsIgnoreCase("sair")){
            System.out.println("Informe um filme: ");
            busca = leitura.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }
            String chave = "5397d6b1";
            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ","+") + "&apikey=" + chave;
            try{
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                System.out.println("-------------------------------------------------------");
                TituloOmdb meuTituloOmbd = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmbd);

                Titulo meuTitulo = new Titulo(meuTituloOmbd);
                listaDeFilmes.add(meuTitulo);

            }catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: " + e.getMessage());
            }catch (IllegalArgumentException e){
                System.out.println("Aconteceu um erro no argumento: " + e.getMessage());
            }catch (AnoInvalidoException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("-------------------------------------------------------");

        System.out.println(listaDeFilmes);
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(listaDeFilmes));
        escrita.close();
        System.out.println("\n");

        System.out.println("Programa finalizou corretamente!");

    }
}

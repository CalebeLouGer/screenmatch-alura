# ScreenMatch (Alura)

Uma aplicação Java construída durante o curso da Alura com o objetivo de fornecer funcionalidades de busca, exibição e gerenciamento de filmes/séries — demonstrando conceitos de orientação a objetos, tratamento de exceções e persistência de dados simples.

---

## Sumário

- [Visão Geral](#visão-geral)  
- [Funcionalidades](#funcionalidades)  
- [Tecnologias Utilizadas](#tecnologias-utilizadas)  
- [Como Executar Localmente](#como-executar-localmente)  
- [Estrutura do Projeto](#estrutura-do-projeto)  
- [Sobre o Autor](#sobre-o-autor)  
- [Contribuição](#contribuição)  

---

## Visão Geral

Este projeto foi desenvolvido como parte de um curso na Alura, com o nome “ScreenMatch”. Ele demonstra de forma prática como criar uma aplicação em Java que simula parte de um sistema de catálogo de filmes/séries — incluindo classes de domínio, leitura de arquivo, tratamento de dados e saída formatada.  
Ideal para quem está iniciando em Java e quer ver como conceitos como encapsulamento, coleções, exceções e IO se aplicam.

---

## Funcionalidades

- Leitura de um arquivo de dados que representa filmes/séries (por exemplo, CSV ou JSON)  
- Criação de objetos para cada item (Filme, Série)  
- Cálculo de avaliações médias, exibição de informações de cada item  
- Tratamento de erros de leitura/arquivo, entradas inválidas, etc.  
- (Possivelmente) interface simples de console para interação com o usuário  

---

## Tecnologias Utilizadas

- **Java** (versão usada no curso)  
- Ambiente de desenvolvimento recomendado: IDE (ex: IntelliJ, Eclipse, VS Code + extensão Java)  
- Ambiente de execução: JDK instalado localmente  
- Bibliotecas padrão (java.util, java.io, java.nio, etc)  

---

## Como Executar Localmente
````
1. Clone este repositório  

   - git clone https://github.com/CalebeLouGer/screenmatch-alura.git

2. Acesse o diretório do projeto

   - cd screenmatch-alura

3. Abra o projeto na sua IDE favorita ou compile via terminal

   - javac src/**/*.java

4. Execute a classe principal (por exemplo)

   - java -cp src your.main.ClassName

   Ajuste “your.main.ClassName” para o nome correto da classe que contém o `main`.

````
## Estrutura do Projeto

```
screenmatch-alura/
├── src/
│   ├── dominio/
│   │   ├── Filme.java
│   │   ├── Serie.java
│   │   └── …  
│   ├── validacao/
│   │   └── …  
│   ├── principal/
│   │   └── Principal.java  
├── data/
│   └── filmes-series.csv (ou outro arquivo de entrada)  
├── .gitignore
├── README.md
└── …
```

* `src/`: contém todo o código-fonte Java organizado por pacotes (domínio, validação, etc).
* `data/`: arquivos de dados de entrada utilizados pela aplicação (se houver).
* `.gitignore`: arquivos e pastas ignoradas pelo Git.
* `README.md`: este arquivo explicativo.

---

## Sobre o Autor

Olá! Eu sou o **CalebeLouGer**, desenvolvedor em início de carreira, estudante, comunicativo e participativo — sempre buscando aprender com diferentes perspectivas e aplicar com verdade o que estudo. Este projeto faz parte da minha formação, especialmente no estudo de Java e boas práticas de software.

---

## Contribuição

Contribuições são bem-vindas! Se você deseja ajudar com melhorias, correção de bugs ou novas funcionalidades, siga estes passos:

1. Crie um fork do projeto
2. Crie uma nova branch (`git checkout -b minha-melhoria`)
3. Faça commit das suas alterações (`git commit -m "Minha melhoria"`)
4. Publique sua branch (`git push origin minha-melhoria`)
5. Abra um Pull Request explicando suas alterações

---

## Contato

Se quiser trocar ideias, aprender juntos ou colaborar, entre em contato comigo!
(https://www.linkedin.com/in/calebelouger/)

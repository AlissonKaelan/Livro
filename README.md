
# Projeto Livro

Este projeto é uma implementação simples de um sistema de gerenciamento de livros e leitores em Java. O sistema permite que um leitor interaja com livros, abrindo, fechando e folheando páginas.

## Estrutura do Projeto

O projeto é composto por quatro classes principais:

1. **Pessoa**
2. **Livro**
3. **Publicacao** (interface)
4. **ProjetoLivro** (classe principal)

### 1. Classe Pessoa

A classe `Pessoa` representa um leitor. Possui os seguintes atributos e métodos:

- **Atributos:**
  - `nome`: Nome da pessoa.
  - `sexo`: Sexo da pessoa.
  - `idade`: Idade da pessoa.

- **Métodos:**
  - `fazerAniversario()`: Incrementa a idade da pessoa em 1.
  - Getters e Setters para os atributos.

### 2. Classe Livro

A classe `Livro` implementa a interface `Publicacao` e representa um livro. Possui os seguintes atributos e métodos:

- **Atributos:**
  - `titulo`: Título do livro.
  - `autor`: Autor do livro.
  - `totalPaginas`: Total de páginas do livro.
  - `paginaAtual`: Página atual que o leitor está.
  - `aberto`: Indica se o livro está aberto ou fechado.
  - `leitor`: Referência ao objeto `Pessoa` que está lendo o livro.

- **Métodos:**
  - `detalhes()`: Retorna uma string com os detalhes do livro.
  - Getters e Setters para os atributos.
  - Métodos da interface `Publicacao`:
    - `abrir()`: Abre o livro.
    - `fechar()`: Fecha o livro.
    - `folhear(int paginaFolhada)`: Folheia para uma página específica.
    - `avancarPagina()`: Avança uma página.
    - `voltarPagina()`: Volta uma página.

### 3. Interface Publicacao

A interface `Publicacao` define os métodos que devem ser implementados por qualquer classe que represente uma publicação (neste caso, um livro). Os métodos são:

- `abrir()`
- `fechar()`
- `folhear(int paginaFolhada)`
- `avancarPagina()`
- `voltarPagina()`

### 4. Classe ProjetoLivro

A classe `ProjetoLivro` contém o método `main`, que é o ponto de entrada do programa. Neste método, são criados objetos das classes `Pessoa` e `Livro`, e algumas interações são demonstradas, como abrir um livro e folhear para uma página.

## Exemplo de Uso

```java
public static void main(String[] args) {
    Pessoa[] pessoas = new Pessoa[2];
    Livro[] livros = new Livro[3];
    
    pessoas[0] = new Pessoa("Alisson", "M", 20);
    pessoas[1] = new Pessoa("Carol","F" , 20);
    
    livros[0] = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1216, pessoas[0]);
    livros[1] = new Livro("1984","George Orwell", 328, pessoas[0]);
    livros[2] = new Livro("Dom Casmurro", "Machado de Assis", 304, pessoas[1]);
     
    livros[0].abrir();
    livros[0].folhear(2000); // Tentativa de folhear para uma página inválida
    System.out.println(livros[0].detalhes());
}



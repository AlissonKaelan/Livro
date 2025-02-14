
package projetolivro;

/**
 *
 * @author Alisson Kaelan
 */
public class ProjetoLivro {

    
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[2];
        Livro[] livros = new Livro[3];
        
        
        pessoas[0] = new Pessoa("Alisson", "M", 20);
        pessoas[1] = new Pessoa("Carol","F" , 20);
        
        livros[0] = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1216, pessoas[0]);
        livros[1] = new Livro("1984","George Orwell", 328, pessoas[0]);
        livros[2] = new Livro("Dom Casmurro", "Machado de Assis", 304, pessoas[1]);
         
        livros[0].abrir();
        livros[0].folhear(2000);
        System.out.println(livros[0].detalhes());
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolivro;

/**
 *
 * @author Alisson Kaelan
 */
public class Livro implements Publicacao{
    private String titulo, autor;
    private int totalPaginas, paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    
    public String detalhes() {
        return "Livro \n" + "titulo = " + titulo + "\n, autor = " + autor + "\n, totalPaginas = " + totalPaginas + "\n, paginaAtual = " + paginaAtual + "\n, aberto = " + aberto + "\n, leitor = " + leitor.getNome();
    }
    
   

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.aberto = false;
        this.paginaAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    @Override
    public void abrir() {
    this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int paginaFolhada) {
        if(paginaFolhada > this.totalPaginas){
            this.paginaAtual = 0;
        } else{
            this.paginaAtual = paginaFolhada;
        }
    }

    @Override
    public void avancarPagina() {
    this.paginaAtual++;
    }
    

    @Override
    public void voltarPagina() {
        this.paginaAtual--;
    }
    
}

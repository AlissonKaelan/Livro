/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package projetolivro;

/**
 *
 * @author Alisson Kaelan
 */
public interface Publicacao {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int paginaFolhada);
    public abstract void avancarPagina();
    public abstract void voltarPagina();
    
}

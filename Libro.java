/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

public class Libro {

    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;
    
    public Libro(){}
    public Libro(String titulo, String autor, int ejemplares, int prestados){
    this.titulo = titulo;
    this.autor = autor;
    this.ejemplares = ejemplares;
    this.prestados = prestados;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the ejemplares
     */
    public int getEjemplares() {
        return ejemplares;
    }

    /**
     * @param ejemplares the ejemplares to set
     */
    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    /**
     * @return the prestados
     */
    public int getPrestados() {
        return prestados;
    }

    /**
     * @param prestados the prestados to set
     */
    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    
    public boolean prestamo(){
    boolean estado = true;
    if(ejemplares == 0){
    estado = false;
    }else{
    estado = true;
    ejemplares--;
    prestados++;
    }
    return estado;
    }
    
    public boolean decremente(){
    boolean devolucion = true;
    if(prestados <= 0){
    devolucion = false;
    } else {
    prestados--;
    ejemplares++;
    }
    return devolucion;
    }
    
    public String toString(){
    return "El libro con titulo " + titulo + " del autor " + autor 
            + "\n se poseen " + ejemplares + " ejemplares"+ " y se encuentran prestados " + prestados;
    }
}

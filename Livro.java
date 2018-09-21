package applivraria;

public class Livro {
    private String titulo;
    private String autor;
    private int ISBN;
    private String genero;
    private float preco;
    
    //public Livro()[];
    public Livro(String titulo, String autor, int ISBN, String genero, float preco){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.preco = preco;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getISBN(){
        return ISBN;
    }
    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public float getPreco(){
        return preco;
    }
    public void setPreco(float preco){
        if(preco > 0){
        this.preco = preco;
    }
    
    //public String imprimir(){
        //return "Titulo: " + titulo + "Autor: " + autor + "Genero: " + genero + "ISBN: " + ISBN +  "Preço: " + preco;
    }
}

package clases;

public class Libro {
    private Autor autor;
    private String titulo;
    private int publi;
    private int pags;
    private float precio;
    
    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getPubli() {
        return publi;
    }
    public void setPubli(int publi) {
        this.publi = publi;
    }
    public int getPags() {
        return pags;
    }
    public void setPags(int pags) {
        this.pags = pags;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}

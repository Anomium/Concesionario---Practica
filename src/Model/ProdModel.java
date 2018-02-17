package Model;
public class ProdModel {
    private String id;
    private String marca;
    private String color;
    private double precio;
    private int ano;
    
    public ProdModel(){
        
    }
    
    public ProdModel(String id, String marca, String color, double precio, int ano){
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.id = id;
        this.ano = ano;
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String Color){
        this.color = color;
    }
    
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int[] getMarca(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}

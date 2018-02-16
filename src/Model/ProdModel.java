package Model;
public class ProdModel {
    private String id;
    private String marca;
    private String color;
    private double precio;
    
    public ProdModel(String id, String marca, String color, double precio){
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.id = id;
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
    
    
}

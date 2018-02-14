package Model;
import Controller.CarroController;
public class ProdModel {
    private String marca;
    private String color;
    private double precio;
    
    public ProdModel(String marca, String color, double precio){
        this.marca = marca;
        this.color = color;
        this.precio = precio;
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
    
}

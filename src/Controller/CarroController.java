package Controller;
import Model.ProdModel;
import java.util.ArrayList;
public class CarroController {
    
    private ArrayList<ProdModel> carros = new ArrayList<ProdModel>();
    
    public void Create(ProdModel prodmodel){
        
        carros.add(prodmodel);
        
    }
    
    public void update(){
        
    }
    
    public void read(){
        
    }
    
    public void delete(){
        
    }
    
    public ArrayList<ProdModel> getCarros(){
        return carros;
    }
    
}

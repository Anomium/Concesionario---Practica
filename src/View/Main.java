package View;
import Controller.CarroController;
import Model.ProdModel;
public class Main {
    public static void main(String args[]){
        
        CarroController carro = new CarroController();
        
        carro.Create(new ProdModel("10", "Bochido", "Rojo", 1000));
        carro.Create(new ProdModel("10", "Ferrari", "Rojo", 1000));
        carro.Create(new ProdModel("10", "Humer", "Rojo", 1000));
        
        for (int i = 0; i < carro.getCarros().size(); i++) {
            System.out.println(carro.getCarros().get(i).getMarca());
        }
        
        
    }
}

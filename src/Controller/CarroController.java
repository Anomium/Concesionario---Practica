package Controller;

import javax.swing.JTable;
import Model.ProdModel;
import java.util.ArrayList;

public class CarroController {

    private ArrayList<ProdModel> carros = new ArrayList<ProdModel>();

    public void Create(ProdModel prodmodel) {

        carros.add(prodmodel);

    }

    public void update() {

    }

    public void read() {

    }

    public void delete() {

    }

    public ArrayList<ProdModel> getCarros() {
        return carros;
    }

    public void listarTabla(javax.swing.JTable jTable2) {
        Object[][] matriz = new Object[getCarros().size()][4];
        
        for (int i = 0; i < getCarros().size(); i++) {
            matriz[i][0] = getCarros().get(i).getMarca();
            matriz[i][1] = getCarros().get(i).getColor();
            matriz[i][2] = getCarros().get(i).getPrecio();
            matriz[i][3] = getCarros().get(i).getAno();
        }
        
        
        jTable2.setModel(new javax.swing.table.DefaultTableModel(


                matriz,
                new String[]{
                    "Marca", "Color", "Precio", "Año"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        

        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
        }

    }

}

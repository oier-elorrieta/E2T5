package Metodoak;
import Vista.Vista;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTable;

import Pojoak.Bidaia;

public class Metodoak {
	public void eliminarBidaia(int selectedRow) {
	    // Verifica si la fila seleccionada es válida
	    if (selectedRow >= 0) {
	        // Obtén el nombre del viaje seleccionado
	        String bidaiaNombre = (String) BidaiaTable.getValueAt(selectedRow, 0);

	        // Buscar la Bidaia que corresponde al nombre
	        for (int i = 0; i < arraAgen.size(); i++) {
	            ArrayList<Bidaia> arrBidaia = arraAgen.get(i).getArraBida();
	            for (int j = 0; j < arrBidaia.size(); j++) {
	                if (arrBidaia.get(j).getIzena().equals(bidaiaNombre)) {
	                    // Elimina la Bidaia de la lista
	                    arrBidaia.remove(j);
	                    break; // Salimos del ciclo una vez eliminada la Bidaia
	                }
	            }
	        }
	        
	        // Ahora actualizamos la tabla para reflejar los cambios
	        actualizarTabla();
	    }
	}
	public void actualizarTabla() {
	    // Resetea el modelo de la tabla
	    modeloa.setRowCount(0); 

	    // Vuelve a agregar los datos del ArrayList a la tabla
	    for (int i = 0; i < arraAgen.size(); i++) {
	        for (int j = 0; j < arraAgen.get(i).getArraBida().size(); j++) {
	            Object[] fila = new Object[modeloa.getColumnCount()];
	            fila[0] = arraAgen.get(i).getArraBida().get(j).getIzena();
	            fila[1] = arraAgen.get(i).getArraBida().get(j).getMota();
	            fila[2] = arraAgen.get(i).getArraBida().get(j).getEgunak();
	            fila[3] = arraAgen.get(i).getArraBida().get(j).getHasieraData();
	            fila[4] = arraAgen.get(i).getArraBida().get(j).getAmaieraData();
	            fila[5] = arraAgen.get(i).getArraBida().get(j).getHerrialdea();
	            modeloa.addRow(fila);
	        }
	    }

	    // Actualiza la tabla
	    BidaiaTable.setModel(modeloa);
	}
}
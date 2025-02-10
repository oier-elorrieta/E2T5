package Metodoak;
import Vista.Vista;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTable;

import Pojoak.Agentzia;
import Pojoak.Bidaia;

public class Metodoak {
	 JTable BidaiaTable;;
	ArrayList <Agentzia> arraAgen = new ArrayList ();
	public void eliminarBidaia(int selectedRow) {
	    // Obtener el nombre del viaje de la columna "Bidaia"
	    String bidaiaNombre = (String) BidaiaTable.getValueAt(selectedRow, 0);

	    // Buscar y eliminar el viaje de la lista
	    for (int i = 0; i < arraAgen.size(); i++) {
	        ArrayList<Bidaia> arrBidaia = arraAgen.get(i).getArraBida();
	        for (int j = 0; j < arrBidaia.size(); j++) {
	            if (arrBidaia.get(j).getIzena().equals(bidaiaNombre)) {
	                arrBidaia.remove(j); // Eliminar la Bidaia
	                break;
	            }
	        }
	    }
	}
}

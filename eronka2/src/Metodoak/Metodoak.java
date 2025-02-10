package Metodoak;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTable;

import Pojoak.Bidaia;

public class Metodoak {
    
	ArrayList <Bidaia> arraBida;
	public void TaulaKargatu() {
		 
		Array[] array = new Array [7];
		for(int i = 0; i<arraBida.size();i++) {
			array[0] = arraBida.get(i).getIzena();
			array[1] = arraBida.get(i).getHasieraData();
		}
	}

}

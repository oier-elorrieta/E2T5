package Probak;

import java.util.ArrayList;
import java.util.List;

import Pojoak.Agentzia;
import Pojoak.*;
import ModeloDao.AgentziaDao;
public class Proba {
     
	public static void main(String[] args) {
	AgentziaDao agentziaDao = new AgentziaDao();
	ArrayList<Agentzia> agentziak = agentziaDao.AgentziaKargatuBidaiekin();
	for (int i=0;i<agentziak.size();i++) {
		System.out.println(agentziak.get(i));
		for (int j=0;j<agentziak.get(i).getArraBida().size();j++) {
			System.out.println(agentziak.get(i).getArraBida().get(j));
			for(Ekitaldi e:agentziak.get(i).getArraBida().get(j).getArraEkit()) {
				System.out.println(e);
			}
				
		}
		
	}
	
	
	
		

}
}
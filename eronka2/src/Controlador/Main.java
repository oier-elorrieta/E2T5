package Controlador;

import java.awt.EventQueue;

import Vista.Vista;

public class Main {
	  public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    Vista window = new Vista();
	                    window.frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }

}

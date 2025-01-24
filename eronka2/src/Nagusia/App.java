package Nagusia;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import Pojoak.AeroportuPOJO.Aereportu;
import Pojoak.AgentziaPOJO.Agentzia;
import Pojoak.BidaiaPOJO.Bidaia;
import Pojoak.EkitaldiPOJO.Ekitaldi;
import Pojoak.HerrialdePOJO.Herrialde;
import Pojoak.HiriaPOJO.Hiria;

public class App {
	private JPanel HasieratuPanel = new JPanel();
	private JPanel OngiEtorriPanel = new JPanel();
	private JPanel AgentziaBerriPanel = new JPanel();
	private ArrayList <Agentzia> arraAgen = new ArrayList();
	private ArrayList <Bidaia> arraBida = new ArrayList();
	private ArrayList <Ekitaldi> arraEkit = new ArrayList();
	private ArrayList <Herrialde> arraHerr = new ArrayList();
	private ArrayList <Hiria> arraHiri = new ArrayList();
	private ArrayList <Aereportu> arraAero = new ArrayList();
	

    private JFrame frame;
    private JTextField AgentziaTextField;
    private JPasswordField PasahiztaField;
    private JTextField AgentziaIzenBerri;
    private JTextField MarkaKoloreField;
    private JTextField LogoField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    App window = new App();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public App() {
        OngiEtorri();
    }

    private void OngiEtorri() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setUndecorated(true);
        frame.getContentPane().setLayout(null);
        HasieratuPanel.setVisible(false);
        AgentziaBerriPanel.setVisible(false);
        
       
        AgentziaBerriPanel.setBounds(10, 33, 760, 533);
        frame.getContentPane().add(AgentziaBerriPanel);
        AgentziaBerriPanel.setLayout(null);
        
        JLabel AgentziaBerriLabel = new JLabel("Agentziaren izena");
        AgentziaBerriLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        AgentziaBerriLabel.setBounds(132, 96, 157, 30);
        AgentziaBerriPanel.add(AgentziaBerriLabel);
        
        
        AgentziaIzenBerri = new JTextField();
        AgentziaIzenBerri.setBounds(331, 100, 146, 28);
        AgentziaBerriPanel.add(AgentziaIzenBerri);
        AgentziaIzenBerri.setColumns(10);
        
        JLabel MarkaKoloreLabel = new JLabel("Markaren Kolorea");
        MarkaKoloreLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        MarkaKoloreLabel.setBounds(132, 152, 157, 30);
        AgentziaBerriPanel.add(MarkaKoloreLabel);
        
        MarkaKoloreField = new JTextField();
        MarkaKoloreField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        MarkaKoloreField.setText("#FFFFFF");
        MarkaKoloreField.setBounds(331, 150, 146, 30);
        AgentziaBerriPanel.add(MarkaKoloreField);
        MarkaKoloreField.setColumns(10);
        
        JLabel EmpleatuKopuruLabel = new JLabel("Langile kopurua");
        EmpleatuKopuruLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        EmpleatuKopuruLabel.setBounds(132, 204, 157, 22);
        AgentziaBerriPanel.add(EmpleatuKopuruLabel);
        
        JEditorPane editorPane = new JEditorPane();
        editorPane.setBounds(512, 152, 107, 20);
        AgentziaBerriPanel.add(editorPane);
        
        JComboBox LangileKopuruaBox = new JComboBox();
        LangileKopuruaBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
        LangileKopuruaBox.setModel(new DefaultComboBoxModel(new String[] {"2 eta 10 langile artean", "10 eta 100 langile artean", "100 eta 100 langile artean"}));
        LangileKopuruaBox.setBounds(331, 200, 235, 30);
        AgentziaBerriPanel.add(LangileKopuruaBox);
        
        JLabel AgentziaMotaLabel = new JLabel("Agentzia mota");
        AgentziaMotaLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        AgentziaMotaLabel.setBounds(132, 254, 125, 28);
        AgentziaBerriPanel.add(AgentziaMotaLabel);
        
        JComboBox AgentziaMotaBox = new JComboBox();
        AgentziaMotaBox.setBounds(331, 256, 235, 30);
        AgentziaBerriPanel.add(AgentziaMotaBox);
        
        JLabel LogoLabel = new JLabel("Logoa");
        LogoLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        LogoLabel.setBounds(132, 319, 114, 22);
        AgentziaBerriPanel.add(LogoLabel);
        
        LogoField = new JTextField();
        LogoField.setBounds(334, 321, 248, 22);
        AgentziaBerriPanel.add(LogoField);
        LogoField.setColumns(10);
        
        JButton GordeButton = new JButton("Gorde");
        GordeButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String izena = AgentziaIzenBerri.getText();
        		String markaKolorea = MarkaKoloreField.getText();
        		String langileKopurua = LangileKopuruaBox.getToolTipText();
        		String mota = AgentziaMotaBox.getToolTipText();
        		String logo = LogoField.getText();
        		Agentzia agentzia = new Agentzia(izena, markaKolorea, langileKopurua, mota, logo);
        		arraAgen.add(agentzia); 
        		System.out.println(agentzia);
        	}
        });
        GordeButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        GordeButton.setBounds(142, 413, 115, 40);
        AgentziaBerriPanel.add(GordeButton);
        
        JButton AtzeraButton = new JButton("Atzera");
        AtzeraButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		AgentziaBerriPanel.setVisible(false);
        		HasieratuPanel.setVisible(true);
        	}
        });
        AtzeraButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        AtzeraButton.setBounds(429, 413, 137, 40);
        AgentziaBerriPanel.add(AtzeraButton);
        
        
        HasieratuPanel.setBounds(10, 79, 780, 445);
        frame.getContentPane().add(HasieratuPanel);
        HasieratuPanel.setLayout(null);
        
        JLabel HasieratuLabel = new JLabel("Hasieratu Saioa");
        HasieratuLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
        HasieratuLabel.setBounds(257, 24, 212, 48);
        HasieratuPanel.add(HasieratuLabel);
        
        JLabel AgentziaLabel = new JLabel("Agentziaren izena");
        AgentziaLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        AgentziaLabel.setBounds(184, 156, 143, 31);
        HasieratuPanel.add(AgentziaLabel);
        
        JLabel PasahitzaLabel = new JLabel("Pasahitza");
        PasahitzaLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        PasahitzaLabel.setBounds(184, 253, 112, 25);
        HasieratuPanel.add(PasahitzaLabel);
        
        AgentziaTextField = new JTextField();
        AgentziaTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        AgentziaTextField.setBounds(356, 161, 125, 20);
        HasieratuPanel.add(AgentziaTextField);
        AgentziaTextField.setColumns(10);
        
        JButton AgentziBerriButton = new JButton("Agentzia Berria");
        AgentziBerriButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		HasieratuPanel.setVisible(false);
        		AgentziaBerriPanel.setVisible(true);
        	}
        });
        AgentziBerriButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        AgentziBerriButton.setBounds(402, 331, 165, 48);
        HasieratuPanel.add(AgentziBerriButton);
        
        JButton SaioaHasieratuButton = new JButton("Hasi Saioa");
        SaioaHasieratuButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        SaioaHasieratuButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        SaioaHasieratuButton.setBounds(162, 331, 165, 48);
        HasieratuPanel.add(SaioaHasieratuButton);
        
        PasahiztaField = new JPasswordField();
        PasahiztaField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        PasahiztaField.setBounds(356, 258, 125, 20);
        HasieratuPanel.add(PasahiztaField);
        OngiEtorriPanel.setBounds(20, 62, 780, 510);
        frame.getContentPane().add(OngiEtorriPanel);
        OngiEtorriPanel.setLayout(null);
        
        JLabel OngiEtorriLabel = new JLabel("Ongi Etorri!!");
        OngiEtorriLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
        OngiEtorriLabel.setBounds(291, 11, 151, 70);
        OngiEtorriPanel.add(OngiEtorriLabel);
        
        JButton HasiButton = new JButton("HASI");
        HasiButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		OngiEtorriPanel.setVisible(false);
        		HasieratuPanel.setVisible(true);
        		}
        });
        HasiButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
        HasiButton.setBounds(243, 243, 253, 87);
        OngiEtorriPanel.add(HasiButton);
        
       
        
        
        
        

    }	
}	
    
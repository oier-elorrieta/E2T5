package Nagusia;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import java.util.ArrayList;


import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.toedter.calendar.JDateChooser;

import ModeloDao.AgentziaDao;
import ModeloDao.BidaiaDao;
import ModeloDao.HerrialdeDao;
import Pojoak.Aeroportu;
import Pojoak.Agentzia;
import Pojoak.Bidaia;
import Pojoak.Ekitaldi;
import Pojoak.Herrialde;
import Pojoak.Hiria;


public class App {
	private JPanel BidaiekitaldiPanel_1 =new JPanel();
	private JPanel HasieratuPanel = new JPanel();
	private JPanel OngiEtorriPanel = new JPanel();
	private JPanel AgentziaBerriPanel = new JPanel();
	private JPanel BidaiBerriPanel = new JPanel();
	private JPanel EkiBerriPanel = new JPanel();
	private ArrayList <Agentzia> arraAgen = new ArrayList();
	private ArrayList <Bidaia> arraBida = new ArrayList();
	private ArrayList <Ekitaldi> arraEkit = new ArrayList();
	private ArrayList <Herrialde> arraHerr = new ArrayList();
	private ArrayList <Hiria> arraHiri = new ArrayList();
	private ArrayList <Aeroportu> arraAero = new ArrayList();
	

    private JFrame frame;
    private JTextField AgentziaTextField;
    private JPasswordField PasahiztaField;
    private JTextField AgentziaIzenBerri;
    private JTextField MarkaKoloreField;
    private JTextField LogoField;
    private JPasswordField passwordField;
    private JTextField koloreField;
    private JButton btnBidaiBerria = new JButton("Bidai berria");
    private JButton btnEkitaldiBerria = new JButton("Ekitaldi berria");
    private JButton btnDeskonektatu = new JButton("Deskonektatu");
    private JButton btnSortuEskaintzak = new JButton("Eskaintza sortu");
    
    private JLabel bidaiIzenLabel;
    private JTextField BidaiIzenaField;
    private JTextField EgunakField;
    private JTextField DeskripzioField;
    private JTextField InkluituGabeField;
    private BidaiaDao bidaiaDao = new BidaiaDao();
    private JTextField txtEkIzena;
    private JTextField textField_5;
    private JTextField txtHelKod;
    private JTextField txtAerolinea;
    private JTextField txtPrezio;
    private JTextField txtIrteeraOrd;
    private JTextField txtIraupena;
    private HerrialdeDao herrialdeDao = new HerrialdeDao();
    private JTextArea EgunakArea; 
   
    
    Date DataHasiera;
    Date DataAmaiera;
  

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
        AgentziaBerriPanel.setVisible(false);
        HasieratuPanel.setBounds(10, 79, 780, 445);
        HasieratuPanel.setVisible(false);
        
        BidaiekitaldiPanel_1.setBounds(39, 86, 704, 430);
        BidaiekitaldiPanel_1.setVisible(false);
        btnBidaiBerria.setVisible(false);
        btnEkitaldiBerria.setVisible(false);
        btnDeskonektatu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		BidaiekitaldiPanel_1.setVisible(false);
        		OngiEtorriPanel.setVisible(true);
        	}
        });
        btnDeskonektatu.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnDeskonektatu.setVisible(false);
        btnSortuEskaintzak.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnSortuEskaintzak.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnSortuEskaintzak.setVisible(false);
        
        EkiBerriPanel.setBounds(20, 47, 750, 519);
        EkiBerriPanel.setVisible(false);
        
        
        BidaiBerriPanel.setVisible(false);
        BidaiBerriPanel.setBounds(20, 11, 750, 555);
        frame.getContentPane().add(BidaiBerriPanel);
        BidaiBerriPanel.setLayout(null);
        
        bidaiIzenLabel = new JLabel("Bidaiaren izena");
        bidaiIzenLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        bidaiIzenLabel.setBounds(31, 34, 128, 36);
        BidaiBerriPanel.add(bidaiIzenLabel);
        
        BidaiIzenaField = new JTextField();
        BidaiIzenaField.setBounds(197, 34, 215, 25);
        BidaiBerriPanel.add(BidaiIzenaField);
        BidaiIzenaField.setColumns(10);
        
        JLabel BidaiMotaLabel = new JLabel("Bidai mota");
        BidaiMotaLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        BidaiMotaLabel.setBounds(31, 81, 111, 25);
        BidaiBerriPanel.add(BidaiMotaLabel);
        
        JComboBox <String> bidaiMotaBox = new JComboBox <String>();
        
        bidaiaDao.ComboBoxBidaiMota1(bidaiMotaBox); 
        bidaiMotaBox.setBounds(197, 85, 128, 22);
        BidaiBerriPanel.add(bidaiMotaBox);
        
        
        
        JLabel BidaiHasieraLabel = new JLabel("Bidai hasiera");
        BidaiHasieraLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        BidaiHasieraLabel.setBounds(31, 117, 111, 25);
        BidaiBerriPanel.add(BidaiHasieraLabel);
        
        JLabel BidaiAmaieraLabel = new JLabel("Bidai amaiera");
        BidaiAmaieraLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        BidaiAmaieraLabel.setBounds(31, 153, 111, 25);
        BidaiBerriPanel.add(BidaiAmaieraLabel);
        
      
        
        JLabel EgunakLabel = new JLabel("Egunak");
        EgunakLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        EgunakLabel.setBounds(31, 189, 111, 25);
        BidaiBerriPanel.add(EgunakLabel);
        
        EgunakArea = new JTextArea();
        EgunakArea.setBounds(184, 192, 228, 25);
        BidaiBerriPanel.add(EgunakArea);
        EgunakArea.setColumns(10);
        
        JLabel lblNewLabel_3 = new JLabel("Herrialdea");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_3.setBounds(31, 225, 88, 22);
        BidaiBerriPanel.add(lblNewLabel_3);
        
        JComboBox HerrialdeBox = new JComboBox();
        herrialdeDao.ComboHerrialde(HerrialdeBox);
        HerrialdeBox.setBounds(184, 228, 228, 22);
        BidaiBerriPanel.add(HerrialdeBox);
        
        JLabel DeskripzioLabel = new JLabel("Deskripzioa");
        DeskripzioLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        DeskripzioLabel.setBounds(31, 275, 111, 25);
        BidaiBerriPanel.add(DeskripzioLabel);
        
        DeskripzioField = new JTextField();
        DeskripzioField.setBounds(178, 280, 283, 66);
        BidaiBerriPanel.add(DeskripzioField);
        DeskripzioField.setColumns(10);
        
        JLabel InkluituGabeLabel = new JLabel("Inkluitu gabeko\r\n zerbitzuak");
        InkluituGabeLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        InkluituGabeLabel.setBounds(22, 372, 302, 36);
        BidaiBerriPanel.add(InkluituGabeLabel);
        
        InkluituGabeField = new JTextField();
        InkluituGabeField.setBounds(264, 383, 243, 73);
        BidaiBerriPanel.add(InkluituGabeField);
        InkluituGabeField.setColumns(10);
        
        JButton BidaiGordebutton = new JButton("Gorde");
        BidaiGordebutton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		BidaiekitaldiPanel_1.setVisible(true);
        		BidaiBerriPanel.setVisible(false);
        	}
        });
        BidaiGordebutton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        BidaiGordebutton.setBounds(141, 508, 104, 36);
        BidaiBerriPanel.add(BidaiGordebutton);
        
        JButton BidaiEzeztatuButton = new JButton("Ezeztatu");
        BidaiEzeztatuButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		BidaiekitaldiPanel_1.setVisible(true);
        		BidaiBerriPanel.setVisible(false);        	}
        });
        BidaiEzeztatuButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        BidaiEzeztatuButton.setBounds(463, 508, 128, 36);
        BidaiBerriPanel.add(BidaiEzeztatuButton);
        
        
        
       
        JDateChooser BidaiHasieraCalendar = new JDateChooser();
        BidaiHasieraCalendar.setBounds(217, 118, 121, 22);
        BidaiBerriPanel.add(BidaiHasieraCalendar);
        
        JDateChooser BidaiAmaieraCalendar = new JDateChooser();
        BidaiAmaieraCalendar.setBounds(217, 158, 121, 20);
        BidaiBerriPanel.add(BidaiAmaieraCalendar);
        frame.getContentPane().add(EkiBerriPanel);
        EkiBerriPanel.setLayout(null); 
        
        DataHasiera = BidaiHasieraCalendar.getDate();
        DataAmaiera = BidaiAmaieraCalendar.getDate(); 
       // long diffInMillies = Math.abs(DataAmaiera.getTime() - DataHasiera.getTime());
        //long diffInDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
       // System.out.println(diffInDays);
        //EgunakArea.setText(diffInDays);
        
        JLabel lblEkIzena = new JLabel("Ekitaldiaren Izena");
        lblEkIzena.setHorizontalAlignment(SwingConstants.LEFT);
        lblEkIzena.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblEkIzena.setBounds(75, 54, 117, 20);
        EkiBerriPanel.add(lblEkIzena);
        
        
        
         JLabel lblEkMota = new JLabel("Ekkitaldi Mota");
         lblEkMota.setHorizontalAlignment(SwingConstants.LEFT);
         lblEkMota.setFont(new Font("Tahoma", Font.PLAIN, 15));
         lblEkMota.setBounds(75, 93, 97, 20);
         EkiBerriPanel.add(lblEkMota);
         
          JLabel lblIbilbide = new JLabel("Ibilbide");
          lblIbilbide.setHorizontalAlignment(SwingConstants.LEFT);
          lblIbilbide.setFont(new Font("Tahoma", Font.PLAIN, 15));
          lblIbilbide.setBounds(75, 131, 86, 20);
          EkiBerriPanel.add(lblIbilbide);
          
           JLabel lblJatorrAero = new JLabel("Jatorrizko Aeroportua");
           lblJatorrAero.setFont(new Font("Tahoma", Font.PLAIN, 15));
           lblJatorrAero.setBounds(75, 175, 141, 20);
           EkiBerriPanel.add(lblJatorrAero);
           
            JLabel lblHelmAero = new JLabel("Helmuga Aeroportua");
            lblHelmAero.setFont(new Font("Tahoma", Font.PLAIN, 15));
            lblHelmAero.setBounds(75, 218, 141, 20);
            EkiBerriPanel.add(lblHelmAero);
            
             JLabel lblIdaData = new JLabel("Ida Data");
             lblIdaData.setFont(new Font("Tahoma", Font.PLAIN, 15));
             lblIdaData.setBounds(75, 255, 66, 14);
             EkiBerriPanel.add(lblIdaData);
             
              JLabel lblHegaldiKod = new JLabel("Hegaldi Kodea");
              lblHegaldiKod.setFont(new Font("Tahoma", Font.PLAIN, 15));
              lblHegaldiKod.setBounds(73, 287, 97, 14);
              EkiBerriPanel.add(lblHegaldiKod);
              
               JLabel lblAerolinea = new JLabel("Aerolinea");
               lblAerolinea.setFont(new Font("Tahoma", Font.PLAIN, 15));
               lblAerolinea.setBounds(75, 322, 58, 14);
               EkiBerriPanel.add(lblAerolinea);
               
                JLabel lblPrezio = new JLabel("Prezioa");
                lblPrezio.setFont(new Font("Tahoma", Font.PLAIN, 15));
                lblPrezio.setBounds(75, 356, 58, 14);
                EkiBerriPanel.add(lblPrezio);
                
                 JLabel lblIIrteeraOrdu = new JLabel("Irteera Ordutegia");
                 lblIIrteeraOrdu.setFont(new Font("Tahoma", Font.PLAIN, 15));
                 lblIIrteeraOrdu.setBounds(73, 389, 119, 20);
                 EkiBerriPanel.add(lblIIrteeraOrdu);
                 
                  JLabel lblIraupena = new JLabel("Iraupena");
                  lblIraupena.setFont(new Font("Tahoma", Font.PLAIN, 15));
                  lblIraupena.setBounds(75, 426, 66, 20);
                  EkiBerriPanel.add(lblIraupena);
                  
                   txtEkIzena = new JTextField();
                   txtEkIzena.setBounds(259, 56, 125, 20);
                   EkiBerriPanel.add(txtEkIzena);
                   txtEkIzena.setColumns(10);
                   
                    textField_5 = new JTextField();
                    textField_5.setColumns(10);
                    textField_5.setBounds(259, 254, 86, 20);
                    EkiBerriPanel.add(textField_5);
                    
                     txtHelKod = new JTextField();
                     txtHelKod.setColumns(10);
                     txtHelKod.setBounds(259, 286, 125, 20);
                     EkiBerriPanel.add(txtHelKod);
                     
                      txtAerolinea = new JTextField();
                      txtAerolinea.setColumns(10);
                      txtAerolinea.setBounds(259, 321, 125, 20);
                      EkiBerriPanel.add(txtAerolinea);
                      
                       txtPrezio = new JTextField();
                       txtPrezio.setColumns(10);
                       txtPrezio.setBounds(259, 355, 86, 20);
                       EkiBerriPanel.add(txtPrezio);
                       
                        txtIrteeraOrd = new JTextField();
                        txtIrteeraOrd.setColumns(10);
                        txtIrteeraOrd.setBounds(259, 391, 86, 20);
                        EkiBerriPanel.add(txtIrteeraOrd);
                        
                         txtIraupena = new JTextField();
                         txtIraupena.setColumns(10);
                         txtIraupena.setBounds(259, 428, 86, 20);
                         EkiBerriPanel.add(txtIraupena);
                         
                          JComboBox HemAeroportuBox = new JComboBox();
                          HemAeroportuBox.setBounds(259, 219, 102, 22);
                          EkiBerriPanel.add(HemAeroportuBox);
                          
                           JComboBox EkMotaBox = new JComboBox();
                           EkMotaBox.setBounds(259, 94, 125, 22);
                           EkiBerriPanel.add(EkMotaBox);
                           
                            JComboBox IbilbideBox = new JComboBox();
                            IbilbideBox.setBounds(259, 132, 134, 22);
                            EkiBerriPanel.add(IbilbideBox);
                            
                             JComboBox JaAeroportuaBox = new JComboBox();
                             JaAeroportuaBox.setBounds(259, 176, 102, 22);
                             EkiBerriPanel.add(JaAeroportuaBox);
                             
                              JButton btnBilatuBidaia = new JButton("Bilatu Bidaia");
                              btnBilatuBidaia.setFont(new Font("Tahoma", Font.PLAIN, 13));
                              btnBilatuBidaia.setBounds(410, 198, 141, 23);
                              EkiBerriPanel.add(btnBilatuBidaia);
                              
                               JButton BidaiGordebutton_1 = new JButton("Gorde");
                               BidaiGordebutton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
                               BidaiGordebutton_1.setBounds(169, 483, 102, 36);
                               EkiBerriPanel.add(BidaiGordebutton_1);
       
    
        JButton BidaiEzeztatuButton_1 = new JButton("Ezeztatu");
        BidaiEzeztatuButton_1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        BidaiekitaldiPanel_1.setVisible(true);
        EkiBerriPanel.setVisible(false);
        }
        });
        BidaiEzeztatuButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        BidaiEzeztatuButton_1.setBounds(434, 483, 117, 36);
        EkiBerriPanel.add(BidaiEzeztatuButton_1);
        frame.getContentPane().add(BidaiBerriPanel);
        BidaiBerriPanel.setLayout(null);
     
        
        
        BidaiekitaldiPanel_1.setBounds(39, 86, 704, 430);
        frame.getContentPane().add(BidaiekitaldiPanel_1);
        BidaiekitaldiPanel_1.setLayout(null);
        
        
        btnBidaiBerria.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	BidaiekitaldiPanel_1.setVisible(false);
            	BidaiBerriPanel.setVisible(true);
            }
        });
        btnBidaiBerria.setBounds(494, 90, 129, 23);
        BidaiekitaldiPanel_1.add(btnBidaiBerria);
        btnBidaiBerria.setVisible(false);
        
       
        btnEkitaldiBerria.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	BidaiekitaldiPanel_1.setVisible(false);
                EkiBerriPanel.setVisible(true);        
            }
        });
        btnEkitaldiBerria.setBounds(494, 210, 129, 23);
        BidaiekitaldiPanel_1.add(btnEkitaldiBerria);
        frame.getContentPane().add(HasieratuPanel);
        HasieratuPanel.setLayout(null);
        
        
        btnDeskonektatu.setBounds(494, 377, 188, 43);
        BidaiekitaldiPanel_1.add(btnDeskonektatu);
        
        
       
        btnSortuEskaintzak.setBounds(111, 378, 264, 40);
        BidaiekitaldiPanel_1.add(btnSortuEskaintzak); 
     
        
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
        		BidaiekitaldiPanel_1.setVisible(true);
        		 btnBidaiBerria.setVisible(true);
        	        btnEkitaldiBerria.setVisible(true);
        	        btnDeskonektatu.setVisible(true);
        	        btnSortuEskaintzak.setVisible(true);
        	        HasieratuPanel.setVisible(false);
        	        
        		
        	}
        });
        SaioaHasieratuButton.setBounds(162, 331, 165, 48);
        HasieratuPanel.add(SaioaHasieratuButton);
        
        PasahiztaField = new JPasswordField();
        PasahiztaField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        PasahiztaField.setBounds(356, 258, 125, 20);
        HasieratuPanel.add(PasahiztaField);
        
       
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
        
                
                JComboBox<String>  LangileKopuruaBox  = new JComboBox<String>();
                LangileKopuruaBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
                LangileKopuruaBox.setBounds(331, 200, 235, 30);
                AgentziaBerriPanel.add(LangileKopuruaBox);
                AgentziaDao agentziaDao = new AgentziaDao();
                agentziaDao.ComboBoxLangkop(LangileKopuruaBox);             
                JLabel AgentziaMotaLabel  = new JLabel("Agentzia mota");
                AgentziaMotaLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
           
                AgentziaMotaLabel.setBounds(132, 254, 125, 28);
                AgentziaBerriPanel.add(AgentziaMotaLabel);
                
                JComboBox<String>  AgentziaMotaBox  = new JComboBox<String>();
                AgentziaMotaBox.setBounds(331, 256, 235, 30);
				agentziaDao.ComboBoxBete(AgentziaMotaBox);                
                AgentziaBerriPanel.add(AgentziaMotaBox);
                
                JLabel LogoLabel = new JLabel("Logoa");
                LogoLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
                LogoLabel.setBounds(132, 305, 114, 22);
                AgentziaBerriPanel.add(LogoLabel);
                
                LogoField = new JTextField();
                LogoField.setBounds(331, 308, 248, 22);
                AgentziaBerriPanel.add(LogoField);
                LogoField.setColumns(10);
                
                JButton GordeButton = new JButton("Gorde");
              /**  GordeButton.addActionListener(new ActionListener() {
                	 public void actionPerformed(ActionEvent e) {
                		String izena = AgentziaIzenBerri.getText();
                		String markaKolorea = MarkaKoloreField.getText();
                		String langileKopurua = LangileKopuruaBox.getToolTipText();
                		String mota = AgentziaMotaBox.getToolTipText(); 
                		String logo = LogoField.getText();
                		String pasahitza = new String (passwordField.getPassword());
                		Agentzia agentzia = new Agentzia(izena, markaKolorea, langileKopurua, mota, logo, pasahitza, ArrayList <bidaia> );
                		arraAgen.add(agentzia); 
                		System.out.println(agentzia);
                	}
                }); **/
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
                
                passwordField = new JPasswordField();
                passwordField.setBounds(331, 359, 248, 20);
                AgentziaBerriPanel.add(passwordField);
                
                JLabel lblNewLabel = new JLabel("Pasahitza");
                lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
                lblNewLabel.setBounds(122, 362, 88, 14);
                AgentziaBerriPanel.add(lblNewLabel);
                
                koloreField = new JTextField();
                koloreField.setEditable(false);
                koloreField.setBounds(514, 150, 52, 40);
                AgentziaBerriPanel.add(koloreField);
                koloreField.setColumns(10);
                MarkaKoloreField.getDocument().addDocumentListener(new DocumentListener() {
                    @Override
                    public void insertUpdate(DocumentEvent e) {
                        actualizarColor();
                    }

                    @Override
                    public void removeUpdate(DocumentEvent e) {
                        actualizarColor();
                    }

                    @Override
                    public void changedUpdate(DocumentEvent e) {
                        actualizarColor();
                    }

                    private void actualizarColor() {
                        String hexColor = MarkaKoloreField.getText().trim();
                        try {
                            // Convertir el color hexadecimal a un objeto Color
                            Color color = Color.decode(hexColor);
                            // Establecer el color de fondo del txtColorPicker
                            koloreField.setBackground(color);
                        } catch (NumberFormatException ex) {
                            // En caso de error en el formato, mostrar un color por defecto (rojo)
                            koloreField.setBackground(Color.WHITE);
                        }
                    }
                });
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
        		BidaiekitaldiPanel_1.setVisible(false);
        		}
        });
        HasiButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
        HasiButton.setBounds(243, 243, 253, 87);
        OngiEtorriPanel.add(HasiButton);
        
       
        
        
        
        

    }	
}	
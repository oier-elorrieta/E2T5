package Vista;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import java.util.ArrayList;


import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import Metodoak.Metodoak;
import ModeloDao.AgentziaDao;
import ModeloDao.BidaiaDao;
import ModeloDao.EkitaldiDao;
import ModeloDao.HerrialdeDao;
import Pojoak.Aeroportu;
import Pojoak.Agentzia;
import Pojoak.Bidaia;
import Pojoak.Ekitaldi;
import Pojoak.Herrialde;
import Pojoak.Hiria;
import com.toedter.calendar.JCalendar;


public class Vista {
    public JFrame frame;
    
	private JPanel BidaiekitaldiPanel_1 =new JPanel();
	private JPanel HasieratuPanel = new JPanel();
	private JPanel OngiEtorriPanel = new JPanel();
	private JPanel AgentziaBerriPanel = new JPanel();
	private JPanel BidaiBerriPanel = new JPanel();
	private JPanel EkiBerriPanel = new JPanel();
	private JPanel EkiBerriBidPanel =  new JPanel();
	private JPanel EkiOstPanel =  new JPanel();
	private JPanel EkiAktPanel = new JPanel();
	
	private ArrayList <Agentzia> arraAgen = new ArrayList();
	private ArrayList <Bidaia> arraBida = new ArrayList();
	private ArrayList <Ekitaldi> arraEkit = new ArrayList();
	private ArrayList <Herrialde> arraHerr = new ArrayList();
	private ArrayList <Hiria> arraHiri = new ArrayList();
	private ArrayList <Aeroportu> arraAero = new ArrayList();
	private ArrayList <String> bidaiMota = new ArrayList();	
	private ArrayList <String> herrialdeak = new ArrayList();
	private ArrayList <String> EkitaldiJaAer = new ArrayList();
	private ArrayList <String> EkitaldiHemAer = new ArrayList();
	private ArrayList <String> langileKop = new ArrayList();
	private ArrayList <String> agenMota = new ArrayList();
	public int agentziaIndize;
	public int agentziId;
	
    private JTextField AgentziaTextField;
    private JPasswordField PasahitzaField;
    private JTextField AgentziaIzenBerri;
    private JTextField MarkaKoloreField;
    private JTextField LogoField;
    private JTextField koloreField;
    private JTextField BidaiIzenaField;
    private JTextField EgunakField;
    private JTextField DeskripzioField;
    private JTextField InkluituGabeField;
    private JTextField txtEkIzena;
    private JTextField txtHelKod;
    private JTextField txtAerolinea;
    private JTextField txtPrezio;
    private JTextField txtIrteeraOrd;
    private JTextField txtIraupena;
    
    JComboBox IbilbideBox = new JComboBox();
    JComboBox <String> JaAeroportuaBox = new JComboBox<String>();
    
    private JPasswordField passwordField;
    
    JDateChooser dateChooser = new JDateChooser();
  
    private JButton btnBidaiBerria = new JButton("Bidai berria");
    private JButton btnEkitaldiBerria = new JButton("Ekitaldi berria");
    private JButton btnDeskonektatu = new JButton("Deskonektatu");
    private JButton btnSortuEskaintzak = new JButton("Eskaintza sortu");
    private JButton btnBilatuBidaia = new JButton("Bilatu Bidaia");
    JLabel lblBueltaIraupen = new JLabel("Buelta Iraupen");
    
    private JLabel bidaiIzenLabel;
    JLabel lblEtorriData = new JLabel("Etorri Data");
    JLabel lblHegaldiKod_2 = new JLabel("Hegaldi Kodea");
    JLabel lblBueltaAirelinea = new JLabel("Buelta Aerolinea");
    JLabel lblPrezioTotala = new JLabel("Prezio Totala");
    JLabel lblBueltaOrdute = new JLabel("Buelta Ordutegia");

    private BidaiaDao bidaiaDao = new BidaiaDao();
    private EkitaldiDao ekitaldiDao = new EkitaldiDao();
    private HerrialdeDao herrialdeDao = new HerrialdeDao();
    private AgentziaDao agentziaDao = new AgentziaDao();
    
    private JTextArea EgunakArea; 
    
	private ArrayList<Agentzia> agentziak = agentziaDao.AgentziaKargatuBidaiekin();
	Metodoak metodoak = new Metodoak();
   
	private JDateChooser BidaiHasieraCalendar;
	private JDateChooser BidaiAmaieraCalendar;
	JDateChooser Etorridate = new JDateChooser();
	
    Date DataHasiera;
    Date DataAmaiera;
    private JTable BidaiaTable;
    private JTable EkitaldiTable;
    private JTextField prezTxt;
    private JTextField hiriaTxt;
    private JTextField Prezioatxt;
    private JTextField txtHegaldiKode;
    private JTextField txtBueltaAeroli;
    private JTextField txtBueltaOrdute;
    private JTextField txtBueltaIraupen;
    private JTextField txtPrezioTotala;
    
    DefaultTableModel modeloa = new DefaultTableModel();
    DefaultTableModel modeloa1 = new DefaultTableModel();

  

  
    public Vista() {
        OngiEtorri();
        frame.setVisible(true);
    }

    private void OngiEtorri() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setUndecorated(true);
        frame.getContentPane().setLayout(null);
                                     
                                     
                                     BidaiBerriPanel.setVisible(false);
                                     
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
                                        AgentziaBerriPanel.setVisible(false);
                                                   HasieratuPanel.setBounds(10, 79, 780, 445);
                                                   HasieratuPanel.setVisible(false);
                                                   
                                                         
                                                                                      
                            EkiBerriBidPanel.setBounds(30, 167, 750, 430);
                            EkiBerriBidPanel.setVisible(false);
                            frame.getContentPane().add(EkiBerriBidPanel);
                            EkiBerriBidPanel.setLayout(null); 
                                                                                      
                            JLabel lblIbilbide = new JLabel("Ibilbide");
                            lblIbilbide.setHorizontalAlignment(SwingConstants.LEFT);
                            lblIbilbide.setFont(new Font("Tahoma", Font.PLAIN, 15));
                            lblIbilbide.setBounds(75, 21, 86, 20);
                            EkiBerriBidPanel.add(lblIbilbide);
                                                                                       
                            JLabel lblJatorrAero = new JLabel("Jatorrizko Aeroportua");
                            lblJatorrAero.setFont(new Font("Tahoma", Font.PLAIN, 15));
                            lblJatorrAero.setBounds(75, 64, 141, 20);
                            EkiBerriBidPanel.add(lblJatorrAero);
                                                                                        
                            JLabel lblHelmAero = new JLabel("Helmuga Aeroportua");
                            lblHelmAero.setFont(new Font("Tahoma", Font.PLAIN, 15));
                            lblHelmAero.setBounds(75, 106, 141, 20);
                            EkiBerriBidPanel.add(lblHelmAero);
                                                                                         
                          JLabel lblJoanData = new JLabel("Joan Data");
	                      lblJoanData.setFont(new Font("Tahoma", Font.PLAIN, 15));
	                      lblJoanData.setBounds(75, 151, 66, 14);
	                      EkiBerriBidPanel.add(lblJoanData);
	                      
	                       JLabel lblHegaldiKod = new JLabel("Hegaldi Kodea");
	                       lblHegaldiKod.setFont(new Font("Tahoma", Font.PLAIN, 15));
	                       lblHegaldiKod.setBounds(75, 201, 97, 14);
	                       EkiBerriBidPanel.add(lblHegaldiKod);
	                       
	                        JLabel lblAerolinea = new JLabel("Aerolinea");
	                        lblAerolinea.setFont(new Font("Tahoma", Font.PLAIN, 15));
	                        lblAerolinea.setBounds(75, 246, 58, 14);
	                        EkiBerriBidPanel.add(lblAerolinea);
	                        
	                         JLabel lblPrezio = new JLabel("Prezioa");
	                         lblPrezio.setFont(new Font("Tahoma", Font.PLAIN, 15));
	                         lblPrezio.setBounds(75, 297, 58, 14);
	                         EkiBerriBidPanel.add(lblPrezio);
	                         
	                          JLabel lblIIrteeraOrdu = new JLabel("Irteera Ordutegia");
	                          lblIIrteeraOrdu.setFont(new Font("Tahoma", Font.PLAIN, 15));
	                          lblIIrteeraOrdu.setBounds(75, 333, 119, 20);
	                          EkiBerriBidPanel.add(lblIIrteeraOrdu);
	                          
	                           JLabel lblIraupena = new JLabel("Iraupena");
	                           lblIraupena.setFont(new Font("Tahoma", Font.PLAIN, 15));
	                           lblIraupena.setBounds(75, 426, 66, 20);
	                           EkiBerriBidPanel.add(lblIraupena);
	                           
	                            txtHelKod = new JTextField();
	                            txtHelKod.setColumns(10);
	                            txtHelKod.setBounds(259, 201, 125, 20);
	                            EkiBerriBidPanel.add(txtHelKod);
	                            
	                             txtAerolinea = new JTextField();
	                             txtAerolinea.setColumns(10);
	                             txtAerolinea.setBounds(259, 245, 125, 20);
	                             EkiBerriBidPanel.add(txtAerolinea);
	                             
	                              txtPrezio = new JTextField();
	                              txtPrezio.setColumns(10);
	                              txtPrezio.setBounds(259, 296, 86, 20);
	                              EkiBerriBidPanel.add(txtPrezio);
	                              
	                               txtIrteeraOrd = new JTextField();
	                               txtIrteeraOrd.setColumns(10);
	                               txtIrteeraOrd.setBounds(259, 335, 86, 20);
	                               EkiBerriBidPanel.add(txtIrteeraOrd);
	                               
	                                txtIraupena = new JTextField();
	                                txtIraupena.setColumns(10);
	                                txtIraupena.setBounds(259, 428, 86, 20);
	                                EkiBerriBidPanel.add(txtIraupena);
	                                
	                                JComboBox <String> EkitaldiHemAerBox = new JComboBox <String>();
	                                EkitaldiHemAerBox.setBounds(259, 107, 102, 22);
	                                EkiBerriBidPanel.add(EkitaldiHemAerBox);
	                                
	                                 
	                                 IbilbideBox.setBounds(259, 22, 134, 22);
	                                 IbilbideBox.addItem("Joan");
	                                 IbilbideBox.addItem("Joan-Etorri");
	                                 EkiBerriBidPanel.add(IbilbideBox);
                                  
	                                 IbilbideBox.addActionListener(new ActionListener () {
	                                	 		@Override
	                                	 		public void actionPerformed(ActionEvent e) {
	                                	 			int selectedIndex2 = IbilbideBox.getSelectedIndex();
	                                	 			if (selectedIndex2 == 0) {
	                                	 				lblEtorriData.setVisible(false);
	                                	 				lblHegaldiKod_2.setVisible(false);
	                                	 				lblBueltaAirelinea.setVisible(false);
	                                	 				lblPrezioTotala.setVisible(false);
	                                	 				lblBueltaOrdute.setVisible(false);
	                                	 				lblBueltaIraupen.setVisible(false);
	                                	 				txtHegaldiKode.setVisible(false);
	                                	 				txtBueltaAeroli.setVisible(false);
	                                	 				txtBueltaOrdute.setVisible(false);
	                                	 				txtBueltaIraupen.setVisible(false);
	                                	 				txtPrezioTotala.setVisible(false);
	                                	 				Etorridate.setVisible(false);
	                                	 			} else if (selectedIndex2 == 1) {
	                                	 				lblEtorriData.setVisible(true);
	                                	 				lblHegaldiKod_2.setVisible(true);
	                                	 				lblBueltaAirelinea.setVisible(true);
	                                	 				lblPrezioTotala.setVisible(true);
	                                	 				lblBueltaOrdute.setVisible(true);
	                                	 				lblBueltaIraupen.setVisible(true);
	                                	 				txtHegaldiKode.setVisible(true);
	                                	 				txtBueltaAeroli.setVisible(true);
	                                	 				txtBueltaOrdute.setVisible(true);
	                                	 				txtBueltaIraupen.setVisible(true);
	                                	 				txtPrezioTotala.setVisible(true);
	                                	 				Etorridate.setVisible(true);
	                                	 			}
	                                	 		}
	                                	 		
	                                	 
	                                	 
	                                	 
	                                	 
	                                	 
	                                	 
	                                 });
                                                                                                     
                                	JaAeroportuaBox.setBounds(259, 62, 102, 22);
                                	EkiBerriBidPanel.add(JaAeroportuaBox);
                                	

                                  /**  JComboBox EkMotaBox = new JComboBox();
                                    EkMotaBox.setBounds(259, 111, 125, 22);
                                    EkMotaBox.addItem("Bidaia");
                                    EkMotaBox.addItem("Ostatua");
                                    EkMotaBox.addItem("Jarduera");
                                    EkiBerriPanel.add(EkMotaBox);
                                    
                                    EkMotaBox.addActionListener(new ActionListener() {
                                           	    @Override
                                           	    public void actionPerformed(ActionEvent e) {
                                           	        int selectedIndex = EkMotaBox.getSelectedIndex();
                                           	        if (selectedIndex == 0) { 
                                           	        	EkiOstPanel.setVisible(false);
                                      	EkiAktPanel.setVisible(false);
                                      	EkiBerriBidPanel.setVisible(true);
                                           	        } else if (selectedIndex == 1) {
                                      	EkiBerriBidPanel.setVisible(false);
                                      	EkiAktPanel.setVisible(false);
                                      	EkiOstPanel.setVisible(true);
                                           	        } else if (selectedIndex == 2) {                                           	
                                      	EkiBerriBidPanel.setVisible(false);
                                           	        	EkiOstPanel.setVisible(false);
                                           	        	EkiAktPanel.setVisible(true);
                                           	    }
                                           	   }
                                           	});
                                           	
                                          */
                                	  
                                	  btnBilatuBidaia.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                	  btnBilatuBidaia.setBounds(406, 83, 141, 23);
                                	  EkiBerriBidPanel.add(btnBilatuBidaia);
                                	  
                                	   JButton BidaiGordebutton_1 = new JButton("Gorde");
                                	   BidaiGordebutton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
                                	   BidaiGordebutton_1.setBounds(169, 483, 102, 36);
                                	   EkiBerriBidPanel.add(BidaiGordebutton_1);
                                	   
    
                                	    JButton BidaiEzeztatuButton_1 = new JButton("Ezeztatu");
                                	    BidaiEzeztatuButton_1.addActionListener(new ActionListener() {
                                	    public void actionPerformed(ActionEvent e) {
                                	    BidaiekitaldiPanel_1.setVisible(true);
                                	    EkiBerriBidPanel.setVisible(false);
                                	    EkiBerriPanel.setVisible(false);
                                	    }
                                	    });
                                	    BidaiEzeztatuButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
                                	    BidaiEzeztatuButton_1.setBounds(434, 483, 117, 36);
                                	    EkiBerriBidPanel.add(BidaiEzeztatuButton_1);
                                	    
                                	    
                                	    dateChooser.setBounds(259, 151, 164, 20);
                                	    EkiBerriBidPanel.add(dateChooser);
                                	    
                                	    
                                	    lblEtorriData.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                	    lblEtorriData.setBounds(452, 153, 69, 14);
                                	    EkiBerriBidPanel.add(lblEtorriData);
                                	    lblEtorriData.setVisible(false);
                                	    
                                	    
                                	    lblHegaldiKod_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                	    lblHegaldiKod_2.setBounds(452, 203, 95, 14);
                                	    EkiBerriBidPanel.add(lblHegaldiKod_2);
                                	    lblHegaldiKod_2.setVisible(false);
                                	    
                                	    
                                	    lblBueltaAirelinea.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                	    lblBueltaAirelinea.setBounds(452, 248, 110, 17);
                                	    EkiBerriBidPanel.add(lblBueltaAirelinea);
                                	    lblBueltaAirelinea.setVisible(false);
                                	    
                                	    
                                	    lblPrezioTotala.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                	    lblPrezioTotala.setBounds(452, 276, 84, 14);
                                	    EkiBerriBidPanel.add(lblPrezioTotala);
                                	    lblPrezioTotala.setVisible(false);
                                	    
                                	    
                                	    lblBueltaOrdute.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                	    lblBueltaOrdute.setBounds(452, 319, 110, 14);
                                	    EkiBerriBidPanel.add(lblBueltaOrdute);
                                	    lblBueltaOrdute.setVisible(false);
                                	    
                                	    
                                	    lblBueltaIraupen.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                	    lblBueltaIraupen.setBounds(452, 356, 102, 14);
                                	    EkiBerriBidPanel.add(lblBueltaIraupen);
                                	    lblBueltaIraupen.setVisible(false);
                                	    
                                	    txtHegaldiKode = new JTextField();
                                	    txtHegaldiKode.setBounds(590, 200, 102, 20);
                                	    EkiBerriBidPanel.add(txtHegaldiKode);
                                	    txtHegaldiKode.setColumns(10);
                                	    txtHegaldiKode.setVisible(false);
                                	    
                                	    txtBueltaAeroli = new JTextField();
                                	    txtBueltaAeroli.setColumns(10);
                                	    txtBueltaAeroli.setBounds(590, 245, 102, 20);                               	                                   	    
                                	    EkiBerriBidPanel.add(txtBueltaAeroli);
                                	    txtBueltaAeroli.setVisible(false);
                                	    
                                	    
                                	    txtBueltaOrdute = new JTextField();
                                	    txtBueltaOrdute.setColumns(10);
                                	    txtBueltaOrdute.setBounds(590, 318, 86, 20);
                                	    EkiBerriBidPanel.add(txtBueltaOrdute);
                                	    txtBueltaOrdute.setVisible(false);
                                	    
                                	    txtBueltaIraupen = new JTextField();
                                	    txtBueltaIraupen.setColumns(10);
                                	    txtBueltaIraupen.setBounds(590, 355, 86, 20);
                                	    EkiBerriBidPanel.add(txtBueltaIraupen);
                                	    txtBueltaIraupen.setVisible(false);
                                	    
                                	    txtPrezioTotala = new JTextField();
                                	    txtPrezioTotala.setColumns(10);
                                	    txtPrezioTotala.setBounds(590, 276, 86, 20);
                                	    EkiBerriBidPanel.add(txtPrezioTotala);
                                	    txtPrezioTotala.setVisible(false);
                                	    
                                	    
                                	    Etorridate.setBounds(590, 151, 125, 28);
                                	    EkiBerriBidPanel.add(Etorridate);
                                	    Etorridate.setVisible(false);
                                	    
                                	    
                                	    JButton BidaiEzeztatuButton_2 = new JButton("Ezeztatu");
                                	    BidaiEzeztatuButton_2.addActionListener(new ActionListener() {
                                	    	public void actionPerformed(ActionEvent e) {
                                	            EkiBerriPanel.setVisible(false);
                                	            EkiBerriBidPanel.setVisible(false);
                                	            EkiOstPanel.setVisible(false);
                                	            EkiAktPanel.setVisible(false);
                                	            BidaiekitaldiPanel_1.setVisible(true);
                                	        }
                                	    });
                                	    BidaiEzeztatuButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
                                	    BidaiEzeztatuButton_2.setBounds(462, 383, 119, 36);
                                	    EkiBerriBidPanel.add(BidaiEzeztatuButton_2);
                                	    
                                	    JButton BidaiGordebutton_2 = new JButton("Gorde");
                                	    BidaiGordebutton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
                                	    BidaiGordebutton_2.setBounds(179, 383, 104, 36);
                                	    EkiBerriBidPanel.add(BidaiGordebutton_2);
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
                                                   
                                                   frame.getContentPane().add(HasieratuPanel);
                                                   HasieratuPanel.setLayout(null);
                                                   
                                                      
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
                                                      		String erabiltzailea = AgentziaTextField.getText();

                                    	              		String pasahitza = new String (PasahitzaField.getPassword());

                                    	              		 for (Agentzia a : agentziak) {
                                    	              			 agentziak = agentziaDao.AgentziaKargatuBidaiekin();
                                    	              			if (erabiltzailea.equals(a.getIzena()) && pasahitza.equals(a.getPasahitza())) { 
                                    	              		    agentziId = a.getIdAgen();
                                    	              			 System.out.println(agentziId);
                                    	              				try {
                                    	              					modeloa.setRowCount(0); 

                                    	              				    for (int i = 0; i < arraAgen.size(); i++) {

                                    	              				        // Comprobar si el objeto tiene el id que buscamos

                                    	              				        if (arraAgen.get(i).getIdAgen() == agentziId) {

                                    	              				            // Iterar sobre el ArrayList de ArraBida

                                    	              				            for (int j = 0; j < arraAgen.get(i).getArraBida().size(); j++) {

                                    	              				                // Crear el array fila para la nueva fila de la tabla

                                    	              				                Object[] fila = new Object[modeloa.getColumnCount()];
                                    	              				                // Rellenar el array fila con los datos

                                    	              				                fila[0] = arraAgen.get(i).getArraBida().get(j).getIzena();

                                    	              				                fila[1] = arraAgen.get(i).getArraBida().get(j).getMota();

                                    	              				                fila[2] = arraAgen.get(i).getArraBida().get(j).getEgunak();

                                    	              				                fila[3] = arraAgen.get(i).getArraBida().get(j).getHasieraData();

                                    	              				                fila[4] = arraAgen.get(i).getArraBida().get(j).getAmaieraData();

                                    	              				                fila[5] = arraAgen.get(i).getArraBida().get(j).getHerrialdea();
                                    	              				                // Agregar la fila al modelo de la tabla

                                    	              				                modeloa.addRow(fila);
                                    	              				            }
                                    	              				            break; 
                                    	              				        }
                                    	              				    }
                                    	              	        		   BidaiaTable.setModel(modeloa);
                                    	              	           } 

                                    	              	           catch (Exception el) {
                                    	              	        	   System.err.println( "Errorea gertatu da" + el.getMessage());
                                    	              	           }
                                    	              				try {
                                    	              	        	   ArrayList <Agentzia> arraAgen = agentziaDao.AgentziaKargatuBidaiekin();

                                    	              	        	   Object [] fila = new Object[modeloa1.getColumnCount()];

                                    	              	        	   for(int i = 0; i < arraAgen.size(); i++) {

                                    	              	        		   for (int j = 0; j < arraAgen.get(i).getArraBida().size(); j++) {

                                    	              	        			   for(int x = 0; x < arraAgen.get(i).getArraBida().get(j).getArraEkit().size(); x++) { 

                                    	              	        		  fila[0] = arraAgen.get(i).getArraBida().get(j).getIzena();

                                    	              	        		  fila[1] = arraAgen.get(i).getArraBida().get(j).getMota();

                                    	              	        		  fila[2]  = arraAgen.get(i).getArraBida().get(j).getArraEkit().get(x);

                                    	              	        		  fila[3] = arraAgen.get(i).getArraBida().get(j).getArraEkit().get(x).getPrezioa();

                                    	              	        		   

                                    	              	        		  modeloa1.addRow(fila);

                                    	              	        	   }

                                    	              	        		   EkitaldiTable.setModel(modeloa1);

                                    	              	           }} 

                                    	              	           }

                                    	              	           catch (Exception ex) {

                                    	              	        	   System.err.println( "Errorea gertatu da" + ex.getMessage());

                                    	              	           }

                                    	              				BidaiekitaldiPanel_1.setVisible(true);

                                    	                     		 btnBidaiBerria.setVisible(true);

                                    	                     	        btnEkitaldiBerria.setVisible(true);

                                    	                     	        btnDeskonektatu.setVisible(true);

                                    	                     	        btnSortuEskaintzak.setVisible(true);

                                    	                     	        HasieratuPanel.setVisible(false);

                                    	                     	        AgentziaTextField.setText(null);

                                    	                     	        PasahitzaField.setText(null);

                                    	                      }

                                    	              	   }

                                    	               }

                                    	          

                                    	        });
                                                      
                                                                 	
                                                                 SaioaHasieratuButton.setBounds(162, 331, 165, 48);
                                                                 HasieratuPanel.add(SaioaHasieratuButton);
                                                                 
                                                                 PasahitzaField = new JPasswordField();
                                                                 PasahitzaField.setFont(new Font("Tahoma", Font.PLAIN, 18));
                                                                 PasahitzaField.setBounds(356, 258, 125, 20);
                                                                 HasieratuPanel.add(PasahitzaField);
                                        
                                        
                                                   
                                               
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
                                                   
                                                           
			           JComboBox<String> LangileKopuruaBox  = new JComboBox<String>();
			           LangileKopuruaBox.setBounds(331, 200, 235, 30);
			           AgentziaBerriPanel.add(LangileKopuruaBox);
			           
			                                    JLabel AgentziaMotaLabel  = new JLabel("Agentzia mota");
			                                    AgentziaMotaLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));    
			                                    AgentziaMotaLabel.setBounds(132, 254, 125, 28);
			                                    AgentziaBerriPanel.add(AgentziaMotaLabel);
			                                    
                         JComboBox<String>  AgentziaMotaBox  = new JComboBox<String>();
                         AgentziaMotaBox.setBounds(331, 256, 235, 30);                
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
                         GordeButton.addActionListener(new ActionListener() {

                         	public void actionPerformed(ActionEvent e) {
                         		String izena = AgentziaIzenBerri.getText();
                        		String markaKolorea = MarkaKoloreField.getText();
                        		String langileKopurua = (String) LangileKopuruaBox.getSelectedItem();
                        		String mota = (String) AgentziaMotaBox.getSelectedItem(); 
                        		String logo = LogoField.getText();
                        		String pasahitza = new String (passwordField.getPassword());
                        		Agentzia agentzia = new Agentzia(0, izena, markaKolorea, langileKopurua, mota, logo, pasahitza, arraBida );
                        		try {
									boolean exito = agentziaDao.insertAgentzia(agentzia);
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
                        	 agentziak = agentziaDao.AgentziaKargatuBidaiekin();
                                AgentziaBerriPanel.setVisible(false);
                                HasieratuPanel.setVisible(true);
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
                                                EkiBerriBidPanel.setVisible(true);        
                                            }
                                        });
                                        btnEkitaldiBerria.setBounds(494, 210, 129, 23);
                                        BidaiekitaldiPanel_1.add(btnEkitaldiBerria);
                                        
                                        
                                        btnDeskonektatu.setBounds(494, 377, 188, 43);
                                        BidaiekitaldiPanel_1.add(btnDeskonektatu);
                                        
                                        
       
                                        btnSortuEskaintzak.setBounds(111, 378, 264, 40);
                                        BidaiekitaldiPanel_1.add(btnSortuEskaintzak); 
                                        BidaiaTable = new JTable();
                                        BidaiaTable.setBounds(46, 29, 369, 113);
                                        BidaiekitaldiPanel_1.add(BidaiaTable);                                     
                                        BidaiaTable.addMouseListener(new MouseAdapter() {
               
        	    @Override
        	    public void mousePressed(MouseEvent e) {
        	        int selectedRow = BidaiaTable.getSelectedRow();
        	        if (selectedRow != -1) {
        	            // Eliminar la fila seleccionada de la lista
        	            metodoak.eliminarBidaia(selectedRow);
        	        }
        	    }
        	});
        	
                                        EkitaldiTable = new JTable();
                                        EkitaldiTable.setBounds(46, 187, 369, 113);
                                        BidaiekitaldiPanel_1.add(EkitaldiTable);
                                        
                                        JButton EzabatuBidaiaButton = new JButton("Ezabatu bidaia");
                                        EzabatuBidaiaButton.setBounds(494, 122, 129, 20);
                                        BidaiekitaldiPanel_1.add(EzabatuBidaiaButton);
                                        
                                       BidaiaTable.addMouseListener(new MouseAdapter() {
                        	          	    @Override
                        	          	    public void mousePressed(MouseEvent e) {
                        	          	      int filaSeleccionada = BidaiaTable.getSelectedRow();

                        	          	  // Otiene el índice de la fila seleccionada

                        	          	      
                        	          	// Obtener el idBid de la tabla
                        	          	    int idBid = obtenerIdBidDeTabla(filaSeleccionada, agentziId);
                   	          	        	
                        	          	        	 EzabatuBidaiaButton.addActionListener(new ActionListener() {
                        	          	              	public void actionPerformed(ActionEvent e) {
                        	          		          	// Verificar si se obtuvo un idBid válido antes de intentar borrar

                        	          		          	if (idBid != -1) {
                        	          		          	    // Llamar al método para borrar la bidaia con el idBid obtenido
                        	          		          	    borrarBidaiaPorId(idBid, agentziId);

                        	          		          	} else {

                        	          		          	    // Si no se obtuvo un idBid válido, se puede mostrar un mensaje de error o advertencia
                        	          		          	    System.out.println("No se pudo obtener un idBid válido.");
                        	          		          	}
                        	          	              	TaulaAktualizatu(agentziId);
                        	          	         BidaiaTable.repaint();

                        	          	        }

                        	          	     

                        	          	        	 }

                        	          	);



                        	             

                        	           		

                        	           	}

                        	          	    } );
                                        
                                        JButton EzabatuekitaldiButton = new JButton("Ezabatu ekitaldia");
                                        EzabatuekitaldiButton.setBounds(494, 244, 129, 20);
                                        BidaiekitaldiPanel_1.add(EzabatuekitaldiButton);
                                     BidaiBerriPanel.setBounds(20, 21, 750, 545);
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
                                     
                                     JComboBox <String> HerrialdeBox = new JComboBox <String>();
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
                                     		String izena = BidaiIzenaField.getText();

                        	        		Date HasieraData = BidaiHasieraCalendar.getDate();

                        	        		Date AmaieraData = BidaiAmaieraCalendar.getDate();

                        	        		String egunaks = EgunakArea.getText();

                        	        		int egunak = Integer.parseInt(egunaks);

                        	        		String mota = (String) bidaiMotaBox.getToolTipText();

                        	        		String herrialdea = (String) HerrialdeBox.getToolTipText();

                        	        		Bidaia bidaia = new Bidaia(0, izena, HasieraData, AmaieraData, egunak, mota, herrialdea, arraEkit);

                        	        		boolean exito = bidaiaDao.insertBidaia(bidaia, agentziId);       
                                     	}
                                     });
                                     BidaiGordebutton.setFont(new Font("Tahoma", Font.PLAIN, 18));
                                     BidaiGordebutton.setBounds(141, 508, 111, 36);
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
                                     frame.getContentPane().add(BidaiBerriPanel);
                                     BidaiBerriPanel.setLayout(null);
                                     
                                     BidaiHasieraCalendar.addPropertyChangeListener("date", evt -> kalkulatuDiferentzia());
                         	         BidaiAmaieraCalendar.addPropertyChangeListener("date", evt -> kalkulatuDiferentzia());
                                     
                                     EkiBerriPanel.setBounds(10, 11, 760, 145);
                                     frame.getContentPane().add(EkiBerriPanel);
                                     EkiBerriPanel.setLayout(null);
                                     EkiBerriPanel.setVisible(false);
                                     JLabel lblEkIzena = new JLabel("Ekitaldiaren Izena");
                                     lblEkIzena.setHorizontalAlignment(SwingConstants.LEFT);
                                     lblEkIzena.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                     lblEkIzena.setBounds(75, 71, 117, 20);
                                     EkiBerriPanel.add(lblEkIzena);
                                     
                                      
                                      JLabel lblEkMota = new JLabel("Ekkitaldi Mota");
                                      lblEkMota.setHorizontalAlignment(SwingConstants.LEFT);
                                      lblEkMota.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                      lblEkMota.setBounds(75, 113, 97, 20);
                                      EkiBerriPanel.add(lblEkMota);
                                      
                                       txtEkIzena = new JTextField();
                                       txtEkIzena.setBounds(259, 73, 125, 20);
                                       EkiBerriPanel.add(txtEkIzena);
                                       txtEkIzena.setColumns(10);
                                       
                                            
                                             JComboBox EkMotaBox = new JComboBox();
                                             EkMotaBox.setBounds(259, 111, 125, 22);
                                             EkMotaBox.addItem("Bidaia");
                                             EkMotaBox.addItem("Ostatua");
                                             EkMotaBox.addItem("Jarduera");
                                             EkiBerriPanel.add(EkMotaBox);
                                             
                                             EkMotaBox.addActionListener(new ActionListener() {
                                                    	    @Override
                                                    	    public void actionPerformed(ActionEvent e) {
                                                    	        int selectedIndex = EkMotaBox.getSelectedIndex();
                                                    	        if (selectedIndex == 0) { 
                                                    	        	EkiOstPanel.setVisible(false);
	                                           	EkiAktPanel.setVisible(false);
	                                           	EkiBerriBidPanel.setVisible(true);
                                                    	        } else if (selectedIndex == 1) {
	                                           	EkiBerriBidPanel.setVisible(false);
	                                           	EkiAktPanel.setVisible(false);
	                                           	EkiOstPanel.setVisible(true);
                                                    	        } else if (selectedIndex == 2) {                                           	
	                                           	EkiBerriBidPanel.setVisible(false);
                                                    	        	EkiOstPanel.setVisible(false);
                                                    	        	EkiAktPanel.setVisible(true);
                                                    	    }
                                                    	   }
                                                    	});
                                     
                                     
                                     
                                     EkiOstPanel.setBounds(20, 159, 750, 407);
                                     frame.getContentPane().add(EkiOstPanel);
                                     EkiOstPanel.setLayout(null); 
                                     EkiOstPanel.setVisible(false);
                                     
                                                         JLabel lblLogelaMo = new JLabel("Logela Mota");
                                                         lblLogelaMo.setHorizontalAlignment(SwingConstants.LEFT);
                                                         lblLogelaMo.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                         lblLogelaMo.setBounds(76, 11, 86, 20);
                                                         EkiOstPanel.add(lblLogelaMo);
                                                         
                                                         JLabel lblHiria = new JLabel("Hiria");
                                                         lblHiria.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                         lblHiria.setBounds(76, 53, 86, 17);
                                                         EkiOstPanel.add(lblHiria);
                                                         
                                                         JLabel lblPrezioa = new JLabel("Prezioa");
                                                         lblPrezioa.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                         lblPrezioa.setBounds(76, 91, 60, 20);
                                                         EkiOstPanel.add(lblPrezioa);
                                                         
                                                         JDateChooser Sarreradate = new JDateChooser();
                                                         Sarreradate.setBounds(257, 133, 121, 26);
                                                         EkiOstPanel.add(Sarreradate);
                                                         
                                                         JLabel lblSarrEguna = new JLabel("Sarrera Eguna");
                                                         lblSarrEguna.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                         lblSarrEguna.setBounds(76, 145, 99, 14);
                                                         EkiOstPanel.add(lblSarrEguna);
                                                         
                                                         JLabel lblIrteeraEguna = new JLabel("Irteera Eguna");
                                                         lblIrteeraEguna.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                         lblIrteeraEguna.setBounds(406, 145, 99, 14);
                                                         EkiOstPanel.add(lblIrteeraEguna);
                                                         
                                                         JDateChooser Irteeradate = new JDateChooser();
                                                         Irteeradate.setBounds(546, 133, 121, 26);
                                                         EkiOstPanel.add(Irteeradate);
                                                         
                                                         hiriaTxt = new JTextField();
                                                         hiriaTxt.setBounds(257, 53, 101, 20);
                                                         EkiOstPanel.add(hiriaTxt);
                                                         hiriaTxt.setColumns(10);
                                                         
                                                         Prezioatxt = new JTextField();
                                                         Prezioatxt.setColumns(10);
                                                         Prezioatxt.setBounds(257, 91, 101, 20);
                                                         EkiOstPanel.add(Prezioatxt);
                                                         
                                                         JComboBox LogelaMotaBox = new JComboBox();
                                                         LogelaMotaBox.setBounds(257, 12, 130, 22);
                                                         LogelaMotaBox.addItem("Bikoitza");
                                                         LogelaMotaBox.addItem("Banakoa");
                                                         LogelaMotaBox.addItem("Hirukoitza");
                                                         EkiOstPanel.add(LogelaMotaBox);
                                                         
                                                                                                 
                                  JButton OstatuBilatuButton = new JButton("Ostatua Bilatu");
                                  OstatuBilatuButton.setBounds(398, 70, 169, 23);
                                  EkiOstPanel.add(OstatuBilatuButton);                                                           
                                  JButton GordeButton_1 = new JButton("Gorde");
                                  GordeButton_1.addActionListener(new ActionListener() {
                                  public void actionPerformed(ActionEvent e) {
                                    }
                                  });
                                  GordeButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
                                  GordeButton_1.setBounds(149, 356, 115, 40);
                                  EkiOstPanel.add(GordeButton_1);
                                  
                                  JButton AtzeraButton_1 = new JButton("Atzera");
                                  AtzeraButton_1.addActionListener(new ActionListener() {
                                  	public void actionPerformed(ActionEvent e) {
                                  		EkiBerriBidPanel.setVisible(true);
                                  		EkiOstPanel.setVisible(false); 
                                  	}
                                  });
                                  AtzeraButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
                                  AtzeraButton_1.setBounds(444, 356, 137, 40);
                                  EkiOstPanel.add(AtzeraButton_1);
                                     
      
                                     EkiAktPanel.setBounds(0, 176, 790, 413);
                                     frame.getContentPane().add(EkiAktPanel);
                                     EkiAktPanel.setLayout(null);
                                     EkiAktPanel.setVisible(false);
                                     
                                     JLabel lbldesk = new JLabel("Deskripzioa");
                                     lbldesk.setFont(new Font("Tahoma", Font.PLAIN, 14));
                                     lbldesk.setBounds(98, 12, 79, 19);
                                     EkiAktPanel.add(lbldesk);
                                     
                                     JTextArea Desktxt = new JTextArea();
                                     Desktxt.setBounds(280, 11, 161, 46);
                                     EkiAktPanel.add(Desktxt);
                                     
                                     JLabel lblPrezioOs = new JLabel("Prezioa");
                                     lblPrezioOs.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                     lblPrezioOs.setBounds(98, 77, 56, 19);
                                     EkiAktPanel.add(lblPrezioOs);
                                     
                                     prezTxt = new JTextField();
                                     prezTxt.setBounds(280, 78, 86, 20);
                                     EkiAktPanel.add(prezTxt);
                                     prezTxt.setColumns(10);
                                     
                                     JLabel lblDataOst = new JLabel("Data");
                                     lblDataOst.setBounds(98, 141, 46, 14);
                                     EkiAktPanel.add(lblDataOst);
                                     
                                     JDateChooser dateChooser_1 = new JDateChooser();
                                     dateChooser_1.setBounds(280, 135, 142, 20);
                                     EkiAktPanel.add(dateChooser_1);
                                     
                                     JButton BidaiGordebutton_2_1 = new JButton("Gorde");
                                     BidaiGordebutton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
                                     BidaiGordebutton_2_1.setBounds(174, 366, 119, 36);
                                     EkiAktPanel.add(BidaiGordebutton_2_1);
                                     
                                     JButton BidaiEzeztatuButton_2_1 = new JButton("Ezeztatu");
                                     BidaiEzeztatuButton_2_1.addActionListener(new ActionListener() {
                                     	public void actionPerformed(ActionEvent e) {
                                     		EkiBerriBidPanel.setVisible(true);
                                     		EkiAktPanel.setVisible(false);
                                     	}
                                     });
                                     BidaiEzeztatuButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
                                     BidaiEzeztatuButton_2_1.setBounds(469, 366, 119, 36);
                                     EkiAktPanel.add(BidaiEzeztatuButton_2_1);
                                
                               /** IbilbideBox.addActionListener(new ActionListener() {
                               	    @Override
                               	    public void actionPerformed(ActionEvent e) {
                               	        int selectedIndex = IbilbideBox.selectedIndex();
                               	        if (selectedIndex == 0) { 
                               	        	EkiOstPanel.setVisible(false);
                                           	EkiAktPanel.setVisible(false);
                                           	EkiBerriBidPanel.setVisible(true);
                               	        } else if (selectedIndex == 1) {
                                           	EkiBerriBidPanel.setVisible(false);
                                           	EkiAktPanel.setVisible(false);
                                           	EkiOstPanel.setVisible(true);
                               	        } else if (selectedIndex == 2);                                           	
                                           	EkiBerriBidPanel.setVisible(false);
                               	        	EkiOstPanel.setVisible(false);
                               	        	EkiAktPanel.setVisible(true);
                               	    }
                               	});
                               	*/
			           langileKop = ModeloDao.AgentziaDao.langileKop();
			                   for (String kop : langileKop) {
			                       LangileKopuruaBox.addItem(kop);
			                     }
                         agenMota = ModeloDao.AgentziaDao.agenMota();
                                 for (String mota : agenMota) {
                                     AgentziaMotaBox.addItem(mota);
                                }
           
           DefaultTableModel modeloa = new DefaultTableModel();
           String[] izenakKolum = {"Bidaia", "Mota", "Egunak", "Hasiera", "Amaiera", "Herrialdea"};
           modeloa.setColumnIdentifiers(izenakKolum);
           try {
        	   ArrayList <Agentzia> arraAgen = agentziaDao.AgentziaKargatuBidaiekin();
        	   Object [] fila = new Object[modeloa.getColumnCount()];
        	   for(int i = 0; i < arraAgen.size(); i++) {
        		   for (int j = 0; j < arraAgen.get(i).getArraBida().size(); j++) {
        		  fila[0] = arraAgen.get(i).getArraBida().get(j).getIzena();
        		  fila[1] = arraAgen.get(i).getArraBida().get(j).getMota();
        		  fila[2]  = arraAgen.get(i).getArraBida().get(j).getEgunak();
        		  fila[3] = arraAgen.get(i).getArraBida().get(j).getHasieraData();
        		  fila[4] = arraAgen.get(i).getArraBida().get(j).getAmaieraData();
        		  fila[5] = arraAgen.get(i).getArraBida().get(j).getHerrialdea();
        		  modeloa.addRow(fila);
        	   }
        		   BidaiaTable.setModel(modeloa);
           } 
           }
           catch (Exception e) {
        	   System.err.println( "Errorea gertatu da" + e.getMessage());
           }
           DefaultTableModel modeloa1 = new DefaultTableModel();
           String[] izenakKolum1 = {"Ekitaldi Izena", "Mota", "Data", "Prezioa"};
           modeloa1.setColumnIdentifiers(izenakKolum1);
           try {
        	   ArrayList <Agentzia> arraAgen = agentziaDao.AgentziaKargatuBidaiekin();
        	   Object [] fila = new Object[modeloa1.getColumnCount()];
        	   for(int i = 0; i < arraAgen.size(); i++) {
        		   for (int j = 0; j < arraAgen.get(i).getArraBida().size(); j++) {
        			   for(int x = 0; x < arraAgen.get(i).getArraBida().get(j).getArraEkit().size(); x++) { 
        		  fila[0] = arraAgen.get(i).getArraBida().get(j).getIzena();
        		  fila[1] = arraAgen.get(i).getArraBida().get(j).getMota();
        		  fila[2]  = arraAgen.get(i).getArraBida().get(j).getArraEkit().get(x);
        		  fila[3] = arraAgen.get(i).getArraBida().get(j).getArraEkit().get(x).getPrezioa();
        		   
        		  modeloa1.addRow(fila);
        	   }
        		   EkitaldiTable.setModel(modeloa1);
           }} 
           }
           catch (Exception e) {
        	   System.err.println( "Errorea gertatu da" + e.getMessage());
           }
                        
                        EkitaldiHemAer = ModeloDao.EkitaldiDao.EkitaldiHemAer();
                        for (String datu : EkitaldiHemAer) {
                        EkitaldiHemAerBox.addItem(datu);
                      } 
                                
                                EkitaldiJaAer = ModeloDao.EkitaldiDao.EkitaldiJaAer();
                                for (String datu : EkitaldiJaAer) {
                                JaAeroportuaBox.addItem(datu);
                              } 
        
        bidaiMota = ModeloDao.BidaiaDao.bidaiMotak();
        for (String mota : bidaiMota) {
      	bidaiMotaBox.addItem(mota);
      }       
        herrialdeak = ModeloDao.HerrialdeDao.herrialdeak();
        for (String mota : herrialdeak) {
      	HerrialdeBox.addItem(mota);
      }   
                         
        /**
        DataAmaiera = BidaiAmaieraCalendar.getDate(); 
        DataHasiera = BidaiHasieraCalendar.getDate();
        long diffInMillies = Math.abs(DataAmaiera.getTime() - DataHasiera.getTime());
        long diffInDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        String egunak = Long.toString(diffInDays);
        EgunakArea.setText(egunak);
        **/
                AgentziaDao agentziaDao = new AgentziaDao();
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
                
    }
    {
    }
        
    private void kalkulatuDiferentzia() {

	    DataAmaiera = BidaiAmaieraCalendar.getDate(); 

        DataHasiera = BidaiHasieraCalendar.getDate();

        long diffInMillies = Math.abs(DataAmaiera.getTime() - DataHasiera.getTime());

        long diffInDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        String egunak = Long.toString(diffInDays);

        System.out.println(egunak);

        EgunakArea.setText(egunak);



    }

  

    public void TaulaAktualizatu(int idAgen) {

        // Limpiar la tabla antes de agregar nuevas filas

        modeloa.setRowCount(0);  // O modeloa.removeAllRows() dependiendo de la implementación

        

        // Buscar y agregar filas del ArrayList que corresponden al idAgen específico

        for (int i = 0; i < arraAgen.size(); i++) {

            // Verificar si el objeto tiene el idAgen que buscamos

            if (arraAgen.get(i).getIdAgen() == idAgen) {

                // Iterar sobre el ArrayList de ArraBida

                for (int j = 0; j < arraAgen.get(i).getArraBida().size(); j++) {

                    // Crear el array fila para la nueva fila de la tabla

                    Object[] fila = new Object[modeloa.getColumnCount()];



                    // Rellenar la fila con los datos

                    fila[0] = arraAgen.get(i).getArraBida().get(j).getIzena();

                    fila[1] = arraAgen.get(i).getArraBida().get(j).getMota();

                    fila[2] = arraAgen.get(i).getArraBida().get(j).getEgunak();

                    fila[3] = arraAgen.get(i).getArraBida().get(j).getHasieraData();

                    fila[4] = arraAgen.get(i).getArraBida().get(j).getAmaieraData();

                    fila[5] = arraAgen.get(i).getArraBida().get(j).getHerrialdea();



                    // Agregar la fila al modelo de la tabla

                    modeloa.addRow(fila);

                }

                break;  // Salir del bucle una vez encontrado el idAgen

            }

        }

    }

   

    public int obtenerIdBidDeTabla(int filaSeleccionada, int idEspecifico) {

        if (filaSeleccionada == -1) {

            System.out.println("No se ha seleccionado ninguna fila.");

            return -1; // No se ha seleccionado ninguna fila

        }



        // Recorremos el array de agentes

        int rowIndex = 0;

        for (int i = 0; i < arraAgen.size(); i++) {

            // Verificamos si el agente tiene el idEspecifico

            if (arraAgen.get(i).getIdAgen() == idEspecifico) {

                // Si el idAgen coincide con el idEspecifico, recorremos su lista de ArraBida

                for (int j = 0; j < arraAgen.get(i).getArraBida().size(); j++) {

                    // Verificamos si el índice de la fila seleccionada coincide con la fila actual

                    if (rowIndex == filaSeleccionada) {

                        // Si encontramos la fila seleccionada, obtenemos el idBid del objeto "Bidaia"

                    	System.out.println( arraAgen.get(i).getArraBida().get(j).getId_bid()); 

                        return arraAgen.get(i).getArraBida().get(j).getId_bid(); 

                        

                    }

                    rowIndex++;

                }

            }

        }



        // Si no se encuentra el idBid correspondiente, retornar -1

        return -1;

    }



    public void borrarBidaiaPorId(int idBid, int idEspecifico) {

        // Recorrer el ArrayList de agentes (arraAgen)

        for (int i = 0; i < arraAgen.size(); i++) {

            // Verificamos si el agente tiene el idEspecifico

            if (arraAgen.get(i).getIdAgen() == idEspecifico) {

                // Recorrer el ArrayList de ArraBida del agente actual

                for (int j = 0; j < arraAgen.get(i).getArraBida().size(); j++) {

                    Bidaia bidaia = arraAgen.get(i).getArraBida().get(j);

                    

                    // Comprobar si el idBid de la bidaia coincide con el idBid pasado como parámetro

                    if (bidaia.getId_bid() == idBid) {

                        // Eliminar la fila correspondiente en la tabla

                        modeloa.removeRow(j); // Eliminar la fila de la tabla

                        

                        // Eliminar la bidaia de la lista interna de arraBida

                        arraAgen.get(i).getArraBida().remove(j);

                        

                        System.out.println("Bidaia con idBid " + idBid + " ha sido eliminada.");



                        // Salir del bucle una vez que hemos encontrado y eliminado la bidaia

                        return; // Terminar el método después de eliminar

                    }

                }

            }

        }

        // Si no se encontró ningún idBid correspondiente, se puede mostrar un mensaje

        System.out.println("No se encontró la bidaia con idBid: " + idBid);

    }

}


    	

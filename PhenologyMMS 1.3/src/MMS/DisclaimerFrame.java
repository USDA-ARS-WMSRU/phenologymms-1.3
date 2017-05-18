/*
 * DisclaimerFrame.java
 *
 * Created on March 18, 2010, 2:45 PM
 *
 */

package MMS;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*; // de added
import java.io.*; // de added
//import java.util.*; // de added
import java.net.URL; // de added
/**
 *
 * @author DebbieEdmundsA
 */
public class DisclaimerFrame  extends JFrame {
  GridBagLayout jGridBagLayout = new GridBagLayout(); 
  GridBagConstraints cn = new GridBagConstraints();  
    
  JPanel jMainPanel = new JPanel();
  BorderLayout borderLayout1 = new BorderLayout();
  
  String disclaimer = "";
  
  // panels
  JPanel jNorthPanel = new JPanel();
  JPanel jCenterPanel = new JPanel();
  JPanel jEastPanel = new JPanel();
  JPanel jWestPanel = new JPanel();
  JPanel jSouthPanel = new JPanel();
  
  // title for the screen
  JLabel jTitleLabel = new JLabel();

  //panes
  JScrollPane jSPDisclaimer = new JScrollPane();
  JTextPane jTPDisclaimer= new JTextPane();
  
  // de added Close button
  JButton jBClose = new JButton();
    
    /** Creates a new instance of InputHelpFrame */
  // constructor
    public DisclaimerFrame() {
         try {
      this.setSize(600,550); //(width, height)
      this.setLocation(120,10);
      jbInit();
      }
      catch(Exception e) {
        e.printStackTrace();
      }
    } // end of constructor
    
     private void jbInit() throws Exception {
    // jMainPanel
    jMainPanel.setLayout(borderLayout1);
    
    // jNorthPanel
    jNorthPanel.setBackground(SystemColor.info);
    jNorthPanel.setPreferredSize(new Dimension(10, 40));
    jNorthPanel.setLayout(jGridBagLayout);//de changed to jGridBagLayout
    
    // jCenterPanel
    jCenterPanel.setBackground(SystemColor.info);
    jCenterPanel.setSize(500,300);
    
    // jEastPanel
    jEastPanel.setBackground(SystemColor.info);
    jEastPanel.setPreferredSize(new Dimension(40, 10));
    
    // jWestPanel
    jWestPanel.setBackground(SystemColor.info);
    jWestPanel.setPreferredSize(new Dimension(40, 10));
    
    // jSouthPanel
    jSouthPanel.setBackground(SystemColor.info);
    jSouthPanel.setPreferredSize(new Dimension(10, 40));
    jSouthPanel.setLayout(jGridBagLayout);//de changed to jGridBagLayout
    
    // jTitleLabel
    jTitleLabel.setFont(new java.awt.Font("Dialog", 1, 16));
    jTitleLabel.setText("USDA-ARS Disclaimer");
        
    // de added for Exit button   
    jBClose.setText("Close");
    
    //scrollpane
        jSPDisclaimer.setVerticalScrollBarPolicy
            (JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jSPDisclaimer.setHorizontalScrollBarPolicy
            (JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);//de added
        jSPDisclaimer.setPreferredSize(new Dimension(500, 400));
        
        //textpane
        jSPDisclaimer.setFont(new java.awt.Font("DialogInput", 1, 12));
        
        readFile(new File(getAppPath() + "/Disclaimer.txt"));
        jTPDisclaimer.setText(disclaimer);
               
        // add panels
        this.getContentPane().add(jMainPanel, BorderLayout.CENTER);
        jMainPanel.add(jNorthPanel, BorderLayout.NORTH);
        jMainPanel.add(jSouthPanel, BorderLayout.SOUTH);
        jMainPanel.add(jEastPanel, BorderLayout.EAST);
        jMainPanel.add(jWestPanel, BorderLayout.WEST);
        jMainPanel.add(jCenterPanel, BorderLayout.CENTER);
        
        // add title to jNorthPanel
        addItem(jTitleLabel, 0, 1, 1, 1, "jNorthPanel");
        
        // add items to jSouthPanel
        addItem(jBClose, 0, 1, 1, 1, "jSouthPanel");
              
        //add ScrollPane to jCenterPanel
        addItem(jSPDisclaimer, 0, 0, 1, 1,  "jCenterPanel");
        jSPDisclaimer.getViewport().add(jTPDisclaimer, null);

                   
        jBClose.addActionListener(
            new ActionListener() {  
                public void actionPerformed(ActionEvent e) {
                    jBClose_actionPerformed(e);
		    }
            });
    
  } // end of jbInit
  
       public void readFile(File aFile){  //String
        StringBuffer buffer = new StringBuffer();        
        
        try{
            BufferedReader in= new BufferedReader(new FileReader(aFile));            
            String newLine;
            
            while((newLine = in.readLine())!= null){
                buffer.append(newLine + "\n");            
                disclaimer = buffer.toString();
            }  
            
            in.close();
            
        }
        catch(IOException ex){
            ex.printStackTrace();
        }            

        setOutput(disclaimer);
    }  
    
    public void setOutput(String fortOutput){
        disclaimer = fortOutput;
    }
    
    public String getOutput() {
        return disclaimer;
    }
    
              // bcv added path find
    public String getAppPath(){
       String tmp, c1;
       tmp = "";
       int indx, mm;
                try {                        
                    URL url = new URL("jar", "", -1, "file:" + new File("").getAbsolutePath());
                    tmp = url.toString();
                    c1 = url.getPath();     
                    indx = c1.indexOf(":");
                    mm = c1.length();            
                    tmp = c1.substring(indx + 1, mm);  
                   // System.out.println("tmp = " +tmp);
                 }
                 catch (Exception e) {
                   System.out.println("IOException: URL");
                 }
       return tmp;       
   }
  
  void jBClose_actionPerformed(ActionEvent e) {
        this.setVisible(false);
   } // end of jBClose_actionPerformed method
  
  //DE added this method
    void addItem(Component item, int row, int column, 
                          int width, int height, String panelName){
                         
    // set constraints for items added to panels with GridBagLayout
        cn.gridx = column;
        cn.gridy = row;
        cn.gridwidth = width;
        cn.gridheight = height;
        cn.weightx = 1;
        cn.weighty = 1;
        cn.ipadx = 0;
        cn.ipady = 0;
        
        if(panelName.equals("jNorthPanel")) {
            jGridBagLayout.setConstraints(item, cn);
            jNorthPanel.add(item);
        } 
        else if(panelName.equals("jCenterPanel")){
            jGridBagLayout.setConstraints(item, cn);
            jCenterPanel.add(item);
        }
        else if(panelName.equals("jSouthPanel")) {
            jGridBagLayout.setConstraints(item, cn);
            jSouthPanel.add(item);
        }    
        
    } // end of AddItem method   
    
  } // end of Disclaimer class
    

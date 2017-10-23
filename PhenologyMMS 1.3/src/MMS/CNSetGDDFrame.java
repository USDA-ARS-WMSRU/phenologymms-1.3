// CNSetGDDFrame.java

package MMS;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.beans.*;
import java.net.URL;

/**
 *  Title:       MMS Test2 
 *  Description: Started 9 Sept 2002 
 *  Copyright:   Copyright (c) 2002 
 *  Company:     USDA/ARS
 *
 *@author        Ben Riebau
 *@created       September 16, 2002
 *@version       1.0
 *
 *revised        Debbie Edmunds, February, 2005
 */

public class CNSetGDDFrame extends JFrame {
    Parameters myParameters;
    Run myRun;
    boolean loadNotPressed;
    
//    **************  frames set in
    Frame myHelpFrame;
    OutPutFrame myOutputFrame;
    boolean helpOn = true;
    Frame BackFrame;
   ArrayList <Object>allVarieties = new ArrayList<Object>();

//    swing stuff**************
    JPanel jMainPanel = new JPanel();
    BorderLayout borderLayout1 = new BorderLayout();
    
    // declare GridBagLayout manager and constraints
    GridBagLayout jGridBagLayout = new GridBagLayout(); // DE added
    GridBagConstraints cn = new GridBagConstraints();  // DE added
    
    // jNorthPanel
    JPanel jNorthPanel = new JPanel();
    JLabel jTitleLabel = new JLabel();
    
    // jSouthPanel
    JPanel jSouthPanel = new JPanel();
    JButton jBBack = new JButton();
    JButton jHelpButton = new JButton(); 
    JLabel jVarietyLabel = new JLabel();
    JComboBox jCBVarietyType = new JComboBox();
    JButton jRunButton = new JButton();
    JButton jResetButton = new JButton();
    
    // **************** other panels ************************
    // jPanel1 is the center panel of the jMainPanel in Border Layout
    JPanel jPanel1 = new JPanel();
    JPanel jGDDPanel = new JPanel();    
    JPanel jPanelGDDStress = new JPanel();
    JPanel jLVSPanel = new JPanel();
    JPanel jPanelLVSStress = new JPanel();
    
    //labels and titles
    JLabel jLGDDLabel = new JLabel();
    JLabel jLVSTitle = new JLabel();
    JLabel jGDDLabel = new JLabel();
    JLabel jGDDStressedLabel = new JLabel();
    JLabel jLVSLabel = new JLabel();
    JLabel jLVSStressedLabel = new JLabel();
    
    //ButtonGroups
    ButtonGroup Row1Group = new ButtonGroup();
    ButtonGroup Row2Group = new ButtonGroup();
    ButtonGroup Row3Group = new ButtonGroup();
    ButtonGroup Row4Group = new ButtonGroup();
    ButtonGroup Row5Group = new ButtonGroup();
    ButtonGroup Row6Group = new ButtonGroup();
    ButtonGroup Row7Group = new ButtonGroup();
    ButtonGroup Row8Group = new ButtonGroup();
    ButtonGroup Row9Group = new ButtonGroup();
    ButtonGroup Row10Group = new ButtonGroup();
    ButtonGroup Row11Group = new ButtonGroup();
    ButtonGroup Row12Group = new ButtonGroup();
    ButtonGroup Row13Group = new ButtonGroup();
    ButtonGroup Row14Group = new ButtonGroup();
       
    // ********RadioButtons and TextFields********
    // for jGDDPanel
    JTextField jTFNumber1 = new JTextField();
    JRadioButton jRBNumber1 = new JRadioButton();
    JTextField jTFNumber2 = new JTextField();
    JRadioButton jRBNumber2 = new JRadioButton();
    JTextField jTFNumber3 = new JTextField();
    JRadioButton jRBNumber3 = new JRadioButton();
    JTextField jTFNumber4 = new JTextField();
    JRadioButton jRBNumber4 = new JRadioButton();
    JTextField jTFNumber5 = new JTextField();
    JRadioButton jRBNumber5 = new JRadioButton();
    JTextField jTFNumber6 = new JTextField();
    JRadioButton jRBNumber6 = new JRadioButton();    
    JTextField jTFNumber7 = new JTextField();
    JRadioButton jRBNumber7 = new JRadioButton();
    JTextField jTFNumber8 = new JTextField();
    JRadioButton jRBNumber8 = new JRadioButton();
    JTextField jTFNumber9 = new JTextField();
    JRadioButton jRBNumber9 = new JRadioButton();
    JTextField jTFNumber10 = new JTextField();
    JRadioButton jRBNumber10 = new JRadioButton();
    JTextField jTFNumber11 = new JTextField();
    JRadioButton jRBNumber11 = new JRadioButton();
    JTextField jTFNumber12 = new JTextField();
    JRadioButton jRBNumber12 = new JRadioButton();
    JTextField jTFNumber13 = new JTextField();
    JRadioButton jRBNumber13 = new JRadioButton();
    JTextField jTFNumber14 = new JTextField();
    JRadioButton jRBNumber14 = new JRadioButton();

    
    // for jPanelGDDStress
    JTextField jTFNumber15 = new JTextField();
    JRadioButton jRBNumber15 = new JRadioButton();
    JTextField jTFNumber16 = new JTextField();
    JRadioButton jRBNumber16 = new JRadioButton();
    JTextField jTFNumber17 = new JTextField();
    JRadioButton jRBNumber17 = new JRadioButton();          
    JTextField jTFNumber18 = new JTextField();
    JRadioButton jRBNumber18 = new JRadioButton();
    JTextField jTFNumber19 = new JTextField();
    JRadioButton jRBNumber19 = new JRadioButton();
    JTextField jTFNumber20 = new JTextField();
    JRadioButton jRBNumber20 = new JRadioButton();
    JTextField jTFNumber21 = new JTextField();
    JRadioButton jRBNumber21 = new JRadioButton();
    JTextField jTFNumber22 = new JTextField();
    JRadioButton jRBNumber22 = new JRadioButton();
    JTextField jTFNumber23 = new JTextField();
    JRadioButton jRBNumber23 = new JRadioButton();
    JTextField jTFNumber24 = new JTextField();
    JRadioButton jRBNumber24 = new JRadioButton();
    JTextField jTFNumber25 = new JTextField();
    JRadioButton jRBNumber25 = new JRadioButton();
    JTextField jTFNumber26 = new JTextField();
    JRadioButton jRBNumber26 = new JRadioButton();
    JTextField jTFNumber27 = new JTextField();
    JRadioButton jRBNumber27 = new JRadioButton();
    JTextField jTFNumber28 = new JTextField();
    JRadioButton jRBNumber28 = new JRadioButton();

    
    // for jLVSPanel
    JTextField jTFNumber29 = new JTextField();
    JRadioButton jRBNumber29 = new JRadioButton();
    JTextField jTFNumber30 = new JTextField();
    JRadioButton jRBNumber30 = new JRadioButton();
    JTextField jTFNumber31 = new JTextField();
    JRadioButton jRBNumber31 = new JRadioButton();  
    JTextField jTFNumber32 = new JTextField();
    JRadioButton jRBNumber32 = new JRadioButton();        
    JTextField jTFNumber33 = new JTextField();
    JRadioButton jRBNumber33 = new JRadioButton();
    JTextField jTFNumber34 = new JTextField();
    JRadioButton jRBNumber34 = new JRadioButton();
    JTextField jTFNumber35 = new JTextField();
    JRadioButton jRBNumber35 = new JRadioButton();
    JTextField jTFNumber36 = new JTextField();
    JRadioButton jRBNumber36 = new JRadioButton();
    JTextField jTFNumber37 = new JTextField();
    JRadioButton jRBNumber37 = new JRadioButton();
    JTextField jTFNumber38 = new JTextField();
    JRadioButton jRBNumber38 = new JRadioButton();
    JTextField jTFNumber39 = new JTextField();
    JRadioButton jRBNumber39 = new JRadioButton();
    JTextField jTFNumber40 = new JTextField();
    JRadioButton jRBNumber40 = new JRadioButton();
    JTextField jTFNumber41 = new JTextField();
    JRadioButton jRBNumber41 = new JRadioButton();
    JTextField jTFNumber42 = new JTextField();
    JRadioButton jRBNumber42 = new JRadioButton();

    
    // for jPanelLVSStress   
    JTextField jTFNumber43 = new JTextField();
    JRadioButton jRBNumber43 = new JRadioButton();
    JTextField jTFNumber44 = new JTextField();
    JRadioButton jRBNumber44 = new JRadioButton();
    JTextField jTFNumber45 = new JTextField();
    JRadioButton jRBNumber45 = new JRadioButton();
    JTextField jTFNumber46 = new JTextField();
    JRadioButton jRBNumber46 = new JRadioButton();  
    JTextField jTFNumber47 = new JTextField();
    JRadioButton jRBNumber47 = new JRadioButton();
    JTextField jTFNumber48 = new JTextField();
    JRadioButton jRBNumber48 = new JRadioButton();
    JTextField jTFNumber49 = new JTextField();
    JRadioButton jRBNumber49 = new JRadioButton();
    JTextField jTFNumber50 = new JTextField();
    JRadioButton jRBNumber50 = new JRadioButton();
    JTextField jTFNumber51 = new JTextField();
    JRadioButton jRBNumber51 = new JRadioButton();
    JTextField jTFNumber52 = new JTextField();
    JRadioButton jRBNumber52 = new JRadioButton();
    JTextField jTFNumber53 = new JTextField();
    JRadioButton jRBNumber53 = new JRadioButton();
    JTextField jTFNumber54 = new JTextField();
    JRadioButton jRBNumber54 = new JRadioButton();
    JTextField jTFNumber55 = new JTextField();
    JRadioButton jRBNumber55 = new JRadioButton();
    JTextField jTFNumber56 = new JTextField();
    JRadioButton jRBNumber56 = new JRadioButton();
    
// end of declarations

    /**
     *  Constructor for the CNSetGDDFrame object
     *
     *@param  SGHF    Description of the Parameter
     *@param  OPF     Description of the Parameter
     *@param  myPara  Description of the Parameter
     */
    public CNSetGDDFrame(Frame SGHF, OutPutFrame OPF, Parameters myPara) {
        myParameters = myPara;
        myHelpFrame = SGHF;
        myOutputFrame = OPF;
        try {
            jbInit();
            setWindow(getVarieties());
            this.setParameters();
            this.setSize(750, 550); //(width, height)
            this.setLocation(10, 10);

        } catch (Exception e) {
            e.printStackTrace();
        }
    } // end of the constructor


    /**
     *  Constructor for the CNSetGDDFrame object
     *
     *@param  SGHF    Description of the Parameter
     *@param  OPF     Description of the Parameter
     *@param  myPara  Description of the Parameter
     *@param  st      Description of the Parameter
     */
    public CNSetGDDFrame(Frame SGHF, OutPutFrame OPF, Parameters myPara, StringTokenizer st) {
//this constructor is for loading a scenario from a file
        myParameters = myPara;
        myHelpFrame = SGHF;
        myOutputFrame = OPF;
        try {
            jbInit();
            this.setGrowthStages(st);
            this.getVarieties();
            this.setWindow((CNGrowthStages) myParameters.myStages);

            this.setParameters();
            this.setSize(750, 500); //(width, height)
            this.setLocation(10, 10);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     *  Description of the Method
     *
     *@exception  Exception  Description of the Exception
     */
    private void jbInit() throws Exception {
        this.setDefaultCloseOperation(3);
        
        // ******** set panels ********
        jMainPanel.setLayout(borderLayout1);
        
        // jNorthPanel
        jNorthPanel.setBackground(SystemColor.info);
        jNorthPanel.setPreferredSize(new Dimension(10, 40));
        jNorthPanel.setLayout(jGridBagLayout);       
        
            // Title of the screen which is located in jNorthPanel
        jTitleLabel.setBackground(Color.white);
        jTitleLabel.setFont(new java.awt.Font("Dialog", 0, 24));
        jTitleLabel.setForeground(Color.blue);
        
        // jSouthPanel
        jSouthPanel.setBackground(Color.white);
        jSouthPanel.setPreferredSize(new Dimension(607, 40));
        jSouthPanel.setLayout(jGridBagLayout);
        
            // items in the jSouthPanel
        jBBack.setText("Back...");
        jBBack.addActionListener(
            new java.awt.event.ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jBBack_actionPerformed(e);
                }
            });
            
        jHelpButton.setText("Help...");
        jHelpButton.addActionListener(
            new java.awt.event.ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jHelpButton_actionPerformed(e);
                }
            });
            
        jVarietyLabel.setToolTipText("");
        jVarietyLabel.setText("Variety:");
        
        jCBVarietyType.addItemListener(
            new java.awt.event.ItemListener() {
                public void itemStateChanged(ItemEvent e) {
                    jCBVarietyType_itemStateChanged(e);
                }
            });
            
        jCBVarietyType.addPropertyChangeListener(
            new java.beans.PropertyChangeListener() {
                public void propertyChange(PropertyChangeEvent e) {
                    jCBVarietyType_propertyChange(e);
                }
            });
            
        jCBVarietyType.addActionListener(
            new java.awt.event.ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jCBVarietyType_actionPerformed(e);
                }
            });
            
        jRunButton.setText("Run");
        jRunButton.addActionListener(
            new java.awt.event.ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jRunButton_actionPerformed(e);
                }
            });
            
        jResetButton.setText("Reset");
        jResetButton.addActionListener(
            new java.awt.event.ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jResetButton_actionPerformed(e);
                }
            });
        
        //jPanel1
        jPanel1.setBackground(SystemColor.info);
        jPanel1.setLayout(jGridBagLayout);
        
        //titles and labels in jPanel1
        jLGDDLabel.setFont(new java.awt.Font("Dialog", 1, 20));
        jLGDDLabel.setText("Growing Degree-Days:");
        
        jLVSTitle.setFont(new java.awt.Font("Dialog", 1, 20));
        jLVSTitle.setText("Number of Leaves:");
        
        jGDDLabel.setFont(new java.awt.Font("Dialog", 0, 20));
        jGDDLabel.setForeground(new Color(196, 226, 192));
        jGDDLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jGDDLabel.setText("No Stress");
        
        jGDDStressedLabel.setFont(new java.awt.Font("Dialog", 0, 20));
        jGDDStressedLabel.setForeground(new Color(226, 70, 60));
        jGDDStressedLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jGDDStressedLabel.setText("Stressed");
        
        jLVSLabel.setFont(new java.awt.Font("Dialog", 0, 20));
        jLVSLabel.setForeground(new Color(192, 226, 192));
        jLVSLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jLVSLabel.setText("No Stress");
        
        jLVSStressedLabel.setBackground(SystemColor.info);
        jLVSStressedLabel.setFont(new java.awt.Font("Dialog", 0, 20));
        jLVSStressedLabel.setForeground(new Color(226, 70, 60));
        jLVSStressedLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jLVSStressedLabel.setText("Stressed");
        
            // set panels added to jPanel1
        jGDDPanel.setBackground(new Color(192, 226, 192));
        jGDDPanel.setSize(400, 30);// was 200, 30
        jGDDPanel.setLayout(jGridBagLayout);
        
        jPanelGDDStress.setBackground(new Color(226, 70, 60));
        jPanelGDDStress.setSize(300, 30); // de added 
        jPanelGDDStress.setLayout(jGridBagLayout);       
        
        jLVSPanel.setBackground(new Color(192, 226, 192));
        jLVSPanel.setSize(300, 30); 
        jLVSPanel.setLayout(jGridBagLayout);
 
        jPanelLVSStress.setBackground(new Color(226, 70, 60));
        jPanelLVSStress.setSize(300, 30); // de added 
        jPanelLVSStress.setLayout(jGridBagLayout);    
        
        // set the text fields and radio buttons                
            //text fields and radio buttons 1-14 for jGDDPanel
        jTFNumber1.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber1.setBackground(new Color(192, 226, 192));
        jRBNumber1.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber1.setActionCommand("1");
        jRBNumber1.setSelected(true);
        jRBNumber1.setText("Seeding to Emergence");

        jTFNumber2.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber2.setBackground(new Color(192, 226, 192));
        jRBNumber2.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber2.setActionCommand("1");
        jRBNumber2.setSelected(true);
        jRBNumber2.setText("E to 4th Leaf (V4)");
        
        jTFNumber3.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber3.setBackground(new Color(192, 226, 192));
        jRBNumber3.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber3.setActionCommand("1");
        jRBNumber3.setSelected(true);
        jRBNumber3.setText("V4 to Tassel Initiation");
        
        jTFNumber4.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber4.setBackground(new Color(192, 226, 192));
        jRBNumber4.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber4.setActionCommand("1");
        jRBNumber4.setSelected(true);
        jRBNumber4.setText("V4 to Ear Initiation");
        
        jTFNumber5.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber5.setBackground(new Color(192, 226, 192));
        jRBNumber5.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber5.setActionCommand("1");
        jRBNumber5.setSelected(true);
        jRBNumber5.setText("V4 to Inter Elong Begins");
        
        jTFNumber6.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber6.setBackground(new Color(192, 226, 192));
        jRBNumber6.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber6.setActionCommand("1");
        jRBNumber6.setSelected(true);
        jRBNumber6.setText("V4 to 12th Leaf (V12)");
        
        jTFNumber7.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber7.setBackground(new Color(192, 226, 192));
        jRBNumber7.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber7.setActionCommand("1");
        jRBNumber7.setSelected(true);
        jRBNumber7.setText("V12 to Tasseling");
        
        jTFNumber8.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber8.setBackground(new Color(192, 226, 192));
        jRBNumber8.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber8.setActionCommand("1");
        jRBNumber8.setSelected(true);
        jRBNumber8.setText("V12 to Silking (R1)");
        
        jTFNumber9.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber9.setBackground(new Color(192, 226, 192));
        jRBNumber9.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber9.setActionCommand("1");
        jRBNumber9.setSelected(true);
        jRBNumber9.setText("R1 to Blister (R2)");
        
        jTFNumber10.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber10.setBackground(new Color(192, 226, 192));
        jRBNumber10.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber10.setActionCommand("1");
        jRBNumber10.setSelected(true);
        jRBNumber10.setText("R2 to Milk (R3)");
        
        jTFNumber11.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber11.setBackground(new Color(192, 226, 192));
        jRBNumber11.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber11.setActionCommand("1");
        jRBNumber11.setSelected(true);
        jRBNumber11.setText("R3 to Dough (R4)");
        
        jTFNumber12.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber12.setBackground(new Color(192, 226, 192));
        jRBNumber12.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber12.setActionCommand("1");
        jRBNumber12.setSelected(true);
        jRBNumber12.setText("R4 to Dent (R5)");
        
        jTFNumber13.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber13.setBackground(new Color(192, 226, 192));
        jRBNumber13.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber13.setActionCommand("1");
        jRBNumber13.setSelected(true);
        jRBNumber13.setText("R5 to Maturity (R6)");
        
        jTFNumber14.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber14.setBackground(new Color(192, 226, 192));
        jRBNumber14.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber14.setActionCommand("1");
        jRBNumber14.setSelected(true);
        jRBNumber14.setText("R6 to Harvest Ready");
        
            //text fields and radio buttons 15-28 for jPanelGDDStress        
        jTFNumber15.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber15.setBackground(new Color(226, 70, 60));
        jRBNumber15.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber15.setActionCommand("2");
        jRBNumber15.setText("Seeding to Emergence");      

        jTFNumber16.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber16.setBackground(new Color(226, 70, 60));
        jRBNumber16.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber16.setActionCommand("2");
        jRBNumber16.setText("E to 4th Leaf (V4)");
        
        jTFNumber17.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber17.setBackground(new Color(226, 70, 60));
        jRBNumber17.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber17.setActionCommand("2");
        jRBNumber17.setText("V4 to Tassel Initiation");
        
        jTFNumber18.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber18.setBackground(new Color(226, 70, 60));
        jRBNumber18.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber18.setActionCommand("2");
        jRBNumber18.setText("V4 to Ear Initiation");
       
        jTFNumber19.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber19.setBackground(new Color(226, 70, 60));
        jRBNumber19.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber19.setActionCommand("2");
        jRBNumber19.setText("V4 to Inter Elong Begins");

        jTFNumber20.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber20.setBackground(new Color(226, 70, 60));
        jRBNumber20.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber20.setActionCommand("2");
        jRBNumber20.setText("V4 to 12th Leaf (V12)");
        
        jTFNumber21.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber21.setBackground(new Color(226, 70, 60));
        jRBNumber21.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber21.setActionCommand("2");
        jRBNumber21.setText("V12 to Tasseling");
        
        jTFNumber22.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber22.setBackground(new Color(226, 70, 60));        
        jRBNumber22.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber22.setActionCommand("2");
        jRBNumber22.setText("V12 to Silking (R1)");
        
        jTFNumber23.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber23.setBackground(new Color(226, 70, 60));
        jRBNumber23.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber23.setActionCommand("2");
        jRBNumber23.setText("R1 to Blister (R2)");
        
        jTFNumber24.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber24.setBackground(new Color(226, 70, 60));
        jRBNumber24.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber24.setActionCommand("2");
        jRBNumber24.setText("R2 to Milk (R3)");
        
        jTFNumber25.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber25.setBackground(new Color(226, 70, 60));
        jRBNumber25.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber25.setActionCommand("2");
        jRBNumber25.setText("R3 to Dough (R4)");
        
        jTFNumber26.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber26.setBackground(new Color(226, 70, 60));        
        jRBNumber26.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber26.setActionCommand("2");
        jRBNumber26.setText("R4 to Dent (R5)");
        
        jTFNumber27.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber27.setBackground(new Color(226, 70, 60));
        jRBNumber27.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber27.setActionCommand("2");
        jRBNumber27.setText("R5 to Maturity (R6)");
        
        jTFNumber28.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber28.setBackground(new Color(226, 70, 60));           
        jRBNumber28.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber28.setActionCommand("2");
        jRBNumber28.setText("R6 to Harvest Ready"); 
        
        
            //text fields and radio buttons 29-42 for jLVSPanel
        jTFNumber29.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber29.setBackground(new Color(192, 226, 192));
        jRBNumber29.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber29.setActionCommand("3");        
        jRBNumber29.setText("Seeding to Emergence");
        
        jTFNumber30.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber30.setBackground(new Color(192, 226, 192));        
        jRBNumber30.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber30.setActionCommand("3");
        jRBNumber30.setText("E to 4th Leaf (V4)");
        
        jTFNumber31.setHorizontalAlignment(SwingConstants.CENTER);        
        jRBNumber31.setBackground(new Color(192, 226, 192));
        jRBNumber31.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber31.setActionCommand("3");
        jRBNumber31.setText("V4 to Tassel Initiation");
        
        jTFNumber32.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber32.setBackground(new Color(192, 226, 192));
        jRBNumber32.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber32.setActionCommand("3");
        jRBNumber32.setText("V4 to Ear Initiation");

        jTFNumber33.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber33.setBackground(new Color(192, 226, 192));        
        jRBNumber33.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber33.setActionCommand("3");
        jRBNumber33.setText("V4 to Inter Elong Begins");
         
        jTFNumber34.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber34.setBackground(new Color(192, 226, 192));
        jRBNumber34.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber34.setActionCommand("3");
        jRBNumber34.setText("V4 to 12th Leaf (V12)");
        
        jTFNumber35.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber35.setBackground(new Color(192, 226, 192));
        jRBNumber35.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber35.setActionCommand("3");
        jRBNumber35.setText("V12 to Tasseling");
        
        jTFNumber36.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber36.setBackground(new Color(192, 226, 192));
        jRBNumber36.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber36.setActionCommand("3");
        jRBNumber36.setText("V12 to Silking (R1)");
        
        jTFNumber37.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber37.setBackground(new Color(192, 226, 192));        
        jRBNumber37.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber37.setActionCommand("3");
        jRBNumber37.setText("R1 to Blister (R2)");
        
        jTFNumber38.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber38.setBackground(new Color(192, 226, 192));
        jRBNumber38.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber38.setActionCommand("3");
        jRBNumber38.setText("R2 to Milk (R3)");
        
        jTFNumber39.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber39.setBackground(new Color(192, 226, 192));        
        jRBNumber39.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber39.setActionCommand("3");
        jRBNumber39.setText("R3 to Dough (R4)");
        
        jTFNumber40.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber40.setBackground(new Color(192, 226, 192));
        jRBNumber40.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber40.setActionCommand("3");
        jRBNumber40.setText("R4 to Dent (R5)");
        
        jTFNumber41.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber41.setBackground(new Color(192, 226, 192));        
        jRBNumber41.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber41.setActionCommand("3");
        jRBNumber41.setText("R5 to Maturity (R6)");
        
        jTFNumber42.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber42.setBackground(new Color(192, 226, 192));
        jRBNumber42.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber42.setActionCommand("3");
        jRBNumber42.setText("R6 to Harvest Ready");
        
            //text fields and radio buttons 43-56 for jPanelLVSStress          
        jTFNumber43.setHorizontalAlignment(SwingConstants.CENTER); 
        jRBNumber43.setBackground(new Color(226, 70, 60));        
        jRBNumber43.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber43.setActionCommand("4");
        jRBNumber43.setText("Seeding to Emergence");
        
        jTFNumber44.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber44.setBackground(new Color(226, 70, 60));
        jRBNumber44.setFont(new java.awt.Font("Dialog", 0, 10));        
        jRBNumber44.setActionCommand("4");
        jRBNumber44.setText("E to 4th Leaf (V4)");
        
        jTFNumber45.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber45.setBackground(new Color(226, 70, 60));        
        jRBNumber45.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber45.setActionCommand("4");
        jRBNumber45.setText("V4 to Tassel Initiation");
        
        jTFNumber46.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber46.setBackground(new Color(226, 70, 60));
        jRBNumber46.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber46.setActionCommand("4");
        jRBNumber46.setText("V4 to Ear Initiation");
        
        jTFNumber47.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber47.setBackground(new Color(226, 70, 60));
        jRBNumber47.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber47.setActionCommand("4");
        jRBNumber47.setText("V4 to Inter Elong Begins");
  
        jTFNumber48.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber48.setBackground(new Color(226, 70, 60));        
        jRBNumber48.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber48.setActionCommand("4");
        jRBNumber48.setText("V4 to 12th Leaf (V12)");
        
        jTFNumber49.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber49.setBackground(new Color(226, 70, 60));        
        jRBNumber49.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber49.setActionCommand("4");
        jRBNumber49.setText("V12 to Tasseling");

        jTFNumber50.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber50.setBackground(new Color(226, 70, 60));        
        jRBNumber50.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber50.setActionCommand("4");
        jRBNumber50.setText("V12 to Silking (R1)");
        
        jTFNumber51.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber51.setBackground(new Color(226, 70, 60));        
        jRBNumber51.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber51.setActionCommand("4");
        jRBNumber51.setText("R1 to Blister (R2)");
        
        jTFNumber52.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber52.setBackground(new Color(226, 70, 60));        
        jRBNumber52.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber52.setActionCommand("4");
        jRBNumber52.setText("R2 to Milk (R3)");
        
        jTFNumber53.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber53.setBackground(new Color(226, 70, 60));           
        jRBNumber53.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber53.setActionCommand("4");
        jRBNumber53.setText("R3 to Dough (R4)"); 
        
        jTFNumber54.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber54.setBackground(new Color(226, 70, 60));        
        jRBNumber54.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber54.setActionCommand("4");
        jRBNumber54.setText("R4 to Dent (R5)");
        
        jTFNumber55.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber55.setBackground(new Color(226, 70, 60));        
        jRBNumber55.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber55.setActionCommand("4");
        jRBNumber55.setText("R5 to Maturity (R6)");
        
        jTFNumber56.setHorizontalAlignment(SwingConstants.CENTER);
        jRBNumber56.setBackground(new Color(226, 70, 60));        
        jRBNumber56.setFont(new java.awt.Font("Dialog", 0, 10));
        jRBNumber56.setActionCommand("4");
        jRBNumber56.setText("R6 to Harvest Ready");
        
        // ***** EVERYTHING IS SET. NOW ADD ITEMS TO THE PANELS *****
        
        // add jMainPanel to the ContentPane 
        this.getContentPane().add(jMainPanel, BorderLayout.CENTER);
       
        // add jNorthPanel to the jMainPanel and add title
        jMainPanel.add(jNorthPanel, BorderLayout.NORTH);
        
        cn.anchor = GridBagConstraints.CENTER;
        addItem(jTitleLabel, 0, 0, 1, 1, "jNorthPanel");     
        
        // add the jSouthPanel to the jMainPanel
        jMainPanel.add(jSouthPanel, BorderLayout.SOUTH);
        
        // add the items to the jSouthPanel
        addItem(jBBack, 0, 0, 1, 1, "jSouthPanel");
        addItem(jHelpButton, 0, 1, 1, 1, "jSouthPanel");
        addItem(jVarietyLabel, 0, 2, 1, 1, "jSouthPanel");
        addItem(jCBVarietyType, 0, 3, 1, 1, "jSouthPanel");
        addItem(jRunButton, 0, 4, 1, 1, "jSouthPanel");
        addItem(jResetButton, 0, 5, 1, 1, "jSouthPanel");
                                                  
        // add the jPanel1 to jMainPanel in the CENTER border.  
            // jPanel1 holds the other four panels with the 
            // radio buttons and text fields
        jMainPanel.add(jPanel1, BorderLayout.CENTER);
        
        // add titles to jPanel1
        cn.fill = GridBagConstraints.CENTER;
        addItem(jLGDDLabel, 0, 0, 2, 1, "jPanel1");
        cn.fill = GridBagConstraints.CENTER;
        addItem(jLVSTitle, 0, 2, 2, 1, "jPanel1");
        
        addItem(jGDDLabel, 1, 0, 1, 1, "jPanel1");
        addItem(jGDDStressedLabel, 1, 1, 1, 1, "jPanel1");
        addItem(jLVSLabel, 1, 2, 1, 1, "jPanel1");
        addItem(jLVSStressedLabel, 1, 3, 1, 1, "jPanel1");
        
        // add other GridBag Layout panels to jPanel1
        cn.fill = GridBagConstraints.VERTICAL;
        addItem(jGDDPanel, 2, 0, 1, 1, "jPanel1");       
        addItem(jPanelGDDStress, 2, 1, 1, 1, "jPanel1");      
        addItem(jLVSPanel, 2, 2, 1, 1, "jPanel1");
        addItem(jPanelLVSStress, 2, 3, 1, 1, "jPanel1");    
        
        // Add radio buttons to a group. 
        // There are 14 groups with 4 radio buttons each.
        Row1Group.add(jRBNumber1);
        Row1Group.add(jRBNumber15);
        Row1Group.add(jRBNumber29);
        Row1Group.add(jRBNumber43);
        
        Row2Group.add(jRBNumber2);
        Row2Group.add(jRBNumber16);  
        Row2Group.add(jRBNumber30);
        Row2Group.add(jRBNumber44);
        
        Row3Group.add(jRBNumber3);
        Row3Group.add(jRBNumber17);
        Row3Group.add(jRBNumber31);
        Row3Group.add(jRBNumber45);
        
        Row4Group.add(jRBNumber4);
        Row4Group.add(jRBNumber18);
        Row4Group.add(jRBNumber32);
        Row4Group.add(jRBNumber46);
        
        Row5Group.add(jRBNumber5);
        Row5Group.add(jRBNumber19);
        Row5Group.add(jRBNumber33);
        Row5Group.add(jRBNumber47);
        
        Row6Group.add(jRBNumber6);
        Row6Group.add(jRBNumber20);
        Row6Group.add(jRBNumber34);
        Row6Group.add(jRBNumber48);
        
        Row7Group.add(jRBNumber7);
        Row7Group.add(jRBNumber21);
        Row7Group.add(jRBNumber35);
        Row7Group.add(jRBNumber49);
        
        Row8Group.add(jRBNumber8);
        Row8Group.add(jRBNumber22);
        Row8Group.add(jRBNumber36);
        Row8Group.add(jRBNumber50);
        
        Row9Group.add(jRBNumber9);
        Row9Group.add(jRBNumber23);
        Row9Group.add(jRBNumber37);
        Row9Group.add(jRBNumber51);
        
        Row10Group.add(jRBNumber10);
        Row10Group.add(jRBNumber24);
        Row10Group.add(jRBNumber38);
        Row10Group.add(jRBNumber52);
        
        Row11Group.add(jRBNumber11);
        Row11Group.add(jRBNumber25);
        Row11Group.add(jRBNumber39);
        Row11Group.add(jRBNumber53);
        
        Row12Group.add(jRBNumber12);
        Row12Group.add(jRBNumber26);
        Row12Group.add(jRBNumber40);
        Row12Group.add(jRBNumber54);
        
        Row13Group.add(jRBNumber13);
        Row13Group.add(jRBNumber27);
        Row13Group.add(jRBNumber41);
        Row13Group.add(jRBNumber55);
        
        Row14Group.add(jRBNumber14);
        Row14Group.add(jRBNumber28);
        Row14Group.add(jRBNumber42);
        Row14Group.add(jRBNumber56);
        
        
        // Add text fields and radio buttons to the 4 panels in jPanel1.
        
            // jGDDPanel
        cn.fill = GridBagConstraints.HORIZONTAL;
        cn.anchor = GridBagConstraints.WEST;
        addItem(jTFNumber1, 0, 0, 1, 1, "jGDDPanel");
        addItem(jRBNumber1, 0, 1, 1, 1, "jGDDPanel");
        addItem(jTFNumber2, 1, 0, 1, 1, "jGDDPanel");
        addItem(jRBNumber2, 1, 1, 1, 1, "jGDDPanel");
        addItem(jTFNumber3, 2, 0, 1, 1, "jGDDPanel");
        addItem(jRBNumber3, 2, 1, 1, 1, "jGDDPanel");
        addItem(jTFNumber4, 3, 0, 1, 1, "jGDDPanel");
        addItem(jRBNumber4, 3, 1, 1, 1, "jGDDPanel");
        addItem(jTFNumber5, 4, 0, 1, 1, "jGDDPanel");
        addItem(jRBNumber5, 4, 1, 1, 1, "jGDDPanel");
        addItem(jTFNumber6, 5, 0, 1, 1, "jGDDPanel");
        addItem(jRBNumber6, 5, 1, 1, 1, "jGDDPanel");
        addItem(jTFNumber7, 6, 0, 1, 1, "jGDDPanel");
        addItem(jRBNumber7, 6, 1, 1, 1, "jGDDPanel");
        addItem(jTFNumber8, 7, 0, 1, 1, "jGDDPanel");
        addItem(jRBNumber8, 7, 1, 1, 1, "jGDDPanel");
        addItem(jTFNumber9, 8, 0, 1, 1, "jGDDPanel");
        addItem(jRBNumber9, 8, 1, 1, 1, "jGDDPanel");
        addItem(jTFNumber10, 9, 0, 1, 1, "jGDDPanel");
        addItem(jRBNumber10, 9, 1, 1, 1, "jGDDPanel");        
        addItem(jTFNumber11, 10, 0, 1, 1, "jGDDPanel");
        addItem(jRBNumber11, 10, 1, 1, 1, "jGDDPanel");
        addItem(jTFNumber12, 11, 0, 1, 1, "jGDDPanel");
        addItem(jRBNumber12, 11, 1, 1, 1, "jGDDPanel");
        addItem(jTFNumber13, 12, 0, 1, 1, "jGDDPanel");
        addItem(jRBNumber13, 12, 1, 1, 1, "jGDDPanel");
        addItem(jTFNumber14, 13, 0, 1, 1, "jGDDPanel");
        addItem(jRBNumber14, 13, 1, 1, 1, "jGDDPanel");               
        
            // jPanelGDDStress
        cn.fill = GridBagConstraints.HORIZONTAL;
        cn.anchor = GridBagConstraints.WEST;
        addItem(jTFNumber15, 0, 0, 1, 1, "jPanelGDDStress");
        addItem(jRBNumber15, 0, 1, 1, 1, "jPanelGDDStress");
        addItem(jTFNumber16, 1, 0, 1, 1, "jPanelGDDStress");
        addItem(jRBNumber16, 1, 1, 1, 1, "jPanelGDDStress");
        addItem(jTFNumber17, 2, 0, 1, 1, "jPanelGDDStress");
        addItem(jRBNumber17, 2, 1, 1, 1, "jPanelGDDStress");
        addItem(jTFNumber18, 3, 0, 1, 1, "jPanelGDDStress");
        addItem(jRBNumber18, 3, 1, 1, 1, "jPanelGDDStress");
        addItem(jTFNumber19, 4, 0, 1, 1, "jPanelGDDStress");
        addItem(jRBNumber19, 4, 1, 1, 1, "jPanelGDDStress");
        addItem(jTFNumber20, 5, 0, 1, 1, "jPanelGDDStress");
        addItem(jRBNumber20, 5, 1, 1, 1, "jPanelGDDStress");
        addItem(jTFNumber21, 6, 0, 1, 1, "jPanelGDDStress");
        addItem(jRBNumber21, 6, 1, 1, 1, "jPanelGDDStress");
        addItem(jTFNumber22, 7, 0, 1, 1, "jPanelGDDStress");
        addItem(jRBNumber22, 7, 1, 1, 1, "jPanelGDDStress");
        addItem(jTFNumber23, 8, 0, 1, 1, "jPanelGDDStress");
        addItem(jRBNumber23, 8, 1, 1, 1, "jPanelGDDStress");
        addItem(jTFNumber24, 9, 0, 1, 1, "jPanelGDDStress");
        addItem(jRBNumber24, 9, 1, 1, 1, "jPanelGDDStress");        
        addItem(jTFNumber25, 10, 0, 1, 1, "jPanelGDDStress");
        addItem(jRBNumber25, 10, 1, 1, 1, "jPanelGDDStress");
        addItem(jTFNumber26, 11, 0, 1, 1, "jPanelGDDStress");
        addItem(jRBNumber26, 11, 1, 1, 1, "jPanelGDDStress");
        addItem(jTFNumber27, 12, 0, 1, 1, "jPanelGDDStress");
        addItem(jRBNumber27, 12, 1, 1, 1, "jPanelGDDStress");    
        addItem(jTFNumber28, 13, 0, 1, 1, "jPanelGDDStress");
        addItem(jRBNumber28, 13, 1, 1, 1, "jPanelGDDStress"); 
        
            // jLVSPanel
        cn.fill = GridBagConstraints.HORIZONTAL;
        cn.anchor = GridBagConstraints.WEST;
        addItem(jTFNumber29, 0, 0, 1, 1, "jLVSPanel");
        addItem(jRBNumber29, 0, 1, 1, 1, "jLVSPanel");
        addItem(jTFNumber30, 1, 0, 1, 1, "jLVSPanel");
        addItem(jRBNumber30, 1, 1, 1, 1, "jLVSPanel");         
        addItem(jTFNumber31, 2, 0, 1, 1, "jLVSPanel");
        addItem(jRBNumber31, 2, 1, 1, 1, "jLVSPanel");
        addItem(jTFNumber32, 3, 0, 1, 1, "jLVSPanel");
        addItem(jRBNumber32, 3, 1, 1, 1, "jLVSPanel");
        addItem(jTFNumber33, 4, 0, 1, 1, "jLVSPanel");
        addItem(jRBNumber33, 4, 1, 1, 1, "jLVSPanel");
        addItem(jTFNumber34, 5, 0, 1, 1, "jLVSPanel");
        addItem(jRBNumber34, 5, 1, 1, 1, "jLVSPanel");
        addItem(jTFNumber35, 6, 0, 1, 1, "jLVSPanel");
        addItem(jRBNumber35, 6, 1, 1, 1, "jLVSPanel");
        addItem(jTFNumber36, 7, 0, 1, 1, "jLVSPanel");
        addItem(jRBNumber36, 7, 1, 1, 1, "jLVSPanel");
        addItem(jTFNumber37, 8, 0, 1, 1, "jLVSPanel");
        addItem(jRBNumber37, 8, 1, 1, 1, "jLVSPanel");
        addItem(jTFNumber38, 9, 0, 1, 1, "jLVSPanel");
        addItem(jRBNumber38, 9, 1, 1, 1, "jLVSPanel");
        addItem(jTFNumber39, 10, 0, 1, 1, "jLVSPanel");
        addItem(jRBNumber39, 10, 1, 1, 1, "jLVSPanel");        
        addItem(jTFNumber40, 11, 0, 1, 1, "jLVSPanel");
        addItem(jRBNumber40, 11, 1, 1, 1, "jLVSPanel");
        addItem(jTFNumber41, 12, 0, 1, 1, "jLVSPanel");
        addItem(jRBNumber41, 12, 1, 1, 1, "jLVSPanel");
        addItem(jTFNumber42, 13, 0, 1, 1, "jLVSPanel");
        addItem(jRBNumber42, 13, 1, 1, 1, "jLVSPanel");
        
        
            // jPanelLVSStress
        cn.fill = GridBagConstraints.HORIZONTAL;
        cn.anchor = GridBagConstraints.WEST;
        addItem(jTFNumber43, 0, 0, 1, 1, "jPanelLVSStress");
        addItem(jRBNumber43, 0, 1, 1, 1, "jPanelLVSStress");
        addItem(jTFNumber44, 1, 0, 1, 1, "jPanelLVSStress");
        addItem(jRBNumber44, 1, 1, 1, 1, "jPanelLVSStress");        
        addItem(jTFNumber45, 2, 0, 1, 1, "jPanelLVSStress");
        addItem(jRBNumber45, 2, 1, 1, 1, "jPanelLVSStress");
        addItem(jTFNumber46, 3, 0, 1, 1, "jPanelLVSStress");
        addItem(jRBNumber46, 3, 1, 1, 1, "jPanelLVSStress");
        addItem(jTFNumber47, 4, 0, 1, 1, "jPanelLVSStress");
        addItem(jRBNumber47, 4, 1, 1, 1, "jPanelLVSStress");
        addItem(jTFNumber48, 5, 0, 1, 1, "jPanelLVSStress");
        addItem(jRBNumber48, 5, 1, 1, 1, "jPanelLVSStress");
        addItem(jTFNumber49, 6, 0, 1, 1, "jPanelLVSStress");
        addItem(jRBNumber49, 6, 1, 1, 1, "jPanelLVSStress");
        addItem(jTFNumber50, 7, 0, 1, 1, "jPanelLVSStress");
        addItem(jRBNumber50, 7, 1, 1, 1, "jPanelLVSStress");
        addItem(jTFNumber51, 8, 0, 1, 1, "jPanelLVSStress");
        addItem(jRBNumber51, 8, 1, 1, 1, "jPanelLVSStress");
        addItem(jTFNumber52, 9, 0, 1, 1, "jPanelLVSStress");
        addItem(jRBNumber52, 9, 1, 1, 1, "jPanelLVSStress");
        addItem(jTFNumber53, 10, 0, 1, 1, "jPanelLVSStress");
        addItem(jRBNumber53, 10, 1, 1, 1, "jPanelLVSStress");
        addItem(jTFNumber54, 11, 0, 1, 1, "jPanelLVSStress");
        addItem(jRBNumber54, 11, 1, 1, 1, "jPanelLVSStress");        
        addItem(jTFNumber55, 12, 0, 1, 1, "jPanelLVSStress");
        addItem(jRBNumber55, 12, 1, 1, 1, "jPanelLVSStress");  
        addItem(jTFNumber56, 13, 0, 1, 1, "jPanelLVSStress");
        addItem(jRBNumber56, 13, 1, 1, 1, "jPanelLVSStress"); 
    }


    /**
     *  Description of the Method
     *
     *  sets the functionality of the Help button
     */
    void jHelpButton_actionPerformed(ActionEvent e) {
        if (helpOn == true) {
            myHelpFrame.setVisible(true);
            helpOn = false;
        } else {
            myHelpFrame.setVisible(false);
            helpOn = true;
        }
    }


    /**
     *  Sets the backReferance attribute of the CNSetGDDFrame object
     *
     *@param  BF  The new backReferance value
     */
    public void setBackReferance(Frame BF) {
        BackFrame = BF;
    }


    /**
     *  Description of the Method
     *
     *  sets the functionality of the back button
     */
    void jBBack_actionPerformed(ActionEvent e) {
        this.setVisible(false);
        this.setParameters();
        BackFrame.setVisible(true);
    }


    /**
     *  Description of the Method
     *
     *  sets the functionality of the Run button
     */
    void jRunButton_actionPerformed(ActionEvent e) {
        this.setParameters();
        myRun = new Run(myParameters); 
        this.setVisible(false);      
        
        myOutputFrame.setBackRefference(this);
        myOutputFrame.setParameters(myParameters);
        myOutputFrame.setVisible(true);
        
        myOutputFrame.writeText(myRun.getOutput());
        
    }

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
        else if(panelName.equals("jSouthPanel")) {
            jGridBagLayout.setConstraints(item, cn);
            jSouthPanel.add(item);
        }    
        else if(panelName.equals("jPanel1")){
            jGridBagLayout.setConstraints(item, cn);
            jPanel1.add(item);
        }
        else if(panelName.equals("jGDDPanel")) {
            jGridBagLayout.setConstraints(item, cn);
            jGDDPanel.add(item);
        }    
        else if(panelName.equals("jPanelGDDStress")) {
            jGridBagLayout.setConstraints(item, cn);
            jPanelGDDStress.add(item);
        }
        else if(panelName.equals("jLVSPanel")) {
            jGridBagLayout.setConstraints(item, cn);
            jLVSPanel.add(item);
        }
        else if(panelName.equals("jPanelLVSStress")) {
            jGridBagLayout.setConstraints(item, cn);
            jPanelLVSStress.add(item);
        }
        
    } // end of AddItem method

    
    /**
     *  Sets the window attribute of the CNSetGDDFrame object
     *
     *@param  myGrowthStates  The new window value
     *@exception  Exception   Description of the Exception
     */
    public void setWindow(CNGrowthStages myGrowthStates) throws Exception {
        myParameters.setGrowthStages(myGrowthStates);
        jCBVarietyType.setSelectedItem(myGrowthStates.myType.trim());
        JRadioButton tmpButton = null;

//  *************************** we populate the window
        jTitleLabel.setText(myGrowthStates.myType + " Corn Growth Stages");

        //************  ROW1 stuff
        jTFNumber1.setText(myGrowthStates.ROW1);
        jTFNumber15.setText(myGrowthStates.ROW1_stress);
        jTFNumber29.setText(myGrowthStates.ROW1_LVS);
        jTFNumber43.setText(myGrowthStates.ROW1_LVS_stress);
//        set ROW1 Radio button and text box for selected button
        Enumeration e1 = Row1Group.getElements();
        String myCode = this.getAcode(myGrowthStates.ROW1_Choice.substring(0, 2));
        String myValue = myGrowthStates.ROW1_Choice.trim().substring(2);
        while (e1.hasMoreElements()) {
            tmpButton = (JRadioButton) e1.nextElement();
            if (tmpButton.getActionCommand().trim().equalsIgnoreCase(myCode.trim())) {
                tmpButton.setSelected(true);
                if (myCode.equalsIgnoreCase("4")) {
                    jTFNumber43.setText(myValue);
                } else if (myCode.equalsIgnoreCase("3")) {
                    jTFNumber29.setText(myValue);
                } else if (myCode.equalsIgnoreCase("2")) {
                    jTFNumber15.setText(myValue);
                } else {
                    jTFNumber1.setText(myValue);
                }

            }
        }

// ************* ROW2
        jTFNumber2.setText(myGrowthStates.ROW2);
        jTFNumber16.setText(myGrowthStates.ROW2_stress);
        jTFNumber30.setText(myGrowthStates.ROW2_LVS);
        jTFNumber44.setText(myGrowthStates.ROW2_LVS_stress);
//        set ROW2 Radio button and text box for selected button
        e1 = Row2Group.getElements();
        myCode = this.getAcode(myGrowthStates.ROW2_Choice.substring(0, 2));
        myValue = myGrowthStates.ROW2_Choice.trim().substring(2);

        while (e1.hasMoreElements()) {
            tmpButton = (JRadioButton) e1.nextElement();
            if (tmpButton.getActionCommand().trim().equalsIgnoreCase(myCode.trim())) {
                tmpButton.setSelected(true);
                if (myCode.equalsIgnoreCase("4")) {
                    jTFNumber44.setText(myValue);
                } else if (myCode.equalsIgnoreCase("3")) {
                    jTFNumber30.setText(myValue);
                } else if (myCode.equalsIgnoreCase("2")) {
                    jTFNumber16.setText(myValue);
                } else {
                    jTFNumber2.setText(myValue);
                }

            }
        }

//************** ROW3
        jTFNumber3.setText(myGrowthStates.ROW3);
        jTFNumber17.setText(myGrowthStates.ROW3_stress);
        jTFNumber31.setText(myGrowthStates.ROW3_LVS);
        jTFNumber45.setText(myGrowthStates.ROW3_LVS_stress);
//        set ROW3 Radio button
        e1 = Row3Group.getElements();
        myCode = this.getAcode(myGrowthStates.ROW3_Choice.substring(0, 2));
        myValue = myGrowthStates.ROW3_Choice.trim().substring(2);
        while (e1.hasMoreElements()) {
            tmpButton = (JRadioButton) e1.nextElement();
            if (tmpButton.getActionCommand().trim().equalsIgnoreCase(myCode.trim())) {
                tmpButton.setSelected(true);
                if (myCode.equalsIgnoreCase("4")) {
                    jTFNumber45.setText(myValue);
                } else if (myCode.equalsIgnoreCase("3")) {
                    jTFNumber31.setText(myValue);
                } else if (myCode.equalsIgnoreCase("2")) {
                    jTFNumber17.setText(myValue);
                } else {
                    jTFNumber3.setText(myValue);
                }
            }
        }

// **************** ROW4
        jTFNumber4.setText(myGrowthStates.ROW4);
        jTFNumber18.setText(myGrowthStates.ROW4_stress);
        jTFNumber32.setText(myGrowthStates.ROW4_LVS);
        jTFNumber46.setText(myGrowthStates.ROW4_LVS_stress);
//        set ROW4 Radio button
        e1 = Row4Group.getElements();
        myCode = this.getAcode(myGrowthStates.ROW4_Choice.substring(0, 2));
        myValue = myGrowthStates.ROW4_Choice.trim().substring(2);
        while (e1.hasMoreElements()) {
            tmpButton = (JRadioButton) e1.nextElement();
            if (tmpButton.getActionCommand().trim().equalsIgnoreCase(myCode.trim())) {
                tmpButton.setSelected(true);
                if (myCode.equalsIgnoreCase("4")) {
                    jTFNumber46.setText(myValue);
                } else if (myCode.equalsIgnoreCase("3")) {
                    jTFNumber32.setText(myValue);
                } else if (myCode.equalsIgnoreCase("2")) {
                    jTFNumber18.setText(myValue);
                } else {
                    jTFNumber4.setText(myValue);
                }
            }
        }

//***************** ROW5
        jTFNumber5.setText(myGrowthStates.ROW5);
        jTFNumber19.setText(myGrowthStates.ROW5_stress);
        jTFNumber33.setText(myGrowthStates.ROW5_LVS);
        jTFNumber47.setText(myGrowthStates.ROW5_LVS_stress);
//        set ROW5 Radio button
        e1 = Row5Group.getElements();
        myCode = this.getAcode(myGrowthStates.ROW5_Choice.substring(0, 2));
        myValue = myGrowthStates.ROW5_Choice.trim().substring(2);
        ;
        while (e1.hasMoreElements()) {
            tmpButton = (JRadioButton) e1.nextElement();
            if (tmpButton.getActionCommand().trim().equalsIgnoreCase(myCode.trim())) {
                tmpButton.setSelected(true);
                if (myCode.equalsIgnoreCase("4")) {
                    jTFNumber47.setText(myValue);
                } else if (myCode.equalsIgnoreCase("3")) {
                    jTFNumber33.setText(myValue);
                } else if (myCode.equalsIgnoreCase("2")) {
                    jTFNumber19.setText(myValue);
                } else {
                    jTFNumber5.setText(myValue);
                }
            }
        }

// **************** ROW6
        jTFNumber6.setText(myGrowthStates.ROW6);
        jTFNumber20.setText(myGrowthStates.ROW6_stress);
        jTFNumber34.setText(myGrowthStates.ROW6_LVS);
        jTFNumber48.setText(myGrowthStates.ROW6_LVS_stress);
//        set ROW6 Radio button
        e1 = Row6Group.getElements();
        myCode = this.getAcode(myGrowthStates.ROW6_Choice.substring(0, 2));
        myValue = myGrowthStates.ROW6_Choice.trim().substring(2);
        ;
        while (e1.hasMoreElements()) {
            tmpButton = (JRadioButton) e1.nextElement();
            if (tmpButton.getActionCommand().trim().equalsIgnoreCase(myCode.trim())) {
                tmpButton.setSelected(true);
                if (myCode.equalsIgnoreCase("4")) {
                    jTFNumber48.setText(myValue);
                } else if (myCode.equalsIgnoreCase("3")) {
                    jTFNumber34.setText(myValue);
                } else if (myCode.equalsIgnoreCase("2")) {
                    jTFNumber20.setText(myValue);
                } else {
                    jTFNumber6.setText(myValue);
                }
            }
        }

//    ************** ROW7
        jTFNumber7.setText(myGrowthStates.ROW7);
        jTFNumber21.setText(myGrowthStates.ROW7_stress);
        jTFNumber35.setText(myGrowthStates.ROW7_LVS);
        jTFNumber49.setText(myGrowthStates.ROW7_LVS_stress);
//        set ROW7 Radio button
        e1 = Row7Group.getElements();
        myCode = this.getAcode(myGrowthStates.ROW7_Choice.substring(0, 2));
        myValue = myGrowthStates.ROW7_Choice.trim().substring(2);
        while (e1.hasMoreElements()) {
            tmpButton = (JRadioButton) e1.nextElement();
            if (tmpButton.getActionCommand().trim().equalsIgnoreCase(myCode.trim())) {
                tmpButton.setSelected(true);
                if (myCode.equalsIgnoreCase("4")) {
                    jTFNumber49.setText(myValue);
                } else if (myCode.equalsIgnoreCase("3")) {
                    jTFNumber35.setText(myValue);
                } else if (myCode.equalsIgnoreCase("2")) {
                    jTFNumber21.setText(myValue);
                } else {
                    jTFNumber7.setText(myValue);
                }
            }
        }

//************************* ROW8
        jTFNumber8.setText(myGrowthStates.ROW8);
        jTFNumber22.setText(myGrowthStates.ROW8_stress);
        jTFNumber36.setText(myGrowthStates.ROW8_LVS);
        jTFNumber50.setText(myGrowthStates.ROW8_LVS_stress);
//        set ROW8 Radio button
        e1 = Row8Group.getElements();
        myCode = this.getAcode(myGrowthStates.ROW8_Choice.substring(0, 2));
        myValue = myGrowthStates.ROW8_Choice.trim().substring(2);
        while (e1.hasMoreElements()) {
            tmpButton = (JRadioButton) e1.nextElement();
            if (tmpButton.getActionCommand().trim().equalsIgnoreCase(myCode.trim())) {
                tmpButton.setSelected(true);
                if (myCode.equalsIgnoreCase("4")) {
                    jTFNumber50.setText(myValue);
                } else if (myCode.equalsIgnoreCase("3")) {
                    jTFNumber36.setText(myValue);
                } else if (myCode.equalsIgnoreCase("2")) {
                    jTFNumber22.setText(myValue);
                } else {
                    jTFNumber8.setText(myValue);
                }
            }
        }

// *************************** ROW9
        jTFNumber9.setText(myGrowthStates.ROW9);
        jTFNumber23.setText(myGrowthStates.ROW9_stress);
        jTFNumber37.setText(myGrowthStates.ROW9_LVS);
        jTFNumber51.setText(myGrowthStates.ROW9_LVS_stress);
//        set ROW9 Radio button
        e1 = Row9Group.getElements();
        myCode = this.getAcode(myGrowthStates.ROW9_Choice.substring(0, 2));
        myValue = myGrowthStates.ROW9_Choice.trim().substring(2);
        while (e1.hasMoreElements()) {
            tmpButton = (JRadioButton) e1.nextElement();
            if (tmpButton.getActionCommand().trim().equalsIgnoreCase(myCode.trim())) {
                tmpButton.setSelected(true);
                if (myCode.equalsIgnoreCase("4")) {
                    jTFNumber51.setText(myValue);
                } else if (myCode.equalsIgnoreCase("3")) {
                    jTFNumber37.setText(myValue);
                } else if (myCode.equalsIgnoreCase("2")) {
                    jTFNumber23.setText(myValue);
                } else {
                    jTFNumber9.setText(myValue);
                }
            }
        }

//  ******************** ROW10
        jTFNumber10.setText(myGrowthStates.ROW10);
        jTFNumber24.setText(myGrowthStates.ROW10_stress);
        jTFNumber38.setText(myGrowthStates.ROW10_LVS);
        jTFNumber52.setText(myGrowthStates.ROW10_LVS_stress);
//        set ROW10 Radio button
        e1 = Row10Group.getElements();
        myCode = this.getAcode(myGrowthStates.ROW10_Choice.substring(0, 2));
        myValue = myGrowthStates.ROW10_Choice.trim().substring(2);
        while (e1.hasMoreElements()) {
            tmpButton = (JRadioButton) e1.nextElement();
            if (tmpButton.getActionCommand().trim().equalsIgnoreCase(myCode.trim())) {
                tmpButton.setSelected(true);
                if (myCode.equalsIgnoreCase("4")) {
                    jTFNumber52.setText(myValue);
                } else if (myCode.equalsIgnoreCase("3")) {
                    jTFNumber38.setText(myValue);
                } else if (myCode.equalsIgnoreCase("2")) {
                    jTFNumber24.setText(myValue);
                } else {
                    jTFNumber10.setText(myValue);
                }
            }
        }

//   *************** ROW11
        jTFNumber11.setText(myGrowthStates.ROW11);
        jTFNumber25.setText(myGrowthStates.ROW11_stress);
        jTFNumber39.setText(myGrowthStates.ROW11_LVS);
        jTFNumber53.setText(myGrowthStates.ROW11_LVS_stress);
//        set ROW11 Radio button
        e1 = Row11Group.getElements();
        myCode = this.getAcode(myGrowthStates.ROW11_Choice.substring(0, 2));
        myValue = myGrowthStates.ROW11_Choice.trim().substring(2);
        while (e1.hasMoreElements()) {
            tmpButton = (JRadioButton) e1.nextElement();
            if (tmpButton.getActionCommand().trim().equalsIgnoreCase(myCode.trim())) {
                tmpButton.setSelected(true);
                if (myCode.equalsIgnoreCase("4")) {
                    jTFNumber53.setText(myValue);
                } else if (myCode.equalsIgnoreCase("3")) {
                    jTFNumber39.setText(myValue);
                } else if (myCode.equalsIgnoreCase("2")) {
                    jTFNumber25.setText(myValue);
                } else {
                    jTFNumber11.setText(myValue);
                }
            }
        }

//   *************** ROW12
        jTFNumber12.setText(myGrowthStates.ROW12);
        jTFNumber26.setText(myGrowthStates.ROW12_stress);
        jTFNumber40.setText(myGrowthStates.ROW12_LVS);
        jTFNumber54.setText(myGrowthStates.ROW12_LVS_stress);
//        set ROW12 Radio button
        e1 = Row12Group.getElements();
        myCode = this.getAcode(myGrowthStates.ROW12_Choice.substring(0, 2));
        myValue = myGrowthStates.ROW12_Choice.trim().substring(2);
        while (e1.hasMoreElements()) {
            tmpButton = (JRadioButton) e1.nextElement();
            if (tmpButton.getActionCommand().trim().equalsIgnoreCase(myCode.trim())) {
                tmpButton.setSelected(true);
                if (myCode.equalsIgnoreCase("4")) {
                    jTFNumber54.setText(myValue);
                } else if (myCode.equalsIgnoreCase("3")) {
                    jTFNumber40.setText(myValue);
                } else if (myCode.equalsIgnoreCase("2")) {
                    jTFNumber26.setText(myValue);
                } else {
                    jTFNumber12.setText(myValue);
                }
            }
        }

//   *************** ROW13
        jTFNumber13.setText(myGrowthStates.ROW13);
        jTFNumber27.setText(myGrowthStates.ROW13_stress);
        jTFNumber41.setText(myGrowthStates.ROW13_LVS);
        jTFNumber55.setText(myGrowthStates.ROW13_LVS_stress);
//        set ROW13 Radio button
        e1 = Row13Group.getElements();
        myCode = this.getAcode(myGrowthStates.ROW13_Choice.substring(0, 2));
        myValue = myGrowthStates.ROW13_Choice.trim().substring(2);
        while (e1.hasMoreElements()) {
            tmpButton = (JRadioButton) e1.nextElement();
            if (tmpButton.getActionCommand().trim().equalsIgnoreCase(myCode.trim())) {
                tmpButton.setSelected(true);
                if (myCode.equalsIgnoreCase("4")) {
                    jTFNumber55.setText(myValue);
                } else if (myCode.equalsIgnoreCase("3")) {
                    jTFNumber41.setText(myValue);
                } else if (myCode.equalsIgnoreCase("2")) {
                    jTFNumber27.setText(myValue);
                } else {
                    jTFNumber13.setText(myValue);
                }
            }
        }
        
        //   *************** ROW14
        jTFNumber14.setText(myGrowthStates.ROW14);
        jTFNumber28.setText(myGrowthStates.ROW14_stress);
        jTFNumber42.setText(myGrowthStates.ROW14_LVS);
        jTFNumber56.setText(myGrowthStates.ROW14_LVS_stress);
//        set ROW14 Radio button
        e1 = Row14Group.getElements();
        myCode = this.getAcode(myGrowthStates.ROW14_Choice.substring(0, 2));
        myValue = myGrowthStates.ROW14_Choice.trim().substring(2);
        while (e1.hasMoreElements()) {
            tmpButton = (JRadioButton) e1.nextElement();
            if (tmpButton.getActionCommand().trim().equalsIgnoreCase(myCode.trim())) {
                tmpButton.setSelected(true);
                if (myCode.equalsIgnoreCase("4")) {
                    jTFNumber56.setText(myValue);
                } else if (myCode.equalsIgnoreCase("3")) {
                    jTFNumber42.setText(myValue);
                } else if (myCode.equalsIgnoreCase("2")) {
                    jTFNumber28.setText(myValue);
                } else {
                    jTFNumber14.setText(myValue);
                }
            }
        }

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
                    
                 }
                 catch (Exception e) {
                   System.out.println("IOException: URL");
                 }
       return tmp;       
   }

    /**
     *  Gets the varieties attribute of the CNSetGDDFrame object
     *
     *@return                  The varieties value
     *@exception  IOException  Description of the Exception
     */
    private CNGrowthStages getVarieties() throws IOException {
        //    **************  get varieties ******************
        File[] myVarFiles;
        File myFile;
        BufferedReader input = null;

        String varDir = "\\VarTypes";
        String fileLine;
        String path = getAppPath();
             //debe changed file extensions to .dat
        GiveFiles varFiles = new GiveFiles(path, varDir, "dat");
        CNGrowthStages thisStage = null;

        myVarFiles = varFiles.getFiles();
        for (int i = 0; i < myVarFiles.length; i++) {
            //if (myVarFiles[i].getName().equalsIgnoreCase("Corn.txt")) {
            if (myVarFiles[i].getName().equalsIgnoreCase("Corn.dat")) {
                myFile = myVarFiles[i];
                try {
                    input = new BufferedReader(new FileReader(myFile));
                } catch (Exception ex) {
                    System.out.println("Can't open corn file: " + ex);
                }

//                **************** step through header stuff
                do {
                    fileLine = input.readLine();
                } while (!fileLine.equalsIgnoreCase("***"));

//                *************** now add vartype to combobox
                fileLine = input.readLine();
                while (fileLine != null) {
//              create new variety type
                    thisStage = new CNGrowthStages();

                    jCBVarietyType.addItem(fileLine.trim());
                    thisStage.myType = fileLine.trim();

//      *********************** now we should be onto the GDD stuff
                    StringTokenizer chew = new StringTokenizer(input.readLine(), ",");
                    chew.nextToken();
                    thisStage.setGDDStages(
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),                       
                            "0.","0.");

//    *********************** now we get the GDD stress stuff
                    chew = new StringTokenizer(input.readLine(), ",");
                    chew.nextToken();
                    thisStage.setGDDStressed(
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),                           
                            "0.","0.");

//  **************************  now we get the LVS stuff
                    chew = new StringTokenizer(input.readLine(), ",");
                    chew.nextToken();
                    thisStage.setLVS(
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),                           
                            "0.","0.");

//     ************************** now we get the LVS stressed stuff
                    chew = new StringTokenizer(input.readLine(), ",");
                    chew.nextToken();
                    thisStage.setLVSstressed(
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            chew.nextToken().trim(),
                            "0.","0.");
//    ************************ OK now the whole class should be loaded!!
                    fileLine = input.readLine();
                    fileLine = input.readLine();
                    allVarieties.add(thisStage);
                }
            }
        }

// *********** make sure that the Generic variety is set as default
        for (int i = 0; i < allVarieties.size(); i++) {
            thisStage = (CNGrowthStages) allVarieties.get(i);
            if (thisStage.myType.equalsIgnoreCase("Generic 110-Day")) {
                return thisStage;
            }
        }
        return thisStage;
    }


    /**
     *  Description of the Method
     *
     *@param  e  Description of the Parameter
     */
    void jCBVarietyType_itemStateChanged(ItemEvent e) { }


    /**
     *  Description of the Method
     *
     *@param  e  Description of the Parameter
     */
    void jCBVarietyType_propertyChange(PropertyChangeEvent e) { }


    /**
     *  Description of the Method
     *
     *@param  e  Description of the Parameter
     */
    void jCBVarietyType_actionPerformed(ActionEvent e) {
        CNGrowthStages tmpStage;

        for (int i = 0; i < allVarieties.size(); i++) {
            tmpStage = (CNGrowthStages) allVarieties.get(i);

            if (jCBVarietyType.getSelectedItem().toString().equalsIgnoreCase(tmpStage.myType)) {
                try {
                    setWindow(tmpStage);
                    this.update(this.getGraphics());
                } catch (Exception ex) {
                    System.out.println("Can't set up window: " + ex);
                }
            }
        }
    }


    /**
     *  Description of the Method
     *
     *@param  e  Description of the Parameter
     */
    void jResetButton_actionPerformed(ActionEvent e) {
        CNGrowthStages tmpStage = null;

//        reset all the radio buttons to default
        setRadioButton(Row1Group.getElements(), "1");
        setRadioButton(Row2Group.getElements(), "1");
        setRadioButton(Row3Group.getElements(), "1");
        setRadioButton(Row4Group.getElements(), "1");
        setRadioButton(Row5Group.getElements(), "1");
        setRadioButton(Row6Group.getElements(), "1");
        setRadioButton(Row7Group.getElements(), "1");
        setRadioButton(Row8Group.getElements(), "1");
        setRadioButton(Row9Group.getElements(), "1");
        setRadioButton(Row10Group.getElements(), "1");
        setRadioButton(Row11Group.getElements(), "1");
        setRadioButton(Row12Group.getElements(), "1");
        setRadioButton(Row13Group.getElements(), "1");
        setRadioButton(Row14Group.getElements(), "1");        

        
        for (int i = 0; i < allVarieties.size(); i++) {
            tmpStage = (CNGrowthStages) allVarieties.get(i);
            if (tmpStage.myType.equalsIgnoreCase(jCBVarietyType.getSelectedItem().toString())) {
                break;
            }
        }

        //******* put original values back
        jTFNumber1.setText(tmpStage.ROW1_ORG);
        jTFNumber15.setText(tmpStage.ROW1_stress_ORG);        
        jTFNumber29.setText(tmpStage.ROW1_LVS_ORG);
        jTFNumber43.setText(tmpStage.ROW1_LVS_stress_ORG);

        jTFNumber2.setText(tmpStage.ROW2_ORG);
        jTFNumber16.setText(tmpStage.ROW2_stress_ORG);        
        jTFNumber30.setText(tmpStage.ROW2_LVS_ORG);
        jTFNumber44.setText(tmpStage.ROW2_LVS_stress_ORG);

        jTFNumber3.setText(tmpStage.ROW3_ORG);
        jTFNumber17.setText(tmpStage.ROW3_stress_ORG);        
        jTFNumber31.setText(tmpStage.ROW3_LVS_ORG);
        jTFNumber45.setText(tmpStage.ROW3_LVS_stress_ORG);

        jTFNumber4.setText(tmpStage.ROW4_ORG);
        jTFNumber18.setText(tmpStage.ROW4_stress_ORG);        
        jTFNumber32.setText(tmpStage.ROW4_LVS_ORG);
        jTFNumber46.setText(tmpStage.ROW4_LVS_stress_ORG);

        jTFNumber5.setText(tmpStage.ROW5_ORG);
        jTFNumber19.setText(tmpStage.ROW5_stress_ORG);        
        jTFNumber33.setText(tmpStage.ROW5_LVS_ORG);
        jTFNumber47.setText(tmpStage.ROW5_LVS_stress_ORG);

        jTFNumber6.setText(tmpStage.ROW6_ORG);
        jTFNumber20.setText(tmpStage.ROW6_stress_ORG);        
        jTFNumber34.setText(tmpStage.ROW6_LVS_ORG);
        jTFNumber48.setText(tmpStage.ROW6_LVS_stress_ORG);

        jTFNumber7.setText(tmpStage.ROW7_ORG);
        jTFNumber21.setText(tmpStage.ROW7_stress_ORG);        
        jTFNumber35.setText(tmpStage.ROW7_LVS_ORG);
        jTFNumber49.setText(tmpStage.ROW7_LVS_stress_ORG);

        jTFNumber8.setText(tmpStage.ROW8_ORG);
        jTFNumber22.setText(tmpStage.ROW8_stress_ORG);        
        jTFNumber36.setText(tmpStage.ROW8_LVS_ORG);
        jTFNumber50.setText(tmpStage.ROW8_LVS_stress_ORG);

        jTFNumber9.setText(tmpStage.ROW9_ORG);
        jTFNumber23.setText(tmpStage.ROW9_stress_ORG);        
        jTFNumber37.setText(tmpStage.ROW9_LVS_ORG);
        jTFNumber51.setText(tmpStage.ROW9_LVS_stress_ORG);

        jTFNumber10.setText(tmpStage.ROW10_ORG);
        jTFNumber24.setText(tmpStage.ROW10_stress_ORG);        
        jTFNumber38.setText(tmpStage.ROW10_LVS_ORG);
        jTFNumber52.setText(tmpStage.ROW10_LVS_stress_ORG);

        jTFNumber11.setText(tmpStage.ROW11_ORG);
        jTFNumber25.setText(tmpStage.ROW11_stress_ORG);        
        jTFNumber39.setText(tmpStage.ROW11_LVS_ORG);
        jTFNumber53.setText(tmpStage.ROW11_LVS_stress_ORG);

        jTFNumber12.setText(tmpStage.ROW12_ORG);
        jTFNumber26.setText(tmpStage.ROW12_stress_ORG);        
        jTFNumber40.setText(tmpStage.ROW12_LVS_ORG);
        jTFNumber54.setText(tmpStage.ROW12_LVS_stress_ORG);

        jTFNumber13.setText(tmpStage.ROW13_ORG);
        jTFNumber27.setText(tmpStage.ROW13_stress_ORG);        
        jTFNumber41.setText(tmpStage.ROW13_LVS_ORG);
        jTFNumber55.setText(tmpStage.ROW13_LVS_stress_ORG);

        jTFNumber14.setText(tmpStage.ROW14_ORG);
        jTFNumber28.setText(tmpStage.ROW14_stress_ORG);        
        jTFNumber42.setText(tmpStage.ROW14_LVS_ORG);
        jTFNumber56.setText(tmpStage.ROW14_LVS_stress_ORG);
       
        myParameters.setGrowthStages(tmpStage);
        this.setParameters();
    }


    /**
     *  Sets the parameters attribute of the CNSetGDDFrame object
     */
    public void setParameters() {
        CNGrowthStages tmpStage = null;
        for (int i = 0; i < allVarieties.size(); i++) {
            tmpStage = (CNGrowthStages) allVarieties.get(i);
            if (tmpStage.myType.equalsIgnoreCase(jCBVarietyType.getSelectedItem().toString())) {
                break;
            }
        }

//******* grab all values from text window
        tmpStage.ROW1 = jTFNumber1.getText().trim();
        tmpStage.ROW1_stress = jTFNumber15.getText().trim();        
        tmpStage.ROW1_LVS = jTFNumber29.getText().trim();
        tmpStage.ROW1_LVS_stress = jTFNumber43.getText().trim();

        tmpStage.ROW2 = jTFNumber2.getText().trim();
        tmpStage.ROW2_stress = jTFNumber16.getText().trim();        
        tmpStage.ROW2_LVS = jTFNumber30.getText().trim();
        tmpStage.ROW2_LVS_stress = jTFNumber44.getText().trim();

        tmpStage.ROW3 = jTFNumber3.getText().trim();
        tmpStage.ROW3_stress = jTFNumber17.getText().trim();        
        tmpStage.ROW3_LVS = jTFNumber31.getText().trim();
        tmpStage.ROW3_LVS_stress = jTFNumber45.getText().trim();

        tmpStage.ROW4 = jTFNumber4.getText().trim();
        tmpStage.ROW4_stress = jTFNumber18.getText().trim();        
        tmpStage.ROW4_LVS = jTFNumber32.getText().trim();
        tmpStage.ROW4_LVS_stress = jTFNumber46.getText().trim();

        tmpStage.ROW5 = jTFNumber5.getText().trim();
        tmpStage.ROW5_stress = jTFNumber19.getText().trim();        
        tmpStage.ROW5_LVS = jTFNumber33.getText().trim();
        tmpStage.ROW5_LVS_stress = jTFNumber47.getText().trim();

        tmpStage.ROW6 = jTFNumber6.getText().trim();
        tmpStage.ROW6_stress = jTFNumber20.getText().trim();        
        tmpStage.ROW6_LVS = jTFNumber34.getText().trim();
        tmpStage.ROW6_LVS_stress = jTFNumber48.getText().trim();

        tmpStage.ROW7 = jTFNumber7.getText().trim();
        tmpStage.ROW7_stress = jTFNumber21.getText().trim();        
        tmpStage.ROW7_LVS = jTFNumber35.getText().trim();
        tmpStage.ROW7_LVS_stress = jTFNumber49.getText().trim();

        tmpStage.ROW8 = jTFNumber8.getText().trim();
        tmpStage.ROW8_stress = jTFNumber22.getText().trim();        
        tmpStage.ROW8_LVS = jTFNumber36.getText().trim();
        tmpStage.ROW8_LVS_stress = jTFNumber50.getText().trim();

        tmpStage.ROW9 = jTFNumber9.getText().trim();
        tmpStage.ROW9_stress = jTFNumber23.getText().trim();        
        tmpStage.ROW9_LVS = jTFNumber37.getText().trim();
        tmpStage.ROW9_LVS_stress = jTFNumber51.getText().trim();

        tmpStage.ROW10 = jTFNumber10.getText().trim();
        tmpStage.ROW10_stress = jTFNumber24.getText().trim();        
        tmpStage.ROW10_LVS = jTFNumber38.getText().trim();
        tmpStage.ROW10_LVS_stress = jTFNumber52.getText().trim();

        tmpStage.ROW11 = jTFNumber11.getText().trim();
        tmpStage.ROW11_stress = jTFNumber25.getText().trim();        
        tmpStage.ROW11_LVS = jTFNumber39.getText().trim();
        tmpStage.ROW11_LVS_stress = jTFNumber53.getText().trim();

        tmpStage.ROW12 = jTFNumber12.getText().trim();
        tmpStage.ROW12_stress = jTFNumber26.getText().trim();        
        tmpStage.ROW12_LVS = jTFNumber40.getText().trim();
        tmpStage.ROW12_LVS_stress = jTFNumber54.getText().trim();

        tmpStage.ROW13 = jTFNumber13.getText().trim();
        tmpStage.ROW13_stress = jTFNumber27.getText().trim();        
        tmpStage.ROW13_LVS = jTFNumber41.getText().trim();
        tmpStage.ROW13_LVS_stress = jTFNumber55.getText().trim();

        tmpStage.ROW14 = jTFNumber14.getText().trim();
        tmpStage.ROW14_stress = jTFNumber28.getText().trim();        
        tmpStage.ROW14_LVS = jTFNumber42.getText().trim();
        tmpStage.ROW14_LVS_stress = jTFNumber56.getText().trim();
        
        
        // ************** get selected values ***********************
        tmpStage.setROW1_choice(Integer.parseInt(Row1Group.getSelection().getActionCommand()));
        tmpStage.setROW2_choice(Integer.parseInt(Row2Group.getSelection().getActionCommand()));
        tmpStage.setROW3_choice(Integer.parseInt(Row3Group.getSelection().getActionCommand()));
        tmpStage.setROW4_choice(Integer.parseInt(Row4Group.getSelection().getActionCommand()));
        tmpStage.setROW5_choice(Integer.parseInt(Row5Group.getSelection().getActionCommand()));
        tmpStage.setROW6_choice(Integer.parseInt(Row6Group.getSelection().getActionCommand()));
        tmpStage.setROW7_choice(Integer.parseInt(Row7Group.getSelection().getActionCommand()));
        tmpStage.setROW8_choice(Integer.parseInt(Row8Group.getSelection().getActionCommand()));
        tmpStage.setROW9_choice(Integer.parseInt(Row9Group.getSelection().getActionCommand()));
        tmpStage.setROW10_choice(Integer.parseInt(Row10Group.getSelection().getActionCommand()));
        tmpStage.setROW11_choice(Integer.parseInt(Row11Group.getSelection().getActionCommand()));
        tmpStage.setROW12_choice(Integer.parseInt(Row12Group.getSelection().getActionCommand()));
        tmpStage.setROW13_choice(Integer.parseInt(Row13Group.getSelection().getActionCommand()));
        tmpStage.setROW14_choice(Integer.parseInt(Row13Group.getSelection().getActionCommand()));
                
        // save all changes in myParameters
        myParameters.varietyType = jCBVarietyType.getSelectedItem().toString();
        myParameters.setGrowthStages(tmpStage);
//        pass parameters to output frame
        myOutputFrame.setParameters(myParameters);
    } // end of method setParameters


    /**
     *  Gets the Acode attribute of the CNSetGDDFrame object
     *
     *@param  col  Description of the Parameter
     *@return      The acode value
     */
    private String getAcode(String col) {
        if (col.equalsIgnoreCase("GS")) {
            return "2";
        } else if (col.equalsIgnoreCase("LV")) {
            return "3";
        } else if (col.equalsIgnoreCase("LS")) {
            return "4";
        }
        return "1";
    }


    /**
     *  Sets the growthStages attribute of the CNSetGDDFrame object, used when
     *  loading a saved scenario.
     *
     *@param  st  is a string tokenizer that is comma delimited and contains
     *      each column choice and the value that goes in that text box
     */
    public void setGrowthStages(StringTokenizer st) {

        // get value for ROW1
        String tmp = st.nextToken().trim();
        int code = Integer.parseInt(this.getAcode(tmp.substring(0, 2)));
        switch (code) {
            case 4:
                myParameters.myStages.ROW1_LVS_stress = tmp.substring(2);
                break;
            case 3:
                myParameters.myStages.ROW1_LVS = tmp.substring(2);
                break;
            case 2:
                myParameters.myStages.ROW1_stress = tmp.substring(2);
                break;
            default:
                myParameters.myStages.ROW1 = tmp.substring(2);
                break;
        }
        myParameters.myStages.setROW1_choice(code);

        // get value for ROW2
        tmp = st.nextToken().trim();
        code = Integer.parseInt(this.getAcode(tmp.substring(0, 2)));
        switch (code) {
            case 4:
                myParameters.myStages.ROW2_LVS_stress = tmp.substring(2);
                break;
            case 3:
                myParameters.myStages.ROW2_LVS = tmp.substring(2);
                break;
            case 2:
                myParameters.myStages.ROW2_stress = tmp.substring(2);
                break;
            default:
                myParameters.myStages.ROW2 = tmp.substring(2);
                break;
        }
        myParameters.myStages.setROW2_choice(code);

        // get value for ROW3
        tmp = st.nextToken().trim();
        code = Integer.parseInt(this.getAcode(tmp.substring(0, 2)));
        switch (code) {
            case 4:
                myParameters.myStages.ROW3_LVS_stress = tmp.substring(2);
                break;
            case 3:
                myParameters.myStages.ROW3_LVS = tmp.substring(2);
                break;
            case 2:
                myParameters.myStages.ROW3_stress = tmp.substring(2);
                break;
            default:
                myParameters.myStages.ROW3 = tmp.substring(2);
                break;
        }
        myParameters.myStages.setROW3_choice(code);

        // get value for ROW4
        tmp = st.nextToken().trim();
        code = Integer.parseInt(this.getAcode(tmp.substring(0, 2)));
        switch (code) {
            case 4:
                myParameters.myStages.ROW4_LVS_stress = tmp.substring(2);
                break;
            case 3:
                myParameters.myStages.ROW4_LVS = tmp.substring(2);
                break;
            case 2:
                myParameters.myStages.ROW4_stress = tmp.substring(2);
                break;
            default:
                myParameters.myStages.ROW4 = tmp.substring(2);
                break;
        }
        myParameters.myStages.setROW4_choice(code);

        // get value for ROW5
        tmp = st.nextToken().trim();
        code = Integer.parseInt(this.getAcode(tmp.substring(0, 2)));
        switch (code) {
            case 4:
                myParameters.myStages.ROW5_LVS_stress = tmp.substring(2);
                break;
            case 3:
                myParameters.myStages.ROW5_LVS = tmp.substring(2);
                break;
            case 2:
                myParameters.myStages.ROW5_stress = tmp.substring(2);
                break;
            default:
                myParameters.myStages.ROW5 = tmp.substring(2);
                break;
        }
        myParameters.myStages.setROW5_choice(code);

        // get value for ROW6
        tmp = st.nextToken().trim();
        code = Integer.parseInt(this.getAcode(tmp.substring(0, 2)));
        switch (code) {
            case 4:
                myParameters.myStages.ROW6_LVS_stress = tmp.substring(2);
                break;
            case 3:
                myParameters.myStages.ROW6_LVS = tmp.substring(2);
                break;
            case 2:
                myParameters.myStages.ROW6_stress = tmp.substring(2);
                break;
            default:
                myParameters.myStages.ROW6 = tmp.substring(2);
                break;
        }
        myParameters.myStages.setROW6_choice(code);

// get value for ROW7
        tmp = st.nextToken().trim();
        code = Integer.parseInt(this.getAcode(tmp.substring(0, 2)));
        switch (code) {
            case 4:
                myParameters.myStages.ROW7_LVS_stress = tmp.substring(2);
                break;
            case 3:
                myParameters.myStages.ROW7_LVS = tmp.substring(2);
                break;
            case 2:
                myParameters.myStages.ROW7_stress = tmp.substring(2);
                break;
            default:
                myParameters.myStages.ROW7 = tmp.substring(2);
                break;
        }
        myParameters.myStages.setROW7_choice(code);

// get value for ROW8
        tmp = st.nextToken().trim();
        code = Integer.parseInt(this.getAcode(tmp.substring(0, 2)));
        switch (code) {
            case 4:
                myParameters.myStages.ROW8_LVS_stress = tmp.substring(2);
                break;
            case 3:
                myParameters.myStages.ROW8_LVS = tmp.substring(2);
                break;
            case 2:
                myParameters.myStages.ROW8_stress = tmp.substring(2);
                break;
            default:
                myParameters.myStages.ROW8 = tmp.substring(2);
                break;
        }
        myParameters.myStages.setROW8_choice(code);

        // get value for ROW9
        tmp = st.nextToken().trim();
        code = Integer.parseInt(this.getAcode(tmp.substring(0, 2)));
        switch (code) {
            case 4:
                myParameters.myStages.ROW9_LVS_stress = tmp.substring(2);
                break;
            case 3:
                myParameters.myStages.ROW9_LVS = tmp.substring(2);
                break;
            case 2:
                myParameters.myStages.ROW9_stress = tmp.substring(2);
                break;
            default:
                myParameters.myStages.ROW9 = tmp.substring(2);
                break;
        }
        myParameters.myStages.setROW9_choice(code);

        // get value for ROW10
        tmp = st.nextToken().trim();
        code = Integer.parseInt(this.getAcode(tmp.substring(0, 2)));
        switch (code) {
            case 4:
                myParameters.myStages.ROW10_LVS_stress = tmp.substring(2);
                break;
            case 3:
                myParameters.myStages.ROW10_LVS = tmp.substring(2);
                break;
            case 2:
                myParameters.myStages.ROW10_stress = tmp.substring(2);
                break;
            default:
                myParameters.myStages.ROW10 = tmp.substring(2);
                break;
        }
        myParameters.myStages.setROW10_choice(code);

        // get value for ROW11
        tmp = st.nextToken().trim();
        code = Integer.parseInt(this.getAcode(tmp.substring(0, 2)));
        switch (code) {
            case 4:
                myParameters.myStages.ROW11_LVS_stress = tmp.substring(2);
                break;
            case 3:
                myParameters.myStages.ROW11_LVS = tmp.substring(2);
                break;
            case 2:
                myParameters.myStages.ROW11_stress = tmp.substring(2);
                break;
            default:
                myParameters.myStages.ROW11 = tmp.substring(2);
                break;
        }
        myParameters.myStages.setROW11_choice(code);

        // get value for ROW12
        tmp = st.nextToken().trim();
        code = Integer.parseInt(this.getAcode(tmp.substring(0, 2)));
        switch (code) {
            case 4:
                myParameters.myStages.ROW12_LVS_stress = tmp.substring(2);
                break;
            case 3:
                myParameters.myStages.ROW12_LVS = tmp.substring(2);
                break;
            case 2:
                myParameters.myStages.ROW12_stress = tmp.substring(2);
                break;
            default:
                myParameters.myStages.ROW12 = tmp.substring(2);
                break;
        }
        myParameters.myStages.setROW12_choice(code);

        // get value for ROW13
        tmp = st.nextToken().trim();
        code = Integer.parseInt(this.getAcode(tmp.substring(0, 2)));
        switch (code) {
            case 4:
                myParameters.myStages.ROW13_LVS_stress = tmp.substring(2);
                break;
            case 3:
                myParameters.myStages.ROW13_LVS = tmp.substring(2);
                break;
            case 2:
                myParameters.myStages.ROW13_stress = tmp.substring(2);
                break;
            default:
                myParameters.myStages.ROW13 = tmp.substring(2);
                break;
        }
        myParameters.myStages.setROW13_choice(code);
        
                // get value for ROW14
        tmp = st.nextToken().trim();
        code = Integer.parseInt(this.getAcode(tmp.substring(0, 2)));
        switch (code) {
            case 4:
                myParameters.myStages.ROW14_LVS_stress = tmp.substring(2);
                break;
            case 3:
                myParameters.myStages.ROW14_LVS = tmp.substring(2);
                break;
            case 2:
                myParameters.myStages.ROW14_stress = tmp.substring(2);
                break;
            default:
                myParameters.myStages.ROW14 = tmp.substring(2);
                break;
        }
        myParameters.myStages.setROW14_choice(code);
        
    }


    /**
     *  Sets the radioButton attribute of the CNSetGDDFrame object
     *
     *@param  e1          The new radioButton value
     *@param  ActionCode  The new radioButton value
     */
    private void setRadioButton(Enumeration e1, String ActionCode) {
        JRadioButton tmpButton = null;
        while (e1.hasMoreElements()) {
            tmpButton = (JRadioButton) e1.nextElement();
            if (tmpButton.getActionCommand().trim().equalsIgnoreCase(ActionCode)) {
                tmpButton.setSelected(true);
            }
        }
    }
}



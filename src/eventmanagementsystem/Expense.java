/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmanagementsystem;
import javax.swing.JTextField;
/**
 *
 * @author Mohit
 */
public class Expense extends javax.swing.JFrame {
    
    

    /**
     * Creates new form Expense
     */
    public Expense() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1400, 774));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(14, 14, 14));
        jLabel1.setText("Expense estimator");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 100, 210, 29);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventmanagementsystem/7d32c633-617e-4a38-ad07-84fccda5bc90.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 5, 190, 150);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Expenses", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 0, 12))); // NOI18N
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(207, 23, 23));
        jLabel5.setText("Sound arrengements:-");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 150, 180, 22);

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(207, 23, 23));
        jLabel6.setText("Catering services:-");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 290, 150, 20);

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(207, 23, 23));
        jLabel7.setText("AC / NON AC:-");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 440, 120, 22);

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(207, 23, 23));
        jLabel4.setText("Lightings:-");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 80, 90, 22);

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(207, 23, 23));
        jLabel3.setText("Decorations:-");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 20, 120, 22);

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(207, 23, 23));
        jLabel8.setText("Crowd estimation:-");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 220, 150, 22);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton1.setText("N/A");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(190, 20, 47, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton2.setText("2k-5k ");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(310, 20, 160, 20);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton3.setText("5k-8k");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(510, 20, 170, 23);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton4.setText("8k-10k");
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(790, 20, 170, 23);

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton5.setText("10k-20k");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton5);
        jRadioButton5.setBounds(1090, 20, 170, 23);

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton6.setText("N/A");
        jPanel1.add(jRadioButton6);
        jRadioButton6.setBounds(190, 80, 47, 23);

        buttonGroup2.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton7.setText("2k-5k ");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton7);
        jRadioButton7.setBounds(310, 70, 160, 40);

        buttonGroup2.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton8.setText("5k-8k");
        jPanel1.add(jRadioButton8);
        jRadioButton8.setBounds(510, 70, 170, 40);

        buttonGroup2.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton9.setText("8k-10k");
        jPanel1.add(jRadioButton9);
        jRadioButton9.setBounds(790, 70, 170, 40);

        buttonGroup2.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton10.setText("10k-15k");
        jPanel1.add(jRadioButton10);
        jRadioButton10.setBounds(1090, 70, 170, 40);

        buttonGroup3.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton11.setText("N/A");
        jPanel1.add(jRadioButton11);
        jRadioButton11.setBounds(190, 150, 47, 23);

        buttonGroup3.add(jRadioButton12);
        jRadioButton12.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton12.setText("2.5k(mic+speaker)");
        jPanel1.add(jRadioButton12);
        jRadioButton12.setBounds(310, 140, 160, 40);

        buttonGroup3.add(jRadioButton13);
        jRadioButton13.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton13.setText("6k(mic+speakers+music)");
        jRadioButton13.setActionCommand("JRadioButton13");
        jPanel1.add(jRadioButton13);
        jRadioButton13.setBounds(510, 140, 170, 40);

        buttonGroup3.add(jRadioButton14);
        jRadioButton14.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton14.setText("10k(full license)");
        jPanel1.add(jRadioButton14);
        jRadioButton14.setBounds(790, 140, 170, 40);

        buttonGroup4.add(jRadioButton17);
        jRadioButton17.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton17.setText("up to 100");
        jPanel1.add(jRadioButton17);
        jRadioButton17.setBounds(190, 210, 110, 40);

        buttonGroup4.add(jRadioButton18);
        jRadioButton18.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton18.setText("100-200");
        jPanel1.add(jRadioButton18);
        jRadioButton18.setBounds(310, 210, 170, 40);

        buttonGroup4.add(jRadioButton19);
        jRadioButton19.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton19.setText("200-300");
        jPanel1.add(jRadioButton19);
        jRadioButton19.setBounds(510, 200, 170, 40);

        buttonGroup4.add(jRadioButton20);
        jRadioButton20.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton20.setText("300+");
        jPanel1.add(jRadioButton20);
        jRadioButton20.setBounds(790, 200, 170, 40);

        buttonGroup5.add(jRadioButton21);
        jRadioButton21.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton21.setText("N/A");
        jPanel1.add(jRadioButton21);
        jRadioButton21.setBounds(790, 290, 47, 23);

        buttonGroup5.add(jRadioButton22);
        jRadioButton22.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton22.setText("Rs 250 per plate(Veg:2 vegetables+1 sweet)");
        jRadioButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton22ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton22);
        jRadioButton22.setBounds(190, 280, 260, 40);

        buttonGroup5.add(jRadioButton23);
        jRadioButton23.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton23.setText("Rs 350 per plate(Veg:3 Vegetables+ 2 sweets)");
        jPanel1.add(jRadioButton23);
        jRadioButton23.setBounds(510, 280, 271, 40);

        buttonGroup5.add(jRadioButton24);
        jRadioButton24.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton24.setText("Rs 300 per plate(Non-Veg :2 vegetables+1 sweet)");
        jPanel1.add(jRadioButton24);
        jRadioButton24.setBounds(190, 350, 289, 40);

        buttonGroup5.add(jRadioButton25);
        jRadioButton25.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton25.setText("Rs 400 per plate(Non-Veg: 3 vegetables+2 sweets)");
        jRadioButton25.setActionCommand("Rs 400 per plate (Non-Veg: 3 vegetables + 2 sweets)");
        jRadioButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton25ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton25);
        jRadioButton25.setBounds(510, 350, 310, 40);

        buttonGroup6.add(jRadioButton29);
        jRadioButton29.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton29.setText("AC");
        jRadioButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton29ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton29);
        jRadioButton29.setBounds(190, 440, 50, 23);

        buttonGroup6.add(jRadioButton30);
        jRadioButton30.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton30.setText("NON-AC");
        jRadioButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton30ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton30);
        jRadioButton30.setBounds(310, 440, 71, 23);

        buttonGroup3.add(jRadioButton15);
        jRadioButton15.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jRadioButton15.setText("10k(full license)");
        jPanel1.add(jRadioButton15);
        jRadioButton15.setBounds(1080, 140, 170, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 160, 1310, 480);

        jButton1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(870, 660, 100, 30);

        jButton2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton2.setText("Calculate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(710, 660, 130, 30);

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(420, 590, 0, 0);

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setText("The cost estimate of your event is :-");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 650, 290, 22);

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setText("₹");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(320, 660, 10, 14);

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(340, 650, 120, 30);

        jButton3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton3.setText("Next");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(590, 660, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton29ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     EventDetails e=new EventDetails();
     e.setVisible(true);    
     this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton22ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
       
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton30ActionPerformed

    private void jRadioButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton25ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           // TODO add your handling code here:
         long cost=0;
         if(jRadioButton1.isSelected())
         {
             cost=0;
         }
         else if (jRadioButton2.isSelected())
         {
             cost= 5000;
         }
         else if (jRadioButton3.isSelected())
         {
             cost= 8000;
         }
         else if(jRadioButton4.isSelected())
         {
             cost=8000;           
         }
         else
         {
             cost= 15000;
         }
         if(jRadioButton6.isSelected())
         {
             cost=cost+0;
         }
         else if(jRadioButton7.isSelected())
         {
             cost=cost+5000;
         }
         else if(jRadioButton8.isSelected())
         {
             cost=cost+8000;
         }
         else if(jRadioButton9.isSelected())
         {
             cost=cost+10000;
         }
         else 
         {
             cost=cost+15000;
         }
         if(jRadioButton11.isSelected())
         {
             cost=cost+0;
         }
         else if(jRadioButton12.isSelected())
         {
           cost=cost+2500;  
         }
         else if(jRadioButton13.isSelected())
         {
             cost=cost+6000;           
         }
         else 
         {
             cost=cost+10000;
         }
         
         if(jRadioButton17.isSelected())
         {
             cost=cost+6000;
         }
         else if(jRadioButton18.isSelected())
         {
             cost=cost+12000;
         }
         else if(jRadioButton19.isSelected())
         {
             cost=cost+18000;
         }
         else 
         {
             cost=cost+25000;
         }
         if(jRadioButton17.isSelected() && jRadioButton22.isSelected())
         {
             cost=cost+ (250*100);
         }
         if(jRadioButton17.isSelected() && jRadioButton23.isSelected())
         {
             cost=cost+ (350*100);
         }
         if(jRadioButton17.isSelected() && jRadioButton24.isSelected())
         {
             cost=cost+ (300*100);
         }
         if(jRadioButton17.isSelected() && jRadioButton25.isSelected())
         {
             cost=cost+ (400*100);
         }
         if(jRadioButton17.isSelected() && jRadioButton21.isSelected())
         {
             cost=cost+ (0*100);
         }
         
         
         
         
         
         
         
         if(jRadioButton18.isSelected() && jRadioButton22.isSelected())
         {
             cost=cost+ (250*200);
         }
         if(jRadioButton18.isSelected() && jRadioButton23.isSelected())
         {
             cost=cost+ (350*200);
         }
         if(jRadioButton18.isSelected() && jRadioButton24.isSelected())
         {
             cost=cost+ (300*200);
         }
         if(jRadioButton18.isSelected() && jRadioButton25.isSelected())
         {
             cost=cost+ (400*200);
         }
         if(jRadioButton18.isSelected() && jRadioButton21.isSelected())
         {
             cost=cost+ (0*200);
         }
         
         
         
         
         
         
         if(jRadioButton19.isSelected() && jRadioButton22.isSelected())
         {
             cost=cost+ (250*300);
         }
         if(jRadioButton19.isSelected() && jRadioButton23.isSelected())
         {
             cost=cost+ (350*300);
         }
         if(jRadioButton19.isSelected() && jRadioButton24.isSelected())
         {
             cost=cost+ (300*300);
         }
         if(jRadioButton19.isSelected() && jRadioButton25.isSelected())
         {
             cost=cost+ (400*300);
         }
         if(jRadioButton19.isSelected() && jRadioButton21.isSelected())
         {
             cost=cost+ (0*300);
         }
         
         
         
         
         
         
         
         if(jRadioButton20.isSelected() && jRadioButton22.isSelected())
         {
             cost=cost+ (250*400);
         }
         if(jRadioButton20.isSelected() && jRadioButton23.isSelected())
         {
             cost=cost+ (350*400);
         }
         if(jRadioButton20.isSelected() && jRadioButton24.isSelected())
         {
             cost=cost+ (300*400);
         }
         if(jRadioButton20.isSelected() && jRadioButton25.isSelected())
         {
             cost=cost+ (400*400);
         }
         if(jRadioButton20.isSelected() && jRadioButton21.isSelected())
         {
             cost=cost+ (0*400);
         }
             
         
         
         
         if(jRadioButton29.isSelected())
         {
             cost=cost+5000;
         }
         else
         {
             cost=cost+10000;
         }
         
         jLabel12.setText(""+cost);
         
             
            
             
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          // TODO add your handling code here:
          ThnakYou k= new ThnakYou();
         k.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Expense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Expense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Expense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Expense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Expense().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
}

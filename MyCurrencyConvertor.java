/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package My_Currency_Convertor;

import javax.swing.JFrame;

/**
 *
 * @author MEMONS
 */
public class MyCurrencyConvertor extends javax.swing.JFrame {
    String[] currencyUnits = {"units ","US Dollar","Nigerian Naira","Brazilian Real",
"Canadian Dollar","Kenyan Shilling","Indonesian Rupiah","Indian Rupee","Philippines Pisco",
"Pakistani Rupee"
};
    double US_Dollar=1.31;
    double Nigerian_Naira=476.57;
    double Brazilian_Real=5.47;
    double Canadian_Dollar=1.71;
    double Kenyan_Shilling=132.53;
    double Indonesian_Rupiah=19554.94;
    double Indian_Rupee=95.21;
    double Philippine_Pisco=71.17;
    double Pakistani_Rupee=162.74;
    
    public MyCurrencyConvertor() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firstCountry = new javax.swing.JComboBox<>();
        secondCountry = new javax.swing.JComboBox<>();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstCurrencyUnit = new javax.swing.JLabel();
        secondCurrencyUnit = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Main = new javax.swing.JButton();
        show_validation_here = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel.setBackground(java.awt.SystemColor.desktop);
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 5));
        panel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CURRENCY CONVERTER");
        panel.add(jLabel1);
        jLabel1.setBounds(350, 50, 610, 60);

        firstCountry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        firstCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One", "USA", "Nigeria", "Brazil", "Canada", "Kenyan", "Indonesia", "India", "Philippine", "Pakistan" }));
        firstCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                firstCountryItemStateChanged(evt);
            }
        });
        panel.add(firstCountry);
        firstCountry.setBounds(370, 160, 200, 50);

        secondCountry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        secondCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One", "USA", "Nigeria", "Brazil", "Canada", "Kenyan", "Indonesia", "India", "Philippine", "Pakistan" }));
        secondCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secondCountryItemStateChanged(evt);
            }
        });
        panel.add(secondCountry);
        secondCountry.setBounds(740, 160, 190, 50);

        t2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        panel.add(t2);
        t2.setBounds(740, 220, 190, 40);

        t1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1KeyPressed(evt);
            }
        });
        panel.add(t1);
        t1.setBounds(370, 220, 200, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("FROM:");
        panel.add(jLabel2);
        jLabel2.setBounds(380, 130, 90, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("TO");
        panel.add(jLabel3);
        jLabel3.setBounds(740, 130, 30, 22);

        firstCurrencyUnit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        firstCurrencyUnit.setForeground(new java.awt.Color(204, 204, 204));
        firstCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstCurrencyUnit.setText("UNITS:");
        panel.add(firstCurrencyUnit);
        firstCurrencyUnit.setBounds(370, 320, 200, 20);

        secondCurrencyUnit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        secondCurrencyUnit.setForeground(new java.awt.Color(204, 204, 204));
        secondCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondCurrencyUnit.setText("UNITS");
        panel.add(secondCurrencyUnit);
        secondCurrencyUnit.setBounds(740, 320, 190, 20);

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CONVERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel.add(jButton1);
        jButton1.setBounds(380, 370, 190, 50);

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel.add(jButton2);
        jButton2.setBounds(610, 370, 130, 50);

        jButton3.setBackground(new java.awt.Color(0, 51, 51));
        jButton3.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel.add(jButton3);
        jButton3.setBounds(790, 370, 130, 50);

        Main.setBackground(new java.awt.Color(0, 51, 51));
        Main.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        Main.setForeground(new java.awt.Color(255, 255, 255));
        Main.setText("MAIN MENU");
        Main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainActionPerformed(evt);
            }
        });
        panel.add(Main);
        Main.setBounds(560, 460, 210, 50);

        show_validation_here.setForeground(new java.awt.Color(204, 0, 0));
        show_validation_here.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                show_validation_hereKeyPressed(evt);
            }
        });
        panel.add(show_validation_here);
        show_validation_here.setBounds(380, 270, 140, 20);

        getContentPane().add(panel);
        panel.setBounds(0, 0, 1360, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void firstCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_firstCountryItemStateChanged
        int position=firstCountry.getSelectedIndex();
        firstCurrencyUnit.setText(currencyUnits[position]);
    }//GEN-LAST:event_firstCountryItemStateChanged

    private void secondCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_secondCountryItemStateChanged
          int position=secondCountry.getSelectedIndex();
        secondCurrencyUnit.setText(currencyUnits[position]);
    }//GEN-LAST:event_secondCountryItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       double amountToChange= Double.parseDouble(t1.getText());
       double amountInPounds=0.0;
        switch(firstCountry.getSelectedItem().toString()){
        case "USA": amountInPounds = amountToChange/US_Dollar;break;
	case "Nigeria":amountInPounds = amountToChange/Nigerian_Naira;break;
	case "Brazil":amountInPounds = amountToChange/Brazilian_Real;break;
	case "Canada":amountInPounds = amountToChange/Canadian_Dollar;break;
	case "Kenyan":amountInPounds = amountToChange/Kenyan_Shilling;break;
	case "Indonesia":amountInPounds = amountToChange/Indonesian_Rupiah;break;
	case "India":amountInPounds = amountToChange/Indian_Rupee;break;
	case "Philippine":amountInPounds = amountToChange/Philippine_Pisco;break;
	case "Pakistan":amountInPounds = amountToChange/Pakistani_Rupee;break;
	default:amountInPounds = 0.0;
        }
        double amountChanged=0.0;
        switch(secondCountry.getSelectedItem().toString()){
            case "USA":amountChanged = amountInPounds * US_Dollar;break;
            case "Nigeria":amountChanged = amountInPounds * Nigerian_Naira;break;
            case "Brazil":amountChanged = amountInPounds * Brazilian_Real;break;
            case "Canada":amountChanged = amountInPounds * Canadian_Dollar;break;
            case "Kenyan":amountChanged = amountInPounds * Kenyan_Shilling;break;
            case "Indonesia":amountChanged = amountInPounds * Indonesian_Rupiah;break;
            case "India":amountChanged = amountInPounds * Indian_Rupee;break;
            case "Philippine":amountChanged = amountInPounds * Philippine_Pisco;break;
            case "Pakistan":amountChanged = amountInPounds * Pakistani_Rupee;break;
            default:amountChanged = amountInPounds * 0.0;
        }
        String value = String.format("%.2f",amountChanged);
        t2.setText(value); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        firstCountry.setSelectedIndex(0);
        secondCountry.setSelectedIndex(0);
        t1.setText(null);
        t2.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void MainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainActionPerformed
         MainPage home = new MainPage();
    home.setVisible(true);
    dispose();
    }//GEN-LAST:event_MainActionPerformed

    private void show_validation_hereKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_show_validation_hereKeyPressed
    
    }//GEN-LAST:event_show_validation_hereKeyPressed

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyPressed
         try{
            int i=Integer.parseInt(t1.getText());
            show_validation_here.setText("");
        }
        catch(NumberFormatException e){
            show_validation_here.setText("Please write Digits");
        }
    }//GEN-LAST:event_t1KeyPressed

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
            java.util.logging.Logger.getLogger(MyCurrencyConvertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConvertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConvertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConvertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyCurrencyConvertor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Main;
    private javax.swing.JComboBox<String> firstCountry;
    private javax.swing.JLabel firstCurrencyUnit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panel;
    private javax.swing.JComboBox<String> secondCountry;
    private javax.swing.JLabel secondCurrencyUnit;
    private javax.swing.JLabel show_validation_here;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}

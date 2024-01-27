/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package addressbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dmoc2
 */
public class AddressBookGUI extends javax.swing.JFrame {

    personDetails [] arrayObj = new personDetails[5];
   
    personDetails person = new personDetails();
    
    ArrayList<personDetails> list = new ArrayList<>();
    
    private int index=0;
    
    
    private void addPerson()
    {
        
        String fn = fnText.getText();
        String sn = snText.getText();
        String email = emailText.getText();
        String address = addressText.getText();
        String phone = phoneNumText.getText();
        personDetails addDetails = new personDetails(fn, sn, email, address, phone);
        
        list.add(addDetails);
        
        JOptionPane.showMessageDialog(null, "Details added to phone book successfully!");
    }
    
    
    private void search()
    {
        if(list.isEmpty())
        {
             JOptionPane.showMessageDialog(null, "There is no one added to the phone book");
        }
        else
        {
           String index1 = phoneNumText.getText();
            
            for(int i=0; i<list.size(); i++)
            {
                personDetails grab = list.get(i);
                
                if(grab.getPhoneNum().equalsIgnoreCase(index1))
                {
                    JOptionPane.showMessageDialog(null, "person is found!");
                    displayArea.setText(null);
                    displayArea.append(grab.getDetails());
                } else if(!grab.getPhoneNum().equalsIgnoreCase(index1))
                {
                    JOptionPane.showMessageDialog(null, "This person phone num is wrong or does not exist in the phone book");
                }
                
            }
            
            
            
        }
    }
    
    
    private void writingToFile()
    {
        String firstName = fnText.getText();
        String lastName = snText.getText();
        String email = emailText.getText();
        String address = addressText.getText();
        String phoneNum = phoneNumText.getText();
        
        
       
        if(index < arrayObj.length){
            
        arrayObj [index] = new personDetails(firstName, lastName, email, address, phoneNum);
        
        
         try{
            File f = new File("phoneBook.dat");
            FileOutputStream fs = new FileOutputStream(f);
            ObjectOutputStream os = new ObjectOutputStream(fs);
   
            for(int i=0; i<arrayObj.length; i++){
            os.writeObject(arrayObj[i]);
            }
            os.close();
            JOptionPane.showMessageDialog(null, "Successfully written  file");
            
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, "There is an error with the code "+ex);
        }
       
        JOptionPane.showMessageDialog(null, index);
        } else if (index <= arrayObj.length)
        {
            JOptionPane.showMessageDialog(null, "The file is full");
        }
       
   
        
        
    }//end writing to file
    
    
    
    /**
     * Creates new form AddressBookGUI
     */
    public AddressBookGUI() {
        initComponents();
        companyLabel.setVisible(false);
        companyText.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTNGROUP = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        fnLabel = new javax.swing.JLabel();
        snLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        fnText = new javax.swing.JTextField();
        snText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        phoneNumLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        phoneNumText = new javax.swing.JTextField();
        addressText = new javax.swing.JTextField();
        addBTN = new javax.swing.JButton();
        searchBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayArea = new javax.swing.JTextArea();
        displayBTN = new javax.swing.JButton();
        fileBTN = new javax.swing.JButton();
        companyLabel = new javax.swing.JLabel();
        companyText = new javax.swing.JTextField();
        phoneBook = new javax.swing.JRadioButton();
        businessBook = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fnLabel.setText("First Name:");

        snLabel.setText("Surname Name:");

        emailLabel.setText("Email: ");

        phoneNumLabel.setText("Phone Number:");

        addressLabel.setText("Address");

        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        searchBTN.setText("Search");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        deleteBTN.setText("Delete");

        displayArea.setColumns(20);
        displayArea.setRows(5);
        jScrollPane1.setViewportView(displayArea);

        displayBTN.setText("Display");
        displayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBTNActionPerformed(evt);
            }
        });

        fileBTN.setText("Write to File");
        fileBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileBTNActionPerformed(evt);
            }
        });

        companyLabel.setText("Company Name");

        BTNGROUP.add(phoneBook);
        phoneBook.setText("PhoneBook");
        phoneBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneBookActionPerformed(evt);
            }
        });

        BTNGROUP.add(businessBook);
        businessBook.setText("CompanyBook");
        businessBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                businessBookActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(fnLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(snLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(emailLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(fnText, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(snText, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(emailText, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(phoneNumLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(addressLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(phoneNumText, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(addressText, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(addBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(searchBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(deleteBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(displayBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(fileBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(companyLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(companyText, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(phoneBook, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(businessBook, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fnText, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(snLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(snText, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(fnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fileBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(phoneBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(businessBook, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(phoneNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addressText)
                                        .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phoneNumText)
                                        .addComponent(addBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                                    .addComponent(deleteBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(companyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(companyText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(displayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(snLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(snText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(companyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(companyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fileBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneBook)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayBTN)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(businessBook)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
      
      if(phoneBook.isSelected()){  
        addPerson();
      } else {
          JOptionPane.showMessageDialog(null, "Please Select one of the radio buttons to proceed!");
      }
    }//GEN-LAST:event_addBTNActionPerformed

    private void displayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTNActionPerformed
        // TODO add your handling code here:
        displayArea.setText("");
        if(list.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "There is no person details within the phone book");
        } else {
            personDetails lol;
            for(int i=0; i<list.size(); i++){
            lol = list.get(i);
            displayArea.append("\n"+lol.getDetails());
            }
        }
    }//GEN-LAST:event_displayBTNActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_searchBTNActionPerformed

    private void fileBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileBTNActionPerformed
        // TODO add your handling code here:
        writingToFile();
        index++;
    }//GEN-LAST:event_fileBTNActionPerformed

    private void phoneBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneBookActionPerformed
        // TODO add your handling code here:
        companyLabel.setVisible(false);
        companyText.setVisible(false);
        companyText.setText("");
        
        
        
    }//GEN-LAST:event_phoneBookActionPerformed

    private void businessBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_businessBookActionPerformed
        // TODO add your handling code here:
        companyLabel.setVisible(true);
        companyText.setVisible(true);
    }//GEN-LAST:event_businessBookActionPerformed

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
            java.util.logging.Logger.getLogger(AddressBookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddressBookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddressBookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddressBookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddressBookGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BTNGROUP;
    private javax.swing.JButton addBTN;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressText;
    private javax.swing.JRadioButton businessBook;
    private javax.swing.JLabel companyLabel;
    private javax.swing.JTextField companyText;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JTextArea displayArea;
    private javax.swing.JButton displayBTN;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton fileBTN;
    private javax.swing.JLabel fnLabel;
    private javax.swing.JTextField fnText;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton phoneBook;
    private javax.swing.JLabel phoneNumLabel;
    private javax.swing.JTextField phoneNumText;
    private javax.swing.JButton searchBTN;
    private javax.swing.JLabel snLabel;
    private javax.swing.JTextField snText;
    // End of variables declaration//GEN-END:variables
}
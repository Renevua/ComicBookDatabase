/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internal;

import static internal.Internal.arc;
import static internal.Internal.oc;
import javax.swing.DefaultListModel;

/**
 *
 * @author Łada
 */
public class Search extends javax.swing.JFrame {

    /**
     * Creates new form Search
     */
    public Search(String f) {
        initComponents();
        
          DefaultListModel listModel;   
         jList1.setModel(new DefaultListModel());
        listModel = (DefaultListModel) jList1.getModel();

        for (int i = 0; i < oc.size(); i++) {
           if (oc.get(i).getName().contains(f)){
                  listModel.addElement(oc.get(i).getName());//outputs elements Name which has String f in Name
           }}
        for (int i = 0; i < oc.size(); i++) {
            if(oc.get(i).getGender().contains(f)){
               listModel.addElement(oc.get(i).getName());//outputs elements Name which has String f in Gender
           }}
          for (int i = 0; i < oc.size(); i++) {
            if(oc.get(i).getAge().contains(f)){
               listModel.addElement(oc.get(i).getName());//outputs elements Name which has String f in Age
           }}
            for (int i = 0; i < oc.size(); i++) {
            if(oc.get(i).getAppearance().contains(f)){
               listModel.addElement(oc.get(i).getName());//outputs elements Name which has String f in Appearance
           }}
              for (int i = 0; i < oc.size(); i++) {
            if(oc.get(i).getDetails().contains(f)){
               listModel.addElement(oc.get(i).getName());//outputs elements Name which has String f in Details
           }}
                for (int i = 0; i < oc.size(); i++) {
            if(oc.get(i).getBackstory().contains(f)){
               listModel.addElement(oc.get(i).getName());//outputs elements Name which has String f in Backstory
           }}{
      
         jList2.setModel(new DefaultListModel());
        listModel = (DefaultListModel) jList2.getModel();
              
                for (int i = 0; i < arc.size(); i++) {
            if(arc.get(i).getArcTitle().contains(f)){
               listModel.addElement(arc.get(i).getArcTitle());//outputs elements ArcTitle which has String f in ArcTitle
           }}
                      for (int i = 0; i < arc.size(); i++) {
            if(arc.get(i).getSetting().contains(f)){
               listModel.addElement(arc.get(i).getArcTitle());//outputs elements ArcTitle which has String f in Setting
           }}
                            for (int i = 0; i < arc.size(); i++) {
            if(arc.get(i).getLength().contains(f)){
               listModel.addElement(arc.get(i).getArcTitle());//outputs elements ArcTitle which has String f in Length
           }}
                                  for (int i = 0; i < arc.size(); i++) {
            if(arc.get(i).getKeyEvents().contains(f)){
               listModel.addElement(arc.get(i).getArcTitle());//outputs elements ArcTitle which has String f in KeyEvents
           }}
                                        for (int i = 0; i < arc.size(); i++) {
            if(arc.get(i).getSummary().contains(f)){
               listModel.addElement(arc.get(i).getArcTitle());//outputs elements ArcTitle which has String f in Summary
           }}
    
    }}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jButton1.setText("More...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jLabel1.setText("Characters");

        jLabel2.setText("Story Arcs");

        jButton3.setText("More...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(75, 75, 75)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();//close Search
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
      DefaultListModel model = (DefaultListModel) jList1.getModel();
       int selectedIndex = jList1.getSelectedIndex();
           int pom=jList1.getSelectedIndex();
        String c1=  (String) jList1.getSelectedValue();
        for (int i = 0; i < oc.size(); i++) {
            if (oc.get(i).getName().equals(c1)){pom=i;}
            
        }
       CharacterNew cnew = new CharacterNew(pom);
     
       cnew.setVisible(true);//opens up CharacterNew
     
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         DefaultListModel model = (DefaultListModel) jList2.getModel();
       int selectedIndex = jList2.getSelectedIndex();
           int pom=jList2.getSelectedIndex();
            String c2=  (String) jList2.getSelectedValue();
        for (int i = 0; i < arc.size(); i++) {
            if (arc.get(i).getArcTitle().equals(c2)){pom=i;}
            
        }
           StoryArcMenu neww = new StoryArcMenu(pom);
           
           neww.setVisible(true);//opens up StoryArcMenu
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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           
            public void run() {
                new Search("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

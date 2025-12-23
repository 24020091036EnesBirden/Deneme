
package test;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import tr.edu.istiklal.*;

public class UIsepet extends javax.swing.JFrame {
    DefaultListModel<String> modelim = new DefaultListModel<>();
   ArrayList<Urun> sepetim = new ArrayList<>();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(UIsepet.class.getName());

    
    public UIsepet() {
        initComponents();
        cmbUrun.addItem(new CepTelefonu("telefon",1000,"REDMİ","note 13"));
        cmbUrun.addItem(new Tekstil("tekstil",400,"Pantolon",36,"Zara"));
         cmbUrun.addItem(new Ekmek("ekmek",10,"Kepekli",12));
         lstSepet.setModel(modelim);    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        cmbOzellik = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSepet = new javax.swing.JList<>();
        cmbUrun = new javax.swing.JComboBox<>();
        btnEkle = new javax.swing.JButton();
        btnCikar = new javax.swing.JButton();
        lblToplam = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbOzellik.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ürünler", "Cep Telefonu", "Tekstil", "Ekmek" }));
        cmbOzellik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOzellikActionPerformed(evt);
            }
        });

        lstSepet.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstSepet);

        cmbUrun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ozellikler" }));
        cmbUrun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUrunActionPerformed(evt);
            }
        });

        btnEkle.setText("Sepete Ekle");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });

        btnCikar.setText("Sepetten Çıkar");
        btnCikar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCikarActionPerformed(evt);
            }
        });

        lblToplam.setText("Toplam");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbOzellik, 0, 181, Short.MAX_VALUE)
                    .addComponent(cmbUrun, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCikar)
                    .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblToplam, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(cmbOzellik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbUrun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCikar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblToplam)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOzellikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOzellikActionPerformed
      
        
          String secilen= cmbOzellik.getSelectedItem().toString();
        cmbUrun.removeAllItems();
        if(secilen.equals("Cep Telefonu")){
            cmbUrun.addItem(new CepTelefonu("telefon",1000,"REDMİ","note 13"));
             cmbUrun.addItem(new CepTelefonu("telefon",1000,"İphone","16 pro max"));
              cmbUrun.addItem(new CepTelefonu("telefon",1000,"İphone","17 pro max"));
        }
        else if(secilen.equals("Tekstil")){
            cmbUrun.addItem(new Tekstil("tekstil",400,"Pantolon",36,"loft"));
            cmbUrun.addItem(new Tekstil("tekstil",500,"tişört",12,"Zara"));
            cmbUrun.addItem(new Tekstil("tekstil",600,"kazak",13,"mavi"));
        } 
        else if (secilen.equals("Ekmek")){
            cmbUrun.addItem(new Ekmek("ekmek",10,"Kepekekmek",12));
            cmbUrun.addItem(new Ekmek("ekmek",15,"Çavdar",30));
            cmbUrun.addItem(new Ekmek("ekmek",20,"Tam Buğday",50));
        }
        
        
    }//GEN-LAST:event_cmbOzellikActionPerformed

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
    Object secilenObje=cmbUrun.getSelectedItem();
    if(secilenObje instanceof Urun){
        Urun secilen=(Urun) secilenObje;
        sepetim.add(secilen);
        modelim.addElement(secilen.getUrunadi()+"-"+secilen.getUrunfiyati());
        toplamiHesapla();
        
    }
        
    }//GEN-LAST:event_btnEkleActionPerformed

    private void btnCikarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikarActionPerformed
      
    int index=lstSepet.getSelectedIndex();
    if(index!=-1){
        sepetim.remove(index);
        modelim.remove(index);
        toplamiHesapla();
        
    }
    }
    private void toplamiHesapla(){
        double toplamFiyat=0;
        double toplamKdv=0;
        for (Urun u : sepetim){
            toplamFiyat += u.getUrunfiyati();
            toplamKdv +=u.Kdvuygula();
        }
        double genelToplam= toplamFiyat + toplamKdv;
        lblToplam.setText("urunler"+toplamFiyat+"tl"+"toplamKdv"+toplamKdv+"genelToplam"+genelToplam);
    
        
    }//GEN-LAST:event_btnCikarActionPerformed

    private void cmbUrunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUrunActionPerformed
  
      
        
                // TODO add your handling code here:
    }//GEN-LAST:event_cmbUrunActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new UIsepet().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCikar;
    private javax.swing.JButton btnEkle;
    private javax.swing.JComboBox<Object> cmbOzellik;
    private javax.swing.JComboBox<Object> cmbUrun;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblToplam;
    private javax.swing.JList<String> lstSepet;
    // End of variables declaration//GEN-END:variables
}

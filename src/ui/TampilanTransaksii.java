/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Statement;
import java.sql.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Adit
 */
public class TampilanTransaksii extends javax.swing.JFrame {
        int harga,jumlahBeli,cash;
        double diskon,Subtotal,totalBayar,bayar,cash1,sisa;
        String sisa1;
        String kode_transaksi = "TR";
        int AkunSebelumnya = 0;
        int i = 0;
    /**
     * Creates new form TampilanTransaksii
     */
    public TampilanTransaksii() {
        initComponents();
       
        //Agar textfield tidak bisa ditulis
        txtNama.setEnabled(false);
        txtSatuan.setEnabled(false);
        txtTotalPem.setEnabled(false);
        txtDiskon.setEnabled(false);
        txtTotalBayar.setEnabled(false);
        //mengatur posisi Frame agar di tengah saat di jalankan
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize=this.getSize();
        if(frameSize.height > screenSize.height){
        frameSize.height=screenSize.height;
        }
        if(frameSize.width > screenSize.width){
        frameSize.width=screenSize.width;
        }
        this.setLocation((screenSize.width - frameSize.width) / 2,
        (screenSize.height = screenSize.height) / 100);
   
    }
    
    //Function
      public String autonumber(int id){
                String iStr = "";
                String kode_transaksi = "TR";
                if (id != AkunSebelumnya){
                    i++;
                }
                   DecimalFormat decimalFormat = new DecimalFormat("0000");
                 iStr = decimalFormat.format(i);
              
                return kode_transaksi + iStr;
                              
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jLabel2 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSatuan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPembelian = new javax.swing.JTextField();
        bhitung = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtDiskon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotalBayar = new javax.swing.JTextField();
        jProgressBar3 = new javax.swing.JProgressBar();
        jCheckout = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbUkuran = new javax.swing.JComboBox<>();
        display_pakaian = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtTotalPem = new javax.swing.JTextField();
        rJaket = new javax.swing.JRadioButton();
        rKemeja = new javax.swing.JRadioButton();
        rHoddie = new javax.swing.JRadioButton();
        rCelPendek = new javax.swing.JRadioButton();
        rCelJeans = new javax.swing.JRadioButton();
        rCelBeggy = new javax.swing.JRadioButton();
        jBeli = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 204));
        jLabel2.setText("Toko Butik ");

        jProgressBar2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nama Pakaian");

        txtNama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Harga Satuan");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Jumlah");

        bhitung.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bhitung.setText("Hitung");
        bhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhitungActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Diskon");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Total Bayar");

        jProgressBar3.setBackground(new java.awt.Color(0, 0, 0));

        jCheckout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckout.setText("Checkout");
        jCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckoutActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Display Pakaian");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Ukuran");

        cbUkuran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XL", "L", "M", "S" }));
        cbUkuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUkuranActionPerformed(evt);
            }
        });

        display_pakaian.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        display_pakaian.setPreferredSize(new java.awt.Dimension(620, 620));

        javax.swing.GroupLayout display_pakaianLayout = new javax.swing.GroupLayout(display_pakaian);
        display_pakaian.setLayout(display_pakaianLayout);
        display_pakaianLayout.setHorizontalGroup(
            display_pakaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        display_pakaianLayout.setVerticalGroup(
            display_pakaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Total Pembelian");

        rJaket.setText("Jaket");
        rJaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rJaketActionPerformed(evt);
            }
        });

        rKemeja.setText("Kemeja");
        rKemeja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rKemejaActionPerformed(evt);
            }
        });

        rHoddie.setText("Hoodie");
        rHoddie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rHoddieActionPerformed(evt);
            }
        });

        rCelPendek.setText("Celana Pendek");
        rCelPendek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rCelPendekActionPerformed(evt);
            }
        });

        rCelJeans.setText("Celana Jeans");
        rCelJeans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rCelJeansActionPerformed(evt);
            }
        });

        rCelBeggy.setText("Celana Beggy");
        rCelBeggy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rCelBeggyActionPerformed(evt);
            }
        });

        jBeli.setText("Pesan");
        jBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rHoddie)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10)))
                            .addComponent(jLabel11)
                            .addComponent(jLabel6)
                            .addComponent(rKemeja)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rJaket)
                            .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbUkuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bhitung))
                                    .addComponent(txtTotalBayar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiskon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalPem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rCelBeggy)
                                        .addComponent(rCelPendek)
                                        .addComponent(rCelJeans)
                                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckout)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBeli)))))
                .addGap(0, 27, Short.MAX_VALUE)
                .addComponent(display_pakaian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(284, 284, 284))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(display_pakaian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rJaket)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rKemeja)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rHoddie))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rCelPendek)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rCelJeans)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rCelBeggy)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbUkuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bhitung)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalPem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancel)
                            .addComponent(jBeli)
                            .addComponent(jCheckout))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void reset(){
        //mereset
        
        txtPembelian.setText("");
        txtTotalPem.setText("");
        txtDiskon.setText("");
        txtTotalBayar.setText("");
    }

public void resetButton(){
        rJaket.setSelected(false);
        rHoddie.setSelected(false);
        rCelPendek.setSelected(false);
        rCelJeans.setSelected(false);
        rCelBeggy.setSelected(false);
        rKemeja.setSelected(false);
}

    private void bhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhitungActionPerformed
        // TODO add your handling code here:
        DecimalFormat df = new DecimalFormat("#.##");
        harga = Integer.parseInt(txtSatuan.getText());
        jumlahBeli = Integer.parseInt(txtPembelian.getText());
        Subtotal = harga * jumlahBeli;

        //memberi diskon
        if(jumlahBeli >= 3){
            diskon = Subtotal * 0.2;
        } else {
            diskon = 0;
        }
        totalBayar = Subtotal - diskon;
        String Diskon = df.format(diskon);
        String TotBay = df.format(totalBayar);
        String TotPemb = df.format(Subtotal);
        // menampilkan hasil
        txtDiskon.setText(Diskon);
        txtTotalBayar.setText(TotBay);
        txtTotalPem.setText(TotPemb);
    }//GEN-LAST:event_bhitungActionPerformed

    private void jCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckoutActionPerformed

        // TODO add your handling code here:
         int id = usersession.get_id();
         String nama = usersession.get_nama();
         String np = txtNama.getText();
         String uk = (String) cbUkuran.getSelectedItem();
         String satuan = txtSatuan.getText();
         String diskon = txtDiskon.getText();
         String jumlah = txtPembelian.getText();
         String total_pembelian = txtTotalPem.getText();
         String TotalBayar = txtTotalBayar.getText();
         
             if (usersession.get_id() != 0 ){

                DecimalFormat df = new DecimalFormat("#.##");

                    try {
                        Connection conn = koneksi.Koneksi();
                        Statement  stm  = conn.createStatement();
                        ResultSet  rs ;
                        //Validasi apakah sudah ada pesanan atau belum
                         rs = stm.executeQuery("SELECT * FROM checkout where nama_pembeli='"+usersession.get_nama()+"'"  );


                        //validasi jika data didatabase ada
                        if(rs.next()){

                             if (rs.getString("nama_pembeli") == null) {
                              JOptionPane.showMessageDialog(null, "Silahkan pesan barang yg ingin anda beli terlebih dahulu!","Pemberitahuan",JOptionPane.ERROR_MESSAGE);   
                             }
                             else {
                                new TampilanCheckout().setVisible(true);
                                dispose();
                             }

                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Silahkan pesan barang yg ingin anda beli terlebih dahulu!","Pemberitahuan",JOptionPane.ERROR_MESSAGE);   
                        } 
                     }
                    catch(Exception e) {
                    e.printStackTrace();
                     }
                    
                   //milik if(usersession.get_id())
                    
                    }
                    else {
                      JOptionPane.showMessageDialog(null, "MOHON MAAF KAK SILAHKAN LOGIN TERLEBIH DAHULU",
                                "PEMBERITAHUAN",JOptionPane.INFORMATION_MESSAGE);
                            dispose();
                     new TampilanLogin().setVisible(true);
                    }
       
    }//GEN-LAST:event_jCheckoutActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void cbUkuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUkuranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUkuranActionPerformed

    //RADIO BUTTON
    private void rKemejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rKemejaActionPerformed
        // TODO add your handling code here:
        //Mereset Button Pakaian
        resetButton();
        rKemeja.setSelected(true);
        //Mereset Gambar Panel
        display_pakaian.removeAll();
        //untuk menampilkan gambar
         JLabel label_gambar = new JLabel(new ImageIcon("src/asset/kemeja.jpg"));
        //x,y,lebar, tinggi
        label_gambar.setBounds(2, 2, 2, 2);
        label_gambar.setSize(620, 620);
        display_pakaian.add(label_gambar);
        display_pakaian.revalidate();
        display_pakaian.repaint();
        
        // Set Nama
        txtNama.setText("Kemeja");
        txtSatuan.setText("350000");
    }//GEN-LAST:event_rKemejaActionPerformed

    private void rJaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rJaketActionPerformed
        // TODO add your handling code here:
        resetButton();
        rJaket.setSelected(true);
        //Mereset Button Pakaian
        rKemeja.setSelected(false);
        rHoddie.setSelected(false);
        rCelPendek.setSelected(false);
        rCelJeans.setSelected(false);
        rCelBeggy.setSelected(false);
        //Mereset Gambar Panel
        display_pakaian.removeAll();
        // Set Nama
        txtNama.setText("Jaket");
        txtSatuan.setText("135000");
        
         //untuk menampilkan gambar
         JLabel label_gambar = new JLabel(new ImageIcon("src/asset/jaket.jpg"));
        //x,y,lebar, tinggi
        label_gambar.setBounds(2, 2, 2, 2);
        label_gambar.setSize(620, 620);
        display_pakaian.add(label_gambar);
        display_pakaian.revalidate();
        display_pakaian.repaint();
        
    }//GEN-LAST:event_rJaketActionPerformed

    private void rHoddieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rHoddieActionPerformed
        // TODO add your handling code here:
        //Mereset Button Pakaian
        resetButton();
        rHoddie.setSelected(true);
        //Mereset Gambar Panel
        display_pakaian.removeAll();
         //untuk menampilkan gambar
         JLabel label_gambar = new JLabel(new ImageIcon("src/asset/hodiebg.png"));
        //x,y,lebar, tinggi
        label_gambar.setBounds(2, 2, 2, 2);
        label_gambar.setSize(620, 620);
        display_pakaian.add(label_gambar);
        display_pakaian.revalidate();
        display_pakaian.repaint();
        
        
        
        // Set Nama
        txtNama.setText("Hoodie");
        txtSatuan.setText("85000");
        
    }//GEN-LAST:event_rHoddieActionPerformed

    private void rCelPendekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rCelPendekActionPerformed
        // TODO add your handling code here:
        //Mereset Button Pakaian
        resetButton();
        rCelPendek.setSelected(true);
        //Mereset Gambar Panel
        display_pakaian.removeAll();
        //untuk menampilkan gambar
         JLabel label_gambar = new JLabel(new ImageIcon("src/asset/celpen.jpg"));
        //x,y,lebar, tinggi
        label_gambar.setBounds(2, 2, 2, 2);
        label_gambar.setSize(620, 620);
        display_pakaian.add(label_gambar);
        display_pakaian.revalidate();
        display_pakaian.repaint();
        
        
        
        // Set Nama
        txtNama.setText("Celana Pendek");
        txtSatuan.setText("55000");
    }//GEN-LAST:event_rCelPendekActionPerformed

    private void rCelJeansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rCelJeansActionPerformed
        // TODO add your handling code here:
        //Mereset Button Pakaian
        resetButton();
        rCelJeans.setSelected(true);
        //Mereset Gambar Panel
        display_pakaian.removeAll();
        //untuk menampilkan gambar
         JLabel label_gambar = new JLabel(new ImageIcon("src/asset/jeans2.jpg"));
        //x,y,lebar, tinggi
        label_gambar.setBounds(2, 2, 2, 2);
        label_gambar.setSize(620, 620);
        display_pakaian.add(label_gambar);
        display_pakaian.revalidate();
        display_pakaian.repaint();
        
        
        
        // Set Nama
        txtNama.setText("Celana Jeans");
        txtSatuan.setText("80000");
    }//GEN-LAST:event_rCelJeansActionPerformed

    private void rCelBeggyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rCelBeggyActionPerformed
        // TODO add your handling code here:
        //Mereset Button Pakaian
        resetButton();
        rCelBeggy.setSelected(true);
        //Mereset Gambar Panel
        display_pakaian.removeAll();
        //untuk menampilkan gambar
         JLabel label_gambar = new JLabel(new ImageIcon("src/asset/beggy2.jpg"));
        //x,y,lebar, tinggi
        label_gambar.setBounds(2, 2, 2, 2);
        label_gambar.setSize(620, 620);
        display_pakaian.add(label_gambar);
        display_pakaian.revalidate();
        display_pakaian.repaint();
        
        
        
        // Set Nama
        txtNama.setText("Celana Beggy");
        txtSatuan.setText("95000");
    }//GEN-LAST:event_rCelBeggyActionPerformed
  
    private void jBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliActionPerformed
        // TODO add your handling code here:
         int id = usersession.get_id();
        String nama = usersession.get_nama();
        String np = txtNama.getText();
        String uk = (String) cbUkuran.getSelectedItem();
        
        try {
            if(id != 0){
                //Validasi untuk field yang belum terisi
                String satuan = txtSatuan.getText();
                String diskon = txtDiskon.getText();
                String jumlah = txtPembelian.getText();
                String Total_pembelian = txtTotalPem.getText();
                String TotalBayar = txtTotalBayar.getText();
                  if (np.isEmpty() || satuan.isEmpty() || diskon.isEmpty() || jumlah.isEmpty() 
                        ||Total_pembelian.isEmpty() || TotalBayar.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Tolong isi semua field pesanan dengan lengkap");
                    }
                  
                //Untuk Input Data yg ter isi
                int quantity = Integer.parseInt(txtPembelian.getText());
                String total_pembelian = txtTotalPem.getText();
                totalBayar = Integer.parseInt(txtTotalBayar.getText());
                
                DecimalFormat df = new DecimalFormat("#.##");
                
                // Kondisi jika Duit tidak mencukupi
               
                    Connection conn = koneksi.Koneksi();
                    Statement  stm  = conn.createStatement();
               
                      
                    //Menambahkan Data ke Database
                    String sql = "INSERT INTO checkout (kode_transaksi,nama_pembeli,nama_pakaian,ukuran,quantity,total_pembelian) VALUES (?,?,?,?,?,?)";
                    PreparedStatement p = (PreparedStatement) conn.prepareStatement(sql);
                   
                    String kode_transaksi = autonumber(id);
                    p.setString(1, kode_transaksi);
                    p.setString(2, nama);
                    p.setString(3, np);
                    p.setString(4, uk);
                    p.setInt(5, quantity);
                    p.setString(6, total_pembelian);
                    p.executeUpdate();
                    p.close();
                    
                    //Message
                    
                    JOptionPane.showMessageDialog(null, "PESANAN ANDA SUDAH KAMI MASUKKAN KERANJANG SILAHKAN CHECKOUT UNTUK MEMBAYARNYA",
                        "BERHASIL",JOptionPane.INFORMATION_MESSAGE);
                    reset();
            }
            else {
                JOptionPane.showMessageDialog(null, "MOHON MAAF KAK SILAHKAN LOGIN TERLEBIH DAHULU",
                    "PEMBERITAHUAN",JOptionPane.INFORMATION_MESSAGE);
                
                dispose();
                new TampilanLogin().setVisible(true);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jBeliActionPerformed

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
            java.util.logging.Logger.getLogger(TampilanTransaksii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanTransaksii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanTransaksii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanTransaksii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilanTransaksii().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bhitung;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> cbUkuran;
    private javax.swing.JPanel display_pakaian;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton jBeli;
    private javax.swing.JButton jCheckout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JRadioButton rCelBeggy;
    private javax.swing.JRadioButton rCelJeans;
    private javax.swing.JRadioButton rCelPendek;
    private javax.swing.JRadioButton rHoddie;
    private javax.swing.JRadioButton rJaket;
    private javax.swing.JRadioButton rKemeja;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPembelian;
    private javax.swing.JTextField txtSatuan;
    private javax.swing.JTextField txtTotalBayar;
    private javax.swing.JTextField txtTotalPem;
    // End of variables declaration//GEN-END:variables
}

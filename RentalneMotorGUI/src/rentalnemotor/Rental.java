/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rentalnemotor;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 *  @author Kelompok 3
 */
public class Rental extends javax.swing.JFrame {
    
     int lamaSewa, hargaSewa, totalBayar, biayaTambah;
    
    /**
     * Creates new form rental
     */
    public Rental() {
        initComponents();

        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);

        Tanggal();
        pilihankendaran.disable();
        hargasewa.disable();
        biayatambah.disable();
        totalbayar.disable();
        kembalian.disable();
    }

    public final void Tanggal() {
        Date tgl = new Date();
        SimpleDateFormat aa = new SimpleDateFormat("dd-MM-yyyy");
        tanggal.setText(aa.format(tgl));
    }

    //method jumlah karakter
    public void JumlahKarakter(KeyEvent a) {
        if (pemesan.getText().length() == 12) {
            a.consume();
            JOptionPane.showMessageDialog(null, "Maksimal 12 karakter",
                    "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }

    //method hanya angka
    public void FilterAngka(KeyEvent b) {
        if (Character.isAlphabetic(b.getKeyChar())) {
            b.consume();
            JOptionPane.showMessageDialog(null,
                    "Masukan Hanya Angka",
                    "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pemesan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tanggal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jeniskendaraan = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        pilihankendaran = new javax.swing.JTextField();
        label312323 = new javax.swing.JLabel();
        hargasewa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lamasewa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jasaantar = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        biayatambah = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        totalbayar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bayar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        kembalian = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("RENTAL  MOTOR RKB");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 6, -1, 30));

        jLabel2.setText("Nama Pemesan");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        pemesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pemesanActionPerformed(evt);
            }
        });
        pemesan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pemesanKeyTyped(evt);
            }
        });
        getContentPane().add(pemesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 238, -1));

        jLabel3.setText("Tanggal Sewa");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalActionPerformed(evt);
            }
        });
        getContentPane().add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 92, -1));

        jLabel4.setText("Jenis Kendaraan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 151, -1));

        jeniskendaraan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matic Honda <150cc", "Matic Yamaha <150cc", "Matic Honda >150cc", "Matic Yamaha >155cc", "Trail 150cc" }));
        jeniskendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeniskendaraanActionPerformed(evt);
            }
        });
        getContentPane().add(jeniskendaraan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel5.setText("Pilihan Kendaraan");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));
        getContentPane().add(pilihankendaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 127, -1));

        label312323.setText("Harga Sewa / Hari");
        getContentPane().add(label312323, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));
        getContentPane().add(hargasewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 108, -1));

        jLabel6.setText("Lama Sewa");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        lamasewa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lamasewaKeyTyped(evt);
            }
        });
        getContentPane().add(lamasewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 90, -1));

        jLabel7.setText("Jasa Antar");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 65, -1));

        jasaantar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ambil di tempat", "Antar" }));
        jasaantar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jasaantarActionPerformed(evt);
            }
        });
        getContentPane().add(jasaantar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel8.setText("Biaya Tambahan");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        getContentPane().add(biayatambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 119, -1));

        jLabel9.setText("Total Bayar");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));
        getContentPane().add(totalbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 109, -1));

        jLabel10.setText("Bayar");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        bayar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bayarFocusLost(evt);
            }
        });
        bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bayarKeyTyped(evt);
            }
        });
        getContentPane().add(bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 109, -1));

        jLabel11.setText("Kembalian");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));
        getContentPane().add(kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 109, -1));

        jButton1.setBackground(new java.awt.Color(51, 255, 102));
        jButton1.setText("HITUNG");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 311, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 51));
        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 311, -1, -1));

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setText("BANTUAN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 311, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setText("KELUAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentalnemotor/motor.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 180, 150));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pemesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pemesanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pemesanActionPerformed

    private void tanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null,
                "Apakah yakin akan Keluar?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        pemesan.setText("");
        pilihankendaran.setText("");
        hargasewa.setText("");
        lamasewa.setText("");
        biayatambah.setText("");
        totalbayar.setText("");
        bayar.setText("");
        kembalian.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pemesanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pemesanKeyTyped
        // TODO add your handling code here:
        JumlahKarakter(evt);
    }//GEN-LAST:event_pemesanKeyTyped

    private void jeniskendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeniskendaraanActionPerformed
        // TODO add your handling code here:

        if (jeniskendaraan.getSelectedItem() == "Matic Honda <150cc") {
            pilihankendaran.setText("Honda Beat FI");
            hargasewa.setText("80000");
        } else if (jeniskendaraan.getSelectedItem() == "Matic Yamaha <150cc") {
            pilihankendaran.setText("Yamaha Mio M3");
            hargasewa.setText("80000");
        } else if (jeniskendaraan.getSelectedItem() == "Matic Honda >150cc") {
            pilihankendaran.setText("Honda PCX 150");
            hargasewa.setText("100000");
        } else if (jeniskendaraan.getSelectedItem() == "Matic Yamaha >155cc") {
            pilihankendaran.setText("Yamaha NMAX 155");
            hargasewa.setText("100000");
        } else if (jeniskendaraan.getSelectedItem() == "Trail 150cc") {
            pilihankendaran.setText("Kawasaki KLX 150");
            hargasewa.setText("120000");
        }
    }//GEN-LAST:event_jeniskendaraanActionPerformed

    private void jasaantarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jasaantarActionPerformed
        // TODO add your handling code here:
        if (jasaantar.getSelectedItem() == "Antar") {
            biayatambah.setText("20000");
        } else {
            biayatambah.setText("0");
        }
    }//GEN-LAST:event_jasaantarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        
//        
//        int sewa = Integer.parseInt(hargasewa.getText());
//        int lama = Integer.parseInt(lamasewa.getText());
//        int bian = Integer.parseInt(biayatambah.getText());
//        int tobal;
//        
//        
//        tobal = ((sewa * lama)+ bian);
//        totalbayar.setText(Integer.toString(tobal));


//        mengguanakan class pembayaran
        lamaSewa = Integer.parseInt(lamasewa.getText());
        hargaSewa = Integer.parseInt(hargasewa.getText());
        biayaTambah = Integer.parseInt(biayatambah.getText());
        
        Hitung pembayaran = new Hitung(lamaSewa, hargaSewa, biayaTambah);
        pembayaran.Hitung();
        totalbayar.setText(pembayaran.Hitung());

        //Eksekusi Kembalian
//        int uangKembalian = uangBayar - totalBayar ;
//        kembalian.setText(Integer.toString(uangKembalian));

    }//GEN-LAST:event_jButton1ActionPerformed

    private void bayarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bayarFocusLost
        // TODO add your handling code here:
        int cektotal = Integer.parseInt(totalbayar.getText());
        int cekbayar = Integer.parseInt(bayar.getText());

        if (cekbayar < cektotal) {
            JOptionPane.showMessageDialog(null,
                    "Uang Bayar Kurang dari Total Bayar",
                    "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            int hitungkembalian;
            hitungkembalian = cekbayar - cektotal;
            kembalian.setText(Integer.toString(hitungkembalian));
        }
    }//GEN-LAST:event_bayarFocusLost

    private void bayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bayarKeyTyped
        // TODO add your handling code here:
        FilterAngka(evt);
    }//GEN-LAST:event_bayarKeyTyped

    private void lamasewaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lamasewaKeyTyped
        // TODO add your handling code here:
        FilterAngka(evt);
    }//GEN-LAST:event_lamasewaKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,
                    "Masukkan data anda dengan benar, Sesuai peritah pada Kolom",
                    "Meng-ewangi", JOptionPane.PLAIN_MESSAGE);
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
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rental().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bayar;
    private javax.swing.JTextField biayatambah;
    private javax.swing.JTextField hargasewa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jasaantar;
    private javax.swing.JComboBox<String> jeniskendaraan;
    private javax.swing.JTextField kembalian;
    private javax.swing.JLabel label312323;
    private javax.swing.JTextField lamasewa;
    private javax.swing.JTextField pemesan;
    private javax.swing.JTextField pilihankendaran;
    private javax.swing.JTextField tanggal;
    private javax.swing.JTextField totalbayar;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class nhacc extends javax.swing.JFrame {

    /**
     * Creates new form nhacc
     */
    public nhacc() {
        initComponents();
    }
     private Connection connect = null;
    private JTable jtable = new JTable();
    private DefaultTableModel tableModel = new DefaultTableModel();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtmancc = new javax.swing.JTextField();
        txttenncc = new javax.swing.JTextField();
        txtdiachi = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblncc = new javax.swing.JTable();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\Imageslisloaisanpham.png")); // NOI18N
        jLabel1.setText("B???ng Nh?? Cung C???p");

        jLabel2.setText("M?? Nh?? Cung C???p:");

        jLabel3.setText("T??n Nh?? Cung C???p:");

        jLabel4.setText("?????a Ch???:");

        jLabel5.setText("S??? ??I???n Tho???i");

        tblncc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "M?? NCC", "T??n NCC", "?????a Ch???", "SDT"
            }
        ));
        tblncc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblnccMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblncc);

        btnthem.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\ImagesButton-Add-icon.png")); // NOI18N
        btnthem.setText("Th??m");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\Imagespencil-red-icon.png")); // NOI18N
        btnsua.setText("S???a");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnthoat.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\ImagesButton-Add-icon.png")); // NOI18N
        btnthoat.setText("Th??m m???i");
        btnthoat.setSelected(true);
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });

        btnxoa.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\ImagesDelete-icon.png")); // NOI18N
        btnxoa.setText("X??a");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\Imagesexit.png")); // NOI18N
        jButton1.setText("????ng Form ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtmancc))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttenncc))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(btnthoat))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtsdt))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnthem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsua)
                                .addGap(18, 18, 18)
                                .addComponent(btnxoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtdiachi))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmancc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttenncc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthoat)
                    .addComponent(jButton1)
                    .addComponent(btnthem)
                    .addComponent(btnsua)
                    .addComponent(btnxoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        LayDuLieu();
    }//GEN-LAST:event_formWindowOpened

    private void tblnccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblnccMouseClicked
        // TODO add your handling code here:
        Main.playSound("music/soundbutton.wav");
        int index = tblncc.getSelectedRow();
        txtmancc.setText(tblncc.getValueAt(index, 1).toString());
        txttenncc.setText(tblncc.getValueAt(index, 2).toString());
        txtdiachi.setText(tblncc.getValueAt(index, 3).toString());
        txtsdt.setText(tblncc.getValueAt(index, 4).toString());
        LayDuLieu();
    }//GEN-LAST:event_tblnccMouseClicked

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        txtmancc.getText();
        txttenncc.getText();
        Main.playSound("music/soundbutton.wav");
        String maSP,tenSP,donViTinh,mancc;
        maSP = txtmancc.getText();
        tenSP = txttenncc.getText();
        donViTinh = txtdiachi.getText();
        mancc=txtsdt.getText();
        //      
        String SQL = "insert into NHACC(mancc,tenncc,diachi,sdt)"
                + " values('"+txtmancc.getText()+"','"+txttenncc.getText()+"','"+txtdiachi.getText()+"','"+txtsdt.getText()+"')";
        if("".equals(maSP) && "".equals(tenSP) && "".equals(donViTinh) &&  "".equals(mancc)){
            Main.thongBao("B???n ch??a nh???p ?????y ????? d??? li???u", "Th??ng B??o", 1);
        }
        else{
            Main.connection.ExcuteQueryUpdateDB(SQL);
            Main.thongBao("Th??m th??ng tin th??nh c??ng", "Th??ng B??o", 1);
        }
        LayDuLieu();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        String maSP,tenSP,donViTinh,giaBan;
        maSP = txtmancc.getText();
        tenSP = txttenncc.getText();
        donViTinh = txtdiachi.getText();
        giaBan = txtsdt.getText();
        //
       try
       {
            String SQL = "update NHACC set tenncc='"+tenSP+"',diachi='"+txtdiachi.getText()+"',sdt="+txtsdt.getText()+"WHERE mancc = "+txtmancc.getText();
                   
            Main.connection.ExcuteQueryUpdateDB(SQL);
            LayDuLieu();
            Main.thongBao("s???a th??ng tin th??nh c??ng", "Th??ng B??o", 1);
            Main.playSound("music/soundbutton.wav");
       }
       catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        Main.playSound("music/soundbutton.wav");
        int[] index = tblncc.getSelectedRows();
        for(int i = 0; i < index.length; i++){
            String maCanXoa = tblncc.getValueAt(index[i], 1).toString();
            String SQL = "delete from NHACC where mancc = "+maCanXoa;
            Main.connection.ExcuteQueryUpdateDB(SQL);
            Main.thongBao("X??a th??ng tin th??nh c??ng", "Th??ng B??o", 1);
        }
        LayDuLieu();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
        // TODO add your handling code here:
        txtmancc.setText("");
        txttenncc.setText("");
        txtdiachi.setText("");
        txtsdt.setText("");
    }//GEN-LAST:event_btnthoatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        quanly ql=new quanly();
        ql.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
         setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        int kQ = JOptionPane.showConfirmDialog(null,
                "B???n c?? mu???n tho??t ch????ng tr??nh kh??ng ?","Confirm",JOptionPane.YES_NO_OPTION);
        if(kQ == 0){
           Main.playSound("music/soundbutton.wav");
            System.exit(0);
        }else{
            
            Main.playSound("music/nonono.wav");
        }
    }//GEN-LAST:event_formWindowClosing
    private void LayDuLieu()
      {
        String SQL = "select * from NHACC";
        ResultSet rs = Main.connection.ExcuteQueryGetTable(SQL);
        Object [] obj = new Object[]{"STT","M?? NCC","T??n NCC","?????a Ch???", "SDT"};
        DefaultTableModel tableModel = new DefaultTableModel(obj,0);
        tblncc.setModel(tableModel);
        try
        {
            while(rs.next())
            {
                Object [] item = new Object[10];
                item[0] = tblncc.getRowCount() + 1;
                item[1] = rs.getString("mancc");
                item[2] = rs.getString("tenncc");
                item[3] = rs.getString("diachi");
                item[4] = rs.getString("sdt");
                tableModel.addRow(item);
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
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
            java.util.logging.Logger.getLogger(nhacc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nhacc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nhacc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nhacc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nhacc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnthoat;
    private javax.swing.JButton btnxoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblncc;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtmancc;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txttenncc;
    // End of variables declaration//GEN-END:variables
}

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

public class nhanvien extends javax.swing.JFrame {

    /**
     * Creates new form nhanvien
     */
    public nhanvien() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtmanv = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        txttennv = new javax.swing.JTextField();
        dtpngaysinh = new javax.swing.JTextField();
        rdbnam = new javax.swing.JRadioButton();
        rdbnu = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblnv = new javax.swing.JTable();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtdiachi = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

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
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\Imagesusers-mixed-gender-icon.png")); // NOI18N
        jLabel1.setText("BẢNG NHÂN VIÊN");

        jLabel3.setText("Mã NV:");

        jLabel4.setText("Tên NV:");

        jLabel5.setText("Giới tính:");

        jLabel6.setText("Năm sinh:");

        jLabel7.setText("SDT:");

        jLabel8.setText("Địa Chỉ:");

        rdbnam.setText("Nam");

        rdbnu.setText("Nữ");

        tblnv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Tên NV", "Giới Tính", "Ngày Sinh", "Địa Chỉ", "SDT"
            }
        ));
        tblnv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblnvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblnv);

        btnthem.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\ImagesButton-Add-icon.png")); // NOI18N
        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\Imagespencil-red-icon.png")); // NOI18N
        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\ImagesDelete-icon.png")); // NOI18N
        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnthoat.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\ImagesButton-Add-icon.png")); // NOI18N
        btnthoat.setText("Thếm mới");
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\Imagesexit.png")); // NOI18N
        jButton1.setText("Đóng Form");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnthem)
                                    .addGap(76, 76, 76)
                                    .addComponent(btnsua)
                                    .addGap(95, 95, 95)
                                    .addComponent(btnxoa)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnthoat))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtdiachi))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(rdbnam)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rdbnu))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtmanv))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(txttennv))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(dtpngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttennv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rdbnam)
                    .addComponent(rdbnu))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dtpngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnthoat)
                    .addComponent(btnxoa)
                    .addComponent(btnsua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        LayDuLieu();
    }//GEN-LAST:event_formWindowOpened

    private void tblnvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblnvMouseClicked
        // TODO add your handling code here:
        Main.playSound("music/soundbutton.wav");
        int index = tblnv.getSelectedRow();
        txtmanv.setText(tblnv.getValueAt(index, 1).toString());
        txttennv.setText(tblnv.getValueAt(index, 2).toString());
        if(tblnv.getValueAt(index, 3).equals("Nam")){
            rdbnu.setSelected(false);
        }
        else{
            
            rdbnam.setSelected(true);
        }
        dtpngaysinh.setText(tblnv.getValueAt(index, 4).toString());
        txtdiachi.setText(tblnv.getValueAt(index, 5).toString());
        txtsdt.setText(tblnv.getValueAt(index, 6).toString());
        LayDuLieu();
    }//GEN-LAST:event_tblnvMouseClicked

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
         Main.playSound("music/soundbutton.wav");
        String manv,tenNhanVien,diaChi,sdt,gioiTinh,ngaySinh;
        manv=txtmanv.getText();
        tenNhanVien = txttennv.getText();
        diaChi = txtdiachi.getText();
        sdt = txtsdt.getText();
        if(rdbnam.isSelected()){
            gioiTinh = "Nam";
        }
        else{
            gioiTinh = "Nữ";
        }
        ngaySinh=dtpngaysinh.getText();
        String SQL = "insert into NHANVIEN(manv,tennv,gioitinh,ngaysinh,diachi,sdt)"
                + " values(N'"+manv+"',N'"+tenNhanVien+"','"+gioiTinh+"',"+ngaySinh+","
                + "N'"+diaChi+"','"+sdt+"')";
        if("".equals(manv) && "".equals(tenNhanVien) && "".equals(gioiTinh) &&  "".equals(ngaySinh)&&"".equals(diaChi)&&"".equals(sdt)){
            Main.thongBao("Bạn chưa nhập đầy đủ dữ liệu", "Thông Báo", 1);
        }
        else{
            Main.connection.ExcuteQueryUpdateDB(SQL);
            Main.thongBao("Thêm dữ liệu thành công", "Thông Báo", 1);
        }
        LayDuLieu();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        String maSP,tenSP,donViTinh,giaBan,ngaysinh,gioiTinh;
        maSP = txtmanv.getText();
        tenSP = txttennv.getText();
        ngaysinh=dtpngaysinh.getText();
        if(rdbnam.isSelected()){
            gioiTinh = "Nam";
        }
        else{
            gioiTinh = "Nữ";
        }
        donViTinh = txtdiachi.getText();
        giaBan = txtsdt.getText();
        //
       try
       {
            String SQL = "update NHANVIEN set tennv='"+tenSP+"',diachi='"+txtdiachi.getText()+"',sdt='"+txtsdt.getText()+"',gioitinh='"+gioiTinh+"',ngaysinh="+dtpngaysinh.getText()+"WHERE manv = "+txtmanv.getText();
                   
            Main.connection.ExcuteQueryUpdateDB(SQL);
            LayDuLieu();
            Main.thongBao("sửa thông tin thành công", "Thông Báo", 1);
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
        int[] index = tblnv.getSelectedRows();
        for(int i = 0; i < index.length; i++){
            String maCanXoa = tblnv.getValueAt(index[i], 1).toString();
            String SQL = "delete from NHANVIEN where manv = "+maCanXoa;
            Main.connection.ExcuteQueryUpdateDB(SQL);
             Main.thongBao("Xóa thông tin thành công", "Thông Báo", 1);
        }
        LayDuLieu();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
        // TODO add your handling code here:
        txtmanv.setText("");
        txttennv.setText("");
        dtpngaysinh.setText("");
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
                "Bạn có muốn thoát chương trình không ?","Confirm",JOptionPane.YES_NO_OPTION);
        if(kQ == 0){
           Main.playSound("music/soundbutton.wav");
            System.exit(0);
        }else{
            
            Main.playSound("music/nonono.wav");
        }
    }//GEN-LAST:event_formWindowClosing
     private void LayDuLieu()
      {
        String SQL = "select * from NHANVIEN";
        ResultSet rs = Main.connection.ExcuteQueryGetTable(SQL);
        Object [] obj = new Object[]{"STT","Mã NV","Tên NV","Giới tính","Năm Sinh","Địa Chỉ", "SDT"};
        DefaultTableModel tableModel = new DefaultTableModel(obj,0);
        tblnv.setModel(tableModel);
        try
        {
            while(rs.next())
            {
                Object [] item = new Object[10];
                item[0] = tblnv.getRowCount() + 1;
                item[1] = rs.getString("manv");
                item[2] = rs.getString("tennv");
                item[3] = rs.getString("gioitinh");
                item[4] = rs.getString("ngaysinh");
                item[5] = rs.getString("diachi");
                item[6] = rs.getString("sdt");
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
            java.util.logging.Logger.getLogger(nhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nhanvien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnthoat;
    private javax.swing.JButton btnxoa;
    private javax.swing.JTextField dtpngaysinh;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbnam;
    private javax.swing.JRadioButton rdbnu;
    private javax.swing.JTable tblnv;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtmanv;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txttennv;
    // End of variables declaration//GEN-END:variables
}

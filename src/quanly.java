
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class quanly extends javax.swing.JFrame {

    /**
     * Creates new form quanly
     */
    public quanly() {
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

        btnBangSanPham = new javax.swing.JButton();
        btnBangLoaiSanPham = new javax.swing.JButton();
        btnBangNhanVien = new javax.swing.JButton();
        btnQuanLyQuyen = new javax.swing.JButton();
        btnQuanLyNguoiDung = new javax.swing.JButton();
        lblThongBao = new javax.swing.JLabel();
        lblLuotDangNhap = new javax.swing.JLabel();
        lblHienThiUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnQuanLyQuyen1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnBangSanPham.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBangSanPham.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\Imagessanpham.png")); // NOI18N
        btnBangSanPham.setText("Qu???n L?? H??ng H??a");
        btnBangSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangSanPhamActionPerformed(evt);
            }
        });

        btnBangLoaiSanPham.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBangLoaiSanPham.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\Imageslisloaisanpham.png")); // NOI18N
        btnBangLoaiSanPham.setText("Qu???n L?? Nh?? Cung C???p");
        btnBangLoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangLoaiSanPhamActionPerformed(evt);
            }
        });

        btnBangNhanVien.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBangNhanVien.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\Imagesusers-mixed-gender-icon.png")); // NOI18N
        btnBangNhanVien.setText("Qu???n L?? Nh??n Vi??n");
        btnBangNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangNhanVienActionPerformed(evt);
            }
        });

        btnQuanLyQuyen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnQuanLyQuyen.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\Imageslisloaisanpham.png")); // NOI18N
        btnQuanLyQuyen.setText("Qu???n L?? H??a ????n");
        btnQuanLyQuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyQuyenActionPerformed(evt);
            }
        });

        btnQuanLyNguoiDung.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnQuanLyNguoiDung.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\Imagesnhanvien.png")); // NOI18N
        btnQuanLyNguoiDung.setText("Qu???n L?? Kh??ch H??ng");
        btnQuanLyNguoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyNguoiDungActionPerformed(evt);
            }
        });

        lblThongBao.setForeground(javax.swing.UIManager.getDefaults().getColor("ToolBar.dockingForeground"));

        lblLuotDangNhap.setForeground(javax.swing.UIManager.getDefaults().getColor("ToolBar.dockingForeground"));

        lblHienThiUser.setForeground(javax.swing.UIManager.getDefaults().getColor("ToolBar.dockingForeground"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.activeCaption);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\ImagesApps-preferences-desktop-user-password-icon.png")); // NOI18N
        jLabel1.setText("H??? Th???ng Qu???n L??");

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\Imagesdangxuat.png")); // NOI18N
        jButton1.setText("????ng Xu???t");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnQuanLyQuyen1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnQuanLyQuyen1.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\ImagesApps-preferences-desktop-user-password-icon.png")); // NOI18N
        btnQuanLyQuyen1.setText("Qu???n L?? T??i Kho???n");
        btnQuanLyQuyen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyQuyen1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnQuanLyQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQuanLyQuyen1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblThongBao, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblLuotDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(254, 254, 254))
                                    .addComponent(lblHienThiUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBangLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBangNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnBangSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(87, 87, 87)
                                            .addComponent(btnQuanLyNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel1)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBangSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuanLyNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblThongBao)
                .addGap(71, 71, 71)
                .addComponent(lblLuotDangNhap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuanLyQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuanLyQuyen1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblHienThiUser)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBangLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBangNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBangSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangSanPhamActionPerformed
        // TODO add your handling code here:
        Main.playSound("music/boom.wav");
        hanghoa hh = null;
        try {
            hh = new hanghoa();
        } catch (SQLException ex) {
            Logger.getLogger(quanly.class.getName()).log(Level.SEVERE, null, ex);
        }
        hh.show();
        setVisible(false);
    }//GEN-LAST:event_btnBangSanPhamActionPerformed

    private void btnBangLoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangLoaiSanPhamActionPerformed
        // TODO add your handling code here:
        Main.playSound("music/ddd (online-audio-converter.com).wav");
        nhacc frmLSP = new nhacc();
        frmLSP.show();
        setVisible(false);
    }//GEN-LAST:event_btnBangLoaiSanPhamActionPerformed

    private void btnBangNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangNhanVienActionPerformed
        // TODO add your handling code here:
        Main.playSound("music/DienMayXanh.wav");
        nhanvien frmNV = new nhanvien();
        frmNV.show();
        setVisible(false);
    }//GEN-LAST:event_btnBangNhanVienActionPerformed

    private void btnQuanLyQuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyQuyenActionPerformed
        // TODO add your handling code here:
        Main.playSound("music/Emergency.wav");
        hoadon frmQ = new hoadon();
        frmQ.show();
        setVisible(false);
    }//GEN-LAST:event_btnQuanLyQuyenActionPerformed

    private void btnQuanLyNguoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyNguoiDungActionPerformed
        // TODO add your handling code here:
        Main.playSound("music/GimmeChocolate.wav");
        khachhang frmnd = null;
        try {
            frmnd = new khachhang();
        } catch (SQLException ex) {
            Logger.getLogger(quanly.class.getName()).log(Level.SEVERE, null, ex);
        }
        frmnd.show();
        setVisible(false);
    }//GEN-LAST:event_btnQuanLyNguoiDungActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Main.playSound("music/soundbutton.wav");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        int kQ = JOptionPane.showConfirmDialog(null,
                "B???n c?? mu???n tho??t ch????ng tr??nh kh??ng ?","Confirm",JOptionPane.YES_NO_OPTION);
        if(kQ == 0){
           Main.playSound("music/soundbutton.wav");
            System.exit(0);
        }
        else{
            
            Main.playSound("music/nonono.wav");
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dangnhap dn=new dangnhap();
        dn.show();
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnQuanLyQuyen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyQuyen1ActionPerformed
        // TODO add your handling code here:
        taikhoan dn=new taikhoan();
        dn.show();
        setVisible(false);
         Main.playSound("music/happy.wav");
    }//GEN-LAST:event_btnQuanLyQuyen1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Main.playSound("music/we.wav");
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(quanly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quanly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quanly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quanly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quanly().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBangLoaiSanPham;
    private javax.swing.JButton btnBangNhanVien;
    private javax.swing.JButton btnBangSanPham;
    private javax.swing.JButton btnQuanLyNguoiDung;
    private javax.swing.JButton btnQuanLyQuyen;
    private javax.swing.JButton btnQuanLyQuyen1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblHienThiUser;
    private javax.swing.JLabel lblLuotDangNhap;
    private javax.swing.JLabel lblThongBao;
    // End of variables declaration//GEN-END:variables
}

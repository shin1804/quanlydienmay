
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class chitiethd extends javax.swing.JFrame {

    /**
     * Creates new form chitiethd
     */
    public chitiethd() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtsoluong = new javax.swing.JTextField();
        txtdongia = new javax.swing.JTextField();
        txtthanhtien = new javax.swing.JTextField();
        cbbhh = new javax.swing.JComboBox<>();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblhd = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        cbbmanv = new javax.swing.JComboBox<>();

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
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\Images\\lisloaisanpham.png")); // NOI18N
        jLabel1.setText("BẢNG CHI TIẾT HĐ");

        jLabel2.setText("Mã HĐ:");

        jLabel3.setText("Tên Hàng Hóa:");

        jLabel4.setText("Số Lượng:");

        jLabel5.setText("Đơn Giá");

        jLabel6.setText("Thành Tiền:");

        txtthanhtien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtthanhtienActionPerformed(evt);
            }
        });

        cbbhh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnthem.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\Images\\Button-Add-icon.png")); // NOI18N
        btnthem.setText("thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\Images\\pencil-red-icon.png")); // NOI18N
        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\Images\\Delete-icon.png")); // NOI18N
        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnthoat.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\Images\\Button-Add-icon.png")); // NOI18N
        btnthoat.setText("Thêm mới");
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });

        tblhd.setModel(new javax.swing.table.DefaultTableModel(
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
        tblhd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblhdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblhd);

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Code\\Java\\JAVA-20210607T081428Z-001\\JAVA\\quanlydienmay\\Images\\lisloaisanpham.png")); // NOI18N
        jButton1.setText("Trở Lại Trang HĐ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbbmanv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtsoluong))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtdongia)
                                            .addComponent(txtthanhtien, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbbhh, 0, 149, Short.MAX_VALUE)
                                            .addComponent(cbbmanv, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnthoat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnxoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnsua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnthem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnthem)
                    .addComponent(cbbmanv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbbhh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsua))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxoa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtdongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnthoat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtthanhtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        LayDuLieu();
        LayLoaiSanPham();
        LayNV();
    }//GEN-LAST:event_formWindowOpened

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
         Main.playSound("music/soundbutton.wav");
        String manv,soLuong,donViTinh,giaBan,maLoai;
       Object [] abc = cbbmanv.getSelectedObjects();
        DisplayComboBoxModel atem = (DisplayComboBoxModel) abc[0];
        manv = atem.DisplayValue.toString();
        //
        soLuong = txtsoluong.getText();
        donViTinh = txtthanhtien.getText();
        giaBan = txtdongia.getText();
        //
        Object [] obj = cbbhh.getSelectedObjects();
        DisplayComboBoxModel item = (DisplayComboBoxModel) obj[0];
        maLoai = item.DisplayValue.toString();
        
        String SQL = "insert into CTHOADON(mahd,mahh,soluong,dongia,thanhtien)"
                + " values('"+manv+"',N'"+maLoai+"',"+soLuong+",N'"+giaBan+"',"
                + ""+donViTinh+")";
        if(  "".equals(donViTinh) && "".equals(giaBan)){
            Main.thongBao("Bạn chưa nhập đầy đủ dữ liệu", "Thông Báo", 1);
        }
        else{
            Main.connection.ExcuteQueryUpdateDB(SQL);
            Main.thongBao("thêm thành công", "thông báo", 1);
        }
        LayDuLieu();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        Main.playSound("music/soundbutton.wav");
        String manv,soLuong,donViTinh,giaBan,maLoaiSP;
       
        Object [] abc = cbbmanv.getSelectedObjects();
        DisplayComboBoxModel atem = (DisplayComboBoxModel) abc[0];
        manv = atem.DisplayValue.toString();
       
        soLuong = txtsoluong.getText();
        donViTinh = txtthanhtien.getText();
        giaBan = txtdongia.getText();
        //
        Object [] obj = cbbhh.getSelectedObjects();
        DisplayComboBoxModel item = (DisplayComboBoxModel) obj[0];
        maLoaiSP = item.DisplayValue.toString();
        String SQL = "update CTHOADON set "
                + " mahh = N'"+maLoaiSP+"', "
                + "soluong = "+soLuong+", thanhtien = N'"+donViTinh+"', "
                + " dongia = "+giaBan+" "
                + "where mahd = "+manv;
        Main.connection.ExcuteQueryUpdateDB(SQL);
        LayDuLieu();
    }//GEN-LAST:event_btnsuaActionPerformed

    private void tblhdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblhdMouseClicked
        // TODO add your handling code here:
        Main.playSound("music/soundbutton.wav");
        int index = tblhd.getSelectedRow();
        String tenNV=tblhd.getValueAt(index, 1).toString();
        txtsoluong.setText(tblhd.getValueAt(index, 3).toString());
        txtdongia.setText(tblhd.getValueAt(index, 4).toString());
        txtthanhtien.setText(tblhd.getValueAt(index, 5).toString());
        String tenLoai = tblhd.getValueAt(index, 2).toString();
        setSelectedCombobox(tenLoai);
        setSelectedCombobox1(tenNV);
    }//GEN-LAST:event_tblhdMouseClicked

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
        // TODO add your handling code here:
        cbbmanv.setSelectedIndex(0);
        txtsoluong.setText("");
        txtdongia.setText("");
         txtthanhtien.setText("");
    }//GEN-LAST:event_btnthoatActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        Main.playSound("music/soundbutton.wav");
        int[] index = tblhd.getSelectedRows();
        for(int i = 0; i < index.length; i++){
            String maCanXoa = tblhd.getValueAt(index[i], 1).toString();
            String SQL = "delete from CTHOADON where mahd = "+maCanXoa;
            Main.connection.ExcuteQueryUpdateDB(SQL);
            Main.thongBao("Xóa dữ liệu thành công", "thông báo", 1);
        }
        LayDuLieu();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        hoadon hd=new hoadon();
        hd.show();
        setVisible(false);
        Main.playSound("music/Emergency.wav");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtthanhtienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtthanhtienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtthanhtienActionPerformed

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
        String SQL = "select * from CTHOADON";
        ResultSet rs = Main.connection.ExcuteQueryGetTable(SQL);
        Object [] obj = new Object[]{"STT","Mã HD","tên hàng hóa","số lượng", "Đơn giá","thành tiền"};
        DefaultTableModel tableModel = new DefaultTableModel(obj,0);
        tblhd.setModel(tableModel);
        try
        {
            while(rs.next())
            {
                Object [] item = new Object[10];
                item[0] = tblhd.getRowCount() + 1;
                item[1]=LayTenNV(rs.getString("mahd"));
                item[2] =layTen(rs.getString("mahh"));  
                item[3] = rs.getInt("soluong");            
                item[4] = rs.getString("dongia");
                item[5] = rs.getString("thanhtien");
                tableModel.addRow(item);
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
    private void LayLoaiSanPham(){
        String SQL = "select * from HANGHOA";
        ResultSet rs = Main.connection.ExcuteQueryGetTable(SQL);
        DefaultComboBoxModel cbbModel = new DefaultComboBoxModel();
        try{
           while(rs.next()){
               DisplayComboBoxModel item = new DisplayComboBoxModel(rs.getString("tenhh"), rs.getString("mahh"));
               cbbModel.addElement(item);
           }
           cbbhh.setModel(cbbModel);
        }
        catch (Exception e) {
            System.out.println("ở đây");
        }
    }
    private void setSelectedCombobox(String tenLoai){
        
        for(int i = 0; i < cbbhh.getItemCount(); i++){
            Object obj = cbbhh.getItemAt(i);
            
            if(obj != null){
                DisplayComboBoxModel m = (DisplayComboBoxModel) obj;
                if(tenLoai.equals(m.DisplayMember)){
                    cbbhh.setSelectedItem(m);
                }
            }        
        }
    }
    private void setSelectedCombobox1(String tenNV)
    {
        for(int i = 0; i < cbbmanv.getItemCount(); i++)
        {
            Object obj = cbbmanv.getItemAt(i);
            
            if(obj != null)
            {
                DisplayComboBoxModel m = (DisplayComboBoxModel) obj;
                if(tenNV.equals(m.DisplayMember))
                {
                    cbbmanv.setSelectedItem(m);
                }
            }        
        }
    }
    private String LayTenNV(String maNV)
    {
        String tenNV="";
        String url="select mahd from HOADON where mahd = "+maNV;
        ResultSet rs = Main.connection.ExcuteQueryGetTable(url);
        try{
            while(rs.next()){
                tenNV = rs.getString("mahd");
                return tenNV;
            }
        }
        catch (Exception e) {
            System.out.println("mày đâu rồi");
        }
         return tenNV;
    }
    private void LayNV()
   {
       String url = "select * from HOADON";
        ResultSet ks = Main.connection.ExcuteQueryGetTable(url);
        DefaultComboBoxModel zxc = new DefaultComboBoxModel();
        try{
           while(ks.next()){
               DisplayComboBoxModel item = new DisplayComboBoxModel(ks.getString("mahd"), ks.getString("mahd"));
               zxc.addElement(item);
           }
           cbbmanv.setModel(zxc);
        }
        catch (Exception e) {
            System.out.println("ở đây");
        }
   }
    private String layTen(String maLoai){
        String tenLoai = "";
        String SQL = "select tenhh from HANGHOA where mahh = "+maLoai;
        ResultSet rs = Main.connection.ExcuteQueryGetTable(SQL);
        try{
            while(rs.next()){
                tenLoai = rs.getString("tenhh");
            }
        }
        catch (Exception e) {
            System.out.println("mày đâu rồi");
        }
        
        return tenLoai;
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
            java.util.logging.Logger.getLogger(chitiethd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chitiethd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chitiethd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chitiethd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chitiethd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnthoat;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> cbbhh;
    private javax.swing.JComboBox<String> cbbmanv;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblhd;
    private javax.swing.JTextField txtdongia;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JTextField txtthanhtien;
    // End of variables declaration//GEN-END:variables
}
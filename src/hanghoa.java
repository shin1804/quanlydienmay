

 
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
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
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class hanghoa extends javax.swing.JFrame {

    /**
     * Creates new form hanghoa
     */
    public hanghoa() throws SQLException, SQLException, SQLException {
        initComponents();
    }
    private Connection connect = null;
    private JTable jtable = new JTable();
    private DefaultTableModel tableModel = new DefaultTableModel();
       
    /**
     *
     * @throws SQLException
     */
      private void LayDuLieu()
      {
        String SQL = "select * from HANGHOA";
        ResultSet rs = Main.connection.ExcuteQueryGetTable(SQL);
        Object [] obj = new Object[]{"STT","Mã Hàng Hóa","Tên Hàng Hóa","Giá Bán", "Đơn Vị Tính","Mã Nhà Cung Cấp"};
        DefaultTableModel tableModel = new DefaultTableModel(obj,0);
        tblsanpham.setModel(tableModel);
        try
        {
            while(rs.next())
            {
                Object [] item = new Object[10];
                item[0] = tblsanpham.getRowCount() + 1;
                item[1] = rs.getString("mahh");
                item[2] = rs.getString("tenhh");
                item[5] = layTen(rs.getString("mancc"));
                item[3] = rs.getInt("giaban");
                item[4] = rs.getString("donvitinh");
                
                tableModel.addRow(item);
            }
        }
        catch (Exception e)
        {
            System.out.println("Không kết nối được SQL");
        }
    }
     private void LayLoaiSanPham(){
        String SQL = "select * from NHACC";
        ResultSet rs = Main.connection.ExcuteQueryGetTable(SQL);
        DefaultComboBoxModel cbbModel = new DefaultComboBoxModel();
        try{
           while(rs.next()){
               DisplayComboBoxModel item = new DisplayComboBoxModel(rs.getString("tenncc"), rs.getString("mancc"));
               cbbModel.addElement(item);
           }
           cbbMaLoaiSanPham.setModel(cbbModel);
        }
        catch (Exception e) {
            System.out.println("ở đây");
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

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtmahh = new javax.swing.JTextField();
        txtgia = new javax.swing.JTextField();
        txtdonvi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsanpham = new javax.swing.JTable();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txttimkiem = new javax.swing.JTextField();
        btntimkiem = new javax.swing.JButton();
        cbbMaLoaiSanPham = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        txtten = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

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
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\quanlydienmay\\Images\\sanpham.png")); // NOI18N
        jLabel1.setText("Bảng hàng hóa");

        jLabel2.setText("Mã hàng hóa");

        jLabel3.setText("Tên hàng hóa");

        jLabel4.setText("Giá bán");

        jLabel5.setText("Mã Nhà cung cấp:");

        jLabel6.setText("Đơn vị tính");

        tblsanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Hàng Hóa", "Tên Hàng Hóa", "Giá Bán", "Đơn Vị Tính", "Mã Nhà cung cấp"
            }
        ));
        tblsanpham.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblsanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsanphamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblsanpham);
        if (tblsanpham.getColumnModel().getColumnCount() > 0) {
            tblsanpham.getColumnModel().getColumn(0).setResizable(false);
        }

        btnsua.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\quanlydienmay\\Images\\pencil-red-icon.png")); // NOI18N
        btnsua.setText("Sửa");
        btnsua.setToolTipText("");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\quanlydienmay\\Images\\Delete-icon.png")); // NOI18N
        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnthem.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\quanlydienmay\\Images\\Button-Add-icon.png")); // NOI18N
        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\quanlydienmay\\Images\\Button-Add-icon.png")); // NOI18N
        jButton1.setText("Thêm mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Tìm Kiếm:");

        txttimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimkiemActionPerformed(evt);
            }
        });
        txttimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttimkiemKeyReleased(evt);
            }
        });

        btntimkiem.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\quanlydienmay\\Images\\timkiem.png")); // NOI18N
        btntimkiem.setText("tìm kiếm");
        btntimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemActionPerformed(evt);
            }
        });

        cbbMaLoaiSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\quanlydienmay\\Images\\exit.png")); // NOI18N
        jButton2.setText("Đóng Form");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txttimkiem))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(40, 40, 40)
                                .addComponent(txtgia))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(24, 24, 24)
                                .addComponent(txtdonvi))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(14, 14, 14)
                                .addComponent(cbbMaLoaiSanPham, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtten))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtmahh, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnxoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnthem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btntimkiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmahh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnthem)
                    .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxoa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtdonvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbbMaLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntimkiem))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblsanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsanphamMouseClicked
        // TODO add your handling code here:
         Main.playSound("music/soundbutton.wav");
        int index = tblsanpham.getSelectedRow();
        txtmahh.setText(tblsanpham.getValueAt(index, 1).toString());
        txtten.setText(tblsanpham.getValueAt(index, 2).toString());
        txtgia.setText(tblsanpham.getValueAt(index, 3).toString());
        txtdonvi.setText(tblsanpham.getValueAt(index, 4).toString());
        String tenLoai = tblsanpham.getValueAt(index, 5).toString();
        setSelectedCombobox(tenLoai);
        LayDuLieu();
    }//GEN-LAST:event_tblsanphamMouseClicked
    private void setSelectedCombobox(String tenLoai)
    {      
        for(int i = 0; i < cbbMaLoaiSanPham.getItemCount(); i++)
        {
            Object obj = cbbMaLoaiSanPham.getItemAt(i);
            
            if(obj != null)
            {
                DisplayComboBoxModel m = (DisplayComboBoxModel) obj;
                if(tenLoai.equals(m.DisplayMember))
                {
                    cbbMaLoaiSanPham.setSelectedItem(m);
                }
            }        
        }
    }
    private String layTen(String maLoai)
    {
        String tenLoai = "";
        String SQL = "select tenncc from NHACC where mancc = "+maLoai;
        ResultSet rs = Main.connection.ExcuteQueryGetTable(SQL);
        try
        {
            while(rs.next())
            {
                tenLoai = rs.getString("tenncc");
            }
        }
        catch (Exception e)
        {
            System.out.println("mày đâu rồi");
        }
        
        return tenLoai;
    }
    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        txtmahh.getText();
        txtten.getText();
        Main.playSound("music/soundbutton.wav");
        String maSP,tenSP,donViTinh,giaBan,mancc;
        maSP = txtmahh.getText();
        tenSP = txtten.getText();
        donViTinh = txtdonvi.getText();
        Object [] obj = cbbMaLoaiSanPham.getSelectedObjects();
        DisplayComboBoxModel item = (DisplayComboBoxModel) obj[0];
        mancc = item.DisplayValue.toString();
        giaBan = txtgia.getText();
        //      
        String SQL = "insert into HANGHOA(mahh,tenhh,giaban,donvitinh,mancc)"
                + " values('"+txtmahh.getText()+"','"+txtten.getText()+"',"+txtgia.getText()+",'"+txtdonvi.getText()+"',"+mancc+")";
        if("".equals(maSP) && "".equals(tenSP) && "".equals(donViTinh) && "".equals(giaBan) ){
            Main.thongBao("Bạn chưa nhập đầy đủ dữ liệu", "Thông Báo", 1);
        }
        else{
            Main.connection.ExcuteQueryUpdateDB(SQL);
            Main.thongBao("thêm dữ liệu thành công", "Thông Báo", 1);
        }
        LayDuLieu();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        Main.playSound("music/soundbutton.wav");
        int[] index = tblsanpham.getSelectedRows();
        for(int i = 0; i < index.length; i++){
            String maCanXoa = tblsanpham.getValueAt(index[i], 1).toString();
            String SQL = "delete from HANGHOA where mahh = "+maCanXoa;
             Main.thongBao("xóa dữ liệu thành công", "Thông Báo", 1);
            Main.connection.ExcuteQueryUpdateDB(SQL);
        }
        LayDuLieu();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        LayDuLieu();
        LayLoaiSanPham();
    }//GEN-LAST:event_formWindowOpened

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        Main.playSound("music/soundbutton.wav");
        String maSP,tenSP,donViTinh,mancc,giaBan;
        maSP = txtmahh.getText();
        tenSP = txtten.getText();
        donViTinh = txtdonvi.getText();
        giaBan = txtgia.getText();
       Object [] obj = cbbMaLoaiSanPham.getSelectedObjects();
        DisplayComboBoxModel item = (DisplayComboBoxModel) obj[0];
        mancc = item.DisplayValue.toString();
        //
       
        String SQL = "update HANGHOA set "
                + " tenhh = N'"+tenSP+"', "
                + " donvitinh = N'"+donViTinh+"', "
                + " GiaBan = "+giaBan+", mancc = "+mancc+" "
                + "where mahh = "+maSP;
        Main.connection.ExcuteQueryUpdateDB(SQL);
         Main.thongBao("Sửa dữ liệu thành công", "Thông Báo", 1);
        LayDuLieu();
    }//GEN-LAST:event_btnsuaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txtmahh.setText("");
        txtten.setText("");
        txtdonvi.setText("");
        txtgia.setText("");
         cbbMaLoaiSanPham.setSelectedIndex(0);
         LayDuLieu();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txttimkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimkiemKeyReleased
        // TODO add your handling code here:
        Main.playSound("music/soundkeyboard.wav");
        
    }//GEN-LAST:event_txttimkiemKeyReleased

    private void btntimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemActionPerformed
        // TODO add your handling code here:
       
        String key = txttimkiem.getText();
        String SQL = "select * from HANGHOA where mahh like '%"+key+"%' or tenhh like N'%"+key+"%'or donvitinh like N'%"+key+"%' or giaban like '%"+key+"%'";
        ResultSet rs = Main.connection.ExcuteQueryGetTable(SQL);
        Object [] obj = new Object[]{"STT","Mã Hàng Hóa","Tên Hàng Hóa","Giá Bán", "Đơn Vị Tính","Mã Nhà Cung Cấp"};
        DefaultTableModel tableModel = new DefaultTableModel(obj,0);
        tblsanpham.setModel(tableModel);
        try{
            while(rs.next())
            {
                Object [] item = new Object[10];
                item[0] = tblsanpham.getRowCount() + 1;
                item[1] = rs.getString("mahh");
                item[2] = rs.getString("tenhh");
                item[3] = rs.getInt("giaban");
                item[4] = rs.getString("donvitinh");
                item[5] = layTen(rs.getString("mancc"));
                tableModel.addRow(item);
            }
        }
        catch (Exception e) {
             Main.thongBao("Không tìm thấy dữ liệu", "Thông Báo", 1);
              LayDuLieu();
        }
    }//GEN-LAST:event_btntimkiemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        quanly ql=new quanly();
        ql.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimkiemActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        int kQ = JOptionPane.showConfirmDialog(null,
                "Bạn có muốn thoát chương trình không ?","Confirm",JOptionPane.YES_NO_OPTION);
        if(kQ == 0){
           Main.playSound("music/soundbutton.wav");
            System.exit(0);
        }
        else{
            
            Main.playSound("music/nonono.wav");
        }
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
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
            java.util.logging.Logger.getLogger(hanghoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hanghoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hanghoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hanghoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
         java.awt.EventQueue.invokeLater(() -> {
            try {
                new hanghoa().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(hanghoa.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntimkiem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> cbbMaLoaiSanPham;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblsanpham;
    private javax.swing.JTextField txtdonvi;
    private javax.swing.JTextField txtgia;
    private javax.swing.JTextField txtmahh;
    private javax.swing.JTextField txtten;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables

   
}

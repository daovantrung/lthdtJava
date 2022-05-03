/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package lthdt.chuong3.dohoa.frame;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import lthdt.chuong3.coffeelogic.CoffeeShop;
import lthdt.chuong3.coffeelogic.Manager;

/**
 *
 * @author macbookair
 */
public class MyCoffee extends javax.swing.JInternalFrame {
Manager[] manager;
    
    /**
     * Creates new form MyCoffee
     */
    public MyCoffee() throws ParseException {
        initComponents();
          SimpleDateFormat df =new SimpleDateFormat("dd-MM-yyyy",Locale.ENGLISH);
        CoffeeShop[]a = new CoffeeShop[]{new CoffeeShop("Kha coffee","Huế"),
                        new CoffeeShop("Sky","Đà nẵng"),
                        new CoffeeShop("Sun Coffee","Quảng TRị")};
        manager = new Manager[]{
            new Manager(a, 1000,"Le Thi A",0,df.parse("12-12-2001")),
        new Manager(new CoffeeShop[]{
            new CoffeeShop("Hoang Hạc","12 nguỹen huệ")
        },
        2000, "Nguyễn Văn B",1,df.parse("12-12-1999"))
                };
        
        for(int i = 0;i< manager.length;i++){
            cbQL.addItem(manager[i].getHoten());
        }
        DefaultTableModel model = (DefaultTableModel)tbcoffeeshop.getModel();
        model.setRowCount(0);
        CoffeeShop[] shops = manager[0].getShops();
        for (int i = 0;i<shops.length;i++){
            model.insertRow(model.getRowCount(),
                    new Object[]{model.getRowCount()+1,
                    shops[i].getName(),
                    shops[i].getAddress()});
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
        cbQL = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbcoffeeshop = new javax.swing.JTable();

        setTitle("Danh sách quán cafe");

        jLabel1.setText("Họ tên người quản lý:");

        cbQL.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbQLItemStateChanged(evt);
            }
        });

        tbcoffeeshop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "STT", "Tên Quán", "Địa Chỉ"
            }
        ));
        jScrollPane1.setViewportView(tbcoffeeshop);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbQL, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbQLItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbQLItemStateChanged
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tbcoffeeshop.getModel();
        model.setRowCount(0);
        int index = cbQL.getSelectedIndex();
        CoffeeShop[] shops = manager[index].getShops();
        for (int i = 0;i<shops.length;i++){
            model.insertRow(model.getRowCount(),
                    new Object[]{model.getRowCount()+1,
                    shops[i].getName(),
                    shops[i].getAddress()});
        }
    }//GEN-LAST:event_cbQLItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbQL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbcoffeeshop;
    // End of variables declaration//GEN-END:variables
}
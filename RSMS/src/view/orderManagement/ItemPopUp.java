/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.orderManagement;

import bean.Item;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import service.InventoryService;
import util.Utility.JUtility;


public class ItemPopUp extends javax.swing.JFrame {

    /**
     * Creates new form CustomerPopUp
     * 
     */
    private ItemResponse itemResponse;
    private static ItemResponse staticItemResponse;
    private Item selectedItem = new Item();

    /**
     * Creates new form CustomerPopUp
     */
    public interface ItemResponse{
        void getRespose(Item responseitem);
    }
    public ItemPopUp(ItemResponse itemResponse) {
        staticItemResponse = itemResponse;
        this.itemResponse = itemResponse;
        initComponents();
        setDefaultsValues();
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
        clearButton = new javax.swing.JButton();
        selectItemButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        itemIDLabel = new javax.swing.JLabel();
        itemNameLabel = new javax.swing.JLabel();
        itemPriceLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        qtySpinner = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        clearButton.setBackground(new java.awt.Color(102, 102, 102));
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("CLEAR");
        clearButton.setBorder(null);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFields(evt);
            }
        });

        selectItemButton.setBackground(new java.awt.Color(255, 204, 0));
        selectItemButton.setForeground(new java.awt.Color(51, 51, 51));
        selectItemButton.setText("SELECT ITEM");
        selectItemButton.setBorder(null);
        selectItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectItem(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Select Item");

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Available Quantity", "Price"
            }
        ));
        itemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setSelectedItemToTextFields(evt);
            }
        });
        jScrollPane1.setViewportView(itemTable);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Item Name :");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Item ID :");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Unit Price :");

        itemIDLabel.setForeground(new java.awt.Color(102, 102, 102));

        itemNameLabel.setForeground(new java.awt.Color(102, 102, 102));

        itemPriceLabel.setForeground(new java.awt.Color(102, 102, 102));

        cancelButton.setBackground(new java.awt.Color(255, 51, 0));
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("CANCEL");
        cancelButton.setBorder(null);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        searchTextField.setText("Search");
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchTable(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Quantity :");

        qtySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(selectItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchTextField)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(itemIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(itemNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(itemPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qtySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemIDLabel)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(itemNameLabel))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(itemPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(qtySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectItem
        // TODO add your handling code here:
        if(itemIDLabel.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Please Select a Item");
        }else{
            selectItemAction(this.itemResponse);
            //super.dispose();
        }
        
    }//GEN-LAST:event_selectItem

    private void clearFields(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFields
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_clearFields

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void setSelectedItemToTextFields(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setSelectedItemToTextFields
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel)itemTable.getModel();
        int modelRow = itemTable.getSelectedRow();
        int selectedRow = itemTable.convertRowIndexToModel(modelRow);
        
        selectedItem.setiID(tableModel.getValueAt(selectedRow, 0).toString());
        selectedItem.setiQuantity(Integer.valueOf(tableModel.getValueAt(selectedRow, 2).toString()));
        
        itemIDLabel.setText(tableModel.getValueAt(selectedRow, 0).toString());
        itemNameLabel.setText(tableModel.getValueAt(selectedRow, 1).toString());
        
        itemPriceLabel.setText(String.valueOf(JUtility.numberDisplayWithCommasAndDecimalPlaces(Double.valueOf(tableModel.getValueAt(selectedRow, 3).toString()))));
    }//GEN-LAST:event_setSelectedItemToTextFields

    private void SearchTable(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTable
        // TODO add your handling code here:
        searchFieldData(searchTextField.getText().toLowerCase());
    }//GEN-LAST:event_SearchTable

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
            java.util.logging.Logger.getLogger(ItemPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemPopUp(staticItemResponse).setVisible(true);
            }
        });
    }
    private void selectItemAction(ItemResponse itemResponse ){
        if((Integer)qtySpinner.getValue() <= selectedItem.getiQuantity()){
            Item item = new Item();
            item.setiID(itemIDLabel.getText());
            item.setiName(itemNameLabel.getText());
            item.setiQuantity((Integer)qtySpinner.getValue());
            item.setiSellingPrice(Double.valueOf(itemPriceLabel.getText().toString()) );

            itemResponse.getRespose(item);
            dispose();
        }else{
             JOptionPane.showMessageDialog(rootPane,"Cannot select quantity More than Availble Amount!");
        }
        
    }
    private void loadTableData() {
        DefaultTableModel tableModel = (DefaultTableModel) itemTable.getModel();
        tableModel.setNumRows(0);
        InventoryService inventoryService = new InventoryService();
        for (Item item : inventoryService.loadInventoryItemsList()) {
            String itemList[] = {String.valueOf(item.getiID()), item.getiName(), String.valueOf(item.getiQuantity()), String.valueOf(item.getiSellingPrice())};
            tableModel.addRow(itemList);
        }
    }
    private void searchFieldData(String filter) {
        if (filter.length() !=0) {
            DefaultTableModel tableModel = (DefaultTableModel) itemTable.getModel();
            TableRowSorter<DefaultTableModel> tableRow = new TableRowSorter<DefaultTableModel>(tableModel);
            itemTable.setRowSorter(tableRow);
            tableRow.setRowFilter(RowFilter.regexFilter(String.valueOf(filter)));
        } else {
            DefaultTableModel tableModel = (DefaultTableModel) itemTable.getModel();
            TableRowSorter<DefaultTableModel> tableRow = new TableRowSorter<DefaultTableModel>(tableModel);
            itemTable.setRowSorter(tableRow);
            tableRow.setRowFilter(RowFilter.regexFilter("(?i)"+filter));
        }

    }
    private void clearFields(){
        itemIDLabel.setText("");
        itemNameLabel.setText("");
        itemPriceLabel.setText("");
    }
     private void setDefaultsValues() {
        loadTableData();
        clearFields();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel itemIDLabel;
    private javax.swing.JLabel itemNameLabel;
    private javax.swing.JLabel itemPriceLabel;
    private javax.swing.JTable itemTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner qtySpinner;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton selectItemButton;
    // End of variables declaration//GEN-END:variables
}

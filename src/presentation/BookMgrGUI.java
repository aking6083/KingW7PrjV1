/*
 * 
 */
package presentation;

import Service.Factory;
import Service.IBookSvc;
import domain.Book;
import java.util.LinkedList;
//import java.util.ListIterator;
//import java.util.Set;

/**
 *
 * @author Adam
 */
public class BookMgrGUI extends javax.swing.JFrame {

    /**
     * Creates new form BookMgrGUI
     */
    public BookMgrGUI() {
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

        LibHeadPnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BkMgrAddBkPnl = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        titleTxtField = new javax.swing.JTextField();
        authorTxtField = new javax.swing.JTextField();
        isbnField = new javax.swing.JTextField();
        statusLbl = new java.awt.TextArea();
        statusLbl2 = new javax.swing.JLabel();
        BkMgrActionPnl = new javax.swing.JPanel();
        AddBookBtn = new javax.swing.JButton();
        ClrFieldsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Kings Library");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Book Manager");

        javax.swing.GroupLayout LibHeadPnlLayout = new javax.swing.GroupLayout(LibHeadPnl);
        LibHeadPnl.setLayout(LibHeadPnlLayout);
        LibHeadPnlLayout.setHorizontalGroup(
            LibHeadPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LibHeadPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        LibHeadPnlLayout.setVerticalGroup(
            LibHeadPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LibHeadPnlLayout.createSequentialGroup()
                .addGroup(LibHeadPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Add Book to Database");

        jLabel4.setText("Title");

        jLabel5.setText("Authors");

        jLabel6.setText("ISBN");

        isbnField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnFieldActionPerformed(evt);
            }
        });

        statusLbl2.setText("Book Status");

        javax.swing.GroupLayout BkMgrAddBkPnlLayout = new javax.swing.GroupLayout(BkMgrAddBkPnl);
        BkMgrAddBkPnl.setLayout(BkMgrAddBkPnlLayout);
        BkMgrAddBkPnlLayout.setHorizontalGroup(
            BkMgrAddBkPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BkMgrAddBkPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BkMgrAddBkPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(BkMgrAddBkPnlLayout.createSequentialGroup()
                        .addGroup(BkMgrAddBkPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BkMgrAddBkPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(isbnField)
                            .addComponent(titleTxtField)
                            .addComponent(authorTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))))
                .addGap(29, 29, 29)
                .addComponent(statusLbl2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BkMgrAddBkPnlLayout.setVerticalGroup(
            BkMgrAddBkPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BkMgrAddBkPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BkMgrAddBkPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(titleTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusLbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BkMgrAddBkPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(authorTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BkMgrAddBkPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(isbnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AddBookBtn.setText("Add");
        AddBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBookBtnActionPerformed(evt);
            }
        });

        ClrFieldsBtn.setText("Clear");

        javax.swing.GroupLayout BkMgrActionPnlLayout = new javax.swing.GroupLayout(BkMgrActionPnl);
        BkMgrActionPnl.setLayout(BkMgrActionPnlLayout);
        BkMgrActionPnlLayout.setHorizontalGroup(
            BkMgrActionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BkMgrActionPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddBookBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClrFieldsBtn))
        );
        BkMgrActionPnlLayout.setVerticalGroup(
            BkMgrActionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BkMgrActionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(AddBookBtn)
                .addComponent(ClrFieldsBtn))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(LibHeadPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BkMgrAddBkPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(BkMgrActionPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LibHeadPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BkMgrAddBkPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BkMgrActionPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBookBtnActionPerformed
        
     
        Factory factory = new Factory();
        IBookSvc bookSvc = factory.getJDBCBookService();
        Book newBook = bookSvc.create(new Book());
        LinkedList<String>bookAuthors = getAuthors();
        //Manger creates the book then adds the book,.
        newBook.setAuthors(bookAuthors);
        newBook.setIsbn(this.isbnField.getText());
        newBook.setTitle(this.titleTxtField.getText());
        
        if (newBook.validate())
        {
            try 
            {
            bookSvc.add(newBook);
            this.statusLbl2.setText(newBook.toString() + "has been written");
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        else
            this.statusLbl2.setText("In-Valid Book Object");
        
        
        
    }//GEN-LAST:event_AddBookBtnActionPerformed

    private LinkedList<String>getAuthors() 
    {
        LinkedList<String> authors = new LinkedList<>();
        String tempStr = authorTxtField.getText();
        String[] arAuthors = tempStr.split(";");
               
        for (int a = 0;a<=arAuthors.length-1;a++)
        try 
        {
            
            authors.add(arAuthors[a]);
        }
        catch (ArrayIndexOutOfBoundsException oob)
        {
             authors.add(tempStr);
        }
       return authors;
    } 
            
            
    public String getBookTitle()
    {
        return this.titleTxtField.getText();
 
    }
    private void isbnFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isbnFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    
    /*public static void main(String[] args)
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookMgrGUI().setVisible(true);
            }
        });
        
    }
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBookBtn;
    private javax.swing.JPanel BkMgrActionPnl;
    private javax.swing.JPanel BkMgrAddBkPnl;
    private javax.swing.JButton ClrFieldsBtn;
    private javax.swing.JPanel LibHeadPnl;
    private javax.swing.JTextField authorTxtField;
    private javax.swing.JTextField isbnField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private java.awt.TextArea statusLbl;
    private javax.swing.JLabel statusLbl2;
    private javax.swing.JTextField titleTxtField;
    // End of variables declaration//GEN-END:variables
}

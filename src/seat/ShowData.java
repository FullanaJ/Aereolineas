/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seat;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import static seat.main.flight;

/**
 *
 * @author Dell
 */
public class ShowData extends javax.swing.JFrame {

    /**
     * Creates new form ShowData
     */
    DefaultTableModel model;

    public ShowData() {
        setIcon();
        initComponents();
        seatMapShowAvailable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FlightNo = new javax.swing.JLabel();
        FlightNoHeader = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        WelcomeText = new javax.swing.JLabel();
        MainLogo4 = new javax.swing.JLabel();
        MainLogo5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        CloseButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        OwnerName1 = new javax.swing.JLabel();
        DepartHeader3 = new javax.swing.JLabel();
        AvailableText1 = new javax.swing.JLabel();
        AvailableTextShow = new javax.swing.JLabel();
        ReservedTextShow = new javax.swing.JLabel();
        ReservedText3 = new javax.swing.JLabel();
        AvailableText2 = new javax.swing.JLabel();
        AvailableTextShow1 = new javax.swing.JLabel();

        FlightNo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FlightNo.setForeground(new java.awt.Color(207, 0, 15));
        FlightNo.setText("FD 3419");

        FlightNoHeader.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader.setForeground(new java.awt.Color(0, 0, 0));
        FlightNoHeader.setText("FLIGHT NO.");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Decibel Airlines Reservation System");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(207, 0, 15));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WelcomeText.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        WelcomeText.setForeground(new java.awt.Color(255, 255, 255));
        Header.add(WelcomeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 20, 40));

        MainLogo4.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        MainLogo4.setForeground(new java.awt.Color(255, 255, 255));
        MainLogo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seat/HeaderMainSlogan.png"))); // NOI18N
        Header.add(MainLogo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 170, 100));

        MainLogo5.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        MainLogo5.setForeground(new java.awt.Color(255, 255, 255));
        MainLogo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seat/HeaderMainLogoTextNew.png"))); // NOI18N
        Header.add(MainLogo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 190, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CloseButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CloseButton.setText("BACK");
        CloseButton.setFocusPainted(false);
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 600, 230, 50));

        Table.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seat", "First Name", "Last Name", "Passport No."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setRowHeight(30);
        Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setResizable(false);
            Table.getColumnModel().getColumn(1).setResizable(false);
            Table.getColumnModel().getColumn(2).setResizable(false);
            Table.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 830, 470));

        OwnerName1.setBackground(new java.awt.Color(204, 204, 204));
        OwnerName1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        OwnerName1.setForeground(new java.awt.Color(102, 102, 102));
        OwnerName1.setText("© 2018 Decibel Airlines.");
        jPanel2.add(OwnerName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 210, -1));

        DepartHeader3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        DepartHeader3.setForeground(new java.awt.Color(0, 0, 0));
        DepartHeader3.setText("Flight Summary");
        jPanel2.add(DepartHeader3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 420, 50));

        AvailableText1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        AvailableText1.setForeground(new java.awt.Color(102, 102, 102));
        AvailableText1.setText("AVAILABLE");
        jPanel2.add(AvailableText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 90, 30));

        AvailableTextShow.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        AvailableTextShow.setForeground(new java.awt.Color(0, 0, 0));
        AvailableTextShow.setText("XX");
        jPanel2.add(AvailableTextShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 50, -1));

        ReservedTextShow.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ReservedTextShow.setForeground(new java.awt.Color(0, 0, 0));
        ReservedTextShow.setText("YY");
        jPanel2.add(ReservedTextShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 50, -1));

        ReservedText3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ReservedText3.setForeground(new java.awt.Color(102, 102, 102));
        ReservedText3.setText("BOOKED");
        jPanel2.add(ReservedText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 80, 30));

        AvailableText2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        AvailableText2.setForeground(new java.awt.Color(102, 102, 102));
        AvailableText2.setText("FLIGHT");
        jPanel2.add(AvailableText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 90, 30));

        AvailableTextShow1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        AvailableTextShow1.setForeground(new java.awt.Color(0, 0, 0));
        AvailableTextShow1.setText("QF8");
        jPanel2.add(AvailableTextShow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 50, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 910, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        this.setVisible(false);
        new main().setVisible(true);
    }//GEN-LAST:event_CloseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ShowData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvailableText1;
    private javax.swing.JLabel AvailableText2;
    private javax.swing.JLabel AvailableTextShow;
    private javax.swing.JLabel AvailableTextShow1;
    private javax.swing.JButton CloseButton;
    private javax.swing.JLabel DepartHeader3;
    private javax.swing.JLabel FlightNo;
    private javax.swing.JLabel FlightNoHeader;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel MainLogo4;
    private javax.swing.JLabel MainLogo5;
    private javax.swing.JLabel OwnerName1;
    private javax.swing.JLabel ReservedText3;
    private javax.swing.JLabel ReservedTextShow;
    private javax.swing.JTable Table;
    private javax.swing.JLabel WelcomeText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("appIcon.png")));
    }

    private void seatMapShowAvailable() {
        String availableSeat = Integer.toString(flight.countAvailable());
        String bookedSeat = Integer.toString(42 - flight.countAvailable());
        AvailableTextShow.setText(availableSeat);
        ReservedTextShow.setText(bookedSeat);

        model = (DefaultTableModel) Table.getModel();

        ArrayList<String> seatMap = new ArrayList<String>();
        for (char alph = 'A'; alph <= 'F'; alph++) {
            for (int j = 1; j <= 7; j++) {
                String position = alph + "" + j;
                seatMap.add(position);
            } // create String A1, A2, A3 for passing value
        }

        for (int j = 0; j <= 41; j++) { //Add only booked seat data to JTable
            Vector v = new Vector();
            if (flight.getSeatStatus(seatMap.get(j)) == false) {
                v.add(flight.getSeatSeatNo(seatMap.get(j)));
                v.add(flight.getSeatFirstName(seatMap.get(j)));
                v.add(flight.getSeatLastName(seatMap.get(j)));
                v.add(flight.getSeatPassportNo(seatMap.get(j)));
                model.addRow(v);
            } else;
        }
    }
}

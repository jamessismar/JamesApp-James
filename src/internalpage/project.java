package internalpage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import myApp.dashboardpage;
import java.awt.Color;
import internalpage.*;
import myApp.dashboardpage.*;
/**
 *
 * @author James
 */
public class project extends javax.swing.JFrame {

    /**
     * Creates new form project
     */
    public project() {
        initComponents();
    }
     Color navcolor = new Color(102,204,255);
     Color headcolor = new Color(0,255,153);
     Color bodycolor = new Color(102,255,102);
     Color trycolor = new Color(204,204,204);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        userpage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dashpane = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        reportpane = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        account = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        settings = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        maindesktop = new javax.swing.JDesktopPane();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        navbar.setBackground(new java.awt.Color(102, 204, 255));
        navbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navbarMouseEntered(evt);
            }
        });
        navbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userpage.setBackground(new java.awt.Color(102, 204, 255));
        userpage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userpageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userpageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userpageMouseExited(evt);
            }
        });
        userpage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("    USERPAGE");
        userpage.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 20));

        navbar.add(userpage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 130, 40));

        dashpane.setBackground(new java.awt.Color(102, 204, 255));
        dashpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpaneMouseExited(evt);
            }
        });
        dashpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("   DASHBOARD");
        dashpane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 20));

        navbar.add(dashpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 130, 40));

        reportpane.setBackground(new java.awt.Color(102, 204, 255));
        reportpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportpaneMouseExited(evt);
            }
        });
        reportpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("      REPORT");
        reportpane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        account.setBackground(new java.awt.Color(102, 204, 255));
        account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountMouseExited(evt);
            }
        });
        account.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("      REPORT");
        account.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        reportpane.add(account, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 130, 40));

        navbar.add(reportpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 130, 40));

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ACCOUNT");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, 20));

        navbar.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 110, 40));

        jPanel1.add(navbar);
        navbar.setBounds(0, 0, 130, 420);

        header.setBackground(new java.awt.Color(0, 255, 153));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        settings.setBackground(new java.awt.Color(102, 204, 255));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsMouseExited(evt);
            }
        });
        settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/settings5.png"))); // NOI18N
        settings.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        header.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 50, 50));

        jPanel1.add(header);
        header.setBounds(130, 0, 630, 50);

        maindesktop.setBackground(new java.awt.Color(102, 255, 102));
        maindesktop.setPreferredSize(new java.awt.Dimension(760, 420));

        javax.swing.GroupLayout maindesktopLayout = new javax.swing.GroupLayout(maindesktop);
        maindesktop.setLayout(maindesktopLayout);
        maindesktopLayout.setHorizontalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        maindesktopLayout.setVerticalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        jPanel1.add(maindesktop);
        maindesktop.setBounds(130, 50, 630, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userpageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpageMouseExited
        userpage.setBackground(navcolor);
    }//GEN-LAST:event_userpageMouseExited

    private void userpageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpageMouseEntered
    userpage.setBackground(bodycolor);
    }//GEN-LAST:event_userpageMouseEntered

    private void dashpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseEntered
      dashpane.setBackground(bodycolor);
    }//GEN-LAST:event_dashpaneMouseEntered

    private void dashpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseExited
        dashpane.setBackground(navcolor);
    }//GEN-LAST:event_dashpaneMouseExited

    private void reportpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportpaneMouseEntered
        reportpane.setBackground(bodycolor);
    }//GEN-LAST:event_reportpaneMouseEntered

    private void reportpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportpaneMouseExited
        reportpane.setBackground(navcolor);
    }//GEN-LAST:event_reportpaneMouseExited

    private void userpageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpageMouseClicked
     userpage up = new userpage (); 
     maindesktop.add(up).setVisible(true);
     
    }//GEN-LAST:event_userpageMouseClicked

    private void dashpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseClicked
       dashboardpage dbp = new dashboardpage();
     maindesktop.add(dbp).setVisible(true);
    }//GEN-LAST:event_dashpaneMouseClicked

    private void navbarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navbarMouseEntered
        
    }//GEN-LAST:event_navbarMouseEntered

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
        settings.setBackground(bodycolor);
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
        settings.setBackground(navcolor);
    }//GEN-LAST:event_settingsMouseExited

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        settingpage set = new settingpage();
        maindesktop.add(set).setVisible(true);
    }//GEN-LAST:event_settingsMouseClicked

    private void accountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_accountMouseEntered

    private void accountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_accountMouseExited

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
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new project().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel account;
    private javax.swing.JPanel dashpane;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JDesktopPane maindesktop;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel reportpane;
    private javax.swing.JPanel settings;
    private javax.swing.JPanel userpage;
    // End of variables declaration//GEN-END:variables
}
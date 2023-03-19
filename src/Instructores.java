
import java.sql.*;
import javax.swing.JOptionPane;

public class Instructores extends javax.swing.JFrame {

    private static Connection con = null;
    
    public Instructores() {
        initComponents();
        setTitle("Instructores");
        setLocationRelativeTo(null);
        setResizable(false);
        llenarComboTipo();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfTelefono = new javax.swing.JTextField();
        tfApellidos = new javax.swing.JTextField();
        cbTipo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tfCedula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton3.setText("Eliminar");

        jLabel6.setText("Email");

        jLabel5.setText("Tipo");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Telefono");

        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });

        tfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefonoActionPerformed(evt);
            }
        });

        tfApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellidosActionPerformed(evt);
            }
        });

        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Cedula");

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/martial-arts_32.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(tfCedula))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfEmail)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTelefono)
                                    .addComponent(jLabel4))
                                .addGap(96, 96, 96))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel7)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(85, 85, 85))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefonoActionPerformed

    private void tfApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApellidosActionPerformed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        conectar(); 
        Statement sentencia;
        String ced, nom, correo, apell, telef, Tipo = "";
        if (verificarVacios() == true) {
            JOptionPane.showMessageDialog(null, "Hay campos vacíos, revise.", "Campos vacíos", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                ced = tfCedula.getText();
                if (buscarRepetido("instructores", ced) == true) {
                    JOptionPane.showMessageDialog(null, "Registro ya existe", "Registro ya existe", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    nom = tfNombre.getText();
                    correo = tfEmail.getText();
                    apell = tfApellidos.getText();
                    Tipo = cbTipo.getSelectedItem().toString();
                    telef = tfTelefono.getText();
                    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/dbproyecto", "root", "");
                    Statement stat = conexion.createStatement();
                    Ingresando();
                    sentencia = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    sentencia.executeUpdate("INSERT INTO instructores (cedula, email, nombre, apellidos, tipo, telefono)"
                            + "VALUES('" + ced + "','" + correo + "','" + nom + "','" + apell + "','" + Tipo + "','" + telef + "')");
                    JOptionPane.showMessageDialog(null, "Registro agregado con exito!!", "Registro agregado", JOptionPane.INFORMATION_MESSAGE);
                    Limpiar();
                    con.close();
                }
            } catch (NumberFormatException | SQLException ex) {
                JOptionPane.showMessageDialog(null,
                        "Error al insertar" + ex.getMessage(), "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        Limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void conectar() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbproyecto", "root", "");
            JOptionPane.showMessageDialog(null, "Conectado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la conexión." + ex.getMessage());
        }
    }
    
    public static void Ingresando() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbproyecto", "root", "");
            JOptionPane.showMessageDialog(null, "Ingresando los datos a la Base de Datos!", "Por Favor espere un momento!!", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la conexión." + ex.getMessage());
        }
    }
    
    public boolean verificarVacios() {//Este método verifica si hay controles vacíos 
        if ((tfCedula.getText().equals("")) || (tfEmail.getText().equals(""))
                || (tfNombre.getText().equals("")) || (tfApellidos.getText().equals("")) || (tfTelefono.getText().equals(""))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean buscarRepetido(String tabla, String id) { //Este método verifica si el registro que se desea ingresar ya existe
        int cont = 0;
        boolean existe = false;
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/dbproyecto", "root", "");
            Statement s = conexion.createStatement();
            ResultSet rs = s.executeQuery(
                    "select * from clientes where cedula='" + tfCedula + "'"); //El ResultSet guarda lo que devuelve la consulta
            while (rs.next()) { //Esta sentencia significa mientras el ResultSet tenga datos para leer
                if (id.equals(rs.getString(1))) { //Mediante el método get(Tipo de Dato) leemos cada uno de los datos del ResultSet
                    cont++; //Almacena la cantidad de datos que se guardaron en el ResultSet
                }
            }
            if (cont > 0) { //Si el contador almacenó al menos un valor, signfica que el dato que se desea ingresar, ya existe
                existe = true;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Error " + ex.getMessage(), "Error",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return existe;
    }
    
    public void Limpiar(){
        tfCedula.setText("");
        tfNombre.setText("");
        tfApellidos.setText("");
        tfEmail.setText("");
        tfTelefono.setText("");
        cbTipo.setSelectedIndex(0);
        
    }
    
    public void llenarComboTipo(){
        cbTipo.addItem("Karate");
        cbTipo.addItem("Jiu Jitsu");
        cbTipo.addItem("Box");
        cbTipo.addItem("Pesas");
        cbTipo.setSelectedIndex(0);
    }
    
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
            java.util.logging.Logger.getLogger(Instructores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Instructores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Instructores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Instructores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instructores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfCedula;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}

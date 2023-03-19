import java.sql.*;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Citas extends javax.swing.JFrame {

    private static Connection con = null;

    public Citas() {
        initComponents();
        setTitle("Agendar Citas");
        setLocationRelativeTo(null);
        setResizable(false);
        llenarComboActividad();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        tfNombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfApellidos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        cbActividad = new javax.swing.JComboBox<>();
        tfCedula = new javax.swing.JTextField();
        rbHorarioA = new javax.swing.JRadioButton();
        rbHorarioB = new javax.swing.JRadioButton();
        rbHorarioC = new javax.swing.JRadioButton();
        dateCalendar = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel1.setText("Actividad");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Cedula");

        jLabel3.setText("Apellidos");

        tfApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellidosActionPerformed(evt);
            }
        });

        jLabel8.setText("Nombre");

        cbActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActividadActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbHorarioA);
        rbHorarioA.setText("Horario A");

        buttonGroup1.add(rbHorarioB);
        rbHorarioB.setText("Horario B");

        buttonGroup1.add(rbHorarioC);
        rbHorarioC.setText("Horario C");

        jLabel4.setText("Fecha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbActividad, 0, 110, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(tfCedula))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(dateCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbHorarioC, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rbHorarioA)
                                .addComponent(rbHorarioB))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(rbHorarioA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbHorarioB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbHorarioC)))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnCancelar))
                .addGap(34, 34, 34)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApellidosActionPerformed

    private void cbActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbActividadActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int year = dateCalendar.getCalendar().get(Calendar.YEAR);
        int mes = dateCalendar.getCalendar().get(Calendar.MONTH);
        int dia = dateCalendar.getCalendar().get(Calendar.DAY_OF_MONTH);
        String fechaCita = "" + year + "-" + mes + "-" + dia;

        conectar();
        Statement sentencia;
        String ced, nom, apell, horario = null, telef, actividad = "";
        if (verificarVacios() == true) {
            JOptionPane.showMessageDialog(null, "Hay campos vacíos, revise.", "Campos vacíos", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                ced = tfCedula.getText();
                if (buscarRepetido("clientes", ced) == true) {
                    JOptionPane.showMessageDialog(null, "Registro ya existe", "Registro ya existe", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    nom = tfNombre.getText();
                    apell = tfApellidos.getText();
                    apell = tfApellidos.getText();
                    actividad = cbActividad.getSelectedItem().toString();
                    if (rbHorarioA.isSelected()) {
                        horario = "A";
                    } else if (rbHorarioB.isSelected()) {
                        horario = "B";
                    } else if (rbHorarioC.isSelected()) {
                        horario = "C";
                    }
                    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/dbproyecto", "root", "");
                    Statement stat = conexion.createStatement();
                    Ingresando();
                    sentencia = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    sentencia.executeUpdate("INSERT INTO citas(cedula, nombre, apellidos, actividad, horario, fecha)"
                            + "VALUES('" + ced + "','" + nom + "','" + apell + "','" + actividad + "','" + horario + "','" + fechaCita + "')");
                    JOptionPane.showMessageDialog(null, "Registro agregado con exito!!", "Registro agregado", JOptionPane.INFORMATION_MESSAGE);
                    Limpiar();
                    con.close();
                }
            } catch (NumberFormatException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al insertar" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        Limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed

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

    public boolean verificarVacios() {//Este método verifica si hay controles vacíos 
        if ((tfCedula.getText().equals("")) || (tfNombre.getText().equals("")) || (tfApellidos.getText().equals(""))) {
            return true;
        } else {
            return false;
        }
    }

    public void Limpiar() {
        tfCedula.setText("");
        rbHorarioA.setSelected(true);
        rbHorarioB.setSelected(false);
        rbHorarioC.setSelected(false);
        tfNombre.setText("");
        tfApellidos.setText("");
        cbActividad.setSelectedIndex(0);
        dateCalendar.getCalendar().get(Calendar.DATE);

    }

    public void llenarComboActividad() {
        cbActividad.addItem("Karate");
        cbActividad.addItem("Jiu Jitsu");
        cbActividad.addItem("Box");
        cbActividad.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Citas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbActividad;
    private com.toedter.calendar.JDateChooser dateCalendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton rbHorarioA;
    private javax.swing.JRadioButton rbHorarioB;
    private javax.swing.JRadioButton rbHorarioC;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfCedula;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}

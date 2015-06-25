package sistemahospitalario;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame 
{
    ImageIcon Pregunta=new ImageIcon(this.getClass().getResource("/Imagenes/pre2.png"));
    
    //CONSTRUCTOR
    public MenuPrincipal() 
    {
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Menú Principal");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Acceso.png")).getImage());//PONER IMAGEN ICONO
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        lblimafondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmgestiones = new javax.swing.JMenu();
        jmipacientes = new javax.swing.JMenuItem();
        jmipermedico = new javax.swing.JMenuItem();
        jmifarmaceutas = new javax.swing.JMenuItem();
        jmitipomenu = new javax.swing.JMenuItem();
        jmiunidades = new javax.swing.JMenuItem();
        jmihabitacion = new javax.swing.JMenuItem();
        jmiconsultorios = new javax.swing.JMenuItem();
        jmihorarios = new javax.swing.JMenuItem();
        jmizona = new javax.swing.JMenuItem();
        jmtransacciones = new javax.swing.JMenu();
        jmientrada = new javax.swing.JMenuItem();
        jmifactupaci = new javax.swing.JMenuItem();
        jmifactufarma = new javax.swing.JMenuItem();
        jmimovimientos = new javax.swing.JMenuItem();
        jmihistoria = new javax.swing.JMenuItem();
        jmidiagnostico = new javax.swing.JMenuItem();
        jmihospitalizacion = new javax.swing.JMenuItem();
        jmidietas = new javax.swing.JMenuItem();
        jmiasignahora = new javax.swing.JMenuItem();
        jmsalidas = new javax.swing.JMenu();
        jmiconsuhorario = new javax.swing.JMenuItem();
        jmiconsuhabitación = new javax.swing.JMenuItem();
        jmiconsudieta = new javax.swing.JMenuItem();
        jmiconsucontra = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiInfoIngre = new javax.swing.JMenuItem();
        jmiInfoPersonal = new javax.swing.JMenuItem();
        jmherramientas = new javax.swing.JMenu();
        jmicopia = new javax.swing.JMenuItem();
        jmiusuarios = new javax.swing.JMenuItem();
        jmiperfiles = new javax.swing.JMenuItem();
        jmayuda = new javax.swing.JMenu();
        jmimanual = new javax.swing.JMenuItem();
        jmiacerca = new javax.swing.JMenuItem();
        jmsalir = new javax.swing.JMenu();
        jmisalir = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem8.setText("jMenuItem8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblimafondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.jpg"))); // NOI18N

        jmgestiones.setMnemonic('G');
        jmgestiones.setText("Gestiones");
        jmgestiones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmgestiones.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jmipacientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jmipacientes.setText("Pacientes");
        jmgestiones.add(jmipacientes);

        jmipermedico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jmipermedico.setText("Personal Médico");
        jmipermedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmipermedicoActionPerformed(evt);
            }
        });
        jmgestiones.add(jmipermedico);

        jmifarmaceutas.setText("Farmaceutas");
        jmgestiones.add(jmifarmaceutas);

        jmitipomenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jmitipomenu.setText("Tipo Menú");
        jmgestiones.add(jmitipomenu);

        jmiunidades.setText("Unidades Funcionales");
        jmgestiones.add(jmiunidades);

        jmihabitacion.setText("Habitación");
        jmgestiones.add(jmihabitacion);

        jmiconsultorios.setText("Consultarios");
        jmgestiones.add(jmiconsultorios);

        jmihorarios.setText("Horarios");
        jmgestiones.add(jmihorarios);

        jmizona.setText("Zona de Reparto");
        jmgestiones.add(jmizona);

        jMenuBar1.add(jmgestiones);

        jmtransacciones.setMnemonic('T');
        jmtransacciones.setText("Transacciones");
        jmtransacciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmtransacciones.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jmientrada.setText("Entrada y Salida de Pacientes");
        jmtransacciones.add(jmientrada);

        jmifactupaci.setText("Facturación Pacientes");
        jmtransacciones.add(jmifactupaci);

        jmifactufarma.setText("Facturación Farmacia");
        jmtransacciones.add(jmifactufarma);

        jmimovimientos.setText("Movimientos Inventrario");
        jmtransacciones.add(jmimovimientos);

        jmihistoria.setText("Historia Clínica");
        jmtransacciones.add(jmihistoria);

        jmidiagnostico.setText("Diagnóstico Paciente ");
        jmtransacciones.add(jmidiagnostico);

        jmihospitalizacion.setText("Hospitalización");
        jmtransacciones.add(jmihospitalizacion);

        jmidietas.setText("Dietas y Preparación");
        jmtransacciones.add(jmidietas);

        jmiasignahora.setText("Asignación de Horarios");
        jmtransacciones.add(jmiasignahora);

        jMenuBar1.add(jmtransacciones);

        jmsalidas.setMnemonic('S');
        jmsalidas.setText("Salidas");
        jmsalidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmsalidas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jmiconsuhorario.setText("Consulta Horario Laboral");
        jmsalidas.add(jmiconsuhorario);

        jmiconsuhabitación.setText("Consulta Habitación Paciente");
        jmsalidas.add(jmiconsuhabitación);

        jmiconsudieta.setText("Consulta Dieta y Preparación");
        jmsalidas.add(jmiconsudieta);

        jmiconsucontra.setText("Consulta Contraindicaciones de Medicamentos");
        jmsalidas.add(jmiconsucontra);
        jmsalidas.add(jSeparator1);

        jmiInfoIngre.setText("Informe Ingresos Económicos");
        jmsalidas.add(jmiInfoIngre);

        jmiInfoPersonal.setText("Informe Personal Médico");
        jmsalidas.add(jmiInfoPersonal);

        jMenuBar1.add(jmsalidas);

        jmherramientas.setMnemonic('H');
        jmherramientas.setText("Herramientas");
        jmherramientas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmherramientas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jmicopia.setText("Copia de Seguridad");
        jmherramientas.add(jmicopia);

        jmiusuarios.setText("Usuarios");
        jmherramientas.add(jmiusuarios);

        jmiperfiles.setText("Perfiles");
        jmherramientas.add(jmiperfiles);

        jMenuBar1.add(jmherramientas);

        jmayuda.setMnemonic('A');
        jmayuda.setText("Ayuda");
        jmayuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmayuda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jmimanual.setText("Manual de Usuario");
        jmayuda.add(jmimanual);

        jmiacerca.setText("Acerca de");
        jmayuda.add(jmiacerca);

        jMenuBar1.add(jmayuda);

        jmsalir.setText("Salir");
        jmsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmsalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jmisalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmisalir.setText("Salida Segura");
        jmisalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmisalirActionPerformed(evt);
            }
        });
        jmsalir.add(jmisalir);

        jMenuBar1.add(jmsalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimafondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimafondo, javax.swing.GroupLayout.PREFERRED_SIZE, 268, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmisalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmisalirActionPerformed
        Salir();
    }//GEN-LAST:event_jmisalirActionPerformed
    private void jmipermedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmipermedicoActionPerformed
        Personal_Medico obj=new Personal_Medico();
        obj.setVisible(true);
    }//GEN-LAST:event_jmipermedicoActionPerformed
    //MÉTODO PARA SALIR
    public void Salir()
    {
        String Mensaje="¿Desea Salir de Menú Principal?";
        String Titulo="Salir";
        int Respuesta=JOptionPane.showConfirmDialog(null,Mensaje,Titulo,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,Pregunta);
        if(Respuesta==JOptionPane.YES_OPTION)
        {
            Login obj=new Login();
            obj.setVisible(true);
            dispose();
        }
    }
    
    //MÉTODO MAIN
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu jmayuda;
    private javax.swing.JMenu jmgestiones;
    private javax.swing.JMenu jmherramientas;
    private javax.swing.JMenuItem jmiInfoIngre;
    private javax.swing.JMenuItem jmiInfoPersonal;
    private javax.swing.JMenuItem jmiacerca;
    private javax.swing.JMenuItem jmiasignahora;
    private javax.swing.JMenuItem jmiconsucontra;
    private javax.swing.JMenuItem jmiconsudieta;
    private javax.swing.JMenuItem jmiconsuhabitación;
    private javax.swing.JMenuItem jmiconsuhorario;
    private javax.swing.JMenuItem jmiconsultorios;
    private javax.swing.JMenuItem jmicopia;
    private javax.swing.JMenuItem jmidiagnostico;
    private javax.swing.JMenuItem jmidietas;
    private javax.swing.JMenuItem jmientrada;
    private javax.swing.JMenuItem jmifactufarma;
    private javax.swing.JMenuItem jmifactupaci;
    private javax.swing.JMenuItem jmifarmaceutas;
    private javax.swing.JMenuItem jmihabitacion;
    private javax.swing.JMenuItem jmihistoria;
    private javax.swing.JMenuItem jmihorarios;
    private javax.swing.JMenuItem jmihospitalizacion;
    private javax.swing.JMenuItem jmimanual;
    private javax.swing.JMenuItem jmimovimientos;
    private javax.swing.JMenuItem jmipacientes;
    private javax.swing.JMenuItem jmiperfiles;
    private javax.swing.JMenuItem jmipermedico;
    private javax.swing.JMenuItem jmisalir;
    private javax.swing.JMenuItem jmitipomenu;
    private javax.swing.JMenuItem jmiunidades;
    private javax.swing.JMenuItem jmiusuarios;
    private javax.swing.JMenuItem jmizona;
    private javax.swing.JMenu jmsalidas;
    private javax.swing.JMenu jmsalir;
    private javax.swing.JMenu jmtransacciones;
    private javax.swing.JLabel lblimafondo;
    // End of variables declaration//GEN-END:variables
}

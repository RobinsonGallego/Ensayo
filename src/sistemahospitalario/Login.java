package sistemahospitalario;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame 
{
    ImageIcon Error=new ImageIcon(this.getClass().getResource("/Imagenes/error2.png"));
    ImageIcon Info=new ImageIcon(this.getClass().getResource("/Imagenes/info1a.png"));
    ImageIcon Bienv=new ImageIcon(this.getClass().getResource("/Imagenes/Connected2.png"));
    ImageIcon Pregunta=new ImageIcon(this.getClass().getResource("/Imagenes/pre2.png"));
    //CONSTRUCTOR
    public Login() 
    {
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Ingreso Sistema Hospitalario");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Acceso.png")).getImage());//PONER IMAGEN ICONO
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon Icono=new ImageIcon(this.getClass().getResource("/Imagenes/sistema hospitalario.jpg"));
        JLabel fondo=new JLabel();
        fondo.setIcon(Icono);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(270,0,Icono.getIconWidth(),Icono.getIconHeight());
        Letras(txtusuario);
        Minusculas(txtusuario);
        //LIMITO EL TEXTFIELD PARA QUE SOLO LEA UN DETERMINADO NÚMERO DE CARACTERES
        txtusuario.addKeyListener(new KeyListener()
        {
            @Override
            public void keyTyped(KeyEvent KE)
            {
                if(txtusuario.getText().length()==12)
                {
                    getToolkit().beep();//SONIDO CUANDO NO LEE LA ACCIÓN DEL TECLADO
                    KE.consume();//ANULA EVENTOS DEL TECLADO
                }
            }

            @Override
            public void keyPressed(KeyEvent KE) {}
            @Override
            public void keyReleased(KeyEvent KE) {}
        });
        Numeros_Minusculas(jpcontra);
        //LIMITO EL TEXTFIELD PARA QUE SOLO LEA UN DETERMINADO NÚMERO DE CARACTERES
        jpcontra.addKeyListener(new KeyListener()
        {
            @Override
            public void keyTyped(KeyEvent KE)
            {
                if(jpcontra.getText().length()==10)
                {
                    getToolkit().beep();//SONIDO CUANDO NO LEE LA ACCIÓN DEL TECLADO
                    KE.consume();//ANULA EVENTOS DEL TECLADO
                }
            }

            @Override
            public void keyPressed(KeyEvent KE) {}
            @Override
            public void keyReleased(KeyEvent KE) {}
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelingreso = new javax.swing.JPanel();
        lblusuario = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        lblcontra = new javax.swing.JLabel();
        jpcontra = new javax.swing.JPasswordField();
        btnentrar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panelingreso.setBackground(new java.awt.Color(255, 255, 255));
        panelingreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        panelingreso.setName(""); // NOI18N

        lblusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        lblusuario.setText("Usuario");

        txtusuario.setPreferredSize(new java.awt.Dimension(6, 25));
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuarioKeyTyped(evt);
            }
        });

        lblcontra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contraseña.png"))); // NOI18N
        lblcontra.setText("Contraseña");

        jpcontra.setPreferredSize(new java.awt.Dimension(6, 25));
        jpcontra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpcontraKeyTyped(evt);
            }
        });

        btnentrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/acontecimiento2.png"))); // NOI18N
        btnentrar.setMnemonic('E');
        btnentrar.setText("Entrar");
        btnentrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentrarActionPerformed(evt);
            }
        });
        btnentrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnentrarKeyTyped(evt);
            }
        });

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SALIR.PNG"))); // NOI18N
        btnsalir.setMnemonic('S');
        btnsalir.setText("Salir");
        btnsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        btnsalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnsalirKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelingresoLayout = new javax.swing.GroupLayout(panelingreso);
        panelingreso.setLayout(panelingresoLayout);
        panelingresoLayout.setHorizontalGroup(
            panelingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelingresoLayout.createSequentialGroup()
                .addGroup(panelingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelingresoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelingresoLayout.createSequentialGroup()
                                .addComponent(lblcontra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jpcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelingresoLayout.createSequentialGroup()
                                .addComponent(lblusuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelingresoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnentrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsalir)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panelingresoLayout.setVerticalGroup(
            panelingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelingresoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblusuario)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcontra)
                    .addComponent(jpcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnentrar)
                    .addComponent(btnsalir))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelingreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentrarActionPerformed
        Entrar();
    }//GEN-LAST:event_btnentrarActionPerformed
    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        Salir();
    }//GEN-LAST:event_btnsalirActionPerformed
    private void txtusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtusuario)
        {
            if(Contador==10)
            {
                jpcontra.requestFocus();
            }
        }
    }//GEN-LAST:event_txtusuarioKeyTyped
    private void jpcontraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpcontraKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==jpcontra)
        {
            if(Contador==10)
            {
                btnentrar.requestFocus();
            }
        }
    }//GEN-LAST:event_jpcontraKeyTyped
    private void btnentrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnentrarKeyTyped
        Entrar();
    }//GEN-LAST:event_btnentrarKeyTyped
    private void btnsalirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnsalirKeyTyped
        Salir();
    }//GEN-LAST:event_btnsalirKeyTyped
     //MÉTODO PARA INGRESAR
    public void Entrar()
    {
        if(String.valueOf(txtusuario.getText()).compareTo("")==0)
        {
            JOptionPane.showMessageDialog(this,"Debe ingresar un Usuario","Mensaje",JOptionPane.INFORMATION_MESSAGE,Info);
            txtusuario.requestFocus();
        }
        else
        {
            if(String.valueOf(jpcontra.getPassword()).compareTo("")==0)
            {
                JOptionPane.showMessageDialog(this,"Debe ingresar una Contraseña","Mensaje",JOptionPane.INFORMATION_MESSAGE,Info);
                jpcontra.requestFocus();
            }
            else
            {
                if(String.valueOf(txtusuario.getText()).compareTo("robinson")==0&&String.valueOf(jpcontra.getPassword()).compareTo("1017137664")==0)
                {
                    JOptionPane.showMessageDialog(this,"Bienvenido al Sistema Hospitalario","Ingreso",JOptionPane.INFORMATION_MESSAGE,Bienv);
                    MenuPrincipal obj=new MenuPrincipal();
                    obj.setVisible(true);//ABRIMOS LA NUEVA VENTANA
                    dispose();//OCULTAMOS ESTE JFRAME
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Usuario y/o Contraseña Incorrectos","Error Sistema Hospitalario",JOptionPane.ERROR_MESSAGE,Error);
                    Limpiar();
                }
            }
        }
    }
    
    //MÉTODO PARA SALIR
    public void Salir()
    {
        String Mensaje="¿Desea Salir de Sistema?";
        String Titulo="Salir";
        int Respuesta=JOptionPane.showConfirmDialog(null,Mensaje,Titulo,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,Pregunta);
        if(Respuesta==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
        if(Respuesta==JOptionPane.NO_OPTION)
        {
            Limpiar();
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                new Login().setVisible(true);
            }
        });
    }
    
    //MÉTODO PARA LIMPIAR LAS CAJAS DE TEXTO
    public void Limpiar()
    {
        txtusuario.setText("");
        jpcontra.setText("");
        txtusuario.requestFocus();
    }
    
    //MÉTODO PARA RECIBIR SOLO MINÚSCULAS
    public void Minusculas(JTextField a)
    {
        a.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent KE)
            {
                char c=KE.getKeyChar();
                if(c<'a'||c>'z')//AQUÍ ESTOY COMPARANDO SI SON MINÚSCULAS
                {
                    getToolkit().beep();//SONIDO CUANDO NO LEE LA ACCIÓN DEL TECLADO
                    KE.consume();//ANULA EVENTOS DEL TECLADO
                }
            }
        });
    }
    
    //MÉTODO QUE VALIDA LETRAS
    public void Letras(final JTextField a)
    {
        a.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent KE)
            {
                char c=KE.getKeyChar();
                if(Character.isDigit(c))//AQUÍ ESTOY COMPARANDO SI ES UN NÚMERO
                {
                    getToolkit().beep();//SONIDO CUANDO NO LEE LA ACCIÓN DEL TECLADO
                    KE.consume();//ANULA EVENTOS DEL TECLADO
                }
            }
        });
    }
    
    //MÉTODO QUE VALIDA NÚMEROS Y MINÚSCULAS
    public void Numeros_Minusculas(JTextField a)
    {
        a.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent KE)
            {
                char c=KE.getKeyChar();
                if((c<'a'||c>'z')&&(c<'0'||c>'9'))//AQUÍ ESTOY COMPARANDO SI ES UNA LETRA MINÚSCULA O UN NÚMERO
                {
                    getToolkit().beep();//SONIDO CUANDO NO LEE LA ACCIÓN DEL TECLADO
                    KE.consume();//ANULA EVENTOS DEL TECLADO
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnentrar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JPasswordField jpcontra;
    private javax.swing.JLabel lblcontra;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JPanel panelingreso;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

}

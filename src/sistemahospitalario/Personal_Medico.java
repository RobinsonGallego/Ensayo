package sistemahospitalario;

import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Personal_Medico extends javax.swing.JFrame 
{
    //DECLARO UNA VARIABLE PRIVADA QUE ME CARGUE SOLO LAS IMAGENES QUE QUIERO, EN ESTE CASO .JPG
    private FileNameExtensionFilter filter=new FileNameExtensionFilter("Archivo de Imagen","jpg");
    //VARIABLE PARA LA RUTA
    String Ruta;
    //IMAGENES UTILIZADAS EN LA VENTANA
    ImageIcon Pregunta=new ImageIcon(this.getClass().getResource("/Imagenes/pre2.png"));
    
    //CONSTRUCTOR
    public Personal_Medico() 
    {
        initComponents();
        setLocationRelativeTo(null);//CENTRAR LA VENTANA
        setResizable(false);//BLOQUEA EL TAMAÑO DE LA VENTANA
        setTitle("Personal Médico");//TÍTULO DE LA VENTANA
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/doctorcabe.png")).getImage());//PONER IMAGEN ICONO
        //INICIALIZAMOS LA VARIABLE RUTA
        Ruta="";
        //VALIDACIONES
        Numeros(txtidentificacion);
        Letras(txtnombres);
        Letras(txtapellidos);
        Numeros(txttelefono);
        Numeros(txtmovil);
        txtcorreo.setInputVerifier(new ValidarEmail());
        Letras(txttitulo);
        Letras(txtinstitucion);
        Letras(txtultima);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        compositeEffect1 = new com.sun.animation.effects.CompositeEffect();
        jtpDatos = new javax.swing.JTabbedPane();
        jppersonales = new javax.swing.JPanel();
        lblidentificacion = new javax.swing.JLabel();
        lblnombres = new javax.swing.JLabel();
        lblapellidos = new javax.swing.JLabel();
        lblnacimiento = new javax.swing.JLabel();
        lblpais = new javax.swing.JLabel();
        lblciudad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        lblmovil = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();
        txtidentificacion = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        jcbpais = new javax.swing.JComboBox();
        jcbciudad = new javax.swing.JComboBox();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtmovil = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        jdcCalendario = new com.toedter.calendar.JDateChooser();
        lblestado = new javax.swing.JLabel();
        jcbestadocivil = new javax.swing.JComboBox();
        jpfotografia = new javax.swing.JPanel();
        txtrutaimagen = new javax.swing.JTextField();
        btnrutaimegen = new javax.swing.JButton();
        jpfotico = new javax.swing.JPanel();
        lblfoto = new javax.swing.JLabel();
        lblmensaje = new javax.swing.JLabel();
        jpprofesionles = new javax.swing.JPanel();
        lbltarjeta = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        lblinstitucion = new javax.swing.JLabel();
        lblotros = new javax.swing.JLabel();
        txttarjeta = new javax.swing.JTextField();
        txttitulo = new javax.swing.JTextField();
        txtinstitucion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaOtros = new javax.swing.JTextArea();
        lblidiomas = new javax.swing.JLabel();
        rbespañol = new javax.swing.JRadioButton();
        rbingles = new javax.swing.JRadioButton();
        rbmandarin = new javax.swing.JRadioButton();
        rbaleman = new javax.swing.JRadioButton();
        rbfrances = new javax.swing.JRadioButton();
        rbportugues = new javax.swing.JRadioButton();
        lblobservaciones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaObservaciones = new javax.swing.JTextArea();
        lblexperiencia = new javax.swing.JLabel();
        rbsi = new javax.swing.JRadioButton();
        rbno = new javax.swing.JRadioButton();
        lblultima = new javax.swing.JLabel();
        txtultima = new javax.swing.JTextField();
        lblmensaje2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(700, 600));

        jtpDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtpDatos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtpDatos.setPreferredSize(new java.awt.Dimension(705, 475));

        jppersonales.setPreferredSize(new java.awt.Dimension(680, 432));

        lblidentificacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblidentificacion.setText("Identificación *");
        lblidentificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblnombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnombres.setText("Nombres *");
        lblnombres.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblapellidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblapellidos.setText("Apellidos *");
        lblapellidos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblnacimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnacimiento.setText("Fecha de Nacimiento *");
        lblnacimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblpais.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblpais.setText("País *");
        lblpais.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblciudad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblciudad.setText("Ciudad *");
        lblciudad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Dirección");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbltelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltelefono.setText("Teléfono");
        lbltelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblmovil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblmovil.setText("Móvil *");
        lblmovil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblcorreo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcorreo.setText("Correo *");
        lblcorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtidentificacion.setMinimumSize(new java.awt.Dimension(6, 25));
        txtidentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidentificacionKeyTyped(evt);
            }
        });

        txtnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombresKeyTyped(evt);
            }
        });

        txtapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidosKeyTyped(evt);
            }
        });

        jcbpais.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"","Argentina","Brasil","Canadá","Colombia","España","Estados Unidos" }));
        jcbpais.setToolTipText("");
        jcbpais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbpaisItemStateChanged(evt);
            }
        });
        jcbpais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbpaisActionPerformed(evt);
            }
        });
        jcbpais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jcbpaisKeyTyped(evt);
            }
        });

        jcbciudad.setEnabled(false);
        jcbciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jcbciudadKeyTyped(evt);
            }
        });

        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        txtmovil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmovilKeyTyped(evt);
            }
        });

        lblestado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblestado.setText("Estado Civil");

        jcbestadocivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"","Soltero(a)","Casado(a)","Divorciado(a)","Viudo(a)","Separado(a)","Unión Libre"}));
        jcbestadocivil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jcbestadocivilKeyTyped(evt);
            }
        });

        jpfotografia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fotografía", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jpfotografia.setPreferredSize(new java.awt.Dimension(275, 275));

        txtrutaimagen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtrutaimagen.setEnabled(false);

        btnrutaimegen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnrutaimegen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOAD2.PNG"))); // NOI18N
        btnrutaimegen.setText("Cargar");
        btnrutaimegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrutaimegenActionPerformed(evt);
            }
        });

        jpfotico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        lblfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/foto1a.png"))); // NOI18N

        javax.swing.GroupLayout jpfoticoLayout = new javax.swing.GroupLayout(jpfotico);
        jpfotico.setLayout(jpfoticoLayout);
        jpfoticoLayout.setHorizontalGroup(
            jpfoticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblfoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpfoticoLayout.setVerticalGroup(
            jpfoticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblfoto, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpfotografiaLayout = new javax.swing.GroupLayout(jpfotografia);
        jpfotografia.setLayout(jpfotografiaLayout);
        jpfotografiaLayout.setHorizontalGroup(
            jpfotografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpfotografiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtrutaimagen)
                .addGap(18, 18, 18)
                .addComponent(btnrutaimegen)
                .addContainerGap())
            .addGroup(jpfotografiaLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jpfotico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jpfotografiaLayout.setVerticalGroup(
            jpfotografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpfotografiaLayout.createSequentialGroup()
                .addGroup(jpfotografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrutaimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrutaimegen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpfotico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        lblmensaje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblmensaje.setForeground(new java.awt.Color(255, 0, 0));
        lblmensaje.setText("Los campos marcados con el signo (*)  son obligatorios");

        javax.swing.GroupLayout jppersonalesLayout = new javax.swing.GroupLayout(jppersonales);
        jppersonales.setLayout(jppersonalesLayout);
        jppersonalesLayout.setHorizontalGroup(
            jppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jppersonalesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblidentificacion)
                    .addComponent(lblnombres)
                    .addComponent(lblapellidos)
                    .addComponent(lblpais)
                    .addComponent(lblcorreo)
                    .addComponent(lblnacimiento)
                    .addComponent(lblestado)
                    .addComponent(lblciudad)
                    .addComponent(jLabel1)
                    .addComponent(lbltelefono)
                    .addComponent(lblmovil))
                .addGap(23, 23, 23)
                .addGroup(jppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jppersonalesLayout.createSequentialGroup()
                        .addGroup(jppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbestadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbpais, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmovil, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jppersonalesLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblmensaje))
                            .addGroup(jppersonalesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jpfotografia, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jppersonalesLayout.createSequentialGroup()
                        .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jppersonalesLayout.setVerticalGroup(
            jppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jppersonalesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jppersonalesLayout.createSequentialGroup()
                        .addGroup(jppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblidentificacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblnombres)
                            .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblapellidos)
                            .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jppersonalesLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lblnacimiento))
                            .addGroup(jppersonalesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jdcCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblpais)
                            .addComponent(jcbpais, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblciudad)
                            .addComponent(jcbciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblestado)
                            .addComponent(jcbestadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltelefono)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jppersonalesLayout.createSequentialGroup()
                        .addComponent(jpfotografia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblmensaje)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmovil)
                    .addComponent(txtmovil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jppersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcorreo)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jtpDatos.addTab("Datos Personales", jppersonales);

        lbltarjeta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltarjeta.setText("Nº Tarjeta Profesional *");

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltitulo.setText("Título *");

        lblinstitucion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblinstitucion.setText("Institución *");

        lblotros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblotros.setText("Otros Estudios");

        txttarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttarjetaKeyTyped(evt);
            }
        });

        txttitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttituloKeyTyped(evt);
            }
        });

        txtinstitucion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtinstitucionKeyTyped(evt);
            }
        });

        jtaOtros.setColumns(20);
        jtaOtros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtaOtros.setRows(5);
        jScrollPane1.setViewportView(jtaOtros);

        lblidiomas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblidiomas.setText("Idiomas");

        rbespañol.setText("Español");
        rbespañol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rbespañolKeyTyped(evt);
            }
        });

        rbingles.setText("Inglés");
        rbingles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rbinglesKeyTyped(evt);
            }
        });

        rbmandarin.setText("Mandarín");
        rbmandarin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rbmandarinKeyTyped(evt);
            }
        });

        rbaleman.setText("Alemán");
        rbaleman.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rbalemanKeyTyped(evt);
            }
        });

        rbfrances.setText("Francés");
        rbfrances.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rbfrancesKeyTyped(evt);
            }
        });

        rbportugues.setText("Portugués");
        rbportugues.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rbportuguesKeyTyped(evt);
            }
        });

        lblobservaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblobservaciones.setText("Observaciones");

        jtaObservaciones.setColumns(20);
        jtaObservaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtaObservaciones.setRows(5);
        jScrollPane2.setViewportView(jtaObservaciones);

        lblexperiencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblexperiencia.setText("Experiencia Laboral");

        rbsi.setText("Si");
        rbsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsiActionPerformed(evt);
            }
        });

        rbno.setText("No");
        rbno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnoActionPerformed(evt);
            }
        });

        lblultima.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblultima.setText("Última Experiencia");

        txtultima.setEnabled(false);

        lblmensaje2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblmensaje2.setForeground(new java.awt.Color(255, 0, 0));
        lblmensaje2.setText("Los campos marcados con el signo (*)  son obligatorios");

        javax.swing.GroupLayout jpprofesionlesLayout = new javax.swing.GroupLayout(jpprofesionles);
        jpprofesionles.setLayout(jpprofesionlesLayout);
        jpprofesionlesLayout.setHorizontalGroup(
            jpprofesionlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpprofesionlesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jpprofesionlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltarjeta)
                    .addComponent(lbltitulo)
                    .addComponent(lblinstitucion)
                    .addComponent(lblotros)
                    .addComponent(lblidiomas)
                    .addComponent(lblobservaciones))
                .addGap(26, 26, 26)
                .addGroup(jpprofesionlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpprofesionlesLayout.createSequentialGroup()
                        .addGroup(jpprofesionlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtinstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpprofesionlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpprofesionlesLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jpprofesionlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblexperiencia)
                                    .addComponent(lblultima))
                                .addGap(32, 32, 32)
                                .addGroup(jpprofesionlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtultima, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpprofesionlesLayout.createSequentialGroup()
                                        .addComponent(rbsi)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbno))))
                            .addGroup(jpprofesionlesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblmensaje2))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpprofesionlesLayout.createSequentialGroup()
                        .addGroup(jpprofesionlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbespañol)
                            .addComponent(rbaleman))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpprofesionlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbingles)
                            .addComponent(rbfrances))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpprofesionlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbportugues)
                            .addComponent(rbmandarin)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jpprofesionlesLayout.setVerticalGroup(
            jpprofesionlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpprofesionlesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jpprofesionlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltarjeta)
                    .addComponent(txttarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblexperiencia)
                    .addComponent(rbsi)
                    .addComponent(rbno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpprofesionlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltitulo)
                    .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblultima)
                    .addComponent(txtultima, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpprofesionlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpprofesionlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblinstitucion)
                        .addComponent(txtinstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblmensaje2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jpprofesionlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblotros)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpprofesionlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbespañol)
                    .addComponent(lblidiomas)
                    .addComponent(rbingles)
                    .addComponent(rbmandarin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpprofesionlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbaleman)
                    .addComponent(rbfrances)
                    .addComponent(rbportugues))
                .addGap(18, 18, 18)
                .addGroup(jpprofesionlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblobservaciones)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jtpDatos.addTab("Datos Profesionales", jpprofesionles);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnrutaimegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrutaimegenActionPerformed
        //CREAMOS UN OBJETO DE FILECHOOSER
        JFileChooser dlg=new JFileChooser();
        //DEL OBJETO CREADO, VAMOS A LLAMAR AL MÉTODO setFileFilter, Y MANDAMOS NUESTRA VARIABLE CREADA
        dlg.setFileFilter(filter);
        //ABRIMOS LA VENTANA DE DIALOGO PARA ESOGER LAS IMAGENES
        int opcion=dlg.showOpenDialog(this);
        //SI HACEMOS CLIC EN EL BOTÓN ABRIR
        if(opcion==JFileChooser.APPROVE_OPTION)
        {
            //OBTENEMOS EN NOMBRE DEL ARCHIVO QUE HEMOS SELECCIONADO
            String file=dlg.getSelectedFile().getPath();
            //OBTENER LA DIRECCIÓN DONDE SE GUARDARA LA IMAGEN
            String file2=dlg.getSelectedFile().toString();
            lblfoto.setIcon(new ImageIcon(file));
            //MODIFICAMOS LA IMAGEN
            ImageIcon icon=new ImageIcon(file);
            //EXTRAER LA IMAGEN DEL ICONO
            Image imagen=icon.getImage();
            //CAMBIAR TAMAÑO DE NUESTRA IMAGEN
            Image imagen2=imagen.getScaledInstance(170,190,java.awt.Image.SCALE_SMOOTH);
            //GENERAMOS EL ImageIcon CON LA NUEVA IMAGEN
            ImageIcon icon2=new ImageIcon(imagen2);
            //PINTAMOS LA IMAGEN EN EL LABEL
            lblfoto.setIcon(icon2);
            //DIMENSIONAMOS EL LABEL
            lblfoto.setSize(155,175);
            //OBTENEMOS LA RUTA EN EL TEXTFIELD
            txtrutaimagen.setText(file);
            //LIMPIAMOS LA RUTA
            Ruta="";
        }
    }//GEN-LAST:event_btnrutaimegenActionPerformed

    private void rbsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsiActionPerformed
        txtultima.setEnabled(true);
        rbno.setSelected(false);
        txtultima.requestFocus();
    }//GEN-LAST:event_rbsiActionPerformed

    private void rbnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnoActionPerformed
        txtultima.setEnabled(false);
        rbsi.setSelected(false);
    }//GEN-LAST:event_rbnoActionPerformed

    private void jcbpaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbpaisActionPerformed
        
    }//GEN-LAST:event_jcbpaisActionPerformed

    private void jcbpaisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbpaisItemStateChanged
        if(evt.getSource()==jcbpais)
        {
            if(this.jcbpais.getSelectedIndex()!=0)
            {
                jcbciudad.setEnabled(true);
                this.jcbciudad.setModel(new DefaultComboBoxModel(this.getCiudades(this.jcbpais.getSelectedItem().toString())));
            }
            else
            {
                jcbciudad.setEnabled(false);
                jcbciudad.setSelectedItem("");
            }
        }
    }//GEN-LAST:event_jcbpaisItemStateChanged
    //LIMITAMOS LA IDENTIFICACIÓN Y PASAMOS EL FOCUS
    private void txtidentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidentificacionKeyTyped
        if(txtidentificacion.getText().length()==10)
        {
            getToolkit().beep();//SONIDO
            evt.consume();//ANULA ACCIÓN DEL TECLADO
        }
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtidentificacion)
        {
            if(Contador==10)
            {
                txtnombres.requestFocus();
            }
        }
    }//GEN-LAST:event_txtidentificacionKeyTyped
    //LIMITAMOS EL TELÉFONO Y PASAMOS EL FOCUS
    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        if(txttelefono.getText().length()==7)
        {
            getToolkit().beep();//SONIDO
            evt.consume();//ANULA ACCIÓN DEL TECLADO
        }
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txttelefono)
        {
            if(Contador==10)
            {
                txtmovil.requestFocus();
            }
        }
    }//GEN-LAST:event_txttelefonoKeyTyped
    //LIMITAMOS EL MOVIL Y PASAMOS EL FOCUS
    private void txtmovilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmovilKeyTyped
        if(txtmovil.getText().length()==10)
        {
            getToolkit().beep();//SONIDO
            evt.consume();//ANULA ACCIÓN DEL TECLADO
        }
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtmovil)
        {
            if(Contador==10)
            {
                txtcorreo.requestFocus();
            }
        }
    }//GEN-LAST:event_txtmovilKeyTyped
    //LIMITAMOS LA TARJETA PROFESIONAL Y PASAMOS EL FOCUS
    private void txttarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttarjetaKeyTyped
        if(txttarjeta.getText().length()==14)
        {
            getToolkit().beep();//SONIDO
            evt.consume();//ANULA ACCIÓN DEL TECLADO
        }
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txttarjeta)
        {
            if(Contador==10)
            {
                txttitulo.requestFocus();
            }
        }
    }//GEN-LAST:event_txttarjetaKeyTyped
    //PASAMOS EN FOCUS
    private void txtnombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtnombres)
        {
            if(Contador==10)
            {
                txtapellidos.requestFocus();
            }
        }
    }//GEN-LAST:event_txtnombresKeyTyped
    //PASAMOS EL FOCUS
    private void txtapellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidosKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtapellidos)
        {
            if(Contador==10)
            {
                jcbpais.requestFocus();
            }
        }
    }//GEN-LAST:event_txtapellidosKeyTyped
    //PASAMOS EN FOCUS
    private void jcbpaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbpaisKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==jcbpais)
        {
            if(Contador==10)
            {
                jcbciudad.requestFocus();
            }
        }
    }//GEN-LAST:event_jcbpaisKeyTyped
    //PASAMOS EL FOCUS
    private void jcbciudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbciudadKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==jcbciudad)
        {
            if(Contador==10)
            {
                jcbestadocivil.requestFocus();
            }
        }
    }//GEN-LAST:event_jcbciudadKeyTyped
    //PASAMOS EL FOCUS
    private void jcbestadocivilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbestadocivilKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==jcbestadocivil)
        {
            if(Contador==10)
            {
                txtdireccion.requestFocus();
            }
        }
    }//GEN-LAST:event_jcbestadocivilKeyTyped
    //PASAMOS EL FOCUS
    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtdireccion)
        {
            if(Contador==10)
            {
                txttelefono.requestFocus();
            }
        }
    }//GEN-LAST:event_txtdireccionKeyTyped
    //PASAMOS EL FOCUS
    private void txttituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttituloKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txttitulo)
        {
            if(Contador==10)
            {
                txtinstitucion.requestFocus();
            }
        }
    }//GEN-LAST:event_txttituloKeyTyped
    //PASAMOS EL FOCUS
    private void txtinstitucionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinstitucionKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==txtinstitucion)
        {
            if(Contador==10)
            {
                jtaOtros.requestFocus();
            }
        }
    }//GEN-LAST:event_txtinstitucionKeyTyped
    //PASAMOS EL FOCUS
    private void rbespañolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbespañolKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==rbespañol)
        {
            if(Contador==10)
            {
                rbingles.requestFocus();
            }
        }
    }//GEN-LAST:event_rbespañolKeyTyped
    //PASAMOS EL FOCUS
    private void rbinglesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbinglesKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==rbingles)
        {
            if(Contador==10)
            {
                rbmandarin.requestFocus();
            }
        }
    }//GEN-LAST:event_rbinglesKeyTyped
    //PASAMOS EL FOCUS
    private void rbmandarinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbmandarinKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==rbmandarin)
        {
            if(Contador==10)
            {
                rbaleman.requestFocus();
            }
        }
    }//GEN-LAST:event_rbmandarinKeyTyped
    //PASAMOS EL FOCUS
    private void rbalemanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbalemanKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==rbaleman)
        {
            if(Contador==10)
            {
                rbfrances.requestFocus();
            }
        }
    }//GEN-LAST:event_rbalemanKeyTyped
    //PASAMOS EL FOCUS
    private void rbfrancesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbfrancesKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==rbfrances)
        {
            if(Contador==10)
            {
                rbportugues.requestFocus();
            }
        }
    }//GEN-LAST:event_rbfrancesKeyTyped
    //PASAMOS EL FOCUS
    private void rbportuguesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbportuguesKeyTyped
        char Caracter=evt.getKeyChar();
        int Contador=(int)(Caracter);
        if(evt.getSource()==rbportugues)
        {
            if(Contador==10)
            {
                jtaObservaciones.requestFocus();
            }
        }
    }//GEN-LAST:event_rbportuguesKeyTyped
   
    //MÉTODO PARA LIMPIAR LAS CAJAS DE TEXTO
    public void Limpiar()
    {
        txtidentificacion.setText("");
        txtnombres.setText("");
        txtapellidos.setText("");
        jdcCalendario.setDate(null);
        jcbpais.setSelectedIndex(-1);
        jcbciudad.setSelectedItem("");
        jcbestadocivil.setSelectedItem("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtmovil.setText("");
        txtcorreo.setText("");
        txtrutaimagen.setText("");
        txttarjeta.setText("");
        txttitulo.setText("");
        txtinstitucion.setText("");
        jtaOtros.setText("");
        rbespañol.setSelected(false);
        rbingles.setSelected(false);
        rbmandarin.setSelected(false);
        rbaleman.setSelected(false);
        rbfrances.setSelected(false);
        rbportugues.setSelected(false);
        jtaObservaciones.setText("");
        rbsi.setSelected(false);
        rbno.setSelected(false);
        txtultima.setText("");
        txtultima.setEnabled(false);
        txtidentificacion.requestFocus();
    }
    
    //MÉTODO PARA VALIDAR LAS FECHAS
    public int edad(String fecha)
    {
        Date fechaNac=null;
        try
        {
           /*SE PUEDE CAMBIAR LA MÁSCARA POR EL FORMATO DE LA FECHA
           QUE SE QUIERE RECIBIR, POR EJEMPLO "yyyy-MM-dd"
           EN ESTE CASO ES DÍA, MES Y AÑO*/
           fechaNac=new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
        }
        catch (Exception ex)
        {
            System.out.println("Error:"+ex);
        }
        Calendar fechaNacimiento=Calendar.getInstance();
        //SE CREA UN OBJETO CON LA FECHA ACTUAL
        Calendar fechaActual=Calendar.getInstance();
        //SE ASIGNA LA FECHA RECIBIDA A LA FECHA DE NACIMIENTO
        fechaNacimiento.setTime(fechaNac);
        //SE RESTAN LA FECHA ACTUAL Y LA FECHA DE NACIMIENTO
        int year=fechaActual.get(Calendar.YEAR)-fechaNacimiento.get(Calendar.YEAR);
        int mes=fechaActual.get(Calendar.MONTH)-fechaNacimiento.get(Calendar.MONTH);
        int dia=fechaActual.get(Calendar.DATE)-fechaNacimiento.get(Calendar.DATE);
        //SE AJUSTA EL AÑO DEPENDIENDO DEL MES Y EL DÍA
        if(mes<0||(mes==0&&dia<0))
        {
            year--;
        }
        //REGRESA LA EDAD EN BASE A LA FECHA DE NACIMIENTO
        return year;
    }
    
    //MÉTODO QUE ME DEVULVE LAS CUIDADES DEPENTIENDO DEL PAÍS QUE SELECCIONE
    public String[] getCiudades(String pais)
    {
        String[] ciudades=new String[14];
        if(pais.equalsIgnoreCase("Colombia"))
        {
            ciudades[0]="";
            ciudades[1]="Barranquilla";
            ciudades[2]="Bogotá";
            ciudades[3]="Bucaramanga";
            ciudades[4]="Cali";
            ciudades[5]="Cartagena";
            ciudades[6]="Cúcuta";
            ciudades[7]="Envigago";
            ciudades[8]="Ibagué";
            ciudades[9]="Manizales";
            ciudades[10]="Medellín";
            ciudades[11]="Pasto";
            ciudades[12]="Santa Marta";
            ciudades[13]="Valledupar";
        }	        
        if(pais.equalsIgnoreCase("Argentina"))
        {
            ciudades[0]="";
            ciudades[1]="Bahía Blanca";
            ciudades[2]="Bueno Aires";
            ciudades[3]="Córdoba";
            ciudades[4]="Corrientes";
            ciudades[5]="La Plata";
            ciudades[6]="Mar del Plata";
            ciudades[7]="Mendoza";
            ciudades[8]="Rosario";
            ciudades[9]="Salta";
            ciudades[10]="San Carlos";
            ciudades[11]="San Juan";
            ciudades[12]="San Miguel";
            ciudades[13]="Santa Fe";
        }
        if(pais.equalsIgnoreCase("Brasil"))
        {
            ciudades[0]="";
            ciudades[1]="Belo Horizonte";
            ciudades[2]="Belém";
            ciudades[3]="Brasilia";
            ciudades[4]="Campinas";
            ciudades[5]="Curitiba";
            ciudades[6]="Fortaleza";
            ciudades[7]="Guarulhos";
            ciudades[8]="Manaus";
            ciudades[9]="Porto Alegre";
            ciudades[10]="Recife";
            ciudades[11]="Río de Janeiro";
            ciudades[12]="Salvador";
            ciudades[13]="São Paulo";
        }
        if(pais.equalsIgnoreCase("Canadá"))
        {
            ciudades[0]="";
            ciudades[1]="Calgary";
            ciudades[2]="Ciudad de Quebec";
            ciudades[3]="Edmonton";
            ciudades[4]="Hamilton";
            ciudades[5]="Kitchener";
            ciudades[6]="London";
            ciudades[7]="Montreal";
            ciudades[8]="Ottawa";
            ciudades[9]="Oshawa";
            ciudades[10]="Toronto";
            ciudades[11]="Vancouver";
            ciudades[12]="Victoria";
            ciudades[13]="Winnipeg";
        }
        if(pais.equalsIgnoreCase("España"))
        {
            ciudades[0]="";
            ciudades[1]="Alicante";
            ciudades[2]="Baleares";
            ciudades[3]="Barcelona";
            ciudades[4]="Bilbao";
            ciudades[5]="La Coruña";
            ciudades[6]="Las Palmas";
            ciudades[7]="Madrid";
            ciudades[8]="Málaga";
            ciudades[9]="Murcia";
            ciudades[10]="Sevilla";
            ciudades[11]="Valencia";
            ciudades[12]="Vizcaya";
            ciudades[13]="Zaragosa";
        }
        if(pais.equalsIgnoreCase("Estados Unidos"))
        {
            ciudades[0]="";
            ciudades[1]="Atlanta";
            ciudades[2]="Baltimore";
            ciudades[3]="Boston";
            ciudades[4]="Búfalo";
            ciudades[5]="Chicago";
            ciudades[6]="Cleveland";
            ciudades[7]="Dallas";
            ciudades[8]="Detroit";
            ciudades[9]="Los Ángeles";
            ciudades[10]="Memphis";
            ciudades[11]="Nueva York";
            ciudades[12]="San Diego";
            ciudades[13]="Washington";
        }
        return ciudades;
    }
    
    //MÉTODO PARA SALIR
    public void Salir()
    {
        String Mensaje="¿Desea Salir de Personal Médico?";
        String Titulo="Salir";
        int Respuesta=JOptionPane.showConfirmDialog(null,Mensaje,Titulo,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,Pregunta);
        if(Respuesta==JOptionPane.YES_OPTION)
        {
            dispose();
        }
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
    
    //MÉTODO QUE VALIDA NÚMEROS
    public void Numeros(JTextField a)
    {
        a.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent KE)
            {
                char c=KE.getKeyChar();
                if((c<'0'||c>'9'))//AQUÍ ESTOY COMPARANDO SI ES UN NÚMERO
                {
                    getToolkit().beep();//SONIDO CUANDO NO LEE LA ACCIÓN DEL TECLADO
                    KE.consume();//ANULA EVENTOS DEL TECLADO
                }
            }
        });
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
            java.util.logging.Logger.getLogger(Personal_Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personal_Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personal_Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personal_Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                new Personal_Medico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnrutaimegen;
    private com.sun.animation.effects.CompositeEffect compositeEffect1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jcbciudad;
    private javax.swing.JComboBox jcbestadocivil;
    private javax.swing.JComboBox jcbpais;
    private com.toedter.calendar.JDateChooser jdcCalendario;
    private javax.swing.JPanel jpfotico;
    private javax.swing.JPanel jpfotografia;
    private javax.swing.JPanel jppersonales;
    private javax.swing.JPanel jpprofesionles;
    private javax.swing.JTextArea jtaObservaciones;
    private javax.swing.JTextArea jtaOtros;
    private javax.swing.JTabbedPane jtpDatos;
    private javax.swing.JLabel lblapellidos;
    private javax.swing.JLabel lblciudad;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lblestado;
    private javax.swing.JLabel lblexperiencia;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JLabel lblidentificacion;
    private javax.swing.JLabel lblidiomas;
    private javax.swing.JLabel lblinstitucion;
    private javax.swing.JLabel lblmensaje;
    private javax.swing.JLabel lblmensaje2;
    private javax.swing.JLabel lblmovil;
    private javax.swing.JLabel lblnacimiento;
    private javax.swing.JLabel lblnombres;
    private javax.swing.JLabel lblobservaciones;
    private javax.swing.JLabel lblotros;
    private javax.swing.JLabel lblpais;
    private javax.swing.JLabel lbltarjeta;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lblultima;
    private javax.swing.JRadioButton rbaleman;
    private javax.swing.JRadioButton rbespañol;
    private javax.swing.JRadioButton rbfrances;
    private javax.swing.JRadioButton rbingles;
    private javax.swing.JRadioButton rbmandarin;
    private javax.swing.JRadioButton rbno;
    private javax.swing.JRadioButton rbportugues;
    private javax.swing.JRadioButton rbsi;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtidentificacion;
    private javax.swing.JTextField txtinstitucion;
    private javax.swing.JTextField txtmovil;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtrutaimagen;
    private javax.swing.JTextField txttarjeta;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttitulo;
    private javax.swing.JTextField txtultima;
    // End of variables declaration//GEN-END:variables

    private void setText(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

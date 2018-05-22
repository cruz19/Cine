
package package1;

import java.awt.Toolkit;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public final class VentanaAdmin extends javax.swing.JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();
    
    ///////////////////////////////////////////////////////////////
    private Archivo archivo;
    private boolean togglePelicula;
    private boolean toggleSala;
    private boolean toggleHorario;
    
    
    public VentanaAdmin() {
        setResizable(false);
        initComponents();
        myInitComponents();
    }
    
    public void myInitComponents(){
        
        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  pestaña enlazar
            
            //modelo para la hora
        SpinnerNumberModel modelHora = new SpinnerNumberModel();
        modelHora.setMaximum(12);
        modelHora.setMinimum(1);
        modelHora.setValue(1);
        spHora.setModel(modelHora);
        
            //modelo para los minutos
        SpinnerNumberModel modelMinutos = new SpinnerNumberModel();
        modelMinutos.setMaximum(60);
        modelMinutos.setMinimum(0);
        spMinutos.setModel(modelMinutos);
        
        //////////////////////////////////////////////////7
        
        panelAddPelicula.setVisible(false);
        panelAddSala.setVisible(false);
        togglePelicula = true;
        toggleSala = true;
        toggleHorario = true;
        
        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ pestaña salas
            //Modelo Spinenr
        SpinnerNumberModel spModel = new SpinnerNumberModel();
        spModel.setValue(2);
        spModel.setMinimum(2);
        spModel.setStepSize(2);
        spCapacidad.setModel(spModel);
        
        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ Pestaña Enlazar
        
        
            //Actualizaciones
        refreshPeliculas();
        refreshSalas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoHorarios = new javax.swing.ButtonGroup();
        grupoHorariosCreados = new javax.swing.ButtonGroup();
        groupFormatoHora = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        panelPeliculasExistentes = new javax.swing.JPanel();
        comboBox_peliculas = new javax.swing.JComboBox();
        btnEliminarPelicula = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_nuevaPelicula = new javax.swing.JButton();
        panelAddPelicula = new javax.swing.JPanel();
        txtPelicula = new javax.swing.JTextField();
        btn_agregarPelicula = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        comboBox_salas = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        btn_nuevaSala = new javax.swing.JButton();
        btn_eliminarSala = new javax.swing.JButton();
        lbl_infoCapacidad = new javax.swing.JLabel();
        panelAddSala = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbl_newSala = new javax.swing.JLabel();
        txtSala = new javax.swing.JTextField();
        btn_GuardarSala = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        spCapacidad = new javax.swing.JSpinner();
        jPanel6 = new javax.swing.JPanel();
        panelPeliculasExistentes1 = new javax.swing.JPanel();
        comboBox_peliculas2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelHorarios = new javax.swing.JPanel();
        spHora = new javax.swing.JSpinner();
        spMinutos = new javax.swing.JSpinner();
        rdAM = new javax.swing.JRadioButton();
        rdPM = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_crearFuncion = new javax.swing.JButton();
        btn_verEnlaces = new javax.swing.JButton();
        panelHorarios1 = new javax.swing.JPanel();
        comboBox_salas2 = new javax.swing.JComboBox();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("Oswald", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMINISTRACIÓN CINE");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/regresar2.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPeliculasExistentes.setBackground(new java.awt.Color(225, 225, 225));

        comboBox_peliculas.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        comboBox_peliculas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnEliminarPelicula.setBackground(new java.awt.Color(237, 85, 101));
        btnEliminarPelicula.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        btnEliminarPelicula.setForeground(new java.awt.Color(51, 51, 51));
        btnEliminarPelicula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/delete.png"))); // NOI18N
        btnEliminarPelicula.setText("Eliminar");
        btnEliminarPelicula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarPelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarPeliculaMouseClicked(evt);
            }
        });
        btnEliminarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPeliculaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Oswald", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PELÍCULAS AGREGADAS");

        btn_nuevaPelicula.setBackground(new java.awt.Color(72, 207, 173));
        btn_nuevaPelicula.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        btn_nuevaPelicula.setForeground(new java.awt.Color(51, 51, 51));
        btn_nuevaPelicula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/add.png"))); // NOI18N
        btn_nuevaPelicula.setText("Nueva");
        btn_nuevaPelicula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nuevaPelicula.setMaximumSize(new java.awt.Dimension(109, 33));
        btn_nuevaPelicula.setMinimumSize(new java.awt.Dimension(109, 33));
        btn_nuevaPelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_nuevaPeliculaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelPeliculasExistentesLayout = new javax.swing.GroupLayout(panelPeliculasExistentes);
        panelPeliculasExistentes.setLayout(panelPeliculasExistentesLayout);
        panelPeliculasExistentesLayout.setHorizontalGroup(
            panelPeliculasExistentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPeliculasExistentesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPeliculasExistentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPeliculasExistentesLayout.createSequentialGroup()
                        .addComponent(btn_nuevaPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPeliculasExistentesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboBox_peliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        panelPeliculasExistentesLayout.setVerticalGroup(
            panelPeliculasExistentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPeliculasExistentesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboBox_peliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(panelPeliculasExistentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_nuevaPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarPelicula))
                .addContainerGap())
        );

        panelAddPelicula.setBackground(new java.awt.Color(225, 225, 225));

        txtPelicula.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        txtPelicula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPelicula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPeliculaKeyTyped(evt);
            }
        });

        btn_agregarPelicula.setBackground(new java.awt.Color(72, 207, 173));
        btn_agregarPelicula.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        btn_agregarPelicula.setForeground(new java.awt.Color(51, 51, 51));
        btn_agregarPelicula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/guardar.png"))); // NOI18N
        btn_agregarPelicula.setText("Guardar");
        btn_agregarPelicula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregarPelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarPeliculaMouseClicked(evt);
            }
        });
        btn_agregarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarPeliculaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ingresa el nombre de la película");

        javax.swing.GroupLayout panelAddPeliculaLayout = new javax.swing.GroupLayout(panelAddPelicula);
        panelAddPelicula.setLayout(panelAddPeliculaLayout);
        panelAddPeliculaLayout.setHorizontalGroup(
            panelAddPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPeliculaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPeliculaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_agregarPelicula)
                        .addGap(13, 13, 13)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPeliculaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        panelAddPeliculaLayout.setVerticalGroup(
            panelAddPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddPeliculaLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(txtPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_agregarPelicula)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPeliculasExistentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAddPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPeliculasExistentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelAddPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Peliculas", jPanel2);

        jPanel4.setBackground(new java.awt.Color(225, 225, 225));

        comboBox_salas.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        comboBox_salas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBox_salas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboBox_salasMouseClicked(evt);
            }
        });
        comboBox_salas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBox_salasItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Oswald", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SALAS AGREGADAS");

        btn_nuevaSala.setBackground(new java.awt.Color(72, 207, 173));
        btn_nuevaSala.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        btn_nuevaSala.setForeground(new java.awt.Color(51, 51, 51));
        btn_nuevaSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/add.png"))); // NOI18N
        btn_nuevaSala.setText("Nueva");
        btn_nuevaSala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nuevaSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_nuevaSalaMouseClicked(evt);
            }
        });

        btn_eliminarSala.setBackground(new java.awt.Color(237, 85, 101));
        btn_eliminarSala.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        btn_eliminarSala.setForeground(new java.awt.Color(51, 51, 51));
        btn_eliminarSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/delete.png"))); // NOI18N
        btn_eliminarSala.setText("Eliminar");
        btn_eliminarSala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminarSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarSalaMouseClicked(evt);
            }
        });
        btn_eliminarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarSalaActionPerformed(evt);
            }
        });

        lbl_infoCapacidad.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        lbl_infoCapacidad.setForeground(new java.awt.Color(51, 51, 51));
        lbl_infoCapacidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_infoCapacidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_nuevaSala, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_infoCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btn_eliminarSala))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(comboBox_salas, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(comboBox_salas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbl_infoCapacidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_eliminarSala)
                            .addComponent(btn_nuevaSala))
                        .addContainerGap())))
        );

        panelAddSala.setBackground(new java.awt.Color(225, 225, 225));

        jPanel5.setBackground(new java.awt.Color(251, 206, 206));

        lbl_newSala.setFont(new java.awt.Font("Oswald", 0, 15)); // NOI18N
        lbl_newSala.setForeground(new java.awt.Color(102, 102, 102));
        lbl_newSala.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_newSala.setText("Ingresa el nombre de la nueva sala");

        txtSala.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        txtSala.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_newSala, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSala, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_newSala, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSala, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_GuardarSala.setBackground(new java.awt.Color(72, 207, 173));
        btn_GuardarSala.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        btn_GuardarSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/guardar.png"))); // NOI18N
        btn_GuardarSala.setText("Guardar");
        btn_GuardarSala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_GuardarSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_GuardarSalaMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Numero de asientos: ");

        spCapacidad.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel7)
                .addGap(29, 29, 29)
                .addComponent(spCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(spCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout panelAddSalaLayout = new javax.swing.GroupLayout(panelAddSala);
        panelAddSala.setLayout(panelAddSalaLayout);
        panelAddSalaLayout.setHorizontalGroup(
            panelAddSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddSalaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelAddSalaLayout.createSequentialGroup()
                        .addGap(0, 423, Short.MAX_VALUE)
                        .addComponent(btn_GuardarSala, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAddSalaLayout.setVerticalGroup(
            panelAddSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddSalaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_GuardarSala)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAddSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelAddSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Salas", jPanel3);

        panelPeliculasExistentes1.setBackground(new java.awt.Color(225, 225, 225));

        comboBox_peliculas2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        comboBox_peliculas2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setFont(new java.awt.Font("Oswald", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Selecciona una película");

        jLabel8.setFont(new java.awt.Font("Oswald", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Selecciona una sala");

        jLabel9.setFont(new java.awt.Font("Oswald", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ingresa el horario en el que será emitida");

        spHora.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N

        spMinutos.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N

        groupFormatoHora.add(rdAM);
        rdAM.setText("AM");

        groupFormatoHora.add(rdPM);
        rdPM.setText("PM");

        jLabel11.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Hora");

        jLabel12.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Minutos");

        jLabel13.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Formato");

        javax.swing.GroupLayout panelHorariosLayout = new javax.swing.GroupLayout(panelHorarios);
        panelHorarios.setLayout(panelHorariosLayout);
        panelHorariosLayout.setHorizontalGroup(
            panelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHorariosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spHora, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(spMinutos))
                .addGap(39, 39, 39)
                .addGroup(panelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelHorariosLayout.createSequentialGroup()
                        .addComponent(rdAM)
                        .addGap(18, 18, 18)
                        .addComponent(rdPM))
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHorariosLayout.setVerticalGroup(
            panelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHorariosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHorariosLayout.createSequentialGroup()
                        .addGroup(panelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spHora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelHorariosLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdAM)
                            .addComponent(rdPM))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_crearFuncion.setBackground(new java.awt.Color(72, 207, 173));
        btn_crearFuncion.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        btn_crearFuncion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/guardar.png"))); // NOI18N
        btn_crearFuncion.setText("Guardar");
        btn_crearFuncion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_crearFuncion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearFuncionMouseClicked(evt);
            }
        });

        btn_verEnlaces.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        btn_verEnlaces.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        btn_verEnlaces.setText("Ver funciones");
        btn_verEnlaces.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_verEnlaces.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_verEnlacesMouseClicked(evt);
            }
        });

        comboBox_salas2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        comboBox_salas2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelHorarios1Layout = new javax.swing.GroupLayout(panelHorarios1);
        panelHorarios1.setLayout(panelHorarios1Layout);
        panelHorarios1Layout.setHorizontalGroup(
            panelHorarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHorarios1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBox_salas2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHorarios1Layout.setVerticalGroup(
            panelHorarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHorarios1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(comboBox_salas2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPeliculasExistentes1Layout = new javax.swing.GroupLayout(panelPeliculasExistentes1);
        panelPeliculasExistentes1.setLayout(panelPeliculasExistentes1Layout);
        panelPeliculasExistentes1Layout.setHorizontalGroup(
            panelPeliculasExistentes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPeliculasExistentes1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPeliculasExistentes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPeliculasExistentes1Layout.createSequentialGroup()
                        .addGroup(panelPeliculasExistentes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelHorarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPeliculasExistentes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelHorarios1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelPeliculasExistentes1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboBox_peliculas2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(panelPeliculasExistentes1Layout.createSequentialGroup()
                        .addComponent(btn_verEnlaces, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_crearFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelPeliculasExistentes1Layout.setVerticalGroup(
            panelPeliculasExistentes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPeliculasExistentes1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelPeliculasExistentes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox_peliculas2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(panelPeliculasExistentes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPeliculasExistentes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelHorarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelHorarios1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelPeliculasExistentes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_verEnlaces)
                    .addComponent(btn_crearFuncion))
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(255, 204, 255));

        jLabel2.setFont(new java.awt.Font("Oswald", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("* Crea un funcion seleccionando una película, un horario y la sala donde será emitida *");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPeliculasExistentes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelPeliculasExistentes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Funciones", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarPeliculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarPeliculaMouseClicked
       
        if(comboBox_peliculas.getSelectedItem() != null){
            
            int respuesta = JOptionPane.showConfirmDialog(this, "¿Estas seguro?","Alert",JOptionPane.YES_NO_OPTION);
            
            if(respuesta == 0){
                
                String nombre_pelicula = comboBox_peliculas.getSelectedItem().toString();
                    //Eliminar
                archivo = new Archivo(new File("Archivos_txt/Peliculas.txt"));
                archivo.eliminar(nombre_pelicula);
                archivo = null;
                    //Eliminacion ON CASCADE para el archivo de funciones.txt
                archivo = new Archivo(new File("Archivos_txt/Funciones.txt"));
                archivo.eliminar(nombre_pelicula);
                    //ON CASCADE en elarchivo de tickets.txt
                archivo = null;
                archivo = new Archivo(new File("Archivos_txt/Tickets.txt"));
                archivo.eliminar(nombre_pelicula);
                
                JOptionPane.showMessageDialog(this, "Pelicula eliminada exitosamente");
                refreshPeliculas();
            }

        }else{
            JOptionPane.showMessageDialog(this,"No hay peliculas registradas");
        }
        
    }//GEN-LAST:event_btnEliminarPeliculaMouseClicked
        
    private void btnEliminarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPeliculaActionPerformed

    }//GEN-LAST:event_btnEliminarPeliculaActionPerformed

    private void btn_nuevaPeliculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevaPeliculaMouseClicked

        panelAddPelicula.setVisible(togglePelicula);

        if(togglePelicula){
            btn_nuevaPelicula.setLabel("Ocultar");
        }else{
            btn_nuevaPelicula.setLabel("Nueva");
        }
        togglePelicula = !togglePelicula;

    }//GEN-LAST:event_btn_nuevaPeliculaMouseClicked

    private void txtPeliculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPeliculaKeyTyped
        String val_pulsado = String.valueOf(evt.getKeyChar());
        if(!val_pulsado.matches("[a-zA-Z]") && evt.getKeyChar() != KeyEvent.VK_BACK_SPACE && evt.getKeyChar() != KeyEvent.VK_SPACE ){
            evt.consume();
            tk.beep();
        }
    }//GEN-LAST:event_txtPeliculaKeyTyped

    private void btn_agregarPeliculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarPeliculaMouseClicked

        String nombre_pelicula = txtPelicula.getText().trim();
        
        if(!nombre_pelicula.equals("")){
            archivo = new Archivo(new File("Archivos_txt/Peliculas.txt"));
        
            if(archivo.buscar(nombre_pelicula) == null){ //Si el registro NO existe
                ArrayList<String> Request = new ArrayList();
                Request.add(nombre_pelicula);
                    //Envio del Request
                archivo = new Archivo(new File("Archivos_txt/Peliculas.txt"));
                archivo.guardar(Request);
                txtPelicula.setText("");
                
                JOptionPane.showMessageDialog(this, "Película almacenada exitosamente");
                    //Actualizar
                refreshPeliculas();
                btn_nuevaPeliculaMouseClicked(null);
            }else{
                JOptionPane.showMessageDialog(this, "La pelicula ya existe en el archivo");
                txtPelicula.setText("");
            }   
            
        }else{
            JOptionPane.showMessageDialog(this, "Ningún nombre introducido");
        }
    }//GEN-LAST:event_btn_agregarPeliculaMouseClicked

    public void refreshPeliculas(){
        
        archivo = new Archivo(new File("Archivos_txt/Peliculas.txt"));
        ArrayList<String> peliculas = new ArrayList(archivo.leer());
        DefaultComboBoxModel modelPeliculas = new DefaultComboBoxModel();
        comboBox_peliculas.setModel(modelPeliculas);
        comboBox_peliculas2.setModel(modelPeliculas);
        
        for(String pelicula:peliculas){
            modelPeliculas.addElement(pelicula.substring(0,pelicula.indexOf("@")));
        }
        
    }
    
    
    private void btn_agregarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_agregarPeliculaActionPerformed

    private void comboBox_salasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBox_salasMouseClicked

    }//GEN-LAST:event_comboBox_salasMouseClicked

    private void comboBox_salasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBox_salasItemStateChanged

    }//GEN-LAST:event_comboBox_salasItemStateChanged

    private void btn_nuevaSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevaSalaMouseClicked

        panelAddSala.setVisible(toggleSala);
        if(toggleSala){
            btn_nuevaSala.setLabel("Ocultar");
        }else{
            btn_nuevaSala.setLabel("Nueva");
        }
        toggleSala = !toggleSala;
        
    }//GEN-LAST:event_btn_nuevaSalaMouseClicked
        
    private void btn_eliminarSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarSalaMouseClicked
        
        if(comboBox_salas.getSelectedItem() != null){
            
            int respuesta = JOptionPane.showConfirmDialog(this, "¿Estas seguro?","Alert!",JOptionPane.YES_NO_OPTION);
            
            if(respuesta==0){ //si la rta es 'si'
                String id_sala = comboBox_salas.getSelectedItem().toString();
                    //Eliminar sala
                archivo = new Archivo(new File("Archivos_txt/Salas.txt"));
                archivo.eliminar(id_sala);
                    //Eliminar ON CASCADE
                archivo = null;
                archivo = new Archivo(new File("Archivos_txt/Funciones.txt"));
                archivo.eliminar(id_sala);
                archivo = null;
                archivo = new Archivo(new File("Archivos_txt/Tickets.txt"));
                archivo.eliminar(id_sala);
                
                JOptionPane.showMessageDialog(this, "Sala eliminada exitosamente");
                    //Actualizar
                refreshSalas();
            }
            
        }else{
            JOptionPane.showMessageDialog(this,"No hay salas añadidas");
        }
        
        
    }//GEN-LAST:event_btn_eliminarSalaMouseClicked

    private void btn_eliminarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarSalaActionPerformed

    }//GEN-LAST:event_btn_eliminarSalaActionPerformed

    private void btn_GuardarSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GuardarSalaMouseClicked

        String nombre_sala = "Sala "+txtSala.getText().trim().toLowerCase();
        String capacidad = spCapacidad.getValue().toString();
                
        archivo = new Archivo(new File("Archivos_txt/Salas.txt"));
        
        if(archivo.buscar(nombre_sala) == null){ //Si el nombre de sala NO existe
            
            ArrayList<String> Request = new ArrayList();
            Request.add(nombre_sala);
            Request.add(capacidad);

                //Enviar Request para guardar sala
            archivo.guardar(Request);

            JOptionPane.showMessageDialog(this, "Sala almacenada exitosamente");
                //Actualizar
            Request.clear();
            refreshSalas();
            btn_nuevaSalaMouseClicked(null);
            txtSala.setText("");
            
        }else{
            JOptionPane.showMessageDialog(this, "El nombre de la sala ya existe");
            txtSala.requestFocus();
        }
        
        
    }//GEN-LAST:event_btn_GuardarSalaMouseClicked

    private void btn_crearFuncionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearFuncionMouseClicked

        String nombre_pelicula = "";
        String id_sala = "";
            //Obtener horario
        String horario = "";
        
        int hora = Integer.parseInt(spHora.getValue().toString());
        horario += (hora<=9)? "0"+hora : hora; 
        horario += ":";
        int minutos = Integer.parseInt(spMinutos.getValue().toString());
        horario += (minutos<=9)? "0"+minutos : minutos;
            
            //obtener formato hoario
        if(rdAM.isSelected()){
            horario += " AM";
        }else if(rdPM.isSelected()){
            horario += " PM";
        }
        
        ////////////////////////////////////////////
       
        
        if(horario.endsWith("AM") || horario.endsWith("PM")){
                //Si existe al menos una pelicula registrada 
            if(comboBox_peliculas2.getSelectedItem() != null){

                    //Rescatar la pelicula seleccionada
                nombre_pelicula = comboBox_peliculas2.getSelectedItem().toString();

                    //Si existe al menos una sala registrada 
                if(comboBox_salas2.getSelectedItem() != null){

                        //Rescatar sala seleccionada
                    id_sala = comboBox_salas2.getSelectedItem().toString();

                        //Comprobar que la relacion (Horario-sala) NO exista en los archivos de enlaces
                    archivo = new Archivo(new File("Archivos_txt/Funciones.txt"));
                    
                        ///////////////////////////////////////////////////////////////7
                    if(archivo.rangoFuncion(id_sala, hora, minutos, horario.substring(horario.indexOf(" ")))){
                        
                        if(archivo.buscar(horario+"@"+id_sala) == null){
                                //Almacenar los datos en un Request
                            ArrayList<String> Request = new ArrayList();
                            Request.add(nombre_pelicula);
                            Request.add(horario);
                            Request.add(id_sala);

                                //Enviar Request para guardarlo en el archivo
                            archivo.guardar(Request);

                            JOptionPane.showMessageDialog(this, "Funcion creado exitosamente");


                        }else{
                            JOptionPane.showMessageDialog(this, "La sala ya esta reservada para este horario");
                        }
                        
                    }else{
                        JOptionPane.showMessageDialog(this, "Cada pelicula tiene una duracion de una hora");
                    }
                    
                    

                }else{
                    JOptionPane.showMessageDialog(this, "No hay salas para el proceso de enlazamiento");
                }

            }else{
                JOptionPane.showMessageDialog(this, "No hay películas para el proceso de enlazamiento");
            }
        }else{
            JOptionPane.showMessageDialog(this,"Selecciona AM | PM ");
        }
        
    }//GEN-LAST:event_btn_crearFuncionMouseClicked

    private void btn_verEnlacesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_verEnlacesMouseClicked
        
        this.setVisible(false);
        VentanaFunciones vEnlaces = new VentanaFunciones();
        vEnlaces.setLocationRelativeTo(null);
        vEnlaces.setVisible(true);
        
        
    }//GEN-LAST:event_btn_verEnlacesMouseClicked

    private void txtSalaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalaKeyTyped
        String val_pulsado = String.valueOf(evt.getKeyChar());
        
        if(!val_pulsado.matches("[a-zA-Z]") && evt.getKeyChar() != KeyEvent.VK_SPACE){
            evt.consume();
            tk.beep();
        }
        
    }//GEN-LAST:event_txtSalaKeyTyped

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
       this.setVisible(false);
       main.elegir();
    }//GEN-LAST:event_jLabel14MouseClicked

    public void refreshSalas(){
        
        archivo = new Archivo(new File("Archivos_txt/Salas.txt"));
        ArrayList<String> salas = new ArrayList(archivo.leer());
            //modelo para ambos comboBox de salas
        DefaultComboBoxModel modelSalas = new DefaultComboBoxModel();
        comboBox_salas.setModel(modelSalas);
        comboBox_salas2.setModel(modelSalas);
        
        for(String sala : salas){
            modelSalas.addElement(sala.substring(0,sala.indexOf("@")));
        }
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarPelicula;
    private javax.swing.JButton btn_GuardarSala;
    private javax.swing.JButton btn_agregarPelicula;
    private javax.swing.JButton btn_crearFuncion;
    private javax.swing.JButton btn_eliminarSala;
    private javax.swing.JButton btn_nuevaPelicula;
    private javax.swing.JButton btn_nuevaSala;
    private javax.swing.JButton btn_verEnlaces;
    private javax.swing.JComboBox comboBox_peliculas;
    private javax.swing.JComboBox comboBox_peliculas2;
    private javax.swing.JComboBox comboBox_salas;
    private javax.swing.JComboBox comboBox_salas2;
    private javax.swing.ButtonGroup groupFormatoHora;
    private javax.swing.ButtonGroup grupoHorarios;
    private javax.swing.ButtonGroup grupoHorariosCreados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_infoCapacidad;
    private javax.swing.JLabel lbl_newSala;
    private javax.swing.JPanel panelAddPelicula;
    private javax.swing.JPanel panelAddSala;
    private javax.swing.JPanel panelHorarios;
    private javax.swing.JPanel panelHorarios1;
    private javax.swing.JPanel panelPeliculasExistentes;
    private javax.swing.JPanel panelPeliculasExistentes1;
    private javax.swing.JRadioButton rdAM;
    private javax.swing.JRadioButton rdPM;
    private javax.swing.JSpinner spCapacidad;
    private javax.swing.JSpinner spHora;
    private javax.swing.JSpinner spMinutos;
    private javax.swing.JTextField txtPelicula;
    private javax.swing.JTextField txtSala;
    // End of variables declaration//GEN-END:variables
}

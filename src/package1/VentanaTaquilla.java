
package package1;

import java.io.*;
import java.util.*;
import javax.swing.*;

public final class VentanaTaquilla extends javax.swing.JFrame {

    private Archivo archivo;
    private final Session session;
    private ArrayList<String> horarios_bind_pelicula; //horarios enlazados con lña pelicula
    private ArrayList<String> peliculas_con_enlace;
    private ArrayList<String> peliculas_aux;
    
    public VentanaTaquilla(Session session) {
        initComponents();
        this.session = session;
        setResizable(false);
        myInitComponents();
    }

    public void myInitComponents(){
        lbl_saludo.setText("Bienvenid@ "+capitalize(session.getNombre()));
        refreshPeliculas();
    }
    
        //filtro capitalize para el nombre del usuario
    public String capitalize(String nombre){
        
        String[] campos = nombre.split(" ");
        String nombre_capitalize = "";
        
        for(int i=0;i<campos.length;i++){
            nombre_capitalize += String.valueOf(campos[i].charAt(0)).toUpperCase()+campos[i].substring(1).toLowerCase()+" ";
        }
        
        return nombre_capitalize.trim();
    }
    
    public void refreshPeliculas(){
        
        archivo = new Archivo(new File("Archivos_txt/Funciones.txt"));
        peliculas_con_enlace = new ArrayList<>(archivo.leer());
        peliculas_aux = new ArrayList();
        
        DefaultComboBoxModel modelPeliculas2 = new DefaultComboBoxModel();
        comboBox_peliculas3.setModel(modelPeliculas2);
        
        for(String pelicula : peliculas_con_enlace){
            String nombre_pelicula = pelicula.substring(0, pelicula.indexOf("@"));
               //evitar que se repitan en el comboBox
            if(peliculas_aux.indexOf(nombre_pelicula) == -1){ //Si el elemento NO existe en el arrayList
                modelPeliculas2.addElement(nombre_pelicula);
                peliculas_aux.add(nombre_pelicula);
            }  
        }
        peliculas_aux.clear();
        peliculas_con_enlace.clear();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoHorariosPelicula = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbl_saludo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        comboBox_peliculas3 = new javax.swing.JComboBox();
        panelHora_sala = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        comboBox_horario4 = new javax.swing.JComboBox();
        panelSalasTaquilla = new javax.swing.JPanel();
        comboBox_salas3 = new javax.swing.JComboBox();
        lbl_horarioSelected = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        lbl_saludo.setFont(new java.awt.Font("Oswald", 0, 20)); // NOI18N
        lbl_saludo.setForeground(new java.awt.Color(102, 102, 102));
        lbl_saludo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_saludo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_saludo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(229, 229, 254));

        jLabel3.setFont(new java.awt.Font("Oswald", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("* Selecciona una película *");

        comboBox_peliculas3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        comboBox_peliculas3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBox_peliculas3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBox_peliculas3ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(comboBox_peliculas3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(comboBox_peliculas3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(77, Short.MAX_VALUE)))
        );

        panelHora_sala.setBackground(new java.awt.Color(229, 229, 254));

        jLabel9.setFont(new java.awt.Font("Oswald", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("* Selecciona el horario * ");

        comboBox_horario4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        comboBox_horario4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBox_horario4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBox_horario4ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboBox_horario4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboBox_horario4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        comboBox_salas3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        comboBox_salas3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl_horarioSelected.setFont(new java.awt.Font("Oswald", 0, 16)); // NOI18N
        lbl_horarioSelected.setForeground(new java.awt.Color(102, 102, 102));
        lbl_horarioSelected.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelSalasTaquillaLayout = new javax.swing.GroupLayout(panelSalasTaquilla);
        panelSalasTaquilla.setLayout(panelSalasTaquillaLayout);
        panelSalasTaquillaLayout.setHorizontalGroup(
            panelSalasTaquillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalasTaquillaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_horarioSelected, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalasTaquillaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboBox_salas3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        panelSalasTaquillaLayout.setVerticalGroup(
            panelSalasTaquillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalasTaquillaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl_horarioSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboBox_salas3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/silla.png"))); // NOI18N
        jButton1.setText("Elegir asiento(s)");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cerrarSesion.png"))); // NOI18N
        jButton2.setText("Cerrar sesion");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelHora_salaLayout = new javax.swing.GroupLayout(panelHora_sala);
        panelHora_sala.setLayout(panelHora_salaLayout);
        panelHora_salaLayout.setHorizontalGroup(
            panelHora_salaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHora_salaLayout.createSequentialGroup()
                .addGroup(panelHora_salaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelHora_salaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelHora_salaLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelSalasTaquilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 80, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelHora_salaLayout.setVerticalGroup(
            panelHora_salaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHora_salaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelHora_salaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSalasTaquilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelHora_salaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelHora_sala, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelHora_sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBox_peliculas3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBox_peliculas3ItemStateChanged

        actualizarHorarios();
        actualizarSalas(comboBox_horario4.getSelectedItem().toString());
        
    }//GEN-LAST:event_comboBox_peliculas3ItemStateChanged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        
           if(comboBox_peliculas3.getSelectedItem() != null){
                   
                   if(comboBox_salas3.getSelectedItem()!=null){
                       
                        //Rescatando datos de la taquilla
                       String pelicula = comboBox_peliculas3.getSelectedItem().toString();
                       String horario = comboBox_horario4.getSelectedItem().toString();
                       String sala = comboBox_salas3.getSelectedItem().toString();
                       
                            //Ocultar y mostra nuevo JFrame
                       this.setVisible(false);
                       VentanaCompra vCompra = new VentanaCompra(session,pelicula,horario,sala);
                       vCompra.setLocationRelativeTo(null);
                       vCompra.setVisible(true);
                       
                   }else{
                       JOptionPane.showMessageDialog(this,"No hay salas disponicles para este horario");
                   }
           }else{
               JOptionPane.showMessageDialog(this, "No hay peliculas en cartelera");
           }
        
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        
        this.setVisible(false);
        VentanaLogin vLogin = new VentanaLogin();
        vLogin.setLocationRelativeTo(null);
        vLogin.setVisible(true);
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void comboBox_horario4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBox_horario4ItemStateChanged
        actualizarSalas(comboBox_horario4.getSelectedItem().toString());
        panelSalasTaquilla.setVisible(true);
    }//GEN-LAST:event_comboBox_horario4ItemStateChanged
    
    private void actualizarHorarios(){
        
        archivo = null;
        archivo = new Archivo(new File("Archivos_txt/Funciones.txt"));
        String pelicula = comboBox_peliculas3.getSelectedItem().toString();
        
        ArrayList<Funcion> funciones = new ArrayList(archivo.busquedaFunciones(pelicula));
        horarios_bind_pelicula= new ArrayList();
        
        for(Funcion funcion : funciones){
            
            if(validarRepeticion(funcion)){ 
                String item = funcion.getHorario();
                    //Agregar JRadioButton al arrayList()
                horarios_bind_pelicula.add(item);
            }
        }
        
        DefaultComboBoxModel modelHorarios = new DefaultComboBoxModel();
        comboBox_horario4.setModel(modelHorarios);
        
        for(String item : horarios_bind_pelicula){
            modelHorarios.addElement(item);
        }
        
    }
    
    
        //Esta funcion permite controlar si ya existe un radioButton con el horario de la funcion (solo almacenar uno)
    public boolean validarRepeticion(Funcion funcion){
        
        boolean verificacion = true;
        
        for(String horario : horarios_bind_pelicula){
            
            if(funcion.getHorario().equals(horario)){
                verificacion = false;
                break;
            }
            
        }
        
        return verificacion;
    }
    
    
    private void actualizarSalas(String horario){
        
            lbl_horarioSelected.setText(horario);
            
            String pelicula_selected = comboBox_peliculas3.getSelectedItem().toString();
            
            archivo = new Archivo(new File("Archivos_txt/Funciones.txt"));
                
            String id = pelicula_selected+"@"+horario;
                //Almacena los objetos Funcion que contengan el id enviado
            ArrayList<Funcion> funciones = new ArrayList(archivo.busquedaFunciones(id));
            
                //Modelo para comboBox de salas
            DefaultComboBoxModel modelSalas = new DefaultComboBoxModel();
            comboBox_salas3.setModel(modelSalas);
            
                //Recorrer arrayList de Funciones filtradas y agregador al comboBox
            for(Funcion funcion : funciones){
                modelSalas.addElement(funcion.getSala());
            }
            
            funciones.clear();
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboBox_horario4;
    private javax.swing.JComboBox comboBox_peliculas3;
    private javax.swing.JComboBox comboBox_salas3;
    private javax.swing.ButtonGroup grupoHorariosPelicula;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbl_horarioSelected;
    private javax.swing.JLabel lbl_saludo;
    private javax.swing.JPanel panelHora_sala;
    private javax.swing.JPanel panelSalasTaquilla;
    // End of variables declaration//GEN-END:variables
}

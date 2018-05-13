package package1;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public final class VentanaFunciones extends javax.swing.JFrame {

    private Archivo archivo;
    private String[][] data;
    private final String[] cabecera = {"PELÍCULA","HORARIO","SALA"};
    
    public VentanaFunciones() {
        initComponents();
        myInitComponents();
    }
    
    public void myInitComponents(){
        setResizable(false);
        refreshTabla();
    }
    
    public void refreshTabla(){
        
        archivo = new Archivo(new File("Archivos_txt/Funciones.txt"));
        ArrayList<String> enlaces = new ArrayList(archivo.leer()); //Leer  y recibir archivo Enlaces.txt 
            
            //modelo de JTable
        DefaultTableModel modelTabla = new DefaultTableModel(data,cabecera){
            @Override 
            public boolean isCellEditable(int rowIndex,int columnIndex){return false;}  //Sobreescribir metodo de edicion de celdas
        };
        
        tablaEnlaces.setModel(modelTabla);
        
            //Agregar rows - filas
        for(String enlace : enlaces){
            String[] campos = enlace.split("@");
            modelTabla.addRow(campos);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEnlaces = new javax.swing.JTable();
        btn_deleteFuncion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("Oswald", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FUNCIONES ACTUALES DEL CINE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaEnlaces.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "PELICULA", "HORARIO", "SALA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaEnlaces);
        if (tablaEnlaces.getColumnModel().getColumnCount() > 0) {
            tablaEnlaces.getColumnModel().getColumn(0).setResizable(false);
            tablaEnlaces.getColumnModel().getColumn(1).setResizable(false);
            tablaEnlaces.getColumnModel().getColumn(2).setResizable(false);
        }

        btn_deleteFuncion.setBackground(new java.awt.Color(237, 85, 101));
        btn_deleteFuncion.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        btn_deleteFuncion.setForeground(new java.awt.Color(51, 51, 51));
        btn_deleteFuncion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/delete.png"))); // NOI18N
        btn_deleteFuncion.setText("Eliminar");
        btn_deleteFuncion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_deleteFuncion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_deleteFuncionMouseClicked(evt);
            }
        });
        btn_deleteFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteFuncionActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/regresar2.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_deleteFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_deleteFuncion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_deleteFuncionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteFuncionMouseClicked
        
        int fila = tablaEnlaces.getSelectedRow();
        
        if(fila != -1){
                //Para eliminar el enlace envio la relacion Horario-Sala pues esta nunca se repite en los enlaces
            String hora_sala = "";
                    //desde 1 para ignorar el nombre de la pelicula
            for(int i=1;i<tablaEnlaces.getColumnCount();i++){
                if(i==1){
                    hora_sala += tablaEnlaces.getValueAt(fila, i)+"@";
                }else{
                    hora_sala += tablaEnlaces.getValueAt(fila, i);
                }
            }
            
                //Enviar el id (hora-sala) para eliminar el registro del enlace
            archivo = new Archivo(new File("Archivos_txt/Funciones.txt"));
            archivo.eliminar(hora_sala);
            JOptionPane.showMessageDialog(this,"Funcion eliminada exitosamente");
            
            refreshTabla(); //Actualizar tabla
            
        }else{
            JOptionPane.showMessageDialog(this, "Ningún enlace seleccionado");
        }
    }//GEN-LAST:event_btn_deleteFuncionMouseClicked

    private void btn_deleteFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteFuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_deleteFuncionActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setVisible(false);
        VentanaAdmin vAdmin = new VentanaAdmin();
        vAdmin.setLocationRelativeTo(null);
        vAdmin.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_deleteFuncion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEnlaces;
    // End of variables declaration//GEN-END:variables
}

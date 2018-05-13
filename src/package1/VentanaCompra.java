
package package1;

import com.itextpdf.text.BadElementException;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.util.*;
import javax.swing.*;

public final class VentanaCompra extends javax.swing.JFrame {

    private final GenerarPDF generarPDF;
    private final Session session;
    private final String pelicula;
    private final String horario;
    private final String sala;
    private ArrayList<JButton> asientos;
    private Archivo archivo;
    private int numeroAsientos;
    private ArrayList<String> asientos_ocupados;
            
    public VentanaCompra(Session session,String pelicula, String horario, String sala) {
        setResizable(false);
            /////////////////////7
        this.session = session;
        this.pelicula = pelicula;
        this.horario = horario;
        this.sala = sala;
            /////////////////////
        
        initComponents();
        myInitComponents();
        generarPDF = new GenerarPDF(); 
        
    }
    
    public void myInitComponents(){
        
            //Entregar los valores respectivos a los JLabel creados
        lbl_usuario.setText("Usuario: "+capitalize(session.getNombre()));
        lblPelicula.setText("Película: "+pelicula);
        lblHorario.setText("Horario: "+horario);
        lblSala.setText("Sala: "+sala);

            //Almacenaremos los JButton
        drawAsientos();
        
    }
    
        //Filtro capitalize para el nombre del usuario
    public String capitalize(String nombre){
        
        String[] campos = nombre.split(" ");
        String nombre_capitalize = "";
        
        for(int i=0;i<campos.length;i++){
            nombre_capitalize += String.valueOf(campos[i].charAt(0)).toUpperCase()+campos[i].substring(1).toLowerCase()+" ";
        }
        
        return nombre_capitalize.trim();
    }
    
    public void drawAsientos(){
        
        archivo = new Archivo(new File("Archivos_txt/Salas.txt"));
        ArrayList<String> miSala = new ArrayList(archivo.buscar(sala));
        
            //Obtener numero de salas
        int i=0;
        for(String atributo : miSala){
            if(i==1){
                numeroAsientos = Integer.parseInt(atributo); 
            }
            i++;
        }
           //Dar texto al label de asientos
        lbl_numeroAsientos.setText("Capacidad de la sala: "+numeroAsientos);
        
            //pasar los asientos ocupados al ArrayList()
        archivo = new Archivo(new File("Archivos_txt/Tickets.txt"));
            //obtener grupos de asientos ocupados
        ArrayList<String> row_asientos_ocupados = new ArrayList(archivo.getGroupAsientosOcupados(horario+"@"+sala));
        asientos_ocupados = new ArrayList();
        
            //obtener todos los asientos ocupados separando los elementos de cada grupo de asientos
        for(String group : row_asientos_ocupados){
            String[] columns  = group.split("#");
            asientos_ocupados.addAll(Arrays.asList(columns));
        }
            
          //ArrayList de JButton de los asientos
        asientos = new ArrayList();
        
        
        for(int j=0;j<numeroAsientos;j++){
            
            final JButton boton = new JButton((String.valueOf(j+1))); //El contructor recibe el label
            
            //Verificar los asientos que ya estan ocupados
            if(verificarOcupado(String.valueOf((j+1)))){
                boton.setToolTipText("Ocupado");
                boton.setBackground(Color.darkGray);
                
            }else{ //si no esta ocupado se crea normalmente
                
                boton.setToolTipText("Disponible");
                boton.setCursor(new Cursor(HAND_CURSOR));
                    //evento para cada button creado
                boton.addMouseListener(new MouseListener(){

                    @Override
                    public void mouseClicked(MouseEvent me) {  

                        if(boton.isEnabled()){ //si ya esta seleccionado,
                            boton.setEnabled(false); // lo vuelve a habilitar
                        }else{
                            boton.setEnabled(true);
                        }

                    }

                    @Override
                    public void mousePressed(MouseEvent me) {}

                    @Override
                    public void mouseReleased(MouseEvent me) {}

                    @Override
                    public void mouseEntered(MouseEvent me) {}

                    @Override
                    public void mouseExited(MouseEvent me) {}

                });
            }
            
                //agregar JButton al arrayList
            asientos.add(boton);
            
        }
        
           //Recorrer para agregar los botones (asientos) al panel
        for(JButton asiento : asientos){
            panelAsientos.add(asiento);
        }
        
        panelAsientos.repaint();
        
        
    }
    
    public boolean verificarOcupado(String id_boton){
        boolean verificacion = false;
        
        for(String seat : asientos_ocupados){
            if(seat.equals(id_boton)){
                verificacion = true;
            }
        }
        
        return verificacion;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl2 = new javax.swing.JLabel();
        btn_comprar = new javax.swing.JButton();
        panelInfo = new javax.swing.JPanel();
        lbl_usuario = new javax.swing.JLabel();
        lblPelicula = new javax.swing.JLabel();
        lblSala = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        lbl_numeroAsientos = new javax.swing.JLabel();
        lbl_nombreSala2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelAsientos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        lbl2.setFont(new java.awt.Font("Oswald", 0, 17)); // NOI18N
        lbl2.setForeground(new java.awt.Color(102, 102, 102));
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("DATOS DE LA FUNCIÓN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_comprar.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        btn_comprar.setForeground(new java.awt.Color(51, 51, 51));
        btn_comprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/carrito.png"))); // NOI18N
        btn_comprar.setText("Comprar");
        btn_comprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_comprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_comprarMouseClicked(evt);
            }
        });

        panelInfo.setBackground(new java.awt.Color(230, 255, 255));

        lbl_usuario.setFont(new java.awt.Font("Oswald", 0, 15)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(102, 102, 102));
        lbl_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblPelicula.setFont(new java.awt.Font("Oswald", 0, 15)); // NOI18N
        lblPelicula.setForeground(new java.awt.Color(102, 102, 102));
        lblPelicula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblSala.setFont(new java.awt.Font("Oswald", 0, 15)); // NOI18N
        lblSala.setForeground(new java.awt.Color(102, 102, 102));
        lblSala.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblHorario.setFont(new java.awt.Font("Oswald", 0, 15)); // NOI18N
        lblHorario.setForeground(new java.awt.Color(102, 102, 102));
        lblHorario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSala, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSala, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_numeroAsientos.setFont(new java.awt.Font("Oswald", 0, 13)); // NOI18N
        lbl_numeroAsientos.setForeground(new java.awt.Color(102, 102, 102));
        lbl_numeroAsientos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl_nombreSala2.setFont(new java.awt.Font("Oswald", 0, 13)); // NOI18N
        lbl_nombreSala2.setForeground(new java.awt.Color(102, 102, 102));
        lbl_nombreSala2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nombreSala2.setText("* Selecciona tu(s) asiento(s) *");

        panelAsientos.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 15, 20, 15));
        panelAsientos.setLayout(new java.awt.GridLayout(0, 12, 5, 5));
        jScrollPane1.setViewportView(panelAsientos);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/regresar2.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_nombreSala2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_numeroAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_nombreSala2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_numeroAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_comprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_comprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_comprarMouseClicked

        boolean any_selected = false;
        for(JButton boton : asientos){
            if(!boton.isEnabled()){
                any_selected = true;
            }
        }
        
            //Si algun boton esta seleccionado
        
        if(any_selected){
            
            archivo = new Archivo(new File("Archivos_txt/Tickets.txt"));

            ArrayList<String> Request = new ArrayList();
            ArrayList<String> asientosPDF = new ArrayList();
            
                    //Almacenando Request para enviar
            Request.add(session.getNombre());
            Request.add(pelicula);
            Request.add(horario);
            Request.add(sala);
            
                //almacenar nuevos asientos ocupados
            for(JButton boton : asientos){
                if(!boton.isEnabled()){ //Solo agrego los asientos seleccionados
                    Request.add(boton.getLabel());
                    asientosPDF.add(boton.getLabel());
                }
            }
            
                //Guardar en archivo de compras
            archivo.guardar(Request);
            
                //Recibo de compra
            
            
            
            try{
                
                Recibo recibo = new Recibo("RECIBO DE COMPRA",
                capitalize(session.getNombre()),sala,horario,"C:/Users/user/Desktop/ProyectoFinal/src/recursos/logoCine.png"
                ,"Udec cinemas",asientosPDF,getRandom());
                
                generarPDF.generarPDF(recibo);
                
                
            }catch(BadElementException | IOException e){
                
                System.out.println("error "+e);
            }
            
            

            
                //Limpiar y redirigir
            Request.clear();
            
            JOptionPane.showMessageDialog(this, "Compra realizada");
            this.setVisible(false);
            VentanaTaquilla vTaquilla = new VentanaTaquilla(session); //permanecer en Session
            vTaquilla.setLocationRelativeTo(null);
            vTaquilla.setVisible(true);
            
            
        }else{
            JOptionPane.showMessageDialog(this, "Ningun asiento seleccionado");
        }
        
        
        
    }//GEN-LAST:event_btn_comprarMouseClicked

    private String getRandom(){
        return String.valueOf((int)(Math.random()*1000));
    }
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setVisible(false);
        VentanaTaquilla vTaquilla = new VentanaTaquilla(session);
        vTaquilla.setLocationRelativeTo(null);
        vTaquilla.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_comprar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblPelicula;
    private javax.swing.JLabel lblSala;
    private javax.swing.JLabel lbl_nombreSala2;
    private javax.swing.JLabel lbl_numeroAsientos;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel panelAsientos;
    private javax.swing.JPanel panelInfo;
    // End of variables declaration//GEN-END:variables
}

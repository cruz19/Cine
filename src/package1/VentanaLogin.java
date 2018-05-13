
package package1;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class VentanaLogin extends javax.swing.JFrame {

    private final Toolkit tk = Toolkit.getDefaultToolkit();
    Archivo archivo = null;
    private Session session;
    
    //temporal
    static String nombreLogin = "";
    ////////////////7
    
    public VentanaLogin() {
        setResizable(false);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        txtNickname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNickRegistro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_ingresar1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtVerify = new javax.swing.JPasswordField();
        txtPassRegistro = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("Oswald", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CINE ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtNickname.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        txtNickname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNickname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNicknameKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nickname");

        jLabel3.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contraseña");

        btn_ingresar.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(51, 51, 51));
        btn_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/login.png"))); // NOI18N
        btn_ingresar.setText("Ingresar");
        btn_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ingresarMouseClicked(evt);
            }
        });

        txtContraseña.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        txtContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyTyped(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/regresar2.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(txtContraseña))))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNickname)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Login", jPanel2);

        txtNombre.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre completo");

        txtNickRegistro.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        txtNickRegistro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNickRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNickRegistroKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nickname");

        jLabel6.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Contraseña (numérica)");

        btn_ingresar1.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        btn_ingresar1.setForeground(new java.awt.Color(51, 51, 51));
        btn_ingresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/login.png"))); // NOI18N
        btn_ingresar1.setText("Registrar");
        btn_ingresar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ingresar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ingresar1MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Verificar contraseña");

        txtVerify.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        txtVerify.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVerify.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtVerifyKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVerifyKeyTyped(evt);
            }
        });

        txtPassRegistro.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        txtPassRegistro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassRegistroKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNickRegistro)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(btn_ingresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNickRegistro))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btn_ingresar1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Registro", jPanel3);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresar1MouseClicked
            //Ningun campo puede estar vacio
        if(!txtNombre.getText().equals("") && !txtNickRegistro.getText().equals("") && !txtPassRegistro.getText().equals("") && !txtVerify.getText().equals("")){
            
                //convertir todo a minusculas
            String nombre = txtNombre.getText().trim().toLowerCase();
            String nickname = txtNickRegistro.getText().trim().toLowerCase();
            String password = txtPassRegistro.getText().trim();
            String verify_pass = txtVerify.getText().trim();
            
            if(verificarCamposRegistro(nombre,nickname,password,verify_pass)){
                
                archivo = new Archivo(new File("Archivos_txt/Usuarios.txt"));
                
                if(archivo.buscar(nickname) == null){ //Si el usuario NO existe
                    
                        //Almacenamos los datos en el Request para enviarlo
                    ArrayList<String> Request = new ArrayList();
                    Request.add(nombre);
                    Request.add(nickname);
                    Request.add(password);
                        
                        //Enviar Request para guardar en el archivo
                    archivo.guardar(Request);
                    Request.clear(); //vacia arrayList
                    archivo = null;
                    
                        //Nuevo objeto de Session
                    session = new Session(nombre,nickname,password);
                    
                        //Ocultar ventana y mostrar ventana de taquilla
                    this.setVisible(false);
                    VentanaTaquilla vTaquilla = new VentanaTaquilla(session);
                    vTaquilla.setLocationRelativeTo(null);
                    vTaquilla.setVisible(true);
                    
                    
                }else{
                    JOptionPane.showMessageDialog(this,"El nickname del usuario ya existe");
                    txtNickRegistro.setText("");
                    txtNickRegistro.requestFocus();
                }
                
            }
            
        }else{
            JOptionPane.showMessageDialog(this,"Ningún campo puede estar vacio");
        }
    }//GEN-LAST:event_btn_ingresar1MouseClicked

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        String val_pulsado = String.valueOf(evt.getKeyChar());
        
        if(!val_pulsado.matches("[a-zA-Z]") && evt.getKeyChar() != KeyEvent.VK_SPACE){
            evt.consume();
            tk.beep();
        }
        
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNickRegistroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNickRegistroKeyTyped
        String val_pulsado = String.valueOf(evt.getKeyChar());
        
        if(!val_pulsado.matches("[a-zA-Z0-9]")){
            evt.consume();
            tk.beep();
        }
    }//GEN-LAST:event_txtNickRegistroKeyTyped

    private void txtPassRegistroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassRegistroKeyTyped
        String val_pulsado = String.valueOf(evt.getKeyChar());
        
        if(!val_pulsado.matches("[0-9]")){
            evt.consume();
            tk.beep();
        }
    }//GEN-LAST:event_txtPassRegistroKeyTyped

    private void txtVerifyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVerifyKeyTyped
        String val_pulsado = String.valueOf(evt.getKeyChar());
        
        if(!val_pulsado.matches("[0-9]")){
            evt.consume();
            tk.beep();
        }
    }//GEN-LAST:event_txtVerifyKeyTyped

    private void txtNicknameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNicknameKeyTyped
        String val_pulsado = String.valueOf(evt.getKeyChar());
        
        if(!val_pulsado.matches("[a-zA-Z0-9]")){
            evt.consume();
            tk.beep();
        } 
    }//GEN-LAST:event_txtNicknameKeyTyped

    private void txtVerifyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVerifyKeyPressed
    }//GEN-LAST:event_txtVerifyKeyPressed

    private void btn_ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseClicked
        
        if(!txtNickname.getText().equals("") && !txtContraseña.getText().equals("")){
            
            try{
                
                String nicknameLogin = txtNickname.getText().trim().toLowerCase();
                String passwordLogin = txtContraseña.getText().trim();
                String llave = nicknameLogin+"@"+passwordLogin;
                
                String nombre = "";
                
                archivo = new Archivo(new File("Archivos_txt/Usuarios.txt"));
                ArrayList<String> datos;

                if( archivo.buscar(llave) != null){ //Si el usuario existe
                    
                    datos = new ArrayList(archivo.buscar(llave)); //Obteneer datos del usuario
                    
                    nombre = datos.get(0); //Obtener el nombre del usuario para enviar a Session junto a los datos ingresados
                    
                        //Completando Session
                    session = new Session(nombre,nicknameLogin,passwordLogin);
                    datos.clear();

                        //Ocultar y mostra nueva ventana
                    this.setVisible(false);
                    VentanaTaquilla vTaquilla = new VentanaTaquilla(session); //enviamos el objeto Session a la ventana
                    vTaquilla.setLocationRelativeTo(null);
                    vTaquilla.setVisible(true);

                }else{
                    JOptionPane.showMessageDialog(this, "Datos de ingreso erroneos");
                    txtNickname.setText("");
                    txtNickname.requestFocus();
                    txtContraseña.setText("");
                }
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            
            
        }else{
            JOptionPane.showMessageDialog(this,"Ningún campo puede estar vacio");
        }
        
        
    }//GEN-LAST:event_btn_ingresarMouseClicked

    private void txtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyTyped
        String val_pulsado = String.valueOf(evt.getKeyChar());
        
        if(!val_pulsado.matches("[0-9]")){
            evt.consume();
            tk.beep();
        } 
    }//GEN-LAST:event_txtContraseñaKeyTyped

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        this.setVisible(false);
        main.elegir();
    }//GEN-LAST:event_jLabel8MouseClicked

    public boolean verificarCamposRegistro(String nombre,String nickname,String password,String verify_pass){
        
        boolean verificacion = false;
        
        if(nombre.length() > 3 && nombre.length() <20){
           
            if(nickname.length() > 4 && nickname.length()<20){
                
                int contadorNumeros = 0;
                for(int i=0;i<nickname.length();i++){
                    if(Character.isDigit(nickname.charAt(i))){
                        contadorNumeros++;
                    }
                }
                
                if(contadorNumeros < 3){
                    
                    if(password.length() > 4 && password.length() <12){
                        
                        if(password.equals(verify_pass)){
                            verificacion = true;
                        }else{
                            JOptionPane.showMessageDialog(this,"Las contraseñas NO coinciden");
                            txtPassRegistro.setText("");
                            txtVerify.setText("");
                            txtPassRegistro.requestFocus();
                        }
                        
                    }else{
                        JOptionPane.showMessageDialog(this,"Longitud permitida del password [4-20]");
                        txtPassRegistro.setText("");
                        txtVerify.setText("");
                        txtPassRegistro.requestFocus();
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(this,"El nickname contiene demasiados numeros [max 2]");
                    txtNickRegistro.setText("");
                    txtNickRegistro.requestFocus();
                }
                
            }else{
                JOptionPane.showMessageDialog(this,"Longitud permitida del nickname [4-20]");
                txtNickRegistro.setText("");
                txtNickRegistro.requestFocus();
            }
            
        }else{
            JOptionPane.showMessageDialog(this,"Longitud permitida del nombre [3-20]");
            txtNombre.setText("");
            txtNombre.requestFocus();
        }
        
        return verificacion;
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_ingresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNickRegistro;
    private javax.swing.JTextField txtNickname;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassRegistro;
    private javax.swing.JPasswordField txtVerify;
    // End of variables declaration//GEN-END:variables
}


package package1;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Archivo {
    
    private final File archivo;
    
    public Archivo(File archivo){
        this.archivo = archivo;
    }
    
    public void guardar(ArrayList<String> Request){
        
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try{
            
            fw = new FileWriter(archivo,true);
            bw = new BufferedWriter(fw);
            
            for(String request : Request){
                bw.write(request+"@");
            }
            bw.newLine();
            
            //JOptionPane.showMessageDialog(null, "Guardado exitosamente");
            
        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            try{
                if(fw != null){
                    bw.close();
                }
                
            }catch(IOException e){
                System.out.println("Error: "+e.getMessage());
            }
        }
        
    }
    
    public ArrayList<Funcion> busquedaFunciones(String id){
        
        ArrayList<Funcion> enlaces = new ArrayList();
        
        id+="@";
        
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            String registro = "";
            
            while((registro=br.readLine())!=null){
                
                String[] campos = registro.split("@");
                
                if(registro.contains(id)){
                    enlaces.add(new Funcion(campos[0],campos[1],campos[2]));
                }
                
            }
            
        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            try{
                if(fr != null){
                    fr.close();
                }
            }catch(IOException e){
                System.out.println("Error: "+e.getMessage());
            }
        }
        
        return enlaces; //La funcion devolverá un ArrayList de objetos Enlace con el id enviado
    } 
    
    public ArrayList<String> getGroupAsientosOcupados(String hora_sala){
        
        hora_sala+="@";
        
        ArrayList<String> rowAsientos = new ArrayList();
        
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            String registro = "";
            
            while((registro=br.readLine())!=null){
                
                if(registro.contains(hora_sala)){
                    
                    String[] campos = registro.split("@");
                    String asientos = "";
                    
                        //Solo devolver los asientos ocupados (excluir pelicula@horario@sala)
                    for(int i=4;i<campos.length;i++){
                        asientos += campos[i]+"#"; //separador para los numeros de asiento
                    }
                    
                    rowAsientos.add(asientos);
                    
                }
                
            }
            
        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            try{
                if(fr != null){
                    fr.close();
                }
            }catch(IOException e){
                System.out.println("Error: "+e.getMessage());
            }
        }
        
        return rowAsientos;
        
    }
    
    public ArrayList<String> buscar(String id){
        
        ArrayList<String> statement = null;
        id+="@"; 
        
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            String registro = "";
            
            while((registro=br.readLine())!=null){
                
                if(registro.toLowerCase().contains(id.toLowerCase())){
                    String[] datos = registro.split("@"); ///////////////////7  !!!!!!! warning revised
                    statement = new ArrayList();
                    statement.addAll(Arrays.asList(datos)); //Obtener datos del registro a buscar
                }
                
            }
            
        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            try{
                if(fr != null){
                    fr.close();
                }
                
            }catch(IOException e){
                System.out.println("Error: "+e.getMessage());
            }
        }
        
        return statement;
        
    }
    
    public void eliminar(String id){
        
        ArrayList<String> registros = new ArrayList(excluirRegistro(id));
        
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try{
            
            fw = new FileWriter(archivo,false); //false - sobreescribir
            bw = new BufferedWriter(fw);
            
            for(String registro:registros){
                bw.write(registro);
                bw.newLine();
            }
            
            //JOptionPane.showMessageDialog(null, "Registro eliminado");
        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            try{
                if(fw != null){
                    bw.close();
                }
                
            }catch(IOException e){
                System.out.println("Error: "+e.getMessage());
            }
        }
        
    }
    
    public ArrayList<String> excluirRegistro(String id){
        
        ArrayList<String> registros = new ArrayList();
        id+="@";
        
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            String registro = "";
            
            while((registro=br.readLine())!=null){
                if(!registro.contains(id)){ //Si el registro NO contiene id@
                    registros.add(registro); //Se pasa al ArrayList<String>
                }
            }
            
        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            try{
                if(fr != null){
                    br.close();
                }
                
            }catch(IOException e){
                System.out.println("Error: "+e.getMessage());
            }
        }
        
        return registros;
        
    }
    
    public ArrayList<String> leer(){
        
        ArrayList<String> registros = new ArrayList();
        
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            String registro = "";
            
            
                //Obteniendo todos los registros en el File solicitado
            while((registro=br.readLine())!=null){
                registros.add(registro);
            }
                    
                    
        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            try{
                if(fr != null){
                    fr.close();
                }
                
            }catch(IOException e){
                System.out.println("Error: "+e.getMessage());
            }
        }
       
        return registros; //Devolver cada registro(Linea) del File seleccionado
    }
    
}


package package1;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class GenerarPDF {
    
    private final Font fontBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
    private final Font fontNormal = new Font(Font.FontFamily.TIMES_ROMAN, 9, Font.NORMAL);
    private final Font fontItalic = new Font(Font.FontFamily.TIMES_ROMAN, 9, Font.ITALIC);
    
    public void generarPDF(Recibo recibo,String num_recibo) throws BadElementException, IOException{
        
        
        //Reporte con archivo PDF
            
            try{
                
                Document document = new Document(PageSize.A6,35,35,10,10);
                
                String ruta = "Recibos/Recibo_"+recibo.getFecha()+"_"+num_recibo+".pdf";
                
                PdfWriter pw = PdfWriter.getInstance(document, new FileOutputStream(ruta));
                
                document.open();
                
                document.add(getCinta("Recibos/cintilla.png"));
                
                document.add(getInfo(" "));
                    //header
                document.add(getHeader(recibo.getTitulo()));
                    //lineas en blanco
                document.add(getInfo(" "));
                    //imagen
                Image imagen = Image.getInstance(recibo.getRutaImagen());
                imagen.scaleAbsolute(80,50);
                imagen.setAlignment(Element.ALIGN_CENTER);
                document.add(imagen);
                    //blanco
                document.add(getInfo(" "));
                    //Contenido
                String parrafoInfo = "";
                parrafoInfo += "Usuario: "+recibo.getCliente()+"\n";
                parrafoInfo += "Película: "+recibo.getPelicula()+"\n";
                parrafoInfo += "Fecha de compra: "+recibo.getFecha()+"\n";
                parrafoInfo += "Sala: "+recibo.getSala()+"\n";
                parrafoInfo += "Horario: "+recibo.getHorario()+"\n";
                parrafoInfo += "Asientos comprados: \n";
                for(String asiento : recibo.getAsientos()){
                    parrafoInfo += asiento+" - ";
                }
                
                document.add(getInfo(parrafoInfo));
                    //vacios
                document.add(getInfo(" "));
                
                document.add(getBarCode(document,pw,recibo.getCodigo()));
                
                document.add(getInfo(" "));
                    //footer
                document.add(getFooter(recibo.getPie_pagina()));
                
                document.add(getCinta("Recibos/cintilla.png"));
                
                document.close();
                
                
            }catch(FileNotFoundException | DocumentException e){
                System.out.println("Error "+e);
            }
        
        
        
    }
    
    public Image getCinta(String ruta) throws BadElementException, IOException{
        
        Image cinta = Image.getInstance(ruta);
        cinta.scaleAbsolute(300,15);
        cinta.setAlignment(Element.ALIGN_CENTER);
        return cinta;
        
    }
    
    private Paragraph getHeader(String texto){
        Paragraph parrafo = new Paragraph();
        Chunk c = new Chunk();
        parrafo.setAlignment(Element.ALIGN_CENTER);
        c.append(texto);
        c.setFont(fontBold);
        parrafo.add(c);
        
        return parrafo;
    }
    
    private Paragraph getInfo(String texto){
        Paragraph parrafo = new Paragraph();
        Chunk c = new Chunk();
        parrafo.setAlignment(Element.ALIGN_CENTER);
        c.append(texto);
        c.setFont(fontNormal);
        parrafo.add(c);
        
        return parrafo;
    }
        
    private Paragraph getFooter(String texto){
        Paragraph parrafo = new Paragraph();
        Chunk c = new Chunk();
        parrafo.setAlignment(Element.ALIGN_RIGHT);
        c.append(texto);
        c.setFont(fontItalic);
        parrafo.add(c);
        
        return parrafo;
    }
    
    private Image getBarCode(Document document,PdfWriter pw, String codigo){
        
        PdfContentByte cImg = pw.getDirectContent();
        Barcode128 code128 = new Barcode128();
        code128.setCode(obtenerFormato(codigo));
        code128.setCodeType(Barcode128.CODE128);
        code128.setTextAlignment(Element.ALIGN_CENTER);
        
        //Crear imagen
        Image imagen = code128.createImageWithBarcode(cImg, BaseColor.BLACK, BaseColor.BLACK);
        float scaler = ((document.getPageSize().getWidth() - document.leftMargin() - document.rightMargin() -0) / imagen.getWidth()*50);
        
        imagen.scalePercent(scaler);
        
        imagen.setAlignment(Element.ALIGN_CENTER);
        
        return imagen;
        
    }
    
    private String obtenerFormato(String num){
        NumberFormat form = new DecimalFormat("0000000");
        return form.format(num != null ? Integer.parseInt(num) : 0000000);
    }
    
    
    
}

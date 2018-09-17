/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoestruturadados.manipuladado;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Henrique
 */
public class ControlaArquivo {
    private final int tamanhoRegistro;
    private final String caminhoArq;
    public ControlaArquivo(int tamanhoRegistro,String caminhoArq) {
        this.tamanhoRegistro = tamanhoRegistro;
        this.caminhoArq = caminhoArq;
    }    
    
    public byte[] pegaRegistro(int posicao){
        try {
            byte[] registro = new byte[tamanhoRegistro];
            RandomAccessFile accessFile = new RandomAccessFile(caminhoArq, "r");
            int inicio = posicao*(tamanhoRegistro);
            accessFile.seek(inicio);
           
            int a =accessFile.read(registro);
            String b = new String(registro);
            return registro;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControlaArquivo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (IOException ex) {
            Logger.getLogger(ControlaArquivo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    protected File acessaArq(){
        try {
            RandomAccessFile accessFile = new RandomAccessFile(caminhoArq, "r");
            Object readChar = accessFile.readLine();
            Object readChar1 = accessFile.read();
            System.err.println(readChar);
            System.err.println(readChar1);
            
                accessFile.seek(0);
                while(accessFile.getFilePointer() < accessFile.length()) {
                    byte readByte = accessFile.readByte();
                    char a = (char) readByte;
                    System.out.println(readByte+" "+a);
                }
        }
        catch (EOFException eof) {

        }
        // Chegou ao final do arquivo }
        catch (IOException e) {
        // Problemas ao acessar o arquivo }
        }
        return null;        
    }
}    
  

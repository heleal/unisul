/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Henrique
 */
public class GerenteArquivo {
    RandomAccessFile arquivo;
    static String nomeArquivo = "arq.dat";
    public RandomAccessFile getArquivo() {
        return arquivo;
    }

    public void setArquivo(RandomAccessFile arquivo) {
        this.arquivo = arquivo;
    }
    
    
    public void abrir() {
        try {
            File NomeArquivo = new File (nomeArquivo);
            setArquivo(new RandomAccessFile(NomeArquivo, "rw"));
        }
        catch(IOException e) {
            System.out.println("Erro ao abrir o arquivo:"+e);
        }
    }

    public void adicionarregistro() {
        try {
            RegistroObjeto registro = new RegistroObjeto();
            registro.leitura();
            getArquivo().seek(getArquivo().length());
            //registro.escrever(getArquivo());
            registro.escrita(getArquivo());
        }
        catch (IOException e){
            //System.out.println("Erro :" + io);
            System.out.println("Erro :" + e);
        }
    }
    
    public void listar() {
        RegistroObjeto registro = new RegistroObjeto();
        try {
            getArquivo().seek(0);
            while(getArquivo().getFilePointer() < getArquivo().length()) {
                //registro.ler(arquivo);
                registro.leitura(getArquivo());
                registro.imprimir();
            }
        }
        catch (EOFException eof) {
        // Chegou ao final do arquivo 
        }
        catch (IOException e) {
        // Problemas ao acessar o arquivo 
        }
    }
        

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Henrique
 */
public class RegistroObjeto extends Objeto {
    public RegistroObjeto() { 
        // Construtor sem Argumentos
        super();
    }
    public RegistroObjeto (int inteiro, String literal) { 
        // Construtor com Argumentos
        super(inteiro, literal);
    }
    public void leitura(RandomAccessFile arquivo ) throws IOException {
        setInteiro( arquivo.readInt() );
        setLiteral( leString( arquivo, 15 ) ); 
    }
    
    private String leString(RandomAccessFile arquivo, int tamanho) throws IOException {
    char palavra[] = new char[tamanho];
        char temp;
        for(int i=0; i< palavra.length; i++) {
            temp = arquivo.readChar();
            palavra[i] = temp; }
        return new String (palavra).replace('\0', ' '); 
    }
    
    public void escrita(RandomAccessFile arquivo ) throws IOException {
        arquivo.writeInt( getInteiro() );
        escreveString( arquivo , getLiteral(), 15); 
    }
    
    private void escreveString(RandomAccessFile arquivo, String palavra, int tamanho)
    throws IOException {
        StringBuffer buf = null;
        if ( palavra != null )
            buf = new StringBuffer(palavra);
        else
            buf=new StringBuffer( tamanho );
        buf.setLength(tamanho);
        arquivo.writeChars( buf.toString() );
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

/**
 *
 * @author Henrique
 */
public class Objeto {
private int inteiro; // 4 bytes
private String literal; // 30 bytes (15 char)
    public Objeto(){
        this(0,""); 
    }
    public Objeto(int _inteiro, String _literal){
        setInteiro( _inteiro );
        setLiteral( _literal ); 
    }
    public void setInteiro(int _inteiro) { 
        this.inteiro = _inteiro;
    }
    public void setLiteral(String _literal) { 
        this.literal = _literal;
    }
    public int getInteiro() {
        return this.inteiro;
    }
    public String getLiteral() { 
        return this.literal;
    }
    public void leitura() {

    }
    public void imprimir() { 
        System.out.println(getInteiro());
    }

    @Override
    public String toString() {
        return "Objeto{" + "inteiro=" + inteiro + ", literal=" + literal + '}';
    }

    
    public int getTamanho() { 
        return 34; 
    }
} 

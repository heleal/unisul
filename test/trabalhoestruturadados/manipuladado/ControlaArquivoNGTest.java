/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoestruturadados.manipuladado;

import java.io.File;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Henrique
 */
public class ControlaArquivoNGTest {
    static int tamanhoRegistro = 10;
    static String camArq = "D:\\unisul\\programas aulas\\TrabalhoEstruturaDados\\src\\dados\\arq";
    ControlaArquivo controlaArquivo;
    public ControlaArquivoNGTest() {
        controlaArquivo = new ControlaArquivo(tamanhoRegistro, camArq);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of pegaRegistro method, of class ControlaArquivo.
     */
    @Test
    public void testPegaRegistro() {
        System.out.println("pegaRegistro");
        int posicao = 2;
        ControlaArquivo instance = controlaArquivo;
        byte[] expResult = null;
        byte[] result = instance.pegaRegistro(posicao);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of acessaArq method, of class ControlaArquivo.
     */
    @Test
    public void testAcessaArq() {
        System.out.println("acessaArq");
        ControlaArquivo instance = controlaArquivo;
        File expResult = null;
        File result = instance.acessaArq();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

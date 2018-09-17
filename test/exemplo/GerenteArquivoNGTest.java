/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

import java.io.RandomAccessFile;
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
public class GerenteArquivoNGTest {
    
    public GerenteArquivoNGTest() {
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
     * Test of getArquivo method, of class GerenteArquivo.
     */
    @Test
    public void testGetArquivo() {
        System.out.println("getArquivo");
        GerenteArquivo instance = new GerenteArquivo();
        RandomAccessFile expResult = null;
        RandomAccessFile result = instance.getArquivo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArquivo method, of class GerenteArquivo.
     */
    @Test
    public void testSetArquivo() {
        System.out.println("setArquivo");
        RandomAccessFile arquivo = null;
        GerenteArquivo instance = new GerenteArquivo();
        instance.setArquivo(arquivo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of abrir method, of class GerenteArquivo.
     */
    @Test
    public void testAbrir() {
        System.out.println("abrir");
        GerenteArquivo instance = new GerenteArquivo();
        instance.abrir();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarregistro method, of class GerenteArquivo.
     */
    @Test
    public void testAdicionarregistro() {
        System.out.println("adicionarregistro");
        GerenteArquivo instance = new GerenteArquivo();
        instance.adicionarregistro();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar method, of class GerenteArquivo.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        GerenteArquivo instance = new GerenteArquivo();
        instance.abrir();
        instance.listar();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

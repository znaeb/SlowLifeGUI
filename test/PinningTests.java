/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Benjamin
 */
public class PinningTests {
    
    public PinningTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of resetBeenAlive method, of class Cell.
     */
    /*
    @Test
    public void testResetBeenAlive() {
        System.out.println("resetBeenAlive");
        Cell instance = new Cell();
        instance.resetBeenAlive();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class Cell.
     */
    /*
    @Test
    public void testReset() {
        System.out.println("reset");
        Cell instance = new Cell();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlive method, of class Cell.
     */
    /*
    @Test
    public void testGetAlive() {
        System.out.println("getAlive");
        Cell instance = new Cell();
        boolean expResult = false;
        boolean result = instance.getAlive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of toString method, of class Cell.
     */
    /*
    @Test
    public void testToString() {
        System.out.println("toString");
        Cell instance = new Cell();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlive method, of class Cell.
     */
    /*
    @Test
    public void testSetAlive() {
        System.out.println("setAlive");
        boolean a = false;
        Cell instance = new Cell();
        instance.setAlive(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCellsSize method, of class MainPanel.
     */
    /*
    @Test
    public void testGetCellsSize() {
        System.out.println("getCellsSize");
        MainPanel instance = null;
        int expResult = 0;
        int result = instance.getCellsSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCells method, of class MainPanel.
     */
    /*
    @Test
    public void testSetCells() {
        System.out.println("setCells");
        Cell[][] cells = null;
        MainPanel instance = null;
        instance.setCells(cells);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCells method, of class MainPanel.
     */
    /*
    @Test
    public void testGetCells() {
        System.out.println("getCells");
        MainPanel instance = null;
        Cell[][] expResult = null;
        Cell[][] result = instance.getCells();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of backup method, of class MainPanel.
     */
    /*
    @Test
    public void testBackup() {
        System.out.println("backup");
        MainPanel instance = null;
        instance.backup();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of debugPrint method, of class MainPanel.
     */
    /*
    @Test
    public void testDebugPrint() {
        System.out.println("debugPrint");
        MainPanel instance = null;
        instance.debugPrint();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class MainPanel.
     */
    /*
    @Test
    public void testMainPanelToString() {
        System.out.println("toString: MainPanel");
        MainPanel instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class MainPanel.
     * tests whether the cells are the same after a run, when they should be the same,
     * according to the previous implementation this passes
     */
    @Test
    public void testRunEquals() {
        System.out.println("run: equals");
        MainPanel instance = new MainPanel(15);
        Cell[][] cells=instance.getCells();
        cells[6][9].setAlive(true);
        cells[6][10].setAlive(true);
        cells[7][9].setAlive(true);
        cells[7][10].setAlive(true);
        instance.setCells(cells);
        instance.run();
        System.out.println(instance.toString());
        // TODO review the generated test code and remove the default call to fail.
        assertArrayEquals(cells,instance.getCells());
    }
    
    /**
     * Test of run method, of class MainPanel.
     * tests whether the cells changed to make a square,
     * like it used to in the original program
     */
    @Test
    public void testRunSquare() {
        System.out.println("run: Square");
        MainPanel instance = new MainPanel(15);
        Cell[][] cells=new Cell[15][15];
        for (int i=0;i<15;i++){
            for (int j=0;j<15; j++){
                if ((i==6 &&j==9)||(i==6 && j==10)||(i==7 && j==9)){
                    cells[i][j]=new Cell(true);
                }else{
                    cells[i][j]=new Cell(false);
                }
            }
        }
        //cells[6][9].setAlive(true);
        //cells[6][10].setAlive(true);
        //cells[7][9].setAlive(true);
        instance.setCells(cells.clone());
        System.out.println(instance.toString());
        instance.run();
        //cells[7][10].setAlive(true);
        System.out.println(instance.toString());
        System.out.println(cells[7][10].getAlive());
        //Cell[][] expResult=new Cell[cells..length][cells.length];
        // TODO review the generated test code and remove the default call to fail.
        assertArrayEquals(cells,instance.getCells());
        
    }
    
    /**
     * Test of runContinuous method, of class MainPanel.
     */
    @Test
    public void testRunContinuous() {
        System.out.println("runContinuous");
        MainPanel instance = null;
        instance.runContinuous();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class MainPanel.
     */
    /*
    @Test
    public void testStop() {
        System.out.println("stop");
        MainPanel instance = null;
        instance.stop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertToBoolean method, of class MainPanel.
     */
    /*
    @Test
    public void testConvertToBoolean() {
        System.out.println("convertToBoolean");
        Cell[][] cells = null;
        MainPanel instance = null;
        boolean[][] expResult = null;
        boolean[][] result = instance.convertToBoolean(cells);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undo method, of class MainPanel.
     */
    /*
    @Test
    public void testUndo() {
        System.out.println("undo");
        MainPanel instance = null;
        instance.undo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class MainPanel.
     */
    /*
    @Test
    public void testClear() {
        System.out.println("clear");
        MainPanel instance = null;
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of load method, of class MainPanel.
     */
    /*
    @Test
    public void testLoad() {
        System.out.println("load");
        ArrayList<String> lines = null;
        MainPanel instance = null;
        instance.load(lines);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveFile method, of class FileAccess.
     */
    /*
    @Test
    public void testSaveFile() {
        System.out.println("saveFile");
        String fileName = "";
        String m = "";
        boolean expResult = false;
        boolean result = FileAccess.saveFile(fileName, m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of safeSaveFile method, of class FileAccess.
     */
    /*
    @Test
    public void testSafeSaveFile() {
        System.out.println("safeSaveFile");
        String fileToWrite = "";
        String backupFile = "";
        String m = "";
        boolean expResult = false;
        boolean result = FileAccess.safeSaveFile(fileToWrite, backupFile, m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadFile method, of class FileAccess.
     */
    /*
    @Test
    public void testLoadFile() {
        System.out.println("loadFile");
        String fileName = "";
        ArrayList<String> expResult = null;
        ArrayList<String> result = FileAccess.loadFile(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}

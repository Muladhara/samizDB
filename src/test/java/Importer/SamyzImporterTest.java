package Importer;

import importer.SamyzImporter;
import org.json.simple.parser.ParseException;
import runtime.OperandNotInMemory;

import java.io.IOException;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Roberto on 29/02/2016.
 */
public class SamyzImporterTest {

    SamyzImporter importer = new SamyzImporter();

    @org.junit.Test
    public void testCreateDBfromURLvalid(){
        try {
            System.out.println(importer.createDBfromURL("http://www.samizdata.it/timeseries/FRED/ALL/CEU3100000001").toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void testAddToLocalDBvalid() throws OperandNotInMemory {
        String path = "C:Users\\Roberto\\Documents\\test.json";
        try {
            System.out.println(importer.addToLocalDB(path).toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void testCreateDBfromURLunvalid(){
        try {
            System.out.println(importer.createDBfromURL("http://www.samizdata.it/timeseries/FRED/ALL/CE").toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}

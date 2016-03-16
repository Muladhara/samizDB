package runtime;

import console.ConsoleManager;
import importer.SamyzImporter;
import model.Dataset;
import org.json.simple.parser.ParseException;
import persistence.DatasetNotFoundException;
import persistence.MongoAdapter;

import javax.xml.crypto.Data;
import java.io.Console;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetOperator extends Function<Dataset> {

    private String datasetId;
    private SamyzImporter importer = new SamyzImporter();

    public GetOperator(String datasetId) {
        this.datasetId = datasetId;
    }

    //@Override
    public Dataset getDataset() throws DatasetNotFoundException, OperandNotInMemory {
        Dataset ds = new Dataset(this.datasetId);

        Pattern p = Pattern.compile("http:.*");
        Pattern p2 = Pattern.compile("/(.+/)+");
        Pattern p3 = Pattern.compile(".+json$");
        Matcher samyz = p.matcher(this.datasetId);
        if(samyz.find()){
            try {
                ds = importer.createDBfromURL(this.datasetId);
            } catch (IOException e) {
                //ConsoleManager.printMessage("Cannot create Dataset from the specified URL");
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        else{
            Matcher path = p3.matcher(this.datasetId);
            if(path.find()){
                try {
                    ds = importer.addToLocalDB(this.datasetId);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ParseException e) {
                    e.printStackTrace();
                } catch(OperandNotInMemory e){
                    ConsoleManager.printMessage("The file at the specified path is invalid or not present");
                    ds = null;
                }

            }
            else{
                ds = MongoAdapter.getInstance().loadDatasetById(this.datasetId);

            }
        }

        return ds;
    }

    @Override
    public Dataset performOperation()  {
        try {
            return getDataset();
        } catch (DatasetNotFoundException e) {
            e.printStackTrace();
        } catch (OperandNotInMemory operandNotInMemory) {
            operandNotInMemory.printStackTrace();
        }
        return null;
    }

}

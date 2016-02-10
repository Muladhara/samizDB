package runtime;

import model.Dataset;
import persistence.DatasetNotFoundException;
import persistence.MongoAdapter;

public class GetOperator extends Function {

    private String datasetId;

    public GetOperator(String datasetId) {
        this.datasetId = datasetId;
    }

    @Override
    public Dataset getDataset() throws DatasetNotFoundException {
        return MongoAdapter.getInstance().loadDatasetById(this.datasetId);
    }
}

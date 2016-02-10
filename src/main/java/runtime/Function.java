package runtime;

import model.Dataset;
import persistence.DatasetNotFoundException;

public abstract class Function {

    public abstract Dataset getDataset() throws DatasetNotFoundException;
}

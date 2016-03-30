package runtime.aggrFunc;

import model.Dataset;
import runtime.Function;

import java.util.LinkedList;

/**
 * Created by Roberto on 18/03/2016.
 */
public class AggrSum extends Function<Dataset> {
    LinkedList<String> ids;
    Dataset dataset;

    public AggrSum(Dataset dataset, LinkedList<String> ids){
        this.ids = ids;
        this.dataset = dataset;
    }

    @Override
    public Dataset performOperation() {
        return null;
    }
}

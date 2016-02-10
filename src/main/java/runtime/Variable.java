package runtime;

import model.Dataset;
import persistence.DatasetNotFoundException;

public class Variable extends Function {

    private String name;
    private Function function;

    public Variable(String name, Function function) {
        this.function = function;
        this.name = name;
    }

    @Override
    public Dataset getDataset() throws DatasetNotFoundException {
        return this.function.getDataset();
    }
}

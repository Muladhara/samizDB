package model;

import runtime.Function;

import java.util.ArrayList;
import java.util.List;

public class Dataset extends Function<Dataset> {

    private String id;
    private List<DataPoint> dataPoints = new ArrayList<DataPoint>();

    public Dataset(String id) {
        this.id = id;
    }

    public void addDataPoint(DataPoint dp) {
        this.dataPoints.add(dp);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Dataset: ").append(id).append("\n\n");
        dataPoints.forEach(dp -> sb.append(dp.toString()));
        return sb.toString();
    }

    /*
    @Override
    public Dataset getDataset() {
        return this;
    }
    */

    @Override
    public Dataset performOperation() {
        return this;
    }


}

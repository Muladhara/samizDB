package persistence;

import model.Dataset;

import static org.junit.Assert.*;

public class MongoAdapterTest {

    @org.junit.Test
    public void testLoadDatasetById() throws Exception {
        Dataset ds = MongoAdapter.getInstance().loadDatasetById("fred/all/gdp");
        System.out.println(ds);
    }
}
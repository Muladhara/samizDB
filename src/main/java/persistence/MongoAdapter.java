package persistence;


import com.mongodb.Block;
import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import model.ComponentRole;
import model.ComponentType;
import model.DataPoint;
import model.Dataset;
import org.bson.Document;

import java.util.List;
import java.util.Set;

public class MongoAdapter {

    public static MongoAdapter instance;

    public static MongoAdapter getInstance() {
        if(instance==null)
            instance = new MongoAdapter();
        return instance;
    }

    public Dataset loadDatasetById(String id) throws DatasetNotFoundException {
        MongoDatabase mongoDb = this.getMongoClient();
        FindIterable<Document> timeseries = mongoDb.getCollection("timeseries").find(new Document("metadata.id", id));

        Document doc = timeseries.first();

        if(doc==null)
            throw new DatasetNotFoundException("Dataset not found: " + id);

        List<Document> data = (List<Document>) doc.get("data");
        Document metadata = (Document) doc.get("metadata");

        Dataset ds = new Dataset(id);

        DataPoint dataPoint = null;
        Set<String> keys;

        for (Document dpd : data) {
            keys = dpd.keySet();
            String v;
            ComponentRole role;
            dataPoint = new DataPoint();
            for (String k : keys) {
                v = (String)dpd.get(k);

                if(k.equalsIgnoreCase("tr") || k.equalsIgnoreCase("realtime_start") || k.equalsIgnoreCase("realtime_end")) {
                    role = ComponentRole.METADATA;
                } else if (k.equalsIgnoreCase("date")) {
                    role = ComponentRole.IDENTIFIER;
                } else {
                    role = ComponentRole.MEASURE;
                }

                dataPoint.createComponentByNameTypeRole(k, ComponentType.STRING, role);
                dataPoint.addVTLValueFromString(k, v);
                ds.addDataPoint(dataPoint);
            }
        }

        return ds;

    }

    private MongoDatabase getMongoClient() {
        MongoClient mongoClient = new MongoClient();
        return mongoClient.getDatabase("glimpse");
    }

}

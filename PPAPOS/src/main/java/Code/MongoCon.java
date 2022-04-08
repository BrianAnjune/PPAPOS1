/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author briananjune
 */
import com.mongodb.*;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class MongoCon {

    ConnectionString connectionString = new ConnectionString("mongodb://admin:123@cluster0-shard-00-00.abxvq.mongodb.net:27017,cluster0-shard-00-01.abxvq.mongodb.net:27017,cluster0-shard-00-02.abxvq.mongodb.net:27017/sample_airbnb?ssl=true&replicaSet=atlas-f7a59k-shard-0&authSource=admin&retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
    MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("sample_airbnb");

}

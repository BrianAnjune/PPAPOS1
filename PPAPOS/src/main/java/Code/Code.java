/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import com.mongodb.BasicDBObject;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author briananjune
 */
public class Code {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://admin:123@cluster0.abxvq.mongodb.net/sample_airbnb?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        MongoClient mongoClient = MongoClients.create(settings);

        MongoCredential credential;
        credential = MongoCredential.createCredential("admin", "sample_airbnb",
                "123".toCharArray());
        MongoDatabase database = mongoClient.getDatabase("sample_airbnb");

        System.out.println("Credentials ::" + credential);
        //Creating a collection 
        database.createCollection("examplesCollection");
        System.out.println("Collection created successfully");
    }

}

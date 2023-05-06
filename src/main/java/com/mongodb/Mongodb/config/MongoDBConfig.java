package com.mongodb.Mongodb.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import java.util.Collection;

@Configuration
public class MongoDBConfig extends AbstractMongoClientConfiguration {


    @Override
    protected String getDatabaseName() {
        return "MongoDBTest";
    }


    @Override
    public MongoClient mongoClient() {
    ConnectionString connectionString = new ConnectionString("mongodb+srv://forcella1996:<password>@cluster0.n3mfevf.mongodb.net/?retryWrites=true&w=majority");
        MongoClientSettings mongoClientSettings= MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        return MongoClients.create(mongoClientSettings);
    }

    @Override
    protected Collection<String> getMappingBasePackages() {
        return super.getMappingBasePackages();
    }
}

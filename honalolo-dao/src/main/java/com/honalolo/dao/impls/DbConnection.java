package com.honalolo.dao.impls;

import org.bson.Document;

import com.honalolo.dao.Interface.IDbConnection;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


/**
 * 
 * @author dhrubajyotib
 *
 */
public class DbConnection implements IDbConnection {
	private String dbHost;

	private String dbPort;
	
	/* (non-Javadoc)
	 * @see com.honalolo.dao.impls.IDbConnection#getDatabaseConnection(java.lang.String)
	 */
	@Override
	public MongoDatabase getDatabaseConnection(String databaseName){
		MongoClient mongoClient = new MongoClient(this.dbHost,27017);
		MongoDatabase database =  mongoClient.getDatabase(databaseName);
		return database;
		
	}
	public void setDbHost(String dbHost) {
		this.dbHost = dbHost;
	}
	public void setDbPort(String dbPort) {
		this.dbPort = dbPort;
	}
	
	public static MongoClient getNewClient(ServerAddress serverAddress){
		return new MongoClient(serverAddress);
	}
	
	public static ServerAddress getServerAddress(String host, int port){
		return new ServerAddress(host,port);
	}
	
	public static MongoClient getNewClient(String host, int port){
		return new MongoClient(host,port);
	}
	
	public static MongoDatabase getDatabase(MongoClient mongoClient,String databaseName){
		return mongoClient.getDatabase(databaseName);
	}
	
	public static MongoCollection<Document> getMongoCollection(MongoDatabase database, String collection){
		return database.getCollection(collection);
	}
	
	public static MongoCredential getMongoCredential(String user, String password, String database){
//		return new MongoCredential(null, user,
//                database,
//                password.toCharArray());
		return null;
	}

	public static void main(String[] args){
		MongoClient client = getNewClient("localhost",27017);
		MongoDatabase database = getDatabase(client, "test");
		MongoCollection<Document> collection = getMongoCollection(database, "practitioner_details");
		System.out.println(collection.find());
	}
}

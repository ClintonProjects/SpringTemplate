package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "Example")
@Entity
public class ExampleObject {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int _id;
	
	@Id
	@GeneratedValue
	private ObjectId _id;
	
	
	public ObjectId getObjectId() {
		return _id;
	}
	

}

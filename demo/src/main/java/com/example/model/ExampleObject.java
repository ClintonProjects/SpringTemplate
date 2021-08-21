package com.example.model;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection="Example")
public class ExampleObject {
	
	@Id
	private int id;
	
	public ExampleObject(int id) {
		super();
		this.id = id;
	}

}

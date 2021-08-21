package com.example.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import com.example.repository.ExampleRepository;

@Service
@ComponentScan(basePackages = {"com.example"})
public class ServicesExample {

	@Autowired
	private ExampleRepository exampleRepository;
	
//	public void test() {
//		exampleRepository.save(new ExampleObject(0));
//	}
	
}

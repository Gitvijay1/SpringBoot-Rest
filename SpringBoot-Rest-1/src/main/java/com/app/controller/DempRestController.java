package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;

@RestController
@RequestMapping("/demo")
public class DempRestController {
	@GetMapping("/show")
	public ResponseEntity<Employee> show()
	{
		//get data
		//String body="WELCOME TO FIRST APP";
		//ResponseEntity<String> resp=new ResponseEntity<String>(body, HttpStatus.OK);
		Employee e=new Employee();
		e.setEid(101);
		e.setEname("raja");
		e.setJob("google");
		e.setSal(3345.9);
		ResponseEntity<Employee> resp=new ResponseEntity<Employee>(e,HttpStatus.OK);
		return resp;
	}
	//2 save data
	@PostMapping("/save")
	public ResponseEntity<String> save()
	{
		String body="save data succesfully";
		ResponseEntity<String> resp=new ResponseEntity<String>(body,HttpStatus.OK);
		return resp;
	}
	
	//3 edit data
	@PutMapping("/edit")
	public ResponseEntity<String> edit()
	{
		String body="edit data succesfully";
		ResponseEntity<String> resp=new ResponseEntity<String>(body,HttpStatus.OK);
		return resp;
	}
	//4 delete data
	@DeleteMapping("/delete")
	public ResponseEntity<String> delete()
	{
		String body="delete data succesfully";

		ResponseEntity<String> resp=new ResponseEntity<String>(body,HttpStatus.OK);

		return resp;
	}

}

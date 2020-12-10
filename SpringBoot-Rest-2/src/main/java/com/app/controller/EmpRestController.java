package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;

@RequestMapping("/save")
@RestController
public class EmpRestController {
	@PostMapping("/show")
	public ResponseEntity<String> saveDt(@RequestBody Employee e)
	
	{
		
		String body="data is"+e.toString();
		ResponseEntity< String> resp=new ResponseEntity<String>(body,HttpStatus.OK);
		return resp;
	}
	@GetMapping("/get")
	//Here ResponceBody is optional because @RestController is the combination of 
	//@Controller + @ResponseBody so @ResponseBody is not Required
	public  ResponseEntity<Employee> getdata()
	{
		Employee e=new Employee();
		e.setEid(101);
		e.setEname("raju");
		e.setJob("google");
		e.setSal(234.0);
		ResponseEntity<Employee> resp=new ResponseEntity<Employee>(e,HttpStatus.OK);
		return resp;
	}

}

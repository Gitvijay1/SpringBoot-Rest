package com.app.data;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/show")
@RestController
public class DataRestController {
	@GetMapping("/path")
	public ResponseEntity<String> pathParam(
			@PathParam("eid")Integer eid,
			@PathParam("ename")String ename
			)
	{
		String data="show data "+eid+","+ename;
		ResponseEntity< String> resp=new ResponseEntity<String>(data,HttpStatus.OK);
		return resp;
	}
	@GetMapping("/see/{sal}/{job}")
	public ResponseEntity<String> pathVariable(
			@PathVariable("sal")Double sal,
			@PathVariable("job")String job			)
	{
		String se="seen data is "+sal+","+job;
		ResponseEntity< String> resp=new ResponseEntity<String>(se,HttpStatus.OK);
		return resp;
	}

}

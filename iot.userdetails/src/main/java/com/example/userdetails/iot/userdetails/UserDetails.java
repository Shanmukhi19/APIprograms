package com.example.userdetails.iot.userdetails;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetails{
    @Autowired
	Requirements detail;
	     @GetMapping("/userdetails") 
	public Requirements userdetails(@RequestParam(value = "id", defaultValue = "1 ") int id,@RequestHeader Map<String,String> headers)
			 {
	    	 headers.forEach((key,value)->{System.out.println(String.format("%s=%s",key,value));});
	     	 
	   	   	    	 if(id==1) {
    	 detail.setUserid(1);
		 detail.setName("shanmukhi");
		 detail.setEmailid("abcd@gmail.com");
		 return detail;
    	 }
   
		return detail;
			 }
		@PostMapping("/userdetails")
		public Requirements userdetails(int id,String name,String emailid)
		{
				
				detail.setUserid(id);
				 detail.setName(name);
				 detail.setEmailid(emailid); 
				 
				 return detail;
				
	    	
	    	
	     	 }
     
}


    	

 
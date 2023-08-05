package com.aymen.daikichi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/daikichi")
public class DaikichiRoutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiRoutesApplication.class, args);
	}
	  @RequestMapping("")
      // 3. Method that maps to the request route above
      public String hello() { // 3
              return "Welcome!";
      }
	  @RequestMapping("/today")
	  public String today() {
		      return "Today you will find luck in all you endeavors !";
	  }
	  @RequestMapping("/tomorrow")
	  public String tomorrow(){
		      return "Tomorrow ,an opportunity will arise,so be sure to be open to new ideas!";
	  }

}

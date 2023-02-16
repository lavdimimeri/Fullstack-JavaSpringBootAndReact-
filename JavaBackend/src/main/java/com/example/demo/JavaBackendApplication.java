package com.example.demo;

import com.example.demo.dao.DojoBlogDao;
import com.example.demo.dao.FakeDojoBlogDataAccessService;
import com.example.demo.model.DojoBlog;
import com.example.demo.service.DojoBlogService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaBackendApplication {

	public static void main(String[] args) {
		DojoBlog dojoBlog1 = new DojoBlog(1,"firttestdojo","firsttestauthor","firsttestbody");
		DojoBlog dojoBlog2 = new DojoBlog(2,"secondtestdojo","secondtestauthor","thirdtestbody");
		FakeDojoBlogDataAccessService fk = new FakeDojoBlogDataAccessService();
        fk.insertDojoBlog(dojoBlog1);
	    fk.insertDojoBlog(dojoBlog2);
		SpringApplication.run(JavaBackendApplication.class, args);
	}

}

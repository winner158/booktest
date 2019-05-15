package com.book;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.book.bookManagement.dao")
@SpringBootApplication
public class BooktestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooktestApplication.class, args);
	}

}

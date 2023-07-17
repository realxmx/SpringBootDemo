package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.mapper.MovieMapper;
import com.example.demo.model.Movie;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private MovieMapper movieMapper;
	@Test
	void get() {
		List<Movie> movies= movieMapper.getHot();
        System.out.println("---------------------------------------------");
		System.out.println(Arrays.toString(movies.toArray()));
		movies= movieMapper.getAll();
        System.out.println("---------------------------------------------");
		System.out.println(Arrays.toString(movies.toArray()));
		movies= movieMapper.getSearch("速");
        System.out.println("---------------------------------------------");
		System.out.println(Arrays.toString(movies.toArray()));
	}
	@Test
	void getOne(){
		Movie movie=movieMapper.getMovie(4);
		System.out.println("---------------------------------------------");
		System.out.println(movie);
	}
	@Test
	void insert(){
		Movie movie=new Movie("蜘蛛侠大战金刚狼", 9, null, null, null, null);
		movieMapper.insert(movie);
	}
	@Test 
	void update(){
		Movie movie=new Movie("哈利马奎尔大战托比马奎尔", 9, null, null, null, null);
		movieMapper.update("蜘蛛侠大战金刚狼",movie);
	}

	@Test
	void delete(){
		movieMapper.delete("哈利马奎尔大战托比马奎尔");
	}
}

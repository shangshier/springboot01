package com.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot01ApplicationTests {

	@Test
	public void contextLoads() {

		List<String> list = new ArrayList();
		list.add("1班");
		list.add("2班");
		list.add("3班");
		list.add("4班");
		list.add("5班");
		list.add("6班");
		list.add("7班");
		list.add("8班");
		list.add("9班");
		list.add("10班");
		list.add("11班");
		list.add("12班");
		list.add("13班");
		list.add("14班");
		list.add("15班");
		list.add("16班");
		list.add("17班");
		list.add("18班");
		list.add("19班");
		list.add("20班");
		list.add("21班");

		list.sort((e,f) -> e.compareTo(f));
		System.out.println(list);


		String []list1={"ma","cao","yuan"};

		System.out.println(list1[3]);


	}

}

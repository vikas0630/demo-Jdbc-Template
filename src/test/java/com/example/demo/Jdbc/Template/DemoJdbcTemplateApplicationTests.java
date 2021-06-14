package com.example.demo.Jdbc.Template;

import com.example.demo.Jdbc.Template.dao.ProductDao;
import com.example.demo.Jdbc.Template.dao.ProductDaoImpl;
import com.example.demo.Jdbc.Template.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class DemoJdbcTemplateApplicationTests {

	@Autowired
	ProductDaoImpl productDaoimpl;

	@Test
	public void getProductIdTest(){


	}

}

package com.jdbcExample;

import com.jdbcExample.dao.IProductDAO;
import com.jdbcExample.dao.ProductDaoIMPL;
import com.jdbcExample.domain.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    private IProductDAO productDAO;
    private Product product;
    @Test
    public void saveAndFindAndDeleteTest() throws Exception {
        productDAO = new ProductDaoIMPL();
        product = new Product();
        product.setCode("10");
        product.setName("Nike AirJordan");
        productDAO.save(product);

        Product productDb = productDAO.findByCode("10");
        assertNotNull(productDb);
        assertEquals(product.getCode(), productDb.getCode());
        assertEquals(product.getName(), productDb.getName());

        int countDel = productDAO.delete(productDb);
        assertEquals(1, countDel);
    }
    @Test
    public void findAllTest() throws Exception {
        productDAO = new ProductDaoIMPL();
        product = new Product();
        product.setCode("10");
        product.setName("Nike AirJordan");
        productDAO.save(product);

        productDAO = new ProductDaoIMPL();
        product = new Product();
        product.setCode("20");
        product.setName("Adidas Yeezy");
        productDAO.save(product);

        List<Product> list = productDAO.findAll();
        assertNotNull(list);
        assertEquals(2, list.size());

        int countDel = 0;
        for (Product p : list) {
            productDAO.delete(p);
            countDel++;
        }
        assertEquals(list.size(), countDel);

        list = productDAO.findAll();
        assertEquals(list.size(), 0);
    }
    @Test
    public void updateTest() throws Exception {
        productDAO = new ProductDaoIMPL();
        product = new Product();
        product.setCode("10");
        product.setName("Nike AirJordan");
        productDAO.save(product);

        Product productDb = productDAO.findByCode("10");
        assertNotNull(productDb);
        assertEquals(product.getCode(), productDb.getCode());
        assertEquals(product.getName(), productDb.getName());

        productDb.setName("Adidas LeBron James NBA");
        productDb.setCode("99");
        int countUpd = productDAO.update(productDb);
        assertEquals(1, countUpd);

        Product productTest = productDAO.findByCode("10");
        assertNull(productTest);

        Product productDb2 = productDAO.findByCode("99");

        assertEquals(productDb.getCode(), productDb2.getCode());
        assertEquals(productDb.getName(), productDb2.getName());
        assertEquals(productDb.getId(), productDb2.getId());

        List<Product> list = productDAO.findAll();
        for (Product p : list) {
            productDAO.delete(p);
        }
    }
}
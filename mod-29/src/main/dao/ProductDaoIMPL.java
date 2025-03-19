package com.jdbcExample.dao;

import com.jdbcExample.dao.jdbc.ConnectionFactory;
import com.jdbcExample.domain.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoIMPL implements IProductDAO {
    @Override
    public Integer save(Product product) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlInsert();
            stm = connection.prepareStatement(sql);
            addParamsInsert(stm, product);
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
          closeConnection(connection, stm, null);
        }
    }
    @Override
    public Integer update(Product product) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlUpdate();
            stm = connection.prepareStatement(sql);
            addParamsUpdate(stm, product);
            return stm.executeUpdate();
        } catch(Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }
    @Override
    public Product findByCode(String code) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Product product = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlSelect();
            stm = connection.prepareStatement(sql);
            addParamsSelect(stm, code);
            rs = stm.executeQuery();
            if (rs.next()) {
                product = new Product();
                Long idResult = rs.getLong("ID");
                String name = rs.getString("NAME");
                String codeDb = rs.getString("CODE");
                product.setId(idResult);
                product.setName(name);
                product.setCode(codeDb);
            }
        } catch(Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }
        return product;
    }
    @Override
    public List<Product> findAll() throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Product> list = new ArrayList<>();
        Product product = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlSelectAll();
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();

            while (rs.next()) {
                product = new Product();
                Long id = rs.getLong("ID");
                String name = rs.getString("NAME");
                String code = rs.getString("CODE");
                product.setId(id);
                product.setName(name);
                product.setCode(code);
                list.add(product);
            }
        } catch(Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }
        return list;
    }
    @Override
    public Integer delete(Product product) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlDelete();
            stm = connection.prepareStatement(sql);
            addParamsDelete(stm, product);
            return stm.executeUpdate();
        } catch(Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }
    // SQLGetters && AddParams
    private String getSqlSelectAll() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM TB_PRODUCT");
        return sb.toString();
    }
    private String getSqlDelete() {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM TB_PRODUCT ");
        sb.append("WHERE CODE = ?");
        return sb.toString();
    }
    private void addParamsDelete(PreparedStatement stm, Product product) throws SQLException {
        stm.setString(1, product.getCode());
    }
    private String getSqlSelect() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM TB_PRODUCT ");
        sb.append("WHERE CODE = ?");
        return sb.toString();
    }
    private void addParamsSelect(PreparedStatement stm, String code) throws SQLException {
        stm.setString(1, code);
    }
    private String getSqlInsert() {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO TB_PRODUCT (ID, NAME, CODE) ");
        sb.append("VALUES (nextval('SQ_PRODUCT'),?,?)");
        return sb.toString();
    }
    private void addParamsInsert(PreparedStatement stm, Product product) throws SQLException {
        stm.setString(1, product.getName());
        stm.setString(2, product.getCode());
    }
    private String getSqlUpdate() {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE TB_PRODUCT ");
        sb.append("SET NAME = ?, CODE = ? ");
        sb.append("WHERE ID = ?");
        return sb.toString();
    }
    private void addParamsUpdate(PreparedStatement stm, Product product) throws SQLException {
        stm.setString(1, product.getName());
        stm.setString(2, product.getCode());
        stm.setLong(3, product.getId());
    }
    // Close connection
    private void closeConnection(Connection connection, PreparedStatement stm, ResultSet rs) {
        try {
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
}
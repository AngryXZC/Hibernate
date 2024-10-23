package com.xzc.dao;

import com.xzc.domain.User;
import com.yl.lain.utils.C3p0DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * @author xzc
 * @date 2024/10/11 09 38:55
 * @description
 */
public class UserDao {
    public User findUser(User user) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3p0DataSourceUtils.getDataSource());
        String sql = "select * from user where username=? and password=?";
        return queryRunner.query(sql,new BeanHandler<User>(User.class),user.getUsername(),user.getPassword());
    }
    public void addUser(User user) throws SQLException {

        QueryRunner runner = new QueryRunner(C3p0DataSourceUtils.getDataSource());
        String sql = "insert into user values(?,?,?,?,?,?)";
        runner.update(sql,user.getId(),user.getUsername(),user.getPassword(),user.getName(),user.getEmail(),user.getTelephone());
    }
}

package com.xzc.service;

import com.xzc.dao.UserDao;
import com.xzc.domain.User;
import com.xzc.utils.HibernateUtils;
import org.hibernate.Transaction;

import java.sql.SQLException;

/**
 * @author xzc
 * @date 2024/10/10 15 34:38
 * @description
 */
public class UserService {
    public User findUser(User user) throws SQLException {
        UserDao userDao = new UserDao();
        Transaction transaction = HibernateUtils.getCurrentSession().beginTransaction();
        User temp = null;
        try
        {
            temp = userDao.findUser(user);
            transaction.commit();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
            transaction.rollback();

        }

        return temp;
    }
    public void addUser(User user) throws SQLException {
        UserDao userDao = new UserDao();
        //打开事务
        Transaction transaction = HibernateUtils.getCurrentSession().beginTransaction();
        try {
            userDao.addUser(user);
        }catch (Exception e){
            transaction.rollback();
        }
        transaction.commit();

    }

}

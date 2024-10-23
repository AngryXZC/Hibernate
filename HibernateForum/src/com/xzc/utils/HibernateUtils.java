package com.xzc.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author xzc
 * @date 2024/10/17 03 05:25
 * @description
 */
public class HibernateUtils {
    private static SessionFactory sessionFactory=null;

    static {

        //使用hibernate
        //得到配置信息
        Configuration config=new Configuration().configure();
        //创建sessionFactory对象 功能：创建session(数据库核心对象）的工厂
        // 简单来说就是创建session对象
        //sessionFactory 负责保存和使用所有的配置信息，消耗内存资源大。
        //保证一个web应用中只有一个sessionFactory对象
        //线程安全
        sessionFactory= config.buildSessionFactory();
    }

    //获取全新的session
    public static Session getSession(){
        //获取session
        Session session=sessionFactory.openSession();
        return session;
    }
    //获取当前session
    public static Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
}

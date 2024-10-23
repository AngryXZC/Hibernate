package com.xzc.dao;

import com.xzc.domain.Answer;
import com.xzc.utils.HibernateUtils;
import org.hibernate.Session;

/**
 * @author xzc
 * @date 2024/10/23 10 01:58
 * @description
 */
public class AnswerDao {
    public void addAnswer(Answer answer) {
        Session session= HibernateUtils.getCurrentSession();
        session.save(answer);
    }
}

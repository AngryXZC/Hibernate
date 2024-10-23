package com.xzc.dao;

import com.xzc.domain.Paste;
import com.yl.lain.utils.C3p0DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author xzc
 * @date 2024/10/13 08 55:41
 * @description
 */
public class PasteDao {
    public List<Paste> getAllPaste() throws SQLException {
        QueryRunner runner=new QueryRunner(C3p0DataSourceUtils.getDataSource());
        String sql="select * from paste";
        return runner.query(sql,new BeanListHandler<Paste>(Paste.class));
    }
}

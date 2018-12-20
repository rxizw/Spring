package com.zhou.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.List;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public class TestMybatis {
    public static void main(String args[]) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        List<catagory> cs = session.selectList("listCategory");
        for(catagory c:cs){
            System.out.println(c.getName());
        }
    }
}

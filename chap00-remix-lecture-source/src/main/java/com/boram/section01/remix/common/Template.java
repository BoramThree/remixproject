package com.boram.section01.remix.common;

import com.boram.section01.remix.model.dao.EmployeeMapperNamKyu;
import com.boram.section01.remix.model.dao.EmployeeMapperYejin;
import com.boram.section01.remix.model.dao.HjPeopleMapper;
import com.boram.section01.remix.view.EmployeeViewNamKyu;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import com.boram.section01.remix.model.dao.EmployeeMapper;


    public class Template {

        private static String DRIVER =  "com.mysql.cj.jdbc.Driver";
        private static String URL = "jdbc:mysql://localhost/employee";
        private static String USER = "ohgiraffers";
        private static String PASSWORD = "ohgiraffers";

        private static SqlSessionFactory sqlSessionFactory;

        public static SqlSession getSqlSession(){
            if (sqlSessionFactory == null) {
                Environment environment = new Environment(
                        "dev",
                        new JdbcTransactionFactory(),
                        new PooledDataSource(DRIVER,URL,USER,PASSWORD)
                );

                Configuration configuration = new Configuration(environment);

                //  comment. 작성한 MenuMapper 인터페이스 mapper 로 등록
                configuration.addMapper(EmployeeMapper.class);
                configuration.addMapper(EmployeeMapperYejin.class);
                configuration.addMapper(HjPeopleMapper.class);
                configuration.addMapper(EmployeeMapperNamKyu.class);

                sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

            }
            return sqlSessionFactory.openSession(false);
        }
    }


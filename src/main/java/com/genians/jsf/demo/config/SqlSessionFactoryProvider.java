package com.genians.jsf.demo.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@Configurable
//@PropertySource("classpath:/application.yaml")
@MapperScan(basePackages = "com.genians.jsf.demo.mapper.*", sqlSessionFactoryRef = "sqlSessionFactory")
public class SqlSessionFactoryProvider {

//    @Produces
//    @ApplicationScoped
//    public SqlSessionFactory produceFactory() {
//        try {
//            String resource = "com/genians/jsf/demo/config/mybaits-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            return new SqlSessionFactoryBuilder().build(inputStream);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
    @Autowired
    private ApplicationContext applicationContext;

//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource.hikari")
//    public HikariConfig hikariConfig() {
//        return new HikariConfig();
//    }
//
//    @Bean(destroyMethod = "close")
//    public DataSource dataSource() throws Exception {
//        DataSource dataSource = new HikariDataSource(hikariConfig());
//        return dataSource;
//    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:/mapper/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}

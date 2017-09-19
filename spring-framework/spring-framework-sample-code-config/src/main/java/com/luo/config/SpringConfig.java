package com.luo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.logging.log4j2.Log4j2Impl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.sql.Driver;

/**
 * Spring配置类
 * @author luo
 */
@Configuration
@ComponentScan("com.luo")
@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {

    /**
     * Datasource
     */
    @Bean(initMethod = "init", destroyMethod = "close")
    public DataSource dataSource(Environment environment) throws Exception {
        DruidDataSource dataSource = new DruidDataSource();
        Driver driver = null;
        try {
            driver = (Driver) Class.forName(environment.getProperty("dbDriver")).newInstance();
        } catch (Exception e) {
            throw e;
        }
        dataSource.setDriver(driver);
        dataSource.setUrl(environment.getProperty("dbUrl"));
        dataSource.setUsername(environment.getProperty("dbUsername"));
        dataSource.setPassword(environment.getProperty("dbPassword"));
        dataSource.setMaxWait(2000);

        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource, ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setMapperLocations(applicationContext
                .getResources("classpath*:mapper/*Mapper.xml"));
        factoryBean.setTypeAliasesPackage("com.luo.entity");
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setMapUnderscoreToCamelCase(true);
        configuration.setLogImpl(Log4j2Impl.class);

        factoryBean.setConfiguration(configuration);

        SqlSessionFactory sessionFactory = null;
        try {
            sessionFactory = factoryBean.getObject();
        } catch (Exception e) {
            throw e;
        }

        return sessionFactory;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        configurer.setBasePackage("com.luo.dao");
        return configurer;
    }

}

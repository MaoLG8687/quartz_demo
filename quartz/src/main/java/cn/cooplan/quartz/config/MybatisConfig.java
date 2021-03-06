package cn.cooplan.quartz.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan("cn.cooplan.quartz.dao")
public class MybatisConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    DataSource dataSource(){
        return new DruidDataSource();
    }
}

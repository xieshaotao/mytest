package cn.itcast.springboot.datasource;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 数据源的配置类
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年1月13日 下午8:20:55
 * @version 1.0
 */
@Configuration // 配置信息类
public class DataSourceconfiguration {
	
	@Bean(name="dataSource")
	@Primary // 主要的Bean (首选的Bean)
	@ConfigurationProperties(prefix="spring.datasource.c3p0") // 指定加载的属性
	public DataSource getDataSource(){
		System.out.println("DataSourceconfiguration");
		
		return DataSourceBuilder.create()
		            .type(ComboPooledDataSource.class) // 指定数据源的类型
		            .build(); // 构建数据源
	}
}

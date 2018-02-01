package cn.itcast.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年1月13日 下午4:59:36
 * @version 1.0
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		/** 创建SpringApplication对象 */
		SpringApplication springApplication = new SpringApplication(Application.class); 
		/** 设置关闭Banner */
		springApplication.setBannerMode(Mode.OFF);
		/** 运行 */
		springApplication.run(args);
	}
}
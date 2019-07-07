package org.sang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("org.sang.mapper")		//扫描Mapper
@EnableCaching		//修改开启redis缓存
public class HrserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrserverApplication.class, args);
	}
}

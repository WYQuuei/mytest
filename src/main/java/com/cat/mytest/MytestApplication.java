package com.cat.mytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/** 由于没有配置spring - datasource - url,因此Mybatis无法找到找到合适的加载类 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class MytestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MytestApplication.class, args);
    }

}

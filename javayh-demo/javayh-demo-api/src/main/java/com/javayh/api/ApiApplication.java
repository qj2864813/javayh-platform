package com.javayh.api;

import com.javayh.common.annotation.JavayhBootApplication;
import org.springframework.boot.SpringApplication;

/**
 * <p>
 * 测试启动类
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-03-01 20:44
 */
@JavayhBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class,args);
    }

}

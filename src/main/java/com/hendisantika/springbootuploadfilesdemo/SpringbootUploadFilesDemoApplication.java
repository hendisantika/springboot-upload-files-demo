package com.hendisantika.springbootuploadfilesdemo;

import com.hendisantika.springbootuploadfilesdemo.service.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class SpringbootUploadFilesDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootUploadFilesDemoApplication.class, args);
    }

}

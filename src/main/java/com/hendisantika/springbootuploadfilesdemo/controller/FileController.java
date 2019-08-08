package com.hendisantika.springbootuploadfilesdemo.controller;

import com.hendisantika.springbootuploadfilesdemo.service.StorageService;
import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-upload-files-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-08-09
 * Time: 05:42
 */
@Controller
public class FileController {

    private StorageService storageService;

    public FileController(StorageService storageService) {
        this.storageService = storageService;
    }
}

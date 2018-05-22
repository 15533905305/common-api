package edu.study.commonapi.program.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wjl
 * @Data 2018, 05, 21
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/")
    public String index(){
        return  "success";
    }
}

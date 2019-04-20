package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: lrk
 * 2019/4/20 22:34
 */
@Controller
public class HelloController {
    @RequestMapping(value="/hello",method= RequestMethod.GET)
    @ResponseBody
    public String sayHello(){
        return "Hello,Spring Boot!";
    }

}
/*
@Controller 注解
@Controller 对控制层类进行标注，职责是使控制层可以处理 HTTP 请求，简单可以理解为，使控制层能接受请求，处理请求并响应。

@RequestMapping 注解
@RequestMapping 对控制层类的方法进行标注，职责是标明方法对应的 HTTP 请求路由的关系映射。参数 value 主要请求映射地址，可接受多个地址。参数 method 标注 HTTP 方法，常用如： GET，POST，HEAD，OPTIONS，PUT，PATCH，DELETE，TRACE。默认是 GET HTTP 方法，在 GET 请求的情况下，可以缩写成 @RequestMapping(value = "/book/hello") 。Spring 4 支持直接使用 XXXMapping 形式的注解，比如上面代码可以写成 @GetMapping("/book/hello")。

@ResponseBody 注解
@ResponseBody 对控制层类的方法进行标注，职责是指定响应体为方法的返回值。上面代码中，案例是以字符串的形式返回，自然可以使用其他复杂对象作为返回体。
*/

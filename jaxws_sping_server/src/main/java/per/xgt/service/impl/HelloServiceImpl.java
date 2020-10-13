package per.xgt.service.impl;

import per.xgt.service.HelloService;

/**
 * @Author: Yvonneflynn's husband
 * @Email：I don't know
 * @CreateTime: 2020-10-12 10:29:11
 * @Descirption:
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hi" + name + "，Welcome to the New York！";
    }
}

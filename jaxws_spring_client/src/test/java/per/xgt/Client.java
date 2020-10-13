package per.xgt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import per.xgt.service.HelloService;

import javax.annotation.Resource;

/**
 * @Author: Yvonneflynn's husband
 * @Email：I don't know
 * @CreateTime: 2020-10-13 10:36:51
 * @Descirption:
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Client {

    //注入对象
    @Resource
    private HelloService helloService;

    @Test
    public void ask(){

        //查看接口的代理对象类型
        System.out.println(helloService.getClass());

        //远程访问服务端方法
        System.out.println(helloService.sayHello("XGT"));

    }

}

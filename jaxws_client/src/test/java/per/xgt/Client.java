package per.xgt;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import per.xgt.service.HelloService;

/**
 * @Author: Yvonneflynn's husband
 * @Email：I don't know
 * @CreateTime: 2020-10-12 10:40:25
 * @Descirption:
 */
public class Client {

    public static void main(String[] args) {

        //服务接口访问地址http://localhost:8080/xgt/hello

        //创建cxf代理工厂-通过接口生成代理对象，然后通过代理对象远程访问服务端
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

        //设置远程访问服务端地址
        factory.setAddress("http://localhost:8080/xgt/hello");

        //设置接口类型 com.sun.proxy.$Proxy34 JDK动态代理
        factory.setServiceClass(HelloService.class);

        //对接口生成代理对象
        HelloService helloService = factory.create(HelloService.class);
        //代理对象类型
        System.out.println(helloService.getClass());
        
        //远程访问服务端方法
        String result = helloService.sayHello("XGT");

        System.out.println(result);

    }

}

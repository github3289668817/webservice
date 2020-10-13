package per.xgt;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import per.xgt.service.impl.HelloServiceImpl;

/**
 * @Author: Yvonneflynn's husband
 * @Email：I don't know
 * @CreateTime: 2020-10-12 10:31:00
 * @Descirption:
 */
public class Server {

    public static void main(String[] args) {

        //发布服务的工厂
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();

        //设置服务地址
        factory.setAddress("http://localhost:8080/xgt/hello");

        //设置服务类
        factory.setServiceBean(new HelloServiceImpl());

        //添加日志输入、输出拦截器，观察soap请求以及soap响应内容
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());

        //发布服务
        factory.create();

        System.out.println("发布服务成功，端口8080......");

    }

}

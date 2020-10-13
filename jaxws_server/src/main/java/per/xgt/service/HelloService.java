package per.xgt.service;

import javax.jws.WebService;

/**
 * @Author: Yvonneflynn's husband
 * @Email：I don't know
 * @CreateTime: 2020-10-12 10:27:59
 * @Descirption: 对外发布服务的接口
 */
@WebService
public interface HelloService {

    /**
     * 对外发布服务的接口的方法
     */
    public String sayHello(String name);

}

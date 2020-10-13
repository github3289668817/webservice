package per.xgt;

import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;
import per.xgt.entity.User;

import javax.ws.rs.core.MediaType;

/**
 * @Author: Yvonneflynn's husband
 * @Email：I don't know
 * @CreateTime: 2020-10-13 12:48:36
 * @Descirption:
 */
public class Client {

    @Test
    public void testSave(){
        User user = new User();
        user.setId(100);
        user.setUsername("XGT");
        user.setCity("重庆");
        //通过WebService对象远程调用服务端
        WebClient
                .create("http://localhost:8001/ws/userService/user")
                .type(MediaType.APPLICATION_JSON)//指定数据格式为JSON
                .post(user);

    }

    @Test
    public void testGet(){

        //通过WebService对象远程调用服务端
        User user = WebClient
                .create("http://localhost:8001/ws/userService/user/1")
                .type(MediaType.APPLICATION_JSON)//指定数据格式为JSON
                .accept(MediaType.APPLICATION_JSON)
                .get(User.class);

        System.out.println(user);

    }

}

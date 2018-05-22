package edu.study.commonapi.dao;

import edu.study.commonapi.CommonApiApplicationTests;
import edu.study.commonapi.program.bean.Login;
import edu.study.commonapi.program.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.*;
/**
 * @author wjl
 * @Data 2018, 05, 21
 */
public class TestUserRepository extends CommonApiApplicationTests {

    @Autowired
    LoginRepository loginRepository;

    @Test
    public void testSave(){
        Login login = new Login();
        login.setId(8883482L);
        login.setUsername("wjl");
        loginRepository.save(login);
        //  Assert.assertEquals(true, ValueWidget.isNullObject(login, true));
    }
}

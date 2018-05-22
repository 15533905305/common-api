package edu.study.commonapi.program.repository;

import edu.study.commonapi.program.bean.Login;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by antLuck on 2018/5/21.
 */
public class LoginRepositoryTest {

    @Autowired
    LoginRepository loginRepository;

    public void testSave(){
        Login login = new Login();
        login.setId(8883482L);
        login.setUsername("wjl");
        loginRepository.save(login);

      //  Assert.assertEquals(true, ValueWidget.isNullObject(login, true));
    }
}
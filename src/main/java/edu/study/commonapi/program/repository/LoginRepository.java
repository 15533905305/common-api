package edu.study.commonapi.program.repository;

import edu.study.commonapi.program.bean.Login;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by antLuck on 2018/5/21.
 */
public interface LoginRepository extends JpaRepository<Login,String> {
}

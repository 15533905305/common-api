package edu.study.commonapi.program.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

/**
 * @author wjl
 * @Data 2018, 05, 21
 */
@Entity
@Table(name = "login")
public class Login {
  @javax.persistence.Id
  @GeneratedValue
  private long Id;
  @Column(length = 20)
  private String username;
  @Column(length = 50)
  private String password;
  @Column(length = 2)
  private Integer role;

  public long getId() {
    return Id;
  }

  public void setId(long id) {
    Id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Integer getRole() {
    return role;
  }

  public void setRole(Integer role) {
    this.role = role;
  }
}

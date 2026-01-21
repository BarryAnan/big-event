package org.example.pojo;


/**
 * 用户实体类，用于表示系统中的用户信息
 */
public class User {

  private long id;
  private String username;
  private String password;
  private String nickname;
  private String email;
  private String userPic;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;


  /**
   * 获取用户ID
   * @return 返回用户的唯一标识ID
   */
  public long getId() {
    return id;
  }

  /**
   * 设置用户ID
   * @param id 用户的唯一标识ID
   */
  public void setId(long id) {
    this.id = id;
  }


  /**
   * 获取用户名
   * @return 返回用户名
   */
  public String getUsername() {
    return username;
  }

  /**
   * 设置用户名
   * @param username 要设置的用户名
   */
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * 获取用户密码
   * @return 返回用户密码
   */
  public String getPassword() {
    return password;
  }

  /**
   * 设置用户密码
   * @param password 要设置的用户密码
   */
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   * 获取用户昵称
   * @return 返回用户昵称
   */
  public String getNickname() {
    return nickname;
  }

  /**
   * 设置用户昵称
   * @param nickname 要设置的用户昵称
   */
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  /**
   * 获取用户邮箱
   * @return 返回用户邮箱地址
   */
  public String getEmail() {
    return email;
  }

  /**
   * 设置用户邮箱
   * @param email 要设置的用户邮箱地址
   */
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * 获取用户头像
   * @return 返回用户头像路径或URL
   */
  public String getUserPic() {
    return userPic;
  }

  /**
   * 设置用户头像
   * @param userPic 要设置的用户头像路径或URL
   */
  public void setUserPic(String userPic) {
    this.userPic = userPic;
  }


  /**
   * 获取用户创建时间
   * @return 返回用户记录的创建时间戳
   */
  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  /**
   * 设置用户创建时间
   * @param createTime 要设置的用户记录创建时间戳
   */
  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  /**
   * 获取用户更新时间
   * @return 返回用户记录的最后更新时间戳
   */
  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  /**
   * 设置用户更新时间
   * @param updateTime 要设置的用户记录最后更新时间戳
   */
  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }

}

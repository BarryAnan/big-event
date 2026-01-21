package org.example.pojo;


/**
 * 分类实体类
 * 用于表示系统中的分类信息，包含分类的基本属性和操作方法
 */
public class Category {

  private long id;
  private String categoryName;
  private String categoryAlias;
  private long createUser;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;


  /**
   * 获取分类ID
   * @return 返回分类的唯一标识ID
   */
  public long getId() {
    return id;
  }

  /**
   * 设置分类ID
   * @param id 要设置的分类ID
   */
  public void setId(long id) {
    this.id = id;
  }


  /**
   * 获取分类名称
   * @return 返回分类的显示名称
   */
  public String getCategoryName() {
    return categoryName;
  }

  /**
   * 设置分类名称
   * @param categoryName 要设置的分类名称
   */
  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  /**
   * 获取分类别名
   * @return 返回分类的别名标识
   */
  public String getCategoryAlias() {
    return categoryAlias;
  }

  /**
   * 设置分类别名
   * @param categoryAlias 要设置的分类别名
   */
  public void setCategoryAlias(String categoryAlias) {
    this.categoryAlias = categoryAlias;
  }


  /**
   * 获取创建用户ID
   * @return 返回创建该分类的用户ID
   */
  public long getCreateUser() {
    return createUser;
  }

  /**
   * 设置创建用户ID
   * @param createUser 要设置的创建用户ID
   */
  public void setCreateUser(long createUser) {
    this.createUser = createUser;
  }


  /**
   * 获取创建时间
   * @return 返回分类的创建时间戳
   */
  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  /**
   * 设置创建时间
   * @param createTime 要设置的创建时间戳
   */
  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  /**
   * 获取更新时间
   * @return 返回分类的最后更新时间戳
   */
  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  /**
   * 设置更新时间
   * @param updateTime 要设置的更新时间戳
   */
  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }

}

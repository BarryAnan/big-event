package org.example.pojo;

/**
 * 文章实体类
 * 用于表示系统中的文章对象，包含文章的基本信息、状态、分类等属性
 */
public class Article {

  private long id;
  private String title;
  private String content;
  private String coverImg;
  private String state;
  private long categoryId;
  private long createUser;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;

  /**
   * 获取文章ID
   * @return 返回文章的唯一标识ID
   */
  public long getId() {
    return id;
  }

  /**
   * 设置文章ID
   * @param id 要设置的文章ID
   */
  public void setId(long id) {
    this.id = id;
  }


  /**
   * 获取文章标题
   * @return 返回文章标题字符串
   */
  public String getTitle() {
    return title;
  }

  /**
   * 设置文章标题
   * @param title 要设置的文章标题
   */
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * 获取文章内容
   * @return 返回文章内容字符串
   */
  public String getContent() {
    return content;
  }

  /**
   * 设置文章内容
   * @param content 要设置的文章内容
   */
  public void setContent(String content) {
    this.content = content;
  }


  /**
   * 获取文章封面图片地址
   * @return 返回封面图片的URL或路径字符串
   */
  public String getCoverImg() {
    return coverImg;
  }

  /**
   * 设置文章封面图片地址
   * @param coverImg 要设置的封面图片URL或路径
   */
  public void setCoverImg(String coverImg) {
    this.coverImg = coverImg;
  }


  /**
   * 获取文章状态
   * @return 返回文章当前状态字符串
   */
  public String getState() {
    return state;
  }

  /**
   * 设置文章状态
   * @param state 要设置的文章状态
   */
  public void setState(String state) {
    this.state = state;
  }


  /**
   * 获取文章所属分类ID
   * @return 返回分类的唯一标识ID
   */
  public long getCategoryId() {
    return categoryId;
  }

  /**
   * 设置文章所属分类ID
   * @param categoryId 要设置的分类ID
   */
  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }


  /**
   * 获取创建用户ID
   * @return 返回创建该文章的用户ID
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
   * 获取文章创建时间
   * @return 返回文章创建的时间戳
   */
  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  /**
   * 设置文章创建时间
   * @param createTime 要设置的文章创建时间戳
   */
  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  /**
   * 获取文章更新时间
   * @return 返回文章最后更新的时间戳
   */
  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  /**
   * 设置文章更新时间
   * @param updateTime 要设置的文章更新时间戳
   */
  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }

}

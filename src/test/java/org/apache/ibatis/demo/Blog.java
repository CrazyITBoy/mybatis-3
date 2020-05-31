package org.apache.ibatis.demo;

/**
 * @author 元胡
 * @create 2020-05-10 22:51
 */
public class Blog {

  private int id;

  private String name;

  private String memo;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  @Override
  public String toString() {
    return "Blog{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", memo='" + memo + '\'' +
      '}';
  }
}

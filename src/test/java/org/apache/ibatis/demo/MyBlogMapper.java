package org.apache.ibatis.demo;

import org.apache.ibatis.annotations.Select;

/**
 * @author 元胡
 * @create 2020-05-16 19:08
 */
public interface MyBlogMapper {
  @Select("select * from Blog where id = #{id}")
  Blog selectBlog(int id);
}

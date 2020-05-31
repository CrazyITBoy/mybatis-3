package org.apache.ibatis.demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 元胡
 * @create 2020-05-10 22:34
 */
@Slf4j
public class StartDemo {

  public static void main2(String[] args) {
    try {
      String resource = "org/mybatis/example/mybatis-config.xml";
      InputStream inputStream = null;
      inputStream = Resources.getResourceAsStream(resource);
      SqlSessionFactory sqlSessionFactory =
        new SqlSessionFactoryBuilder().build(inputStream);

      SqlSession sqlSession = sqlSessionFactory.openSession();
      BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
      Blog blog = mapper.selectBlog(1);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    try {
      String resource = "org/mybatis/example/mybatis-config.xml";
      InputStream inputStream = null;
      inputStream = Resources.getResourceAsStream(resource);
      SqlSessionFactory sqlSessionFactory =
        new SqlSessionFactoryBuilder().build(inputStream);

      SqlSession sqlSession = sqlSessionFactory.openSession();
      MyBlogMapper mapper = sqlSession.getMapper(MyBlogMapper.class);
      Blog blog = mapper.selectBlog(1);
      System.out.println(blog);
      sqlSession.commit();
      Blog blog2 = mapper.selectBlog(1);
      System.out.println(blog2);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

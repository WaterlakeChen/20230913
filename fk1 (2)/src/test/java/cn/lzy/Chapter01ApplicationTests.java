package cn.lzy;

import cn.lzy.configbean.Person;
import cn.lzy.configbean.Student;
import cn.lzy.configbean.User;
import cn.lzy.customconfig.CustonProperties;
import cn.lzy.customconfig.MyProperties;
import cn.lzy.mydatiscatalog.Comment;
import cn.lzy.mydatiscatalog.CommentMapper;
import cn.lzy.profielconfig.DBConnector;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@ImportResource("classpath:beans.xml")
public class Chapter01ApplicationTests {
    //
    public
    @Autowired
    User user;
    @Autowired
    Person person;
    @Autowired
    Student student;
    @Autowired
    ApplicationContext applicationContext;
    @Autowired
    CustonProperties custonProperties;
    //    @Value("${student.id}")
//    int id;
//    @Value("${student.name}")
//    String name;
//    @Value("${student.age}")
//    int age;
    @Autowired
    DBConnector dbConnector;
    @Autowired
    private CommentMapper commentMapper;

    @Test
    public void contextLoads() {
//        System.out.println("单元测试返回的数据"+student);
//        System.out.println("单元测试返回的person数据"+person);
//        System.out.println("单元测试返回的user数据"+user);
        Comment comment = commentMapper.findById(1);
        Comment comment5 = commentMapper.author("张三");
        System.out.println(commentMapper.author("张三"));
        Comment comment1 = new Comment();
        comment1.setContent("水水水水水");
        comment1.setAuthor("tugou");
        comment1.setaId(1);
        commentMapper.insertComment(comment1);

        Comment comment2 = new Comment();
        comment2.setContent("杀杀杀");
        comment2.setId(2);
        commentMapper.updateComment(comment2);

        Comment comment3 = new Comment();
        commentMapper.deleteComment(8);

        Comment comment4 = new Comment();
        comment4.setAuthor("张三");
        comment4.setContent("水水水水水水水");
        commentMapper.updateComment1(comment4);

        System.out.println(dbConnector.config());
        MyProperties myProperties = (MyProperties) applicationContext.getBean("MyProperties");
        if (myProperties != null) {
            myProperties.getResult();
        }
        System.out.println("id=" + custonProperties.getS() + ",name=" + custonProperties.getW());
        System.out.println(custonProperties);

    }

    @Test
    public void saveRedisPerson() {

    }

}



package cn.lzy.redis;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@RedisHash("persons")
public class Person {
    @Id
    private String id;

    @Indexed
    private String firstname;

    @Indexed
    private  String lasrname;

    public Person(String id, String firstname, String lasrname) {
        this.id = id;
        this.firstname = firstname;
        this.lasrname = lasrname;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lasrname='" + lasrname + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLasrname() {
        return lasrname;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLasrname(String lasrname) {
        this.lasrname = lasrname;
    }
}

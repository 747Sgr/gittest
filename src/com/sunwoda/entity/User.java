package com.sunwoda.entity;

/**
 * 类描述：
 *
 * @ClassName User
 * @Description User实体类
 * @Author shiguorang
 * @Date 2021/2/28 19:48
 * @Version 1.0
 */
public class User extends PageModel{

    private String name;

    private int age;

    private String sex;

    public User() {
        System.out.println("user构造函数");
    }
    static {
        System.out.println("user静态代码块");
    }
    {
        System.out.println("user初始化代码块");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}

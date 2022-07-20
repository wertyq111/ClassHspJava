package com.homework;

import com.homework.object.DAO;
import com.homework.object.User;
import org.junit.jupiter.api.Test;

/**
 * @author zhouxufeng
 * @version 1.0
 * 定义个泛型类 DAO<T>，在其中定义一个Map 成员变量，Map 的键为 String 类型，值为 T 类型。
 * 分别创建以下方法：
 * (1) public void save(String id,T entity)：保存 T 类型的对象到 Map 成员变量中
 * (2) public T get(String id)：从map 中获取 id 对应的对象
 * (3) public void update(String id, T entity)：替换map 中key为id的内容,改为entity 对象
 * (4) public List<T> list()：返回map 中存放的所有 T 对象
 * (5) public void delete(String id)：删除指定 id 对象
 * 定义一个 User 类：
 * 该类包含：private成员变量 (int类型） id, age; (String 类型）name。
 * 创建 DAO 类的对象
 * 分别调用其 save、get. update、list. delete 方法来操作 User 对象，
 * 使用 Junit 单元测试类进行测试。
 */
@SuppressWarnings({"all"})
public class Homework01 {
    public static void main(String[] args) {
    }

    @Test
    public void testGetUser() {
        DAO<User> users = new DAO<>();
        User jack = new User(1, 15, "jack");
        users.save("jack", jack);
        System.out.println(users.get("jack").getName());
    }

    @Test
    public void testUserList() {
        DAO<User> users = new DAO<>();
        User jack = new User(1, 15, "jack");
        User jhon = new User(2, 17, "jhon");
        User mary = new User(3, 21, "mary");
        users.save("jack", jack);
        users.save("jhon", jhon);
        users.save("mary", mary);

        System.out.println(users.list());
    }

    @Test
    public void testAddUser() {
        DAO<User> users = new DAO<>();
        User joe = new User(5, 28, "joe");

        users.save("joe", joe);
        System.out.println(users.list());
    }

    @Test
    public void testUpdateUser() {
        DAO<User> users = new DAO<>();
        User jack = new User(1, 15, "jack");
        User oldJack = new User(6, 33, "oldJack");
        users.save("jack", jack);
        System.out.println(users.get("jack").getName());
        users.update("jack", oldJack);
        System.out.println(users.get("jack").getName());
    }

    @Test
    public void testDeleteUser() {
        DAO<User> users = new DAO<>();
        User jack = new User(1, 15, "jack");
        User jhon = new User(2, 17, "jhon");
        User mary = new User(3, 21, "mary");
        users.save("jack", jack);
        users.save("jhon", jhon);
        users.save("mary", mary);

        System.out.println(users.list());

        users.delete("jack");
        System.out.println(users.list());
    }
}


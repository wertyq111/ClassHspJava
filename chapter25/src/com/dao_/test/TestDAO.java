package com.dao_.test;

import com.dao_.dao.ActorDAO;
import com.dao_.domain.Actor;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TestDAO {
    //测试 ActorDAO 对 actor 表的 curd 操作
    @Test
    public void testActorDAO() {
        ActorDAO actorDAO = new ActorDAO();

        // 1. 查询
        List<Actor> actors = actorDAO.queryMulti("select * from actor where id >= ?", Actor.class, 1);
        System.out.println("==查询多行结果==");
        for(Actor actor:actors) {
            System.out.println(actor);
        }

        // 2. 查询单行记录
        Actor actor = actorDAO.querySingle("select * from actor where id = ?", Actor.class, 1);
        System.out.println("==查询单行结果==");
        System.out.println(actor);

        // 3. 查询单行单列
        String name = (String) actorDAO.queryScalar("select name from actor where id = ?", 1);
        System.out.println("==查询单行单列结果==");
        System.out.println(name);

        // 4. 增
        int affectedRows = actorDAO.update("insert into actor values(null, ?, ?, ?, ?)", "周杰伦", "男", "1980-04-01", 133);
        System.out.println("==新增结果==");
        System.out.println(affectedRows > 0 ? "创建成功" : "创建失败");

        actors = actorDAO.queryMulti("select * from actor where id >= ?", Actor.class, 1);
        System.out.println("==查询多行结果==");
        for(Actor actor1:actors) {
            System.out.println(actor1);
        }

        // 5. 改
        affectedRows = actorDAO.update("update actor set name = ? where id = ?", "刘德华", 1);
        System.out.println("==新增结果==");
        System.out.println(affectedRows > 0 ? "修改成功" : "修改失败");

        actors = actorDAO.queryMulti("select * from actor where id >= ?", Actor.class, 1);
        System.out.println("==查询多行结果==");
        for(Actor actor1:actors) {
            System.out.println(actor1);
        }

        // 6. 删
        affectedRows = actorDAO.update("delete from actor where id = ?", 2);
        System.out.println("==新增结果==");
        System.out.println(affectedRows > 0 ? "删除成功" : "删除失败");

        actors = actorDAO.queryMulti("select * from actor where id >= ?", Actor.class, 1);
        System.out.println("==查询多行结果==");
        for(Actor actor1:actors) {
            System.out.println(actor1);
        }
    }
}

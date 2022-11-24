package com.service;

import com.dao.MenuDAO;
import com.domain.Menu;

import java.util.List;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class MenuService {
    //定义一个 menuDAO 属性
    private MenuDAO menuDAO = new MenuDAO();

    //根据 id 返回 Menu 对象
    public Menu getMenuById(Integer id) {
        Menu menu =
                menuDAO.querySingle(
                        "select * from menu where id = ?",
                        Menu.class,
                        id
                );
        return menu;
    }

    /**
     * 返回菜单列表
     * @return List<Menu>
     */
    public List<Menu> getMenus() {
        List<Menu> list = menuDAO.queryMulti(
                "select * from menu where 1",
                Menu.class
        );

        return list;
    }

    /**
     * 获取最大的菜单编号
     * @return Integer
     */
    public Integer getMaxMenuNumber() {
        Menu maxMenu = menuDAO.querySingle(
                "select max(id) from menu where 1",
                Menu.class
        );

        return maxMenu.getId();
    }
}

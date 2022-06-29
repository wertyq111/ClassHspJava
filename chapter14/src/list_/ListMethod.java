package list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("tom");
        System.out.println("list=" + list);

        //void add(int index, Object ele）：在index位置插入ele元素
        list.add(1, "jerry");
        System.out.println("list=" + list);
        //boolean addAll（int index，Collectioneles）：从index位置开始将eles中的所有元素添加进来
        List list1 = new ArrayList();
        list1.add("韩梅梅");
        list1.add("李雷");
        list.addAll(3, list1);
        System.out.println("list=" + list);
        //Object get（int index）：获取指定index位置的元素
        System.out.println("list.get(1)=" + list.get(1));
        //int indexOf（Object obj）：返回obj在集合中首次出现的位置
        System.out.println("list.indexOf(\"tom\")=" + list.indexOf("tom"));
        //int lastlndexOf（Object obj）：返回obj在当前集合中末次出现的位置
        System.out.println("list.lastIndexOf(\"mary\")=" + list.lastIndexOf("mary"));
        //Object remove(int index）：移除指定index位置的元素，并返回此元素
        list.remove(1);
        list.remove("tom");
        System.out.println("list=" + list);
        //Object set(int index，Object ele）：设置指定index位置的元素为ele相当于是替换
        list.set(1, "tom");
        System.out.println("list=" + list);
        //List subList(int fromlndex,int tolndex）：返回从fromlndex到tolndex位置的子集合
        System.out.println("list.subList(0, 3)=" + list.subList(0, 3));
    }
}

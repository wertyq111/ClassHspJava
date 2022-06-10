![img.png](object_/img02.png)

```text
final int x // 正确
++x //错误,不能修改final x的值，final的属性只能在初始化定义/代码块或者构造器中赋值
return x + 1;// 正确，不影响x的值
```
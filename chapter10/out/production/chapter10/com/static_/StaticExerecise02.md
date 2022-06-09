![img_1.png](exercise_img/img03.png)
#### 回答
错误的地方
```text
line 5: this.total = total; //错误,静态方法不能调用非静态成员变量,注销该行

```

修改
```text
line 5: //this.total = total;;
输出结果: 
total等于4
```
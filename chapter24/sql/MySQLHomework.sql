-- 1. 选择题
# (1).以下哪条语句是错误的？[D]
# A. SELECT empno,ename name, sal salary FROM emp;
# B. SELECT empno,ename name, sal AS salary FROM emp;
# C. SELECT ename, sal*12 AS "Annual Salary" FROM emp;
# D. SELECT ename,sal*12 Annual Salary FROM emp;

# （2).某用户希望显示补助非空的所有雇员信息,应该使用哪条语句？[B]
# A. SELECT ename,sal, comm FROM emp WHERE comm<>null;
# B. SELECT ename, sal, comm FROM emp WHERE comm IS NOT null;
# C. SELECT ename, sal, comm FROM emp WHERE comm<>0;

# (3).以下哪条语句是错误的？[C]
# A. SELECT ename,sal salary FROM emp ORDER BY sal;
# B. SELECT ename, sal salary FROM emp ORDER BY salary;
# C. SELECT ename,sal salary FROM emp ORDER BY 3;

-- 2. 写出 查看DEPT表和EMP表的结构 的sql语句
DESC java.dept;
DESC java.emp;

-- 3. 使用简单查询语句完成：
--   (1) 显示所有部门名称。
--   (2) 显示所有雇员名及其全年收入 13月(工资＋补助）,并指定列别名"年收入"
SELECT dname FROM dept WHERE 1;
SELECT ename,(IF(comm IS NOT NULL,sal + comm, sal) * 13) AS "年收入" FROM emp WHERE 1;

-- 4. 限制查询数据.
--   (1) 显示工资超过2850的雇员姓名和工资。
--   (2) 显示工资不在1500到2850之间的所有雇员名及工资。
--   (3) 显示编号为7566的雇员姓名及所在部门编号。
--   (4) 显示部门10和30中工资超过1500的雇员名及工资。
--   (5) 显示无管理者的雇员名及岗位。
SELECT ename, sal FROM emp WHERE sal > 2850;
SELECT ename, sal FROM emp WHERE sal NOT BETWEEN 1500 AND 2850;
SELECT ename, deptno FROM emp WHERE empno = 7566;
SELECT ename, sal FROM emp WHERE (deptno = 10 OR deptno = 30) AND sal > 1500;
SELECT ename, job FROM emp WHERE mgr IS NULL;

-- 5. 排序数据
--   (1) 显示在1981年2月1日 到 1981年5月1日之间雇佣的雇员名,岗位及雇佣日期,并以雇用日期进行排序。
--   (2) 显示获得补助的所有雇员名工资及补助,并以工资降序排序
SELECT ename, job, hiredate FROM emp WHERE hiredate BETWEEN '1981-02-01' AND '1981-05-01' ORDER BY hiredate DESC;
SELECT ename, sal, comm FROM emp WHERE comm IS NOT NULL AND comm <> '0' ORDER BY sal DESC;

-- 6. 根据：emp员工表 写出正确SQL
--    (1) 选择部门30中的所有员工
--    (2) 列出所有办事员(CLERK)的姓名,编号和部门编号.
--    (3) 找出佣金高于薪金的员工．
--    (4) 找出佣金高于薪金60%的员工
--    (5) 找出部门10中所有经理(MANAGER)和部门20中所有办事员(CLERK)的详细资料
SELECT * FROM emp WHERE deptno = 30;
SELECT ename, empno, deptno FROM emp WHERE job = 'CLERK';
SELECT * FROM emp WHERE IFNULL(comm, 0) > sal;
SELECT * FROM emp WHERE IFNULL(comm, 0) > (sal * 0.6);
SELECT * FROM emp WHERE (job = 'MANAGER' AND deptno = 10) OR (job = 'CLERK' AND deptno = 20);

--    (6) 找出部门10中所有经理(MANAGER),部门20中所有办事员(CLERK),还有既不是经理又不是办事员
--        但其薪金大于或等于2000的所有员工的详细资料。
--    (7) 找出收取佣金的员工的不同工作。
--    (8) 找出不收取佣金或收取的佣金低于100的员工.
--    (9) 找出各月倒数第3天受雇的所有员工.
--    (10) 找出早于12年前受雇的员工.
SELECT * FROM emp WHERE (job = 'MANAGER' AND deptno = 10)
                     OR (job = 'CLERK' AND deptno = 20)
                     OR (job != 'MANAGER' AND job != 'CLERK' AND sal > 2000);
SELECT DISTINCT job FROM emp WHERE comm IS NOT NULL;
SELECT ename, comm FROM emp WHERE comm IS NULL OR IFNULL(comm, 0) < 100;
#SELECT * FROM emp WHERE MONTH(DATE_ADD(hiredate, INTERVAL 3 DAY)) != MONTH(hiredate);
SELECT * FROM emp WHERE DATE_SUB(LAST_DAY(hiredate), INTERVAL 2 DAY) = hiredate;
SELECT * FROM emp WHERE DATE_SUB(NOW(), INTERVAL 12 YEAR) > hiredate;

--    (11) 以首字母小写的方式显示所有员工的姓名。
--    (12) 显示正好为5个字符的员工的姓名。
--    (13) 显示不带有"R"的员工的姓名
--    (14) 显示所有员工姓名的前三个字符.
--    (15) 显示所有员工的姓名,用a替换所有"A”
SELECT CONCAT(LCASE(LEFT(ename, 1)), SUBSTR(ename, 2)) AS '员工姓名' FROM emp WHERE 1;
SELECT ename FROM emp WHERE LENGTH(ename) = 5;
SELECT ename FROM emp WHERE ename NOT LIKE '%R%';
SELECT LEFT(ename, 3) FROM emp WHERE 1;
SELECT REPLACE(ename, 'A', 'a') FROM emp WHERE 1;

--    (16) 显示满10年服务年限的员工的姓名和受雇日期.
--    (17) 显示员工的详细资料,按姓名排序
--    (18) 显示员工的姓名和受雇日期,根据其服务年限将最老的员工排在最前面.
--    (19) 显示所有员工的姓名、工作和薪金,按工作降序排序,若工作相同则按薪金排序
--    (20) 显示所有员工的姓名、加入公司的年份和月份,按受雇日期所在月排序,若月份相同则将最早年份的员工排在最前面
SELECT ename, hiredate FROM emp WHERE DATE_SUB(NOW(), INTERVAL 10 YEAR) > hiredate;
SELECT * FROM emp WHERE 1 ORDER BY ename ASC;
SELECT ename, hiredate FROM emp WHERE 1 ORDER BY hiredate ASC;
SELECT ename, job, sal FROM emp WHERE 1 ORDER BY job DESC, sal DESC;
SELECT ename, YEAR(hiredate) as year, MONTH(hiredate) as month FROM emp WHERE 1 ORDER BY month DESC, year ASC;

--    (21) 显示在一个月为30天的情况所有员工的日薪金,忽略余数.
--    (22) 找出在(任何年份的）2月受聘的所有员工,
--    (23) 对于每个员工显示其加入公司的天数.
--    (24) 显示姓名字段的任何位置包含"A"的所有员工的姓名。
--    (25) 以年月日的方式显示所有员工的服务年限．（大概）
SELECT FLOOR(sal / 30) AS day_sal FROM emp WHERE 1;
SELECT * FROM emp WHERE MONTH(hiredate) = 2;
SELECT DATEDIFF(NOW(), hiredate) FROM emp WHERE 1;
SELECT ename FROM emp WHERE ename LIKE '%A%';
SELECT ename,
       FLOOR(DATEDIFF(NOW(), hiredate) / 365) AS year,
       FLOOR(DATEDIFF(NOW(), hiredate) % 365 / 31) AS month,
       DATEDIFF(NOW(), hiredate) % 31 AS day
FROM emp WHERE 1;

-- 8. 根据：emp员工表,dept部门表,工资 = 薪金＋佣金 写出正确SQL
--    (1) 列出至少有一个员工的所有部门
SELECT dname, COUNT(e.empno)
FROM dept d
    LEFT JOIN emp e ON e.deptno = d.deptno
WHERE 1
GROUP BY d.deptno
HAVING COUNT(e.empno) > 0;

--    (2) 列出薪金此“SMITH” 多的所有员工
SELECT * FROM emp WHERE sal > IFNULL((
    SELECT sal FROM emp WHERE ename = 'SMITH'), 0);

--    (3) 列出受雇日期晚于其直接上级的所有员工
SELECT e.empno, e.ename, e.mgr, e.hiredate, m.empno, m.ename, m.hiredate
FROM emp e
     LEFT JOIN emp m ON m.empno = e.mgr
WHERE e.hiredate > m.hiredate;

--    (4) 列出部门名称和这些部门的员工信息,同时列出那些没有员工的部门。
SELECT d.*, e.*
FROM dept d
    LEFT JOIN emp e ON d.deptno = e.deptno
WHERE 1;

--    (5) 列出所有,"CLERK"（办事员）的姓名及其部门名称。
SELECT ename, dname
FROM emp e
    LEFT JOIN dept d on d.deptno = e.deptno
WHERE e.job = 'CLERK';

--    (6) 列出最低薪金大于1500的各种工作。
SELECT job
FROM emp
WHERE 1
GROUP BY job
HAVING MIN(sal) > 1500;

--    (7) 列出在部门"SALES”(销售部）工作的员工的姓名。
SELECT ename
FROM emp e LEFT JOIN dept d ON d.deptno = e.deptno
WHERE dname = 'SALES';

--    (8) 列出薪金高于公司平均薪金的所有员工。
SELECT ename, sal + IFNULL(comm, 0)
FROM emp
WHERE sal > (SELECT AVG(sal) FROM emp WHERE 1);

--    (9) 列出与"SCOTT" 从事相同工作的所有员工
SELECT * FROM emp WHERE job = (SELECT job FROM emp WHERE ename = 'SCOTT') AND ename != 'SCOTT';

--    (10) 列出薪金高于在部门30工作的所有员工的薪金的员工姓名和薪金
SELECT ename, sal FROM emp WHERE sal > ALL(SELECT sal FROM emp WHERE deptno = 30);

--    (11) 列出在每个部门工作的员工数量、平均工资和平均服务期限。
SELECT count(*), AVG(sal + IFNULL(comm, 0)), FORMAT(AVG(DATEDIFF(NOW(), hiredate) / 365), 2)
FROM emp
WHERE 1
GROUP BY deptno;

--    (12) 列出所有员工的姓名、部门名称和工资。
SELECT ename, dname, (sal + IFNULL(comm, 0)) FROM emp e, dept d WHERE d.deptno = e.deptno;

--    (13) 列出所有部门的详细信息和部门人数。
SELECT d.*, IFNULL(COUNT(e.empno), 0)
FROM dept d LEFT JOIN emp e on d.deptno = e.deptno
WHERE 1
GROUP BY d.deptno;

--    (14) 列出各种工作的最低工资。
SELECT job, MIN(sal + IFNULL(comm, 0)) FROM emp WHERE 1 GROUP BY job;

--    (15) 列出MANAGER（经理）的最低薪金。
SELECT job, MIN(sal + IFNULL(comm, 0)) FROM emp WHERE job = 'MANAGER';

--    (16) 列出所有员工的年工资,按年薪从低到高排序
SELECT ename, (sal + IFNULL(comm, 0)) * 12 AS year_sal FROM emp WHERE 1 ORDER BY year_sal ASC;


-- 9. 设学校环境如下：一个系有若干个专业,每个专业一年只招一个班,每个班有若干个学生。现要建立关于系、学生、班级的数据库,
--    关系模式为：
--    班CLASS （班号class_id,专业名subject,系名dept_name,入学年份enroll_time,人数num）
CREATE TABLE class (
    class_id INT PRIMARY KEY AUTO_INCREMENT,
    subject VARCHAR(32) NOT NULL,
    dept_name VARCHAR(32) NOT NULL,
    enroll_time INT(4) NOT NULL,
    FOREIGN KEY(dept_name) REFERENCES department(dept_name)
);
ALTER TABLE class ADD UNIQUE uk_subject_enroll_time(subject, enroll_time);
ALTER TABLE class MODIFY COLUMN enroll_time INT(4) NOT NULL ;
ALTER TABLE class ADD COLUMN num INT(11);

DROP TABLE class;

DESC class;

--    学生STUDENT （学号student_id, 姓名name,年龄age,班号class_id)
CREATE TABLE student (
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(32) NOT NULL,
    age INT NOT NULL,
    class_id INT NOT NULL,
    FOREIGN KEY(class_id) REFERENCES class(class_id)
);

ALTER TABLE student ADD FOREIGN KEY (class_id) REFERENCES class(class_id);

DROP TABLE student;

DESC student;

--    系 DEPARTMENT （系号department_id, 系名dept_name）
CREATE TABLE department (
    department_id INT PRIMARY KEY AUTO_INCREMENT,
    dept_name VARCHAR(32) NOT NULL UNIQUE
);
-- 修改列类型
ALTER TABLE department MODIFY COLUMN department_id CHAR(3);

DESC department;

--    试用SQL语言完成以下功能：
--        (1) 建表,在定义中要求声明：
--            (1) 每个表的主外码。
--            (2) deptname是唯一约束。
--            (3) 学生姓名不能为空
--        (2) 插入如下数据:
--            DEPARTMENT (001,数学；
--                        002,计算机：
--                        003,化学；
--                        004, 中文;
--                        005, 经济；
--                       ）
INSERT INTO department VALUES('001', '数学'),
                             ('002', '计算机'),
                             ('003', '化学'),
                             ('004', '中文'),
                             ('005', '经济');

--            CLASS (101, 软件, 计算机,1995,20;
--                   102, 微电子, 计算机, 1996, 30;
--                   111,无机化学, 化学, 1995, 29;
--                   112,高分子化学,化学,1996, 25;
--                   121,统计数学,数学,1995, 20;
--                   131,现代语言,中文,1996, 20;
--                   141,国际贸易,经济,1997,30;
--                   142,国际金融,经济,1996,14;
--                 )
INSERT INTO class VALUES(101, '软件', '计算机',1995,20),
                        (102, '微电子', '计算机',1995,30),
                        (111, '无机化学', '化学',1995,29),
                        (112, '高分子化学', '化学',1996,25),
                        (121, '统计数学', '数学',1995,20),
                        (131, '现代语言', '中文',1996,20),
                        (141, '国际贸易', '经济',1997,30),
                        (142, '国际金融', '经济',1996,14);

--            STUDENT (8101,张三,18,101;
--                   8102,钱四,16, 121;
--                   8103,王玲,17,131;
--                   8105,李飞,19,102;
--                   8109, 赵四, 18, 141;
--                   8110,李可,20,142;
--                   8201,张飞,18,111;
--                   8302,周瑜,16, 112;
--                   8203, 王亮, 17, 111;
--                   8305, 董庆, 19, 102;
--                   8409,赵龙,18,101;
--                   8510,李丽,20, 142
--                 )
INSERT INTO student VALUES(8101,'张三',18,101),
                        (8102,'钱四',16, 121),
                        (8103,'王玲',17,131),
                        (8105,'李飞',19,102),
                        (8109,'赵四', 18, 141),
                        (8110,'李可',20,142),
                        (8201,'张飞',18,111),
                        (8302,'周瑜',16, 112),
                        (8203,'王亮', 17, 111),
                        (8305,'董庆', 19, 102),
                        (8409,'赵龙',18,101),
                        (8510,'李丽',20, 142);

--        (3) 完成以下查询功能
--            (1) 找出所有姓李的学生
SELECT * FROM student WHERE name LIKE '李%';

--            (2) 列出所有开设超过1个专业的系的名字。
SELECT dept_name FROM class WHERE 1 GROUP BY dept_name HAVING COUNT(subject) > 1;

--            (3) 列出人数大于等于30的系的编号和名字。
SELECT department_id, d.dept_name, SUM(num)
FROM department d LEFT JOIN class c ON c.dept_name = d.dept_name
WHERE 1
GROUP BY c.dept_name
HAVING SUM(num) >= 30;

--        (4) 学校又新增了一个物理系,编号为 006
INSERT INTO department(department_id, dept_name) VALUES ('006', '物理系');

--        (5) 学生张三退学,请更新相关的表
START TRANSACTION;
UPDATE class SET num = num - 1 WHERE class_id = (SELECT class_id FROM student WHERE name='张三');
DELETE FROM student WHERE name='张三';
COMMIT;


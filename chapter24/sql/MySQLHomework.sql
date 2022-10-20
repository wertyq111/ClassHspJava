-- 1. 选择题
# (1).以下哪条语句是错误的？[D]
# A. SELECT empno,ename name, sal salary FROM emp;
# B. SELECT empno,ename name, sal AS salary FROM emp;
# C. SELECT ename, sal*12 AS "Annual Salary" FROM emp;
# D. SELECT ename,sal*12 Annual Salary FROM emp;

# （2).某用户希望显示补助非空的所有雇员信息，应该使用哪条语句？[B]
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
--   (2) 显示所有雇员名及其全年收入 13月(工资＋补助），并指定列别名"年收入"
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
--   (1) 显示在1981年2月1日 到 1981年5月1日之间雇佣的雇员名，岗位及雇佣日期,并以雇用日期进行排序。
--   (2) 显示获得补助的所有雇员名工资及补助,并以工资降序排序
SELECT ename, job, hiredate FROM emp WHERE hiredate BETWEEN '1981-02-01' AND '1981-05-01' ORDER BY hiredate DESC;
SELECT ename, sal, comm FROM emp WHERE comm IS NOT NULL AND comm <> '0' ORDER BY sal DESC;

-- 6. 根据：emp员工表 写出正确SQL
--    (1) 选择部门30中的所有员工
--    (2) 列出所有办事员(CLERK)的姓名，编号和部门编号.
--    (3) 找出佣金高于薪金的员工．
--    (4) 找出佣金高于薪金60%的员工
--    (5) 找出部门10中所有经理(MANAGER)和部门20中所有办事员(CLERK)的详细资料
SELECT * FROM emp WHERE deptno = 30;
SELECT ename, empno, deptno FROM emp WHERE job = 'CLERK';
SELECT * FROM emp WHERE IFNULL(comm, 0) > sal;
SELECT * FROM emp WHERE IFNULL(comm, 0) > (sal * 0.6);
SELECT * FROM emp WHERE (job = 'MANAGER' AND deptno = 10) OR (job = 'CLERK' AND deptno = 20);

--    (6) 找出部门10中所有经理(MANAGER),部门20中所有办事员(CLERK)，还有既不是经理又不是办事员
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
--    (22) 找出在(任何年份的）2月受聘的所有员工，
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


-- 商店售货系统表设计案例
-- 现有一个商店的数据库shop_db，记录客户及其购物情况，由下面三个表组成

-- 商品 goods（商品号 goods_id，商品名 goods_name， 单价 unit_price，商品类别 category，供应商 provider);
CREATE TABLE goods(
    goods_id INT AUTO_INCREMENT PRIMARY KEY,
    goods_name VARCHAR(32),
    unit_price DOUBLE CHECK ( unit_price >= 1.0 AND unit_price <= 9999.99),
    category VARCHAR(32),
    provider VARCHAR(100)
) CHARSET utf8, ENGINE InnoDB, COLLATE utf8_unicode_ci;

-- 客户 customer（客户号 customer_id,姓名 name,住址 address,电邮 email, 性别 sex,身份证 card_id);
CREATE TABLE customer(
    customer_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(32) NOT NULL,
    address VARCHAR(150),
    email VARCHAR(120) UNIQUE ,
    sex ENUM ( '男', '女') NOT NULL, -- 枚举类型
    car_id CHAR(18)
) CHARSET utf8, ENGINE InnoDB, COLLATE utf8_unicode_ci;

-- 购买 purchase（购买订单号 order_id，客户号 customer_id,商品号 goods_id,购买数量 nums);
CREATE TABLE purchase(
    order_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT,
    goods_id INT,
    nums INT,
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
    FOREIGN KEY (goods_id) REFERENCES goods(goods_id)
) CHARSET utf8, ENGINE InnoDB, COLLATE utf8_unicode_ci;

-- 测试添加数据
-- 1. 每个表的主外键
-- 2. 客户的姓名不能为空值
-- 3. 电邮不能够重复
-- 4. 客户的性别[男|女]
-- 5. 单价 unit_price 在 1.0 ~ 9999.99 之间 check
INSERT INTO customer(name, address, email, sex, car_id)
VALUES ('test', 'Unknown', 'tests@test.com', '男', '123456789098765432');


-- 创建一张订单表 order(id, 商品名, 订购人, 数量)
-- 要求 id 为主键,请使用三种方式创建主键
CREATE TABLE order1(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(32),
    subscriber VARCHAR(32),
    num INT
);

CREATE TABLE order2(
    id INT AUTO_INCREMENT,
    name VARCHAR(32),
    subscriber VARCHAR(32),
    num INT,
    PRIMARY KEY (id)
);

CREATE TABLE order3(
    id INT,
    name VARCHAR(32),
    subscriber VARCHAR(32),
    num INT
);

ALTER TABLE order3 ADD PRIMARY KEY(id);


-- 查看表索引
SHOW INDEXES FROM order1;
SHOW INDEXES FROM order2;
SHOW INDEXES FROM order3;


-- 创建一张特价菜谱表 menu(id, 菜谱名, 厨师, 点餐人身份证, 价格)
-- 要求 id 为主键, 点餐人身份证是 unique. 请使用两种方式来创建 unique
CREATE TABLE menu1(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(32),
    cook VARCHAR(32),
    id_card VARCHAR(18) UNIQUE,
    price DECIMAL(10,2)
);

CREATE TABLE menu2(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(32),
    cook VARCHAR(32),
    id_card VARCHAR(18),
    price DECIMAL(10,2),
    UNIQUE (id_card)
);

-- 查看表索引
SHOW INDEXES FROM menu1;
SHOW INDEXES FROM menu2;

-- 创建一张运动员表 sport_man(id, 名字, 特长)
-- 要求: id 为主键, 名字为普通索引,请使用三种方式来创建索引
CREATE TABLE sport_man1(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(32),
    speciality VARCHAR(120),
    KEY(name)
);

DROP TABLE sport_man1;

CREATE TABLE sport_man2(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(32),
    speciality VARCHAR(120)
);

ALTER TABLE sport_man2 ADD INDEX idx_name(name);

DROP TABLE sport_man2;

CREATE TABLE sport_man3(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(32),
    speciality VARCHAR(120)
);

DROP TABLE sport_man3;

CREATE INDEX idx_name ON sport_man3(name);


-- 查看表索引
SHOW INDEXES FROM sport_man1;
SHOW INDEXES FROM sport_man2;
SHOW INDEXES FROM sport_man3;

-- 创建视图
CREATE VIEW emp AS SELECT id, name, job, salary FROM employee WHERE 1;


-- 查看创建视图指令
SHOW CREATE VIEW emp;

-- 查看视图结构
DESC emp;

-- 查看视图
SELECT * FROM emp WHERE 1;

-- 修改employee(基表)数据影响emp(视图)
UPDATE employee SET name = 'mary' WHERE id = 6;

-- 修改 emp(视图)数据影响 employee(基表)
UPDATE emp SET name = 'marry' WHERE id = 6;

-- 视图中创建视图
CREATE VIEW emp_bak AS SELECT id, name FROM emp WHERE 1;

-- 查看emp_bak(视图中视图)数据
SELECT * FROM emp_bak WHERE 1;

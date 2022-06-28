package com.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class DateMethod {
    public static void main(String[] args) throws ParseException {
        System.out.println("======第一代日起类======");
        // 1. 创建一个Date对象，并设置时间为当前时间
        // 2. 引入java.util.Date类
        // 3. 默认输出的日起格式是国外的方式，因此通常需要对格式进行转换
        Date date = new Date();//获取当前系统时间
        System.out.println(date);

        // 1. 创建 SimpleDateFormat 类对象，并设置时间格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));

        //可以把一个格式化的String转换成对应的 Date
        String s = "2017-01-01 10:12:56"; //格式需要跟simpleDateFormat一致
        Date parse = simpleDateFormat.parse(s);
        System.out.println(simpleDateFormat.format(parse));

        System.out.println("=======第二代日起类======");
        //解读
        // 1. calendar 类是一个抽象类， 并且构造器是private
        // 2. 可以通过 getInstance() 来获取实例
        // 3. 默认12小时进制， 如果需要24小时进制，Calendar.HOUR  ==> Calendar.HOUR_OF_DAY
        Calendar c = Calendar.getInstance();
        //System.out.println(c);
        // 获取日历对象的某个日历字段
        System.out.println("年：" + c.get(Calendar.YEAR));
        //Calendar.MONTH 获取月份，从0开始计算，0代表1月份所以要+1
        System.out.println("月：" + (c.get(Calendar.MONTH) + 1));
        System.out.println("日：" + c.get(Calendar.DATE));
        System.out.println("时：" + c.get(Calendar.HOUR));
        System.out.println("分：" + c.get(Calendar.MINUTE));
        System.out.println("秒：" + c.get(Calendar.SECOND));

        //Calender 没有专门的格式化方法，所以需要程序员自己来组合显示
        System.out.println(c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DATE) + " "
                + c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        System.out.println("=======第三代日起类======");
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.getYear() + "-" + ldt.getMonthValue() + "-" + ldt.getDayOfMonth() + " "
                + ldt.getHour() + ":" + ldt.getMinute() + ":" + ldt.getSecond());

        //DateTimeFormatter 是一个格式化器，用来格式化日期时间
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        dtf.format(ldt);
        System.out.println(dtf.format(ldt));

        // plus()方法可以让日期时间增加指定的时间量
        // minus()方法可以让日期时间减去指定的时间量
        System.out.println(dtf.format(ldt.plusDays(730)));
        System.out.println(dtf.format(ldt.minusDays(365)));
    }
}

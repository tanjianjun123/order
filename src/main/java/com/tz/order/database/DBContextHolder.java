package com.tz.order.database;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author tanjianjun
 * @create 2019-01-24 13:36
 */
public class DBContextHolder {

    private static final ThreadLocal<DBTypeEnum> contextHolder = new ThreadLocal<>();

    private static final AtomicInteger counter = new AtomicInteger(-1);

    public static void set(DBTypeEnum dbType) {
        contextHolder.set(dbType);
    }

    public static DBTypeEnum get() {
        return contextHolder.get();
    }

    public static void master() {
        set(DBTypeEnum.MASTER);
        System.out.println("切换到master");
    }

    public static void slave() {
        //  轮询来分配一个随机数，决定是去哪一个数据读
        int index = counter.getAndIncrement() % 2;
        if (counter.get() > 9999) {
            counter.set(-1);
        }

        set(DBTypeEnum.SLAVE1);
        System.out.println("切换到slave1");
        //没有那么多数据库，就用一个来读
        /*if (index != 0) {
            set(DBTypeEnum.SLAVE1);
            System.out.println("切换到slave1");
        }else {
            set(DBTypeEnum.SLAVE2);
            System.out.println("切换到slave2");
        }*/
    }

}

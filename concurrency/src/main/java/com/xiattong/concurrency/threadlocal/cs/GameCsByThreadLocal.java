package com.xiattong.concurrency.threadlocal.cs;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author ：xiattong
 * @description：
 * @version: $
 * @date ：Created in 2021/4/24 20:01
 * @modified By：
 */
public class GameCsByThreadLocal {
    private static final Integer BULLET_NUMBER = 1500;
    private static final Integer KILLED_ENEMIES = 0;
    private static final Integer LIFE_VALUE = 10;
    private static final Integer TOTAL_PLAYERS = 10 ;

    // 初始化子弹数字
    private static final ThreadLocal<Integer> BULLET_NUMBER_THREAD_LOCAL = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return BULLET_NUMBER;
        }
    };

    // 初始化杀敌数
    private static final ThreadLocal<Integer> KILLED_ENEMIES_THREAD_LOCAL = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return KILLED_ENEMIES;
        }
    };

    // 初始化生命数
    private static final ThreadLocal<Integer> LIFE_VALUE_THREAD_LOCAL = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return LIFE_VALUE;
        }
    };

    // 定义每位队员
    private static class Player extends Thread{

        @Override
        public void run() {
            ThreadLocalRandom RANDOM = ThreadLocalRandom.current();

            Integer bullets = BULLET_NUMBER_THREAD_LOCAL.get() - RANDOM.nextInt(BULLET_NUMBER);
            Integer killEnemies = KILLED_ENEMIES_THREAD_LOCAL.get() + RANDOM.nextInt(TOTAL_PLAYERS/2);
            Integer lifeValue = LIFE_VALUE_THREAD_LOCAL.get() - RANDOM.nextInt(LIFE_VALUE);

            System.out.println(getName () + ", BULLET NUMBER is " + bullets) ;
            System.out.println(getName () + ", KILLED ENEMIES is "+ killEnemies) ;
            System.out.println(getName () + ", LIFE VALUE is " + lifeValue + "\n");

            BULLET_NUMBER_THREAD_LOCAL.remove();
            KILLED_ENEMIES_THREAD_LOCAL.remove();
            LIFE_VALUE_THREAD_LOCAL.remove();
        }
    }

    public static void main(String[] args) {
        for (int i = 0 ; i < TOTAL_PLAYERS ; i++) {
            new Player().start();
        }
    }
}

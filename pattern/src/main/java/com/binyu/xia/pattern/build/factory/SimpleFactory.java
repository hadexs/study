package com.binyu.xia.pattern.build.factory;

import android.util.Log;

import com.binyu.xia.surpport.LogUitl;

/**
 * User: hadexs
 * Date: 2016-02-29
 * Time: 23:10
 * <p/>
 * 工厂方法模式的一种特例
 * <p/>
 * 静态工厂方法
 * <p/>
 * 简单工厂模式中只有一个工厂类来对应这些产品
 */
public class SimpleFactory {


    public void simpleFactoryMain() {
        Factory factory = new Factory();
        BMW bmw320 = factory.createBMW(320);
        BMW bmw523 = factory.createBMW(523);
    }


    /**
     * 抽象产品角色：它一般是具体产品继承的父类或者实现的接口。
     */
    abstract class BMW {
        public BMW() {

        }
    }

    /**
     * 具体产品角色：工厂类所创建的对象就是此角色的实例
     */
    public class BMW320 extends BMW {
        public BMW320() {
            LogUitl.e("制造-->BMW320");
        }
    }

    public class BMW523 extends BMW {
        public BMW523() {
            LogUitl.e("制造-->BMW523");
        }
    }

    /**
     * 工厂类角色：这是本模式的核心，含有一定的商业逻辑和判断逻辑，用来创建产品
     *
     * 开闭原则
     * 不符合
     *每增加一种新型车，都要在工厂类中增加相应的创建业务逻辑（createBMW(int type)方法需要新增case
     */
    public class Factory {

        public BMW createBMW(int type) {
            switch (type) { //
                case 320:
                    return new BMW320();

                case 523:
                    return new BMW523();

                default:
                    break;
            }
            return null;
        }
    }

}  

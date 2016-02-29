package com.binyu.xia.pattern.build.factory;

import com.binyu.xia.surpport.LogUitl;

/**
 * User: hadexs
 * Date: 2016-02-29
 * Time: 23:06
 * <p/>
 * 工厂方法模式
 * 很完美的对对象的创建进行了包装
 * <p/>
 * 多工厂模式
 */
public class FactoryMethodPattern {


    public void factroyMethodPatternMain() {

        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        BMW320 bmw320 = factoryBMW320.createBMW();

        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        BMW523 bmw523 = factoryBMW523.createBMW();
    }

    public void factroyMethodPatternMainTwo(){
        BMWFactory bmwFactory = new BMWFactory();
        bmwFactory.createBMW(BMW320.class);
        bmwFactory.createBMW(BMW523.class);
    }




    /**
     * 抽象产品角色：它是具体产品继承的父类或者是实现的接口。在java中一般有抽象类或者接口来实现。
     */
    abstract class BMW {
        public BMW() {

        }
    }

    /**
     * 具体产品角色：具体工厂角色所创建的对象就是此角色的实例。
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
     * 抽象工厂角色： 这是工厂方法模式的核心，它与应用程序无关。是具体工厂角色必须实现的接口或者必须继承的父类
     */
    interface FactoryBMW {
        BMW createBMW();
    }

    /**
     * 具体工厂角色：它含有和具体业务逻辑有关的代码。由应用程序调用以创建对应的具体产品的对象。
     */
    public class FactoryBMW320 implements FactoryBMW {

        @Override
        public BMW320 createBMW() {
            return new BMW320();
        }

    }

    public class FactoryBMW523 implements FactoryBMW {
        @Override
        public BMW523 createBMW() {

            return new BMW523();
        }
    }


    interface FactoryCar {
        <T extends BMW> T createBMW(Class<T> clazz);
    }

    public class BMWFactory implements FactoryCar {

        @Override
        public <T extends BMW> T createBMW(Class<T> clazz) {
            try {
                return (T) Class.forName(clazz.getName()).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}  

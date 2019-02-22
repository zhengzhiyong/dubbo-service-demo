package com.zy.dubbo;

import com.zy.dubbo.po.DrivingPO;

import java.util.*;

/**
 * @author zheng
 * @date 2019/2/22.
 */
public class DrivingTest {
    static List<DrivingPO> collection = new ArrayList<DrivingPO>();
    static {
        DrivingPO drivingPo1 = new DrivingPO("请打开近光灯","近光灯");
        DrivingPO drivingPo2 = new DrivingPO("夜间同方向近距离跟车行驶","近光灯");
        DrivingPO drivingPo3 = new DrivingPO("夜间与机动车会车","近光灯");
        DrivingPO drivingPo4 = new DrivingPO("夜间直行通过路口","近光灯");
        DrivingPO drivingPo5 = new DrivingPO("夜间在窄路与非机动车会车","近光灯");
        DrivingPO drivingPo6 = new DrivingPO("夜间在照明良好的道路上行驶","近光灯");
        DrivingPO drivingPo7 = new DrivingPO("夜间在窄桥与非机动车会车","近光灯");
        DrivingPO drivingPo8 = new DrivingPO("夜间在有路灯的道路上行驶","近光灯");
        DrivingPO drivingPo9 = new DrivingPO("夜间路口左转弯","近光灯+左转向灯");
        DrivingPO drivingPo10 = new DrivingPO("夜间路口右转弯","近光灯+右转向灯");
        DrivingPO drivingPo11 = new DrivingPO("请打开远光灯","远光灯");
        DrivingPO drivingPo12 = new DrivingPO("夜间在没有路灯，照明不良条件下行驶","远光灯");
        DrivingPO drivingPo13 = new DrivingPO("夜间通过急弯、坡路","交替使用远近光灯");
        DrivingPO drivingPo14 = new DrivingPO("夜间通过坡路、拱桥","交替使用远近光灯");
        DrivingPO drivingPo15 = new DrivingPO("夜间通过急弯、拱桥","交替使用远近光灯");
        DrivingPO drivingPo16 = new DrivingPO("夜间通过拱桥、人行横道","交替使用远近光灯");
        DrivingPO drivingPo17 = new DrivingPO("夜间通过没有交通信号灯控制的路口","交替使用远近光灯");
        DrivingPO drivingPo18 = new DrivingPO("夜间超越前方车辆","交替使用远近光灯");
        DrivingPO drivingPo19 = new DrivingPO("路边临时停车","危险报警闪关灯+示廓灯(属称小灯)");
        DrivingPO drivingPo20 = new DrivingPO("雾天行驶","雾灯+危险报警闪光灯");
        collection.add(drivingPo1);
        collection.add(drivingPo2);
        collection.add(drivingPo3);
        collection.add(drivingPo4);
        collection.add(drivingPo5);
        collection.add(drivingPo6);
        collection.add(drivingPo7);
        collection.add(drivingPo8);
        collection.add(drivingPo9);
        collection.add(drivingPo10);
        collection.add(drivingPo11);
        collection.add(drivingPo12);
        collection.add(drivingPo13);
        collection.add(drivingPo14);
        collection.add(drivingPo15);
        collection.add(drivingPo16);
        collection.add(drivingPo17);
        collection.add(drivingPo18);
        collection.add(drivingPo19);
        collection.add(drivingPo20);
    }

    public static void main(String args[]){
        for (int i = 0; i < collection.size(); i++) {
            DrivingPO po = collection.get(i);
            System.out.println("问："+po.getSubject()+"       答："+ po.getAnswer());
            try{
                Thread.sleep(500);
            }catch (Exception e){
            }
            System.out.println("\n");
        }
    }
}

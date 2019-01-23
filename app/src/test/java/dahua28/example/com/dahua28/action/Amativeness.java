package dahua28.example.com.dahua28.action;

import dahua28.example.com.dahua28.person.Man;
import dahua28.example.com.dahua28.person.Woman;

/**
 * Created by ac.hsu on 2019/1/23.
 * Mail: ac.hsu@104.com.tw
 * Copyright (c) 2019 104 Corporation
 */
// 恋爱
public class Amativeness extends Action {
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + " " + getClass().getSimpleName() +
                "时, 凡是不懂也要装懂.");
    }
    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName() + " " + getClass().getSimpleName() +
                "时, 遇事懂也装作不懂.");
    }
}

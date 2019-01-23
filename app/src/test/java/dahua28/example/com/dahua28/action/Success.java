package dahua28.example.com.dahua28.action;

import dahua28.example.com.dahua28.person.Man;
import dahua28.example.com.dahua28.person.Woman;

/**
 * Created by ac.hsu on 2019/1/23.
 * Mail: ac.hsu@104.com.tw
 * Copyright (c) 2019 104 Corporation
 */
public class Success extends Action {
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + " " + getClass().getSimpleName() +
                "时, 背后多半有一个伟大的女人.");
    }
    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName() + " " + getClass().getSimpleName() +
                "时, 背后多半有一个不成功的男人.");
    }
}

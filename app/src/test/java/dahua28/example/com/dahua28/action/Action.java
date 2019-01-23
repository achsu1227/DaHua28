package dahua28.example.com.dahua28.action;

import dahua28.example.com.dahua28.person.Man;
import dahua28.example.com.dahua28.person.Woman;

/**
 * Created by ac.hsu on 2019/1/23.
 * Mail: ac.hsu@104.com.tw
 * Copyright (c) 2019 104 Corporation
 */
public abstract class Action {
    // 得到男人的结论或反应
    public abstract void getManConclusion(Man ConcreteElementA);
    // 得到女人的结论或反应
    public abstract void getWomanConclusion(Woman concreteElementB);
}

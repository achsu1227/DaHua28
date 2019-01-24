package dahua28.example.com.dahua28.action;

import dahua28.example.com.dahua28.person.HonestManElement;
import dahua28.example.com.dahua28.person.LieManElement;

/**
 * Created by ac.hsu on 2019/1/24.
 * Mail: ac.hsu@104.com.tw
 * Copyright (c) 2019 104 Corporation
 */
public class PhysicsVisitor extends Visitor {
    // 訪問誠實人的多載方法
    @Override
    public void visit(HonestManElement honestElement) {
        System.out.println(String.format("%s 說: 鐵球在水中會沉下去", honestElement.name));
    }

    // 訪問說謊人的多載方法
    @Override
    public void visit(LieManElement lieElement) {
        System.out.println(String.format("%s 說: 鐵球在水中會浮起來", lieElement.name));
    }
}

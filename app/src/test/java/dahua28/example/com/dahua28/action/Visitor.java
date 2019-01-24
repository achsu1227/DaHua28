package dahua28.example.com.dahua28.action;

import dahua28.example.com.dahua28.person.HonestManElement;
import dahua28.example.com.dahua28.person.LieManElement;

/**
 * Created by ac.hsu on 2019/1/24.
 * Mail: ac.hsu@104.com.tw
 * Copyright (c) 2019 104 Corporation
 */
public abstract class Visitor {
    // 訪問誠實人的多載方法
    public abstract void visit(HonestManElement honestElement);

    // 訪問說謊人的多載方法
    public abstract void visit(LieManElement lieElement);
}

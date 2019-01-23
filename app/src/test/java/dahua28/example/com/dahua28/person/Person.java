package dahua28.example.com.dahua28.person;

import dahua28.example.com.dahua28.action.Action;

/**
 * Created by ac.hsu on 2019/1/23.
 * Mail: ac.hsu@104.com.tw
 * Copyright (c) 2019 104 Corporation
 */
public abstract class Person {
    // 接受
    // 他是用来获得 '状态' 对象的.
    public abstract void accept(Action visitor);
}

package dahua28.example.com.dahua28.person;

import dahua28.example.com.dahua28.action.Action;

/**
 * Created by ac.hsu on 2019/1/23.
 * Mail: ac.hsu@104.com.tw
 * Copyright (c) 2019 104 Corporation
 */
// 男人
public class Man extends Person {
    @Override
    public void accept(Action visitor) {
        // 首先在客户程序中将具体状态作为参数传递给 '男人' 类
        // 完成一次分派, 然后'男人'类, 调用作为参数的'具体状态'
        // 中的方法'男人反应', 同时将自己(this)作为参数传递进去.
        // 这边完成了第二次分派.
        visitor.getManConclusion(this);
    }
}

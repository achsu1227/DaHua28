package dahua28.example.com.dahua28.person;

import dahua28.example.com.dahua28.action.Action;

/**
 * Created by ac.hsu on 2019/1/23.
 * Mail: ac.hsu@104.com.tw
 * Copyright (c) 2019 104 Corporation
 */
// 男人
public class Woman extends Person {
    @Override
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }
}

package dahua28.example.com.dahua28.person;

import dahua28.example.com.dahua28.action.Visitor;

/**
 * Created by ac.hsu on 2019/1/24.
 * Mail: ac.hsu@104.com.tw
 * Copyright (c) 2019 104 Corporation
 */
public class LieManElement extends Person {
    public String name = "誠實人";

    @Override
    public void accept(Visitor visitor) {
        // 將自己傳給訪問者，以便訪問者分辨、執行適合自己的行為
        visitor.visit(this);
    }
}
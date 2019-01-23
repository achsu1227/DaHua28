package dahua28.example.com.dahua28;

/**
 * Created by ac.hsu on 2019/1/23.
 * Mail: ac.hsu@104.com.tw
 * Copyright (c) 2019 104 Corporation
 */
public abstract class Person {
    protected String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    // 得到结论或反映
    public abstract void getConclusion();
}

package dahua28.example.com.dahua28;

/**
 * Created by ac.hsu on 2019/1/23.
 * Mail: ac.hsu@104.com.tw
 * Copyright (c) 2019 104 Corporation
 */
public class Woman extends Person {
    // 得到结论或反应
    @Override
    public void getConclusion() {
        if (action == "成功") {
            System.out.println("女人成功时, 背后多半有一个不成功的男人.");
        } else if (action == "失败") {
            System.out.println("女人失败时, 两眼泪汪汪, 事业劝不了");
        } else if (action == "恋爱") {
            System.out.println("女士恋爱时, 遇事懂也装作不懂.");
        }
    }
}

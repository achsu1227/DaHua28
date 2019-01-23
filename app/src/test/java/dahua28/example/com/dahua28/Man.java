package dahua28.example.com.dahua28;

/**
 * Created by ac.hsu on 2019/1/23.
 * Mail: ac.hsu@104.com.tw
 * Copyright (c) 2019 104 Corporation
 */
public class Man extends Person {
    // 得到结论或反应
    @Override
    public void getConclusion() {
        if (action == "成功") {
            System.out.println("男人成功时, 背后多半有一个伟大的女人.");
        } else if (action == "失败") {
            System.out.println("男人失败时, 闷头喝酒, 谁也不用劝.");
        } else if (action == "恋爱") {
            System.out.println("男人恋爱时, 凡是不懂也要装懂.");
        }
    }
}

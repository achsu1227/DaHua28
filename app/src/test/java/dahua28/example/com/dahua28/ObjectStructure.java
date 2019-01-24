package dahua28.example.com.dahua28;

import java.util.ArrayList;
import java.util.List;

import dahua28.example.com.dahua28.action.Visitor;
import dahua28.example.com.dahua28.person.Person;

/**
 * Created by ac.hsu on 2019/1/23.
 * Mail: ac.hsu@104.com.tw
 * Copyright (c) 2019 104 Corporation
 */
public class ObjectStructure {
    private List<Person> elements = new ArrayList<>();
    // 增加
    public void attach(Person element) {
        elements.add(element);
    }
    // 移除
    public void detach(Person element) {
        elements.remove(element);
    }
    // 查看显示
    public void display(Visitor visitor) {
        for (Person e : elements) {
            e.accept(visitor);
        }
    }
}

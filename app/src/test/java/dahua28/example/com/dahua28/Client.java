package dahua28.example.com.dahua28;

import org.junit.Test;

import dahua28.example.com.dahua28.action.MathVisitor;
import dahua28.example.com.dahua28.action.PhysicsVisitor;
import dahua28.example.com.dahua28.person.HonestManElement;
import dahua28.example.com.dahua28.person.LieManElement;

/**
 * Created by ac.hsu on 2019/1/23.
 * Mail: ac.hsu@104.com.tw
 * Copyright (c) 2019 104 Corporation
 */
public class Client {
    @Test
    public void maiin() {
        ObjectStructure o = new ObjectStructure();
        o.attach(new HonestManElement());
        o.attach(new LieManElement());

        // 數學問題訪問者
        MathVisitor mathVisitor = new MathVisitor();
        System.out.println("[數學問題]");
        o.display(mathVisitor); // 輸出結果

        // 物理問題訪問者
        PhysicsVisitor physicsVisitor = new PhysicsVisitor();
        System.out.println("[物理問題]");
        o.display(physicsVisitor); // 輸出結果
    }
}

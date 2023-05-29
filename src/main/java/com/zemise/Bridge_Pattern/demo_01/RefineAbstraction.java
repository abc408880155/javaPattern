package com.zemise.Bridge_Pattern;

/**
 * @Author Zemise_
 * @Date 2023/5/29
 * @Description
 */

// 修正抽象化角色
public class RefineAbstraction extends Abstraction{
    public RefineAbstraction(Implementor imp) {
        super(imp);
    }

    // 修正父类的方法
    public void operation(){
        // 业务代码
    }
}

package com.xiattong.pattern.behavioral.visitor.kpi;

/**
 * Created by Tom.
 */
public interface IVisitor {

    void visit(Engineer engineer);

    void visit(Manager manager);

}

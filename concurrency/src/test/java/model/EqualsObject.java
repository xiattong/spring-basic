package model;

import java.util.Objects;

/**
 * @author ：xiattong
 * @description：
 * @version: $
 * @date ：Created in 2021/4/7 16:47
 * @modified By：
 */
public class EqualsObject {
    private int id;
    private String name;

    public EqualsObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        // 如果为null或不是同类，直接返回false
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        // 如果引用指向同一个对象，则返回true
        if (this == o) {
            return true;
        }
        EqualsObject object = (EqualsObject)o;
        // 本例的判断标准是两个属性值相等
        if (object.getId() == this.id && object.getName().equals(this.getName())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id + Objects.hash(name);
    }
}

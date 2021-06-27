package com.patterns;

public class People implements AbstractModel {

    String name;
    Integer old;

    public People() {}

    private People(People people) {
        this.name = people.name;
        this.old = people.old;
    }

    @Override
    public AbstractModel clone() {
        return new People(this);
    }

}

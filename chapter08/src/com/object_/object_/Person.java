package com.object_.object_;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person() {}

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    /**
     * 比较内容是否相同
     * @param Object o
     * @return boolean
     */
    public boolean equals(Object o) {
        if (this == o) { //如果地址相同直接返回true
            return true;
        }
        if(o instanceof Person) {
            Person p = (Person) o;
            if(this.name.equals(p.getName())
                    && this.age == p.age
                    && this.gender == p.gender
            ) {
                return true;
            }
        }

        return false;
    }
}

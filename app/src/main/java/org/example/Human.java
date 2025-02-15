package org.example;

public class Human {
    private Integer age;

    public Human(Integer name) {
        this.age = name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Human human = (Human) obj;
        return age == human.age;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}

package com.arturfrimu.version3bad;

public class BadUser {
    private String idnp;
    private int age;

    public BadUser(String idnp, int age) {
        this.idnp = idnp;
        this.age = age;
    }

    public String getIdnp() {
        return idnp;
    }

    public void setIdnp(String idnp) {
        this.idnp = idnp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "BadUser{" +
                "idnp='" + idnp + '\'' +
                ", age=" + age +
                '}';
    }
}

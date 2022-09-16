package com.arturfrimu.version3bad;

public class BadAdmin {
    private String idnp;
    private int age;

    public BadAdmin(String idnp, int age) {
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
        return "BadAdmin{" +
                "idnp='" + idnp + '\'' +
                ", age=" + age +
                '}';
    }
}

package com.Vivworld.www;

public class ClassSample {

    String name,age,location;

    public void setName(String name ){
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location    = location;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public static void main(String[] args) {



        ClassSample vivekobj = new ClassSample();

        vivekobj.setName("Vivek Ranjan");
        vivekobj.setAge("28");
        vivekobj.setLocation("SM Platina, A-102, Bengalore");

        System.out.println(vivekobj.getName());
        System.out.println(vivekobj.getAge());
        System.out.println(vivekobj.getLocation());





    }


}

package com.adk.springboot.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private boolean happy;
    private Integer age;
    private Dog dog;
    private Map<String,Object> maps;
    private List<Object> list;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", happy=" + happy +
                ", age=" + age +
                ", dog=" + dog +
                ", maps=" + maps +
                ", list=" + list +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Person(String name, boolean happy, Integer age, Dog dog, Map<String, Object> maps, List<Object> list) {
        this.name = name;
        this.happy = happy;
        this.age = age;
        this.dog = dog;
        this.maps = maps;
        this.list = list;
    }

    public Person() {
    }
}

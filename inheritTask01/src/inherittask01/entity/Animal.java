/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherittask01.entity;

/**
 *
 * @author Exequiel Hordt
 * @version 02 Nov 2022
 */
public class Animal {

    protected String name;
    protected String food;
    protected Integer age;
    protected String breed;

    public Animal(String name, String food, Integer age, String breed) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}

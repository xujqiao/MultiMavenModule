package me.jxuao.chap5.pojo;

import me.jxuao.chap5.types.CarBrand;
import me.jxuao.chap5.types.Color;

/**
 * @program: MultiMavenModule
 * @description: car
 * @author: camxu
 * @create: 2019-09-14 18:49
 **/
public class Car {
    private String name;
    private CarBrand brand;
    private Color color;
    private int maxSpeed;

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public void setBrand(CarBrand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

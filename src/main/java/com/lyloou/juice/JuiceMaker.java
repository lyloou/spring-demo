package com.lyloou.juice;

import org.springframework.beans.factory.BeanNameAware;

public class JuiceMaker implements BeanNameAware {
    private String beverageShop;
    private Source source;

    public String makeJuice() {
        String juice = "这是一杯由【" + beverageShop + "】饮品店，提供的【"
                + source.getSize() + source.getSugar() + source.getFruit() + "】";
        return juice;
    }

    public String getBeverageShop() {
        return beverageShop;
    }

    public void setBeverageShop(String beverageShop) {
        this.beverageShop = beverageShop;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "JuiceMaker{" +
                "beverageShop='" + beverageShop + '\'' +
                ", source=" + source +
                '}';
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }

    private void init() {
        System.out.println("init");
    }
}

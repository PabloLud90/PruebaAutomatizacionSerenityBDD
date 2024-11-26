package com.practica.clothes;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;

public class Form {
    public static Performable login(String username, String password) {
        return Task.where(
                        Enter.theValue(username).into(Login.USERNAME),
                        Enter.theValue(password).into(Login.PASSWORD)
                )
                .with("username").of(username)
                .with("password").of(password);

    }

    public static Performable continueLogin() {
        return Click.on(Login.CONTINUE_LOGIN);
    }

    public static Performable product1() {
        return Click.on(Products.PRODUCT1);
    }

    public static Performable product2() {
        return Click.on(Products.PRODUCT2);
    }

    public static Performable carrito() {
        return Click.on(Products.CARRITO);
    }

    public static Performable checkout() {
        return Click.on(Products.CHECKOUT);
    }

    public static Performable formbuy(String name, String lastname, String code) {
        return Task.where(
                Enter.theValue(name).into(Buy.NAME),
                Enter.theValue(lastname).into(Buy.LASTNAME),
                Enter.theValue(code).into(Buy.CODE)
        )
                .with("name").of(name)
                .with("lastname").of(lastname)
                .with("code").of(code);

    }


    public static Performable buttonContinue() {
        return  Click.on(Buy.BUTTONCONTINUE);
    }

    public static Performable buttonFinish() {
        return  Click.on(Buy.BUTTONFINISH);
    }


}
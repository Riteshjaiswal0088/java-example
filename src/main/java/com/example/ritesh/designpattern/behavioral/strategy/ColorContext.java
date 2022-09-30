package com.example.ritesh.designpattern.behavioral.strategy;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class ColorContext {
    private final Color color;

    public void executeStrategy(){
     color.props();
    }

}

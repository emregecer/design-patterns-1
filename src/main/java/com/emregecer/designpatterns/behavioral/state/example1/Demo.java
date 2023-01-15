package com.emregecer.designpatterns.behavioral.state.example1;

import com.emregecer.designpatterns.behavioral.state.example1.ui.Player;
import com.emregecer.designpatterns.behavioral.state.example1.ui.UI;

public class Demo {

    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }

}

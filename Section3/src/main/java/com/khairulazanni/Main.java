package com.khairulazanni;

public class Main {
    static void main(String[] args) {
        var uiControl = new TextBox();

        uiControl.setEnabled(false);
        System.out.println(uiControl.isEnabled());
    }
}

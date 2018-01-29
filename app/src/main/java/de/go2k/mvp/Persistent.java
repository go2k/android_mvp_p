package de.go2k.mvp;

/**
 * Created by mkoenig on 29.01.2018.
 */

public class Persistent {
    Model model;

    public Persistent(Model model) {
        this.model = model;
    }

    public void tuWas(Double d) {
        System.out.println(d.toString());
    }
}

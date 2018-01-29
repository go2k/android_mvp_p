package de.go2k.mvp;

/**
 * Created by mkoenig on 29.01.2018.
 */

public class Model {
    Presenter presenter;
    Persistent persistent;

    public Model(Presenter presenter) {
        this.presenter = presenter;
        persistent = new Persistent(this);
    }

    public double doSum(double d1, double d2) {
        Double d = d1 + d2;
        persistent.tuWas(d);
        return d;
    }
}

package de.go2k.mvp;

/**
 * Created by mkoenig on 29.01.2018.
 */

public class Presenter {

    private View view;
    private Model model;

    public Presenter(View view) {
        this.view = view;
        model = new Model(this);
    }

    public void doSum() {
        double d1 =  Double.valueOf(view.getET1Text());
        double d2 =  Double.valueOf(view.getET2Text());
        double d = model.doSum(d1,d2);
        view.setTVText(String.valueOf(d));
    }
}

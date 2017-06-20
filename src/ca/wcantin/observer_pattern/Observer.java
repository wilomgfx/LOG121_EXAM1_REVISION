package ca.wcantin.observer_pattern;

/**
 * Created by William on 2017-06-19.
 */
public abstract class Observer {

    protected Subject subject;
    public abstract void update();
}

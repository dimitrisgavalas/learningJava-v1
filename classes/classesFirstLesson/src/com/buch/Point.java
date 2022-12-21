package com.buch;

public class Point {

    private int x;
    private int y;

    public Point(){}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double x = (int) this.x;
        double y = (int) this.y;
        return Math.sqrt((x-0)*(x-0) + (y-0)*(y-0));
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x-x)*(this.y-x) + (this.y-y)*(this.y-y));
    }

    public double distance(Point another){
        return Math.sqrt(((another.getX() - x) * (another.getX() - x)) + ((another.getY() - y) * (another.getY() -y)));
    }



}

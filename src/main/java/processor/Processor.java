package processor;

import data.Point;

import java.util.ArrayList;
import java.util.List;

public class Processor {
    private double f(double x) {
        if(x > (3.4+1e-9)) {
            return (Math.sin(x) * Math.log10(x));
        } else {
            double cos = Math.cos(x);
            return (cos * cos);
        }
    }
    public List<Point> tabulating(double start, double finish, double step) {
        List<Point> points = new ArrayList<>();
        int n = (int) Math.round((finish - start) / step + 1);
        for (int i = 0; i < n; i++) {
            double x = start + i * step;
            double y = f(x);
            points.add(new Point(x,y));
        }
        return points;
    }
    public double countStep(double start, double finish, double step) {
        if (start==finish) return 0;
        return Math.round((finish - start) / step + 1);
    }
    public double getMax(List<Point> points) {
        double max = points.get(1).y();
        for (int i = 0; i < points.size(); i++) {
            if(points.get(i).y() > max) {
                max = points.get(i).y();
            }
        }
        return max;
    }
    public double getMin(List<Point> points) {
        double min = points.get(1).y();
        for (int i = 0; i < points.size(); i++) {
            if(points.get(i).y() < min) {
                min = points.get(i).y();
            }
        }
        return min;
    }
    public double getSum(List<Point> points) {
        double sum = 0;
        for (int i = 0; i < points.size(); i++) {
            sum += points.get(i).y();
        }
        return sum;
    }
    public double getAverage(List<Point> points) {
        double sum = 0;
        for (int i = 0; i < points.size(); i++) {
            sum += points.get(i).y();
        }
        return sum / points.size();
    }
}
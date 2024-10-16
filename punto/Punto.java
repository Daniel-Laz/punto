package punto;

public class Punto {
    private double x;
    private double y;

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setXY(double x, double y){
        setX(0.0);
        setY(0.0);
    }
    public double getRho(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    public Punto puntoMedio(Punto p){
        return new Punto(((this.x+p.x)/2),((this.y+p.y)/2));
    }
    public Punto(){
        setXY(x, y);
    }
    public Punto(double x, double y){
        setX(x);
        setY(y);
    }
    public Punto(double x){
        setX(x);
    }

    public String toString(){
        return "["+x+", "+y+"]";
    }
    public boolean equals(Punto p){
        if (this.x == p.x && this.y == p.y){
            return true;
        }else{
            return false;
        }
    }
}

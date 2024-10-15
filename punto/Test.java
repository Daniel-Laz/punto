package punto;

public class Test {
    public static void main(String[] args){
        Punto p = new Punto(1,2);
        System.out.println("x -> "+p.getX()+", y -> "+p.getY());
        p.setX(2);
        p.setY(3);
        System.out.println("modifica coordinate");
        System.out.println("new x -> "+p.getX()+", new y -> "+p.getY());
        System.out.println("distanza dal centro: "+p.getRho());
        System.out.println("punto medio tra p e le coordinate: (32,21): x -> "+p.puntoMedio(new Punto(32, 21)).getX()+", y ->"+p.puntoMedio(new Punto(32, 21)).getY());
    }
}

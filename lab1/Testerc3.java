public class Testerc3 {
    public static void main(String[] args) {
        TesterC T = new TesterC();
        T.show();
        Circle c = new Circle();
        c = T.min();
        System.out.println(c.getR());
        c = T.max();
        System.out.println(c.getR());
        T.sort();
        T.show();
    }
}

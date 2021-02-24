package books;

public class SpoilBook extends FictionalBook {
    public SpoilBook(String author, String year, String name) {
        super(author, year, name);
    }

    //принцип подстановки Лисков - класс,
    // разработанный путем расширения на основании базового класса,
    // должен переопределять его методы так, чтобы не нарушалась
    // функциональность с точки зрения клиента
    @Override
    public void moveTo() {
        System.out.println("Move to protected showcase");
    }
}

package books;

//принцип разделения интерфейсов, для электронных книг нужен метод загрузки кники,
// для бумажной книги такой метод не нужен
public interface IDigitalBook {
    void loadBook();
}

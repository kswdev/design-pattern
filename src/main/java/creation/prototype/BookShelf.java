package creation.prototype;

import java.util.ArrayList;

class BookShelf implements Cloneable{

    private ArrayList<Book> shelf;

    public BookShelf() {
        shelf = new ArrayList<>();
    }

    public void addBook(Book book) {
        shelf.add(book);
    }

    @Override
    protected Object clone() {

        //방어적 복사
        BookShelf another = new BookShelf();
        for(Book book : shelf) {

            another.addBook(new Book(book.getAuthor(), book.getTitle()));
        }

        return another;
    }

    public ArrayList<Book> getShelf() {
        return shelf;
    }

    public void setShelf(ArrayList<Book> shelf) {
        this.shelf = shelf;
    }

    public String toString() {
        return shelf.toString();
    }
}
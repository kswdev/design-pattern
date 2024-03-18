package behavioral.iterator.iterator;

import behavioral.iterator.book.Book;
import behavioral.iterator.collection.Aggregate;
import behavioral.iterator.collection.BookShelf;

public class BookShelfIterator implements Iterator{
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(Aggregate bookShelf) {
        this.bookShelf = (BookShelf)bookShelf;
        this.index = 0;
    }
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }

}
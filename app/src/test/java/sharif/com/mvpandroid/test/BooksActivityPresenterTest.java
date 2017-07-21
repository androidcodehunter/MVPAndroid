package sharif.com.mvpandroid.test;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import sharif.com.mvpandroid.Book;
import sharif.com.mvpandroid.presenter.BooksActivityPresenter;
import sharif.com.mvpandroid.repository.BooksRepository;
import sharif.com.mvpandroid.view.BooksActivityView;

/**
 * Created by sharifurrahaman on 7/21/17.
 */
public class BooksActivityPresenterTest {

    @Test
    public void shouldPass(){
        Assert.assertEquals(1, 1);
    }


    @Test
    public void shouldPassBooksToView(){
        // given
        BooksActivityView view = new MockView();
        BooksRepository booksRepository = new MockBooksRepository();

        // when
        BooksActivityPresenter booksActivityPresenter = new BooksActivityPresenter(view, booksRepository);
        booksActivityPresenter.loadBooks();
        // then

        view.displayBooks();

    }


    private class MockView implements BooksActivityView{

        boolean passed;

        @Override
        public void displayBooks(List<Book> books) {
            passed = true;
        }
    }

    private class MockBooksRepository implements BooksRepository{

        @Override
        public List<Book> getBooks() {
            return null;
        }
    }

}
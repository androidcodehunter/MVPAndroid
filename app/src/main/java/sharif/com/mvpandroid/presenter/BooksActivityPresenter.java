package sharif.com.mvpandroid.presenter;

import sharif.com.mvpandroid.repository.BooksRepository;
import sharif.com.mvpandroid.view.BooksActivityView;

/**
 * Created by sharifurrahaman on 7/21/17.
 */

public class BooksActivityPresenter {


    private final BooksActivityView view;

    public BooksActivityPresenter(BooksActivityView view, BooksRepository booksRepository){
        this.view = view;
    }

    public void loadBooks() {

    }
}

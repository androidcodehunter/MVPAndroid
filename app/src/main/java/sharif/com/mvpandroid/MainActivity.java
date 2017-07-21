package sharif.com.mvpandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import sharif.com.mvpandroid.presenter.BooksActivityPresenter;
import sharif.com.mvpandroid.view.BooksActivityView;

public class MainActivity extends AppCompatActivity implements BooksActivityView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BooksActivityPresenter presenter = new BooksActivityPresenter(this, null);



    }

    @Override
    public void displayBooks(List<Book> books) {

    }
}

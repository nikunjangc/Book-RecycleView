package nyc.c4q.bookrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.bookrecycleview.controller.BookAdaptor;
import nyc.c4q.bookrecycleview.model.Book;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      RecyclerView bookrecyclerview = (RecyclerView)  findViewById(R.id.book_recyclerview);
        List <Book> books=new ArrayList<>();
      //  List<Book> books= new ArrayList<>();
        books.add(new Book(R.drawable.ic_launcher_background,"Two States","Chetan Bhagwat", "2015"));
        books.add(new Book(R.drawable.ic_launcher_background,"Two River","Ram Bhagwat", "2015"));
        books.add(new Book(R.drawable.ic_launcher_background,"Muna Madan","Lakshmi Prashad Devkota", "1959"));
        books.add(new Book(R.drawable.ic_launcher_background,"The Cather In The Rye","J.D Salinger", "1965"));
        books.add(new Book(R.drawable.ic_launcher_background,"Three  Musketeers","Alexandre Dumas", "1844"));
        books.add(new Book(R.drawable.ic_launcher_background,"The Alchemist","Paulo Coelho ", "1988"));



        BookAdaptor bookAdaptor = new BookAdaptor(books);
    LinearLayoutManager linearLayoutManager =new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
    bookrecyclerview.setAdapter(bookAdaptor);
    bookrecyclerview.setLayoutManager(linearLayoutManager);
    }
}

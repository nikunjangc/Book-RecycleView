package nyc.c4q.bookrecycleview.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.bookrecycleview.R;
import nyc.c4q.bookrecycleview.model.Book;
import nyc.c4q.bookrecycleview.view.BookViewHolder;

/**
 * Created by Nikunjan on 11/5/17.
 */

public class BookAdaptor extends RecyclerView.Adapter<BookViewHolder> {

    private List<Book> bookList;
    public BookAdaptor (List<Book> bookList){
        this.bookList=bookList;
    }


    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemviewlayout,parent,false);
        return new BookViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(BookViewHolder holder, int position) {
        Book books = bookList.get(position);
        holder.onBind(books);
    }

    @Override
    public int getItemCount() {
       return bookList.size();
    }
}

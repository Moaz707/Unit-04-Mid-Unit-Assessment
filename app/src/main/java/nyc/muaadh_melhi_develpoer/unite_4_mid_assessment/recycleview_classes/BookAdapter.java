package nyc.muaadh_melhi_develpoer.unite_4_mid_assessment.recycleview_classes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.muaadh_melhi_develpoer.unite_4_mid_assessment.R;
import nyc.muaadh_melhi_develpoer.unite_4_mid_assessment.data.BookModel;

/**
 * Created by c4q on 12/20/17.
 */

public class BookAdapter extends RecyclerView.Adapter<BookViewHolder> {
    private List<BookModel> booklist = new ArrayList<>();

    public BookAdapter(List<BookModel> booklist) {
        this.booklist = booklist;
    }

    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BookViewHolder holder, int position) {
        BookModel bookModel = booklist.get(position);
        holder.bind(bookModel);

    }

    @Override
    public int getItemCount() {
        return booklist.size();
    }
}

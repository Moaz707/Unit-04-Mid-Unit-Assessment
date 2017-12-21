package nyc.muaadh_melhi_develpoer.unite_4_mid_assessment.recycleview_classes;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.muaadh_melhi_develpoer.unite_4_mid_assessment.R;
import nyc.muaadh_melhi_develpoer.unite_4_mid_assessment.data.BookModel;

/**
 * Created by c4q on 12/20/17.
 */

class BookViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;

    public BookViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.text_book);
    }

    public void bind(BookModel bookModel) {
        textView.setText(bookModel.getTitle());
    }
}

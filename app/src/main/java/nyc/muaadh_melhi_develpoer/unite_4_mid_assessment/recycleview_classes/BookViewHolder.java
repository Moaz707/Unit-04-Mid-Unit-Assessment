package nyc.muaadh_melhi_develpoer.unite_4_mid_assessment.recycleview_classes;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.muaadh_melhi_develpoer.unite_4_mid_assessment.R;
import nyc.muaadh_melhi_develpoer.unite_4_mid_assessment.data.BookModel;
import nyc.muaadh_melhi_develpoer.unite_4_mid_assessment.fragment.TopFragment;

/**
 * Created by c4q on 12/20/17.
 */

class BookViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;
    private Context context;

    public BookViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.text_book);
    }

    public void bind(final BookModel bookModel) {
        textView.setText(bookModel.getTitle());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("title", bookModel.getTitle());
                bundle.putString("author", bookModel.getAuthor());
                bundle.putInt("year", +bookModel.getYear());

                TopFragment topFragment = new TopFragment();
                AppCompatActivity fragmentActivity = (AppCompatActivity) v.getContext();
                FragmentManager manager = fragmentActivity.getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                topFragment.setArguments(bundle);
                transaction.addToBackStack("").replace(R.id.top_fragment, topFragment).commit();


            }
        });

    }
}

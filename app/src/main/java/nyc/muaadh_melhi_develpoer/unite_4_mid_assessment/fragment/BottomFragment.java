package nyc.muaadh_melhi_develpoer.unite_4_mid_assessment.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import nyc.muaadh_melhi_develpoer.unite_4_mid_assessment.R;
import nyc.muaadh_melhi_develpoer.unite_4_mid_assessment.data.BookModel;
import nyc.muaadh_melhi_develpoer.unite_4_mid_assessment.data.JsonInfo;
import nyc.muaadh_melhi_develpoer.unite_4_mid_assessment.recycleview_classes.BookAdapter;

import static android.content.ContentValues.TAG;

/**
 * A simple {@link Fragment} subclass.
 */
public class BottomFragment extends Fragment {
    private View rootView;
    private List<BookModel> bookList;


    public BottomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_bottom, container, false);


        return rootView;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String jsonString = JsonInfo.JSINFO;


        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray jsonArray = jsonObject.getJSONArray("books");
            bookList=new ArrayList<>();


            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject objectArray = jsonArray.getJSONObject(i);
                BookModel bookModel = new BookModel();

                String title = objectArray.getString("title");
                String author = objectArray.getString("author");
                int year = objectArray.getInt("year");

                bookModel.setTitle(title);
                bookModel.setAuthor(author);
                bookModel.setYear(year);
                bookList.add(bookModel);

            }
            Log.d(TAG, "onActivityCreated: " + bookList.size());

        } catch (JSONException e) {
            e.printStackTrace();
        }
        RecyclerView recyclerView=rootView.findViewById(R.id.recycle_view);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        BookAdapter bookAdapter=new BookAdapter(bookList);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(bookAdapter);



    }
}

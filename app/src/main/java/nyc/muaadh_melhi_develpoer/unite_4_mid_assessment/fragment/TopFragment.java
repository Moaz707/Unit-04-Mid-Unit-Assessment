package nyc.muaadh_melhi_develpoer.unite_4_mid_assessment.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import nyc.muaadh_melhi_develpoer.unite_4_mid_assessment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TopFragment extends Fragment {
    private View rootView;
    private TextView titleText;
    private TextView authorText;
    private TextView yearText;


    public TopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_top, container, false);
        titleText = rootView.findViewById(R.id.text_title);
        authorText = rootView.findViewById(R.id.text_author);
        yearText = rootView.findViewById(R.id.text_year);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        Bundle bundle = getArguments();
        String title = bundle.getString("title");
        String author = bundle.getString("author");
        int year = bundle.getInt("year");
        titleText.setText(title);
        authorText.setText(author);
        yearText.setText("" + year);


    }
}

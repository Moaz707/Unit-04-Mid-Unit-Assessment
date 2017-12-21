package nyc.muaadh_melhi_develpoer.unite_4_mid_assessment.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.muaadh_melhi_develpoer.unite_4_mid_assessment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayFragment extends Fragment {
    private View rootView;

    public DisplayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_display, container, false);

        return rootView;


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        TopFragment topFragment = new TopFragment();
        FragmentManager manager = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack("").replace(R.id.top_fragment, topFragment).commit();


        BottomFragment bottomFragment = new BottomFragment();
        FragmentManager bottomManger = getActivity().getSupportFragmentManager();
        FragmentTransaction bottomTransaction = bottomManger.beginTransaction();
        bottomTransaction.addToBackStack("").replace(R.id.bottom_fragment, bottomFragment).commit();


    }
}

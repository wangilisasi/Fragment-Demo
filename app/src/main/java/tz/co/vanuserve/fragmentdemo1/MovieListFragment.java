package tz.co.vanuserve.fragmentdemo1;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MovieListFragment extends Fragment {
    private static final String TAG = "MovieListFragment";

    public MovieListFragment() {
        //Empty constructor required by the system
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: Frag Called");
        View view = inflater.inflate(R.layout.movie_fragment, container, false);
        return view;
    }
}
package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    Button button;
    ProgressBar progressBar;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        button = root.findViewById(R.id.jokeButton);
        progressBar = (ProgressBar) root.findViewById(R.id.progressbar);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tellJoke();
            }
        });
        return root;
    }

    public void tellJoke(){
       /* myClass joker = new myClass();
        String joke = joker.getRandomJoke();
        Intent intent = new Intent(getActivity(), JokeActivity.class);
        intent.putExtra("JOKE_EXTRA", joke);
        startActivity(intent);*/

        new EndpointsAsyncTask(getContext(), progressBar).execute();
    }
}

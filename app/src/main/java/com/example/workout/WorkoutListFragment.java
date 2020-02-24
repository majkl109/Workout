package com.example.workout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ListFragment;

public class WorkoutListFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedOnInstanceState){
        String[] names = new String[Workout.workouts.length];
        for(int i = 0; i < names.length; i++){
            names[i] = Workout.workouts[i].getName();
        }

        return super.onCreateView(inflater,container, savedInstanceState);
    }
}

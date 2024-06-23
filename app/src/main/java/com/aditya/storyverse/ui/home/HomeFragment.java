package com.aditya.storyverse.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.aditya.storyverse.Adapter.StoryAdapter;
import com.aditya.storyverse.Model.StoryModel;
import com.aditya.storyverse.R;
import com.aditya.storyverse.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    RecyclerView storyRV;
    ArrayList<StoryModel> list;

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        storyRV = root.findViewById(R.id.storyRV);
        list = new ArrayList<>();
        list.add(new StoryModel(R.drawable.photo2, R.drawable.live_sphere, R.drawable.profile, "Iron-Man"));
        list.add(new StoryModel(R.drawable.photo3, R.drawable.live_sphere, R.drawable.profile, "Thor"));
        list.add(new StoryModel(R.drawable.photo4, R.drawable.live_sphere, R.drawable.profile, "Hulk"));
//        list.add(new StoryModel(R.drawable.photo2, R.drawable.live_sphere, R.drawable.profile, "IRON Man"));
//        list.add(new StoryModel(R.drawable.photo2, R.drawable.live_sphere, R.drawable.profile, "IRON Man"));

        StoryAdapter adapter = new StoryAdapter(list, getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        storyRV.setLayoutManager(linearLayoutManager);
        storyRV.setNestedScrollingEnabled(false);
        storyRV.setAdapter(adapter);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
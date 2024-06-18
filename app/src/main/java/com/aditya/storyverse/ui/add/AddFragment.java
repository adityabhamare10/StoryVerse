package com.aditya.storyverse.ui.add;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.aditya.storyverse.R;
import com.aditya.storyverse.databinding.FragmentAddBinding;

import jp.wasabeef.richeditor.RichEditor;


public class AddFragment extends Fragment {

    private RichEditor mEditor;
    private FragmentAddBinding binding;
    private AddViewModel addViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        addViewModel = new ViewModelProvider(this).get(AddViewModel.class);

        binding = FragmentAddBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        mEditor = binding.editor;
        configureRichEditor();
        configureToolbar(root);
//        addViewModel.getText().observe(getViewLifecycleOwner(), newText -> {
//            mEditor.setHtml(newText);
//        });
        return root;
    }

    private void configureRichEditor() {
        mEditor.setEditorHeight(200);
        mEditor.setEditorFontSize(22);
        mEditor.setEditorFontColor(Color.BLACK);
        mEditor.setPadding(10, 10, 10, 10);
        mEditor.setPlaceholder("Start writing your story...");

        // Example: Set some default text
//        mEditor.setHtml(addViewModel.getText().getValue());

//        mEditor.setOnTextChangeListener(new RichEditor.OnTextChangeListener() {
//            @Override
//            public void onTextChange(String text) {
//                addViewModel.setText(text);
//            }
//        });

        // Add more configuration or event listeners as needed
    }

    private void configureToolbar(View root) {
        ImageButton actionBold = root.findViewById(R.id.action_bold);
        actionBold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setBold();
            }
        });

        ImageButton actionItalic = root.findViewById(R.id.action_italic);
        actionItalic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setItalic();
            }
        });

        ImageButton actionUnderline = root.findViewById(R.id.action_underline);
        actionUnderline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setUnderline();
            }
        });

        ImageButton actionColor = root.findViewById(R.id.action_color);
        actionColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setTextColor(Color.RED); // Change to a color picker if needed
            }
        });

        // Add more button configurations as needed
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
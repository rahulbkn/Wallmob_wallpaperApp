// Generated file. Do not modify.
package com.rv.wallmob;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class ErrorStateBinding {
    public final LinearLayout rootView;
    public final ImageView imageview2;
    public final TextView errorMessage;
    public final Button retryButton;

    private ErrorStateBinding(LinearLayout rootView, ImageView imageview2, TextView errorMessage, Button retryButton) {
        this.rootView = rootView;
        this.imageview2 = imageview2;
        this.errorMessage = errorMessage;
        this.retryButton = retryButton;
    }

    public LinearLayout getRoot() {
        return rootView;
    }

    public static ErrorStateBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ErrorStateBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.error_state, parent, false);
        if (attachToParent) parent.addView(root);
        return bind(root);
    }

    public static ErrorStateBinding bind(View view) {
        LinearLayout rootView = (LinearLayout) view;
        ImageView imageview2 = findChildViewById(view, R.id.imageview2);
        TextView errorMessage = findChildViewById(view, R.id.error_message);
        Button retryButton = findChildViewById(view, R.id.retry_button);

        if (imageview2 == null || errorMessage == null || retryButton == null) {
             throw new IllegalStateException("Required views are missing");
        }

        return new ErrorStateBinding(rootView, imageview2, errorMessage, retryButton);
    }

    private static <T extends View> T findChildViewById(View rootView, int id) {
         if (rootView instanceof ViewGroup) {
              ViewGroup rootViewGroup = (ViewGroup) rootView;
              for (int i = 0; i < rootViewGroup.getChildCount(); i++) {
                   T view = rootViewGroup.getChildAt(i).findViewById(id);
                   if (view != null) return view;
              }
         }
         return null;
    }
}
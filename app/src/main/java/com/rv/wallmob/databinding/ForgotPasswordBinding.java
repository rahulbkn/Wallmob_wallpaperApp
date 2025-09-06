// Generated file. Do not modify.
package com.rv.wallmob;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public final class ForgotPasswordBinding {
    public final NestedScrollView rootView;
    public final LinearLayout linear13;
    public final MaterialCardView cardview4;
    public final ImageView imageview2;
    public final TextView textview3;
    public final TextView textview4;
    public final TextInputLayout emailLayout;
    public final TextInputEditText emailInput;
    public final MaterialButton resetButton;
    public final CircularProgressIndicator progress;
    public final MaterialButton backButton;

    private ForgotPasswordBinding(NestedScrollView rootView, LinearLayout linear13, MaterialCardView cardview4, ImageView imageview2, TextView textview3, TextView textview4, TextInputLayout emailLayout, TextInputEditText emailInput, MaterialButton resetButton, CircularProgressIndicator progress, MaterialButton backButton) {
        this.rootView = rootView;
        this.linear13 = linear13;
        this.cardview4 = cardview4;
        this.imageview2 = imageview2;
        this.textview3 = textview3;
        this.textview4 = textview4;
        this.emailLayout = emailLayout;
        this.emailInput = emailInput;
        this.resetButton = resetButton;
        this.progress = progress;
        this.backButton = backButton;
    }

    public NestedScrollView getRoot() {
        return rootView;
    }

    public static ForgotPasswordBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ForgotPasswordBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.forgot_password, parent, false);
        if (attachToParent) parent.addView(root);
        return bind(root);
    }

    public static ForgotPasswordBinding bind(View view) {
        NestedScrollView rootView = (NestedScrollView) view;
        LinearLayout linear13 = findChildViewById(view, R.id.linear13);
        MaterialCardView cardview4 = findChildViewById(view, R.id.cardview4);
        ImageView imageview2 = findChildViewById(view, R.id.imageview2);
        TextView textview3 = findChildViewById(view, R.id.textview3);
        TextView textview4 = findChildViewById(view, R.id.textview4);
        TextInputLayout emailLayout = findChildViewById(view, R.id.email_layout);
        TextInputEditText emailInput = findChildViewById(view, R.id.email_input);
        MaterialButton resetButton = findChildViewById(view, R.id.reset_button);
        CircularProgressIndicator progress = findChildViewById(view, R.id.progress);
        MaterialButton backButton = findChildViewById(view, R.id.back_button);

        if (linear13 == null || cardview4 == null || imageview2 == null || textview3 == null || textview4 == null || emailLayout == null || emailInput == null || resetButton == null || progress == null || backButton == null) {
             throw new IllegalStateException("Required views are missing");
        }

        return new ForgotPasswordBinding(rootView, linear13, cardview4, imageview2, textview3, textview4, emailLayout, emailInput, resetButton, progress, backButton);
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
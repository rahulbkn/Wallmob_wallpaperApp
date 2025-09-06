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

public final class SignupBinding {
    public final NestedScrollView rootView;
    public final LinearLayout linear15;
    public final MaterialCardView cardview9;
    public final ImageView imageview2;
    public final TextView textview10;
    public final TextView textview11;
    public final TextInputLayout usernameLayout;
    public final TextInputEditText usernameInput;
    public final TextInputLayout emailLayout;
    public final TextInputEditText emailInput;
    public final TextInputLayout passwordLayout;
    public final TextInputEditText passwordInput;
    public final MaterialButton signupButton;
    public final CircularProgressIndicator progress;

    private SignupBinding(NestedScrollView rootView, LinearLayout linear15, MaterialCardView cardview9, ImageView imageview2, TextView textview10, TextView textview11, TextInputLayout usernameLayout, TextInputEditText usernameInput, TextInputLayout emailLayout, TextInputEditText emailInput, TextInputLayout passwordLayout, TextInputEditText passwordInput, MaterialButton signupButton, CircularProgressIndicator progress) {
        this.rootView = rootView;
        this.linear15 = linear15;
        this.cardview9 = cardview9;
        this.imageview2 = imageview2;
        this.textview10 = textview10;
        this.textview11 = textview11;
        this.usernameLayout = usernameLayout;
        this.usernameInput = usernameInput;
        this.emailLayout = emailLayout;
        this.emailInput = emailInput;
        this.passwordLayout = passwordLayout;
        this.passwordInput = passwordInput;
        this.signupButton = signupButton;
        this.progress = progress;
    }

    public NestedScrollView getRoot() {
        return rootView;
    }

    public static SignupBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static SignupBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.signup, parent, false);
        if (attachToParent) parent.addView(root);
        return bind(root);
    }

    public static SignupBinding bind(View view) {
        NestedScrollView rootView = (NestedScrollView) view;
        LinearLayout linear15 = findChildViewById(view, R.id.linear15);
        MaterialCardView cardview9 = findChildViewById(view, R.id.cardview9);
        ImageView imageview2 = findChildViewById(view, R.id.imageview2);
        TextView textview10 = findChildViewById(view, R.id.textview10);
        TextView textview11 = findChildViewById(view, R.id.textview11);
        TextInputLayout usernameLayout = findChildViewById(view, R.id.username_layout);
        TextInputEditText usernameInput = findChildViewById(view, R.id.username_input);
        TextInputLayout emailLayout = findChildViewById(view, R.id.email_layout);
        TextInputEditText emailInput = findChildViewById(view, R.id.email_input);
        TextInputLayout passwordLayout = findChildViewById(view, R.id.password_layout);
        TextInputEditText passwordInput = findChildViewById(view, R.id.password_input);
        MaterialButton signupButton = findChildViewById(view, R.id.signup_button);
        CircularProgressIndicator progress = findChildViewById(view, R.id.progress);

        if (linear15 == null || cardview9 == null || imageview2 == null || textview10 == null || textview11 == null || usernameLayout == null || usernameInput == null || emailLayout == null || emailInput == null || passwordLayout == null || passwordInput == null || signupButton == null || progress == null) {
             throw new IllegalStateException("Required views are missing");
        }

        return new SignupBinding(rootView, linear15, cardview9, imageview2, textview10, textview11, usernameLayout, usernameInput, emailLayout, emailInput, passwordLayout, passwordInput, signupButton, progress);
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
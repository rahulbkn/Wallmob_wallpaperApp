// Generated file. Do not modify.
package com.rv.wallmob;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public final class LoginBinding {
    public final ConstraintLayout rootView;
    public final ScrollView vscroll2;
    public final LinearLayout linear6;
    public final MaterialCardView cardview6;
    public final ImageView logo;
    public final TextView title;
    public final TextView subtitle;
    public final TextInputLayout emailLayout;
    public final TextInputEditText emailInput;
    public final TextInputLayout passwordLayout;
    public final TextInputEditText passwordInput;
    public final TextView forgotPassword;
    public final MaterialButton loginButton;
    public final CircularProgressIndicator progress;
    public final LinearLayout linear7;
    public final View view8;
    public final TextView textview3;
    public final View view9;
    public final MaterialButton googleButton;
    public final MaterialButton skipButton;
    public final LinearLayout linear10;
    public final TextView textview4;
    public final MaterialButton signupButton;

    private LoginBinding(ConstraintLayout rootView, ScrollView vscroll2, LinearLayout linear6, MaterialCardView cardview6, ImageView logo, TextView title, TextView subtitle, TextInputLayout emailLayout, TextInputEditText emailInput, TextInputLayout passwordLayout, TextInputEditText passwordInput, TextView forgotPassword, MaterialButton loginButton, CircularProgressIndicator progress, LinearLayout linear7, View view8, TextView textview3, View view9, MaterialButton googleButton, MaterialButton skipButton, LinearLayout linear10, TextView textview4, MaterialButton signupButton) {
        this.rootView = rootView;
        this.vscroll2 = vscroll2;
        this.linear6 = linear6;
        this.cardview6 = cardview6;
        this.logo = logo;
        this.title = title;
        this.subtitle = subtitle;
        this.emailLayout = emailLayout;
        this.emailInput = emailInput;
        this.passwordLayout = passwordLayout;
        this.passwordInput = passwordInput;
        this.forgotPassword = forgotPassword;
        this.loginButton = loginButton;
        this.progress = progress;
        this.linear7 = linear7;
        this.view8 = view8;
        this.textview3 = textview3;
        this.view9 = view9;
        this.googleButton = googleButton;
        this.skipButton = skipButton;
        this.linear10 = linear10;
        this.textview4 = textview4;
        this.signupButton = signupButton;
    }

    public ConstraintLayout getRoot() {
        return rootView;
    }

    public static LoginBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static LoginBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.login, parent, false);
        if (attachToParent) parent.addView(root);
        return bind(root);
    }

    public static LoginBinding bind(View view) {
        ConstraintLayout rootView = (ConstraintLayout) view;
        ScrollView vscroll2 = findChildViewById(view, R.id.vscroll2);
        LinearLayout linear6 = findChildViewById(view, R.id.linear6);
        MaterialCardView cardview6 = findChildViewById(view, R.id.cardview6);
        ImageView logo = findChildViewById(view, R.id.logo);
        TextView title = findChildViewById(view, R.id.title);
        TextView subtitle = findChildViewById(view, R.id.subtitle);
        TextInputLayout emailLayout = findChildViewById(view, R.id.email_layout);
        TextInputEditText emailInput = findChildViewById(view, R.id.email_input);
        TextInputLayout passwordLayout = findChildViewById(view, R.id.password_layout);
        TextInputEditText passwordInput = findChildViewById(view, R.id.password_input);
        TextView forgotPassword = findChildViewById(view, R.id.forgot_password);
        MaterialButton loginButton = findChildViewById(view, R.id.login_button);
        CircularProgressIndicator progress = findChildViewById(view, R.id.progress);
        LinearLayout linear7 = findChildViewById(view, R.id.linear7);
        View view8 = findChildViewById(view, R.id.view8);
        TextView textview3 = findChildViewById(view, R.id.textview3);
        View view9 = findChildViewById(view, R.id.view9);
        MaterialButton googleButton = findChildViewById(view, R.id.google_button);
        MaterialButton skipButton = findChildViewById(view, R.id.skip_button);
        LinearLayout linear10 = findChildViewById(view, R.id.linear10);
        TextView textview4 = findChildViewById(view, R.id.textview4);
        MaterialButton signupButton = findChildViewById(view, R.id.signup_button);

        if (vscroll2 == null || linear6 == null || cardview6 == null || logo == null || title == null || subtitle == null || emailLayout == null || emailInput == null || passwordLayout == null || passwordInput == null || forgotPassword == null || loginButton == null || progress == null || linear7 == null || view8 == null || textview3 == null || view9 == null || googleButton == null || skipButton == null || linear10 == null || textview4 == null || signupButton == null) {
             throw new IllegalStateException("Required views are missing");
        }

        return new LoginBinding(rootView, vscroll2, linear6, cardview6, logo, title, subtitle, emailLayout, emailInput, passwordLayout, passwordInput, forgotPassword, loginButton, progress, linear7, view8, textview3, view9, googleButton, skipButton, linear10, textview4, signupButton);
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
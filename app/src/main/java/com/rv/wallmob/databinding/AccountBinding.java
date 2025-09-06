// Generated file. Do not modify.
package com.rv.wallmob;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

public final class AccountBinding {
    public final ConstraintLayout rootView;
    public final MaterialToolbar topAppBar;
    public final MaterialCardView profileCard;
    public final LinearLayout linear3;
    public final ImageView avatar;
    public final LinearLayout linear4;
    public final TextView tvName;
    public final TextView tvEmail;
    public final MaterialButton btnEdit;
    public final MaterialButton btnPrimaryAction;
    public final MaterialButton btnLogout;

    private AccountBinding(ConstraintLayout rootView, MaterialToolbar topAppBar, MaterialCardView profileCard, LinearLayout linear3, ImageView avatar, LinearLayout linear4, TextView tvName, TextView tvEmail, MaterialButton btnEdit, MaterialButton btnPrimaryAction, MaterialButton btnLogout) {
        this.rootView = rootView;
        this.topAppBar = topAppBar;
        this.profileCard = profileCard;
        this.linear3 = linear3;
        this.avatar = avatar;
        this.linear4 = linear4;
        this.tvName = tvName;
        this.tvEmail = tvEmail;
        this.btnEdit = btnEdit;
        this.btnPrimaryAction = btnPrimaryAction;
        this.btnLogout = btnLogout;
    }

    public ConstraintLayout getRoot() {
        return rootView;
    }

    public static AccountBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static AccountBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.account, parent, false);
        if (attachToParent) parent.addView(root);
        return bind(root);
    }

    public static AccountBinding bind(View view) {
        ConstraintLayout rootView = (ConstraintLayout) view;
        MaterialToolbar topAppBar = findChildViewById(view, R.id.topAppBar);
        MaterialCardView profileCard = findChildViewById(view, R.id.profileCard);
        LinearLayout linear3 = findChildViewById(view, R.id.linear3);
        ImageView avatar = findChildViewById(view, R.id.avatar);
        LinearLayout linear4 = findChildViewById(view, R.id.linear4);
        TextView tvName = findChildViewById(view, R.id.tvName);
        TextView tvEmail = findChildViewById(view, R.id.tvEmail);
        MaterialButton btnEdit = findChildViewById(view, R.id.btnEdit);
        MaterialButton btnPrimaryAction = findChildViewById(view, R.id.btnPrimaryAction);
        MaterialButton btnLogout = findChildViewById(view, R.id.btnLogout);

        if (topAppBar == null || profileCard == null || linear3 == null || avatar == null || linear4 == null || tvName == null || tvEmail == null || btnEdit == null || btnPrimaryAction == null || btnLogout == null) {
             throw new IllegalStateException("Required views are missing");
        }

        return new AccountBinding(rootView, topAppBar, profileCard, linear3, avatar, linear4, tvName, tvEmail, btnEdit, btnPrimaryAction, btnLogout);
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
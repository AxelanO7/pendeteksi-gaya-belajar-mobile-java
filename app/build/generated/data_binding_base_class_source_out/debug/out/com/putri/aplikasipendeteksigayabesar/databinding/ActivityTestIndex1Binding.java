// Generated by view binder compiler. Do not edit!
package com.putri.aplikasipendeteksigayabesar.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.putri.aplikasipendeteksigayabesar.NonScrollListView;
import com.putri.aplikasipendeteksigayabesar.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTestIndex1Binding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final NonScrollListView listView;

  private ActivityTestIndex1Binding(@NonNull ScrollView rootView, @NonNull Button button,
      @NonNull NonScrollListView listView) {
    this.rootView = rootView;
    this.button = button;
    this.listView = listView;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTestIndex1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTestIndex1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_test_index1, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTestIndex1Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.list_view;
      NonScrollListView listView = ViewBindings.findChildViewById(rootView, id);
      if (listView == null) {
        break missingId;
      }

      return new ActivityTestIndex1Binding((ScrollView) rootView, button, listView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

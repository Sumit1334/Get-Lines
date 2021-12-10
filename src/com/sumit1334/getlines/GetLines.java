package com.sumit1334.getlines;

import android.widget.TextView;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.ComponentContainer;

public class GetLines extends AndroidNonvisibleComponent implements Component {

  public GetLines(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction
  public int GetLineCount(AndroidViewComponent component) {
    TextView textView = (TextView) component.getView();
    return textView.getLineCount();
  }
}
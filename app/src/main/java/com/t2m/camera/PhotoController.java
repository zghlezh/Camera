package com.t2m.camera;

import android.graphics.Rect;

import com.t2m.camera.view.ShutterButton;

/**
 * Created by user on 6/8/16.
 */
public interface PhotoController extends ShutterButton.OnShutterButtonListener {

    public void onPreviewUIReady();

    public void onPreviewUIDestroyed();
}

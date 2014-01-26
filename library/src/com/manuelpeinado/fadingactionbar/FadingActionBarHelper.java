/*
 * Copyright (C) 2013 Manuel Peinado
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.manuelpeinado.fadingactionbar;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Window;

public class FadingActionBarHelper extends FadingActionBarHelperBase {

    private ActionBar mActionBar;
    private Window mWindow;

    @SuppressLint("NewApi")
    @Override
    public void initActionBar(Activity activity) {
        mActionBar = activity.getActionBar();
        mWindow = activity.getWindow();
        super.initActionBar(activity);
    }

    @SuppressLint("NewApi")
    @Override
    protected int getActionBarHeight() {
        return mActionBar.getHeight();
    }
    
    @Override
    protected int getWindowHeight() {
    	Rect rectgle = new Rect();
    	mWindow.getDecorView().getWindowVisibleDisplayFrame(rectgle);
        return rectgle.height();
    }
    
    @Override
    protected int getWindowWidth() {
    	Rect rectgle = new Rect();
    	mWindow.getDecorView().getWindowVisibleDisplayFrame(rectgle);
        return rectgle.width();
    }

    @Override
    protected boolean isActionBarNull() {
        return mActionBar == null;
    }

    @SuppressLint("NewApi")
    @Override
    protected void setActionBarBackgroundDrawable(Drawable drawable) {
        mActionBar.setBackgroundDrawable(drawable);
    }
}

package com.oozeetech.bizdesk.utils;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by root on 10/6/17.
 */

public class DividerItemDecorator extends RecyclerView.ItemDecoration {

    Drawable mDrawable;

    public DividerItemDecorator(Drawable drawable) {

        this.mDrawable = drawable;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);

        if (parent.getChildAdapterPosition(view) == 0) {
            return;
        } else {
            outRect.top = mDrawable.getIntrinsicHeight();
        }
    }

    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDraw(c, parent, state);

        int dividerLeft = parent.getLeft();
        int dividerRight = parent.getWidth() - parent.getRight();

        int childCount = parent.getChildCount();

        for (int i = 0; i < childCount; i++) {

            View child = parent.getChildAt(i);

            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();

            int dividerTop = child.getBottom() + params.bottomMargin;
            int dividerBottom = dividerTop + mDrawable.getIntrinsicHeight();

            mDrawable.setBounds(dividerLeft, dividerTop, dividerRight, dividerBottom);
            mDrawable.draw(c);
        }
    }
}

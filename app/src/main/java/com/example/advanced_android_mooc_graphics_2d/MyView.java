package com.example.advanced_android_mooc_graphics_2d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {

    private Paint redpaint,bluepaint;
    public MyView(Context context) {
        super(context);

        redpaint  = new Paint(Paint.ANTI_ALIAS_FLAG);
        redpaint.setStyle(Paint.Style.STROKE);
        redpaint.setColor(Color.RED);
        redpaint.setStrokeWidth(5);

        bluepaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        bluepaint.setStyle(Paint.Style.STROKE);
        bluepaint.setColor(Color.BLUE);
        bluepaint.setStrokeWidth(5);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawRect(10,30,200,200,redpaint);
        canvas.drawCircle(300,300,250,bluepaint);
    }
}

package com.android.graphics;

import android.graphics.Paint;

public class Text {
    private String text;
    private float textX = 0F;
    private float textY = 0F;
    private Paint paint;

    public Text(String text, Paint paint) {
        this.text = text;
        this.paint = paint;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public float getTextX() {
        return textX;
    }

    public void setTextX(float textX) {
        this.textX = textX;
    }

    public float getTextY() {
        return textY;
    }

    public void setTextY(float textY) {
        this.textY = textY;
    }

    public int length() {
        return text.length();
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }
}

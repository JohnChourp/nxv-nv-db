package com.example.myapplication;

import android.widget.ImageView;
import android.widget.LinearLayout;

public class SetParamsForCharThumb {
    ImageView imageId;
    LinearLayout.LayoutParams imageId_Params;

    public void setImageIdVisible() {
        this.imageId.setVisibility(ImageView.VISIBLE);
    }

    public void setImageIdInvisible(ImageView imageId) {
        imageId.setVisibility(ImageView.INVISIBLE);
    }

    public LinearLayout.LayoutParams getImageIdLayoutParams() {
        return (LinearLayout.LayoutParams) this.imageId.getLayoutParams();
    }

    public void setImageIdLayoutParams() {
        this.imageId_Params = getImageId_Params();
    }

    public void setImageId(ImageView imageId) {
        this.imageId = imageId;
    }

    public LinearLayout.LayoutParams getImageId_Params() {
        return imageId_Params;
    }

    public void setImageId_Params() {
        this.imageId_Params = getImageIdLayoutParams();
    }
}

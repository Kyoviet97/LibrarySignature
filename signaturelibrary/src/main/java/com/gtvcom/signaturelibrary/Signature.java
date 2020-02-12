package com.gtvcom.signaturelibrary;

import android.content.Context;
import android.graphics.Bitmap;

import com.github.gcacace.signaturepad.views.SignaturePad;

public class Signature {
    private Context context;
    private SignaturePad signaturePad;

    public Signature(Context context, SignaturePad signaturePad) {
        this.context = context;
        this.signaturePad = signaturePad;

        signaturePad.setOnSignedListener(new SignaturePad.OnSignedListener() {

            @Override
            public void onStartSigning() {
                //Event triggered when the pad is touched
            }

            @Override
            public void onSigned() {
                //Event triggered when the pad is signed
            }

            @Override
            public void onClear() {
                //Event triggered when the pad is cleared
            }
        });
    }

    public void setColorPen(int color){
        signaturePad.setPenColor(color);
    }

    public Bitmap getBitmap(){
        Bitmap bitmap = null;
        bitmap = signaturePad.getTransparentSignatureBitmap();
        return bitmap;
    }

    public void clear(){
        signaturePad.clear();
    }

}

package com.oozeetech.bizdesk.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.widget.Button;
import android.widget.TextView;

import com.oozeetech.bizdesk.R;


/**
 * Created by Vishal Sojitra on 4/22/2016.
 */
public class DialogFactory {

    public static void alertDialog(Context context, String title, String msg, String positive, String negative, DialogInterface.OnClickListener positiveListener, DialogInterface.OnClickListener negativeListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setTitle(title);
        builder.setMessage(msg);
        builder.setPositiveButton(positive, positiveListener)
                .setNegativeButton(negative, negativeListener);
        // Create the AlertDialog object and return it
        AlertDialog alertDialog = builder.create();
//        alertDialog.getWindow().setWindowAnimations(R.style.dialog_animation_fade);
        alertDialog.show();
        TextView txtMessage = (TextView) alertDialog
                .findViewById(android.R.id.message);
        TextView txtTitle = (TextView) alertDialog.findViewById(R.id.alertTitle);
        Button btnPositive = (Button) alertDialog.findViewById(android.R.id.button1);
        Button btnNegative = (Button) alertDialog.findViewById(android.R.id.button2);
        txtTitle.setTypeface(FontUtils.fontName(context, 4));
        txtMessage.setTypeface(FontUtils.fontName(context, 1));
        btnPositive.setTypeface(FontUtils.fontName(context, 4));
        btnNegative.setTypeface(FontUtils.fontName(context, 4));
        btnPositive.setTextColor(context.getResources().getColor(R.color.colorAccent));
        btnNegative.setTextColor(context.getResources().getColor(R.color.colorAccent));
    }
}

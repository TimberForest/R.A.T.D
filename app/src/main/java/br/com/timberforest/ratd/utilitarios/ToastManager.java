package br.com.timberforest.ratd.utilitarios;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import br.com.timberforest.ratd.R;

/**
 * Created by sander on 07/06/17.
 */

public class ToastManager {

    public static final int INFORMATION = 0;
    public static final int WARNING     = 1;
    public static final int ERROR       = 2;
    public static final int OK          = 3;
    public int TEMPO = 4000;

    public static void show(Context context, String text,
                            int toastType) {

        LayoutInflater inflater =

        (LayoutInflater) context.getSystemService(

                Context.LAYOUT_INFLATER_SERVICE);

        View layout = inflater.inflate(R.layout.toast_layout, null);

        TextView tv = (TextView) layout.findViewById(R.id.tvTexto);
        TextView tvImg = (TextView) layout.findViewById(R.id.tvImg);

        tv.setText(text);

        LinearLayout llRoot =

        (LinearLayout) layout.findViewById(R.id.llRoot);

        Drawable img;

        int bg;

        switch (toastType) {

            case WARNING:

                img = context.getResources().getDrawable(R.drawable.ic_warning);

                bg  = R.drawable.toast_background_yellow;

                break;

            case ERROR:

                img = context.getResources().getDrawable(R.drawable.ic_error);

                bg  = R.drawable.toast_background_red;

                break;

            case OK:

                img = context.getResources().getDrawable(R.drawable.ic_check_white);

                bg  = R.drawable.toast_background_green;

                break;

            default:

                img = context.getResources().getDrawable(R.drawable.ic_info);

                bg  = R.drawable.toast_background_blue;

                break;



        }

        tvImg.setCompoundDrawablesWithIntrinsicBounds(img, null, null, null);

        llRoot.setBackgroundResource(bg);



        Toast toast = new Toast(context);

        toast.setGravity(Gravity.CENTER, 0, 0);

        toast.setDuration(Toast.LENGTH_LONG);

        toast.setView(layout);
        toast.show();

    }

}

package br.com.timberforest.ratd.utilitarios;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 * Created by Cayo Sander on 26/01/2017.
 * email: cayo.muniz@fatec.sp.gov.br
 */

public class EnviarEmail {

    public static void enviarEmail(Context context, String email) {

        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:"+email));
        context.startActivity(intent);
    }
}
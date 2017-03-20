package br.com.timberforest.ratd.utilitarios;

import android.app.IntentService;
import android.content.Intent;
import android.location.Location;

/*
 * Created by sander on 24/02/17.
 */


public class LocationIntentService extends IntentService {

    public LocationIntentService(){
        super("worker_thread");
    }
    @Override
    protected void onHandleIntent(Intent intent) {
//        Location location = intent.getParcelableExtra(Geolocalizacao);

    }
}

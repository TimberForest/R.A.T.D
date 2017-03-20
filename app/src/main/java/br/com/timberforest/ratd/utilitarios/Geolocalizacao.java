package br.com.timberforest.ratd.utilitarios;

import android.content.Intent;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.text.DateFormat;
import java.util.Date;

import br.com.timberforest.ratd.R;

public class Geolocalizacao extends AppCompatActivity implements GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener,
        LocationListener {

    private TextView tv_coordinate;
    private GoogleApiClient mGoogleApiClient;
    private LocationRequest mLocationRequest;
    private Location mLastLocation;

    private EditText edt_Adress;
    private TextView tvAdressLocation;
    private Button btn_nome_coordenada;
    private Button btn_coordenada_nome;

    public static final String LOCATION = "location";
    public static final String TYPE = "type";
    public static final String ADDRESS = "address";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geolocalizacao);
        Log.i("LOG", "onCreate()");

        tv_coordinate = (TextView) findViewById(R.id.tv_coordinate);

        callConnection();
    }


    @Override
    public void onResume() {
        super.onResume();

        if (mGoogleApiClient != null && mGoogleApiClient.isConnected()) {
            startLocationUpdate();
        }
    }


    @Override
    public void onPause() {
        super.onPause();

        if (mGoogleApiClient != null) {
            stopLocationUpdate();
        }
    }

    public void callIntentService(int type, String address){
        Intent it = new Intent(this, LocationIntentService.class);
        it.putExtra(TYPE, type);
        it.putExtra(ADDRESS, address);
        it.putExtra(LOCATION, mLastLocation);
        startService(it);

    }


    private synchronized void callConnection() {
        Log.i("LOG", "callConnection()");
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addOnConnectionFailedListener(this)
                .addConnectionCallbacks(this)
                .addApi(LocationServices.API)
                .build();
        mGoogleApiClient.connect();
    }


    private void initLocationRequest() {
        mLocationRequest = new LocationRequest();
        mLocationRequest.setInterval(5000);
        mLocationRequest.setFastestInterval(2000);
        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
    }


    private void startLocationUpdate() {
        initLocationRequest();
        LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, Geolocalizacao.this);
    }


    private void stopLocationUpdate() {
        LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, Geolocalizacao.this);
    }


    // LISTENER
    @Override
    public void onConnected(Bundle bundle) {
        Log.i("LOG", "onConnected(" + bundle + ")");

        Location l = LocationServices
                .FusedLocationApi
                .getLastLocation(mGoogleApiClient);

        if (l != null) {
            Log.i("LOG", "latitude: " + l.getLatitude());
            Log.i("LOG", "longitude: " + l.getLongitude());
            tv_coordinate.setText(l.getLatitude() + " | " + l.getLongitude());
        }

        startLocationUpdate();
    }

    @Override
    public void onConnectionSuspended(int i) {
        Log.i("LOG", "onConnectionSuspended(" + i + ")");
    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {
        Log.i("LOG", "onConnectionFailed(" + connectionResult + ")");
    }

    @Override
    public void onLocationChanged(Location location) {
        Log.i("LOG", "latitude: " + location.getLatitude());
        Log.i("LOG", "longitude: " + location.getLongitude());
        tv_coordinate.setText(Html.fromHtml("Location: " + location.getLatitude() + "<br />" +
                "Longitude: " + location.getLongitude() + "<br />" +
                "Bearing: " + location.getBearing() + "<br />" +
                "Altitude: " + location.getAltitude() + "<br />" +
                "Speed: " + location.getSpeed() + "<br />" +
                "Provider: " + location.getProvider() + "<br />" +
                "Accuracy: " + location.getAccuracy() + "<br />" +
                "Horario: " + DateFormat.getTimeInstance().format(new Date()) + "<br />"));
    }
}

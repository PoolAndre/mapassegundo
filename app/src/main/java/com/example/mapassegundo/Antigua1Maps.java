package com.example.mapassegundo;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.mapassegundo.databinding.ActivityMaps1Binding;

public class Antigua1Maps extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {


    private GoogleMap mMap;
    private Marker markerPrueba; //variable de tipo marker
    private ActivityMaps1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMaps1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        // agregar un icono al marcador
        LatLng piedra = new LatLng(29.979275377069, 31.134197301311);
        mMap.addMarker(new MarkerOptions().position(piedra).title("Gran Pirámide de Guiza").snippet("Con una altura de 138 m (originalmente era de 146 m), fue la construcción más alta de la tierra durante 3.800 años.  ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.piramide)));

        //mostrar toast con el marcador
        LatLng totus = new LatLng(29.979275377069, 31.134197301311);
        mMap.addMarker(new MarkerOptions().position(totus).draggable(true).title("Gran Pirámide de Guiza").snippet(" Con una altura de 138 m (originalmente era de 146 m), fue la construcción más alta de la tierra durante 3.800 años. ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.piramide)));
        //zoom al amrcador
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(totus,15));

        googleMap.setOnMarkerClickListener(this);

    }
    //mostrar un toas en un marcador
    @Override
    public boolean onMarkerClick(@NonNull Marker marker) {
        //obtener la latitud y longitud de una ubicacion
        String lat, lg;
        lat = Double.toString(marker.getPosition().latitude);
        lg = Double.toString(marker.getPosition().longitude);

        Toast.makeText(this,  "Coordenadas", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, lat + " , " + lg, Toast.LENGTH_SHORT).show();
        return false;

    }
}

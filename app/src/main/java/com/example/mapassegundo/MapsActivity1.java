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

public class MapsActivity1 extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {


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

        LatLng saqsa = new LatLng(-13.509681, -71.981855);
        mMap.addMarker(new MarkerOptions().position(saqsa).title("Sqsaywaman").snippet("Fortaleza de Saqsaywaman Cuscp Perú"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(saqsa));

        // agregar un icono al marcador
        LatLng piedra = new LatLng(-13.516013, -71.976312);
        mMap.addMarker(new MarkerOptions().position(piedra).title("Piedra de los 12 angulos").snippet("Hoy dia somos peru o si no me suicido")
        .icon(BitmapDescriptorFactory.fromResource(R.drawable.map5)));

        //cambiarle de color al marcador
        LatLng plaza = new LatLng(-13.516764, -71.978799);
        mMap.addMarker(new MarkerOptions().position(plaza).title("Plaza de armas cusco").snippet("Gasdasdasasd")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        //Arrastrar el maracdor
        LatLng uac = new LatLng(-13.537138, -71.904065);
        mMap.addMarker(new MarkerOptions().position(uac).draggable(true).title("UAC").snippet("Gasasdasdasdasdasdasdasasd")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));

        //mostrar toast con el marcador
        LatLng totus = new LatLng(-13.529917, -71.932594);
        mMap.addMarker(new MarkerOptions().position(totus).draggable(true).title("totus ga").snippet("mijail xolo")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        //zoom al amrcador
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(totus,18));

        googleMap.setOnMarkerClickListener(this);

    }
    //mostrar un toas en un marcador
    @Override
    public boolean onMarkerClick(@NonNull Marker marker) {
        //obtener la latitud y longitud de una ubicacion
        String lat, lg;
        lat = Double.toString(marker.getPosition().latitude);
        lg = Double.toString(marker.getPosition().longitude);

        Toast.makeText(this, lat + "," + lg, Toast.LENGTH_SHORT).show();
        return false;

    }
}

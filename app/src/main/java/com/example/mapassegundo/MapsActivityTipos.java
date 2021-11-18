package com.example.mapassegundo;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.mapassegundo.databinding.ActivityMapsTiposBinding;

public class MapsActivityTipos extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsTiposBinding binding;
    private Button btn_hibrido,btn_normal,btn_satelital,btn_terreno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_tipos);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        btn_hibrido = (Button)findViewById(R.id.btnhibrido);
        btn_normal = (Button)findViewById(R.id.btnNormal);
        btn_satelital = (Button)findViewById(R.id.btnsatelital);
        btn_terreno = (Button)findViewById(R.id.btnterreno);
    }
    public void cambiarHibrido (View view){
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
    }
    public void cambiarNormal (View view){
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }
    public void cambiarSatelital (View view){
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
    }
    public void cambiarTerreno(View view){
        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
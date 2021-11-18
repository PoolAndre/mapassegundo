package com.example.mapassegundo;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.mapassegundo.databinding.ActivityRestaurantesMapsBinding;

public class RestaurantesMaps extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;
    private Marker marker1,marker2,marker3,marker4,marker5,marker6,marker7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        UiSettings uiSettings=mMap.getUiSettings();
        uiSettings.setZoomControlsEnabled(true);

        LatLng piramidedegiza = new LatLng(-13.52082, -71.97385);
        LatLng Mausoleo = new LatLng(	-13.51647 , -71.97695);
        LatLng Jardines = new LatLng(	-13.52557, 71.97316);
        LatLng Templo  = new LatLng(	-13.51714, -71.97605);
        LatLng Estatua  = new LatLng(	-13.518203, 	-71.97562);
        LatLng Coloso  = new LatLng(	-13.51484, 	-71.98116);
        LatLng Faro  = new LatLng(		-13.52111, 	-71.97870);



        mMap.moveCamera(CameraUpdateFactory.newLatLng(piramidedegiza));



        marker1 = googleMap.addMarker(new MarkerOptions().position(piramidedegiza).title("Parada 168").snippet("Calle Inticahuarina 168 A una cuadra de Limacpampa, subida hacia Awaqpinta, Cuzco 08002 Perú").icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurante1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(piramidedegiza));
        marker2 = googleMap.addMarker(new MarkerOptions().position(Mausoleo).title("Nuna Raymi").snippet("Calle Triunfo 356 A media cuadra de la Plaza de Armas, en el 2do piso, Cuzco Perú ").icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurante2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Mausoleo));
        marker3=googleMap.addMarker(new MarkerOptions().position(Jardines).title("Yuraq Restaurant").snippet("Avenida Pardo 1036, Cuzco 084 Perú").icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurante3)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Jardines));
        marker4=googleMap.addMarker(new MarkerOptions().position(Templo).title("Manka").snippet("Calle San Agustín 224 Costado del Hotel Marriot, Cuzco 051 Perú").icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurante4)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Templo));
        marker5=googleMap.addMarker(new MarkerOptions().position(Estatua).title("La Pizza Carlo").snippet("Calle 381 Maruri, Cuzco Perú").icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurante1)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Estatua));
        marker6=googleMap.addMarker(new MarkerOptions().position(Coloso).title("Luigi’s Pizza").snippet("Calle Saphi 476 A una cuadra y media de la Plaza de Armas, Cuzco 08002 Perú").icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurante2)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Coloso));
        marker7=googleMap.addMarker(new MarkerOptions().position(Faro).title("Calle Ayacucho 235 cercado A un costado del Hotel Tambo., Cuzco 08002 Perú").icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurante3)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Faro));
        mMap.getUiSettings().setZoomControlsEnabled(true);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(piramidedegiza,18));

        googleMap.setOnMarkerClickListener(this);
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        if(marker.equals(marker1)){
            String lat,Lng;
            lat = Double.toString(marker.getPosition().latitude);
            Lng = Double.toString(marker.getPosition().longitude);

            Toast.makeText(this,"La latitud es: "+lat+" "+" La Longitud es:"+Lng,Toast.LENGTH_LONG).show();
        }
        if(marker.equals(marker2)){
            String lat,Lng;
            lat = Double.toString(marker.getPosition().latitude);
            Lng = Double.toString(marker.getPosition().longitude);

            Toast.makeText(this,"La latitud es: "+lat+" "+" La Longitud es:"+Lng,Toast.LENGTH_LONG).show();
        }
        if(marker.equals(marker3)){
            String lat,Lng;
            lat = Double.toString(marker.getPosition().latitude);
            Lng = Double.toString(marker.getPosition().longitude);

            Toast.makeText(this,"La latitud es: "+lat+" "+" La Longitud es:"+Lng,Toast.LENGTH_LONG).show();
        }
        if(marker.equals(marker4)){
            String lat,Lng;
            lat = Double.toString(marker.getPosition().latitude);
            Lng = Double.toString(marker.getPosition().longitude);

            Toast.makeText(this,"La latitud es: "+lat+" "+" La Longitud es:"+Lng,Toast.LENGTH_LONG).show();
        }
        if(marker.equals(marker5)){
            String lat,Lng;
            lat = Double.toString(marker.getPosition().latitude);
            Lng = Double.toString(marker.getPosition().longitude);

            Toast.makeText(this,"La latitud es: "+lat+" "+" La Longitud es:"+Lng,Toast.LENGTH_LONG).show();
        }
        if(marker.equals(marker6)){
            String lat,Lng;
            lat = Double.toString(marker.getPosition().latitude);
            Lng = Double.toString(marker.getPosition().longitude);

            Toast.makeText(this,"La latitud es: "+lat+" "+" La Longitud es:"+Lng,Toast.LENGTH_LONG).show();
        }
        if(marker.equals(marker7)){
            String lat,Lng;
            lat = Double.toString(marker.getPosition().latitude);
            Lng = Double.toString(marker.getPosition().longitude);

            Toast.makeText(this,"La latitud es: "+lat+" "+" La Longitud es:"+Lng,Toast.LENGTH_LONG).show();
        }





        return false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
package com.example.mapassegundo;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.mapassegundo.databinding.ActivityMaps1Binding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.mapassegundo.databinding.ActivityAgenciasMapsBinding;

public class AgenciasMaps extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;
    private ActivityAgenciasMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAgenciasMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);



        //mostrar toast con el marcador
        LatLng primero = new LatLng(-13.51573194591835,  -71.980497712246);
        mMap.addMarker(new MarkerOptions().position(primero).draggable(true).title("Bio Manu Expeditions").snippet(" Este tour es aut??ntico, la mejor opci??n donde se pueden realizar muchas actividades, como explorar la selva tropical, caminatas nocturnas, tubing tambi??n visitaremos la collpa de loros. y descansar en nuestra casa del ??rbol. ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mochila1)));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(primero,15));
        //zoom al amrcador

        //mostrar toast con el marcador
        LatLng segundo = new LatLng(-13.51588446299207, -71.97909286887769);
        mMap.addMarker(new MarkerOptions().position(segundo).draggable(true).title("Amazon Peru Travellers").snippet(" Somos una empresa con la conservaci??n en mente, conscientes de los cambios que se han producido en nuestro planeta, vemos el ecoturismo como un medio de preservar la naturaleza al proporcionar desarrollo sostenible para las comunidades que viven en los h??bitats naturales ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mochila2)));
        //zoom al amrcador

        //mostrar toast con el marcador
        LatLng tercero = new LatLng(-13.516403513795048, -71.98262125605252);
        mMap.addMarker(new MarkerOptions().position(tercero).draggable(true).title("Manu Wildlife Peru").snippet("Manu Wildlife Peru takes you on a journey deep into the jungle of Manu National Park. Our family-run lodges are located in our own nature reserve far away from the rest of the tourist lodges.  ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mochila3)));
        //zoom al amrcador

        //mostrar toast con el marcador
        LatLng cuarto = new LatLng(-12.070674152675066, -77.04264577459335);
        mMap.addMarker(new MarkerOptions().position(cuarto).draggable(true).title("Viajes en Cusco").snippet(" Venimos trabajando m??s de 20 a??os en el campo del Turismo, como especialistas en Turismo Receptivo Nacional e Internacional, tambi??n ofrecemos: aventura, Camino Inca Canotaje, excursiones tradicionales en Cusco ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mochila4)));
        //zoom al amrcador

        //mostrar toast con el marcador
        LatLng quinto = new LatLng(-13.52352723261035, -71.95232247259582);
        mMap.addMarker(new MarkerOptions().position(quinto).draggable(true).title("Wanpu Travel").snippet("  Venimos trabajando m??s de 20 a??os en el campo del Turismo, como especialistas en Turismo Receptivo Nacional e Internacional, tambi??n ofrecemos: aventura, Camino Inca Canotaje, excursiones tradicionales en Cusco")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mochila5)));
        //zoom al amrcador

        //mostrar toast con el marcador
        LatLng sexto = new LatLng(-13.515419196468857, -71.98406625497783);
        mMap.addMarker(new MarkerOptions().position(sexto).draggable(true).title("Machu Picchu Peru World").snippet(" En cualquier viaje, la calidad de su viaje se ve enormemente afectada por su gu??a, tenemos gu??as tur??sticos de primera categor??a que siempre superan las expectativas para brindarle una experiencia excepcional. Todos nuestros gu??as tur??sticos son locales y su experiencia ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mochila1)));
        //zoom al amrcador
        //mostrar toast con el marcador
        LatLng septimo = new LatLng(-13.516047757263573, -71.97988233419203);
        mMap.addMarker(new MarkerOptions().position(septimo).draggable(true).title("Amazon Trips Peru").snippet(" Amazon Trips Peru es una empresa familiar y le da la bienvenida a una experiencia ??nica en la selva tropical del Manu.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mochila2)));
        //zoom al amrcador

        //mostrar toast con el marcador
        LatLng octavo = new LatLng(-13.518607802941386, -71.9783850854721);
        mMap.addMarker(new MarkerOptions().position(octavo).draggable(true).title("Per?? Tierras M??gicas").snippet("Per?? Tierras M??gicas Travel, pone a su disposici??n la informaci??n que requiere de los grandes atractivos Inkaicos, as?? como diversos Programas Tur??sticos que recorren toda nuestras tierras m??gicas del Per??. ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mochila3)));
        //zoom al amrcador


        //mostrar toast con el marcador
        LatLng noveno = new LatLng(-13.515719818054915, -71.9792347591254);
        mMap.addMarker(new MarkerOptions().position(noveno).draggable(true).title("Machupicchu Ecotravel").snippet("Somos una empresa con la conservaci??n en mente, el contacto directo con la naturaleza inspira amor por la conservaci??n. Con suerte, la gente volver?? a casa con este sentimiento y lo compartir?? con amigos y familiares.  ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mochila4)));
        //zoom al amrcador


        //mostrar toast con el marcador
        LatLng decimo = new LatLng(-13.51657808921557, -71.97972984670864);
        mMap.addMarker(new MarkerOptions().position(decimo).draggable(true).title("Per?? Nature Travel").snippet(" Agencia Operadora de Viajes le brindar?? un servicio de calidad para que su estancia en nuestra ciudad sea lo mas placentera, contamos con una infraestructura que le permitir?? realizar todo tipo de viajes a cualquier destino ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mochila5)));
        //zoom al amrcador

        googleMap.setOnMarkerClickListener(this);




    }

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

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
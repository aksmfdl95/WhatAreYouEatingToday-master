package com.hnsky.whatareyoueatingtoday;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.AttributeSet;

import com.nhn.android.maps.NMapView;
import com.nhn.android.maps.overlay.NMapPOIdata;
import com.nhn.android.mapviewer.overlay.NMapOverlayManager;
import com.nhn.android.mapviewer.overlay.NMapPOIdataOverlay;

import static android.content.Context.LOCATION_SERVICE;

public class NaverMapView extends NMapView {



    public NaverMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        NMapViewerResourceProvider nMapViewerResourceProvider= new NMapViewerResourceProvider(context);
        NMapOverlayManager overlayManager = new NMapOverlayManager(context,this,nMapViewerResourceProvider);
        final int markid= NMapPOIflagType.PIN;
        final NMapPOIdata poIdata= new NMapPOIdata(1,nMapViewerResourceProvider);
        poIdata.addPOIitem(126.72616215624005,37.542475511718635,"test",markid,1,1);


        poIdata.endPOIdata();
        NMapPOIdataOverlay poIdataOverlay= overlayManager.createPOIdataOverlay(poIdata,null);
        poIdataOverlay.selectPOIitemBy(1,true);

        LocationListener locationListener= new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                poIdata.addPOIitem(location.getLatitude(),location.getLongitude(),"test",markid,1,1);
            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            @Override
            public void onProviderEnabled(String provider) {

            }

            @Override
            public void onProviderDisabled(String provider) {

            }
        };
    }



}

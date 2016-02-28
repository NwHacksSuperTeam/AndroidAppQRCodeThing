package com.nwhacks.superteam.hfcetest;

import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;

/**
 * Created by em on 2/27/16.
 */
public class MyHostApduService extends HostApduService {
    @Override
    public byte[] processCommandApdu(byte[] apdu, Bundle extras) {
        return null;
    }
    @Override
    public void onDeactivated(int reason) {

    }

}


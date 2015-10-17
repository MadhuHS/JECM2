package com.jsp.profile_changer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;

public class Profile_Manager extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) 
	{
		
		//Log.d("[DEBUG]",intent.getAction());
		String regNumber = "9999912345";
		String regCode = "*123#";
		String inNumber;
		String inCode;
		SmsMessage[] msg;
		
		
		Bundle bundle = intent.getExtras();
		
		if(bundle!=null)
		{
		 Object[] pdu = (Object[]) bundle.get("pdus");
		 msg = new SmsMessage[pdu.length];
		 
		 for(int i = 0; i<msg.length;i++)
		 {
			 msg[i] = SmsMessage.createFromPdu((byte[]) pdu[i]);
			 
			  inNumber =msg[i].getDisplayOriginatingAddress();
			  inCode =msg[i].getDisplayMessageBody();
			  
			  if(inNumber.equals(regNumber)&& inCode.equals(regCode))
			  {
				AudioManager am =  (AudioManager) context.getSystemService(context.AUDIO_SERVICE);
			    am.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
			  }
		 }
		 
		}

	}

}

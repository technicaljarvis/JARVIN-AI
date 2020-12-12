xml code
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
	xmlns:android="https://schemas.android.com/apk/res/android"
	xmlns:app="https://schemas.android.com/apk/res-auto"
	xmlns:tools="https://schemas.android.com/tools"
	android:layout_width="match_parent"
	android:layout_height="match_parent"
	android:gravity+"center"
	tools:context=".Mainactivity">

<ImageButton
	android:layout_width="120dp"
	android:layout_height="120dp"
	android:id="@+id/switch_off"
	android:src="@drawable/ic_power"
	android:background="@drawable/gray_round"/>

<ImageButton
	android:layout_width="120dp"
	android:layout_height="120dp"
	android:id="@+id/switch_on"
	android:visibility="gone"
	android:elevation="10dp"
	android:src="@drawable/ic_power"
	android:background="@drawable/green_round"/>


gray_round.xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="https://schemas.android.com/apk/res/android"
	adroid:shape="rectangle">

	<solid android:color="@android:color/darker_gray"/>
	<corners android:radius="100dp"/>
</shape>

<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="https://schemas.android.com/apk/res/android"
	adroid:shape="rectangle">

	<solid android:color="@android:color/holo_green_light"/>
	<corners android:radius="100dp"/>
</shape>

java coding

import ...

public class Mainactivity extends AppComatActivity {
	ImageButton switchOff,switchOn;
	Camera camera;

	@override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		switchOff = findViewById(R.id.switch_off);
		switchOn = findViewById(R.id.switch_on);
	}
}

	
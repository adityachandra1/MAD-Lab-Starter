package com.example.android_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.ListFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load the ListFragment into the container
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        VersionListFragment versionListFragment = new VersionListFragment();
        fragmentTransaction.replace(R.id.container, versionListFragment);
        fragmentTransaction.commit();
    }
}

public class VersionListFragment extends ListFragment {

    private static final String[] VERSIONS = {
            "Android 1.0", "Android 1.1", "Android 1.5 Cupcake", "Android 1.6 Donut",
            "Android 2.0 Eclair", "Android 2.2 Froyo", "Android 2.3 Gingerbread",
            "Android 3.0 Honeycomb", "Android 4.0 Ice Cream Sandwich", "Android 4.1 Jelly Bean",
            "Android 4.4 KitKat", "Android 5.0 Lollipop", "Android 6.0 Marshmallow",
            "Android 7.0 Nougat", "Android 8.0 Oreo", "Android 9.0 Pie", "Android 10",
            "Android 11", "Android 12"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create an ArrayAdapter to hold the Android version names
        ArrayAdapter<String> versionAdapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_activated_1, android.R.id.text1, VERSIONS);
        setListAdapter(versionAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the fragment's view and return it
        return inflater.inflate(android.R.layout.list_content, container, false);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = super.getView(position, convertView, parent);

        // Get the version name and icon for the current position
        String versionName = VERSIONS[position];
        int versionIconResId = getResources().getIdentifier("android" + (position + 1), "drawable", getActivity().getPackageName());

        // Set the version name and icon in the row view
        TextView textView = row.findViewById(android.R.id.text1);
        textView.setText(versionName);
        textView.setCompoundDrawablesWithIntrinsicBounds(versionIconResId, 0, 0, 0);

        return row;
    }
}




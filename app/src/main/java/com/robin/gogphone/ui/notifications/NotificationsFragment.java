package com.robin.gogphone.ui.notifications;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.robin.gogphone.R;
import com.robin.gogphone.databinding.FragmentNotificationsBinding;
import com.robin.gogphone.ui.sync.SyncFragment;


public class NotificationsFragment extends Fragment {

    private FragmentNotificationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the fragment's layout
        View view = inflater.inflate(R.layout.fragment_notifications, container, false);
        Log.d("Test", "Dit is het notifications fragment.");
        // Find the button within the inflated view
        Button button = view.findViewById(R.id.buttonSync);

        // Set the click listener for the button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Test", "Persoon heeft op knop gedrukt.");

                Fragment fragment = new SyncFragment();
                FragmentManager fragmentManager = requireFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, fragment)
                        .commit();
            }
        });

        return view;

    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
package co.davo.nashvilletourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Hattie B's", "Hot Chicken", "101 Broad St\nNashville, TN 37201", R.drawable.hattiebs));
        locations.add(new Location("Demos'", "Steak and Spaghetti", "101 Broad St\nNashville, TN 37201", R.drawable.demos));
        locations.add(new Location("Grilled Cheeserie", "Hot Chicken", "101 Broad St\nNashville, TN 37201", R.drawable.grilledcheeserie));
        locations.add(new Location("Loveless Cafe", "Hot Biscuits", "101 Broad St\nNashville, TN 37201", R.drawable.loveless));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}

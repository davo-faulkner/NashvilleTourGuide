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
        locations.add(new Location(R.string.hattie_bs_name, R.string.hattie_bs_description, R.string.hattie_bs_address, R.drawable.hattiebs));
        locations.add(new Location(R.string.demos_name, R.string.demos_description, R.string.demos_address, R.drawable.demos));
        locations.add(new Location(R.string.grilled_cheeserie_name, R.string.grilled_cheeserie_description, R.string.grilled_cheeserie_address, R.drawable.grilledcheeserie));
        locations.add(new Location(R.string.loveless_name, R.string.loveless_description, R.string.loveless_address, R.drawable.loveless));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
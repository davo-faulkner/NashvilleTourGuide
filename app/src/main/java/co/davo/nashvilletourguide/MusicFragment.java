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
public class MusicFragment extends Fragment {

    public MusicFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.opry_name, R.string.opry_description, R.string.opry_address, R.drawable.opry));
        locations.add(new Location(R.string.ryman_name, R.string.ryman_description, R.string.ryman_address, R.drawable.ryman));
        locations.add(new Location(R.string.wildhorse_name, R.string.wildhorse_description, R.string.wildhorse_address, R.drawable.wildhorse));
        locations.add(new Location(R.string.tootsies_name, R.string.tootsies_description, R.string.tootsies_address, R.drawable.tootsies));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
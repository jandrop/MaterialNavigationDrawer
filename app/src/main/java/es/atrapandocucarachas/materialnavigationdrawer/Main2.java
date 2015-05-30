package es.atrapandocucarachas.materialnavigationdrawer;

import android.os.Bundle;
import android.view.MenuItem;

/**
 * @author Alejandro Platas Mallo
 * @version X.XX
 * @since 30/5/15
 */

public class Main2 extends BaseDrawer {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_main;
    }

    @Override
    protected int getDrawerLayoutResource() {
        return R.id.drawer_layout;
    }

    @Override
    protected void menuItem(MenuItem menuItem) {
        menuItem.setChecked(true);
        getDrawerLayout().closeDrawers();

    }
}

package org.autojs.autojs.ui.floating;

import android.view.View;

import com.stardust.enhancedfloaty.FloatyService;
import com.stardust.floatingcircularactionmenu.CircularActionMenu;

public interface CircularMenuFloaty {

    View inflateActionView(FloatyService service, CircularMenuWindow window);

    CircularActionMenu inflateMenuItems(FloatyService service, CircularMenuWindow window);
}
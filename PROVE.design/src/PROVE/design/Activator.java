package PROVE.design;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {
    // The plug-in ID
    public static final String PLUGIN_ID = "PROVE.design";

    // The shared instance
    private static Activator plugin;

    private static Set<Viewpoint> viewpoints; 
    
    public static String VIEWPOINT_NAME = "PROVEviewpointMk2";

    /**
     * The constructor
     */
    public Activator() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
      super.start(context);
	  plugin = this;
	  viewpoints = new HashSet<Viewpoint>();
	  viewpoints.addAll(ViewpointRegistry.getInstance().registerFromPlugin(PLUGIN_ID + "/description/PROVE.odesign"));
	  //Open Modeling Perspective
	  IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	  PlatformUI.getWorkbench().showPerspective("org.eclipse.sirius.ui.tools.perspective.modeling",window);
	  //Open default diagram - PROVE MK2 - FUTURE IMPLEMENTATION PLACEHOLDER
	  	//DialectUIManager.INSTANCE.openEditor(SessionManager.INSTANCE.getExistingSession(null), null, null);	  
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
	plugin = null;
	if (viewpoints != null) {
	    for (final Viewpoint viewpoint: viewpoints) {
		ViewpointRegistry.getInstance().disposeFromPlugin(viewpoint);
	    }
	    viewpoints.clear();
	    viewpoints = null; 
	}
	super.stop(context);
    }

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static Activator getDefault() {
	return plugin;
    }

    public static void logError(String message, Throwable e) {
		if (plugin != null) {
			//plugin.doLogError(message, e); //removed by Avi due to compilation error - TEMPORARY
		} else {
			System.err.println(message);
			e.printStackTrace();
		}
	}

}

package dsm.PROVE;

public class SemanticUtil {
	//private static final String DEFAULT_ROOT_CMP_NAME = "Project";
	
	public static Process createInitialModel(String rootObjectName) {
		Process masterprocess = PROVEFactory.eINSTANCE.createProcess();
		masterprocess.setName(rootObjectName);
		//masterprocess.setId(UUID.randomUUID().toString());

		return masterprocess;
	}
	
	public static String incrementLastNumber(String version) {
	    int lastIndexOfPoint = version.lastIndexOf('.');
	    if (lastIndexOfPoint != -1) {
	        // There is a point, increment the number after the last point
	        String prefix = version.substring(0, lastIndexOfPoint + 1);
	        int lastNumber = Integer.parseInt(version.substring(lastIndexOfPoint + 1));
	        return prefix + (++lastNumber);
	    } else {
	        // No point, increment the number itself
	        int number = Integer.parseInt(version);
	        return String.valueOf(++number);
	    }
	}
}

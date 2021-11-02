package dsm.PROVE;

public class SemanticUtil {
	//private static final String DEFAULT_ROOT_CMP_NAME = "Project";
	
	public static Process createInitialModel(String rootObjectName) {
		Process masterprocess = PROVEFactory.eINSTANCE.createProcess();
		masterprocess.setName(rootObjectName);
		//masterprocess.setId(UUID.randomUUID().toString());

		return masterprocess;
		}
}

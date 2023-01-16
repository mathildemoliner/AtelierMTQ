
import org.matsim.api.core.v01.Scenario;
import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.controler.Controler;
import org.matsim.core.scenario.ScenarioUtils;

public final class RunSimpleExample{

	public static void main ( String [] args ) {

		Config config = ConfigUtils.loadConfig( args );

		Scenario scenario = ScenarioUtils.loadScenario( config );

		Controler controler = new Controler( scenario );

		controler.run() ;

	}

}

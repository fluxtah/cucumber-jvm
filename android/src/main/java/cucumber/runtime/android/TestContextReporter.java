package cucumber.runtime.android;

import cucumber.api.android.CucumberInstrumentation;
import gherkin.formatter.model.Feature;
import gherkin.formatter.model.Scenario;

public class TestContextReporter extends NoOpFormattingReporter {

	private CucumberInstrumentation cucumberInstrumentation;

	public TestContextReporter(CucumberInstrumentation cucumberInstrumentation) {
		this.cucumberInstrumentation = cucumberInstrumentation;
	}

	@Override
	public void feature(Feature feature) {
		cucumberInstrumentation.setCurrentFeature(feature);		
	}
	
	@Override
	public void startOfScenarioLifeCycle(Scenario scenario) {
		cucumberInstrumentation.setCurrentScenario(scenario);
	}
}

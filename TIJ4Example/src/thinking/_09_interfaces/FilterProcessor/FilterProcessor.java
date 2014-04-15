package thinking._09_interfaces.FilterProcessor;

import thinking._09_interfaces.Filters.BandPass;
import thinking._09_interfaces.Filters.Filter;
import thinking._09_interfaces.Filters.HighPass;
import thinking._09_interfaces.Filters.LowPass;
import thinking._09_interfaces.Filters.Waveform;
import thinking._09_interfaces.InterfaceProcessor.Apply;
import thinking._09_interfaces.InterfaceProcessor.Processor;

//: interfaces/interfaceprocessor/FilterProcessor.java

class FilterAdapter implements Processor {
	Filter filter;

	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}

	public String name() {
		return filter.name();
	}

	public Waveform process(Object input) {
		return filter.process((Waveform) input);
	}
}

public class FilterProcessor {
	public FilterProcessor() {
		Waveform w = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
	}
}/* Output
Using Processor LowPass
Waveform 0
Using Processor HighPass
Waveform 0
Using Processor BandPass
Waveform 0
*///:~

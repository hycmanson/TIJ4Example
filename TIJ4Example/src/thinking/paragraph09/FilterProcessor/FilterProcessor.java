package thinking.paragraph09.FilterProcessor;

import thinking.paragraph09.Filters.BandPass;
import thinking.paragraph09.Filters.Filter;
import thinking.paragraph09.Filters.HighPass;
import thinking.paragraph09.Filters.LowPass;
import thinking.paragraph09.Filters.Waveform;
import thinking.paragraph09.InterfaceProcessor.Apply;
import thinking.paragraph09.InterfaceProcessor.Processor;

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

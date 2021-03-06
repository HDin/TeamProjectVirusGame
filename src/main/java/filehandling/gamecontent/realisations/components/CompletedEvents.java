package main.java.filehandling.gamecontent.realisations.components;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import main.java.filehandling.gamecontent.XMLSerializable;

public class CompletedEvents implements XMLSerializable {

	private final List<CompletedEvent> completedEventsValues = new ArrayList<>();
	
	private static final String SERIALIZED_FORMAT = "<CompletedEvents>%s</CompletedEvents>";
	
	public CompletedEvents(Node completedEventsNode) {
		NodeList childNodes = completedEventsNode.getChildNodes();
		
		for (int i = 0; i < childNodes.getLength(); i++) {
			completedEventsValues.add(new CompletedEvent(childNodes.item(i)));
		}
	}

	/**
	 * @return
	 */
	public List<CompletedEvent> getCompletedEvents() {
		return completedEventsValues;
	}
	
	@Override
	public byte[] serialize() {
		return toXMLString().getBytes();
	}
	
	@Override
	public String toXMLString() {
		
		StringBuilder completedEventsStringBuilder = new StringBuilder();
		for (CompletedEvent completedEvent : completedEventsValues) {
			completedEventsStringBuilder.append(completedEvent.toXMLString());
		}
		
		return String.format(SERIALIZED_FORMAT, completedEventsStringBuilder.toString());
	}

}

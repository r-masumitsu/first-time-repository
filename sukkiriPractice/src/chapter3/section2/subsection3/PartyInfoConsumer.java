package chapter3.section2.subsection3;

import java.util.Set;

import chapter1.section2.Hero;

@FunctionalInterface
public interface PartyInfoConsumer {
	public abstract void process(Set<Hero> party, Hero leader, String pName);
}

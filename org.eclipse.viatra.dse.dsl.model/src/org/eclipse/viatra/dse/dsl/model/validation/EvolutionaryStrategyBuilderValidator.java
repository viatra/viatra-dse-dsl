/**
 *
 * $Id$
 */
package org.eclipse.viatra.dse.dsl.model.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.viatra.dse.dsl.model.EvolutionStrategyType;
import org.eclipse.viatra.dse.dsl.model.IMutationRate;

/**
 * A sample validator interface for {@link org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EvolutionaryStrategyBuilderValidator {
	boolean validate();

	boolean validatePopulationSize(int value);
	boolean validateCrossOvers(EList<String> value);
	boolean validateType(EvolutionStrategyType value);
	boolean validateName(String value);
	boolean validateMutations(EList<IMutationRate> value);
}

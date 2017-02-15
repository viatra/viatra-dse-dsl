/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.viatra.dse.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.viatra.dse.dsl.model.BaseObjective;
import org.eclipse.viatra.dse.dsl.model.Configuration;
import org.eclipse.viatra.dse.dsl.model.Constraint;
import org.eclipse.viatra.dse.dsl.model.ConstraintsObjective;
import org.eclipse.viatra.dse.dsl.model.DomainModel;
import org.eclipse.viatra.dse.dsl.model.DseExecutionModel;
import org.eclipse.viatra.dse.dsl.model.DseImport;
import org.eclipse.viatra.dse.dsl.model.DseProblem;
import org.eclipse.viatra.dse.dsl.model.DseexecutionmodelPackage;
import org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder;
import org.eclipse.viatra.dse.dsl.model.IMutationRate;
import org.eclipse.viatra.dse.dsl.model.InitialModel;
import org.eclipse.viatra.dse.dsl.model.MetaModel;
import org.eclipse.viatra.dse.dsl.model.QueryConstraint;
import org.eclipse.viatra.dse.dsl.model.SolutionStore;
import org.eclipse.viatra.dse.dsl.model.StateCoder;
import org.eclipse.viatra.dse.dsl.model.Strategy;
import org.eclipse.viatra.dse.dsl.model.TransformationRule;
import org.eclipse.viatra.dse.dsl.model.Type;
import org.eclipse.viatra.dse.services.DdslGrammarAccess;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DdslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DdslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DseexecutionmodelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DseexecutionmodelPackage.BASE_OBJECTIVE:
				sequence_BaseObjective_Impl(context, (BaseObjective) semanticObject); 
				return; 
			case DseexecutionmodelPackage.CONFIGURATION:
				sequence_Configuration(context, (Configuration) semanticObject); 
				return; 
			case DseexecutionmodelPackage.CONSTRAINT:
				sequence_Constraint_Impl(context, (Constraint) semanticObject); 
				return; 
			case DseexecutionmodelPackage.CONSTRAINTS_OBJECTIVE:
				sequence_ConstraintsObjective(context, (ConstraintsObjective) semanticObject); 
				return; 
			case DseexecutionmodelPackage.DOMAIN_MODEL:
				sequence_DomainModel(context, (DomainModel) semanticObject); 
				return; 
			case DseexecutionmodelPackage.DSE_EXECUTION_MODEL:
				sequence_DseExecutionModel(context, (DseExecutionModel) semanticObject); 
				return; 
			case DseexecutionmodelPackage.DSE_IMPORT:
				sequence_DseImport_Impl(context, (DseImport) semanticObject); 
				return; 
			case DseexecutionmodelPackage.DSE_PROBLEM:
				sequence_DseProblem(context, (DseProblem) semanticObject); 
				return; 
			case DseexecutionmodelPackage.EVOLUTIONARY_STRATEGY_BUILDER:
				sequence_EvolutionaryStrategyBuilder(context, (EvolutionaryStrategyBuilder) semanticObject); 
				return; 
			case DseexecutionmodelPackage.IMUTATION_RATE:
				sequence_IMutationRate(context, (IMutationRate) semanticObject); 
				return; 
			case DseexecutionmodelPackage.INITIAL_MODEL:
				sequence_InitialModel(context, (InitialModel) semanticObject); 
				return; 
			case DseexecutionmodelPackage.META_MODEL:
				sequence_MetaModel(context, (MetaModel) semanticObject); 
				return; 
			case DseexecutionmodelPackage.QUERY_CONSTRAINT:
				sequence_QueryConstraint(context, (QueryConstraint) semanticObject); 
				return; 
			case DseexecutionmodelPackage.SOLUTION_STORE:
				sequence_SolutionStore(context, (SolutionStore) semanticObject); 
				return; 
			case DseexecutionmodelPackage.STATE_CODER:
				sequence_StateCoder(context, (StateCoder) semanticObject); 
				return; 
			case DseexecutionmodelPackage.STRATEGY:
				sequence_Strategy(context, (Strategy) semanticObject); 
				return; 
			case DseexecutionmodelPackage.TRANSFORMATION_RULE:
				sequence_TransformationRule(context, (TransformationRule) semanticObject); 
				return; 
			case DseexecutionmodelPackage.TYPE:
				sequence_Type_Impl(context, (Type) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     BaseObjective_Impl returns BaseObjective
	 *     Type returns BaseObjective
	 *     DseProblemComponent returns BaseObjective
	 *     BaseObjective returns BaseObjective
	 *
	 * Constraint:
	 *     (name=ID fitnessConstraint=EDouble? comparator=Comparators?)
	 */
	protected void sequence_BaseObjective_Impl(ISerializationContext context, BaseObjective semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Configuration returns Configuration
	 *     Type returns Configuration
	 *
	 * Constraint:
	 *     (name=ID maxNumberOfThreads=EInt? (dseproblems+=[DseProblem|EString] dseproblems+=[DseProblem|EString]*)? strategy=[BaseStrategy|EString]?)
	 */
	protected void sequence_Configuration(ISerializationContext context, Configuration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Constraint_Impl returns Constraint
	 *     Type returns Constraint
	 *     DseProblemComponent returns Constraint
	 *     Constraint returns Constraint
	 *
	 * Constraint:
	 *     constraintName=ID
	 */
	protected void sequence_Constraint_Impl(ISerializationContext context, Constraint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DseexecutionmodelPackage.Literals.CONSTRAINT__CONSTRAINT_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DseexecutionmodelPackage.Literals.CONSTRAINT__CONSTRAINT_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstraint_ImplAccess().getConstraintNameIDTerminalRuleCall_2_0(), semanticObject.getConstraintName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintsObjective returns ConstraintsObjective
	 *     Type returns ConstraintsObjective
	 *     DseProblemComponent returns ConstraintsObjective
	 *     BaseObjective returns ConstraintsObjective
	 *
	 * Constraint:
	 *     (name=ID fitnessConstraint=EDouble? hardConstraints+=QueryConstraint* softConstraints+=QueryConstraint* comparator=Comparators?)
	 */
	protected void sequence_ConstraintsObjective(ISerializationContext context, ConstraintsObjective semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DomainModel returns DomainModel
	 *
	 * Constraint:
	 *     type+=Type+
	 */
	protected void sequence_DomainModel(ISerializationContext context, DomainModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DseExecutionModel returns DseExecutionModel
	 *     Type returns DseExecutionModel
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         packageName=EString? 
	 *         (configurations+=[Configuration|EString] configurations+=[Configuration|EString]*)? 
	 *         dseproblems+=[DseProblem|ID]* 
	 *         numberOfRuns=EInt? 
	 *         (dseproblemcomponents+=[DseProblemComponent|EString] dseproblemcomponents+=[DseProblemComponent|EString]*)?
	 *     )
	 */
	protected void sequence_DseExecutionModel(ISerializationContext context, DseExecutionModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DseImport_Impl returns DseImport
	 *     Type returns DseImport
	 *
	 * Constraint:
	 *     imports+=EString*
	 */
	protected void sequence_DseImport_Impl(ISerializationContext context, DseImport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DseProblem returns DseProblem
	 *     Type returns DseProblem
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (imports+=EString imports+=EString*)? 
	 *         configurations=[Configuration|EString]? 
	 *         (constraints+=[Constraint|ID] constraints+=[Constraint|ID]*)? 
	 *         initialmodel=[InitialModel|ID]? 
	 *         metamodel=[MetaModel|EString]? 
	 *         objectives+=[BaseObjective|EString] 
	 *         objectives+=[BaseObjective|ID]* 
	 *         transformationrules+=[TransformationRule|ID] 
	 *         transformationrules+=[TransformationRule|ID]* 
	 *         statecoder=[StateCoder|ID]? 
	 *         solutionstore=[SolutionStore|ID]?
	 *     )
	 */
	protected void sequence_DseProblem(ISerializationContext context, DseProblem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BaseStrategy returns EvolutionaryStrategyBuilder
	 *     EvolutionaryStrategyBuilder returns EvolutionaryStrategyBuilder
	 *     Type returns EvolutionaryStrategyBuilder
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         populationSize=EInt? 
	 *         type=EvolutionStrategyType? 
	 *         (crossOvers+=EString crossOvers+=EString*)? 
	 *         (mutations+=[IMutationRate|ID] mutations+=[IMutationRate|ID]*)?
	 *     )
	 */
	protected void sequence_EvolutionaryStrategyBuilder(ISerializationContext context, EvolutionaryStrategyBuilder semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns IMutationRate
	 *     IMutationRate returns IMutationRate
	 *
	 * Constraint:
	 *     (name=ID weight=EInt?)
	 */
	protected void sequence_IMutationRate(ISerializationContext context, IMutationRate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InitialModel returns InitialModel
	 *     Type returns InitialModel
	 *     DseProblemComponent returns InitialModel
	 *
	 * Constraint:
	 *     (name=ID path=EString?)
	 */
	protected void sequence_InitialModel(ISerializationContext context, InitialModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MetaModel returns MetaModel
	 *     Type returns MetaModel
	 *     DseProblemComponent returns MetaModel
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_MetaModel(ISerializationContext context, MetaModel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DseexecutionmodelPackage.Literals.META_MODEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DseexecutionmodelPackage.Literals.META_MODEL__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMetaModelAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     QueryConstraint returns QueryConstraint
	 *     Type returns QueryConstraint
	 *     DseProblemComponent returns QueryConstraint
	 *     Constraint returns QueryConstraint
	 *
	 * Constraint:
	 *     (name=ID constraintName=EString? weight=EDouble? type=ModelQueryType?)
	 */
	protected void sequence_QueryConstraint(ISerializationContext context, QueryConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SolutionStore returns SolutionStore
	 *     Type returns SolutionStore
	 *     DseProblemComponent returns SolutionStore
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         foundSolutions=EInt? 
	 *         acceptAnySolutions?='acceptAnySolutions'? 
	 *         storeBestSolutionsOnly?='storeBestSolutionsOnly'? 
	 *         logSolutionsWhenFound?='logSolutionsWhenFound'? 
	 *         registerSolutionFoundHandler?='registerSolutionFoundHandler'?
	 *     )
	 */
	protected void sequence_SolutionStore(ISerializationContext context, SolutionStore semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateCoder returns StateCoder
	 *     Type returns StateCoder
	 *     DseProblemComponent returns StateCoder
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_StateCoder(ISerializationContext context, StateCoder semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DseexecutionmodelPackage.Literals.STATE_CODER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DseexecutionmodelPackage.Literals.STATE_CODER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStateCoderAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BaseStrategy returns Strategy
	 *     Strategy returns Strategy
	 *     Type returns Strategy
	 *
	 * Constraint:
	 *     (name=ID type=StrategyType depth=EInt?)
	 */
	protected void sequence_Strategy(ISerializationContext context, Strategy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TransformationRule returns TransformationRule
	 *     Type returns TransformationRule
	 *     DseProblemComponent returns TransformationRule
	 *
	 * Constraint:
	 *     (name=ID className=EString methodName=EString)
	 */
	protected void sequence_TransformationRule(ISerializationContext context, TransformationRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DseexecutionmodelPackage.Literals.TRANSFORMATION_RULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DseexecutionmodelPackage.Literals.TRANSFORMATION_RULE__NAME));
			if (transientValues.isValueTransient(semanticObject, DseexecutionmodelPackage.Literals.TRANSFORMATION_RULE__CLASS_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DseexecutionmodelPackage.Literals.TRANSFORMATION_RULE__CLASS_NAME));
			if (transientValues.isValueTransient(semanticObject, DseexecutionmodelPackage.Literals.TRANSFORMATION_RULE__METHOD_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DseexecutionmodelPackage.Literals.TRANSFORMATION_RULE__METHOD_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransformationRuleAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTransformationRuleAccess().getClassNameEStringParserRuleCall_4_0(), semanticObject.getClassName());
		feeder.accept(grammarAccess.getTransformationRuleAccess().getMethodNameEStringParserRuleCall_6_0(), semanticObject.getMethodName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Type
	 *     Type_Impl returns Type
	 *
	 * Constraint:
	 *     {Type}
	 */
	protected void sequence_Type_Impl(ISerializationContext context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
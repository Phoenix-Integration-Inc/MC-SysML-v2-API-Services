package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.Disjoining;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Expression;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.Step;
import org.omg.sysml.metamodel.Subclassification;
import org.omg.sysml.metamodel.TextualRepresentation;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PredicateImpl.class)
public abstract class PredicateImpl_ extends org.omg.sysml.lifecycle.impl.DataImpl_ {

	public static volatile SingularAttribute<PredicateImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<PredicateImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<PredicateImpl, Membership> membership;
	public static volatile ListAttribute<PredicateImpl, Feature> output;
	public static volatile ListAttribute<PredicateImpl, Feature> feature;
	public static volatile ListAttribute<PredicateImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<PredicateImpl, Feature> parameter;
	public static volatile ListAttribute<PredicateImpl, Element> member;
	public static volatile ListAttribute<PredicateImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<PredicateImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<PredicateImpl, Subclassification> ownedSubclassification;
	public static volatile ListAttribute<PredicateImpl, Feature> inheritedFeature;
	public static volatile SingularAttribute<PredicateImpl, Boolean> isSufficient;
	public static volatile SingularAttribute<PredicateImpl, String> effectiveName;
	public static volatile SingularAttribute<PredicateImpl, UUID> elementId;
	public static volatile ListAttribute<PredicateImpl, TextualRepresentation> textualRepresentation;
	public static volatile ListAttribute<PredicateImpl, Membership> importedMembership;
	public static volatile ListAttribute<PredicateImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<PredicateImpl, Element> ownedElement;
	public static volatile CollectionAttribute<PredicateImpl, Expression> expression;
	public static volatile SingularAttribute<PredicateImpl, Boolean> isModelLevelEvaluable;
	public static volatile ListAttribute<PredicateImpl, String> aliasIds;
	public static volatile ListAttribute<PredicateImpl, Feature> ownedFeature;
	public static volatile ListAttribute<PredicateImpl, Relationship> ownedRelationship;
	public static volatile SingularAttribute<PredicateImpl, String> qualifiedName;
	public static volatile ListAttribute<PredicateImpl, Documentation> documentation;
	public static volatile ListAttribute<PredicateImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<PredicateImpl, Feature> endFeature;
	public static volatile ListAttribute<PredicateImpl, Feature> directedFeature;
	public static volatile ListAttribute<PredicateImpl, Import> ownedImport;
	public static volatile SingularAttribute<PredicateImpl, Boolean> isAbstract;
	public static volatile ListAttribute<PredicateImpl, Feature> input;
	public static volatile SingularAttribute<PredicateImpl, String> name;
	public static volatile ListAttribute<PredicateImpl, Specialization> ownedSpecialization;
	public static volatile CollectionAttribute<PredicateImpl, Step> step;
	public static volatile SingularAttribute<PredicateImpl, String> shortName;
	public static volatile ListAttribute<PredicateImpl, Element> ownedMember;
	public static volatile ListAttribute<PredicateImpl, Membership> ownedMembership;

	public static final String IS_CONJUGATED = "isConjugated";
	public static final String OWNED_DISJOINING = "ownedDisjoining";
	public static final String MEMBERSHIP = "membership";
	public static final String OUTPUT = "output";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String OWNED_SUBCLASSIFICATION = "ownedSubclassification";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String ELEMENT_ID = "elementId";
	public static final String TEXTUAL_REPRESENTATION = "textualRepresentation";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String EXPRESSION = "expression";
	public static final String IS_MODEL_LEVEL_EVALUABLE = "isModelLevelEvaluable";
	public static final String ALIAS_IDS = "aliasIds";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String END_FEATURE = "endFeature";
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String INPUT = "input";
	public static final String NAME = "name";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";
	public static final String STEP = "step";
	public static final String SHORT_NAME = "shortName";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";

}


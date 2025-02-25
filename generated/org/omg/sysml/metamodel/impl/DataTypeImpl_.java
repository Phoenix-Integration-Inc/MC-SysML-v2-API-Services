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
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.Subclassification;
import org.omg.sysml.metamodel.TextualRepresentation;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DataTypeImpl.class)
public abstract class DataTypeImpl_ extends org.omg.sysml.lifecycle.impl.DataImpl_ {

	public static volatile SingularAttribute<DataTypeImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<DataTypeImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<DataTypeImpl, Membership> membership;
	public static volatile ListAttribute<DataTypeImpl, Feature> output;
	public static volatile ListAttribute<DataTypeImpl, Feature> feature;
	public static volatile ListAttribute<DataTypeImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<DataTypeImpl, Element> member;
	public static volatile ListAttribute<DataTypeImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<DataTypeImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<DataTypeImpl, Subclassification> ownedSubclassification;
	public static volatile ListAttribute<DataTypeImpl, Feature> inheritedFeature;
	public static volatile SingularAttribute<DataTypeImpl, Boolean> isSufficient;
	public static volatile SingularAttribute<DataTypeImpl, String> effectiveName;
	public static volatile SingularAttribute<DataTypeImpl, UUID> elementId;
	public static volatile ListAttribute<DataTypeImpl, TextualRepresentation> textualRepresentation;
	public static volatile ListAttribute<DataTypeImpl, Membership> importedMembership;
	public static volatile ListAttribute<DataTypeImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<DataTypeImpl, Element> ownedElement;
	public static volatile ListAttribute<DataTypeImpl, String> aliasIds;
	public static volatile ListAttribute<DataTypeImpl, Feature> ownedFeature;
	public static volatile ListAttribute<DataTypeImpl, Relationship> ownedRelationship;
	public static volatile SingularAttribute<DataTypeImpl, String> qualifiedName;
	public static volatile ListAttribute<DataTypeImpl, Documentation> documentation;
	public static volatile ListAttribute<DataTypeImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<DataTypeImpl, Feature> endFeature;
	public static volatile ListAttribute<DataTypeImpl, Feature> directedFeature;
	public static volatile ListAttribute<DataTypeImpl, Import> ownedImport;
	public static volatile SingularAttribute<DataTypeImpl, Boolean> isAbstract;
	public static volatile ListAttribute<DataTypeImpl, Feature> input;
	public static volatile SingularAttribute<DataTypeImpl, String> name;
	public static volatile ListAttribute<DataTypeImpl, Specialization> ownedSpecialization;
	public static volatile SingularAttribute<DataTypeImpl, String> shortName;
	public static volatile ListAttribute<DataTypeImpl, Element> ownedMember;
	public static volatile ListAttribute<DataTypeImpl, Membership> ownedMembership;

	public static final String IS_CONJUGATED = "isConjugated";
	public static final String OWNED_DISJOINING = "ownedDisjoining";
	public static final String MEMBERSHIP = "membership";
	public static final String OUTPUT = "output";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
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
	public static final String SHORT_NAME = "shortName";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";

}


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
@StaticMetamodel(StructureImpl.class)
public abstract class StructureImpl_ extends org.omg.sysml.lifecycle.impl.DataImpl_ {

	public static volatile SingularAttribute<StructureImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<StructureImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<StructureImpl, Membership> membership;
	public static volatile ListAttribute<StructureImpl, Feature> output;
	public static volatile ListAttribute<StructureImpl, Feature> feature;
	public static volatile ListAttribute<StructureImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<StructureImpl, Element> member;
	public static volatile ListAttribute<StructureImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<StructureImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<StructureImpl, Subclassification> ownedSubclassification;
	public static volatile ListAttribute<StructureImpl, Feature> inheritedFeature;
	public static volatile SingularAttribute<StructureImpl, Boolean> isSufficient;
	public static volatile SingularAttribute<StructureImpl, String> effectiveName;
	public static volatile SingularAttribute<StructureImpl, UUID> elementId;
	public static volatile ListAttribute<StructureImpl, TextualRepresentation> textualRepresentation;
	public static volatile ListAttribute<StructureImpl, Membership> importedMembership;
	public static volatile ListAttribute<StructureImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<StructureImpl, Element> ownedElement;
	public static volatile ListAttribute<StructureImpl, String> aliasIds;
	public static volatile ListAttribute<StructureImpl, Feature> ownedFeature;
	public static volatile ListAttribute<StructureImpl, Relationship> ownedRelationship;
	public static volatile SingularAttribute<StructureImpl, String> qualifiedName;
	public static volatile ListAttribute<StructureImpl, Documentation> documentation;
	public static volatile ListAttribute<StructureImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<StructureImpl, Feature> endFeature;
	public static volatile ListAttribute<StructureImpl, Feature> directedFeature;
	public static volatile ListAttribute<StructureImpl, Import> ownedImport;
	public static volatile SingularAttribute<StructureImpl, Boolean> isAbstract;
	public static volatile ListAttribute<StructureImpl, Feature> input;
	public static volatile SingularAttribute<StructureImpl, String> name;
	public static volatile ListAttribute<StructureImpl, Specialization> ownedSpecialization;
	public static volatile SingularAttribute<StructureImpl, String> shortName;
	public static volatile ListAttribute<StructureImpl, Element> ownedMember;
	public static volatile ListAttribute<StructureImpl, Membership> ownedMembership;

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


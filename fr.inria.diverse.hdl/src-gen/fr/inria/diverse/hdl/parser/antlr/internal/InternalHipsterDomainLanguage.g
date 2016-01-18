/*
 * generated by Xtext
 */
grammar InternalHipsterDomainLanguage;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package fr.inria.diverse.hdl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fr.inria.diverse.hdl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.inria.diverse.hdl.services.HipsterDomainLanguageGrammarAccess;

}

@parser::members {

 	private HipsterDomainLanguageGrammarAccess grammarAccess;
 	
    public InternalHipsterDomainLanguageParser(TokenStream input, HipsterDomainLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Domain";	
   	}
   	
   	@Override
   	protected HipsterDomainLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleDomain
entryRuleDomain returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDomainRule()); }
	 iv_ruleDomain=ruleDomain 
	 { $current=$iv_ruleDomain.current; } 
	 EOF 
;

// Rule Domain
ruleDomain returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getDomainAccess().getElementsDomainElementParserRuleCall_0()); 
	    }
		lv_elements_0_0=ruleDomainElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDomainRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_0_0, 
        		"DomainElement");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleDomainElement
entryRuleDomainElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDomainElementRule()); }
	 iv_ruleDomainElement=ruleDomainElement 
	 { $current=$iv_ruleDomainElement.current; } 
	 EOF 
;

// Rule DomainElement
ruleDomainElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getDomainElementAccess().getEntityParserRuleCall_0()); 
    }
    this_Entity_0=ruleEntity
    { 
        $current = $this_Entity_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getDomainElementAccess().getRelationParserRuleCall_1()); 
    }
    this_Relation_1=ruleRelation
    { 
        $current = $this_Relation_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getDomainElementAccess().getEnumParserRuleCall_2()); 
    }
    this_Enum_2=ruleEnum
    { 
        $current = $this_Enum_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	 iv_ruleEntity=ruleEntity 
	 { $current=$iv_ruleEntity.current; } 
	 EOF 
;

// Rule Entity
ruleEntity returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='entity' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_2_1_0()); 
	    }
		lv_fields_3_0=ruleField		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"fields",
        		lv_fields_3_0, 
        		"Field");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_2_2());
    }
))
;





// Entry rule entryRuleRelation
entryRuleRelation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRelationRule()); }
	 iv_ruleRelation=ruleRelation 
	 { $current=$iv_ruleRelation.current; } 
	 EOF 
;

// Rule Relation
ruleRelation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='relationship' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationshipKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRelationAccess().getTypeRelationTypeEnumRuleCall_1_0()); 
	    }
		lv_type_1_0=ruleRelationType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRelationRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_1_0, 
        		"RelationType");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRelationRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getFromEntityCrossReference_3_0()); 
	}

)
)(	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_4_0());
    }
(
(
		lv_fromRelation_5_0=RULE_ID
		{
			newLeafNode(lv_fromRelation_5_0, grammarAccess.getRelationAccess().getFromRelationIDTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRelationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"fromRelation",
        		lv_fromRelation_5_0, 
        		"ID");
	    }

)
)	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_4_2());
    }
)	otherlv_7='to' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getToKeyword_5());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRelationRule());
	        }
        }
	otherlv_8=RULE_ID
	{
		newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getToEntityCrossReference_6_0()); 
	}

)
)(	otherlv_9='{' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_7_0());
    }
(
(
		lv_toRelation_10_0=RULE_ID
		{
			newLeafNode(lv_toRelation_10_0, grammarAccess.getRelationAccess().getToRelationIDTerminalRuleCall_7_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRelationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"toRelation",
        		lv_toRelation_10_0, 
        		"ID");
	    }

)
)	otherlv_11='}' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_7_2());
    }
)	otherlv_12='}' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleEnum
entryRuleEnum returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEnumRule()); }
	 iv_ruleEnum=ruleEnum 
	 { $current=$iv_ruleEnum.current; } 
	 EOF 
;

// Rule Enum
ruleEnum returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='enum' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEnumRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		lv_literals_3_0=RULE_ID
		{
			newLeafNode(lv_literals_3_0, grammarAccess.getEnumAccess().getLiteralsIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEnumRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"literals",
        		lv_literals_3_0, 
        		"ID");
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getCommaKeyword_4_0());
    }
(
(
		lv_literals_5_0=RULE_ID
		{
			newLeafNode(lv_literals_5_0, grammarAccess.getEnumAccess().getLiteralsIDTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEnumRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"literals",
        		lv_literals_5_0, 
        		"ID");
	    }

)
))*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleField
entryRuleField returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFieldRule()); }
	 iv_ruleField=ruleField 
	 { $current=$iv_ruleField.current; } 
	 EOF 
;

// Rule Field
ruleField returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getFieldAccess().getTypeHdlTypeReferenceParserRuleCall_1_0()); 
	    }
		lv_type_1_0=ruleHdlTypeReference		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFieldRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_1_0, 
        		"HdlTypeReference");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_required_2_0=	'required' 
    {
        newLeafNode(lv_required_2_0, grammarAccess.getFieldAccess().getRequiredRequiredKeyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldRule());
	        }
       		setWithLastConsumed($current, "required", true, "required");
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getFieldAccess().getValidationRulesValidationRuleParserRuleCall_3_0()); 
	    }
		lv_validationRules_3_0=ruleValidationRule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFieldRule());
	        }
       		add(
       			$current, 
       			"validationRules",
        		lv_validationRules_3_0, 
        		"ValidationRule");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleValidationRule
entryRuleValidationRule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getValidationRuleRule()); }
	 iv_ruleValidationRule=ruleValidationRule 
	 { $current=$iv_ruleValidationRule.current; } 
	 EOF 
;

// Rule ValidationRule
ruleValidationRule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getValidationRuleAccess().getValueRangeParserRuleCall_0()); 
    }
    this_ValueRange_0=ruleValueRange
    { 
        $current = $this_ValueRange_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getValidationRuleAccess().getPatternParserRuleCall_1()); 
    }
    this_Pattern_1=rulePattern
    { 
        $current = $this_Pattern_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleValueRange
entryRuleValueRange returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getValueRangeRule()); }
	 iv_ruleValueRange=ruleValueRange 
	 { $current=$iv_ruleValueRange.current; } 
	 EOF 
;

// Rule ValueRange
ruleValueRange returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getValueRangeAccess().getMinSpecificationParserRuleCall_0()); 
    }
    this_MinSpecification_0=ruleMinSpecification
    { 
        $current = $this_MinSpecification_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getValueRangeAccess().getMaxSpecificationParserRuleCall_1()); 
    }
    this_MaxSpecification_1=ruleMaxSpecification
    { 
        $current = $this_MaxSpecification_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMinSpecification
entryRuleMinSpecification returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMinSpecificationRule()); }
	 iv_ruleMinSpecification=ruleMinSpecification 
	 { $current=$iv_ruleMinSpecification.current; } 
	 EOF 
;

// Rule MinSpecification
ruleMinSpecification returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getMinSpecificationAccess().getStringMinSpecificationParserRuleCall_0()); 
    }
    this_StringMinSpecification_0=ruleStringMinSpecification
    { 
        $current = $this_StringMinSpecification_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getMinSpecificationAccess().getIntegerMinSpecificationParserRuleCall_1()); 
    }
    this_IntegerMinSpecification_1=ruleIntegerMinSpecification
    { 
        $current = $this_IntegerMinSpecification_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMaxSpecification
entryRuleMaxSpecification returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMaxSpecificationRule()); }
	 iv_ruleMaxSpecification=ruleMaxSpecification 
	 { $current=$iv_ruleMaxSpecification.current; } 
	 EOF 
;

// Rule MaxSpecification
ruleMaxSpecification returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getMaxSpecificationAccess().getStringMaxSpecificationParserRuleCall_0()); 
    }
    this_StringMaxSpecification_0=ruleStringMaxSpecification
    { 
        $current = $this_StringMaxSpecification_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getMaxSpecificationAccess().getIntegerMaxSpecificationParserRuleCall_1()); 
    }
    this_IntegerMaxSpecification_1=ruleIntegerMaxSpecification
    { 
        $current = $this_IntegerMaxSpecification_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleStringMinSpecification
entryRuleStringMinSpecification returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStringMinSpecificationRule()); }
	 iv_ruleStringMinSpecification=ruleStringMinSpecification 
	 { $current=$iv_ruleStringMinSpecification.current; } 
	 EOF 
;

// Rule StringMinSpecification
ruleStringMinSpecification returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='minlength' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getStringMinSpecificationAccess().getMinlengthKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getStringMinSpecificationAccess().getLeftParenthesisKeyword_1());
    }
(
(
		lv_min_2_0=RULE_INT
		{
			newLeafNode(lv_min_2_0, grammarAccess.getStringMinSpecificationAccess().getMinINTTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStringMinSpecificationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"min",
        		lv_min_2_0, 
        		"INT");
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getStringMinSpecificationAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleStringMaxSpecification
entryRuleStringMaxSpecification returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStringMaxSpecificationRule()); }
	 iv_ruleStringMaxSpecification=ruleStringMaxSpecification 
	 { $current=$iv_ruleStringMaxSpecification.current; } 
	 EOF 
;

// Rule StringMaxSpecification
ruleStringMaxSpecification returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='maxlength' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getStringMaxSpecificationAccess().getMaxlengthKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getStringMaxSpecificationAccess().getLeftParenthesisKeyword_1());
    }
(
(
		lv_max_2_0=RULE_INT
		{
			newLeafNode(lv_max_2_0, grammarAccess.getStringMaxSpecificationAccess().getMaxINTTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStringMaxSpecificationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"max",
        		lv_max_2_0, 
        		"INT");
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getStringMaxSpecificationAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleIntegerMinSpecification
entryRuleIntegerMinSpecification returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIntegerMinSpecificationRule()); }
	 iv_ruleIntegerMinSpecification=ruleIntegerMinSpecification 
	 { $current=$iv_ruleIntegerMinSpecification.current; } 
	 EOF 
;

// Rule IntegerMinSpecification
ruleIntegerMinSpecification returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='min' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getIntegerMinSpecificationAccess().getMinKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getIntegerMinSpecificationAccess().getLeftParenthesisKeyword_1());
    }
(
(
		lv_min_2_0=RULE_INT
		{
			newLeafNode(lv_min_2_0, grammarAccess.getIntegerMinSpecificationAccess().getMinINTTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIntegerMinSpecificationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"min",
        		lv_min_2_0, 
        		"INT");
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getIntegerMinSpecificationAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleIntegerMaxSpecification
entryRuleIntegerMaxSpecification returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIntegerMaxSpecificationRule()); }
	 iv_ruleIntegerMaxSpecification=ruleIntegerMaxSpecification 
	 { $current=$iv_ruleIntegerMaxSpecification.current; } 
	 EOF 
;

// Rule IntegerMaxSpecification
ruleIntegerMaxSpecification returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='max' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getIntegerMaxSpecificationAccess().getMaxKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getIntegerMaxSpecificationAccess().getLeftParenthesisKeyword_1());
    }
(
(
		lv_max_2_0=RULE_INT
		{
			newLeafNode(lv_max_2_0, grammarAccess.getIntegerMaxSpecificationAccess().getMaxINTTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIntegerMaxSpecificationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"max",
        		lv_max_2_0, 
        		"INT");
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getIntegerMaxSpecificationAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRulePattern
entryRulePattern returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPatternRule()); }
	 iv_rulePattern=rulePattern 
	 { $current=$iv_rulePattern.current; } 
	 EOF 
;

// Rule Pattern
rulePattern returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='pattern' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getPatternKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getLeftParenthesisKeyword_1());
    }
(
(
		lv_regex_2_0=RULE_STRING
		{
			newLeafNode(lv_regex_2_0, grammarAccess.getPatternAccess().getRegexSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPatternRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"regex",
        		lv_regex_2_0, 
        		"STRING");
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleHdlTypeReference
entryRuleHdlTypeReference returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getHdlTypeReferenceRule()); }
	 iv_ruleHdlTypeReference=ruleHdlTypeReference 
	 { $current=$iv_ruleHdlTypeReference.current; } 
	 EOF 
;

// Rule HdlTypeReference
ruleHdlTypeReference returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getHdlTypeReferenceAccess().getEnumTypeReferenceParserRuleCall_0()); 
    }
    this_EnumTypeReference_0=ruleEnumTypeReference
    { 
        $current = $this_EnumTypeReference_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getHdlTypeReferenceAccess().getPrimitiveTypeReferenceParserRuleCall_1()); 
    }
    this_PrimitiveTypeReference_1=rulePrimitiveTypeReference
    { 
        $current = $this_PrimitiveTypeReference_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleEnumTypeReference
entryRuleEnumTypeReference returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEnumTypeReferenceRule()); }
	 iv_ruleEnumTypeReference=ruleEnumTypeReference 
	 { $current=$iv_ruleEnumTypeReference.current; } 
	 EOF 
;

// Rule EnumTypeReference
ruleEnumTypeReference returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEnumTypeReferenceRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getEnumTypeReferenceAccess().getTypeEnumCrossReference_0()); 
	}

)
)
;





// Entry rule entryRulePrimitiveTypeReference
entryRulePrimitiveTypeReference returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPrimitiveTypeReferenceRule()); }
	 iv_rulePrimitiveTypeReference=rulePrimitiveTypeReference 
	 { $current=$iv_rulePrimitiveTypeReference.current; } 
	 EOF 
;

// Rule PrimitiveTypeReference
rulePrimitiveTypeReference returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getPrimitiveTypeReferenceAccess().getTypeJHipsterTypeEnumRuleCall_0()); 
	    }
		lv_type_0_0=ruleJHipsterType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPrimitiveTypeReferenceRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"JHipsterType");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Rule RelationType
ruleRelationType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='OneToMany' 
	{
        $current = grammarAccess.getRelationTypeAccess().getONE_TO_MANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getRelationTypeAccess().getONE_TO_MANYEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='ManyToOne' 
	{
        $current = grammarAccess.getRelationTypeAccess().getMANY_TO_ONEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getRelationTypeAccess().getMANY_TO_ONEEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='OneToOne' 
	{
        $current = grammarAccess.getRelationTypeAccess().getONE_TO_ONEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getRelationTypeAccess().getONE_TO_ONEEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='ManyToMany' 
	{
        $current = grammarAccess.getRelationTypeAccess().getMANY_TO_MANYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getRelationTypeAccess().getMANY_TO_MANYEnumLiteralDeclaration_3()); 
    }
));



// Rule JHipsterType
ruleJHipsterType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='String' 
	{
        $current = grammarAccess.getJHipsterTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getJHipsterTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='Integer' 
	{
        $current = grammarAccess.getJHipsterTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getJHipsterTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='Long' 
	{
        $current = grammarAccess.getJHipsterTypeAccess().getLONGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getJHipsterTypeAccess().getLONGEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='BigDecimal' 
	{
        $current = grammarAccess.getJHipsterTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getJHipsterTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='Float' 
	{
        $current = grammarAccess.getJHipsterTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getJHipsterTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
    }
)
    |(	enumLiteral_5='Double' 
	{
        $current = grammarAccess.getJHipsterTypeAccess().getDOUBLEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_5, grammarAccess.getJHipsterTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 
    }
)
    |(	enumLiteral_6='Enum' 
	{
        $current = grammarAccess.getJHipsterTypeAccess().getENUMEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_6, grammarAccess.getJHipsterTypeAccess().getENUMEnumLiteralDeclaration_6()); 
    }
)
    |(	enumLiteral_7='Boolean' 
	{
        $current = grammarAccess.getJHipsterTypeAccess().getBOOLEANEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_7, grammarAccess.getJHipsterTypeAccess().getBOOLEANEnumLiteralDeclaration_7()); 
    }
)
    |(	enumLiteral_8='LocalDate' 
	{
        $current = grammarAccess.getJHipsterTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_8, grammarAccess.getJHipsterTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_8()); 
    }
)
    |(	enumLiteral_9='ZoneDateTime' 
	{
        $current = grammarAccess.getJHipsterTypeAccess().getZONE_DATE_TIMEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_9, grammarAccess.getJHipsterTypeAccess().getZONE_DATE_TIMEEnumLiteralDeclaration_9()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



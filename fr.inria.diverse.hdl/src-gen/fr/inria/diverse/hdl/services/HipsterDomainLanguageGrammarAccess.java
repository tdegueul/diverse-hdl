/*
 * generated by Xtext
 */
package fr.inria.diverse.hdl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class HipsterDomainLanguageGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class DomainElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Domain");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsMyElementParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//// Just an example
		//// root grammar element
		//Domain:
		//	elements+=MyElement*;
		@Override public ParserRule getRule() { return rule; }

		//elements+=MyElement*
		public Assignment getElementsAssignment() { return cElementsAssignment; }

		//MyElement
		public RuleCall getElementsMyElementParserRuleCall_0() { return cElementsMyElementParserRuleCall_0; }
	}

	public class MyElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MyElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMyElementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSomeFeatureOfMyElementAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSomeFeatureOfMyElementMyFeatureParserRuleCall_3_0 = (RuleCall)cSomeFeatureOfMyElementAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//MyElement:
		//	"myElement" name=ID "{" someFeatureOfMyElement+=MyFeature* "}";
		@Override public ParserRule getRule() { return rule; }

		//"myElement" name=ID "{" someFeatureOfMyElement+=MyFeature* "}"
		public Group getGroup() { return cGroup; }

		//"myElement"
		public Keyword getMyElementKeyword_0() { return cMyElementKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//someFeatureOfMyElement+=MyFeature*
		public Assignment getSomeFeatureOfMyElementAssignment_3() { return cSomeFeatureOfMyElementAssignment_3; }

		//MyFeature
		public RuleCall getSomeFeatureOfMyElementMyFeatureParserRuleCall_3_0() { return cSomeFeatureOfMyElementMyFeatureParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class MyFeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MyFeature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFeatureKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//MyFeature:
		//	"feature" name=ID;
		@Override public ParserRule getRule() { return rule; }

		//"feature" name=ID
		public Group getGroup() { return cGroup; }

		//"feature"
		public Keyword getFeatureKeyword_0() { return cFeatureKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	
	
	private final DomainElements pDomain;
	private final MyElementElements pMyElement;
	private final MyFeatureElements pMyFeature;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public HipsterDomainLanguageGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDomain = new DomainElements();
		this.pMyElement = new MyElementElements();
		this.pMyFeature = new MyFeatureElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.inria.diverse.hdl.HipsterDomainLanguage".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//// Just an example
	//// root grammar element
	//Domain:
	//	elements+=MyElement*;
	public DomainElements getDomainAccess() {
		return pDomain;
	}
	
	public ParserRule getDomainRule() {
		return getDomainAccess().getRule();
	}

	//MyElement:
	//	"myElement" name=ID "{" someFeatureOfMyElement+=MyFeature* "}";
	public MyElementElements getMyElementAccess() {
		return pMyElement;
	}
	
	public ParserRule getMyElementRule() {
		return getMyElementAccess().getRule();
	}

	//MyFeature:
	//	"feature" name=ID;
	public MyFeatureElements getMyFeatureAccess() {
		return pMyFeature;
	}
	
	public ParserRule getMyFeatureRule() {
		return getMyFeatureAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}

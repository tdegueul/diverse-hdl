package fr.inria.diverse.hdl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import fr.inria.diverse.hdl.services.HipsterDomainLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHipsterDomainLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'OneToMany'", "'ManyToOne'", "'OneToOne'", "'ManyToMany'", "'String'", "'Integer'", "'Long'", "'BigDecimal'", "'Float'", "'Double'", "'Enum'", "'Boolean'", "'LocalDate'", "'ZoneDateTime'", "'entity'", "'{'", "'}'", "'relationship'", "'to'", "'enum'", "','", "'required'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalHipsterDomainLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHipsterDomainLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHipsterDomainLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g"; }


     
     	private HipsterDomainLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(HipsterDomainLanguageGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleDomain"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:60:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:61:1: ( ruleDomain EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:62:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain61);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getDomainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:69:1: ruleDomain : ( ( rule__Domain__ElementsAssignment )* ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:73:2: ( ( ( rule__Domain__ElementsAssignment )* ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:74:1: ( ( rule__Domain__ElementsAssignment )* )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:74:1: ( ( rule__Domain__ElementsAssignment )* )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:75:1: ( rule__Domain__ElementsAssignment )*
            {
             before(grammarAccess.getDomainAccess().getElementsAssignment()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:76:1: ( rule__Domain__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==25||LA1_0==28||LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:76:2: rule__Domain__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Domain__ElementsAssignment_in_ruleDomain94);
            	    rule__Domain__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleDomainElement"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:88:1: entryRuleDomainElement : ruleDomainElement EOF ;
    public final void entryRuleDomainElement() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:89:1: ( ruleDomainElement EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:90:1: ruleDomainElement EOF
            {
             before(grammarAccess.getDomainElementRule()); 
            pushFollow(FOLLOW_ruleDomainElement_in_entryRuleDomainElement122);
            ruleDomainElement();

            state._fsp--;

             after(grammarAccess.getDomainElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainElement129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainElement"


    // $ANTLR start "ruleDomainElement"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:97:1: ruleDomainElement : ( ( rule__DomainElement__Alternatives ) ) ;
    public final void ruleDomainElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:101:2: ( ( ( rule__DomainElement__Alternatives ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:102:1: ( ( rule__DomainElement__Alternatives ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:102:1: ( ( rule__DomainElement__Alternatives ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:103:1: ( rule__DomainElement__Alternatives )
            {
             before(grammarAccess.getDomainElementAccess().getAlternatives()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:104:1: ( rule__DomainElement__Alternatives )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:104:2: rule__DomainElement__Alternatives
            {
            pushFollow(FOLLOW_rule__DomainElement__Alternatives_in_ruleDomainElement155);
            rule__DomainElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDomainElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainElement"


    // $ANTLR start "entryRuleEntity"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:116:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:117:1: ( ruleEntity EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:118:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity182);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:125:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:129:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:130:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:130:1: ( ( rule__Entity__Group__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:131:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:132:1: ( rule__Entity__Group__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:132:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity215);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleRelation"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:144:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:145:1: ( ruleRelation EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:146:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_ruleRelation_in_entryRuleRelation242);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelation249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:153:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:157:2: ( ( ( rule__Relation__Group__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:158:1: ( ( rule__Relation__Group__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:158:1: ( ( rule__Relation__Group__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:159:1: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:160:1: ( rule__Relation__Group__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:160:2: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_rule__Relation__Group__0_in_ruleRelation275);
            rule__Relation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleEnum"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:172:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:173:1: ( ruleEnum EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:174:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum302);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:181:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:185:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:186:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:186:1: ( ( rule__Enum__Group__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:187:1: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:188:1: ( rule__Enum__Group__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:188:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum335);
            rule__Enum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleField"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:200:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:201:1: ( ruleField EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:202:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField362);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:209:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:213:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:214:1: ( ( rule__Field__Group__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:214:1: ( ( rule__Field__Group__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:215:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:216:1: ( rule__Field__Group__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:216:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField395);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleHdlType"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:228:1: entryRuleHdlType : ruleHdlType EOF ;
    public final void entryRuleHdlType() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:229:1: ( ruleHdlType EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:230:1: ruleHdlType EOF
            {
             before(grammarAccess.getHdlTypeRule()); 
            pushFollow(FOLLOW_ruleHdlType_in_entryRuleHdlType422);
            ruleHdlType();

            state._fsp--;

             after(grammarAccess.getHdlTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHdlType429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHdlType"


    // $ANTLR start "ruleHdlType"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:237:1: ruleHdlType : ( ( rule__HdlType__Alternatives ) ) ;
    public final void ruleHdlType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:241:2: ( ( ( rule__HdlType__Alternatives ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:242:1: ( ( rule__HdlType__Alternatives ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:242:1: ( ( rule__HdlType__Alternatives ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:243:1: ( rule__HdlType__Alternatives )
            {
             before(grammarAccess.getHdlTypeAccess().getAlternatives()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:244:1: ( rule__HdlType__Alternatives )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:244:2: rule__HdlType__Alternatives
            {
            pushFollow(FOLLOW_rule__HdlType__Alternatives_in_ruleHdlType455);
            rule__HdlType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHdlTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHdlType"


    // $ANTLR start "ruleRelationType"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:257:1: ruleRelationType : ( ( rule__RelationType__Alternatives ) ) ;
    public final void ruleRelationType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:261:1: ( ( ( rule__RelationType__Alternatives ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:262:1: ( ( rule__RelationType__Alternatives ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:262:1: ( ( rule__RelationType__Alternatives ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:263:1: ( rule__RelationType__Alternatives )
            {
             before(grammarAccess.getRelationTypeAccess().getAlternatives()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:264:1: ( rule__RelationType__Alternatives )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:264:2: rule__RelationType__Alternatives
            {
            pushFollow(FOLLOW_rule__RelationType__Alternatives_in_ruleRelationType492);
            rule__RelationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationType"


    // $ANTLR start "ruleJHipsterType"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:276:1: ruleJHipsterType : ( ( rule__JHipsterType__Alternatives ) ) ;
    public final void ruleJHipsterType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:280:1: ( ( ( rule__JHipsterType__Alternatives ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:281:1: ( ( rule__JHipsterType__Alternatives ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:281:1: ( ( rule__JHipsterType__Alternatives ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:282:1: ( rule__JHipsterType__Alternatives )
            {
             before(grammarAccess.getJHipsterTypeAccess().getAlternatives()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:283:1: ( rule__JHipsterType__Alternatives )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:283:2: rule__JHipsterType__Alternatives
            {
            pushFollow(FOLLOW_rule__JHipsterType__Alternatives_in_ruleJHipsterType528);
            rule__JHipsterType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJHipsterTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJHipsterType"


    // $ANTLR start "rule__DomainElement__Alternatives"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:294:1: rule__DomainElement__Alternatives : ( ( ruleEntity ) | ( ruleRelation ) | ( ruleEnum ) );
    public final void rule__DomainElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:298:1: ( ( ruleEntity ) | ( ruleRelation ) | ( ruleEnum ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                alt2=2;
                }
                break;
            case 30:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:299:1: ( ruleEntity )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:299:1: ( ruleEntity )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:300:1: ruleEntity
                    {
                     before(grammarAccess.getDomainElementAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__DomainElement__Alternatives563);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getDomainElementAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:305:6: ( ruleRelation )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:305:6: ( ruleRelation )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:306:1: ruleRelation
                    {
                     before(grammarAccess.getDomainElementAccess().getRelationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRelation_in_rule__DomainElement__Alternatives580);
                    ruleRelation();

                    state._fsp--;

                     after(grammarAccess.getDomainElementAccess().getRelationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:311:6: ( ruleEnum )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:311:6: ( ruleEnum )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:312:1: ruleEnum
                    {
                     before(grammarAccess.getDomainElementAccess().getEnumParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnum_in_rule__DomainElement__Alternatives597);
                    ruleEnum();

                    state._fsp--;

                     after(grammarAccess.getDomainElementAccess().getEnumParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainElement__Alternatives"


    // $ANTLR start "rule__HdlType__Alternatives"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:322:1: rule__HdlType__Alternatives : ( ( ( rule__HdlType__EnumTypeAssignment_0 ) ) | ( ( rule__HdlType__PrimitiveTypeAssignment_1 ) ) );
    public final void rule__HdlType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:326:1: ( ( ( rule__HdlType__EnumTypeAssignment_0 ) ) | ( ( rule__HdlType__PrimitiveTypeAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=15 && LA3_0<=24)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:327:1: ( ( rule__HdlType__EnumTypeAssignment_0 ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:327:1: ( ( rule__HdlType__EnumTypeAssignment_0 ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:328:1: ( rule__HdlType__EnumTypeAssignment_0 )
                    {
                     before(grammarAccess.getHdlTypeAccess().getEnumTypeAssignment_0()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:329:1: ( rule__HdlType__EnumTypeAssignment_0 )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:329:2: rule__HdlType__EnumTypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__HdlType__EnumTypeAssignment_0_in_rule__HdlType__Alternatives629);
                    rule__HdlType__EnumTypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHdlTypeAccess().getEnumTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:333:6: ( ( rule__HdlType__PrimitiveTypeAssignment_1 ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:333:6: ( ( rule__HdlType__PrimitiveTypeAssignment_1 ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:334:1: ( rule__HdlType__PrimitiveTypeAssignment_1 )
                    {
                     before(grammarAccess.getHdlTypeAccess().getPrimitiveTypeAssignment_1()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:335:1: ( rule__HdlType__PrimitiveTypeAssignment_1 )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:335:2: rule__HdlType__PrimitiveTypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__HdlType__PrimitiveTypeAssignment_1_in_rule__HdlType__Alternatives647);
                    rule__HdlType__PrimitiveTypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getHdlTypeAccess().getPrimitiveTypeAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HdlType__Alternatives"


    // $ANTLR start "rule__RelationType__Alternatives"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:344:1: rule__RelationType__Alternatives : ( ( ( 'OneToMany' ) ) | ( ( 'ManyToOne' ) ) | ( ( 'OneToOne' ) ) | ( ( 'ManyToMany' ) ) );
    public final void rule__RelationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:348:1: ( ( ( 'OneToMany' ) ) | ( ( 'ManyToOne' ) ) | ( ( 'OneToOne' ) ) | ( ( 'ManyToMany' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:349:1: ( ( 'OneToMany' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:349:1: ( ( 'OneToMany' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:350:1: ( 'OneToMany' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getONE_TO_MANYEnumLiteralDeclaration_0()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:351:1: ( 'OneToMany' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:351:3: 'OneToMany'
                    {
                    match(input,11,FOLLOW_11_in_rule__RelationType__Alternatives681); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getONE_TO_MANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:356:6: ( ( 'ManyToOne' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:356:6: ( ( 'ManyToOne' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:357:1: ( 'ManyToOne' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getMANY_TO_ONEEnumLiteralDeclaration_1()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:358:1: ( 'ManyToOne' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:358:3: 'ManyToOne'
                    {
                    match(input,12,FOLLOW_12_in_rule__RelationType__Alternatives702); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getMANY_TO_ONEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:363:6: ( ( 'OneToOne' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:363:6: ( ( 'OneToOne' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:364:1: ( 'OneToOne' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getONE_TO_ONEEnumLiteralDeclaration_2()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:365:1: ( 'OneToOne' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:365:3: 'OneToOne'
                    {
                    match(input,13,FOLLOW_13_in_rule__RelationType__Alternatives723); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getONE_TO_ONEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:370:6: ( ( 'ManyToMany' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:370:6: ( ( 'ManyToMany' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:371:1: ( 'ManyToMany' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getMANY_TO_MANYEnumLiteralDeclaration_3()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:372:1: ( 'ManyToMany' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:372:3: 'ManyToMany'
                    {
                    match(input,14,FOLLOW_14_in_rule__RelationType__Alternatives744); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getMANY_TO_MANYEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationType__Alternatives"


    // $ANTLR start "rule__JHipsterType__Alternatives"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:382:1: rule__JHipsterType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Long' ) ) | ( ( 'BigDecimal' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'Enum' ) ) | ( ( 'Boolean' ) ) | ( ( 'LocalDate' ) ) | ( ( 'ZoneDateTime' ) ) );
    public final void rule__JHipsterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:386:1: ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Long' ) ) | ( ( 'BigDecimal' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'Enum' ) ) | ( ( 'Boolean' ) ) | ( ( 'LocalDate' ) ) | ( ( 'ZoneDateTime' ) ) )
            int alt5=10;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            case 19:
                {
                alt5=5;
                }
                break;
            case 20:
                {
                alt5=6;
                }
                break;
            case 21:
                {
                alt5=7;
                }
                break;
            case 22:
                {
                alt5=8;
                }
                break;
            case 23:
                {
                alt5=9;
                }
                break;
            case 24:
                {
                alt5=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:387:1: ( ( 'String' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:387:1: ( ( 'String' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:388:1: ( 'String' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:389:1: ( 'String' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:389:3: 'String'
                    {
                    match(input,15,FOLLOW_15_in_rule__JHipsterType__Alternatives780); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:394:6: ( ( 'Integer' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:394:6: ( ( 'Integer' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:395:1: ( 'Integer' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:396:1: ( 'Integer' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:396:3: 'Integer'
                    {
                    match(input,16,FOLLOW_16_in_rule__JHipsterType__Alternatives801); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:401:6: ( ( 'Long' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:401:6: ( ( 'Long' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:402:1: ( 'Long' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getLONGEnumLiteralDeclaration_2()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:403:1: ( 'Long' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:403:3: 'Long'
                    {
                    match(input,17,FOLLOW_17_in_rule__JHipsterType__Alternatives822); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getLONGEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:408:6: ( ( 'BigDecimal' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:408:6: ( ( 'BigDecimal' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:409:1: ( 'BigDecimal' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_3()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:410:1: ( 'BigDecimal' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:410:3: 'BigDecimal'
                    {
                    match(input,18,FOLLOW_18_in_rule__JHipsterType__Alternatives843); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:415:6: ( ( 'Float' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:415:6: ( ( 'Float' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:416:1: ( 'Float' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:417:1: ( 'Float' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:417:3: 'Float'
                    {
                    match(input,19,FOLLOW_19_in_rule__JHipsterType__Alternatives864); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getFLOATEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:422:6: ( ( 'Double' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:422:6: ( ( 'Double' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:423:1: ( 'Double' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:424:1: ( 'Double' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:424:3: 'Double'
                    {
                    match(input,20,FOLLOW_20_in_rule__JHipsterType__Alternatives885); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:429:6: ( ( 'Enum' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:429:6: ( ( 'Enum' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:430:1: ( 'Enum' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getENUMEnumLiteralDeclaration_6()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:431:1: ( 'Enum' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:431:3: 'Enum'
                    {
                    match(input,21,FOLLOW_21_in_rule__JHipsterType__Alternatives906); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getENUMEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:436:6: ( ( 'Boolean' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:436:6: ( ( 'Boolean' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:437:1: ( 'Boolean' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getBOOLEANEnumLiteralDeclaration_7()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:438:1: ( 'Boolean' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:438:3: 'Boolean'
                    {
                    match(input,22,FOLLOW_22_in_rule__JHipsterType__Alternatives927); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getBOOLEANEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:443:6: ( ( 'LocalDate' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:443:6: ( ( 'LocalDate' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:444:1: ( 'LocalDate' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_8()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:445:1: ( 'LocalDate' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:445:3: 'LocalDate'
                    {
                    match(input,23,FOLLOW_23_in_rule__JHipsterType__Alternatives948); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:450:6: ( ( 'ZoneDateTime' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:450:6: ( ( 'ZoneDateTime' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:451:1: ( 'ZoneDateTime' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getZONE_DATE_TIMEEnumLiteralDeclaration_9()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:452:1: ( 'ZoneDateTime' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:452:3: 'ZoneDateTime'
                    {
                    match(input,24,FOLLOW_24_in_rule__JHipsterType__Alternatives969); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getZONE_DATE_TIMEEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JHipsterType__Alternatives"


    // $ANTLR start "rule__Entity__Group__0"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:464:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:468:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:469:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01002);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01005);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:476:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:480:1: ( ( 'entity' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:481:1: ( 'entity' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:481:1: ( 'entity' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:482:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Entity__Group__0__Impl1033); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:495:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:499:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:500:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11064);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11067);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:507:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:511:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:512:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:512:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:513:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:514:1: ( rule__Entity__NameAssignment_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:514:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1094);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:524:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:528:1: ( rule__Entity__Group__2__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:529:2: rule__Entity__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21124);
            rule__Entity__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:535:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:539:1: ( ( ( rule__Entity__Group_2__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:540:1: ( ( rule__Entity__Group_2__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:540:1: ( ( rule__Entity__Group_2__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:541:1: ( rule__Entity__Group_2__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:542:1: ( rule__Entity__Group_2__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:542:2: rule__Entity__Group_2__0
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl1151);
            rule__Entity__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:558:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:562:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:563:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__01187);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01190);
            rule__Entity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:570:1: rule__Entity__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:574:1: ( ( '{' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:575:1: ( '{' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:575:1: ( '{' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:576:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Entity__Group_2__0__Impl1218); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:589:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:593:1: ( rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:594:2: rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__11249);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__2_in_rule__Entity__Group_2__11252);
            rule__Entity__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:601:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__FieldsAssignment_2_1 )* ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:605:1: ( ( ( rule__Entity__FieldsAssignment_2_1 )* ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:606:1: ( ( rule__Entity__FieldsAssignment_2_1 )* )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:606:1: ( ( rule__Entity__FieldsAssignment_2_1 )* )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:607:1: ( rule__Entity__FieldsAssignment_2_1 )*
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_2_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:608:1: ( rule__Entity__FieldsAssignment_2_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:608:2: rule__Entity__FieldsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FieldsAssignment_2_1_in_rule__Entity__Group_2__1__Impl1279);
            	    rule__Entity__FieldsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFieldsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Entity__Group_2__2"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:618:1: rule__Entity__Group_2__2 : rule__Entity__Group_2__2__Impl ;
    public final void rule__Entity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:622:1: ( rule__Entity__Group_2__2__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:623:2: rule__Entity__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__2__Impl_in_rule__Entity__Group_2__21310);
            rule__Entity__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__2"


    // $ANTLR start "rule__Entity__Group_2__2__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:629:1: rule__Entity__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Entity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:633:1: ( ( '}' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:634:1: ( '}' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:634:1: ( '}' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:635:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,27,FOLLOW_27_in_rule__Entity__Group_2__2__Impl1338); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__2__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:654:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:658:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:659:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_rule__Relation__Group__0__Impl_in_rule__Relation__Group__01375);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__1_in_rule__Relation__Group__01378);
            rule__Relation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:666:1: rule__Relation__Group__0__Impl : ( 'relationship' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:670:1: ( ( 'relationship' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:671:1: ( 'relationship' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:671:1: ( 'relationship' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:672:1: 'relationship'
            {
             before(grammarAccess.getRelationAccess().getRelationshipKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Relation__Group__0__Impl1406); 
             after(grammarAccess.getRelationAccess().getRelationshipKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:685:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:689:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:690:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_rule__Relation__Group__1__Impl_in_rule__Relation__Group__11437);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__2_in_rule__Relation__Group__11440);
            rule__Relation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:697:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__TypeAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:701:1: ( ( ( rule__Relation__TypeAssignment_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:702:1: ( ( rule__Relation__TypeAssignment_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:702:1: ( ( rule__Relation__TypeAssignment_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:703:1: ( rule__Relation__TypeAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getTypeAssignment_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:704:1: ( rule__Relation__TypeAssignment_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:704:2: rule__Relation__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Relation__TypeAssignment_1_in_rule__Relation__Group__1__Impl1467);
            rule__Relation__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__2"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:714:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:718:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:719:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_rule__Relation__Group__2__Impl_in_rule__Relation__Group__21497);
            rule__Relation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__3_in_rule__Relation__Group__21500);
            rule__Relation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2"


    // $ANTLR start "rule__Relation__Group__2__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:726:1: rule__Relation__Group__2__Impl : ( '{' ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:730:1: ( ( '{' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:731:1: ( '{' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:731:1: ( '{' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:732:1: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Relation__Group__2__Impl1528); 
             after(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2__Impl"


    // $ANTLR start "rule__Relation__Group__3"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:745:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:749:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:750:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
            {
            pushFollow(FOLLOW_rule__Relation__Group__3__Impl_in_rule__Relation__Group__31559);
            rule__Relation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__4_in_rule__Relation__Group__31562);
            rule__Relation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3"


    // $ANTLR start "rule__Relation__Group__3__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:757:1: rule__Relation__Group__3__Impl : ( ( rule__Relation__FromAssignment_3 ) ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:761:1: ( ( ( rule__Relation__FromAssignment_3 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:762:1: ( ( rule__Relation__FromAssignment_3 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:762:1: ( ( rule__Relation__FromAssignment_3 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:763:1: ( rule__Relation__FromAssignment_3 )
            {
             before(grammarAccess.getRelationAccess().getFromAssignment_3()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:764:1: ( rule__Relation__FromAssignment_3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:764:2: rule__Relation__FromAssignment_3
            {
            pushFollow(FOLLOW_rule__Relation__FromAssignment_3_in_rule__Relation__Group__3__Impl1589);
            rule__Relation__FromAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getFromAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group__4"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:774:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:778:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:779:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
            {
            pushFollow(FOLLOW_rule__Relation__Group__4__Impl_in_rule__Relation__Group__41619);
            rule__Relation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__5_in_rule__Relation__Group__41622);
            rule__Relation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__4"


    // $ANTLR start "rule__Relation__Group__4__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:786:1: rule__Relation__Group__4__Impl : ( ( rule__Relation__Group_4__0 ) ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:790:1: ( ( ( rule__Relation__Group_4__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:791:1: ( ( rule__Relation__Group_4__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:791:1: ( ( rule__Relation__Group_4__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:792:1: ( rule__Relation__Group_4__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup_4()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:793:1: ( rule__Relation__Group_4__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:793:2: rule__Relation__Group_4__0
            {
            pushFollow(FOLLOW_rule__Relation__Group_4__0_in_rule__Relation__Group__4__Impl1649);
            rule__Relation__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__4__Impl"


    // $ANTLR start "rule__Relation__Group__5"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:803:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl rule__Relation__Group__6 ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:807:1: ( rule__Relation__Group__5__Impl rule__Relation__Group__6 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:808:2: rule__Relation__Group__5__Impl rule__Relation__Group__6
            {
            pushFollow(FOLLOW_rule__Relation__Group__5__Impl_in_rule__Relation__Group__51679);
            rule__Relation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__6_in_rule__Relation__Group__51682);
            rule__Relation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__5"


    // $ANTLR start "rule__Relation__Group__5__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:815:1: rule__Relation__Group__5__Impl : ( 'to' ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:819:1: ( ( 'to' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:820:1: ( 'to' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:820:1: ( 'to' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:821:1: 'to'
            {
             before(grammarAccess.getRelationAccess().getToKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__Relation__Group__5__Impl1710); 
             after(grammarAccess.getRelationAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__5__Impl"


    // $ANTLR start "rule__Relation__Group__6"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:834:1: rule__Relation__Group__6 : rule__Relation__Group__6__Impl rule__Relation__Group__7 ;
    public final void rule__Relation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:838:1: ( rule__Relation__Group__6__Impl rule__Relation__Group__7 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:839:2: rule__Relation__Group__6__Impl rule__Relation__Group__7
            {
            pushFollow(FOLLOW_rule__Relation__Group__6__Impl_in_rule__Relation__Group__61741);
            rule__Relation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__7_in_rule__Relation__Group__61744);
            rule__Relation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__6"


    // $ANTLR start "rule__Relation__Group__6__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:846:1: rule__Relation__Group__6__Impl : ( ( rule__Relation__ToAssignment_6 ) ) ;
    public final void rule__Relation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:850:1: ( ( ( rule__Relation__ToAssignment_6 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:851:1: ( ( rule__Relation__ToAssignment_6 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:851:1: ( ( rule__Relation__ToAssignment_6 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:852:1: ( rule__Relation__ToAssignment_6 )
            {
             before(grammarAccess.getRelationAccess().getToAssignment_6()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:853:1: ( rule__Relation__ToAssignment_6 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:853:2: rule__Relation__ToAssignment_6
            {
            pushFollow(FOLLOW_rule__Relation__ToAssignment_6_in_rule__Relation__Group__6__Impl1771);
            rule__Relation__ToAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getToAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__6__Impl"


    // $ANTLR start "rule__Relation__Group__7"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:863:1: rule__Relation__Group__7 : rule__Relation__Group__7__Impl rule__Relation__Group__8 ;
    public final void rule__Relation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:867:1: ( rule__Relation__Group__7__Impl rule__Relation__Group__8 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:868:2: rule__Relation__Group__7__Impl rule__Relation__Group__8
            {
            pushFollow(FOLLOW_rule__Relation__Group__7__Impl_in_rule__Relation__Group__71801);
            rule__Relation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__8_in_rule__Relation__Group__71804);
            rule__Relation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__7"


    // $ANTLR start "rule__Relation__Group__7__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:875:1: rule__Relation__Group__7__Impl : ( ( rule__Relation__Group_7__0 ) ) ;
    public final void rule__Relation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:879:1: ( ( ( rule__Relation__Group_7__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:880:1: ( ( rule__Relation__Group_7__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:880:1: ( ( rule__Relation__Group_7__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:881:1: ( rule__Relation__Group_7__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup_7()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:882:1: ( rule__Relation__Group_7__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:882:2: rule__Relation__Group_7__0
            {
            pushFollow(FOLLOW_rule__Relation__Group_7__0_in_rule__Relation__Group__7__Impl1831);
            rule__Relation__Group_7__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__7__Impl"


    // $ANTLR start "rule__Relation__Group__8"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:892:1: rule__Relation__Group__8 : rule__Relation__Group__8__Impl ;
    public final void rule__Relation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:896:1: ( rule__Relation__Group__8__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:897:2: rule__Relation__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group__8__Impl_in_rule__Relation__Group__81861);
            rule__Relation__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__8"


    // $ANTLR start "rule__Relation__Group__8__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:903:1: rule__Relation__Group__8__Impl : ( '}' ) ;
    public final void rule__Relation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:907:1: ( ( '}' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:908:1: ( '}' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:908:1: ( '}' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:909:1: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_27_in_rule__Relation__Group__8__Impl1889); 
             after(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__8__Impl"


    // $ANTLR start "rule__Relation__Group_4__0"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:940:1: rule__Relation__Group_4__0 : rule__Relation__Group_4__0__Impl rule__Relation__Group_4__1 ;
    public final void rule__Relation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:944:1: ( rule__Relation__Group_4__0__Impl rule__Relation__Group_4__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:945:2: rule__Relation__Group_4__0__Impl rule__Relation__Group_4__1
            {
            pushFollow(FOLLOW_rule__Relation__Group_4__0__Impl_in_rule__Relation__Group_4__01938);
            rule__Relation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_4__1_in_rule__Relation__Group_4__01941);
            rule__Relation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_4__0"


    // $ANTLR start "rule__Relation__Group_4__0__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:952:1: rule__Relation__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Relation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:956:1: ( ( '{' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:957:1: ( '{' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:957:1: ( '{' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:958:1: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,26,FOLLOW_26_in_rule__Relation__Group_4__0__Impl1969); 
             after(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_4__0__Impl"


    // $ANTLR start "rule__Relation__Group_4__1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:971:1: rule__Relation__Group_4__1 : rule__Relation__Group_4__1__Impl rule__Relation__Group_4__2 ;
    public final void rule__Relation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:975:1: ( rule__Relation__Group_4__1__Impl rule__Relation__Group_4__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:976:2: rule__Relation__Group_4__1__Impl rule__Relation__Group_4__2
            {
            pushFollow(FOLLOW_rule__Relation__Group_4__1__Impl_in_rule__Relation__Group_4__12000);
            rule__Relation__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_4__2_in_rule__Relation__Group_4__12003);
            rule__Relation__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_4__1"


    // $ANTLR start "rule__Relation__Group_4__1__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:983:1: rule__Relation__Group_4__1__Impl : ( ( rule__Relation__FromRelationAssignment_4_1 ) ) ;
    public final void rule__Relation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:987:1: ( ( ( rule__Relation__FromRelationAssignment_4_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:988:1: ( ( rule__Relation__FromRelationAssignment_4_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:988:1: ( ( rule__Relation__FromRelationAssignment_4_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:989:1: ( rule__Relation__FromRelationAssignment_4_1 )
            {
             before(grammarAccess.getRelationAccess().getFromRelationAssignment_4_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:990:1: ( rule__Relation__FromRelationAssignment_4_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:990:2: rule__Relation__FromRelationAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Relation__FromRelationAssignment_4_1_in_rule__Relation__Group_4__1__Impl2030);
            rule__Relation__FromRelationAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getFromRelationAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_4__1__Impl"


    // $ANTLR start "rule__Relation__Group_4__2"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1000:1: rule__Relation__Group_4__2 : rule__Relation__Group_4__2__Impl ;
    public final void rule__Relation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1004:1: ( rule__Relation__Group_4__2__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1005:2: rule__Relation__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_4__2__Impl_in_rule__Relation__Group_4__22060);
            rule__Relation__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_4__2"


    // $ANTLR start "rule__Relation__Group_4__2__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1011:1: rule__Relation__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Relation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1015:1: ( ( '}' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1016:1: ( '}' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1016:1: ( '}' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1017:1: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,27,FOLLOW_27_in_rule__Relation__Group_4__2__Impl2088); 
             after(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_4__2__Impl"


    // $ANTLR start "rule__Relation__Group_7__0"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1036:1: rule__Relation__Group_7__0 : rule__Relation__Group_7__0__Impl rule__Relation__Group_7__1 ;
    public final void rule__Relation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1040:1: ( rule__Relation__Group_7__0__Impl rule__Relation__Group_7__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1041:2: rule__Relation__Group_7__0__Impl rule__Relation__Group_7__1
            {
            pushFollow(FOLLOW_rule__Relation__Group_7__0__Impl_in_rule__Relation__Group_7__02125);
            rule__Relation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_7__1_in_rule__Relation__Group_7__02128);
            rule__Relation__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_7__0"


    // $ANTLR start "rule__Relation__Group_7__0__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1048:1: rule__Relation__Group_7__0__Impl : ( '{' ) ;
    public final void rule__Relation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1052:1: ( ( '{' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1053:1: ( '{' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1053:1: ( '{' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1054:1: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_7_0()); 
            match(input,26,FOLLOW_26_in_rule__Relation__Group_7__0__Impl2156); 
             after(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_7__0__Impl"


    // $ANTLR start "rule__Relation__Group_7__1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1067:1: rule__Relation__Group_7__1 : rule__Relation__Group_7__1__Impl rule__Relation__Group_7__2 ;
    public final void rule__Relation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1071:1: ( rule__Relation__Group_7__1__Impl rule__Relation__Group_7__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1072:2: rule__Relation__Group_7__1__Impl rule__Relation__Group_7__2
            {
            pushFollow(FOLLOW_rule__Relation__Group_7__1__Impl_in_rule__Relation__Group_7__12187);
            rule__Relation__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_7__2_in_rule__Relation__Group_7__12190);
            rule__Relation__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_7__1"


    // $ANTLR start "rule__Relation__Group_7__1__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1079:1: rule__Relation__Group_7__1__Impl : ( ( rule__Relation__ToRelationAssignment_7_1 ) ) ;
    public final void rule__Relation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1083:1: ( ( ( rule__Relation__ToRelationAssignment_7_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1084:1: ( ( rule__Relation__ToRelationAssignment_7_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1084:1: ( ( rule__Relation__ToRelationAssignment_7_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1085:1: ( rule__Relation__ToRelationAssignment_7_1 )
            {
             before(grammarAccess.getRelationAccess().getToRelationAssignment_7_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1086:1: ( rule__Relation__ToRelationAssignment_7_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1086:2: rule__Relation__ToRelationAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Relation__ToRelationAssignment_7_1_in_rule__Relation__Group_7__1__Impl2217);
            rule__Relation__ToRelationAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getToRelationAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_7__1__Impl"


    // $ANTLR start "rule__Relation__Group_7__2"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1096:1: rule__Relation__Group_7__2 : rule__Relation__Group_7__2__Impl ;
    public final void rule__Relation__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1100:1: ( rule__Relation__Group_7__2__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1101:2: rule__Relation__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_7__2__Impl_in_rule__Relation__Group_7__22247);
            rule__Relation__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_7__2"


    // $ANTLR start "rule__Relation__Group_7__2__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1107:1: rule__Relation__Group_7__2__Impl : ( '}' ) ;
    public final void rule__Relation__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1111:1: ( ( '}' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1112:1: ( '}' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1112:1: ( '}' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1113:1: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_7_2()); 
            match(input,27,FOLLOW_27_in_rule__Relation__Group_7__2__Impl2275); 
             after(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_7__2__Impl"


    // $ANTLR start "rule__Enum__Group__0"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1132:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1136:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1137:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__02312);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__02315);
            rule__Enum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0"


    // $ANTLR start "rule__Enum__Group__0__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1144:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1148:1: ( ( 'enum' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1149:1: ( 'enum' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1149:1: ( 'enum' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1150:1: 'enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Enum__Group__0__Impl2343); 
             after(grammarAccess.getEnumAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1163:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1167:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1168:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__12374);
            rule__Enum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__12377);
            rule__Enum__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1"


    // $ANTLR start "rule__Enum__Group__1__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1175:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1179:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1180:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1180:1: ( ( rule__Enum__NameAssignment_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1181:1: ( rule__Enum__NameAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1182:1: ( rule__Enum__NameAssignment_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1182:2: rule__Enum__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl2404);
            rule__Enum__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__Enum__Group__2"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1192:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1196:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1197:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__22434);
            rule__Enum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__22437);
            rule__Enum__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2"


    // $ANTLR start "rule__Enum__Group__2__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1204:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1208:1: ( ( '{' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1209:1: ( '{' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1209:1: ( '{' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1210:1: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Enum__Group__2__Impl2465); 
             after(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2__Impl"


    // $ANTLR start "rule__Enum__Group__3"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1223:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1227:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1228:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__32496);
            rule__Enum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__32499);
            rule__Enum__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__3"


    // $ANTLR start "rule__Enum__Group__3__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1235:1: rule__Enum__Group__3__Impl : ( ( rule__Enum__LiteralsAssignment_3 ) ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1239:1: ( ( ( rule__Enum__LiteralsAssignment_3 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1240:1: ( ( rule__Enum__LiteralsAssignment_3 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1240:1: ( ( rule__Enum__LiteralsAssignment_3 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1241:1: ( rule__Enum__LiteralsAssignment_3 )
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_3()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1242:1: ( rule__Enum__LiteralsAssignment_3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1242:2: rule__Enum__LiteralsAssignment_3
            {
            pushFollow(FOLLOW_rule__Enum__LiteralsAssignment_3_in_rule__Enum__Group__3__Impl2526);
            rule__Enum__LiteralsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getLiteralsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__3__Impl"


    // $ANTLR start "rule__Enum__Group__4"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1252:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1256:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1257:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
            {
            pushFollow(FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__42556);
            rule__Enum__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__42559);
            rule__Enum__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__4"


    // $ANTLR start "rule__Enum__Group__4__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1264:1: rule__Enum__Group__4__Impl : ( ( rule__Enum__Group_4__0 )* ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1268:1: ( ( ( rule__Enum__Group_4__0 )* ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1269:1: ( ( rule__Enum__Group_4__0 )* )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1269:1: ( ( rule__Enum__Group_4__0 )* )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1270:1: ( rule__Enum__Group_4__0 )*
            {
             before(grammarAccess.getEnumAccess().getGroup_4()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1271:1: ( rule__Enum__Group_4__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1271:2: rule__Enum__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Enum__Group_4__0_in_rule__Enum__Group__4__Impl2586);
            	    rule__Enum__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getEnumAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__4__Impl"


    // $ANTLR start "rule__Enum__Group__5"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1281:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1285:1: ( rule__Enum__Group__5__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1286:2: rule__Enum__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__52617);
            rule__Enum__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__5"


    // $ANTLR start "rule__Enum__Group__5__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1292:1: rule__Enum__Group__5__Impl : ( '}' ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1296:1: ( ( '}' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1297:1: ( '}' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1297:1: ( '}' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1298:1: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_27_in_rule__Enum__Group__5__Impl2645); 
             after(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__5__Impl"


    // $ANTLR start "rule__Enum__Group_4__0"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1323:1: rule__Enum__Group_4__0 : rule__Enum__Group_4__0__Impl rule__Enum__Group_4__1 ;
    public final void rule__Enum__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1327:1: ( rule__Enum__Group_4__0__Impl rule__Enum__Group_4__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1328:2: rule__Enum__Group_4__0__Impl rule__Enum__Group_4__1
            {
            pushFollow(FOLLOW_rule__Enum__Group_4__0__Impl_in_rule__Enum__Group_4__02688);
            rule__Enum__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group_4__1_in_rule__Enum__Group_4__02691);
            rule__Enum__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_4__0"


    // $ANTLR start "rule__Enum__Group_4__0__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1335:1: rule__Enum__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Enum__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1339:1: ( ( ',' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1340:1: ( ',' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1340:1: ( ',' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1341:1: ','
            {
             before(grammarAccess.getEnumAccess().getCommaKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__Enum__Group_4__0__Impl2719); 
             after(grammarAccess.getEnumAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_4__0__Impl"


    // $ANTLR start "rule__Enum__Group_4__1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1354:1: rule__Enum__Group_4__1 : rule__Enum__Group_4__1__Impl ;
    public final void rule__Enum__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1358:1: ( rule__Enum__Group_4__1__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1359:2: rule__Enum__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group_4__1__Impl_in_rule__Enum__Group_4__12750);
            rule__Enum__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_4__1"


    // $ANTLR start "rule__Enum__Group_4__1__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1365:1: rule__Enum__Group_4__1__Impl : ( ( rule__Enum__LiteralsAssignment_4_1 ) ) ;
    public final void rule__Enum__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1369:1: ( ( ( rule__Enum__LiteralsAssignment_4_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1370:1: ( ( rule__Enum__LiteralsAssignment_4_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1370:1: ( ( rule__Enum__LiteralsAssignment_4_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1371:1: ( rule__Enum__LiteralsAssignment_4_1 )
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_4_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1372:1: ( rule__Enum__LiteralsAssignment_4_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1372:2: rule__Enum__LiteralsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Enum__LiteralsAssignment_4_1_in_rule__Enum__Group_4__1__Impl2777);
            rule__Enum__LiteralsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getLiteralsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_4__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1386:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1390:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1391:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__02811);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__02814);
            rule__Field__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1398:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1402:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1403:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1403:1: ( ( rule__Field__NameAssignment_0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1404:1: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1405:1: ( rule__Field__NameAssignment_0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1405:2: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl2841);
            rule__Field__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1415:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1419:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1420:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__12871);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__12874);
            rule__Field__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1427:1: rule__Field__Group__1__Impl : ( ( rule__Field__TypeAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1431:1: ( ( ( rule__Field__TypeAssignment_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1432:1: ( ( rule__Field__TypeAssignment_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1432:1: ( ( rule__Field__TypeAssignment_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1433:1: ( rule__Field__TypeAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1434:1: ( rule__Field__TypeAssignment_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1434:2: rule__Field__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__TypeAssignment_1_in_rule__Field__Group__1__Impl2901);
            rule__Field__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1444:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1448:1: ( rule__Field__Group__2__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1449:2: rule__Field__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__22931);
            rule__Field__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1455:1: rule__Field__Group__2__Impl : ( ( rule__Field__RequiredAssignment_2 )? ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1459:1: ( ( ( rule__Field__RequiredAssignment_2 )? ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1460:1: ( ( rule__Field__RequiredAssignment_2 )? )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1460:1: ( ( rule__Field__RequiredAssignment_2 )? )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1461:1: ( rule__Field__RequiredAssignment_2 )?
            {
             before(grammarAccess.getFieldAccess().getRequiredAssignment_2()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1462:1: ( rule__Field__RequiredAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1462:2: rule__Field__RequiredAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Field__RequiredAssignment_2_in_rule__Field__Group__2__Impl2958);
                    rule__Field__RequiredAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getRequiredAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Domain__ElementsAssignment"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1479:1: rule__Domain__ElementsAssignment : ( ruleDomainElement ) ;
    public final void rule__Domain__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1483:1: ( ( ruleDomainElement ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1484:1: ( ruleDomainElement )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1484:1: ( ruleDomainElement )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1485:1: ruleDomainElement
            {
             before(grammarAccess.getDomainAccess().getElementsDomainElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDomainElement_in_rule__Domain__ElementsAssignment3000);
            ruleDomainElement();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getElementsDomainElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__ElementsAssignment"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1494:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1498:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1499:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1499:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1500:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_13031); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__FieldsAssignment_2_1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1509:1: rule__Entity__FieldsAssignment_2_1 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1513:1: ( ( ruleField ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1514:1: ( ruleField )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1514:1: ( ruleField )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1515:1: ruleField
            {
             before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__Entity__FieldsAssignment_2_13062);
            ruleField();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FieldsAssignment_2_1"


    // $ANTLR start "rule__Relation__TypeAssignment_1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1524:1: rule__Relation__TypeAssignment_1 : ( ruleRelationType ) ;
    public final void rule__Relation__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1528:1: ( ( ruleRelationType ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1529:1: ( ruleRelationType )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1529:1: ( ruleRelationType )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1530:1: ruleRelationType
            {
             before(grammarAccess.getRelationAccess().getTypeRelationTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRelationType_in_rule__Relation__TypeAssignment_13093);
            ruleRelationType();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getTypeRelationTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__TypeAssignment_1"


    // $ANTLR start "rule__Relation__FromAssignment_3"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1539:1: rule__Relation__FromAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1543:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1544:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1544:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1545:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getFromEntityCrossReference_3_0()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1546:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1547:1: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getFromEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relation__FromAssignment_33128); 
             after(grammarAccess.getRelationAccess().getFromEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getFromEntityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__FromAssignment_3"


    // $ANTLR start "rule__Relation__FromRelationAssignment_4_1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1558:1: rule__Relation__FromRelationAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Relation__FromRelationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1562:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1563:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1563:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1564:1: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getFromRelationIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relation__FromRelationAssignment_4_13163); 
             after(grammarAccess.getRelationAccess().getFromRelationIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__FromRelationAssignment_4_1"


    // $ANTLR start "rule__Relation__ToAssignment_6"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1573:1: rule__Relation__ToAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__ToAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1577:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1578:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1578:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1579:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getToEntityCrossReference_6_0()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1580:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1581:1: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getToEntityIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relation__ToAssignment_63198); 
             after(grammarAccess.getRelationAccess().getToEntityIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getToEntityCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__ToAssignment_6"


    // $ANTLR start "rule__Relation__ToRelationAssignment_7_1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1592:1: rule__Relation__ToRelationAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__Relation__ToRelationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1596:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1597:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1597:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1598:1: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getToRelationIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relation__ToRelationAssignment_7_13233); 
             after(grammarAccess.getRelationAccess().getToRelationIDTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__ToRelationAssignment_7_1"


    // $ANTLR start "rule__Enum__NameAssignment_1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1607:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1611:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1612:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1612:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1613:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_13264); 
             after(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__NameAssignment_1"


    // $ANTLR start "rule__Enum__LiteralsAssignment_3"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1622:1: rule__Enum__LiteralsAssignment_3 : ( RULE_ID ) ;
    public final void rule__Enum__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1626:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1627:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1627:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1628:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getLiteralsIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__LiteralsAssignment_33295); 
             after(grammarAccess.getEnumAccess().getLiteralsIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__LiteralsAssignment_3"


    // $ANTLR start "rule__Enum__LiteralsAssignment_4_1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1637:1: rule__Enum__LiteralsAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Enum__LiteralsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1641:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1642:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1642:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1643:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getLiteralsIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__LiteralsAssignment_4_13326); 
             after(grammarAccess.getEnumAccess().getLiteralsIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__LiteralsAssignment_4_1"


    // $ANTLR start "rule__Field__NameAssignment_0"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1652:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1656:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1657:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1657:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1658:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_03357); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_0"


    // $ANTLR start "rule__Field__TypeAssignment_1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1667:1: rule__Field__TypeAssignment_1 : ( ruleHdlType ) ;
    public final void rule__Field__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1671:1: ( ( ruleHdlType ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1672:1: ( ruleHdlType )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1672:1: ( ruleHdlType )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1673:1: ruleHdlType
            {
             before(grammarAccess.getFieldAccess().getTypeHdlTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleHdlType_in_rule__Field__TypeAssignment_13388);
            ruleHdlType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypeHdlTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__TypeAssignment_1"


    // $ANTLR start "rule__Field__RequiredAssignment_2"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1682:1: rule__Field__RequiredAssignment_2 : ( ( 'required' ) ) ;
    public final void rule__Field__RequiredAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1686:1: ( ( ( 'required' ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1687:1: ( ( 'required' ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1687:1: ( ( 'required' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1688:1: ( 'required' )
            {
             before(grammarAccess.getFieldAccess().getRequiredRequiredKeyword_2_0()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1689:1: ( 'required' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1690:1: 'required'
            {
             before(grammarAccess.getFieldAccess().getRequiredRequiredKeyword_2_0()); 
            match(input,32,FOLLOW_32_in_rule__Field__RequiredAssignment_23424); 
             after(grammarAccess.getFieldAccess().getRequiredRequiredKeyword_2_0()); 

            }

             after(grammarAccess.getFieldAccess().getRequiredRequiredKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__RequiredAssignment_2"


    // $ANTLR start "rule__HdlType__EnumTypeAssignment_0"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1705:1: rule__HdlType__EnumTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__HdlType__EnumTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1709:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1710:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1710:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1711:1: ( RULE_ID )
            {
             before(grammarAccess.getHdlTypeAccess().getEnumTypeEnumCrossReference_0_0()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1712:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1713:1: RULE_ID
            {
             before(grammarAccess.getHdlTypeAccess().getEnumTypeEnumIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HdlType__EnumTypeAssignment_03467); 
             after(grammarAccess.getHdlTypeAccess().getEnumTypeEnumIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getHdlTypeAccess().getEnumTypeEnumCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HdlType__EnumTypeAssignment_0"


    // $ANTLR start "rule__HdlType__PrimitiveTypeAssignment_1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1724:1: rule__HdlType__PrimitiveTypeAssignment_1 : ( ruleJHipsterType ) ;
    public final void rule__HdlType__PrimitiveTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1728:1: ( ( ruleJHipsterType ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1729:1: ( ruleJHipsterType )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1729:1: ( ruleJHipsterType )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1730:1: ruleJHipsterType
            {
             before(grammarAccess.getHdlTypeAccess().getPrimitiveTypeJHipsterTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJHipsterType_in_rule__HdlType__PrimitiveTypeAssignment_13502);
            ruleJHipsterType();

            state._fsp--;

             after(grammarAccess.getHdlTypeAccess().getPrimitiveTypeJHipsterTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HdlType__PrimitiveTypeAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__ElementsAssignment_in_ruleDomain94 = new BitSet(new long[]{0x0000000052000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_entryRuleDomainElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Alternatives_in_ruleDomainElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelation249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__0_in_ruleRelation275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHdlType_in_entryRuleHdlType422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHdlType429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HdlType__Alternatives_in_ruleHdlType455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationType__Alternatives_in_ruleRelationType492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JHipsterType__Alternatives_in_ruleJHipsterType528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__DomainElement__Alternatives563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_rule__DomainElement__Alternatives580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__DomainElement__Alternatives597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HdlType__EnumTypeAssignment_0_in_rule__HdlType__Alternatives629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HdlType__PrimitiveTypeAssignment_1_in_rule__HdlType__Alternatives647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__RelationType__Alternatives681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RelationType__Alternatives702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RelationType__Alternatives723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RelationType__Alternatives744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__JHipsterType__Alternatives780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__JHipsterType__Alternatives801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__JHipsterType__Alternatives822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__JHipsterType__Alternatives843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__JHipsterType__Alternatives864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__JHipsterType__Alternatives885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__JHipsterType__Alternatives906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__JHipsterType__Alternatives927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__JHipsterType__Alternatives948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__JHipsterType__Alternatives969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Entity__Group__0__Impl1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11064 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__01187 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Entity__Group_2__0__Impl1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__11249 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__2_in_rule__Entity__Group_2__11252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FieldsAssignment_2_1_in_rule__Entity__Group_2__1__Impl1279 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__2__Impl_in_rule__Entity__Group_2__21310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Entity__Group_2__2__Impl1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__0__Impl_in_rule__Relation__Group__01375 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__Relation__Group__1_in_rule__Relation__Group__01378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Relation__Group__0__Impl1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__1__Impl_in_rule__Relation__Group__11437 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__2_in_rule__Relation__Group__11440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__TypeAssignment_1_in_rule__Relation__Group__1__Impl1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__2__Impl_in_rule__Relation__Group__21497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relation__Group__3_in_rule__Relation__Group__21500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Relation__Group__2__Impl1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__3__Impl_in_rule__Relation__Group__31559 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__4_in_rule__Relation__Group__31562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__FromAssignment_3_in_rule__Relation__Group__3__Impl1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__4__Impl_in_rule__Relation__Group__41619 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__5_in_rule__Relation__Group__41622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__0_in_rule__Relation__Group__4__Impl1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__5__Impl_in_rule__Relation__Group__51679 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relation__Group__6_in_rule__Relation__Group__51682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Relation__Group__5__Impl1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__6__Impl_in_rule__Relation__Group__61741 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__7_in_rule__Relation__Group__61744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__ToAssignment_6_in_rule__Relation__Group__6__Impl1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__7__Impl_in_rule__Relation__Group__71801 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__8_in_rule__Relation__Group__71804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__0_in_rule__Relation__Group__7__Impl1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__8__Impl_in_rule__Relation__Group__81861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Relation__Group__8__Impl1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__0__Impl_in_rule__Relation__Group_4__01938 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__1_in_rule__Relation__Group_4__01941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Relation__Group_4__0__Impl1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__1__Impl_in_rule__Relation__Group_4__12000 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__2_in_rule__Relation__Group_4__12003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__FromRelationAssignment_4_1_in_rule__Relation__Group_4__1__Impl2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__2__Impl_in_rule__Relation__Group_4__22060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Relation__Group_4__2__Impl2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__0__Impl_in_rule__Relation__Group_7__02125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__1_in_rule__Relation__Group_7__02128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Relation__Group_7__0__Impl2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__1__Impl_in_rule__Relation__Group_7__12187 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__2_in_rule__Relation__Group_7__12190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__ToRelationAssignment_7_1_in_rule__Relation__Group_7__1__Impl2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__2__Impl_in_rule__Relation__Group_7__22247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Relation__Group_7__2__Impl2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__02312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__02315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Enum__Group__0__Impl2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__12374 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__12377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__22434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__22437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Enum__Group__2__Impl2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__32496 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__32499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__LiteralsAssignment_3_in_rule__Enum__Group__3__Impl2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__42556 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__42559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_4__0_in_rule__Enum__Group__4__Impl2586 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__52617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Enum__Group__5__Impl2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_4__0__Impl_in_rule__Enum__Group_4__02688 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group_4__1_in_rule__Enum__Group_4__02691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Enum__Group_4__0__Impl2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_4__1__Impl_in_rule__Enum__Group_4__12750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__LiteralsAssignment_4_1_in_rule__Enum__Group_4__1__Impl2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__02811 = new BitSet(new long[]{0x0000000001FF8010L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__02814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__12871 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__12874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypeAssignment_1_in_rule__Field__Group__1__Impl2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__22931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__RequiredAssignment_2_in_rule__Field__Group__2__Impl2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_rule__Domain__ElementsAssignment3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_13031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Entity__FieldsAssignment_2_13062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationType_in_rule__Relation__TypeAssignment_13093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relation__FromAssignment_33128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relation__FromRelationAssignment_4_13163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relation__ToAssignment_63198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relation__ToRelationAssignment_7_13233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_13264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__LiteralsAssignment_33295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__LiteralsAssignment_4_13326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_03357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHdlType_in_rule__Field__TypeAssignment_13388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Field__RequiredAssignment_23424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HdlType__EnumTypeAssignment_03467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJHipsterType_in_rule__HdlType__PrimitiveTypeAssignment_13502 = new BitSet(new long[]{0x0000000000000002L});

}
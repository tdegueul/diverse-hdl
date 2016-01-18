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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'OneToMany'", "'ManyToOne'", "'OneToOne'", "'ManyToMany'", "'String'", "'Integer'", "'Long'", "'BigDecimal'", "'Float'", "'Double'", "'Enum'", "'Boolean'", "'LocalDate'", "'ZoneDateTime'", "'entity'", "'{'", "'}'", "'relationship'", "'to'", "'required'"
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

                if ( (LA1_0==25||LA1_0==28) ) {
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


    // $ANTLR start "entryRuleField"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:172:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:173:1: ( ruleField EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:174:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField302);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField309); 

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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:181:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:185:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:186:1: ( ( rule__Field__Group__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:186:1: ( ( rule__Field__Group__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:187:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:188:1: ( rule__Field__Group__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:188:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField335);
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


    // $ANTLR start "ruleRelationType"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:201:1: ruleRelationType : ( ( rule__RelationType__Alternatives ) ) ;
    public final void ruleRelationType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:205:1: ( ( ( rule__RelationType__Alternatives ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:206:1: ( ( rule__RelationType__Alternatives ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:206:1: ( ( rule__RelationType__Alternatives ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:207:1: ( rule__RelationType__Alternatives )
            {
             before(grammarAccess.getRelationTypeAccess().getAlternatives()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:208:1: ( rule__RelationType__Alternatives )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:208:2: rule__RelationType__Alternatives
            {
            pushFollow(FOLLOW_rule__RelationType__Alternatives_in_ruleRelationType372);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:220:1: ruleJHipsterType : ( ( rule__JHipsterType__Alternatives ) ) ;
    public final void ruleJHipsterType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:224:1: ( ( ( rule__JHipsterType__Alternatives ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:225:1: ( ( rule__JHipsterType__Alternatives ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:225:1: ( ( rule__JHipsterType__Alternatives ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:226:1: ( rule__JHipsterType__Alternatives )
            {
             before(grammarAccess.getJHipsterTypeAccess().getAlternatives()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:227:1: ( rule__JHipsterType__Alternatives )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:227:2: rule__JHipsterType__Alternatives
            {
            pushFollow(FOLLOW_rule__JHipsterType__Alternatives_in_ruleJHipsterType408);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:238:1: rule__DomainElement__Alternatives : ( ( ruleEntity ) | ( ruleRelation ) );
    public final void rule__DomainElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:242:1: ( ( ruleEntity ) | ( ruleRelation ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==25) ) {
                alt2=1;
            }
            else if ( (LA2_0==28) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:243:1: ( ruleEntity )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:243:1: ( ruleEntity )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:244:1: ruleEntity
                    {
                     before(grammarAccess.getDomainElementAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__DomainElement__Alternatives443);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getDomainElementAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:249:6: ( ruleRelation )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:249:6: ( ruleRelation )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:250:1: ruleRelation
                    {
                     before(grammarAccess.getDomainElementAccess().getRelationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRelation_in_rule__DomainElement__Alternatives460);
                    ruleRelation();

                    state._fsp--;

                     after(grammarAccess.getDomainElementAccess().getRelationParserRuleCall_1()); 

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


    // $ANTLR start "rule__RelationType__Alternatives"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:260:1: rule__RelationType__Alternatives : ( ( ( 'OneToMany' ) ) | ( ( 'ManyToOne' ) ) | ( ( 'OneToOne' ) ) | ( ( 'ManyToMany' ) ) );
    public final void rule__RelationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:264:1: ( ( ( 'OneToMany' ) ) | ( ( 'ManyToOne' ) ) | ( ( 'OneToOne' ) ) | ( ( 'ManyToMany' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:265:1: ( ( 'OneToMany' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:265:1: ( ( 'OneToMany' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:266:1: ( 'OneToMany' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getONE_TO_MANYEnumLiteralDeclaration_0()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:267:1: ( 'OneToMany' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:267:3: 'OneToMany'
                    {
                    match(input,11,FOLLOW_11_in_rule__RelationType__Alternatives493); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getONE_TO_MANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:272:6: ( ( 'ManyToOne' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:272:6: ( ( 'ManyToOne' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:273:1: ( 'ManyToOne' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getMANY_TO_ONEEnumLiteralDeclaration_1()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:274:1: ( 'ManyToOne' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:274:3: 'ManyToOne'
                    {
                    match(input,12,FOLLOW_12_in_rule__RelationType__Alternatives514); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getMANY_TO_ONEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:279:6: ( ( 'OneToOne' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:279:6: ( ( 'OneToOne' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:280:1: ( 'OneToOne' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getONE_TO_ONEEnumLiteralDeclaration_2()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:281:1: ( 'OneToOne' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:281:3: 'OneToOne'
                    {
                    match(input,13,FOLLOW_13_in_rule__RelationType__Alternatives535); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getONE_TO_ONEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:286:6: ( ( 'ManyToMany' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:286:6: ( ( 'ManyToMany' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:287:1: ( 'ManyToMany' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getMANY_TO_MANYEnumLiteralDeclaration_3()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:288:1: ( 'ManyToMany' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:288:3: 'ManyToMany'
                    {
                    match(input,14,FOLLOW_14_in_rule__RelationType__Alternatives556); 

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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:298:1: rule__JHipsterType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Long' ) ) | ( ( 'BigDecimal' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'Enum' ) ) | ( ( 'Boolean' ) ) | ( ( 'LocalDate' ) ) | ( ( 'ZoneDateTime' ) ) );
    public final void rule__JHipsterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:302:1: ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Long' ) ) | ( ( 'BigDecimal' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'Enum' ) ) | ( ( 'Boolean' ) ) | ( ( 'LocalDate' ) ) | ( ( 'ZoneDateTime' ) ) )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            case 19:
                {
                alt4=5;
                }
                break;
            case 20:
                {
                alt4=6;
                }
                break;
            case 21:
                {
                alt4=7;
                }
                break;
            case 22:
                {
                alt4=8;
                }
                break;
            case 23:
                {
                alt4=9;
                }
                break;
            case 24:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:303:1: ( ( 'String' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:303:1: ( ( 'String' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:304:1: ( 'String' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:305:1: ( 'String' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:305:3: 'String'
                    {
                    match(input,15,FOLLOW_15_in_rule__JHipsterType__Alternatives592); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:310:6: ( ( 'Integer' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:310:6: ( ( 'Integer' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:311:1: ( 'Integer' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:312:1: ( 'Integer' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:312:3: 'Integer'
                    {
                    match(input,16,FOLLOW_16_in_rule__JHipsterType__Alternatives613); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:317:6: ( ( 'Long' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:317:6: ( ( 'Long' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:318:1: ( 'Long' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getLONGEnumLiteralDeclaration_2()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:319:1: ( 'Long' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:319:3: 'Long'
                    {
                    match(input,17,FOLLOW_17_in_rule__JHipsterType__Alternatives634); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getLONGEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:324:6: ( ( 'BigDecimal' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:324:6: ( ( 'BigDecimal' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:325:1: ( 'BigDecimal' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_3()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:326:1: ( 'BigDecimal' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:326:3: 'BigDecimal'
                    {
                    match(input,18,FOLLOW_18_in_rule__JHipsterType__Alternatives655); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:331:6: ( ( 'Float' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:331:6: ( ( 'Float' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:332:1: ( 'Float' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:333:1: ( 'Float' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:333:3: 'Float'
                    {
                    match(input,19,FOLLOW_19_in_rule__JHipsterType__Alternatives676); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getFLOATEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:338:6: ( ( 'Double' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:338:6: ( ( 'Double' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:339:1: ( 'Double' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:340:1: ( 'Double' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:340:3: 'Double'
                    {
                    match(input,20,FOLLOW_20_in_rule__JHipsterType__Alternatives697); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:345:6: ( ( 'Enum' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:345:6: ( ( 'Enum' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:346:1: ( 'Enum' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getENUMEnumLiteralDeclaration_6()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:347:1: ( 'Enum' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:347:3: 'Enum'
                    {
                    match(input,21,FOLLOW_21_in_rule__JHipsterType__Alternatives718); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getENUMEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:352:6: ( ( 'Boolean' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:352:6: ( ( 'Boolean' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:353:1: ( 'Boolean' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getBOOLEANEnumLiteralDeclaration_7()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:354:1: ( 'Boolean' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:354:3: 'Boolean'
                    {
                    match(input,22,FOLLOW_22_in_rule__JHipsterType__Alternatives739); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getBOOLEANEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:359:6: ( ( 'LocalDate' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:359:6: ( ( 'LocalDate' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:360:1: ( 'LocalDate' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_8()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:361:1: ( 'LocalDate' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:361:3: 'LocalDate'
                    {
                    match(input,23,FOLLOW_23_in_rule__JHipsterType__Alternatives760); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:366:6: ( ( 'ZoneDateTime' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:366:6: ( ( 'ZoneDateTime' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:367:1: ( 'ZoneDateTime' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getZONE_DATE_TIMEEnumLiteralDeclaration_9()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:368:1: ( 'ZoneDateTime' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:368:3: 'ZoneDateTime'
                    {
                    match(input,24,FOLLOW_24_in_rule__JHipsterType__Alternatives781); 

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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:380:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:384:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:385:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0814);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0817);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:392:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:396:1: ( ( 'entity' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:397:1: ( 'entity' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:397:1: ( 'entity' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:398:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Entity__Group__0__Impl845); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:411:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:415:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:416:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1876);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1879);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:423:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:427:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:428:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:428:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:429:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:430:1: ( rule__Entity__NameAssignment_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:430:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl906);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:440:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:444:1: ( rule__Entity__Group__2__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:445:2: rule__Entity__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__2936);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:451:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:455:1: ( ( ( rule__Entity__Group_2__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:456:1: ( ( rule__Entity__Group_2__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:456:1: ( ( rule__Entity__Group_2__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:457:1: ( rule__Entity__Group_2__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:458:1: ( rule__Entity__Group_2__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:458:2: rule__Entity__Group_2__0
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl963);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:474:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:478:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:479:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__0999);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01002);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:486:1: rule__Entity__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:490:1: ( ( '{' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:491:1: ( '{' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:491:1: ( '{' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:492:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Entity__Group_2__0__Impl1030); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:505:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:509:1: ( rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:510:2: rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__11061);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__2_in_rule__Entity__Group_2__11064);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:517:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__FieldsAssignment_2_1 )* ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:521:1: ( ( ( rule__Entity__FieldsAssignment_2_1 )* ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:522:1: ( ( rule__Entity__FieldsAssignment_2_1 )* )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:522:1: ( ( rule__Entity__FieldsAssignment_2_1 )* )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:523:1: ( rule__Entity__FieldsAssignment_2_1 )*
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_2_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:524:1: ( rule__Entity__FieldsAssignment_2_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:524:2: rule__Entity__FieldsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FieldsAssignment_2_1_in_rule__Entity__Group_2__1__Impl1091);
            	    rule__Entity__FieldsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:534:1: rule__Entity__Group_2__2 : rule__Entity__Group_2__2__Impl ;
    public final void rule__Entity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:538:1: ( rule__Entity__Group_2__2__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:539:2: rule__Entity__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__2__Impl_in_rule__Entity__Group_2__21122);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:545:1: rule__Entity__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Entity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:549:1: ( ( '}' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:550:1: ( '}' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:550:1: ( '}' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:551:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,27,FOLLOW_27_in_rule__Entity__Group_2__2__Impl1150); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:570:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:574:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:575:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_rule__Relation__Group__0__Impl_in_rule__Relation__Group__01187);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__1_in_rule__Relation__Group__01190);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:582:1: rule__Relation__Group__0__Impl : ( 'relationship' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:586:1: ( ( 'relationship' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:587:1: ( 'relationship' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:587:1: ( 'relationship' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:588:1: 'relationship'
            {
             before(grammarAccess.getRelationAccess().getRelationshipKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Relation__Group__0__Impl1218); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:601:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:605:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:606:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_rule__Relation__Group__1__Impl_in_rule__Relation__Group__11249);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__2_in_rule__Relation__Group__11252);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:613:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__TypeAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:617:1: ( ( ( rule__Relation__TypeAssignment_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:618:1: ( ( rule__Relation__TypeAssignment_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:618:1: ( ( rule__Relation__TypeAssignment_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:619:1: ( rule__Relation__TypeAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getTypeAssignment_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:620:1: ( rule__Relation__TypeAssignment_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:620:2: rule__Relation__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Relation__TypeAssignment_1_in_rule__Relation__Group__1__Impl1279);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:630:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:634:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:635:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_rule__Relation__Group__2__Impl_in_rule__Relation__Group__21309);
            rule__Relation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__3_in_rule__Relation__Group__21312);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:642:1: rule__Relation__Group__2__Impl : ( '{' ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:646:1: ( ( '{' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:647:1: ( '{' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:647:1: ( '{' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:648:1: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Relation__Group__2__Impl1340); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:661:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:665:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:666:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
            {
            pushFollow(FOLLOW_rule__Relation__Group__3__Impl_in_rule__Relation__Group__31371);
            rule__Relation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__4_in_rule__Relation__Group__31374);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:673:1: rule__Relation__Group__3__Impl : ( ( rule__Relation__FromAssignment_3 ) ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:677:1: ( ( ( rule__Relation__FromAssignment_3 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:678:1: ( ( rule__Relation__FromAssignment_3 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:678:1: ( ( rule__Relation__FromAssignment_3 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:679:1: ( rule__Relation__FromAssignment_3 )
            {
             before(grammarAccess.getRelationAccess().getFromAssignment_3()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:680:1: ( rule__Relation__FromAssignment_3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:680:2: rule__Relation__FromAssignment_3
            {
            pushFollow(FOLLOW_rule__Relation__FromAssignment_3_in_rule__Relation__Group__3__Impl1401);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:690:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:694:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:695:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
            {
            pushFollow(FOLLOW_rule__Relation__Group__4__Impl_in_rule__Relation__Group__41431);
            rule__Relation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__5_in_rule__Relation__Group__41434);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:702:1: rule__Relation__Group__4__Impl : ( ( rule__Relation__Group_4__0 ) ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:706:1: ( ( ( rule__Relation__Group_4__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:707:1: ( ( rule__Relation__Group_4__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:707:1: ( ( rule__Relation__Group_4__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:708:1: ( rule__Relation__Group_4__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup_4()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:709:1: ( rule__Relation__Group_4__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:709:2: rule__Relation__Group_4__0
            {
            pushFollow(FOLLOW_rule__Relation__Group_4__0_in_rule__Relation__Group__4__Impl1461);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:719:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl rule__Relation__Group__6 ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:723:1: ( rule__Relation__Group__5__Impl rule__Relation__Group__6 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:724:2: rule__Relation__Group__5__Impl rule__Relation__Group__6
            {
            pushFollow(FOLLOW_rule__Relation__Group__5__Impl_in_rule__Relation__Group__51491);
            rule__Relation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__6_in_rule__Relation__Group__51494);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:731:1: rule__Relation__Group__5__Impl : ( 'to' ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:735:1: ( ( 'to' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:736:1: ( 'to' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:736:1: ( 'to' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:737:1: 'to'
            {
             before(grammarAccess.getRelationAccess().getToKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__Relation__Group__5__Impl1522); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:750:1: rule__Relation__Group__6 : rule__Relation__Group__6__Impl rule__Relation__Group__7 ;
    public final void rule__Relation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:754:1: ( rule__Relation__Group__6__Impl rule__Relation__Group__7 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:755:2: rule__Relation__Group__6__Impl rule__Relation__Group__7
            {
            pushFollow(FOLLOW_rule__Relation__Group__6__Impl_in_rule__Relation__Group__61553);
            rule__Relation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__7_in_rule__Relation__Group__61556);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:762:1: rule__Relation__Group__6__Impl : ( ( rule__Relation__ToAssignment_6 ) ) ;
    public final void rule__Relation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:766:1: ( ( ( rule__Relation__ToAssignment_6 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:767:1: ( ( rule__Relation__ToAssignment_6 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:767:1: ( ( rule__Relation__ToAssignment_6 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:768:1: ( rule__Relation__ToAssignment_6 )
            {
             before(grammarAccess.getRelationAccess().getToAssignment_6()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:769:1: ( rule__Relation__ToAssignment_6 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:769:2: rule__Relation__ToAssignment_6
            {
            pushFollow(FOLLOW_rule__Relation__ToAssignment_6_in_rule__Relation__Group__6__Impl1583);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:779:1: rule__Relation__Group__7 : rule__Relation__Group__7__Impl rule__Relation__Group__8 ;
    public final void rule__Relation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:783:1: ( rule__Relation__Group__7__Impl rule__Relation__Group__8 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:784:2: rule__Relation__Group__7__Impl rule__Relation__Group__8
            {
            pushFollow(FOLLOW_rule__Relation__Group__7__Impl_in_rule__Relation__Group__71613);
            rule__Relation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__8_in_rule__Relation__Group__71616);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:791:1: rule__Relation__Group__7__Impl : ( ( rule__Relation__Group_7__0 ) ) ;
    public final void rule__Relation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:795:1: ( ( ( rule__Relation__Group_7__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:796:1: ( ( rule__Relation__Group_7__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:796:1: ( ( rule__Relation__Group_7__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:797:1: ( rule__Relation__Group_7__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup_7()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:798:1: ( rule__Relation__Group_7__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:798:2: rule__Relation__Group_7__0
            {
            pushFollow(FOLLOW_rule__Relation__Group_7__0_in_rule__Relation__Group__7__Impl1643);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:808:1: rule__Relation__Group__8 : rule__Relation__Group__8__Impl ;
    public final void rule__Relation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:812:1: ( rule__Relation__Group__8__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:813:2: rule__Relation__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group__8__Impl_in_rule__Relation__Group__81673);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:819:1: rule__Relation__Group__8__Impl : ( '}' ) ;
    public final void rule__Relation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:823:1: ( ( '}' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:824:1: ( '}' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:824:1: ( '}' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:825:1: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_27_in_rule__Relation__Group__8__Impl1701); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:856:1: rule__Relation__Group_4__0 : rule__Relation__Group_4__0__Impl rule__Relation__Group_4__1 ;
    public final void rule__Relation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:860:1: ( rule__Relation__Group_4__0__Impl rule__Relation__Group_4__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:861:2: rule__Relation__Group_4__0__Impl rule__Relation__Group_4__1
            {
            pushFollow(FOLLOW_rule__Relation__Group_4__0__Impl_in_rule__Relation__Group_4__01750);
            rule__Relation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_4__1_in_rule__Relation__Group_4__01753);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:868:1: rule__Relation__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Relation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:872:1: ( ( '{' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:873:1: ( '{' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:873:1: ( '{' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:874:1: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,26,FOLLOW_26_in_rule__Relation__Group_4__0__Impl1781); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:887:1: rule__Relation__Group_4__1 : rule__Relation__Group_4__1__Impl rule__Relation__Group_4__2 ;
    public final void rule__Relation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:891:1: ( rule__Relation__Group_4__1__Impl rule__Relation__Group_4__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:892:2: rule__Relation__Group_4__1__Impl rule__Relation__Group_4__2
            {
            pushFollow(FOLLOW_rule__Relation__Group_4__1__Impl_in_rule__Relation__Group_4__11812);
            rule__Relation__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_4__2_in_rule__Relation__Group_4__11815);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:899:1: rule__Relation__Group_4__1__Impl : ( ( rule__Relation__FromRelationAssignment_4_1 ) ) ;
    public final void rule__Relation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:903:1: ( ( ( rule__Relation__FromRelationAssignment_4_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:904:1: ( ( rule__Relation__FromRelationAssignment_4_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:904:1: ( ( rule__Relation__FromRelationAssignment_4_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:905:1: ( rule__Relation__FromRelationAssignment_4_1 )
            {
             before(grammarAccess.getRelationAccess().getFromRelationAssignment_4_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:906:1: ( rule__Relation__FromRelationAssignment_4_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:906:2: rule__Relation__FromRelationAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Relation__FromRelationAssignment_4_1_in_rule__Relation__Group_4__1__Impl1842);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:916:1: rule__Relation__Group_4__2 : rule__Relation__Group_4__2__Impl ;
    public final void rule__Relation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:920:1: ( rule__Relation__Group_4__2__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:921:2: rule__Relation__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_4__2__Impl_in_rule__Relation__Group_4__21872);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:927:1: rule__Relation__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Relation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:931:1: ( ( '}' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:932:1: ( '}' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:932:1: ( '}' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:933:1: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,27,FOLLOW_27_in_rule__Relation__Group_4__2__Impl1900); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:952:1: rule__Relation__Group_7__0 : rule__Relation__Group_7__0__Impl rule__Relation__Group_7__1 ;
    public final void rule__Relation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:956:1: ( rule__Relation__Group_7__0__Impl rule__Relation__Group_7__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:957:2: rule__Relation__Group_7__0__Impl rule__Relation__Group_7__1
            {
            pushFollow(FOLLOW_rule__Relation__Group_7__0__Impl_in_rule__Relation__Group_7__01937);
            rule__Relation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_7__1_in_rule__Relation__Group_7__01940);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:964:1: rule__Relation__Group_7__0__Impl : ( '{' ) ;
    public final void rule__Relation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:968:1: ( ( '{' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:969:1: ( '{' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:969:1: ( '{' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:970:1: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_7_0()); 
            match(input,26,FOLLOW_26_in_rule__Relation__Group_7__0__Impl1968); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:983:1: rule__Relation__Group_7__1 : rule__Relation__Group_7__1__Impl rule__Relation__Group_7__2 ;
    public final void rule__Relation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:987:1: ( rule__Relation__Group_7__1__Impl rule__Relation__Group_7__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:988:2: rule__Relation__Group_7__1__Impl rule__Relation__Group_7__2
            {
            pushFollow(FOLLOW_rule__Relation__Group_7__1__Impl_in_rule__Relation__Group_7__11999);
            rule__Relation__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_7__2_in_rule__Relation__Group_7__12002);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:995:1: rule__Relation__Group_7__1__Impl : ( ( rule__Relation__ToRelationAssignment_7_1 ) ) ;
    public final void rule__Relation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:999:1: ( ( ( rule__Relation__ToRelationAssignment_7_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1000:1: ( ( rule__Relation__ToRelationAssignment_7_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1000:1: ( ( rule__Relation__ToRelationAssignment_7_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1001:1: ( rule__Relation__ToRelationAssignment_7_1 )
            {
             before(grammarAccess.getRelationAccess().getToRelationAssignment_7_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1002:1: ( rule__Relation__ToRelationAssignment_7_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1002:2: rule__Relation__ToRelationAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Relation__ToRelationAssignment_7_1_in_rule__Relation__Group_7__1__Impl2029);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1012:1: rule__Relation__Group_7__2 : rule__Relation__Group_7__2__Impl ;
    public final void rule__Relation__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1016:1: ( rule__Relation__Group_7__2__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1017:2: rule__Relation__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_7__2__Impl_in_rule__Relation__Group_7__22059);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1023:1: rule__Relation__Group_7__2__Impl : ( '}' ) ;
    public final void rule__Relation__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1027:1: ( ( '}' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1028:1: ( '}' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1028:1: ( '}' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1029:1: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_7_2()); 
            match(input,27,FOLLOW_27_in_rule__Relation__Group_7__2__Impl2087); 
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


    // $ANTLR start "rule__Field__Group__0"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1048:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1052:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1053:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__02124);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__02127);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1060:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1064:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1065:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1065:1: ( ( rule__Field__NameAssignment_0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1066:1: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1067:1: ( rule__Field__NameAssignment_0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1067:2: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl2154);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1077:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1081:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1082:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__12184);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__12187);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1089:1: rule__Field__Group__1__Impl : ( ( rule__Field__TypeAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1093:1: ( ( ( rule__Field__TypeAssignment_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1094:1: ( ( rule__Field__TypeAssignment_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1094:1: ( ( rule__Field__TypeAssignment_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1095:1: ( rule__Field__TypeAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1096:1: ( rule__Field__TypeAssignment_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1096:2: rule__Field__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__TypeAssignment_1_in_rule__Field__Group__1__Impl2214);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1106:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1110:1: ( rule__Field__Group__2__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1111:2: rule__Field__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__22244);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1117:1: rule__Field__Group__2__Impl : ( ( rule__Field__RequiredAssignment_2 )? ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1121:1: ( ( ( rule__Field__RequiredAssignment_2 )? ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1122:1: ( ( rule__Field__RequiredAssignment_2 )? )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1122:1: ( ( rule__Field__RequiredAssignment_2 )? )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1123:1: ( rule__Field__RequiredAssignment_2 )?
            {
             before(grammarAccess.getFieldAccess().getRequiredAssignment_2()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1124:1: ( rule__Field__RequiredAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1124:2: rule__Field__RequiredAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Field__RequiredAssignment_2_in_rule__Field__Group__2__Impl2271);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1141:1: rule__Domain__ElementsAssignment : ( ruleDomainElement ) ;
    public final void rule__Domain__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1145:1: ( ( ruleDomainElement ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1146:1: ( ruleDomainElement )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1146:1: ( ruleDomainElement )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1147:1: ruleDomainElement
            {
             before(grammarAccess.getDomainAccess().getElementsDomainElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDomainElement_in_rule__Domain__ElementsAssignment2313);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1156:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1160:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1161:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1161:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1162:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12344); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1171:1: rule__Entity__FieldsAssignment_2_1 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1175:1: ( ( ruleField ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1176:1: ( ruleField )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1176:1: ( ruleField )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1177:1: ruleField
            {
             before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__Entity__FieldsAssignment_2_12375);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1186:1: rule__Relation__TypeAssignment_1 : ( ruleRelationType ) ;
    public final void rule__Relation__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1190:1: ( ( ruleRelationType ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1191:1: ( ruleRelationType )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1191:1: ( ruleRelationType )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1192:1: ruleRelationType
            {
             before(grammarAccess.getRelationAccess().getTypeRelationTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRelationType_in_rule__Relation__TypeAssignment_12406);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1201:1: rule__Relation__FromAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1205:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1206:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1206:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1207:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getFromEntityCrossReference_3_0()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1208:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1209:1: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getFromEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relation__FromAssignment_32441); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1220:1: rule__Relation__FromRelationAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Relation__FromRelationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1224:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1225:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1225:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1226:1: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getFromRelationIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relation__FromRelationAssignment_4_12476); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1235:1: rule__Relation__ToAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__ToAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1239:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1240:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1240:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1241:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getToEntityCrossReference_6_0()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1242:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1243:1: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getToEntityIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relation__ToAssignment_62511); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1254:1: rule__Relation__ToRelationAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__Relation__ToRelationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1258:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1259:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1259:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1260:1: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getToRelationIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relation__ToRelationAssignment_7_12546); 
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


    // $ANTLR start "rule__Field__NameAssignment_0"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1269:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1273:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1274:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1274:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1275:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_02577); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1284:1: rule__Field__TypeAssignment_1 : ( ruleJHipsterType ) ;
    public final void rule__Field__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1288:1: ( ( ruleJHipsterType ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1289:1: ( ruleJHipsterType )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1289:1: ( ruleJHipsterType )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1290:1: ruleJHipsterType
            {
             before(grammarAccess.getFieldAccess().getTypeJHipsterTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJHipsterType_in_rule__Field__TypeAssignment_12608);
            ruleJHipsterType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypeJHipsterTypeEnumRuleCall_1_0()); 

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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1299:1: rule__Field__RequiredAssignment_2 : ( ( 'required' ) ) ;
    public final void rule__Field__RequiredAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1303:1: ( ( ( 'required' ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1304:1: ( ( 'required' ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1304:1: ( ( 'required' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1305:1: ( 'required' )
            {
             before(grammarAccess.getFieldAccess().getRequiredRequiredKeyword_2_0()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1306:1: ( 'required' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1307:1: 'required'
            {
             before(grammarAccess.getFieldAccess().getRequiredRequiredKeyword_2_0()); 
            match(input,30,FOLLOW_30_in_rule__Field__RequiredAssignment_22644); 
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__ElementsAssignment_in_ruleDomain94 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_entryRuleDomainElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainElement__Alternatives_in_ruleDomainElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelation249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__0_in_ruleRelation275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationType__Alternatives_in_ruleRelationType372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JHipsterType__Alternatives_in_ruleJHipsterType408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__DomainElement__Alternatives443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_rule__DomainElement__Alternatives460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__RelationType__Alternatives493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RelationType__Alternatives514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RelationType__Alternatives535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RelationType__Alternatives556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__JHipsterType__Alternatives592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__JHipsterType__Alternatives613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__JHipsterType__Alternatives634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__JHipsterType__Alternatives655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__JHipsterType__Alternatives676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__JHipsterType__Alternatives697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__JHipsterType__Alternatives718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__JHipsterType__Alternatives739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__JHipsterType__Alternatives760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__JHipsterType__Alternatives781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Entity__Group__0__Impl845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1876 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__0999 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Entity__Group_2__0__Impl1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__11061 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__2_in_rule__Entity__Group_2__11064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FieldsAssignment_2_1_in_rule__Entity__Group_2__1__Impl1091 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__2__Impl_in_rule__Entity__Group_2__21122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Entity__Group_2__2__Impl1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__0__Impl_in_rule__Relation__Group__01187 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__Relation__Group__1_in_rule__Relation__Group__01190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Relation__Group__0__Impl1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__1__Impl_in_rule__Relation__Group__11249 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__2_in_rule__Relation__Group__11252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__TypeAssignment_1_in_rule__Relation__Group__1__Impl1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__2__Impl_in_rule__Relation__Group__21309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relation__Group__3_in_rule__Relation__Group__21312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Relation__Group__2__Impl1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__3__Impl_in_rule__Relation__Group__31371 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__4_in_rule__Relation__Group__31374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__FromAssignment_3_in_rule__Relation__Group__3__Impl1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__4__Impl_in_rule__Relation__Group__41431 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__5_in_rule__Relation__Group__41434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__0_in_rule__Relation__Group__4__Impl1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__5__Impl_in_rule__Relation__Group__51491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relation__Group__6_in_rule__Relation__Group__51494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Relation__Group__5__Impl1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__6__Impl_in_rule__Relation__Group__61553 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__7_in_rule__Relation__Group__61556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__ToAssignment_6_in_rule__Relation__Group__6__Impl1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__7__Impl_in_rule__Relation__Group__71613 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__8_in_rule__Relation__Group__71616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__0_in_rule__Relation__Group__7__Impl1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__8__Impl_in_rule__Relation__Group__81673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Relation__Group__8__Impl1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__0__Impl_in_rule__Relation__Group_4__01750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__1_in_rule__Relation__Group_4__01753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Relation__Group_4__0__Impl1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__1__Impl_in_rule__Relation__Group_4__11812 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__2_in_rule__Relation__Group_4__11815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__FromRelationAssignment_4_1_in_rule__Relation__Group_4__1__Impl1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__2__Impl_in_rule__Relation__Group_4__21872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Relation__Group_4__2__Impl1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__0__Impl_in_rule__Relation__Group_7__01937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__1_in_rule__Relation__Group_7__01940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Relation__Group_7__0__Impl1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__1__Impl_in_rule__Relation__Group_7__11999 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__2_in_rule__Relation__Group_7__12002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__ToRelationAssignment_7_1_in_rule__Relation__Group_7__1__Impl2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__2__Impl_in_rule__Relation__Group_7__22059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Relation__Group_7__2__Impl2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__02124 = new BitSet(new long[]{0x0000000001FF8000L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__02127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__12184 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__12187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypeAssignment_1_in_rule__Field__Group__1__Impl2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__22244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__RequiredAssignment_2_in_rule__Field__Group__2__Impl2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_rule__Domain__ElementsAssignment2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Entity__FieldsAssignment_2_12375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationType_in_rule__Relation__TypeAssignment_12406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relation__FromAssignment_32441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relation__FromRelationAssignment_4_12476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relation__ToAssignment_62511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relation__ToRelationAssignment_7_12546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_02577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJHipsterType_in_rule__Field__TypeAssignment_12608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Field__RequiredAssignment_22644 = new BitSet(new long[]{0x0000000000000002L});

}
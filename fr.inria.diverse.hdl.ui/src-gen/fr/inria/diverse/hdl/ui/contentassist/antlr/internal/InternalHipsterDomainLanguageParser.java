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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'OneToMany'", "'ManyToOne'", "'OneToOne'", "'ManyToMany'", "'String'", "'Integer'", "'Long'", "'BigDecimal'", "'Float'", "'Double'", "'Enum'", "'Boolean'", "'LocalDate'", "'ZoneDateTime'", "'entity'", "'{'", "'}'", "'relationship'", "'to'", "'enum'", "','", "'minlength'", "'('", "')'", "'maxlength'", "'min'", "'max'", "'pattern'", "'required'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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


    // $ANTLR start "entryRuleValidationRule"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:228:1: entryRuleValidationRule : ruleValidationRule EOF ;
    public final void entryRuleValidationRule() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:229:1: ( ruleValidationRule EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:230:1: ruleValidationRule EOF
            {
             before(grammarAccess.getValidationRuleRule()); 
            pushFollow(FOLLOW_ruleValidationRule_in_entryRuleValidationRule422);
            ruleValidationRule();

            state._fsp--;

             after(grammarAccess.getValidationRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidationRule429); 

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
    // $ANTLR end "entryRuleValidationRule"


    // $ANTLR start "ruleValidationRule"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:237:1: ruleValidationRule : ( ( rule__ValidationRule__Alternatives ) ) ;
    public final void ruleValidationRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:241:2: ( ( ( rule__ValidationRule__Alternatives ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:242:1: ( ( rule__ValidationRule__Alternatives ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:242:1: ( ( rule__ValidationRule__Alternatives ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:243:1: ( rule__ValidationRule__Alternatives )
            {
             before(grammarAccess.getValidationRuleAccess().getAlternatives()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:244:1: ( rule__ValidationRule__Alternatives )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:244:2: rule__ValidationRule__Alternatives
            {
            pushFollow(FOLLOW_rule__ValidationRule__Alternatives_in_ruleValidationRule455);
            rule__ValidationRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValidationRuleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValidationRule"


    // $ANTLR start "entryRuleValueRange"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:256:1: entryRuleValueRange : ruleValueRange EOF ;
    public final void entryRuleValueRange() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:257:1: ( ruleValueRange EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:258:1: ruleValueRange EOF
            {
             before(grammarAccess.getValueRangeRule()); 
            pushFollow(FOLLOW_ruleValueRange_in_entryRuleValueRange482);
            ruleValueRange();

            state._fsp--;

             after(grammarAccess.getValueRangeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueRange489); 

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
    // $ANTLR end "entryRuleValueRange"


    // $ANTLR start "ruleValueRange"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:265:1: ruleValueRange : ( ( rule__ValueRange__Alternatives ) ) ;
    public final void ruleValueRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:269:2: ( ( ( rule__ValueRange__Alternatives ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:270:1: ( ( rule__ValueRange__Alternatives ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:270:1: ( ( rule__ValueRange__Alternatives ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:271:1: ( rule__ValueRange__Alternatives )
            {
             before(grammarAccess.getValueRangeAccess().getAlternatives()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:272:1: ( rule__ValueRange__Alternatives )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:272:2: rule__ValueRange__Alternatives
            {
            pushFollow(FOLLOW_rule__ValueRange__Alternatives_in_ruleValueRange515);
            rule__ValueRange__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueRangeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValueRange"


    // $ANTLR start "entryRuleMinSpecification"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:284:1: entryRuleMinSpecification : ruleMinSpecification EOF ;
    public final void entryRuleMinSpecification() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:285:1: ( ruleMinSpecification EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:286:1: ruleMinSpecification EOF
            {
             before(grammarAccess.getMinSpecificationRule()); 
            pushFollow(FOLLOW_ruleMinSpecification_in_entryRuleMinSpecification542);
            ruleMinSpecification();

            state._fsp--;

             after(grammarAccess.getMinSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinSpecification549); 

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
    // $ANTLR end "entryRuleMinSpecification"


    // $ANTLR start "ruleMinSpecification"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:293:1: ruleMinSpecification : ( ( rule__MinSpecification__Alternatives ) ) ;
    public final void ruleMinSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:297:2: ( ( ( rule__MinSpecification__Alternatives ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:298:1: ( ( rule__MinSpecification__Alternatives ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:298:1: ( ( rule__MinSpecification__Alternatives ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:299:1: ( rule__MinSpecification__Alternatives )
            {
             before(grammarAccess.getMinSpecificationAccess().getAlternatives()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:300:1: ( rule__MinSpecification__Alternatives )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:300:2: rule__MinSpecification__Alternatives
            {
            pushFollow(FOLLOW_rule__MinSpecification__Alternatives_in_ruleMinSpecification575);
            rule__MinSpecification__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMinSpecificationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMinSpecification"


    // $ANTLR start "entryRuleMaxSpecification"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:312:1: entryRuleMaxSpecification : ruleMaxSpecification EOF ;
    public final void entryRuleMaxSpecification() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:313:1: ( ruleMaxSpecification EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:314:1: ruleMaxSpecification EOF
            {
             before(grammarAccess.getMaxSpecificationRule()); 
            pushFollow(FOLLOW_ruleMaxSpecification_in_entryRuleMaxSpecification602);
            ruleMaxSpecification();

            state._fsp--;

             after(grammarAccess.getMaxSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxSpecification609); 

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
    // $ANTLR end "entryRuleMaxSpecification"


    // $ANTLR start "ruleMaxSpecification"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:321:1: ruleMaxSpecification : ( ( rule__MaxSpecification__Alternatives ) ) ;
    public final void ruleMaxSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:325:2: ( ( ( rule__MaxSpecification__Alternatives ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:326:1: ( ( rule__MaxSpecification__Alternatives ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:326:1: ( ( rule__MaxSpecification__Alternatives ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:327:1: ( rule__MaxSpecification__Alternatives )
            {
             before(grammarAccess.getMaxSpecificationAccess().getAlternatives()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:328:1: ( rule__MaxSpecification__Alternatives )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:328:2: rule__MaxSpecification__Alternatives
            {
            pushFollow(FOLLOW_rule__MaxSpecification__Alternatives_in_ruleMaxSpecification635);
            rule__MaxSpecification__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMaxSpecificationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMaxSpecification"


    // $ANTLR start "entryRuleStringMinSpecification"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:340:1: entryRuleStringMinSpecification : ruleStringMinSpecification EOF ;
    public final void entryRuleStringMinSpecification() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:341:1: ( ruleStringMinSpecification EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:342:1: ruleStringMinSpecification EOF
            {
             before(grammarAccess.getStringMinSpecificationRule()); 
            pushFollow(FOLLOW_ruleStringMinSpecification_in_entryRuleStringMinSpecification662);
            ruleStringMinSpecification();

            state._fsp--;

             after(grammarAccess.getStringMinSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringMinSpecification669); 

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
    // $ANTLR end "entryRuleStringMinSpecification"


    // $ANTLR start "ruleStringMinSpecification"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:349:1: ruleStringMinSpecification : ( ( rule__StringMinSpecification__Group__0 ) ) ;
    public final void ruleStringMinSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:353:2: ( ( ( rule__StringMinSpecification__Group__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:354:1: ( ( rule__StringMinSpecification__Group__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:354:1: ( ( rule__StringMinSpecification__Group__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:355:1: ( rule__StringMinSpecification__Group__0 )
            {
             before(grammarAccess.getStringMinSpecificationAccess().getGroup()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:356:1: ( rule__StringMinSpecification__Group__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:356:2: rule__StringMinSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__StringMinSpecification__Group__0_in_ruleStringMinSpecification695);
            rule__StringMinSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringMinSpecificationAccess().getGroup()); 

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
    // $ANTLR end "ruleStringMinSpecification"


    // $ANTLR start "entryRuleStringMaxSpecification"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:368:1: entryRuleStringMaxSpecification : ruleStringMaxSpecification EOF ;
    public final void entryRuleStringMaxSpecification() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:369:1: ( ruleStringMaxSpecification EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:370:1: ruleStringMaxSpecification EOF
            {
             before(grammarAccess.getStringMaxSpecificationRule()); 
            pushFollow(FOLLOW_ruleStringMaxSpecification_in_entryRuleStringMaxSpecification722);
            ruleStringMaxSpecification();

            state._fsp--;

             after(grammarAccess.getStringMaxSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringMaxSpecification729); 

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
    // $ANTLR end "entryRuleStringMaxSpecification"


    // $ANTLR start "ruleStringMaxSpecification"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:377:1: ruleStringMaxSpecification : ( ( rule__StringMaxSpecification__Group__0 ) ) ;
    public final void ruleStringMaxSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:381:2: ( ( ( rule__StringMaxSpecification__Group__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:382:1: ( ( rule__StringMaxSpecification__Group__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:382:1: ( ( rule__StringMaxSpecification__Group__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:383:1: ( rule__StringMaxSpecification__Group__0 )
            {
             before(grammarAccess.getStringMaxSpecificationAccess().getGroup()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:384:1: ( rule__StringMaxSpecification__Group__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:384:2: rule__StringMaxSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__StringMaxSpecification__Group__0_in_ruleStringMaxSpecification755);
            rule__StringMaxSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringMaxSpecificationAccess().getGroup()); 

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
    // $ANTLR end "ruleStringMaxSpecification"


    // $ANTLR start "entryRuleIntegerMinSpecification"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:396:1: entryRuleIntegerMinSpecification : ruleIntegerMinSpecification EOF ;
    public final void entryRuleIntegerMinSpecification() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:397:1: ( ruleIntegerMinSpecification EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:398:1: ruleIntegerMinSpecification EOF
            {
             before(grammarAccess.getIntegerMinSpecificationRule()); 
            pushFollow(FOLLOW_ruleIntegerMinSpecification_in_entryRuleIntegerMinSpecification782);
            ruleIntegerMinSpecification();

            state._fsp--;

             after(grammarAccess.getIntegerMinSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerMinSpecification789); 

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
    // $ANTLR end "entryRuleIntegerMinSpecification"


    // $ANTLR start "ruleIntegerMinSpecification"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:405:1: ruleIntegerMinSpecification : ( ( rule__IntegerMinSpecification__Group__0 ) ) ;
    public final void ruleIntegerMinSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:409:2: ( ( ( rule__IntegerMinSpecification__Group__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:410:1: ( ( rule__IntegerMinSpecification__Group__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:410:1: ( ( rule__IntegerMinSpecification__Group__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:411:1: ( rule__IntegerMinSpecification__Group__0 )
            {
             before(grammarAccess.getIntegerMinSpecificationAccess().getGroup()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:412:1: ( rule__IntegerMinSpecification__Group__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:412:2: rule__IntegerMinSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerMinSpecification__Group__0_in_ruleIntegerMinSpecification815);
            rule__IntegerMinSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerMinSpecificationAccess().getGroup()); 

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
    // $ANTLR end "ruleIntegerMinSpecification"


    // $ANTLR start "entryRuleIntegerMaxSpecification"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:424:1: entryRuleIntegerMaxSpecification : ruleIntegerMaxSpecification EOF ;
    public final void entryRuleIntegerMaxSpecification() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:425:1: ( ruleIntegerMaxSpecification EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:426:1: ruleIntegerMaxSpecification EOF
            {
             before(grammarAccess.getIntegerMaxSpecificationRule()); 
            pushFollow(FOLLOW_ruleIntegerMaxSpecification_in_entryRuleIntegerMaxSpecification842);
            ruleIntegerMaxSpecification();

            state._fsp--;

             after(grammarAccess.getIntegerMaxSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerMaxSpecification849); 

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
    // $ANTLR end "entryRuleIntegerMaxSpecification"


    // $ANTLR start "ruleIntegerMaxSpecification"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:433:1: ruleIntegerMaxSpecification : ( ( rule__IntegerMaxSpecification__Group__0 ) ) ;
    public final void ruleIntegerMaxSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:437:2: ( ( ( rule__IntegerMaxSpecification__Group__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:438:1: ( ( rule__IntegerMaxSpecification__Group__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:438:1: ( ( rule__IntegerMaxSpecification__Group__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:439:1: ( rule__IntegerMaxSpecification__Group__0 )
            {
             before(grammarAccess.getIntegerMaxSpecificationAccess().getGroup()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:440:1: ( rule__IntegerMaxSpecification__Group__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:440:2: rule__IntegerMaxSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerMaxSpecification__Group__0_in_ruleIntegerMaxSpecification875);
            rule__IntegerMaxSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerMaxSpecificationAccess().getGroup()); 

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
    // $ANTLR end "ruleIntegerMaxSpecification"


    // $ANTLR start "entryRulePattern"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:452:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:453:1: ( rulePattern EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:454:1: rulePattern EOF
            {
             before(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_rulePattern_in_entryRulePattern902);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePattern909); 

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
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:461:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:465:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:466:1: ( ( rule__Pattern__Group__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:466:1: ( ( rule__Pattern__Group__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:467:1: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:468:1: ( rule__Pattern__Group__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:468:2: rule__Pattern__Group__0
            {
            pushFollow(FOLLOW_rule__Pattern__Group__0_in_rulePattern935);
            rule__Pattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getGroup()); 

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
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleHdlTypeReference"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:480:1: entryRuleHdlTypeReference : ruleHdlTypeReference EOF ;
    public final void entryRuleHdlTypeReference() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:481:1: ( ruleHdlTypeReference EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:482:1: ruleHdlTypeReference EOF
            {
             before(grammarAccess.getHdlTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleHdlTypeReference_in_entryRuleHdlTypeReference962);
            ruleHdlTypeReference();

            state._fsp--;

             after(grammarAccess.getHdlTypeReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHdlTypeReference969); 

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
    // $ANTLR end "entryRuleHdlTypeReference"


    // $ANTLR start "ruleHdlTypeReference"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:489:1: ruleHdlTypeReference : ( ( rule__HdlTypeReference__Alternatives ) ) ;
    public final void ruleHdlTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:493:2: ( ( ( rule__HdlTypeReference__Alternatives ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:494:1: ( ( rule__HdlTypeReference__Alternatives ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:494:1: ( ( rule__HdlTypeReference__Alternatives ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:495:1: ( rule__HdlTypeReference__Alternatives )
            {
             before(grammarAccess.getHdlTypeReferenceAccess().getAlternatives()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:496:1: ( rule__HdlTypeReference__Alternatives )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:496:2: rule__HdlTypeReference__Alternatives
            {
            pushFollow(FOLLOW_rule__HdlTypeReference__Alternatives_in_ruleHdlTypeReference995);
            rule__HdlTypeReference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHdlTypeReferenceAccess().getAlternatives()); 

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
    // $ANTLR end "ruleHdlTypeReference"


    // $ANTLR start "entryRuleEnumTypeReference"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:508:1: entryRuleEnumTypeReference : ruleEnumTypeReference EOF ;
    public final void entryRuleEnumTypeReference() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:509:1: ( ruleEnumTypeReference EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:510:1: ruleEnumTypeReference EOF
            {
             before(grammarAccess.getEnumTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleEnumTypeReference_in_entryRuleEnumTypeReference1022);
            ruleEnumTypeReference();

            state._fsp--;

             after(grammarAccess.getEnumTypeReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumTypeReference1029); 

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
    // $ANTLR end "entryRuleEnumTypeReference"


    // $ANTLR start "ruleEnumTypeReference"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:517:1: ruleEnumTypeReference : ( ( rule__EnumTypeReference__TypeAssignment ) ) ;
    public final void ruleEnumTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:521:2: ( ( ( rule__EnumTypeReference__TypeAssignment ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:522:1: ( ( rule__EnumTypeReference__TypeAssignment ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:522:1: ( ( rule__EnumTypeReference__TypeAssignment ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:523:1: ( rule__EnumTypeReference__TypeAssignment )
            {
             before(grammarAccess.getEnumTypeReferenceAccess().getTypeAssignment()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:524:1: ( rule__EnumTypeReference__TypeAssignment )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:524:2: rule__EnumTypeReference__TypeAssignment
            {
            pushFollow(FOLLOW_rule__EnumTypeReference__TypeAssignment_in_ruleEnumTypeReference1055);
            rule__EnumTypeReference__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeReferenceAccess().getTypeAssignment()); 

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
    // $ANTLR end "ruleEnumTypeReference"


    // $ANTLR start "entryRulePrimitiveTypeReference"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:536:1: entryRulePrimitiveTypeReference : rulePrimitiveTypeReference EOF ;
    public final void entryRulePrimitiveTypeReference() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:537:1: ( rulePrimitiveTypeReference EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:538:1: rulePrimitiveTypeReference EOF
            {
             before(grammarAccess.getPrimitiveTypeReferenceRule()); 
            pushFollow(FOLLOW_rulePrimitiveTypeReference_in_entryRulePrimitiveTypeReference1082);
            rulePrimitiveTypeReference();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveTypeReference1089); 

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
    // $ANTLR end "entryRulePrimitiveTypeReference"


    // $ANTLR start "rulePrimitiveTypeReference"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:545:1: rulePrimitiveTypeReference : ( ( rule__PrimitiveTypeReference__TypeAssignment ) ) ;
    public final void rulePrimitiveTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:549:2: ( ( ( rule__PrimitiveTypeReference__TypeAssignment ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:550:1: ( ( rule__PrimitiveTypeReference__TypeAssignment ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:550:1: ( ( rule__PrimitiveTypeReference__TypeAssignment ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:551:1: ( rule__PrimitiveTypeReference__TypeAssignment )
            {
             before(grammarAccess.getPrimitiveTypeReferenceAccess().getTypeAssignment()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:552:1: ( rule__PrimitiveTypeReference__TypeAssignment )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:552:2: rule__PrimitiveTypeReference__TypeAssignment
            {
            pushFollow(FOLLOW_rule__PrimitiveTypeReference__TypeAssignment_in_rulePrimitiveTypeReference1115);
            rule__PrimitiveTypeReference__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeReferenceAccess().getTypeAssignment()); 

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
    // $ANTLR end "rulePrimitiveTypeReference"


    // $ANTLR start "ruleRelationType"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:565:1: ruleRelationType : ( ( rule__RelationType__Alternatives ) ) ;
    public final void ruleRelationType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:569:1: ( ( ( rule__RelationType__Alternatives ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:570:1: ( ( rule__RelationType__Alternatives ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:570:1: ( ( rule__RelationType__Alternatives ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:571:1: ( rule__RelationType__Alternatives )
            {
             before(grammarAccess.getRelationTypeAccess().getAlternatives()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:572:1: ( rule__RelationType__Alternatives )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:572:2: rule__RelationType__Alternatives
            {
            pushFollow(FOLLOW_rule__RelationType__Alternatives_in_ruleRelationType1152);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:584:1: ruleJHipsterType : ( ( rule__JHipsterType__Alternatives ) ) ;
    public final void ruleJHipsterType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:588:1: ( ( ( rule__JHipsterType__Alternatives ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:589:1: ( ( rule__JHipsterType__Alternatives ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:589:1: ( ( rule__JHipsterType__Alternatives ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:590:1: ( rule__JHipsterType__Alternatives )
            {
             before(grammarAccess.getJHipsterTypeAccess().getAlternatives()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:591:1: ( rule__JHipsterType__Alternatives )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:591:2: rule__JHipsterType__Alternatives
            {
            pushFollow(FOLLOW_rule__JHipsterType__Alternatives_in_ruleJHipsterType1188);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:602:1: rule__DomainElement__Alternatives : ( ( ruleEntity ) | ( ruleRelation ) | ( ruleEnum ) );
    public final void rule__DomainElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:606:1: ( ( ruleEntity ) | ( ruleRelation ) | ( ruleEnum ) )
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
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:607:1: ( ruleEntity )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:607:1: ( ruleEntity )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:608:1: ruleEntity
                    {
                     before(grammarAccess.getDomainElementAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__DomainElement__Alternatives1223);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getDomainElementAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:613:6: ( ruleRelation )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:613:6: ( ruleRelation )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:614:1: ruleRelation
                    {
                     before(grammarAccess.getDomainElementAccess().getRelationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRelation_in_rule__DomainElement__Alternatives1240);
                    ruleRelation();

                    state._fsp--;

                     after(grammarAccess.getDomainElementAccess().getRelationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:619:6: ( ruleEnum )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:619:6: ( ruleEnum )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:620:1: ruleEnum
                    {
                     before(grammarAccess.getDomainElementAccess().getEnumParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnum_in_rule__DomainElement__Alternatives1257);
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


    // $ANTLR start "rule__ValidationRule__Alternatives"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:630:1: rule__ValidationRule__Alternatives : ( ( ruleValueRange ) | ( rulePattern ) );
    public final void rule__ValidationRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:634:1: ( ( ruleValueRange ) | ( rulePattern ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==32||(LA3_0>=35 && LA3_0<=37)) ) {
                alt3=1;
            }
            else if ( (LA3_0==38) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:635:1: ( ruleValueRange )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:635:1: ( ruleValueRange )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:636:1: ruleValueRange
                    {
                     before(grammarAccess.getValidationRuleAccess().getValueRangeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleValueRange_in_rule__ValidationRule__Alternatives1289);
                    ruleValueRange();

                    state._fsp--;

                     after(grammarAccess.getValidationRuleAccess().getValueRangeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:641:6: ( rulePattern )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:641:6: ( rulePattern )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:642:1: rulePattern
                    {
                     before(grammarAccess.getValidationRuleAccess().getPatternParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePattern_in_rule__ValidationRule__Alternatives1306);
                    rulePattern();

                    state._fsp--;

                     after(grammarAccess.getValidationRuleAccess().getPatternParserRuleCall_1()); 

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
    // $ANTLR end "rule__ValidationRule__Alternatives"


    // $ANTLR start "rule__ValueRange__Alternatives"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:652:1: rule__ValueRange__Alternatives : ( ( ruleMinSpecification ) | ( ruleMaxSpecification ) );
    public final void rule__ValueRange__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:656:1: ( ( ruleMinSpecification ) | ( ruleMaxSpecification ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==32||LA4_0==36) ) {
                alt4=1;
            }
            else if ( (LA4_0==35||LA4_0==37) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:657:1: ( ruleMinSpecification )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:657:1: ( ruleMinSpecification )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:658:1: ruleMinSpecification
                    {
                     before(grammarAccess.getValueRangeAccess().getMinSpecificationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMinSpecification_in_rule__ValueRange__Alternatives1338);
                    ruleMinSpecification();

                    state._fsp--;

                     after(grammarAccess.getValueRangeAccess().getMinSpecificationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:663:6: ( ruleMaxSpecification )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:663:6: ( ruleMaxSpecification )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:664:1: ruleMaxSpecification
                    {
                     before(grammarAccess.getValueRangeAccess().getMaxSpecificationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMaxSpecification_in_rule__ValueRange__Alternatives1355);
                    ruleMaxSpecification();

                    state._fsp--;

                     after(grammarAccess.getValueRangeAccess().getMaxSpecificationParserRuleCall_1()); 

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
    // $ANTLR end "rule__ValueRange__Alternatives"


    // $ANTLR start "rule__MinSpecification__Alternatives"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:674:1: rule__MinSpecification__Alternatives : ( ( ruleStringMinSpecification ) | ( ruleIntegerMinSpecification ) );
    public final void rule__MinSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:678:1: ( ( ruleStringMinSpecification ) | ( ruleIntegerMinSpecification ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                alt5=1;
            }
            else if ( (LA5_0==36) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:679:1: ( ruleStringMinSpecification )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:679:1: ( ruleStringMinSpecification )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:680:1: ruleStringMinSpecification
                    {
                     before(grammarAccess.getMinSpecificationAccess().getStringMinSpecificationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringMinSpecification_in_rule__MinSpecification__Alternatives1387);
                    ruleStringMinSpecification();

                    state._fsp--;

                     after(grammarAccess.getMinSpecificationAccess().getStringMinSpecificationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:685:6: ( ruleIntegerMinSpecification )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:685:6: ( ruleIntegerMinSpecification )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:686:1: ruleIntegerMinSpecification
                    {
                     before(grammarAccess.getMinSpecificationAccess().getIntegerMinSpecificationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntegerMinSpecification_in_rule__MinSpecification__Alternatives1404);
                    ruleIntegerMinSpecification();

                    state._fsp--;

                     after(grammarAccess.getMinSpecificationAccess().getIntegerMinSpecificationParserRuleCall_1()); 

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
    // $ANTLR end "rule__MinSpecification__Alternatives"


    // $ANTLR start "rule__MaxSpecification__Alternatives"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:696:1: rule__MaxSpecification__Alternatives : ( ( ruleStringMaxSpecification ) | ( ruleIntegerMaxSpecification ) );
    public final void rule__MaxSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:700:1: ( ( ruleStringMaxSpecification ) | ( ruleIntegerMaxSpecification ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==35) ) {
                alt6=1;
            }
            else if ( (LA6_0==37) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:701:1: ( ruleStringMaxSpecification )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:701:1: ( ruleStringMaxSpecification )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:702:1: ruleStringMaxSpecification
                    {
                     before(grammarAccess.getMaxSpecificationAccess().getStringMaxSpecificationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringMaxSpecification_in_rule__MaxSpecification__Alternatives1436);
                    ruleStringMaxSpecification();

                    state._fsp--;

                     after(grammarAccess.getMaxSpecificationAccess().getStringMaxSpecificationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:707:6: ( ruleIntegerMaxSpecification )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:707:6: ( ruleIntegerMaxSpecification )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:708:1: ruleIntegerMaxSpecification
                    {
                     before(grammarAccess.getMaxSpecificationAccess().getIntegerMaxSpecificationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntegerMaxSpecification_in_rule__MaxSpecification__Alternatives1453);
                    ruleIntegerMaxSpecification();

                    state._fsp--;

                     after(grammarAccess.getMaxSpecificationAccess().getIntegerMaxSpecificationParserRuleCall_1()); 

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
    // $ANTLR end "rule__MaxSpecification__Alternatives"


    // $ANTLR start "rule__HdlTypeReference__Alternatives"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:718:1: rule__HdlTypeReference__Alternatives : ( ( ruleEnumTypeReference ) | ( rulePrimitiveTypeReference ) );
    public final void rule__HdlTypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:722:1: ( ( ruleEnumTypeReference ) | ( rulePrimitiveTypeReference ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=15 && LA7_0<=24)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:723:1: ( ruleEnumTypeReference )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:723:1: ( ruleEnumTypeReference )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:724:1: ruleEnumTypeReference
                    {
                     before(grammarAccess.getHdlTypeReferenceAccess().getEnumTypeReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEnumTypeReference_in_rule__HdlTypeReference__Alternatives1485);
                    ruleEnumTypeReference();

                    state._fsp--;

                     after(grammarAccess.getHdlTypeReferenceAccess().getEnumTypeReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:729:6: ( rulePrimitiveTypeReference )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:729:6: ( rulePrimitiveTypeReference )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:730:1: rulePrimitiveTypeReference
                    {
                     before(grammarAccess.getHdlTypeReferenceAccess().getPrimitiveTypeReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePrimitiveTypeReference_in_rule__HdlTypeReference__Alternatives1502);
                    rulePrimitiveTypeReference();

                    state._fsp--;

                     after(grammarAccess.getHdlTypeReferenceAccess().getPrimitiveTypeReferenceParserRuleCall_1()); 

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
    // $ANTLR end "rule__HdlTypeReference__Alternatives"


    // $ANTLR start "rule__RelationType__Alternatives"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:740:1: rule__RelationType__Alternatives : ( ( ( 'OneToMany' ) ) | ( ( 'ManyToOne' ) ) | ( ( 'OneToOne' ) ) | ( ( 'ManyToMany' ) ) );
    public final void rule__RelationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:744:1: ( ( ( 'OneToMany' ) ) | ( ( 'ManyToOne' ) ) | ( ( 'OneToOne' ) ) | ( ( 'ManyToMany' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case 13:
                {
                alt8=3;
                }
                break;
            case 14:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:745:1: ( ( 'OneToMany' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:745:1: ( ( 'OneToMany' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:746:1: ( 'OneToMany' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getONE_TO_MANYEnumLiteralDeclaration_0()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:747:1: ( 'OneToMany' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:747:3: 'OneToMany'
                    {
                    match(input,11,FOLLOW_11_in_rule__RelationType__Alternatives1535); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getONE_TO_MANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:752:6: ( ( 'ManyToOne' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:752:6: ( ( 'ManyToOne' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:753:1: ( 'ManyToOne' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getMANY_TO_ONEEnumLiteralDeclaration_1()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:754:1: ( 'ManyToOne' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:754:3: 'ManyToOne'
                    {
                    match(input,12,FOLLOW_12_in_rule__RelationType__Alternatives1556); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getMANY_TO_ONEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:759:6: ( ( 'OneToOne' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:759:6: ( ( 'OneToOne' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:760:1: ( 'OneToOne' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getONE_TO_ONEEnumLiteralDeclaration_2()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:761:1: ( 'OneToOne' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:761:3: 'OneToOne'
                    {
                    match(input,13,FOLLOW_13_in_rule__RelationType__Alternatives1577); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getONE_TO_ONEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:766:6: ( ( 'ManyToMany' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:766:6: ( ( 'ManyToMany' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:767:1: ( 'ManyToMany' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getMANY_TO_MANYEnumLiteralDeclaration_3()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:768:1: ( 'ManyToMany' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:768:3: 'ManyToMany'
                    {
                    match(input,14,FOLLOW_14_in_rule__RelationType__Alternatives1598); 

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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:778:1: rule__JHipsterType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Long' ) ) | ( ( 'BigDecimal' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'Enum' ) ) | ( ( 'Boolean' ) ) | ( ( 'LocalDate' ) ) | ( ( 'ZoneDateTime' ) ) );
    public final void rule__JHipsterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:782:1: ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Long' ) ) | ( ( 'BigDecimal' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'Enum' ) ) | ( ( 'Boolean' ) ) | ( ( 'LocalDate' ) ) | ( ( 'ZoneDateTime' ) ) )
            int alt9=10;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt9=1;
                }
                break;
            case 16:
                {
                alt9=2;
                }
                break;
            case 17:
                {
                alt9=3;
                }
                break;
            case 18:
                {
                alt9=4;
                }
                break;
            case 19:
                {
                alt9=5;
                }
                break;
            case 20:
                {
                alt9=6;
                }
                break;
            case 21:
                {
                alt9=7;
                }
                break;
            case 22:
                {
                alt9=8;
                }
                break;
            case 23:
                {
                alt9=9;
                }
                break;
            case 24:
                {
                alt9=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:783:1: ( ( 'String' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:783:1: ( ( 'String' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:784:1: ( 'String' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:785:1: ( 'String' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:785:3: 'String'
                    {
                    match(input,15,FOLLOW_15_in_rule__JHipsterType__Alternatives1634); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:790:6: ( ( 'Integer' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:790:6: ( ( 'Integer' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:791:1: ( 'Integer' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:792:1: ( 'Integer' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:792:3: 'Integer'
                    {
                    match(input,16,FOLLOW_16_in_rule__JHipsterType__Alternatives1655); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:797:6: ( ( 'Long' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:797:6: ( ( 'Long' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:798:1: ( 'Long' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getLONGEnumLiteralDeclaration_2()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:799:1: ( 'Long' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:799:3: 'Long'
                    {
                    match(input,17,FOLLOW_17_in_rule__JHipsterType__Alternatives1676); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getLONGEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:804:6: ( ( 'BigDecimal' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:804:6: ( ( 'BigDecimal' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:805:1: ( 'BigDecimal' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_3()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:806:1: ( 'BigDecimal' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:806:3: 'BigDecimal'
                    {
                    match(input,18,FOLLOW_18_in_rule__JHipsterType__Alternatives1697); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:811:6: ( ( 'Float' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:811:6: ( ( 'Float' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:812:1: ( 'Float' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:813:1: ( 'Float' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:813:3: 'Float'
                    {
                    match(input,19,FOLLOW_19_in_rule__JHipsterType__Alternatives1718); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getFLOATEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:818:6: ( ( 'Double' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:818:6: ( ( 'Double' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:819:1: ( 'Double' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:820:1: ( 'Double' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:820:3: 'Double'
                    {
                    match(input,20,FOLLOW_20_in_rule__JHipsterType__Alternatives1739); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:825:6: ( ( 'Enum' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:825:6: ( ( 'Enum' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:826:1: ( 'Enum' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getENUMEnumLiteralDeclaration_6()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:827:1: ( 'Enum' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:827:3: 'Enum'
                    {
                    match(input,21,FOLLOW_21_in_rule__JHipsterType__Alternatives1760); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getENUMEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:832:6: ( ( 'Boolean' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:832:6: ( ( 'Boolean' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:833:1: ( 'Boolean' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getBOOLEANEnumLiteralDeclaration_7()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:834:1: ( 'Boolean' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:834:3: 'Boolean'
                    {
                    match(input,22,FOLLOW_22_in_rule__JHipsterType__Alternatives1781); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getBOOLEANEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:839:6: ( ( 'LocalDate' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:839:6: ( ( 'LocalDate' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:840:1: ( 'LocalDate' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_8()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:841:1: ( 'LocalDate' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:841:3: 'LocalDate'
                    {
                    match(input,23,FOLLOW_23_in_rule__JHipsterType__Alternatives1802); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:846:6: ( ( 'ZoneDateTime' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:846:6: ( ( 'ZoneDateTime' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:847:1: ( 'ZoneDateTime' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getZONE_DATE_TIMEEnumLiteralDeclaration_9()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:848:1: ( 'ZoneDateTime' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:848:3: 'ZoneDateTime'
                    {
                    match(input,24,FOLLOW_24_in_rule__JHipsterType__Alternatives1823); 

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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:860:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:864:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:865:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01856);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01859);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:872:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:876:1: ( ( 'entity' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:877:1: ( 'entity' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:877:1: ( 'entity' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:878:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Entity__Group__0__Impl1887); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:891:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:895:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:896:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11918);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11921);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:903:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:907:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:908:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:908:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:909:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:910:1: ( rule__Entity__NameAssignment_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:910:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1948);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:920:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:924:1: ( rule__Entity__Group__2__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:925:2: rule__Entity__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21978);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:931:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:935:1: ( ( ( rule__Entity__Group_2__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:936:1: ( ( rule__Entity__Group_2__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:936:1: ( ( rule__Entity__Group_2__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:937:1: ( rule__Entity__Group_2__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:938:1: ( rule__Entity__Group_2__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:938:2: rule__Entity__Group_2__0
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl2005);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:954:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:958:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:959:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__02041);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__02044);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:966:1: rule__Entity__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:970:1: ( ( '{' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:971:1: ( '{' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:971:1: ( '{' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:972:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Entity__Group_2__0__Impl2072); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:985:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:989:1: ( rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:990:2: rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__12103);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__2_in_rule__Entity__Group_2__12106);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:997:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__FieldsAssignment_2_1 )* ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1001:1: ( ( ( rule__Entity__FieldsAssignment_2_1 )* ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1002:1: ( ( rule__Entity__FieldsAssignment_2_1 )* )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1002:1: ( ( rule__Entity__FieldsAssignment_2_1 )* )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1003:1: ( rule__Entity__FieldsAssignment_2_1 )*
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_2_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1004:1: ( rule__Entity__FieldsAssignment_2_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1004:2: rule__Entity__FieldsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FieldsAssignment_2_1_in_rule__Entity__Group_2__1__Impl2133);
            	    rule__Entity__FieldsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1014:1: rule__Entity__Group_2__2 : rule__Entity__Group_2__2__Impl ;
    public final void rule__Entity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1018:1: ( rule__Entity__Group_2__2__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1019:2: rule__Entity__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__2__Impl_in_rule__Entity__Group_2__22164);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1025:1: rule__Entity__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Entity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1029:1: ( ( '}' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1030:1: ( '}' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1030:1: ( '}' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1031:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,27,FOLLOW_27_in_rule__Entity__Group_2__2__Impl2192); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1050:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1054:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1055:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_rule__Relation__Group__0__Impl_in_rule__Relation__Group__02229);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__1_in_rule__Relation__Group__02232);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1062:1: rule__Relation__Group__0__Impl : ( 'relationship' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1066:1: ( ( 'relationship' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1067:1: ( 'relationship' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1067:1: ( 'relationship' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1068:1: 'relationship'
            {
             before(grammarAccess.getRelationAccess().getRelationshipKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Relation__Group__0__Impl2260); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1081:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1085:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1086:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_rule__Relation__Group__1__Impl_in_rule__Relation__Group__12291);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__2_in_rule__Relation__Group__12294);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1093:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__TypeAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1097:1: ( ( ( rule__Relation__TypeAssignment_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1098:1: ( ( rule__Relation__TypeAssignment_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1098:1: ( ( rule__Relation__TypeAssignment_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1099:1: ( rule__Relation__TypeAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getTypeAssignment_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1100:1: ( rule__Relation__TypeAssignment_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1100:2: rule__Relation__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Relation__TypeAssignment_1_in_rule__Relation__Group__1__Impl2321);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1110:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1114:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1115:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_rule__Relation__Group__2__Impl_in_rule__Relation__Group__22351);
            rule__Relation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__3_in_rule__Relation__Group__22354);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1122:1: rule__Relation__Group__2__Impl : ( '{' ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1126:1: ( ( '{' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1127:1: ( '{' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1127:1: ( '{' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1128:1: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Relation__Group__2__Impl2382); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1141:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1145:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1146:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
            {
            pushFollow(FOLLOW_rule__Relation__Group__3__Impl_in_rule__Relation__Group__32413);
            rule__Relation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__4_in_rule__Relation__Group__32416);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1153:1: rule__Relation__Group__3__Impl : ( ( rule__Relation__FromAssignment_3 ) ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1157:1: ( ( ( rule__Relation__FromAssignment_3 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1158:1: ( ( rule__Relation__FromAssignment_3 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1158:1: ( ( rule__Relation__FromAssignment_3 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1159:1: ( rule__Relation__FromAssignment_3 )
            {
             before(grammarAccess.getRelationAccess().getFromAssignment_3()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1160:1: ( rule__Relation__FromAssignment_3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1160:2: rule__Relation__FromAssignment_3
            {
            pushFollow(FOLLOW_rule__Relation__FromAssignment_3_in_rule__Relation__Group__3__Impl2443);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1170:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1174:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1175:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
            {
            pushFollow(FOLLOW_rule__Relation__Group__4__Impl_in_rule__Relation__Group__42473);
            rule__Relation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__5_in_rule__Relation__Group__42476);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1182:1: rule__Relation__Group__4__Impl : ( ( rule__Relation__Group_4__0 ) ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1186:1: ( ( ( rule__Relation__Group_4__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1187:1: ( ( rule__Relation__Group_4__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1187:1: ( ( rule__Relation__Group_4__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1188:1: ( rule__Relation__Group_4__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup_4()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1189:1: ( rule__Relation__Group_4__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1189:2: rule__Relation__Group_4__0
            {
            pushFollow(FOLLOW_rule__Relation__Group_4__0_in_rule__Relation__Group__4__Impl2503);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1199:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl rule__Relation__Group__6 ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1203:1: ( rule__Relation__Group__5__Impl rule__Relation__Group__6 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1204:2: rule__Relation__Group__5__Impl rule__Relation__Group__6
            {
            pushFollow(FOLLOW_rule__Relation__Group__5__Impl_in_rule__Relation__Group__52533);
            rule__Relation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__6_in_rule__Relation__Group__52536);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1211:1: rule__Relation__Group__5__Impl : ( 'to' ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1215:1: ( ( 'to' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1216:1: ( 'to' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1216:1: ( 'to' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1217:1: 'to'
            {
             before(grammarAccess.getRelationAccess().getToKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__Relation__Group__5__Impl2564); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1230:1: rule__Relation__Group__6 : rule__Relation__Group__6__Impl rule__Relation__Group__7 ;
    public final void rule__Relation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1234:1: ( rule__Relation__Group__6__Impl rule__Relation__Group__7 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1235:2: rule__Relation__Group__6__Impl rule__Relation__Group__7
            {
            pushFollow(FOLLOW_rule__Relation__Group__6__Impl_in_rule__Relation__Group__62595);
            rule__Relation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__7_in_rule__Relation__Group__62598);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1242:1: rule__Relation__Group__6__Impl : ( ( rule__Relation__ToAssignment_6 ) ) ;
    public final void rule__Relation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1246:1: ( ( ( rule__Relation__ToAssignment_6 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1247:1: ( ( rule__Relation__ToAssignment_6 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1247:1: ( ( rule__Relation__ToAssignment_6 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1248:1: ( rule__Relation__ToAssignment_6 )
            {
             before(grammarAccess.getRelationAccess().getToAssignment_6()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1249:1: ( rule__Relation__ToAssignment_6 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1249:2: rule__Relation__ToAssignment_6
            {
            pushFollow(FOLLOW_rule__Relation__ToAssignment_6_in_rule__Relation__Group__6__Impl2625);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1259:1: rule__Relation__Group__7 : rule__Relation__Group__7__Impl rule__Relation__Group__8 ;
    public final void rule__Relation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1263:1: ( rule__Relation__Group__7__Impl rule__Relation__Group__8 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1264:2: rule__Relation__Group__7__Impl rule__Relation__Group__8
            {
            pushFollow(FOLLOW_rule__Relation__Group__7__Impl_in_rule__Relation__Group__72655);
            rule__Relation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__8_in_rule__Relation__Group__72658);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1271:1: rule__Relation__Group__7__Impl : ( ( rule__Relation__Group_7__0 ) ) ;
    public final void rule__Relation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1275:1: ( ( ( rule__Relation__Group_7__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1276:1: ( ( rule__Relation__Group_7__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1276:1: ( ( rule__Relation__Group_7__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1277:1: ( rule__Relation__Group_7__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup_7()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1278:1: ( rule__Relation__Group_7__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1278:2: rule__Relation__Group_7__0
            {
            pushFollow(FOLLOW_rule__Relation__Group_7__0_in_rule__Relation__Group__7__Impl2685);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1288:1: rule__Relation__Group__8 : rule__Relation__Group__8__Impl ;
    public final void rule__Relation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1292:1: ( rule__Relation__Group__8__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1293:2: rule__Relation__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group__8__Impl_in_rule__Relation__Group__82715);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1299:1: rule__Relation__Group__8__Impl : ( '}' ) ;
    public final void rule__Relation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1303:1: ( ( '}' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1304:1: ( '}' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1304:1: ( '}' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1305:1: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_27_in_rule__Relation__Group__8__Impl2743); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1336:1: rule__Relation__Group_4__0 : rule__Relation__Group_4__0__Impl rule__Relation__Group_4__1 ;
    public final void rule__Relation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1340:1: ( rule__Relation__Group_4__0__Impl rule__Relation__Group_4__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1341:2: rule__Relation__Group_4__0__Impl rule__Relation__Group_4__1
            {
            pushFollow(FOLLOW_rule__Relation__Group_4__0__Impl_in_rule__Relation__Group_4__02792);
            rule__Relation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_4__1_in_rule__Relation__Group_4__02795);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1348:1: rule__Relation__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Relation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1352:1: ( ( '{' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1353:1: ( '{' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1353:1: ( '{' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1354:1: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,26,FOLLOW_26_in_rule__Relation__Group_4__0__Impl2823); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1367:1: rule__Relation__Group_4__1 : rule__Relation__Group_4__1__Impl rule__Relation__Group_4__2 ;
    public final void rule__Relation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1371:1: ( rule__Relation__Group_4__1__Impl rule__Relation__Group_4__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1372:2: rule__Relation__Group_4__1__Impl rule__Relation__Group_4__2
            {
            pushFollow(FOLLOW_rule__Relation__Group_4__1__Impl_in_rule__Relation__Group_4__12854);
            rule__Relation__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_4__2_in_rule__Relation__Group_4__12857);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1379:1: rule__Relation__Group_4__1__Impl : ( ( rule__Relation__FromRelationNameAssignment_4_1 ) ) ;
    public final void rule__Relation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1383:1: ( ( ( rule__Relation__FromRelationNameAssignment_4_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1384:1: ( ( rule__Relation__FromRelationNameAssignment_4_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1384:1: ( ( rule__Relation__FromRelationNameAssignment_4_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1385:1: ( rule__Relation__FromRelationNameAssignment_4_1 )
            {
             before(grammarAccess.getRelationAccess().getFromRelationNameAssignment_4_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1386:1: ( rule__Relation__FromRelationNameAssignment_4_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1386:2: rule__Relation__FromRelationNameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Relation__FromRelationNameAssignment_4_1_in_rule__Relation__Group_4__1__Impl2884);
            rule__Relation__FromRelationNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getFromRelationNameAssignment_4_1()); 

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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1396:1: rule__Relation__Group_4__2 : rule__Relation__Group_4__2__Impl ;
    public final void rule__Relation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1400:1: ( rule__Relation__Group_4__2__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1401:2: rule__Relation__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_4__2__Impl_in_rule__Relation__Group_4__22914);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1407:1: rule__Relation__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Relation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1411:1: ( ( '}' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1412:1: ( '}' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1412:1: ( '}' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1413:1: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,27,FOLLOW_27_in_rule__Relation__Group_4__2__Impl2942); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1432:1: rule__Relation__Group_7__0 : rule__Relation__Group_7__0__Impl rule__Relation__Group_7__1 ;
    public final void rule__Relation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1436:1: ( rule__Relation__Group_7__0__Impl rule__Relation__Group_7__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1437:2: rule__Relation__Group_7__0__Impl rule__Relation__Group_7__1
            {
            pushFollow(FOLLOW_rule__Relation__Group_7__0__Impl_in_rule__Relation__Group_7__02979);
            rule__Relation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_7__1_in_rule__Relation__Group_7__02982);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1444:1: rule__Relation__Group_7__0__Impl : ( '{' ) ;
    public final void rule__Relation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1448:1: ( ( '{' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1449:1: ( '{' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1449:1: ( '{' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1450:1: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_7_0()); 
            match(input,26,FOLLOW_26_in_rule__Relation__Group_7__0__Impl3010); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1463:1: rule__Relation__Group_7__1 : rule__Relation__Group_7__1__Impl rule__Relation__Group_7__2 ;
    public final void rule__Relation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1467:1: ( rule__Relation__Group_7__1__Impl rule__Relation__Group_7__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1468:2: rule__Relation__Group_7__1__Impl rule__Relation__Group_7__2
            {
            pushFollow(FOLLOW_rule__Relation__Group_7__1__Impl_in_rule__Relation__Group_7__13041);
            rule__Relation__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_7__2_in_rule__Relation__Group_7__13044);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1475:1: rule__Relation__Group_7__1__Impl : ( ( rule__Relation__ToRelationNameAssignment_7_1 ) ) ;
    public final void rule__Relation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1479:1: ( ( ( rule__Relation__ToRelationNameAssignment_7_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1480:1: ( ( rule__Relation__ToRelationNameAssignment_7_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1480:1: ( ( rule__Relation__ToRelationNameAssignment_7_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1481:1: ( rule__Relation__ToRelationNameAssignment_7_1 )
            {
             before(grammarAccess.getRelationAccess().getToRelationNameAssignment_7_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1482:1: ( rule__Relation__ToRelationNameAssignment_7_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1482:2: rule__Relation__ToRelationNameAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Relation__ToRelationNameAssignment_7_1_in_rule__Relation__Group_7__1__Impl3071);
            rule__Relation__ToRelationNameAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getToRelationNameAssignment_7_1()); 

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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1492:1: rule__Relation__Group_7__2 : rule__Relation__Group_7__2__Impl ;
    public final void rule__Relation__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1496:1: ( rule__Relation__Group_7__2__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1497:2: rule__Relation__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_7__2__Impl_in_rule__Relation__Group_7__23101);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1503:1: rule__Relation__Group_7__2__Impl : ( '}' ) ;
    public final void rule__Relation__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1507:1: ( ( '}' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1508:1: ( '}' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1508:1: ( '}' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1509:1: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_7_2()); 
            match(input,27,FOLLOW_27_in_rule__Relation__Group_7__2__Impl3129); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1528:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1532:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1533:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__03166);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__03169);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1540:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1544:1: ( ( 'enum' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1545:1: ( 'enum' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1545:1: ( 'enum' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1546:1: 'enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Enum__Group__0__Impl3197); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1559:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1563:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1564:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__13228);
            rule__Enum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__13231);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1571:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1575:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1576:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1576:1: ( ( rule__Enum__NameAssignment_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1577:1: ( rule__Enum__NameAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1578:1: ( rule__Enum__NameAssignment_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1578:2: rule__Enum__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl3258);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1588:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1592:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1593:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__23288);
            rule__Enum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__23291);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1600:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1604:1: ( ( '{' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1605:1: ( '{' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1605:1: ( '{' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1606:1: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Enum__Group__2__Impl3319); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1619:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1623:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1624:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__33350);
            rule__Enum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__33353);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1631:1: rule__Enum__Group__3__Impl : ( ( rule__Enum__LiteralsAssignment_3 ) ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1635:1: ( ( ( rule__Enum__LiteralsAssignment_3 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1636:1: ( ( rule__Enum__LiteralsAssignment_3 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1636:1: ( ( rule__Enum__LiteralsAssignment_3 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1637:1: ( rule__Enum__LiteralsAssignment_3 )
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_3()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1638:1: ( rule__Enum__LiteralsAssignment_3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1638:2: rule__Enum__LiteralsAssignment_3
            {
            pushFollow(FOLLOW_rule__Enum__LiteralsAssignment_3_in_rule__Enum__Group__3__Impl3380);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1648:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1652:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1653:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
            {
            pushFollow(FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__43410);
            rule__Enum__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__43413);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1660:1: rule__Enum__Group__4__Impl : ( ( rule__Enum__Group_4__0 )* ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1664:1: ( ( ( rule__Enum__Group_4__0 )* ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1665:1: ( ( rule__Enum__Group_4__0 )* )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1665:1: ( ( rule__Enum__Group_4__0 )* )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1666:1: ( rule__Enum__Group_4__0 )*
            {
             before(grammarAccess.getEnumAccess().getGroup_4()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1667:1: ( rule__Enum__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1667:2: rule__Enum__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Enum__Group_4__0_in_rule__Enum__Group__4__Impl3440);
            	    rule__Enum__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1677:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1681:1: ( rule__Enum__Group__5__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1682:2: rule__Enum__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__53471);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1688:1: rule__Enum__Group__5__Impl : ( '}' ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1692:1: ( ( '}' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1693:1: ( '}' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1693:1: ( '}' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1694:1: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_27_in_rule__Enum__Group__5__Impl3499); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1719:1: rule__Enum__Group_4__0 : rule__Enum__Group_4__0__Impl rule__Enum__Group_4__1 ;
    public final void rule__Enum__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1723:1: ( rule__Enum__Group_4__0__Impl rule__Enum__Group_4__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1724:2: rule__Enum__Group_4__0__Impl rule__Enum__Group_4__1
            {
            pushFollow(FOLLOW_rule__Enum__Group_4__0__Impl_in_rule__Enum__Group_4__03542);
            rule__Enum__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group_4__1_in_rule__Enum__Group_4__03545);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1731:1: rule__Enum__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Enum__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1735:1: ( ( ',' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1736:1: ( ',' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1736:1: ( ',' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1737:1: ','
            {
             before(grammarAccess.getEnumAccess().getCommaKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__Enum__Group_4__0__Impl3573); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1750:1: rule__Enum__Group_4__1 : rule__Enum__Group_4__1__Impl ;
    public final void rule__Enum__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1754:1: ( rule__Enum__Group_4__1__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1755:2: rule__Enum__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group_4__1__Impl_in_rule__Enum__Group_4__13604);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1761:1: rule__Enum__Group_4__1__Impl : ( ( rule__Enum__LiteralsAssignment_4_1 ) ) ;
    public final void rule__Enum__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1765:1: ( ( ( rule__Enum__LiteralsAssignment_4_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1766:1: ( ( rule__Enum__LiteralsAssignment_4_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1766:1: ( ( rule__Enum__LiteralsAssignment_4_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1767:1: ( rule__Enum__LiteralsAssignment_4_1 )
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_4_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1768:1: ( rule__Enum__LiteralsAssignment_4_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1768:2: rule__Enum__LiteralsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Enum__LiteralsAssignment_4_1_in_rule__Enum__Group_4__1__Impl3631);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1782:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1786:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1787:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__03665);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__03668);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1794:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1798:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1799:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1799:1: ( ( rule__Field__NameAssignment_0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1800:1: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1801:1: ( rule__Field__NameAssignment_0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1801:2: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl3695);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1811:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1815:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1816:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13725);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__13728);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1823:1: rule__Field__Group__1__Impl : ( ( rule__Field__TypeAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1827:1: ( ( ( rule__Field__TypeAssignment_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1828:1: ( ( rule__Field__TypeAssignment_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1828:1: ( ( rule__Field__TypeAssignment_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1829:1: ( rule__Field__TypeAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1830:1: ( rule__Field__TypeAssignment_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1830:2: rule__Field__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__TypeAssignment_1_in_rule__Field__Group__1__Impl3755);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1840:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1844:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1845:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23785);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__23788);
            rule__Field__Group__3();

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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1852:1: rule__Field__Group__2__Impl : ( ( rule__Field__RequiredAssignment_2 )? ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1856:1: ( ( ( rule__Field__RequiredAssignment_2 )? ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1857:1: ( ( rule__Field__RequiredAssignment_2 )? )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1857:1: ( ( rule__Field__RequiredAssignment_2 )? )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1858:1: ( rule__Field__RequiredAssignment_2 )?
            {
             before(grammarAccess.getFieldAccess().getRequiredAssignment_2()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1859:1: ( rule__Field__RequiredAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1859:2: rule__Field__RequiredAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Field__RequiredAssignment_2_in_rule__Field__Group__2__Impl3815);
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


    // $ANTLR start "rule__Field__Group__3"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1869:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1873:1: ( rule__Field__Group__3__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1874:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__33846);
            rule__Field__Group__3__Impl();

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
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1880:1: rule__Field__Group__3__Impl : ( ( rule__Field__ValidationRulesAssignment_3 )* ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1884:1: ( ( ( rule__Field__ValidationRulesAssignment_3 )* ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1885:1: ( ( rule__Field__ValidationRulesAssignment_3 )* )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1885:1: ( ( rule__Field__ValidationRulesAssignment_3 )* )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1886:1: ( rule__Field__ValidationRulesAssignment_3 )*
            {
             before(grammarAccess.getFieldAccess().getValidationRulesAssignment_3()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1887:1: ( rule__Field__ValidationRulesAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32||(LA13_0>=35 && LA13_0<=38)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1887:2: rule__Field__ValidationRulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Field__ValidationRulesAssignment_3_in_rule__Field__Group__3__Impl3873);
            	    rule__Field__ValidationRulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getFieldAccess().getValidationRulesAssignment_3()); 

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
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__StringMinSpecification__Group__0"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1905:1: rule__StringMinSpecification__Group__0 : rule__StringMinSpecification__Group__0__Impl rule__StringMinSpecification__Group__1 ;
    public final void rule__StringMinSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1909:1: ( rule__StringMinSpecification__Group__0__Impl rule__StringMinSpecification__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1910:2: rule__StringMinSpecification__Group__0__Impl rule__StringMinSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__StringMinSpecification__Group__0__Impl_in_rule__StringMinSpecification__Group__03912);
            rule__StringMinSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringMinSpecification__Group__1_in_rule__StringMinSpecification__Group__03915);
            rule__StringMinSpecification__Group__1();

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
    // $ANTLR end "rule__StringMinSpecification__Group__0"


    // $ANTLR start "rule__StringMinSpecification__Group__0__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1917:1: rule__StringMinSpecification__Group__0__Impl : ( 'minlength' ) ;
    public final void rule__StringMinSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1921:1: ( ( 'minlength' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1922:1: ( 'minlength' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1922:1: ( 'minlength' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1923:1: 'minlength'
            {
             before(grammarAccess.getStringMinSpecificationAccess().getMinlengthKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__StringMinSpecification__Group__0__Impl3943); 
             after(grammarAccess.getStringMinSpecificationAccess().getMinlengthKeyword_0()); 

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
    // $ANTLR end "rule__StringMinSpecification__Group__0__Impl"


    // $ANTLR start "rule__StringMinSpecification__Group__1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1936:1: rule__StringMinSpecification__Group__1 : rule__StringMinSpecification__Group__1__Impl rule__StringMinSpecification__Group__2 ;
    public final void rule__StringMinSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1940:1: ( rule__StringMinSpecification__Group__1__Impl rule__StringMinSpecification__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1941:2: rule__StringMinSpecification__Group__1__Impl rule__StringMinSpecification__Group__2
            {
            pushFollow(FOLLOW_rule__StringMinSpecification__Group__1__Impl_in_rule__StringMinSpecification__Group__13974);
            rule__StringMinSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringMinSpecification__Group__2_in_rule__StringMinSpecification__Group__13977);
            rule__StringMinSpecification__Group__2();

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
    // $ANTLR end "rule__StringMinSpecification__Group__1"


    // $ANTLR start "rule__StringMinSpecification__Group__1__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1948:1: rule__StringMinSpecification__Group__1__Impl : ( '(' ) ;
    public final void rule__StringMinSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1952:1: ( ( '(' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1953:1: ( '(' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1953:1: ( '(' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1954:1: '('
            {
             before(grammarAccess.getStringMinSpecificationAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__StringMinSpecification__Group__1__Impl4005); 
             after(grammarAccess.getStringMinSpecificationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__StringMinSpecification__Group__1__Impl"


    // $ANTLR start "rule__StringMinSpecification__Group__2"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1967:1: rule__StringMinSpecification__Group__2 : rule__StringMinSpecification__Group__2__Impl rule__StringMinSpecification__Group__3 ;
    public final void rule__StringMinSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1971:1: ( rule__StringMinSpecification__Group__2__Impl rule__StringMinSpecification__Group__3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1972:2: rule__StringMinSpecification__Group__2__Impl rule__StringMinSpecification__Group__3
            {
            pushFollow(FOLLOW_rule__StringMinSpecification__Group__2__Impl_in_rule__StringMinSpecification__Group__24036);
            rule__StringMinSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringMinSpecification__Group__3_in_rule__StringMinSpecification__Group__24039);
            rule__StringMinSpecification__Group__3();

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
    // $ANTLR end "rule__StringMinSpecification__Group__2"


    // $ANTLR start "rule__StringMinSpecification__Group__2__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1979:1: rule__StringMinSpecification__Group__2__Impl : ( ( rule__StringMinSpecification__MinAssignment_2 ) ) ;
    public final void rule__StringMinSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1983:1: ( ( ( rule__StringMinSpecification__MinAssignment_2 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1984:1: ( ( rule__StringMinSpecification__MinAssignment_2 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1984:1: ( ( rule__StringMinSpecification__MinAssignment_2 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1985:1: ( rule__StringMinSpecification__MinAssignment_2 )
            {
             before(grammarAccess.getStringMinSpecificationAccess().getMinAssignment_2()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1986:1: ( rule__StringMinSpecification__MinAssignment_2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1986:2: rule__StringMinSpecification__MinAssignment_2
            {
            pushFollow(FOLLOW_rule__StringMinSpecification__MinAssignment_2_in_rule__StringMinSpecification__Group__2__Impl4066);
            rule__StringMinSpecification__MinAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStringMinSpecificationAccess().getMinAssignment_2()); 

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
    // $ANTLR end "rule__StringMinSpecification__Group__2__Impl"


    // $ANTLR start "rule__StringMinSpecification__Group__3"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1996:1: rule__StringMinSpecification__Group__3 : rule__StringMinSpecification__Group__3__Impl ;
    public final void rule__StringMinSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2000:1: ( rule__StringMinSpecification__Group__3__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2001:2: rule__StringMinSpecification__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StringMinSpecification__Group__3__Impl_in_rule__StringMinSpecification__Group__34096);
            rule__StringMinSpecification__Group__3__Impl();

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
    // $ANTLR end "rule__StringMinSpecification__Group__3"


    // $ANTLR start "rule__StringMinSpecification__Group__3__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2007:1: rule__StringMinSpecification__Group__3__Impl : ( ')' ) ;
    public final void rule__StringMinSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2011:1: ( ( ')' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2012:1: ( ')' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2012:1: ( ')' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2013:1: ')'
            {
             before(grammarAccess.getStringMinSpecificationAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__StringMinSpecification__Group__3__Impl4124); 
             after(grammarAccess.getStringMinSpecificationAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__StringMinSpecification__Group__3__Impl"


    // $ANTLR start "rule__StringMaxSpecification__Group__0"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2034:1: rule__StringMaxSpecification__Group__0 : rule__StringMaxSpecification__Group__0__Impl rule__StringMaxSpecification__Group__1 ;
    public final void rule__StringMaxSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2038:1: ( rule__StringMaxSpecification__Group__0__Impl rule__StringMaxSpecification__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2039:2: rule__StringMaxSpecification__Group__0__Impl rule__StringMaxSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__StringMaxSpecification__Group__0__Impl_in_rule__StringMaxSpecification__Group__04163);
            rule__StringMaxSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringMaxSpecification__Group__1_in_rule__StringMaxSpecification__Group__04166);
            rule__StringMaxSpecification__Group__1();

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
    // $ANTLR end "rule__StringMaxSpecification__Group__0"


    // $ANTLR start "rule__StringMaxSpecification__Group__0__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2046:1: rule__StringMaxSpecification__Group__0__Impl : ( 'maxlength' ) ;
    public final void rule__StringMaxSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2050:1: ( ( 'maxlength' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2051:1: ( 'maxlength' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2051:1: ( 'maxlength' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2052:1: 'maxlength'
            {
             before(grammarAccess.getStringMaxSpecificationAccess().getMaxlengthKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__StringMaxSpecification__Group__0__Impl4194); 
             after(grammarAccess.getStringMaxSpecificationAccess().getMaxlengthKeyword_0()); 

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
    // $ANTLR end "rule__StringMaxSpecification__Group__0__Impl"


    // $ANTLR start "rule__StringMaxSpecification__Group__1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2065:1: rule__StringMaxSpecification__Group__1 : rule__StringMaxSpecification__Group__1__Impl rule__StringMaxSpecification__Group__2 ;
    public final void rule__StringMaxSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2069:1: ( rule__StringMaxSpecification__Group__1__Impl rule__StringMaxSpecification__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2070:2: rule__StringMaxSpecification__Group__1__Impl rule__StringMaxSpecification__Group__2
            {
            pushFollow(FOLLOW_rule__StringMaxSpecification__Group__1__Impl_in_rule__StringMaxSpecification__Group__14225);
            rule__StringMaxSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringMaxSpecification__Group__2_in_rule__StringMaxSpecification__Group__14228);
            rule__StringMaxSpecification__Group__2();

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
    // $ANTLR end "rule__StringMaxSpecification__Group__1"


    // $ANTLR start "rule__StringMaxSpecification__Group__1__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2077:1: rule__StringMaxSpecification__Group__1__Impl : ( '(' ) ;
    public final void rule__StringMaxSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2081:1: ( ( '(' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2082:1: ( '(' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2082:1: ( '(' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2083:1: '('
            {
             before(grammarAccess.getStringMaxSpecificationAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__StringMaxSpecification__Group__1__Impl4256); 
             after(grammarAccess.getStringMaxSpecificationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__StringMaxSpecification__Group__1__Impl"


    // $ANTLR start "rule__StringMaxSpecification__Group__2"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2096:1: rule__StringMaxSpecification__Group__2 : rule__StringMaxSpecification__Group__2__Impl rule__StringMaxSpecification__Group__3 ;
    public final void rule__StringMaxSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2100:1: ( rule__StringMaxSpecification__Group__2__Impl rule__StringMaxSpecification__Group__3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2101:2: rule__StringMaxSpecification__Group__2__Impl rule__StringMaxSpecification__Group__3
            {
            pushFollow(FOLLOW_rule__StringMaxSpecification__Group__2__Impl_in_rule__StringMaxSpecification__Group__24287);
            rule__StringMaxSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringMaxSpecification__Group__3_in_rule__StringMaxSpecification__Group__24290);
            rule__StringMaxSpecification__Group__3();

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
    // $ANTLR end "rule__StringMaxSpecification__Group__2"


    // $ANTLR start "rule__StringMaxSpecification__Group__2__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2108:1: rule__StringMaxSpecification__Group__2__Impl : ( ( rule__StringMaxSpecification__MaxAssignment_2 ) ) ;
    public final void rule__StringMaxSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2112:1: ( ( ( rule__StringMaxSpecification__MaxAssignment_2 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2113:1: ( ( rule__StringMaxSpecification__MaxAssignment_2 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2113:1: ( ( rule__StringMaxSpecification__MaxAssignment_2 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2114:1: ( rule__StringMaxSpecification__MaxAssignment_2 )
            {
             before(grammarAccess.getStringMaxSpecificationAccess().getMaxAssignment_2()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2115:1: ( rule__StringMaxSpecification__MaxAssignment_2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2115:2: rule__StringMaxSpecification__MaxAssignment_2
            {
            pushFollow(FOLLOW_rule__StringMaxSpecification__MaxAssignment_2_in_rule__StringMaxSpecification__Group__2__Impl4317);
            rule__StringMaxSpecification__MaxAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStringMaxSpecificationAccess().getMaxAssignment_2()); 

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
    // $ANTLR end "rule__StringMaxSpecification__Group__2__Impl"


    // $ANTLR start "rule__StringMaxSpecification__Group__3"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2125:1: rule__StringMaxSpecification__Group__3 : rule__StringMaxSpecification__Group__3__Impl ;
    public final void rule__StringMaxSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2129:1: ( rule__StringMaxSpecification__Group__3__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2130:2: rule__StringMaxSpecification__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StringMaxSpecification__Group__3__Impl_in_rule__StringMaxSpecification__Group__34347);
            rule__StringMaxSpecification__Group__3__Impl();

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
    // $ANTLR end "rule__StringMaxSpecification__Group__3"


    // $ANTLR start "rule__StringMaxSpecification__Group__3__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2136:1: rule__StringMaxSpecification__Group__3__Impl : ( ')' ) ;
    public final void rule__StringMaxSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2140:1: ( ( ')' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2141:1: ( ')' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2141:1: ( ')' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2142:1: ')'
            {
             before(grammarAccess.getStringMaxSpecificationAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__StringMaxSpecification__Group__3__Impl4375); 
             after(grammarAccess.getStringMaxSpecificationAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__StringMaxSpecification__Group__3__Impl"


    // $ANTLR start "rule__IntegerMinSpecification__Group__0"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2163:1: rule__IntegerMinSpecification__Group__0 : rule__IntegerMinSpecification__Group__0__Impl rule__IntegerMinSpecification__Group__1 ;
    public final void rule__IntegerMinSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2167:1: ( rule__IntegerMinSpecification__Group__0__Impl rule__IntegerMinSpecification__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2168:2: rule__IntegerMinSpecification__Group__0__Impl rule__IntegerMinSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__IntegerMinSpecification__Group__0__Impl_in_rule__IntegerMinSpecification__Group__04414);
            rule__IntegerMinSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerMinSpecification__Group__1_in_rule__IntegerMinSpecification__Group__04417);
            rule__IntegerMinSpecification__Group__1();

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
    // $ANTLR end "rule__IntegerMinSpecification__Group__0"


    // $ANTLR start "rule__IntegerMinSpecification__Group__0__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2175:1: rule__IntegerMinSpecification__Group__0__Impl : ( 'min' ) ;
    public final void rule__IntegerMinSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2179:1: ( ( 'min' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2180:1: ( 'min' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2180:1: ( 'min' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2181:1: 'min'
            {
             before(grammarAccess.getIntegerMinSpecificationAccess().getMinKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__IntegerMinSpecification__Group__0__Impl4445); 
             after(grammarAccess.getIntegerMinSpecificationAccess().getMinKeyword_0()); 

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
    // $ANTLR end "rule__IntegerMinSpecification__Group__0__Impl"


    // $ANTLR start "rule__IntegerMinSpecification__Group__1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2194:1: rule__IntegerMinSpecification__Group__1 : rule__IntegerMinSpecification__Group__1__Impl rule__IntegerMinSpecification__Group__2 ;
    public final void rule__IntegerMinSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2198:1: ( rule__IntegerMinSpecification__Group__1__Impl rule__IntegerMinSpecification__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2199:2: rule__IntegerMinSpecification__Group__1__Impl rule__IntegerMinSpecification__Group__2
            {
            pushFollow(FOLLOW_rule__IntegerMinSpecification__Group__1__Impl_in_rule__IntegerMinSpecification__Group__14476);
            rule__IntegerMinSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerMinSpecification__Group__2_in_rule__IntegerMinSpecification__Group__14479);
            rule__IntegerMinSpecification__Group__2();

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
    // $ANTLR end "rule__IntegerMinSpecification__Group__1"


    // $ANTLR start "rule__IntegerMinSpecification__Group__1__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2206:1: rule__IntegerMinSpecification__Group__1__Impl : ( '(' ) ;
    public final void rule__IntegerMinSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2210:1: ( ( '(' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2211:1: ( '(' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2211:1: ( '(' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2212:1: '('
            {
             before(grammarAccess.getIntegerMinSpecificationAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__IntegerMinSpecification__Group__1__Impl4507); 
             after(grammarAccess.getIntegerMinSpecificationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__IntegerMinSpecification__Group__1__Impl"


    // $ANTLR start "rule__IntegerMinSpecification__Group__2"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2225:1: rule__IntegerMinSpecification__Group__2 : rule__IntegerMinSpecification__Group__2__Impl rule__IntegerMinSpecification__Group__3 ;
    public final void rule__IntegerMinSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2229:1: ( rule__IntegerMinSpecification__Group__2__Impl rule__IntegerMinSpecification__Group__3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2230:2: rule__IntegerMinSpecification__Group__2__Impl rule__IntegerMinSpecification__Group__3
            {
            pushFollow(FOLLOW_rule__IntegerMinSpecification__Group__2__Impl_in_rule__IntegerMinSpecification__Group__24538);
            rule__IntegerMinSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerMinSpecification__Group__3_in_rule__IntegerMinSpecification__Group__24541);
            rule__IntegerMinSpecification__Group__3();

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
    // $ANTLR end "rule__IntegerMinSpecification__Group__2"


    // $ANTLR start "rule__IntegerMinSpecification__Group__2__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2237:1: rule__IntegerMinSpecification__Group__2__Impl : ( ( rule__IntegerMinSpecification__MinAssignment_2 ) ) ;
    public final void rule__IntegerMinSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2241:1: ( ( ( rule__IntegerMinSpecification__MinAssignment_2 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2242:1: ( ( rule__IntegerMinSpecification__MinAssignment_2 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2242:1: ( ( rule__IntegerMinSpecification__MinAssignment_2 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2243:1: ( rule__IntegerMinSpecification__MinAssignment_2 )
            {
             before(grammarAccess.getIntegerMinSpecificationAccess().getMinAssignment_2()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2244:1: ( rule__IntegerMinSpecification__MinAssignment_2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2244:2: rule__IntegerMinSpecification__MinAssignment_2
            {
            pushFollow(FOLLOW_rule__IntegerMinSpecification__MinAssignment_2_in_rule__IntegerMinSpecification__Group__2__Impl4568);
            rule__IntegerMinSpecification__MinAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerMinSpecificationAccess().getMinAssignment_2()); 

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
    // $ANTLR end "rule__IntegerMinSpecification__Group__2__Impl"


    // $ANTLR start "rule__IntegerMinSpecification__Group__3"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2254:1: rule__IntegerMinSpecification__Group__3 : rule__IntegerMinSpecification__Group__3__Impl ;
    public final void rule__IntegerMinSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2258:1: ( rule__IntegerMinSpecification__Group__3__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2259:2: rule__IntegerMinSpecification__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__IntegerMinSpecification__Group__3__Impl_in_rule__IntegerMinSpecification__Group__34598);
            rule__IntegerMinSpecification__Group__3__Impl();

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
    // $ANTLR end "rule__IntegerMinSpecification__Group__3"


    // $ANTLR start "rule__IntegerMinSpecification__Group__3__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2265:1: rule__IntegerMinSpecification__Group__3__Impl : ( ')' ) ;
    public final void rule__IntegerMinSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2269:1: ( ( ')' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2270:1: ( ')' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2270:1: ( ')' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2271:1: ')'
            {
             before(grammarAccess.getIntegerMinSpecificationAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__IntegerMinSpecification__Group__3__Impl4626); 
             after(grammarAccess.getIntegerMinSpecificationAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__IntegerMinSpecification__Group__3__Impl"


    // $ANTLR start "rule__IntegerMaxSpecification__Group__0"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2292:1: rule__IntegerMaxSpecification__Group__0 : rule__IntegerMaxSpecification__Group__0__Impl rule__IntegerMaxSpecification__Group__1 ;
    public final void rule__IntegerMaxSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2296:1: ( rule__IntegerMaxSpecification__Group__0__Impl rule__IntegerMaxSpecification__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2297:2: rule__IntegerMaxSpecification__Group__0__Impl rule__IntegerMaxSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__IntegerMaxSpecification__Group__0__Impl_in_rule__IntegerMaxSpecification__Group__04665);
            rule__IntegerMaxSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerMaxSpecification__Group__1_in_rule__IntegerMaxSpecification__Group__04668);
            rule__IntegerMaxSpecification__Group__1();

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
    // $ANTLR end "rule__IntegerMaxSpecification__Group__0"


    // $ANTLR start "rule__IntegerMaxSpecification__Group__0__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2304:1: rule__IntegerMaxSpecification__Group__0__Impl : ( 'max' ) ;
    public final void rule__IntegerMaxSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2308:1: ( ( 'max' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2309:1: ( 'max' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2309:1: ( 'max' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2310:1: 'max'
            {
             before(grammarAccess.getIntegerMaxSpecificationAccess().getMaxKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__IntegerMaxSpecification__Group__0__Impl4696); 
             after(grammarAccess.getIntegerMaxSpecificationAccess().getMaxKeyword_0()); 

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
    // $ANTLR end "rule__IntegerMaxSpecification__Group__0__Impl"


    // $ANTLR start "rule__IntegerMaxSpecification__Group__1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2323:1: rule__IntegerMaxSpecification__Group__1 : rule__IntegerMaxSpecification__Group__1__Impl rule__IntegerMaxSpecification__Group__2 ;
    public final void rule__IntegerMaxSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2327:1: ( rule__IntegerMaxSpecification__Group__1__Impl rule__IntegerMaxSpecification__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2328:2: rule__IntegerMaxSpecification__Group__1__Impl rule__IntegerMaxSpecification__Group__2
            {
            pushFollow(FOLLOW_rule__IntegerMaxSpecification__Group__1__Impl_in_rule__IntegerMaxSpecification__Group__14727);
            rule__IntegerMaxSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerMaxSpecification__Group__2_in_rule__IntegerMaxSpecification__Group__14730);
            rule__IntegerMaxSpecification__Group__2();

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
    // $ANTLR end "rule__IntegerMaxSpecification__Group__1"


    // $ANTLR start "rule__IntegerMaxSpecification__Group__1__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2335:1: rule__IntegerMaxSpecification__Group__1__Impl : ( '(' ) ;
    public final void rule__IntegerMaxSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2339:1: ( ( '(' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2340:1: ( '(' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2340:1: ( '(' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2341:1: '('
            {
             before(grammarAccess.getIntegerMaxSpecificationAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__IntegerMaxSpecification__Group__1__Impl4758); 
             after(grammarAccess.getIntegerMaxSpecificationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__IntegerMaxSpecification__Group__1__Impl"


    // $ANTLR start "rule__IntegerMaxSpecification__Group__2"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2354:1: rule__IntegerMaxSpecification__Group__2 : rule__IntegerMaxSpecification__Group__2__Impl rule__IntegerMaxSpecification__Group__3 ;
    public final void rule__IntegerMaxSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2358:1: ( rule__IntegerMaxSpecification__Group__2__Impl rule__IntegerMaxSpecification__Group__3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2359:2: rule__IntegerMaxSpecification__Group__2__Impl rule__IntegerMaxSpecification__Group__3
            {
            pushFollow(FOLLOW_rule__IntegerMaxSpecification__Group__2__Impl_in_rule__IntegerMaxSpecification__Group__24789);
            rule__IntegerMaxSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerMaxSpecification__Group__3_in_rule__IntegerMaxSpecification__Group__24792);
            rule__IntegerMaxSpecification__Group__3();

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
    // $ANTLR end "rule__IntegerMaxSpecification__Group__2"


    // $ANTLR start "rule__IntegerMaxSpecification__Group__2__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2366:1: rule__IntegerMaxSpecification__Group__2__Impl : ( ( rule__IntegerMaxSpecification__MaxAssignment_2 ) ) ;
    public final void rule__IntegerMaxSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2370:1: ( ( ( rule__IntegerMaxSpecification__MaxAssignment_2 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2371:1: ( ( rule__IntegerMaxSpecification__MaxAssignment_2 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2371:1: ( ( rule__IntegerMaxSpecification__MaxAssignment_2 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2372:1: ( rule__IntegerMaxSpecification__MaxAssignment_2 )
            {
             before(grammarAccess.getIntegerMaxSpecificationAccess().getMaxAssignment_2()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2373:1: ( rule__IntegerMaxSpecification__MaxAssignment_2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2373:2: rule__IntegerMaxSpecification__MaxAssignment_2
            {
            pushFollow(FOLLOW_rule__IntegerMaxSpecification__MaxAssignment_2_in_rule__IntegerMaxSpecification__Group__2__Impl4819);
            rule__IntegerMaxSpecification__MaxAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerMaxSpecificationAccess().getMaxAssignment_2()); 

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
    // $ANTLR end "rule__IntegerMaxSpecification__Group__2__Impl"


    // $ANTLR start "rule__IntegerMaxSpecification__Group__3"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2383:1: rule__IntegerMaxSpecification__Group__3 : rule__IntegerMaxSpecification__Group__3__Impl ;
    public final void rule__IntegerMaxSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2387:1: ( rule__IntegerMaxSpecification__Group__3__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2388:2: rule__IntegerMaxSpecification__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__IntegerMaxSpecification__Group__3__Impl_in_rule__IntegerMaxSpecification__Group__34849);
            rule__IntegerMaxSpecification__Group__3__Impl();

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
    // $ANTLR end "rule__IntegerMaxSpecification__Group__3"


    // $ANTLR start "rule__IntegerMaxSpecification__Group__3__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2394:1: rule__IntegerMaxSpecification__Group__3__Impl : ( ')' ) ;
    public final void rule__IntegerMaxSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2398:1: ( ( ')' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2399:1: ( ')' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2399:1: ( ')' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2400:1: ')'
            {
             before(grammarAccess.getIntegerMaxSpecificationAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__IntegerMaxSpecification__Group__3__Impl4877); 
             after(grammarAccess.getIntegerMaxSpecificationAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__IntegerMaxSpecification__Group__3__Impl"


    // $ANTLR start "rule__Pattern__Group__0"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2421:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2425:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2426:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_rule__Pattern__Group__0__Impl_in_rule__Pattern__Group__04916);
            rule__Pattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pattern__Group__1_in_rule__Pattern__Group__04919);
            rule__Pattern__Group__1();

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
    // $ANTLR end "rule__Pattern__Group__0"


    // $ANTLR start "rule__Pattern__Group__0__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2433:1: rule__Pattern__Group__0__Impl : ( 'pattern' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2437:1: ( ( 'pattern' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2438:1: ( 'pattern' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2438:1: ( 'pattern' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2439:1: 'pattern'
            {
             before(grammarAccess.getPatternAccess().getPatternKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Pattern__Group__0__Impl4947); 
             after(grammarAccess.getPatternAccess().getPatternKeyword_0()); 

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
    // $ANTLR end "rule__Pattern__Group__0__Impl"


    // $ANTLR start "rule__Pattern__Group__1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2452:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2456:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2457:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_rule__Pattern__Group__1__Impl_in_rule__Pattern__Group__14978);
            rule__Pattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pattern__Group__2_in_rule__Pattern__Group__14981);
            rule__Pattern__Group__2();

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
    // $ANTLR end "rule__Pattern__Group__1"


    // $ANTLR start "rule__Pattern__Group__1__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2464:1: rule__Pattern__Group__1__Impl : ( '(' ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2468:1: ( ( '(' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2469:1: ( '(' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2469:1: ( '(' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2470:1: '('
            {
             before(grammarAccess.getPatternAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Pattern__Group__1__Impl5009); 
             after(grammarAccess.getPatternAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Pattern__Group__1__Impl"


    // $ANTLR start "rule__Pattern__Group__2"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2483:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2487:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2488:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_rule__Pattern__Group__2__Impl_in_rule__Pattern__Group__25040);
            rule__Pattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pattern__Group__3_in_rule__Pattern__Group__25043);
            rule__Pattern__Group__3();

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
    // $ANTLR end "rule__Pattern__Group__2"


    // $ANTLR start "rule__Pattern__Group__2__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2495:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__RegexAssignment_2 ) ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2499:1: ( ( ( rule__Pattern__RegexAssignment_2 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2500:1: ( ( rule__Pattern__RegexAssignment_2 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2500:1: ( ( rule__Pattern__RegexAssignment_2 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2501:1: ( rule__Pattern__RegexAssignment_2 )
            {
             before(grammarAccess.getPatternAccess().getRegexAssignment_2()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2502:1: ( rule__Pattern__RegexAssignment_2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2502:2: rule__Pattern__RegexAssignment_2
            {
            pushFollow(FOLLOW_rule__Pattern__RegexAssignment_2_in_rule__Pattern__Group__2__Impl5070);
            rule__Pattern__RegexAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getRegexAssignment_2()); 

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
    // $ANTLR end "rule__Pattern__Group__2__Impl"


    // $ANTLR start "rule__Pattern__Group__3"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2512:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2516:1: ( rule__Pattern__Group__3__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2517:2: rule__Pattern__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Pattern__Group__3__Impl_in_rule__Pattern__Group__35100);
            rule__Pattern__Group__3__Impl();

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
    // $ANTLR end "rule__Pattern__Group__3"


    // $ANTLR start "rule__Pattern__Group__3__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2523:1: rule__Pattern__Group__3__Impl : ( ')' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2527:1: ( ( ')' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2528:1: ( ')' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2528:1: ( ')' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2529:1: ')'
            {
             before(grammarAccess.getPatternAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__Pattern__Group__3__Impl5128); 
             after(grammarAccess.getPatternAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Pattern__Group__3__Impl"


    // $ANTLR start "rule__Domain__ElementsAssignment"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2551:1: rule__Domain__ElementsAssignment : ( ruleDomainElement ) ;
    public final void rule__Domain__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2555:1: ( ( ruleDomainElement ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2556:1: ( ruleDomainElement )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2556:1: ( ruleDomainElement )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2557:1: ruleDomainElement
            {
             before(grammarAccess.getDomainAccess().getElementsDomainElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDomainElement_in_rule__Domain__ElementsAssignment5172);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2566:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2570:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2571:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2571:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2572:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_15203); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2581:1: rule__Entity__FieldsAssignment_2_1 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2585:1: ( ( ruleField ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2586:1: ( ruleField )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2586:1: ( ruleField )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2587:1: ruleField
            {
             before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__Entity__FieldsAssignment_2_15234);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2596:1: rule__Relation__TypeAssignment_1 : ( ruleRelationType ) ;
    public final void rule__Relation__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2600:1: ( ( ruleRelationType ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2601:1: ( ruleRelationType )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2601:1: ( ruleRelationType )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2602:1: ruleRelationType
            {
             before(grammarAccess.getRelationAccess().getTypeRelationTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRelationType_in_rule__Relation__TypeAssignment_15265);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2611:1: rule__Relation__FromAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2615:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2616:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2616:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2617:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getFromEntityCrossReference_3_0()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2618:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2619:1: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getFromEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relation__FromAssignment_35300); 
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


    // $ANTLR start "rule__Relation__FromRelationNameAssignment_4_1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2630:1: rule__Relation__FromRelationNameAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Relation__FromRelationNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2634:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2635:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2635:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2636:1: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getFromRelationNameIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relation__FromRelationNameAssignment_4_15335); 
             after(grammarAccess.getRelationAccess().getFromRelationNameIDTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Relation__FromRelationNameAssignment_4_1"


    // $ANTLR start "rule__Relation__ToAssignment_6"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2645:1: rule__Relation__ToAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__ToAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2649:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2650:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2650:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2651:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getToEntityCrossReference_6_0()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2652:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2653:1: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getToEntityIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relation__ToAssignment_65370); 
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


    // $ANTLR start "rule__Relation__ToRelationNameAssignment_7_1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2664:1: rule__Relation__ToRelationNameAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__Relation__ToRelationNameAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2668:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2669:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2669:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2670:1: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getToRelationNameIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relation__ToRelationNameAssignment_7_15405); 
             after(grammarAccess.getRelationAccess().getToRelationNameIDTerminalRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Relation__ToRelationNameAssignment_7_1"


    // $ANTLR start "rule__Enum__NameAssignment_1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2679:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2683:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2684:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2684:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2685:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_15436); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2694:1: rule__Enum__LiteralsAssignment_3 : ( RULE_ID ) ;
    public final void rule__Enum__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2698:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2699:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2699:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2700:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getLiteralsIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__LiteralsAssignment_35467); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2709:1: rule__Enum__LiteralsAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Enum__LiteralsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2713:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2714:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2714:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2715:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getLiteralsIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__LiteralsAssignment_4_15498); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2724:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2728:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2729:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2729:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2730:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_05529); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2739:1: rule__Field__TypeAssignment_1 : ( ruleHdlTypeReference ) ;
    public final void rule__Field__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2743:1: ( ( ruleHdlTypeReference ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2744:1: ( ruleHdlTypeReference )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2744:1: ( ruleHdlTypeReference )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2745:1: ruleHdlTypeReference
            {
             before(grammarAccess.getFieldAccess().getTypeHdlTypeReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleHdlTypeReference_in_rule__Field__TypeAssignment_15560);
            ruleHdlTypeReference();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypeHdlTypeReferenceParserRuleCall_1_0()); 

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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2754:1: rule__Field__RequiredAssignment_2 : ( ( 'required' ) ) ;
    public final void rule__Field__RequiredAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2758:1: ( ( ( 'required' ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2759:1: ( ( 'required' ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2759:1: ( ( 'required' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2760:1: ( 'required' )
            {
             before(grammarAccess.getFieldAccess().getRequiredRequiredKeyword_2_0()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2761:1: ( 'required' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2762:1: 'required'
            {
             before(grammarAccess.getFieldAccess().getRequiredRequiredKeyword_2_0()); 
            match(input,39,FOLLOW_39_in_rule__Field__RequiredAssignment_25596); 
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


    // $ANTLR start "rule__Field__ValidationRulesAssignment_3"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2777:1: rule__Field__ValidationRulesAssignment_3 : ( ruleValidationRule ) ;
    public final void rule__Field__ValidationRulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2781:1: ( ( ruleValidationRule ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2782:1: ( ruleValidationRule )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2782:1: ( ruleValidationRule )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2783:1: ruleValidationRule
            {
             before(grammarAccess.getFieldAccess().getValidationRulesValidationRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleValidationRule_in_rule__Field__ValidationRulesAssignment_35635);
            ruleValidationRule();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getValidationRulesValidationRuleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Field__ValidationRulesAssignment_3"


    // $ANTLR start "rule__StringMinSpecification__MinAssignment_2"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2792:1: rule__StringMinSpecification__MinAssignment_2 : ( RULE_INT ) ;
    public final void rule__StringMinSpecification__MinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2796:1: ( ( RULE_INT ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2797:1: ( RULE_INT )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2797:1: ( RULE_INT )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2798:1: RULE_INT
            {
             before(grammarAccess.getStringMinSpecificationAccess().getMinINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StringMinSpecification__MinAssignment_25666); 
             after(grammarAccess.getStringMinSpecificationAccess().getMinINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__StringMinSpecification__MinAssignment_2"


    // $ANTLR start "rule__StringMaxSpecification__MaxAssignment_2"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2807:1: rule__StringMaxSpecification__MaxAssignment_2 : ( RULE_INT ) ;
    public final void rule__StringMaxSpecification__MaxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2811:1: ( ( RULE_INT ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2812:1: ( RULE_INT )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2812:1: ( RULE_INT )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2813:1: RULE_INT
            {
             before(grammarAccess.getStringMaxSpecificationAccess().getMaxINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StringMaxSpecification__MaxAssignment_25697); 
             after(grammarAccess.getStringMaxSpecificationAccess().getMaxINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__StringMaxSpecification__MaxAssignment_2"


    // $ANTLR start "rule__IntegerMinSpecification__MinAssignment_2"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2822:1: rule__IntegerMinSpecification__MinAssignment_2 : ( RULE_INT ) ;
    public final void rule__IntegerMinSpecification__MinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2826:1: ( ( RULE_INT ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2827:1: ( RULE_INT )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2827:1: ( RULE_INT )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2828:1: RULE_INT
            {
             before(grammarAccess.getIntegerMinSpecificationAccess().getMinINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerMinSpecification__MinAssignment_25728); 
             after(grammarAccess.getIntegerMinSpecificationAccess().getMinINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__IntegerMinSpecification__MinAssignment_2"


    // $ANTLR start "rule__IntegerMaxSpecification__MaxAssignment_2"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2837:1: rule__IntegerMaxSpecification__MaxAssignment_2 : ( RULE_INT ) ;
    public final void rule__IntegerMaxSpecification__MaxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2841:1: ( ( RULE_INT ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2842:1: ( RULE_INT )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2842:1: ( RULE_INT )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2843:1: RULE_INT
            {
             before(grammarAccess.getIntegerMaxSpecificationAccess().getMaxINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerMaxSpecification__MaxAssignment_25759); 
             after(grammarAccess.getIntegerMaxSpecificationAccess().getMaxINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__IntegerMaxSpecification__MaxAssignment_2"


    // $ANTLR start "rule__Pattern__RegexAssignment_2"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2852:1: rule__Pattern__RegexAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Pattern__RegexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2856:1: ( ( RULE_STRING ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2857:1: ( RULE_STRING )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2857:1: ( RULE_STRING )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2858:1: RULE_STRING
            {
             before(grammarAccess.getPatternAccess().getRegexSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Pattern__RegexAssignment_25790); 
             after(grammarAccess.getPatternAccess().getRegexSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Pattern__RegexAssignment_2"


    // $ANTLR start "rule__EnumTypeReference__TypeAssignment"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2867:1: rule__EnumTypeReference__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__EnumTypeReference__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2871:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2872:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2872:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2873:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumTypeReferenceAccess().getTypeEnumCrossReference_0()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2874:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2875:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeReferenceAccess().getTypeEnumIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumTypeReference__TypeAssignment5825); 
             after(grammarAccess.getEnumTypeReferenceAccess().getTypeEnumIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getEnumTypeReferenceAccess().getTypeEnumCrossReference_0()); 

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
    // $ANTLR end "rule__EnumTypeReference__TypeAssignment"


    // $ANTLR start "rule__PrimitiveTypeReference__TypeAssignment"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2886:1: rule__PrimitiveTypeReference__TypeAssignment : ( ruleJHipsterType ) ;
    public final void rule__PrimitiveTypeReference__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2890:1: ( ( ruleJHipsterType ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2891:1: ( ruleJHipsterType )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2891:1: ( ruleJHipsterType )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2892:1: ruleJHipsterType
            {
             before(grammarAccess.getPrimitiveTypeReferenceAccess().getTypeJHipsterTypeEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleJHipsterType_in_rule__PrimitiveTypeReference__TypeAssignment5860);
            ruleJHipsterType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeReferenceAccess().getTypeJHipsterTypeEnumRuleCall_0()); 

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
    // $ANTLR end "rule__PrimitiveTypeReference__TypeAssignment"

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
    public static final BitSet FOLLOW_ruleValidationRule_in_entryRuleValidationRule422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidationRule429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValidationRule__Alternatives_in_ruleValidationRule455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueRange_in_entryRuleValueRange482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueRange489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueRange__Alternatives_in_ruleValueRange515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinSpecification_in_entryRuleMinSpecification542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinSpecification549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MinSpecification__Alternatives_in_ruleMinSpecification575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxSpecification_in_entryRuleMaxSpecification602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxSpecification609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaxSpecification__Alternatives_in_ruleMaxSpecification635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringMinSpecification_in_entryRuleStringMinSpecification662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringMinSpecification669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringMinSpecification__Group__0_in_ruleStringMinSpecification695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringMaxSpecification_in_entryRuleStringMaxSpecification722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringMaxSpecification729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringMaxSpecification__Group__0_in_ruleStringMaxSpecification755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerMinSpecification_in_entryRuleIntegerMinSpecification782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerMinSpecification789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMinSpecification__Group__0_in_ruleIntegerMinSpecification815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerMaxSpecification_in_entryRuleIntegerMaxSpecification842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerMaxSpecification849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMaxSpecification__Group__0_in_ruleIntegerMaxSpecification875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePattern_in_entryRulePattern902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePattern909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__0_in_rulePattern935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHdlTypeReference_in_entryRuleHdlTypeReference962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHdlTypeReference969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HdlTypeReference__Alternatives_in_ruleHdlTypeReference995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeReference_in_entryRuleEnumTypeReference1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeReference1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeReference__TypeAssignment_in_ruleEnumTypeReference1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypeReference_in_entryRulePrimitiveTypeReference1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeReference1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveTypeReference__TypeAssignment_in_rulePrimitiveTypeReference1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationType__Alternatives_in_ruleRelationType1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JHipsterType__Alternatives_in_ruleJHipsterType1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__DomainElement__Alternatives1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_rule__DomainElement__Alternatives1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__DomainElement__Alternatives1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueRange_in_rule__ValidationRule__Alternatives1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePattern_in_rule__ValidationRule__Alternatives1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinSpecification_in_rule__ValueRange__Alternatives1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxSpecification_in_rule__ValueRange__Alternatives1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringMinSpecification_in_rule__MinSpecification__Alternatives1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerMinSpecification_in_rule__MinSpecification__Alternatives1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringMaxSpecification_in_rule__MaxSpecification__Alternatives1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerMaxSpecification_in_rule__MaxSpecification__Alternatives1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeReference_in_rule__HdlTypeReference__Alternatives1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypeReference_in_rule__HdlTypeReference__Alternatives1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__RelationType__Alternatives1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RelationType__Alternatives1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RelationType__Alternatives1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RelationType__Alternatives1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__JHipsterType__Alternatives1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__JHipsterType__Alternatives1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__JHipsterType__Alternatives1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__JHipsterType__Alternatives1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__JHipsterType__Alternatives1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__JHipsterType__Alternatives1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__JHipsterType__Alternatives1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__JHipsterType__Alternatives1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__JHipsterType__Alternatives1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__JHipsterType__Alternatives1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01856 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Entity__Group__0__Impl1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11918 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__02041 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__02044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Entity__Group_2__0__Impl2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__12103 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__2_in_rule__Entity__Group_2__12106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FieldsAssignment_2_1_in_rule__Entity__Group_2__1__Impl2133 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__2__Impl_in_rule__Entity__Group_2__22164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Entity__Group_2__2__Impl2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__0__Impl_in_rule__Relation__Group__02229 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__Relation__Group__1_in_rule__Relation__Group__02232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Relation__Group__0__Impl2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__1__Impl_in_rule__Relation__Group__12291 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__2_in_rule__Relation__Group__12294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__TypeAssignment_1_in_rule__Relation__Group__1__Impl2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__2__Impl_in_rule__Relation__Group__22351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relation__Group__3_in_rule__Relation__Group__22354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Relation__Group__2__Impl2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__3__Impl_in_rule__Relation__Group__32413 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__4_in_rule__Relation__Group__32416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__FromAssignment_3_in_rule__Relation__Group__3__Impl2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__4__Impl_in_rule__Relation__Group__42473 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__5_in_rule__Relation__Group__42476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__0_in_rule__Relation__Group__4__Impl2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__5__Impl_in_rule__Relation__Group__52533 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relation__Group__6_in_rule__Relation__Group__52536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Relation__Group__5__Impl2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__6__Impl_in_rule__Relation__Group__62595 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__7_in_rule__Relation__Group__62598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__ToAssignment_6_in_rule__Relation__Group__6__Impl2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__7__Impl_in_rule__Relation__Group__72655 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__8_in_rule__Relation__Group__72658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__0_in_rule__Relation__Group__7__Impl2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__8__Impl_in_rule__Relation__Group__82715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Relation__Group__8__Impl2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__0__Impl_in_rule__Relation__Group_4__02792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__1_in_rule__Relation__Group_4__02795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Relation__Group_4__0__Impl2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__1__Impl_in_rule__Relation__Group_4__12854 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__2_in_rule__Relation__Group_4__12857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__FromRelationNameAssignment_4_1_in_rule__Relation__Group_4__1__Impl2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__2__Impl_in_rule__Relation__Group_4__22914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Relation__Group_4__2__Impl2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__0__Impl_in_rule__Relation__Group_7__02979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__1_in_rule__Relation__Group_7__02982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Relation__Group_7__0__Impl3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__1__Impl_in_rule__Relation__Group_7__13041 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__2_in_rule__Relation__Group_7__13044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__ToRelationNameAssignment_7_1_in_rule__Relation__Group_7__1__Impl3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__2__Impl_in_rule__Relation__Group_7__23101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Relation__Group_7__2__Impl3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__03166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__03169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Enum__Group__0__Impl3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__13228 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__13231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__23288 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__23291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Enum__Group__2__Impl3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__33350 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__33353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__LiteralsAssignment_3_in_rule__Enum__Group__3__Impl3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__43410 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__43413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_4__0_in_rule__Enum__Group__4__Impl3440 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__53471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Enum__Group__5__Impl3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_4__0__Impl_in_rule__Enum__Group_4__03542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group_4__1_in_rule__Enum__Group_4__03545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Enum__Group_4__0__Impl3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_4__1__Impl_in_rule__Enum__Group_4__13604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__LiteralsAssignment_4_1_in_rule__Enum__Group_4__1__Impl3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__03665 = new BitSet(new long[]{0x0000000001FF8010L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__03668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13725 = new BitSet(new long[]{0x000000F900000000L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__13728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypeAssignment_1_in_rule__Field__Group__1__Impl3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23785 = new BitSet(new long[]{0x000000F900000000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__23788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__RequiredAssignment_2_in_rule__Field__Group__2__Impl3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__33846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__ValidationRulesAssignment_3_in_rule__Field__Group__3__Impl3873 = new BitSet(new long[]{0x0000007900000002L});
    public static final BitSet FOLLOW_rule__StringMinSpecification__Group__0__Impl_in_rule__StringMinSpecification__Group__03912 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__StringMinSpecification__Group__1_in_rule__StringMinSpecification__Group__03915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__StringMinSpecification__Group__0__Impl3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringMinSpecification__Group__1__Impl_in_rule__StringMinSpecification__Group__13974 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringMinSpecification__Group__2_in_rule__StringMinSpecification__Group__13977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__StringMinSpecification__Group__1__Impl4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringMinSpecification__Group__2__Impl_in_rule__StringMinSpecification__Group__24036 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__StringMinSpecification__Group__3_in_rule__StringMinSpecification__Group__24039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringMinSpecification__MinAssignment_2_in_rule__StringMinSpecification__Group__2__Impl4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringMinSpecification__Group__3__Impl_in_rule__StringMinSpecification__Group__34096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__StringMinSpecification__Group__3__Impl4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringMaxSpecification__Group__0__Impl_in_rule__StringMaxSpecification__Group__04163 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__StringMaxSpecification__Group__1_in_rule__StringMaxSpecification__Group__04166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__StringMaxSpecification__Group__0__Impl4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringMaxSpecification__Group__1__Impl_in_rule__StringMaxSpecification__Group__14225 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringMaxSpecification__Group__2_in_rule__StringMaxSpecification__Group__14228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__StringMaxSpecification__Group__1__Impl4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringMaxSpecification__Group__2__Impl_in_rule__StringMaxSpecification__Group__24287 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__StringMaxSpecification__Group__3_in_rule__StringMaxSpecification__Group__24290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringMaxSpecification__MaxAssignment_2_in_rule__StringMaxSpecification__Group__2__Impl4317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringMaxSpecification__Group__3__Impl_in_rule__StringMaxSpecification__Group__34347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__StringMaxSpecification__Group__3__Impl4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMinSpecification__Group__0__Impl_in_rule__IntegerMinSpecification__Group__04414 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__IntegerMinSpecification__Group__1_in_rule__IntegerMinSpecification__Group__04417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__IntegerMinSpecification__Group__0__Impl4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMinSpecification__Group__1__Impl_in_rule__IntegerMinSpecification__Group__14476 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IntegerMinSpecification__Group__2_in_rule__IntegerMinSpecification__Group__14479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__IntegerMinSpecification__Group__1__Impl4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMinSpecification__Group__2__Impl_in_rule__IntegerMinSpecification__Group__24538 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__IntegerMinSpecification__Group__3_in_rule__IntegerMinSpecification__Group__24541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMinSpecification__MinAssignment_2_in_rule__IntegerMinSpecification__Group__2__Impl4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMinSpecification__Group__3__Impl_in_rule__IntegerMinSpecification__Group__34598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__IntegerMinSpecification__Group__3__Impl4626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMaxSpecification__Group__0__Impl_in_rule__IntegerMaxSpecification__Group__04665 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__IntegerMaxSpecification__Group__1_in_rule__IntegerMaxSpecification__Group__04668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__IntegerMaxSpecification__Group__0__Impl4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMaxSpecification__Group__1__Impl_in_rule__IntegerMaxSpecification__Group__14727 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IntegerMaxSpecification__Group__2_in_rule__IntegerMaxSpecification__Group__14730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__IntegerMaxSpecification__Group__1__Impl4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMaxSpecification__Group__2__Impl_in_rule__IntegerMaxSpecification__Group__24789 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__IntegerMaxSpecification__Group__3_in_rule__IntegerMaxSpecification__Group__24792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMaxSpecification__MaxAssignment_2_in_rule__IntegerMaxSpecification__Group__2__Impl4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMaxSpecification__Group__3__Impl_in_rule__IntegerMaxSpecification__Group__34849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__IntegerMaxSpecification__Group__3__Impl4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__0__Impl_in_rule__Pattern__Group__04916 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Pattern__Group__1_in_rule__Pattern__Group__04919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Pattern__Group__0__Impl4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__1__Impl_in_rule__Pattern__Group__14978 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Pattern__Group__2_in_rule__Pattern__Group__14981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Pattern__Group__1__Impl5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__2__Impl_in_rule__Pattern__Group__25040 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Pattern__Group__3_in_rule__Pattern__Group__25043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__RegexAssignment_2_in_rule__Pattern__Group__2__Impl5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__3__Impl_in_rule__Pattern__Group__35100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Pattern__Group__3__Impl5128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_rule__Domain__ElementsAssignment5172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_15203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Entity__FieldsAssignment_2_15234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationType_in_rule__Relation__TypeAssignment_15265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relation__FromAssignment_35300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relation__FromRelationNameAssignment_4_15335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relation__ToAssignment_65370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relation__ToRelationNameAssignment_7_15405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_15436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__LiteralsAssignment_35467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__LiteralsAssignment_4_15498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_05529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHdlTypeReference_in_rule__Field__TypeAssignment_15560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Field__RequiredAssignment_25596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidationRule_in_rule__Field__ValidationRulesAssignment_35635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StringMinSpecification__MinAssignment_25666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StringMaxSpecification__MaxAssignment_25697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerMinSpecification__MinAssignment_25728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerMaxSpecification__MaxAssignment_25759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Pattern__RegexAssignment_25790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumTypeReference__TypeAssignment5825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJHipsterType_in_rule__PrimitiveTypeReference__TypeAssignment5860 = new BitSet(new long[]{0x0000000000000002L});

}
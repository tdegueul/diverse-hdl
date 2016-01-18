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


    // $ANTLR start "entryRuleRequired"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:256:1: entryRuleRequired : ruleRequired EOF ;
    public final void entryRuleRequired() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:257:1: ( ruleRequired EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:258:1: ruleRequired EOF
            {
             before(grammarAccess.getRequiredRule()); 
            pushFollow(FOLLOW_ruleRequired_in_entryRuleRequired482);
            ruleRequired();

            state._fsp--;

             after(grammarAccess.getRequiredRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequired489); 

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
    // $ANTLR end "entryRuleRequired"


    // $ANTLR start "ruleRequired"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:265:1: ruleRequired : ( ( rule__Required__RequiredAssignment ) ) ;
    public final void ruleRequired() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:269:2: ( ( ( rule__Required__RequiredAssignment ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:270:1: ( ( rule__Required__RequiredAssignment ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:270:1: ( ( rule__Required__RequiredAssignment ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:271:1: ( rule__Required__RequiredAssignment )
            {
             before(grammarAccess.getRequiredAccess().getRequiredAssignment()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:272:1: ( rule__Required__RequiredAssignment )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:272:2: rule__Required__RequiredAssignment
            {
            pushFollow(FOLLOW_rule__Required__RequiredAssignment_in_ruleRequired515);
            rule__Required__RequiredAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRequiredAccess().getRequiredAssignment()); 

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
    // $ANTLR end "ruleRequired"


    // $ANTLR start "entryRuleValueRange"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:284:1: entryRuleValueRange : ruleValueRange EOF ;
    public final void entryRuleValueRange() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:285:1: ( ruleValueRange EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:286:1: ruleValueRange EOF
            {
             before(grammarAccess.getValueRangeRule()); 
            pushFollow(FOLLOW_ruleValueRange_in_entryRuleValueRange542);
            ruleValueRange();

            state._fsp--;

             after(grammarAccess.getValueRangeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueRange549); 

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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:293:1: ruleValueRange : ( ( rule__ValueRange__Alternatives ) ) ;
    public final void ruleValueRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:297:2: ( ( ( rule__ValueRange__Alternatives ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:298:1: ( ( rule__ValueRange__Alternatives ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:298:1: ( ( rule__ValueRange__Alternatives ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:299:1: ( rule__ValueRange__Alternatives )
            {
             before(grammarAccess.getValueRangeAccess().getAlternatives()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:300:1: ( rule__ValueRange__Alternatives )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:300:2: rule__ValueRange__Alternatives
            {
            pushFollow(FOLLOW_rule__ValueRange__Alternatives_in_ruleValueRange575);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:312:1: entryRuleMinSpecification : ruleMinSpecification EOF ;
    public final void entryRuleMinSpecification() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:313:1: ( ruleMinSpecification EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:314:1: ruleMinSpecification EOF
            {
             before(grammarAccess.getMinSpecificationRule()); 
            pushFollow(FOLLOW_ruleMinSpecification_in_entryRuleMinSpecification602);
            ruleMinSpecification();

            state._fsp--;

             after(grammarAccess.getMinSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinSpecification609); 

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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:321:1: ruleMinSpecification : ( ( rule__MinSpecification__Alternatives ) ) ;
    public final void ruleMinSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:325:2: ( ( ( rule__MinSpecification__Alternatives ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:326:1: ( ( rule__MinSpecification__Alternatives ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:326:1: ( ( rule__MinSpecification__Alternatives ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:327:1: ( rule__MinSpecification__Alternatives )
            {
             before(grammarAccess.getMinSpecificationAccess().getAlternatives()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:328:1: ( rule__MinSpecification__Alternatives )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:328:2: rule__MinSpecification__Alternatives
            {
            pushFollow(FOLLOW_rule__MinSpecification__Alternatives_in_ruleMinSpecification635);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:340:1: entryRuleMaxSpecification : ruleMaxSpecification EOF ;
    public final void entryRuleMaxSpecification() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:341:1: ( ruleMaxSpecification EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:342:1: ruleMaxSpecification EOF
            {
             before(grammarAccess.getMaxSpecificationRule()); 
            pushFollow(FOLLOW_ruleMaxSpecification_in_entryRuleMaxSpecification662);
            ruleMaxSpecification();

            state._fsp--;

             after(grammarAccess.getMaxSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxSpecification669); 

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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:349:1: ruleMaxSpecification : ( ( rule__MaxSpecification__Alternatives ) ) ;
    public final void ruleMaxSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:353:2: ( ( ( rule__MaxSpecification__Alternatives ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:354:1: ( ( rule__MaxSpecification__Alternatives ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:354:1: ( ( rule__MaxSpecification__Alternatives ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:355:1: ( rule__MaxSpecification__Alternatives )
            {
             before(grammarAccess.getMaxSpecificationAccess().getAlternatives()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:356:1: ( rule__MaxSpecification__Alternatives )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:356:2: rule__MaxSpecification__Alternatives
            {
            pushFollow(FOLLOW_rule__MaxSpecification__Alternatives_in_ruleMaxSpecification695);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:368:1: entryRuleStringMinSpecification : ruleStringMinSpecification EOF ;
    public final void entryRuleStringMinSpecification() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:369:1: ( ruleStringMinSpecification EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:370:1: ruleStringMinSpecification EOF
            {
             before(grammarAccess.getStringMinSpecificationRule()); 
            pushFollow(FOLLOW_ruleStringMinSpecification_in_entryRuleStringMinSpecification722);
            ruleStringMinSpecification();

            state._fsp--;

             after(grammarAccess.getStringMinSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringMinSpecification729); 

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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:377:1: ruleStringMinSpecification : ( ( rule__StringMinSpecification__Group__0 ) ) ;
    public final void ruleStringMinSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:381:2: ( ( ( rule__StringMinSpecification__Group__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:382:1: ( ( rule__StringMinSpecification__Group__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:382:1: ( ( rule__StringMinSpecification__Group__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:383:1: ( rule__StringMinSpecification__Group__0 )
            {
             before(grammarAccess.getStringMinSpecificationAccess().getGroup()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:384:1: ( rule__StringMinSpecification__Group__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:384:2: rule__StringMinSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__StringMinSpecification__Group__0_in_ruleStringMinSpecification755);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:396:1: entryRuleStringMaxSpecification : ruleStringMaxSpecification EOF ;
    public final void entryRuleStringMaxSpecification() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:397:1: ( ruleStringMaxSpecification EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:398:1: ruleStringMaxSpecification EOF
            {
             before(grammarAccess.getStringMaxSpecificationRule()); 
            pushFollow(FOLLOW_ruleStringMaxSpecification_in_entryRuleStringMaxSpecification782);
            ruleStringMaxSpecification();

            state._fsp--;

             after(grammarAccess.getStringMaxSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringMaxSpecification789); 

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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:405:1: ruleStringMaxSpecification : ( ( rule__StringMaxSpecification__Group__0 ) ) ;
    public final void ruleStringMaxSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:409:2: ( ( ( rule__StringMaxSpecification__Group__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:410:1: ( ( rule__StringMaxSpecification__Group__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:410:1: ( ( rule__StringMaxSpecification__Group__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:411:1: ( rule__StringMaxSpecification__Group__0 )
            {
             before(grammarAccess.getStringMaxSpecificationAccess().getGroup()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:412:1: ( rule__StringMaxSpecification__Group__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:412:2: rule__StringMaxSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__StringMaxSpecification__Group__0_in_ruleStringMaxSpecification815);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:424:1: entryRuleIntegerMinSpecification : ruleIntegerMinSpecification EOF ;
    public final void entryRuleIntegerMinSpecification() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:425:1: ( ruleIntegerMinSpecification EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:426:1: ruleIntegerMinSpecification EOF
            {
             before(grammarAccess.getIntegerMinSpecificationRule()); 
            pushFollow(FOLLOW_ruleIntegerMinSpecification_in_entryRuleIntegerMinSpecification842);
            ruleIntegerMinSpecification();

            state._fsp--;

             after(grammarAccess.getIntegerMinSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerMinSpecification849); 

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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:433:1: ruleIntegerMinSpecification : ( ( rule__IntegerMinSpecification__Group__0 ) ) ;
    public final void ruleIntegerMinSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:437:2: ( ( ( rule__IntegerMinSpecification__Group__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:438:1: ( ( rule__IntegerMinSpecification__Group__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:438:1: ( ( rule__IntegerMinSpecification__Group__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:439:1: ( rule__IntegerMinSpecification__Group__0 )
            {
             before(grammarAccess.getIntegerMinSpecificationAccess().getGroup()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:440:1: ( rule__IntegerMinSpecification__Group__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:440:2: rule__IntegerMinSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerMinSpecification__Group__0_in_ruleIntegerMinSpecification875);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:452:1: entryRuleIntegerMaxSpecification : ruleIntegerMaxSpecification EOF ;
    public final void entryRuleIntegerMaxSpecification() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:453:1: ( ruleIntegerMaxSpecification EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:454:1: ruleIntegerMaxSpecification EOF
            {
             before(grammarAccess.getIntegerMaxSpecificationRule()); 
            pushFollow(FOLLOW_ruleIntegerMaxSpecification_in_entryRuleIntegerMaxSpecification902);
            ruleIntegerMaxSpecification();

            state._fsp--;

             after(grammarAccess.getIntegerMaxSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerMaxSpecification909); 

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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:461:1: ruleIntegerMaxSpecification : ( ( rule__IntegerMaxSpecification__Group__0 ) ) ;
    public final void ruleIntegerMaxSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:465:2: ( ( ( rule__IntegerMaxSpecification__Group__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:466:1: ( ( rule__IntegerMaxSpecification__Group__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:466:1: ( ( rule__IntegerMaxSpecification__Group__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:467:1: ( rule__IntegerMaxSpecification__Group__0 )
            {
             before(grammarAccess.getIntegerMaxSpecificationAccess().getGroup()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:468:1: ( rule__IntegerMaxSpecification__Group__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:468:2: rule__IntegerMaxSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerMaxSpecification__Group__0_in_ruleIntegerMaxSpecification935);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:480:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:481:1: ( rulePattern EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:482:1: rulePattern EOF
            {
             before(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_rulePattern_in_entryRulePattern962);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePattern969); 

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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:489:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:493:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:494:1: ( ( rule__Pattern__Group__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:494:1: ( ( rule__Pattern__Group__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:495:1: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:496:1: ( rule__Pattern__Group__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:496:2: rule__Pattern__Group__0
            {
            pushFollow(FOLLOW_rule__Pattern__Group__0_in_rulePattern995);
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


    // $ANTLR start "entryRuleHdlType"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:508:1: entryRuleHdlType : ruleHdlType EOF ;
    public final void entryRuleHdlType() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:509:1: ( ruleHdlType EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:510:1: ruleHdlType EOF
            {
             before(grammarAccess.getHdlTypeRule()); 
            pushFollow(FOLLOW_ruleHdlType_in_entryRuleHdlType1022);
            ruleHdlType();

            state._fsp--;

             after(grammarAccess.getHdlTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHdlType1029); 

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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:517:1: ruleHdlType : ( ( rule__HdlType__Alternatives ) ) ;
    public final void ruleHdlType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:521:2: ( ( ( rule__HdlType__Alternatives ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:522:1: ( ( rule__HdlType__Alternatives ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:522:1: ( ( rule__HdlType__Alternatives ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:523:1: ( rule__HdlType__Alternatives )
            {
             before(grammarAccess.getHdlTypeAccess().getAlternatives()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:524:1: ( rule__HdlType__Alternatives )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:524:2: rule__HdlType__Alternatives
            {
            pushFollow(FOLLOW_rule__HdlType__Alternatives_in_ruleHdlType1055);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:537:1: ruleRelationType : ( ( rule__RelationType__Alternatives ) ) ;
    public final void ruleRelationType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:541:1: ( ( ( rule__RelationType__Alternatives ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:542:1: ( ( rule__RelationType__Alternatives ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:542:1: ( ( rule__RelationType__Alternatives ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:543:1: ( rule__RelationType__Alternatives )
            {
             before(grammarAccess.getRelationTypeAccess().getAlternatives()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:544:1: ( rule__RelationType__Alternatives )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:544:2: rule__RelationType__Alternatives
            {
            pushFollow(FOLLOW_rule__RelationType__Alternatives_in_ruleRelationType1092);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:556:1: ruleJHipsterType : ( ( rule__JHipsterType__Alternatives ) ) ;
    public final void ruleJHipsterType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:560:1: ( ( ( rule__JHipsterType__Alternatives ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:561:1: ( ( rule__JHipsterType__Alternatives ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:561:1: ( ( rule__JHipsterType__Alternatives ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:562:1: ( rule__JHipsterType__Alternatives )
            {
             before(grammarAccess.getJHipsterTypeAccess().getAlternatives()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:563:1: ( rule__JHipsterType__Alternatives )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:563:2: rule__JHipsterType__Alternatives
            {
            pushFollow(FOLLOW_rule__JHipsterType__Alternatives_in_ruleJHipsterType1128);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:574:1: rule__DomainElement__Alternatives : ( ( ruleEntity ) | ( ruleRelation ) | ( ruleEnum ) );
    public final void rule__DomainElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:578:1: ( ( ruleEntity ) | ( ruleRelation ) | ( ruleEnum ) )
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
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:579:1: ( ruleEntity )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:579:1: ( ruleEntity )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:580:1: ruleEntity
                    {
                     before(grammarAccess.getDomainElementAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__DomainElement__Alternatives1163);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getDomainElementAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:585:6: ( ruleRelation )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:585:6: ( ruleRelation )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:586:1: ruleRelation
                    {
                     before(grammarAccess.getDomainElementAccess().getRelationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRelation_in_rule__DomainElement__Alternatives1180);
                    ruleRelation();

                    state._fsp--;

                     after(grammarAccess.getDomainElementAccess().getRelationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:591:6: ( ruleEnum )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:591:6: ( ruleEnum )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:592:1: ruleEnum
                    {
                     before(grammarAccess.getDomainElementAccess().getEnumParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnum_in_rule__DomainElement__Alternatives1197);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:602:1: rule__ValidationRule__Alternatives : ( ( ruleRequired ) | ( ruleValueRange ) | ( rulePattern ) );
    public final void rule__ValidationRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:606:1: ( ( ruleRequired ) | ( ruleValueRange ) | ( rulePattern ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt3=1;
                }
                break;
            case 32:
            case 35:
            case 36:
            case 37:
                {
                alt3=2;
                }
                break;
            case 38:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:607:1: ( ruleRequired )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:607:1: ( ruleRequired )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:608:1: ruleRequired
                    {
                     before(grammarAccess.getValidationRuleAccess().getRequiredParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRequired_in_rule__ValidationRule__Alternatives1229);
                    ruleRequired();

                    state._fsp--;

                     after(grammarAccess.getValidationRuleAccess().getRequiredParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:613:6: ( ruleValueRange )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:613:6: ( ruleValueRange )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:614:1: ruleValueRange
                    {
                     before(grammarAccess.getValidationRuleAccess().getValueRangeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleValueRange_in_rule__ValidationRule__Alternatives1246);
                    ruleValueRange();

                    state._fsp--;

                     after(grammarAccess.getValidationRuleAccess().getValueRangeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:619:6: ( rulePattern )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:619:6: ( rulePattern )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:620:1: rulePattern
                    {
                     before(grammarAccess.getValidationRuleAccess().getPatternParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePattern_in_rule__ValidationRule__Alternatives1263);
                    rulePattern();

                    state._fsp--;

                     after(grammarAccess.getValidationRuleAccess().getPatternParserRuleCall_2()); 

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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:630:1: rule__ValueRange__Alternatives : ( ( ruleMinSpecification ) | ( ruleMaxSpecification ) );
    public final void rule__ValueRange__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:634:1: ( ( ruleMinSpecification ) | ( ruleMaxSpecification ) )
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
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:635:1: ( ruleMinSpecification )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:635:1: ( ruleMinSpecification )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:636:1: ruleMinSpecification
                    {
                     before(grammarAccess.getValueRangeAccess().getMinSpecificationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMinSpecification_in_rule__ValueRange__Alternatives1295);
                    ruleMinSpecification();

                    state._fsp--;

                     after(grammarAccess.getValueRangeAccess().getMinSpecificationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:641:6: ( ruleMaxSpecification )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:641:6: ( ruleMaxSpecification )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:642:1: ruleMaxSpecification
                    {
                     before(grammarAccess.getValueRangeAccess().getMaxSpecificationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMaxSpecification_in_rule__ValueRange__Alternatives1312);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:652:1: rule__MinSpecification__Alternatives : ( ( ruleStringMinSpecification ) | ( ruleIntegerMinSpecification ) );
    public final void rule__MinSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:656:1: ( ( ruleStringMinSpecification ) | ( ruleIntegerMinSpecification ) )
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
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:657:1: ( ruleStringMinSpecification )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:657:1: ( ruleStringMinSpecification )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:658:1: ruleStringMinSpecification
                    {
                     before(grammarAccess.getMinSpecificationAccess().getStringMinSpecificationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringMinSpecification_in_rule__MinSpecification__Alternatives1344);
                    ruleStringMinSpecification();

                    state._fsp--;

                     after(grammarAccess.getMinSpecificationAccess().getStringMinSpecificationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:663:6: ( ruleIntegerMinSpecification )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:663:6: ( ruleIntegerMinSpecification )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:664:1: ruleIntegerMinSpecification
                    {
                     before(grammarAccess.getMinSpecificationAccess().getIntegerMinSpecificationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntegerMinSpecification_in_rule__MinSpecification__Alternatives1361);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:674:1: rule__MaxSpecification__Alternatives : ( ( ruleStringMaxSpecification ) | ( ruleIntegerMaxSpecification ) );
    public final void rule__MaxSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:678:1: ( ( ruleStringMaxSpecification ) | ( ruleIntegerMaxSpecification ) )
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
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:679:1: ( ruleStringMaxSpecification )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:679:1: ( ruleStringMaxSpecification )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:680:1: ruleStringMaxSpecification
                    {
                     before(grammarAccess.getMaxSpecificationAccess().getStringMaxSpecificationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringMaxSpecification_in_rule__MaxSpecification__Alternatives1393);
                    ruleStringMaxSpecification();

                    state._fsp--;

                     after(grammarAccess.getMaxSpecificationAccess().getStringMaxSpecificationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:685:6: ( ruleIntegerMaxSpecification )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:685:6: ( ruleIntegerMaxSpecification )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:686:1: ruleIntegerMaxSpecification
                    {
                     before(grammarAccess.getMaxSpecificationAccess().getIntegerMaxSpecificationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntegerMaxSpecification_in_rule__MaxSpecification__Alternatives1410);
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


    // $ANTLR start "rule__HdlType__Alternatives"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:696:1: rule__HdlType__Alternatives : ( ( ( rule__HdlType__EnumTypeAssignment_0 ) ) | ( ( rule__HdlType__PrimitiveTypeAssignment_1 ) ) );
    public final void rule__HdlType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:700:1: ( ( ( rule__HdlType__EnumTypeAssignment_0 ) ) | ( ( rule__HdlType__PrimitiveTypeAssignment_1 ) ) )
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
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:701:1: ( ( rule__HdlType__EnumTypeAssignment_0 ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:701:1: ( ( rule__HdlType__EnumTypeAssignment_0 ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:702:1: ( rule__HdlType__EnumTypeAssignment_0 )
                    {
                     before(grammarAccess.getHdlTypeAccess().getEnumTypeAssignment_0()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:703:1: ( rule__HdlType__EnumTypeAssignment_0 )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:703:2: rule__HdlType__EnumTypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__HdlType__EnumTypeAssignment_0_in_rule__HdlType__Alternatives1442);
                    rule__HdlType__EnumTypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHdlTypeAccess().getEnumTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:707:6: ( ( rule__HdlType__PrimitiveTypeAssignment_1 ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:707:6: ( ( rule__HdlType__PrimitiveTypeAssignment_1 ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:708:1: ( rule__HdlType__PrimitiveTypeAssignment_1 )
                    {
                     before(grammarAccess.getHdlTypeAccess().getPrimitiveTypeAssignment_1()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:709:1: ( rule__HdlType__PrimitiveTypeAssignment_1 )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:709:2: rule__HdlType__PrimitiveTypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__HdlType__PrimitiveTypeAssignment_1_in_rule__HdlType__Alternatives1460);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:718:1: rule__RelationType__Alternatives : ( ( ( 'OneToMany' ) ) | ( ( 'ManyToOne' ) ) | ( ( 'OneToOne' ) ) | ( ( 'ManyToMany' ) ) );
    public final void rule__RelationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:722:1: ( ( ( 'OneToMany' ) ) | ( ( 'ManyToOne' ) ) | ( ( 'OneToOne' ) ) | ( ( 'ManyToMany' ) ) )
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
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:723:1: ( ( 'OneToMany' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:723:1: ( ( 'OneToMany' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:724:1: ( 'OneToMany' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getONE_TO_MANYEnumLiteralDeclaration_0()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:725:1: ( 'OneToMany' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:725:3: 'OneToMany'
                    {
                    match(input,11,FOLLOW_11_in_rule__RelationType__Alternatives1494); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getONE_TO_MANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:730:6: ( ( 'ManyToOne' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:730:6: ( ( 'ManyToOne' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:731:1: ( 'ManyToOne' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getMANY_TO_ONEEnumLiteralDeclaration_1()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:732:1: ( 'ManyToOne' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:732:3: 'ManyToOne'
                    {
                    match(input,12,FOLLOW_12_in_rule__RelationType__Alternatives1515); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getMANY_TO_ONEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:737:6: ( ( 'OneToOne' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:737:6: ( ( 'OneToOne' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:738:1: ( 'OneToOne' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getONE_TO_ONEEnumLiteralDeclaration_2()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:739:1: ( 'OneToOne' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:739:3: 'OneToOne'
                    {
                    match(input,13,FOLLOW_13_in_rule__RelationType__Alternatives1536); 

                    }

                     after(grammarAccess.getRelationTypeAccess().getONE_TO_ONEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:744:6: ( ( 'ManyToMany' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:744:6: ( ( 'ManyToMany' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:745:1: ( 'ManyToMany' )
                    {
                     before(grammarAccess.getRelationTypeAccess().getMANY_TO_MANYEnumLiteralDeclaration_3()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:746:1: ( 'ManyToMany' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:746:3: 'ManyToMany'
                    {
                    match(input,14,FOLLOW_14_in_rule__RelationType__Alternatives1557); 

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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:756:1: rule__JHipsterType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Long' ) ) | ( ( 'BigDecimal' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'Enum' ) ) | ( ( 'Boolean' ) ) | ( ( 'LocalDate' ) ) | ( ( 'ZoneDateTime' ) ) );
    public final void rule__JHipsterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:760:1: ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Long' ) ) | ( ( 'BigDecimal' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'Enum' ) ) | ( ( 'Boolean' ) ) | ( ( 'LocalDate' ) ) | ( ( 'ZoneDateTime' ) ) )
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
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:761:1: ( ( 'String' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:761:1: ( ( 'String' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:762:1: ( 'String' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:763:1: ( 'String' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:763:3: 'String'
                    {
                    match(input,15,FOLLOW_15_in_rule__JHipsterType__Alternatives1593); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:768:6: ( ( 'Integer' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:768:6: ( ( 'Integer' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:769:1: ( 'Integer' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:770:1: ( 'Integer' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:770:3: 'Integer'
                    {
                    match(input,16,FOLLOW_16_in_rule__JHipsterType__Alternatives1614); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:775:6: ( ( 'Long' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:775:6: ( ( 'Long' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:776:1: ( 'Long' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getLONGEnumLiteralDeclaration_2()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:777:1: ( 'Long' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:777:3: 'Long'
                    {
                    match(input,17,FOLLOW_17_in_rule__JHipsterType__Alternatives1635); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getLONGEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:782:6: ( ( 'BigDecimal' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:782:6: ( ( 'BigDecimal' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:783:1: ( 'BigDecimal' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_3()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:784:1: ( 'BigDecimal' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:784:3: 'BigDecimal'
                    {
                    match(input,18,FOLLOW_18_in_rule__JHipsterType__Alternatives1656); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:789:6: ( ( 'Float' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:789:6: ( ( 'Float' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:790:1: ( 'Float' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:791:1: ( 'Float' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:791:3: 'Float'
                    {
                    match(input,19,FOLLOW_19_in_rule__JHipsterType__Alternatives1677); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getFLOATEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:796:6: ( ( 'Double' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:796:6: ( ( 'Double' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:797:1: ( 'Double' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:798:1: ( 'Double' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:798:3: 'Double'
                    {
                    match(input,20,FOLLOW_20_in_rule__JHipsterType__Alternatives1698); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:803:6: ( ( 'Enum' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:803:6: ( ( 'Enum' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:804:1: ( 'Enum' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getENUMEnumLiteralDeclaration_6()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:805:1: ( 'Enum' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:805:3: 'Enum'
                    {
                    match(input,21,FOLLOW_21_in_rule__JHipsterType__Alternatives1719); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getENUMEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:810:6: ( ( 'Boolean' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:810:6: ( ( 'Boolean' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:811:1: ( 'Boolean' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getBOOLEANEnumLiteralDeclaration_7()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:812:1: ( 'Boolean' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:812:3: 'Boolean'
                    {
                    match(input,22,FOLLOW_22_in_rule__JHipsterType__Alternatives1740); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getBOOLEANEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:817:6: ( ( 'LocalDate' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:817:6: ( ( 'LocalDate' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:818:1: ( 'LocalDate' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_8()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:819:1: ( 'LocalDate' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:819:3: 'LocalDate'
                    {
                    match(input,23,FOLLOW_23_in_rule__JHipsterType__Alternatives1761); 

                    }

                     after(grammarAccess.getJHipsterTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:824:6: ( ( 'ZoneDateTime' ) )
                    {
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:824:6: ( ( 'ZoneDateTime' ) )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:825:1: ( 'ZoneDateTime' )
                    {
                     before(grammarAccess.getJHipsterTypeAccess().getZONE_DATE_TIMEEnumLiteralDeclaration_9()); 
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:826:1: ( 'ZoneDateTime' )
                    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:826:3: 'ZoneDateTime'
                    {
                    match(input,24,FOLLOW_24_in_rule__JHipsterType__Alternatives1782); 

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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:838:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:842:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:843:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01815);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01818);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:850:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:854:1: ( ( 'entity' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:855:1: ( 'entity' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:855:1: ( 'entity' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:856:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Entity__Group__0__Impl1846); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:869:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:873:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:874:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11877);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11880);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:881:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:885:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:886:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:886:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:887:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:888:1: ( rule__Entity__NameAssignment_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:888:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1907);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:898:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:902:1: ( rule__Entity__Group__2__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:903:2: rule__Entity__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21937);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:909:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:913:1: ( ( ( rule__Entity__Group_2__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:914:1: ( ( rule__Entity__Group_2__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:914:1: ( ( rule__Entity__Group_2__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:915:1: ( rule__Entity__Group_2__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:916:1: ( rule__Entity__Group_2__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:916:2: rule__Entity__Group_2__0
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl1964);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:932:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:936:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:937:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__02000);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__02003);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:944:1: rule__Entity__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:948:1: ( ( '{' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:949:1: ( '{' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:949:1: ( '{' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:950:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Entity__Group_2__0__Impl2031); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:963:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:967:1: ( rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:968:2: rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__12062);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__2_in_rule__Entity__Group_2__12065);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:975:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__FieldsAssignment_2_1 )* ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:979:1: ( ( ( rule__Entity__FieldsAssignment_2_1 )* ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:980:1: ( ( rule__Entity__FieldsAssignment_2_1 )* )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:980:1: ( ( rule__Entity__FieldsAssignment_2_1 )* )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:981:1: ( rule__Entity__FieldsAssignment_2_1 )*
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_2_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:982:1: ( rule__Entity__FieldsAssignment_2_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:982:2: rule__Entity__FieldsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FieldsAssignment_2_1_in_rule__Entity__Group_2__1__Impl2092);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:992:1: rule__Entity__Group_2__2 : rule__Entity__Group_2__2__Impl ;
    public final void rule__Entity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:996:1: ( rule__Entity__Group_2__2__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:997:2: rule__Entity__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__2__Impl_in_rule__Entity__Group_2__22123);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1003:1: rule__Entity__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Entity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1007:1: ( ( '}' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1008:1: ( '}' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1008:1: ( '}' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1009:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,27,FOLLOW_27_in_rule__Entity__Group_2__2__Impl2151); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1028:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1032:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1033:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_rule__Relation__Group__0__Impl_in_rule__Relation__Group__02188);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__1_in_rule__Relation__Group__02191);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1040:1: rule__Relation__Group__0__Impl : ( 'relationship' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1044:1: ( ( 'relationship' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1045:1: ( 'relationship' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1045:1: ( 'relationship' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1046:1: 'relationship'
            {
             before(grammarAccess.getRelationAccess().getRelationshipKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Relation__Group__0__Impl2219); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1059:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1063:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1064:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_rule__Relation__Group__1__Impl_in_rule__Relation__Group__12250);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__2_in_rule__Relation__Group__12253);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1071:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__TypeAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1075:1: ( ( ( rule__Relation__TypeAssignment_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1076:1: ( ( rule__Relation__TypeAssignment_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1076:1: ( ( rule__Relation__TypeAssignment_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1077:1: ( rule__Relation__TypeAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getTypeAssignment_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1078:1: ( rule__Relation__TypeAssignment_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1078:2: rule__Relation__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Relation__TypeAssignment_1_in_rule__Relation__Group__1__Impl2280);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1088:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1092:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1093:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_rule__Relation__Group__2__Impl_in_rule__Relation__Group__22310);
            rule__Relation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__3_in_rule__Relation__Group__22313);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1100:1: rule__Relation__Group__2__Impl : ( '{' ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1104:1: ( ( '{' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1105:1: ( '{' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1105:1: ( '{' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1106:1: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Relation__Group__2__Impl2341); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1119:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1123:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1124:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
            {
            pushFollow(FOLLOW_rule__Relation__Group__3__Impl_in_rule__Relation__Group__32372);
            rule__Relation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__4_in_rule__Relation__Group__32375);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1131:1: rule__Relation__Group__3__Impl : ( ( rule__Relation__FromAssignment_3 ) ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1135:1: ( ( ( rule__Relation__FromAssignment_3 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1136:1: ( ( rule__Relation__FromAssignment_3 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1136:1: ( ( rule__Relation__FromAssignment_3 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1137:1: ( rule__Relation__FromAssignment_3 )
            {
             before(grammarAccess.getRelationAccess().getFromAssignment_3()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1138:1: ( rule__Relation__FromAssignment_3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1138:2: rule__Relation__FromAssignment_3
            {
            pushFollow(FOLLOW_rule__Relation__FromAssignment_3_in_rule__Relation__Group__3__Impl2402);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1148:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1152:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1153:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
            {
            pushFollow(FOLLOW_rule__Relation__Group__4__Impl_in_rule__Relation__Group__42432);
            rule__Relation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__5_in_rule__Relation__Group__42435);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1160:1: rule__Relation__Group__4__Impl : ( ( rule__Relation__Group_4__0 ) ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1164:1: ( ( ( rule__Relation__Group_4__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1165:1: ( ( rule__Relation__Group_4__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1165:1: ( ( rule__Relation__Group_4__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1166:1: ( rule__Relation__Group_4__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup_4()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1167:1: ( rule__Relation__Group_4__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1167:2: rule__Relation__Group_4__0
            {
            pushFollow(FOLLOW_rule__Relation__Group_4__0_in_rule__Relation__Group__4__Impl2462);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1177:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl rule__Relation__Group__6 ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1181:1: ( rule__Relation__Group__5__Impl rule__Relation__Group__6 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1182:2: rule__Relation__Group__5__Impl rule__Relation__Group__6
            {
            pushFollow(FOLLOW_rule__Relation__Group__5__Impl_in_rule__Relation__Group__52492);
            rule__Relation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__6_in_rule__Relation__Group__52495);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1189:1: rule__Relation__Group__5__Impl : ( 'to' ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1193:1: ( ( 'to' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1194:1: ( 'to' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1194:1: ( 'to' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1195:1: 'to'
            {
             before(grammarAccess.getRelationAccess().getToKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__Relation__Group__5__Impl2523); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1208:1: rule__Relation__Group__6 : rule__Relation__Group__6__Impl rule__Relation__Group__7 ;
    public final void rule__Relation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1212:1: ( rule__Relation__Group__6__Impl rule__Relation__Group__7 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1213:2: rule__Relation__Group__6__Impl rule__Relation__Group__7
            {
            pushFollow(FOLLOW_rule__Relation__Group__6__Impl_in_rule__Relation__Group__62554);
            rule__Relation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__7_in_rule__Relation__Group__62557);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1220:1: rule__Relation__Group__6__Impl : ( ( rule__Relation__ToAssignment_6 ) ) ;
    public final void rule__Relation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1224:1: ( ( ( rule__Relation__ToAssignment_6 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1225:1: ( ( rule__Relation__ToAssignment_6 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1225:1: ( ( rule__Relation__ToAssignment_6 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1226:1: ( rule__Relation__ToAssignment_6 )
            {
             before(grammarAccess.getRelationAccess().getToAssignment_6()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1227:1: ( rule__Relation__ToAssignment_6 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1227:2: rule__Relation__ToAssignment_6
            {
            pushFollow(FOLLOW_rule__Relation__ToAssignment_6_in_rule__Relation__Group__6__Impl2584);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1237:1: rule__Relation__Group__7 : rule__Relation__Group__7__Impl rule__Relation__Group__8 ;
    public final void rule__Relation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1241:1: ( rule__Relation__Group__7__Impl rule__Relation__Group__8 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1242:2: rule__Relation__Group__7__Impl rule__Relation__Group__8
            {
            pushFollow(FOLLOW_rule__Relation__Group__7__Impl_in_rule__Relation__Group__72614);
            rule__Relation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group__8_in_rule__Relation__Group__72617);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1249:1: rule__Relation__Group__7__Impl : ( ( rule__Relation__Group_7__0 ) ) ;
    public final void rule__Relation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1253:1: ( ( ( rule__Relation__Group_7__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1254:1: ( ( rule__Relation__Group_7__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1254:1: ( ( rule__Relation__Group_7__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1255:1: ( rule__Relation__Group_7__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup_7()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1256:1: ( rule__Relation__Group_7__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1256:2: rule__Relation__Group_7__0
            {
            pushFollow(FOLLOW_rule__Relation__Group_7__0_in_rule__Relation__Group__7__Impl2644);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1266:1: rule__Relation__Group__8 : rule__Relation__Group__8__Impl ;
    public final void rule__Relation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1270:1: ( rule__Relation__Group__8__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1271:2: rule__Relation__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group__8__Impl_in_rule__Relation__Group__82674);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1277:1: rule__Relation__Group__8__Impl : ( '}' ) ;
    public final void rule__Relation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1281:1: ( ( '}' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1282:1: ( '}' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1282:1: ( '}' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1283:1: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_27_in_rule__Relation__Group__8__Impl2702); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1314:1: rule__Relation__Group_4__0 : rule__Relation__Group_4__0__Impl rule__Relation__Group_4__1 ;
    public final void rule__Relation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1318:1: ( rule__Relation__Group_4__0__Impl rule__Relation__Group_4__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1319:2: rule__Relation__Group_4__0__Impl rule__Relation__Group_4__1
            {
            pushFollow(FOLLOW_rule__Relation__Group_4__0__Impl_in_rule__Relation__Group_4__02751);
            rule__Relation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_4__1_in_rule__Relation__Group_4__02754);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1326:1: rule__Relation__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Relation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1330:1: ( ( '{' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1331:1: ( '{' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1331:1: ( '{' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1332:1: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,26,FOLLOW_26_in_rule__Relation__Group_4__0__Impl2782); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1345:1: rule__Relation__Group_4__1 : rule__Relation__Group_4__1__Impl rule__Relation__Group_4__2 ;
    public final void rule__Relation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1349:1: ( rule__Relation__Group_4__1__Impl rule__Relation__Group_4__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1350:2: rule__Relation__Group_4__1__Impl rule__Relation__Group_4__2
            {
            pushFollow(FOLLOW_rule__Relation__Group_4__1__Impl_in_rule__Relation__Group_4__12813);
            rule__Relation__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_4__2_in_rule__Relation__Group_4__12816);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1357:1: rule__Relation__Group_4__1__Impl : ( ( rule__Relation__FromRelationAssignment_4_1 ) ) ;
    public final void rule__Relation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1361:1: ( ( ( rule__Relation__FromRelationAssignment_4_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1362:1: ( ( rule__Relation__FromRelationAssignment_4_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1362:1: ( ( rule__Relation__FromRelationAssignment_4_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1363:1: ( rule__Relation__FromRelationAssignment_4_1 )
            {
             before(grammarAccess.getRelationAccess().getFromRelationAssignment_4_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1364:1: ( rule__Relation__FromRelationAssignment_4_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1364:2: rule__Relation__FromRelationAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Relation__FromRelationAssignment_4_1_in_rule__Relation__Group_4__1__Impl2843);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1374:1: rule__Relation__Group_4__2 : rule__Relation__Group_4__2__Impl ;
    public final void rule__Relation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1378:1: ( rule__Relation__Group_4__2__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1379:2: rule__Relation__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_4__2__Impl_in_rule__Relation__Group_4__22873);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1385:1: rule__Relation__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Relation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1389:1: ( ( '}' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1390:1: ( '}' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1390:1: ( '}' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1391:1: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,27,FOLLOW_27_in_rule__Relation__Group_4__2__Impl2901); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1410:1: rule__Relation__Group_7__0 : rule__Relation__Group_7__0__Impl rule__Relation__Group_7__1 ;
    public final void rule__Relation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1414:1: ( rule__Relation__Group_7__0__Impl rule__Relation__Group_7__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1415:2: rule__Relation__Group_7__0__Impl rule__Relation__Group_7__1
            {
            pushFollow(FOLLOW_rule__Relation__Group_7__0__Impl_in_rule__Relation__Group_7__02938);
            rule__Relation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_7__1_in_rule__Relation__Group_7__02941);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1422:1: rule__Relation__Group_7__0__Impl : ( '{' ) ;
    public final void rule__Relation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1426:1: ( ( '{' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1427:1: ( '{' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1427:1: ( '{' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1428:1: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_7_0()); 
            match(input,26,FOLLOW_26_in_rule__Relation__Group_7__0__Impl2969); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1441:1: rule__Relation__Group_7__1 : rule__Relation__Group_7__1__Impl rule__Relation__Group_7__2 ;
    public final void rule__Relation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1445:1: ( rule__Relation__Group_7__1__Impl rule__Relation__Group_7__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1446:2: rule__Relation__Group_7__1__Impl rule__Relation__Group_7__2
            {
            pushFollow(FOLLOW_rule__Relation__Group_7__1__Impl_in_rule__Relation__Group_7__13000);
            rule__Relation__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relation__Group_7__2_in_rule__Relation__Group_7__13003);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1453:1: rule__Relation__Group_7__1__Impl : ( ( rule__Relation__ToRelationAssignment_7_1 ) ) ;
    public final void rule__Relation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1457:1: ( ( ( rule__Relation__ToRelationAssignment_7_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1458:1: ( ( rule__Relation__ToRelationAssignment_7_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1458:1: ( ( rule__Relation__ToRelationAssignment_7_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1459:1: ( rule__Relation__ToRelationAssignment_7_1 )
            {
             before(grammarAccess.getRelationAccess().getToRelationAssignment_7_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1460:1: ( rule__Relation__ToRelationAssignment_7_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1460:2: rule__Relation__ToRelationAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Relation__ToRelationAssignment_7_1_in_rule__Relation__Group_7__1__Impl3030);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1470:1: rule__Relation__Group_7__2 : rule__Relation__Group_7__2__Impl ;
    public final void rule__Relation__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1474:1: ( rule__Relation__Group_7__2__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1475:2: rule__Relation__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_7__2__Impl_in_rule__Relation__Group_7__23060);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1481:1: rule__Relation__Group_7__2__Impl : ( '}' ) ;
    public final void rule__Relation__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1485:1: ( ( '}' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1486:1: ( '}' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1486:1: ( '}' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1487:1: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_7_2()); 
            match(input,27,FOLLOW_27_in_rule__Relation__Group_7__2__Impl3088); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1506:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1510:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1511:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__03125);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__03128);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1518:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1522:1: ( ( 'enum' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1523:1: ( 'enum' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1523:1: ( 'enum' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1524:1: 'enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Enum__Group__0__Impl3156); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1537:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1541:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1542:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__13187);
            rule__Enum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__13190);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1549:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1553:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1554:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1554:1: ( ( rule__Enum__NameAssignment_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1555:1: ( rule__Enum__NameAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1556:1: ( rule__Enum__NameAssignment_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1556:2: rule__Enum__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl3217);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1566:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1570:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1571:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__23247);
            rule__Enum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__23250);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1578:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1582:1: ( ( '{' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1583:1: ( '{' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1583:1: ( '{' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1584:1: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Enum__Group__2__Impl3278); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1597:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1601:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1602:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__33309);
            rule__Enum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__33312);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1609:1: rule__Enum__Group__3__Impl : ( ( rule__Enum__LiteralsAssignment_3 ) ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1613:1: ( ( ( rule__Enum__LiteralsAssignment_3 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1614:1: ( ( rule__Enum__LiteralsAssignment_3 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1614:1: ( ( rule__Enum__LiteralsAssignment_3 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1615:1: ( rule__Enum__LiteralsAssignment_3 )
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_3()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1616:1: ( rule__Enum__LiteralsAssignment_3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1616:2: rule__Enum__LiteralsAssignment_3
            {
            pushFollow(FOLLOW_rule__Enum__LiteralsAssignment_3_in_rule__Enum__Group__3__Impl3339);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1626:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1630:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1631:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
            {
            pushFollow(FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__43369);
            rule__Enum__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__43372);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1638:1: rule__Enum__Group__4__Impl : ( ( rule__Enum__Group_4__0 )* ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1642:1: ( ( ( rule__Enum__Group_4__0 )* ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1643:1: ( ( rule__Enum__Group_4__0 )* )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1643:1: ( ( rule__Enum__Group_4__0 )* )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1644:1: ( rule__Enum__Group_4__0 )*
            {
             before(grammarAccess.getEnumAccess().getGroup_4()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1645:1: ( rule__Enum__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1645:2: rule__Enum__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Enum__Group_4__0_in_rule__Enum__Group__4__Impl3399);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1655:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1659:1: ( rule__Enum__Group__5__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1660:2: rule__Enum__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__53430);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1666:1: rule__Enum__Group__5__Impl : ( '}' ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1670:1: ( ( '}' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1671:1: ( '}' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1671:1: ( '}' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1672:1: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_27_in_rule__Enum__Group__5__Impl3458); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1697:1: rule__Enum__Group_4__0 : rule__Enum__Group_4__0__Impl rule__Enum__Group_4__1 ;
    public final void rule__Enum__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1701:1: ( rule__Enum__Group_4__0__Impl rule__Enum__Group_4__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1702:2: rule__Enum__Group_4__0__Impl rule__Enum__Group_4__1
            {
            pushFollow(FOLLOW_rule__Enum__Group_4__0__Impl_in_rule__Enum__Group_4__03501);
            rule__Enum__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group_4__1_in_rule__Enum__Group_4__03504);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1709:1: rule__Enum__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Enum__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1713:1: ( ( ',' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1714:1: ( ',' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1714:1: ( ',' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1715:1: ','
            {
             before(grammarAccess.getEnumAccess().getCommaKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__Enum__Group_4__0__Impl3532); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1728:1: rule__Enum__Group_4__1 : rule__Enum__Group_4__1__Impl ;
    public final void rule__Enum__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1732:1: ( rule__Enum__Group_4__1__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1733:2: rule__Enum__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group_4__1__Impl_in_rule__Enum__Group_4__13563);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1739:1: rule__Enum__Group_4__1__Impl : ( ( rule__Enum__LiteralsAssignment_4_1 ) ) ;
    public final void rule__Enum__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1743:1: ( ( ( rule__Enum__LiteralsAssignment_4_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1744:1: ( ( rule__Enum__LiteralsAssignment_4_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1744:1: ( ( rule__Enum__LiteralsAssignment_4_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1745:1: ( rule__Enum__LiteralsAssignment_4_1 )
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_4_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1746:1: ( rule__Enum__LiteralsAssignment_4_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1746:2: rule__Enum__LiteralsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Enum__LiteralsAssignment_4_1_in_rule__Enum__Group_4__1__Impl3590);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1760:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1764:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1765:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__03624);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__03627);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1772:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1776:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1777:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1777:1: ( ( rule__Field__NameAssignment_0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1778:1: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1779:1: ( rule__Field__NameAssignment_0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1779:2: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl3654);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1789:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1793:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1794:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13684);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__13687);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1801:1: rule__Field__Group__1__Impl : ( ( rule__Field__TypeAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1805:1: ( ( ( rule__Field__TypeAssignment_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1806:1: ( ( rule__Field__TypeAssignment_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1806:1: ( ( rule__Field__TypeAssignment_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1807:1: ( rule__Field__TypeAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1808:1: ( rule__Field__TypeAssignment_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1808:2: rule__Field__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__TypeAssignment_1_in_rule__Field__Group__1__Impl3714);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1818:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1822:1: ( rule__Field__Group__2__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1823:2: rule__Field__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23744);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1829:1: rule__Field__Group__2__Impl : ( ( rule__Field__ValidationRulesAssignment_2 )* ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1833:1: ( ( ( rule__Field__ValidationRulesAssignment_2 )* ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1834:1: ( ( rule__Field__ValidationRulesAssignment_2 )* )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1834:1: ( ( rule__Field__ValidationRulesAssignment_2 )* )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1835:1: ( rule__Field__ValidationRulesAssignment_2 )*
            {
             before(grammarAccess.getFieldAccess().getValidationRulesAssignment_2()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1836:1: ( rule__Field__ValidationRulesAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32||(LA12_0>=35 && LA12_0<=39)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1836:2: rule__Field__ValidationRulesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Field__ValidationRulesAssignment_2_in_rule__Field__Group__2__Impl3771);
            	    rule__Field__ValidationRulesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getFieldAccess().getValidationRulesAssignment_2()); 

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


    // $ANTLR start "rule__StringMinSpecification__Group__0"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1852:1: rule__StringMinSpecification__Group__0 : rule__StringMinSpecification__Group__0__Impl rule__StringMinSpecification__Group__1 ;
    public final void rule__StringMinSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1856:1: ( rule__StringMinSpecification__Group__0__Impl rule__StringMinSpecification__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1857:2: rule__StringMinSpecification__Group__0__Impl rule__StringMinSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__StringMinSpecification__Group__0__Impl_in_rule__StringMinSpecification__Group__03808);
            rule__StringMinSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringMinSpecification__Group__1_in_rule__StringMinSpecification__Group__03811);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1864:1: rule__StringMinSpecification__Group__0__Impl : ( 'minlength' ) ;
    public final void rule__StringMinSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1868:1: ( ( 'minlength' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1869:1: ( 'minlength' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1869:1: ( 'minlength' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1870:1: 'minlength'
            {
             before(grammarAccess.getStringMinSpecificationAccess().getMinlengthKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__StringMinSpecification__Group__0__Impl3839); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1883:1: rule__StringMinSpecification__Group__1 : rule__StringMinSpecification__Group__1__Impl rule__StringMinSpecification__Group__2 ;
    public final void rule__StringMinSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1887:1: ( rule__StringMinSpecification__Group__1__Impl rule__StringMinSpecification__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1888:2: rule__StringMinSpecification__Group__1__Impl rule__StringMinSpecification__Group__2
            {
            pushFollow(FOLLOW_rule__StringMinSpecification__Group__1__Impl_in_rule__StringMinSpecification__Group__13870);
            rule__StringMinSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringMinSpecification__Group__2_in_rule__StringMinSpecification__Group__13873);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1895:1: rule__StringMinSpecification__Group__1__Impl : ( '(' ) ;
    public final void rule__StringMinSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1899:1: ( ( '(' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1900:1: ( '(' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1900:1: ( '(' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1901:1: '('
            {
             before(grammarAccess.getStringMinSpecificationAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__StringMinSpecification__Group__1__Impl3901); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1914:1: rule__StringMinSpecification__Group__2 : rule__StringMinSpecification__Group__2__Impl rule__StringMinSpecification__Group__3 ;
    public final void rule__StringMinSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1918:1: ( rule__StringMinSpecification__Group__2__Impl rule__StringMinSpecification__Group__3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1919:2: rule__StringMinSpecification__Group__2__Impl rule__StringMinSpecification__Group__3
            {
            pushFollow(FOLLOW_rule__StringMinSpecification__Group__2__Impl_in_rule__StringMinSpecification__Group__23932);
            rule__StringMinSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringMinSpecification__Group__3_in_rule__StringMinSpecification__Group__23935);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1926:1: rule__StringMinSpecification__Group__2__Impl : ( ( rule__StringMinSpecification__MinAssignment_2 ) ) ;
    public final void rule__StringMinSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1930:1: ( ( ( rule__StringMinSpecification__MinAssignment_2 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1931:1: ( ( rule__StringMinSpecification__MinAssignment_2 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1931:1: ( ( rule__StringMinSpecification__MinAssignment_2 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1932:1: ( rule__StringMinSpecification__MinAssignment_2 )
            {
             before(grammarAccess.getStringMinSpecificationAccess().getMinAssignment_2()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1933:1: ( rule__StringMinSpecification__MinAssignment_2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1933:2: rule__StringMinSpecification__MinAssignment_2
            {
            pushFollow(FOLLOW_rule__StringMinSpecification__MinAssignment_2_in_rule__StringMinSpecification__Group__2__Impl3962);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1943:1: rule__StringMinSpecification__Group__3 : rule__StringMinSpecification__Group__3__Impl ;
    public final void rule__StringMinSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1947:1: ( rule__StringMinSpecification__Group__3__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1948:2: rule__StringMinSpecification__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StringMinSpecification__Group__3__Impl_in_rule__StringMinSpecification__Group__33992);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1954:1: rule__StringMinSpecification__Group__3__Impl : ( ')' ) ;
    public final void rule__StringMinSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1958:1: ( ( ')' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1959:1: ( ')' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1959:1: ( ')' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1960:1: ')'
            {
             before(grammarAccess.getStringMinSpecificationAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__StringMinSpecification__Group__3__Impl4020); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1981:1: rule__StringMaxSpecification__Group__0 : rule__StringMaxSpecification__Group__0__Impl rule__StringMaxSpecification__Group__1 ;
    public final void rule__StringMaxSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1985:1: ( rule__StringMaxSpecification__Group__0__Impl rule__StringMaxSpecification__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1986:2: rule__StringMaxSpecification__Group__0__Impl rule__StringMaxSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__StringMaxSpecification__Group__0__Impl_in_rule__StringMaxSpecification__Group__04059);
            rule__StringMaxSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringMaxSpecification__Group__1_in_rule__StringMaxSpecification__Group__04062);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1993:1: rule__StringMaxSpecification__Group__0__Impl : ( 'maxlength' ) ;
    public final void rule__StringMaxSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1997:1: ( ( 'maxlength' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1998:1: ( 'maxlength' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1998:1: ( 'maxlength' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:1999:1: 'maxlength'
            {
             before(grammarAccess.getStringMaxSpecificationAccess().getMaxlengthKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__StringMaxSpecification__Group__0__Impl4090); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2012:1: rule__StringMaxSpecification__Group__1 : rule__StringMaxSpecification__Group__1__Impl rule__StringMaxSpecification__Group__2 ;
    public final void rule__StringMaxSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2016:1: ( rule__StringMaxSpecification__Group__1__Impl rule__StringMaxSpecification__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2017:2: rule__StringMaxSpecification__Group__1__Impl rule__StringMaxSpecification__Group__2
            {
            pushFollow(FOLLOW_rule__StringMaxSpecification__Group__1__Impl_in_rule__StringMaxSpecification__Group__14121);
            rule__StringMaxSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringMaxSpecification__Group__2_in_rule__StringMaxSpecification__Group__14124);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2024:1: rule__StringMaxSpecification__Group__1__Impl : ( '(' ) ;
    public final void rule__StringMaxSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2028:1: ( ( '(' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2029:1: ( '(' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2029:1: ( '(' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2030:1: '('
            {
             before(grammarAccess.getStringMaxSpecificationAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__StringMaxSpecification__Group__1__Impl4152); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2043:1: rule__StringMaxSpecification__Group__2 : rule__StringMaxSpecification__Group__2__Impl rule__StringMaxSpecification__Group__3 ;
    public final void rule__StringMaxSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2047:1: ( rule__StringMaxSpecification__Group__2__Impl rule__StringMaxSpecification__Group__3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2048:2: rule__StringMaxSpecification__Group__2__Impl rule__StringMaxSpecification__Group__3
            {
            pushFollow(FOLLOW_rule__StringMaxSpecification__Group__2__Impl_in_rule__StringMaxSpecification__Group__24183);
            rule__StringMaxSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringMaxSpecification__Group__3_in_rule__StringMaxSpecification__Group__24186);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2055:1: rule__StringMaxSpecification__Group__2__Impl : ( ( rule__StringMaxSpecification__MaxAssignment_2 ) ) ;
    public final void rule__StringMaxSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2059:1: ( ( ( rule__StringMaxSpecification__MaxAssignment_2 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2060:1: ( ( rule__StringMaxSpecification__MaxAssignment_2 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2060:1: ( ( rule__StringMaxSpecification__MaxAssignment_2 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2061:1: ( rule__StringMaxSpecification__MaxAssignment_2 )
            {
             before(grammarAccess.getStringMaxSpecificationAccess().getMaxAssignment_2()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2062:1: ( rule__StringMaxSpecification__MaxAssignment_2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2062:2: rule__StringMaxSpecification__MaxAssignment_2
            {
            pushFollow(FOLLOW_rule__StringMaxSpecification__MaxAssignment_2_in_rule__StringMaxSpecification__Group__2__Impl4213);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2072:1: rule__StringMaxSpecification__Group__3 : rule__StringMaxSpecification__Group__3__Impl ;
    public final void rule__StringMaxSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2076:1: ( rule__StringMaxSpecification__Group__3__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2077:2: rule__StringMaxSpecification__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StringMaxSpecification__Group__3__Impl_in_rule__StringMaxSpecification__Group__34243);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2083:1: rule__StringMaxSpecification__Group__3__Impl : ( ')' ) ;
    public final void rule__StringMaxSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2087:1: ( ( ')' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2088:1: ( ')' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2088:1: ( ')' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2089:1: ')'
            {
             before(grammarAccess.getStringMaxSpecificationAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__StringMaxSpecification__Group__3__Impl4271); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2110:1: rule__IntegerMinSpecification__Group__0 : rule__IntegerMinSpecification__Group__0__Impl rule__IntegerMinSpecification__Group__1 ;
    public final void rule__IntegerMinSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2114:1: ( rule__IntegerMinSpecification__Group__0__Impl rule__IntegerMinSpecification__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2115:2: rule__IntegerMinSpecification__Group__0__Impl rule__IntegerMinSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__IntegerMinSpecification__Group__0__Impl_in_rule__IntegerMinSpecification__Group__04310);
            rule__IntegerMinSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerMinSpecification__Group__1_in_rule__IntegerMinSpecification__Group__04313);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2122:1: rule__IntegerMinSpecification__Group__0__Impl : ( 'min' ) ;
    public final void rule__IntegerMinSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2126:1: ( ( 'min' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2127:1: ( 'min' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2127:1: ( 'min' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2128:1: 'min'
            {
             before(grammarAccess.getIntegerMinSpecificationAccess().getMinKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__IntegerMinSpecification__Group__0__Impl4341); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2141:1: rule__IntegerMinSpecification__Group__1 : rule__IntegerMinSpecification__Group__1__Impl rule__IntegerMinSpecification__Group__2 ;
    public final void rule__IntegerMinSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2145:1: ( rule__IntegerMinSpecification__Group__1__Impl rule__IntegerMinSpecification__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2146:2: rule__IntegerMinSpecification__Group__1__Impl rule__IntegerMinSpecification__Group__2
            {
            pushFollow(FOLLOW_rule__IntegerMinSpecification__Group__1__Impl_in_rule__IntegerMinSpecification__Group__14372);
            rule__IntegerMinSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerMinSpecification__Group__2_in_rule__IntegerMinSpecification__Group__14375);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2153:1: rule__IntegerMinSpecification__Group__1__Impl : ( '(' ) ;
    public final void rule__IntegerMinSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2157:1: ( ( '(' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2158:1: ( '(' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2158:1: ( '(' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2159:1: '('
            {
             before(grammarAccess.getIntegerMinSpecificationAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__IntegerMinSpecification__Group__1__Impl4403); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2172:1: rule__IntegerMinSpecification__Group__2 : rule__IntegerMinSpecification__Group__2__Impl rule__IntegerMinSpecification__Group__3 ;
    public final void rule__IntegerMinSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2176:1: ( rule__IntegerMinSpecification__Group__2__Impl rule__IntegerMinSpecification__Group__3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2177:2: rule__IntegerMinSpecification__Group__2__Impl rule__IntegerMinSpecification__Group__3
            {
            pushFollow(FOLLOW_rule__IntegerMinSpecification__Group__2__Impl_in_rule__IntegerMinSpecification__Group__24434);
            rule__IntegerMinSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerMinSpecification__Group__3_in_rule__IntegerMinSpecification__Group__24437);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2184:1: rule__IntegerMinSpecification__Group__2__Impl : ( ( rule__IntegerMinSpecification__MinAssignment_2 ) ) ;
    public final void rule__IntegerMinSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2188:1: ( ( ( rule__IntegerMinSpecification__MinAssignment_2 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2189:1: ( ( rule__IntegerMinSpecification__MinAssignment_2 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2189:1: ( ( rule__IntegerMinSpecification__MinAssignment_2 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2190:1: ( rule__IntegerMinSpecification__MinAssignment_2 )
            {
             before(grammarAccess.getIntegerMinSpecificationAccess().getMinAssignment_2()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2191:1: ( rule__IntegerMinSpecification__MinAssignment_2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2191:2: rule__IntegerMinSpecification__MinAssignment_2
            {
            pushFollow(FOLLOW_rule__IntegerMinSpecification__MinAssignment_2_in_rule__IntegerMinSpecification__Group__2__Impl4464);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2201:1: rule__IntegerMinSpecification__Group__3 : rule__IntegerMinSpecification__Group__3__Impl ;
    public final void rule__IntegerMinSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2205:1: ( rule__IntegerMinSpecification__Group__3__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2206:2: rule__IntegerMinSpecification__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__IntegerMinSpecification__Group__3__Impl_in_rule__IntegerMinSpecification__Group__34494);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2212:1: rule__IntegerMinSpecification__Group__3__Impl : ( ')' ) ;
    public final void rule__IntegerMinSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2216:1: ( ( ')' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2217:1: ( ')' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2217:1: ( ')' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2218:1: ')'
            {
             before(grammarAccess.getIntegerMinSpecificationAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__IntegerMinSpecification__Group__3__Impl4522); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2239:1: rule__IntegerMaxSpecification__Group__0 : rule__IntegerMaxSpecification__Group__0__Impl rule__IntegerMaxSpecification__Group__1 ;
    public final void rule__IntegerMaxSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2243:1: ( rule__IntegerMaxSpecification__Group__0__Impl rule__IntegerMaxSpecification__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2244:2: rule__IntegerMaxSpecification__Group__0__Impl rule__IntegerMaxSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__IntegerMaxSpecification__Group__0__Impl_in_rule__IntegerMaxSpecification__Group__04561);
            rule__IntegerMaxSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerMaxSpecification__Group__1_in_rule__IntegerMaxSpecification__Group__04564);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2251:1: rule__IntegerMaxSpecification__Group__0__Impl : ( 'max' ) ;
    public final void rule__IntegerMaxSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2255:1: ( ( 'max' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2256:1: ( 'max' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2256:1: ( 'max' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2257:1: 'max'
            {
             before(grammarAccess.getIntegerMaxSpecificationAccess().getMaxKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__IntegerMaxSpecification__Group__0__Impl4592); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2270:1: rule__IntegerMaxSpecification__Group__1 : rule__IntegerMaxSpecification__Group__1__Impl rule__IntegerMaxSpecification__Group__2 ;
    public final void rule__IntegerMaxSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2274:1: ( rule__IntegerMaxSpecification__Group__1__Impl rule__IntegerMaxSpecification__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2275:2: rule__IntegerMaxSpecification__Group__1__Impl rule__IntegerMaxSpecification__Group__2
            {
            pushFollow(FOLLOW_rule__IntegerMaxSpecification__Group__1__Impl_in_rule__IntegerMaxSpecification__Group__14623);
            rule__IntegerMaxSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerMaxSpecification__Group__2_in_rule__IntegerMaxSpecification__Group__14626);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2282:1: rule__IntegerMaxSpecification__Group__1__Impl : ( '(' ) ;
    public final void rule__IntegerMaxSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2286:1: ( ( '(' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2287:1: ( '(' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2287:1: ( '(' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2288:1: '('
            {
             before(grammarAccess.getIntegerMaxSpecificationAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__IntegerMaxSpecification__Group__1__Impl4654); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2301:1: rule__IntegerMaxSpecification__Group__2 : rule__IntegerMaxSpecification__Group__2__Impl rule__IntegerMaxSpecification__Group__3 ;
    public final void rule__IntegerMaxSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2305:1: ( rule__IntegerMaxSpecification__Group__2__Impl rule__IntegerMaxSpecification__Group__3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2306:2: rule__IntegerMaxSpecification__Group__2__Impl rule__IntegerMaxSpecification__Group__3
            {
            pushFollow(FOLLOW_rule__IntegerMaxSpecification__Group__2__Impl_in_rule__IntegerMaxSpecification__Group__24685);
            rule__IntegerMaxSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerMaxSpecification__Group__3_in_rule__IntegerMaxSpecification__Group__24688);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2313:1: rule__IntegerMaxSpecification__Group__2__Impl : ( ( rule__IntegerMaxSpecification__MaxAssignment_2 ) ) ;
    public final void rule__IntegerMaxSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2317:1: ( ( ( rule__IntegerMaxSpecification__MaxAssignment_2 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2318:1: ( ( rule__IntegerMaxSpecification__MaxAssignment_2 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2318:1: ( ( rule__IntegerMaxSpecification__MaxAssignment_2 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2319:1: ( rule__IntegerMaxSpecification__MaxAssignment_2 )
            {
             before(grammarAccess.getIntegerMaxSpecificationAccess().getMaxAssignment_2()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2320:1: ( rule__IntegerMaxSpecification__MaxAssignment_2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2320:2: rule__IntegerMaxSpecification__MaxAssignment_2
            {
            pushFollow(FOLLOW_rule__IntegerMaxSpecification__MaxAssignment_2_in_rule__IntegerMaxSpecification__Group__2__Impl4715);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2330:1: rule__IntegerMaxSpecification__Group__3 : rule__IntegerMaxSpecification__Group__3__Impl ;
    public final void rule__IntegerMaxSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2334:1: ( rule__IntegerMaxSpecification__Group__3__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2335:2: rule__IntegerMaxSpecification__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__IntegerMaxSpecification__Group__3__Impl_in_rule__IntegerMaxSpecification__Group__34745);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2341:1: rule__IntegerMaxSpecification__Group__3__Impl : ( ')' ) ;
    public final void rule__IntegerMaxSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2345:1: ( ( ')' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2346:1: ( ')' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2346:1: ( ')' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2347:1: ')'
            {
             before(grammarAccess.getIntegerMaxSpecificationAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__IntegerMaxSpecification__Group__3__Impl4773); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2368:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2372:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2373:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_rule__Pattern__Group__0__Impl_in_rule__Pattern__Group__04812);
            rule__Pattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pattern__Group__1_in_rule__Pattern__Group__04815);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2380:1: rule__Pattern__Group__0__Impl : ( 'pattern' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2384:1: ( ( 'pattern' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2385:1: ( 'pattern' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2385:1: ( 'pattern' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2386:1: 'pattern'
            {
             before(grammarAccess.getPatternAccess().getPatternKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Pattern__Group__0__Impl4843); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2399:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2403:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2404:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_rule__Pattern__Group__1__Impl_in_rule__Pattern__Group__14874);
            rule__Pattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pattern__Group__2_in_rule__Pattern__Group__14877);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2411:1: rule__Pattern__Group__1__Impl : ( '(' ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2415:1: ( ( '(' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2416:1: ( '(' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2416:1: ( '(' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2417:1: '('
            {
             before(grammarAccess.getPatternAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Pattern__Group__1__Impl4905); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2430:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2434:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2435:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_rule__Pattern__Group__2__Impl_in_rule__Pattern__Group__24936);
            rule__Pattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pattern__Group__3_in_rule__Pattern__Group__24939);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2442:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__RegexAssignment_2 ) ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2446:1: ( ( ( rule__Pattern__RegexAssignment_2 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2447:1: ( ( rule__Pattern__RegexAssignment_2 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2447:1: ( ( rule__Pattern__RegexAssignment_2 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2448:1: ( rule__Pattern__RegexAssignment_2 )
            {
             before(grammarAccess.getPatternAccess().getRegexAssignment_2()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2449:1: ( rule__Pattern__RegexAssignment_2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2449:2: rule__Pattern__RegexAssignment_2
            {
            pushFollow(FOLLOW_rule__Pattern__RegexAssignment_2_in_rule__Pattern__Group__2__Impl4966);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2459:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2463:1: ( rule__Pattern__Group__3__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2464:2: rule__Pattern__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Pattern__Group__3__Impl_in_rule__Pattern__Group__34996);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2470:1: rule__Pattern__Group__3__Impl : ( ')' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2474:1: ( ( ')' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2475:1: ( ')' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2475:1: ( ')' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2476:1: ')'
            {
             before(grammarAccess.getPatternAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__Pattern__Group__3__Impl5024); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2498:1: rule__Domain__ElementsAssignment : ( ruleDomainElement ) ;
    public final void rule__Domain__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2502:1: ( ( ruleDomainElement ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2503:1: ( ruleDomainElement )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2503:1: ( ruleDomainElement )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2504:1: ruleDomainElement
            {
             before(grammarAccess.getDomainAccess().getElementsDomainElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDomainElement_in_rule__Domain__ElementsAssignment5068);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2513:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2517:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2518:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2518:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2519:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_15099); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2528:1: rule__Entity__FieldsAssignment_2_1 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2532:1: ( ( ruleField ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2533:1: ( ruleField )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2533:1: ( ruleField )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2534:1: ruleField
            {
             before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__Entity__FieldsAssignment_2_15130);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2543:1: rule__Relation__TypeAssignment_1 : ( ruleRelationType ) ;
    public final void rule__Relation__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2547:1: ( ( ruleRelationType ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2548:1: ( ruleRelationType )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2548:1: ( ruleRelationType )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2549:1: ruleRelationType
            {
             before(grammarAccess.getRelationAccess().getTypeRelationTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRelationType_in_rule__Relation__TypeAssignment_15161);
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2558:1: rule__Relation__FromAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2562:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2563:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2563:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2564:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getFromEntityCrossReference_3_0()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2565:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2566:1: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getFromEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relation__FromAssignment_35196); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2577:1: rule__Relation__FromRelationAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Relation__FromRelationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2581:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2582:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2582:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2583:1: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getFromRelationIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relation__FromRelationAssignment_4_15231); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2592:1: rule__Relation__ToAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__ToAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2596:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2597:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2597:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2598:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getToEntityCrossReference_6_0()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2599:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2600:1: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getToEntityIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relation__ToAssignment_65266); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2611:1: rule__Relation__ToRelationAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__Relation__ToRelationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2615:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2616:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2616:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2617:1: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getToRelationIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relation__ToRelationAssignment_7_15301); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2626:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2630:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2631:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2631:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2632:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_15332); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2641:1: rule__Enum__LiteralsAssignment_3 : ( RULE_ID ) ;
    public final void rule__Enum__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2645:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2646:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2646:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2647:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getLiteralsIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__LiteralsAssignment_35363); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2656:1: rule__Enum__LiteralsAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Enum__LiteralsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2660:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2661:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2661:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2662:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getLiteralsIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__LiteralsAssignment_4_15394); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2671:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2675:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2676:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2676:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2677:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_05425); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2686:1: rule__Field__TypeAssignment_1 : ( ruleHdlType ) ;
    public final void rule__Field__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2690:1: ( ( ruleHdlType ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2691:1: ( ruleHdlType )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2691:1: ( ruleHdlType )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2692:1: ruleHdlType
            {
             before(grammarAccess.getFieldAccess().getTypeHdlTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleHdlType_in_rule__Field__TypeAssignment_15456);
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


    // $ANTLR start "rule__Field__ValidationRulesAssignment_2"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2701:1: rule__Field__ValidationRulesAssignment_2 : ( ruleValidationRule ) ;
    public final void rule__Field__ValidationRulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2705:1: ( ( ruleValidationRule ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2706:1: ( ruleValidationRule )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2706:1: ( ruleValidationRule )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2707:1: ruleValidationRule
            {
             before(grammarAccess.getFieldAccess().getValidationRulesValidationRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValidationRule_in_rule__Field__ValidationRulesAssignment_25487);
            ruleValidationRule();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getValidationRulesValidationRuleParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Field__ValidationRulesAssignment_2"


    // $ANTLR start "rule__Required__RequiredAssignment"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2716:1: rule__Required__RequiredAssignment : ( ( 'required' ) ) ;
    public final void rule__Required__RequiredAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2720:1: ( ( ( 'required' ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2721:1: ( ( 'required' ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2721:1: ( ( 'required' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2722:1: ( 'required' )
            {
             before(grammarAccess.getRequiredAccess().getRequiredRequiredKeyword_0()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2723:1: ( 'required' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2724:1: 'required'
            {
             before(grammarAccess.getRequiredAccess().getRequiredRequiredKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Required__RequiredAssignment5523); 
             after(grammarAccess.getRequiredAccess().getRequiredRequiredKeyword_0()); 

            }

             after(grammarAccess.getRequiredAccess().getRequiredRequiredKeyword_0()); 

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
    // $ANTLR end "rule__Required__RequiredAssignment"


    // $ANTLR start "rule__StringMinSpecification__MinAssignment_2"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2739:1: rule__StringMinSpecification__MinAssignment_2 : ( RULE_INT ) ;
    public final void rule__StringMinSpecification__MinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2743:1: ( ( RULE_INT ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2744:1: ( RULE_INT )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2744:1: ( RULE_INT )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2745:1: RULE_INT
            {
             before(grammarAccess.getStringMinSpecificationAccess().getMinINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StringMinSpecification__MinAssignment_25562); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2754:1: rule__StringMaxSpecification__MaxAssignment_2 : ( RULE_INT ) ;
    public final void rule__StringMaxSpecification__MaxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2758:1: ( ( RULE_INT ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2759:1: ( RULE_INT )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2759:1: ( RULE_INT )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2760:1: RULE_INT
            {
             before(grammarAccess.getStringMaxSpecificationAccess().getMaxINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StringMaxSpecification__MaxAssignment_25593); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2769:1: rule__IntegerMinSpecification__MinAssignment_2 : ( RULE_INT ) ;
    public final void rule__IntegerMinSpecification__MinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2773:1: ( ( RULE_INT ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2774:1: ( RULE_INT )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2774:1: ( RULE_INT )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2775:1: RULE_INT
            {
             before(grammarAccess.getIntegerMinSpecificationAccess().getMinINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerMinSpecification__MinAssignment_25624); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2784:1: rule__IntegerMaxSpecification__MaxAssignment_2 : ( RULE_INT ) ;
    public final void rule__IntegerMaxSpecification__MaxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2788:1: ( ( RULE_INT ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2789:1: ( RULE_INT )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2789:1: ( RULE_INT )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2790:1: RULE_INT
            {
             before(grammarAccess.getIntegerMaxSpecificationAccess().getMaxINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerMaxSpecification__MaxAssignment_25655); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2799:1: rule__Pattern__RegexAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Pattern__RegexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2803:1: ( ( RULE_STRING ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2804:1: ( RULE_STRING )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2804:1: ( RULE_STRING )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2805:1: RULE_STRING
            {
             before(grammarAccess.getPatternAccess().getRegexSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Pattern__RegexAssignment_25686); 
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


    // $ANTLR start "rule__HdlType__EnumTypeAssignment_0"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2814:1: rule__HdlType__EnumTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__HdlType__EnumTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2818:1: ( ( ( RULE_ID ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2819:1: ( ( RULE_ID ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2819:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2820:1: ( RULE_ID )
            {
             before(grammarAccess.getHdlTypeAccess().getEnumTypeEnumCrossReference_0_0()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2821:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2822:1: RULE_ID
            {
             before(grammarAccess.getHdlTypeAccess().getEnumTypeEnumIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HdlType__EnumTypeAssignment_05721); 
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
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2833:1: rule__HdlType__PrimitiveTypeAssignment_1 : ( ruleJHipsterType ) ;
    public final void rule__HdlType__PrimitiveTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2837:1: ( ( ruleJHipsterType ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2838:1: ( ruleJHipsterType )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2838:1: ( ruleJHipsterType )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:2839:1: ruleJHipsterType
            {
             before(grammarAccess.getHdlTypeAccess().getPrimitiveTypeJHipsterTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJHipsterType_in_rule__HdlType__PrimitiveTypeAssignment_15756);
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
    public static final BitSet FOLLOW_ruleValidationRule_in_entryRuleValidationRule422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidationRule429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValidationRule__Alternatives_in_ruleValidationRule455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequired_in_entryRuleRequired482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequired489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Required__RequiredAssignment_in_ruleRequired515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueRange_in_entryRuleValueRange542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueRange549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueRange__Alternatives_in_ruleValueRange575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinSpecification_in_entryRuleMinSpecification602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinSpecification609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MinSpecification__Alternatives_in_ruleMinSpecification635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxSpecification_in_entryRuleMaxSpecification662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxSpecification669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaxSpecification__Alternatives_in_ruleMaxSpecification695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringMinSpecification_in_entryRuleStringMinSpecification722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringMinSpecification729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringMinSpecification__Group__0_in_ruleStringMinSpecification755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringMaxSpecification_in_entryRuleStringMaxSpecification782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringMaxSpecification789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringMaxSpecification__Group__0_in_ruleStringMaxSpecification815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerMinSpecification_in_entryRuleIntegerMinSpecification842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerMinSpecification849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMinSpecification__Group__0_in_ruleIntegerMinSpecification875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerMaxSpecification_in_entryRuleIntegerMaxSpecification902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerMaxSpecification909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMaxSpecification__Group__0_in_ruleIntegerMaxSpecification935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePattern_in_entryRulePattern962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePattern969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__0_in_rulePattern995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHdlType_in_entryRuleHdlType1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHdlType1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HdlType__Alternatives_in_ruleHdlType1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationType__Alternatives_in_ruleRelationType1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JHipsterType__Alternatives_in_ruleJHipsterType1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__DomainElement__Alternatives1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_rule__DomainElement__Alternatives1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__DomainElement__Alternatives1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequired_in_rule__ValidationRule__Alternatives1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueRange_in_rule__ValidationRule__Alternatives1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePattern_in_rule__ValidationRule__Alternatives1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinSpecification_in_rule__ValueRange__Alternatives1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxSpecification_in_rule__ValueRange__Alternatives1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringMinSpecification_in_rule__MinSpecification__Alternatives1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerMinSpecification_in_rule__MinSpecification__Alternatives1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringMaxSpecification_in_rule__MaxSpecification__Alternatives1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerMaxSpecification_in_rule__MaxSpecification__Alternatives1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HdlType__EnumTypeAssignment_0_in_rule__HdlType__Alternatives1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HdlType__PrimitiveTypeAssignment_1_in_rule__HdlType__Alternatives1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__RelationType__Alternatives1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RelationType__Alternatives1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RelationType__Alternatives1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RelationType__Alternatives1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__JHipsterType__Alternatives1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__JHipsterType__Alternatives1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__JHipsterType__Alternatives1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__JHipsterType__Alternatives1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__JHipsterType__Alternatives1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__JHipsterType__Alternatives1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__JHipsterType__Alternatives1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__JHipsterType__Alternatives1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__JHipsterType__Alternatives1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__JHipsterType__Alternatives1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Entity__Group__0__Impl1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11877 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__02000 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__02003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Entity__Group_2__0__Impl2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__12062 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__2_in_rule__Entity__Group_2__12065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FieldsAssignment_2_1_in_rule__Entity__Group_2__1__Impl2092 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__2__Impl_in_rule__Entity__Group_2__22123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Entity__Group_2__2__Impl2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__0__Impl_in_rule__Relation__Group__02188 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__Relation__Group__1_in_rule__Relation__Group__02191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Relation__Group__0__Impl2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__1__Impl_in_rule__Relation__Group__12250 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__2_in_rule__Relation__Group__12253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__TypeAssignment_1_in_rule__Relation__Group__1__Impl2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__2__Impl_in_rule__Relation__Group__22310 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relation__Group__3_in_rule__Relation__Group__22313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Relation__Group__2__Impl2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__3__Impl_in_rule__Relation__Group__32372 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__4_in_rule__Relation__Group__32375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__FromAssignment_3_in_rule__Relation__Group__3__Impl2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__4__Impl_in_rule__Relation__Group__42432 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__5_in_rule__Relation__Group__42435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__0_in_rule__Relation__Group__4__Impl2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__5__Impl_in_rule__Relation__Group__52492 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relation__Group__6_in_rule__Relation__Group__52495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Relation__Group__5__Impl2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__6__Impl_in_rule__Relation__Group__62554 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__7_in_rule__Relation__Group__62557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__ToAssignment_6_in_rule__Relation__Group__6__Impl2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__7__Impl_in_rule__Relation__Group__72614 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Relation__Group__8_in_rule__Relation__Group__72617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__0_in_rule__Relation__Group__7__Impl2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__8__Impl_in_rule__Relation__Group__82674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Relation__Group__8__Impl2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__0__Impl_in_rule__Relation__Group_4__02751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__1_in_rule__Relation__Group_4__02754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Relation__Group_4__0__Impl2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__1__Impl_in_rule__Relation__Group_4__12813 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__2_in_rule__Relation__Group_4__12816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__FromRelationAssignment_4_1_in_rule__Relation__Group_4__1__Impl2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_4__2__Impl_in_rule__Relation__Group_4__22873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Relation__Group_4__2__Impl2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__0__Impl_in_rule__Relation__Group_7__02938 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__1_in_rule__Relation__Group_7__02941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Relation__Group_7__0__Impl2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__1__Impl_in_rule__Relation__Group_7__13000 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__2_in_rule__Relation__Group_7__13003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__ToRelationAssignment_7_1_in_rule__Relation__Group_7__1__Impl3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_7__2__Impl_in_rule__Relation__Group_7__23060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Relation__Group_7__2__Impl3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__03125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__03128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Enum__Group__0__Impl3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__13187 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__13190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__23247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__23250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Enum__Group__2__Impl3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__33309 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__33312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__LiteralsAssignment_3_in_rule__Enum__Group__3__Impl3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__43369 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__43372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_4__0_in_rule__Enum__Group__4__Impl3399 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__53430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Enum__Group__5__Impl3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_4__0__Impl_in_rule__Enum__Group_4__03501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group_4__1_in_rule__Enum__Group_4__03504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Enum__Group_4__0__Impl3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_4__1__Impl_in_rule__Enum__Group_4__13563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__LiteralsAssignment_4_1_in_rule__Enum__Group_4__1__Impl3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__03624 = new BitSet(new long[]{0x0000000001FF8010L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__03627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13684 = new BitSet(new long[]{0x000000F900000000L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__13687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypeAssignment_1_in_rule__Field__Group__1__Impl3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__ValidationRulesAssignment_2_in_rule__Field__Group__2__Impl3771 = new BitSet(new long[]{0x000000F900000002L});
    public static final BitSet FOLLOW_rule__StringMinSpecification__Group__0__Impl_in_rule__StringMinSpecification__Group__03808 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__StringMinSpecification__Group__1_in_rule__StringMinSpecification__Group__03811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__StringMinSpecification__Group__0__Impl3839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringMinSpecification__Group__1__Impl_in_rule__StringMinSpecification__Group__13870 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringMinSpecification__Group__2_in_rule__StringMinSpecification__Group__13873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__StringMinSpecification__Group__1__Impl3901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringMinSpecification__Group__2__Impl_in_rule__StringMinSpecification__Group__23932 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__StringMinSpecification__Group__3_in_rule__StringMinSpecification__Group__23935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringMinSpecification__MinAssignment_2_in_rule__StringMinSpecification__Group__2__Impl3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringMinSpecification__Group__3__Impl_in_rule__StringMinSpecification__Group__33992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__StringMinSpecification__Group__3__Impl4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringMaxSpecification__Group__0__Impl_in_rule__StringMaxSpecification__Group__04059 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__StringMaxSpecification__Group__1_in_rule__StringMaxSpecification__Group__04062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__StringMaxSpecification__Group__0__Impl4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringMaxSpecification__Group__1__Impl_in_rule__StringMaxSpecification__Group__14121 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringMaxSpecification__Group__2_in_rule__StringMaxSpecification__Group__14124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__StringMaxSpecification__Group__1__Impl4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringMaxSpecification__Group__2__Impl_in_rule__StringMaxSpecification__Group__24183 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__StringMaxSpecification__Group__3_in_rule__StringMaxSpecification__Group__24186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringMaxSpecification__MaxAssignment_2_in_rule__StringMaxSpecification__Group__2__Impl4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringMaxSpecification__Group__3__Impl_in_rule__StringMaxSpecification__Group__34243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__StringMaxSpecification__Group__3__Impl4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMinSpecification__Group__0__Impl_in_rule__IntegerMinSpecification__Group__04310 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__IntegerMinSpecification__Group__1_in_rule__IntegerMinSpecification__Group__04313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__IntegerMinSpecification__Group__0__Impl4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMinSpecification__Group__1__Impl_in_rule__IntegerMinSpecification__Group__14372 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IntegerMinSpecification__Group__2_in_rule__IntegerMinSpecification__Group__14375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__IntegerMinSpecification__Group__1__Impl4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMinSpecification__Group__2__Impl_in_rule__IntegerMinSpecification__Group__24434 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__IntegerMinSpecification__Group__3_in_rule__IntegerMinSpecification__Group__24437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMinSpecification__MinAssignment_2_in_rule__IntegerMinSpecification__Group__2__Impl4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMinSpecification__Group__3__Impl_in_rule__IntegerMinSpecification__Group__34494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__IntegerMinSpecification__Group__3__Impl4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMaxSpecification__Group__0__Impl_in_rule__IntegerMaxSpecification__Group__04561 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__IntegerMaxSpecification__Group__1_in_rule__IntegerMaxSpecification__Group__04564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__IntegerMaxSpecification__Group__0__Impl4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMaxSpecification__Group__1__Impl_in_rule__IntegerMaxSpecification__Group__14623 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IntegerMaxSpecification__Group__2_in_rule__IntegerMaxSpecification__Group__14626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__IntegerMaxSpecification__Group__1__Impl4654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMaxSpecification__Group__2__Impl_in_rule__IntegerMaxSpecification__Group__24685 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__IntegerMaxSpecification__Group__3_in_rule__IntegerMaxSpecification__Group__24688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMaxSpecification__MaxAssignment_2_in_rule__IntegerMaxSpecification__Group__2__Impl4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerMaxSpecification__Group__3__Impl_in_rule__IntegerMaxSpecification__Group__34745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__IntegerMaxSpecification__Group__3__Impl4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__0__Impl_in_rule__Pattern__Group__04812 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Pattern__Group__1_in_rule__Pattern__Group__04815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Pattern__Group__0__Impl4843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__1__Impl_in_rule__Pattern__Group__14874 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Pattern__Group__2_in_rule__Pattern__Group__14877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Pattern__Group__1__Impl4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__2__Impl_in_rule__Pattern__Group__24936 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Pattern__Group__3_in_rule__Pattern__Group__24939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__RegexAssignment_2_in_rule__Pattern__Group__2__Impl4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__3__Impl_in_rule__Pattern__Group__34996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Pattern__Group__3__Impl5024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_rule__Domain__ElementsAssignment5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_15099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Entity__FieldsAssignment_2_15130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationType_in_rule__Relation__TypeAssignment_15161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relation__FromAssignment_35196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relation__FromRelationAssignment_4_15231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relation__ToAssignment_65266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relation__ToRelationAssignment_7_15301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_15332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__LiteralsAssignment_35363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__LiteralsAssignment_4_15394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_05425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHdlType_in_rule__Field__TypeAssignment_15456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidationRule_in_rule__Field__ValidationRulesAssignment_25487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Required__RequiredAssignment5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StringMinSpecification__MinAssignment_25562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StringMaxSpecification__MaxAssignment_25593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerMinSpecification__MinAssignment_25624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerMaxSpecification__MaxAssignment_25655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Pattern__RegexAssignment_25686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HdlType__EnumTypeAssignment_05721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJHipsterType_in_rule__HdlType__PrimitiveTypeAssignment_15756 = new BitSet(new long[]{0x0000000000000002L});

}
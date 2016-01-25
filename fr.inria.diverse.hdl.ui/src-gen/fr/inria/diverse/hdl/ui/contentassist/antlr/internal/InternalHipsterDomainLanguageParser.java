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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'myElement'", "'{'", "'}'", "'feature'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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

                if ( (LA1_0==11) ) {
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


    // $ANTLR start "entryRuleMyElement"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:88:1: entryRuleMyElement : ruleMyElement EOF ;
    public final void entryRuleMyElement() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:89:1: ( ruleMyElement EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:90:1: ruleMyElement EOF
            {
             before(grammarAccess.getMyElementRule()); 
            pushFollow(FOLLOW_ruleMyElement_in_entryRuleMyElement122);
            ruleMyElement();

            state._fsp--;

             after(grammarAccess.getMyElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMyElement129); 

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
    // $ANTLR end "entryRuleMyElement"


    // $ANTLR start "ruleMyElement"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:97:1: ruleMyElement : ( ( rule__MyElement__Group__0 ) ) ;
    public final void ruleMyElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:101:2: ( ( ( rule__MyElement__Group__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:102:1: ( ( rule__MyElement__Group__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:102:1: ( ( rule__MyElement__Group__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:103:1: ( rule__MyElement__Group__0 )
            {
             before(grammarAccess.getMyElementAccess().getGroup()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:104:1: ( rule__MyElement__Group__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:104:2: rule__MyElement__Group__0
            {
            pushFollow(FOLLOW_rule__MyElement__Group__0_in_ruleMyElement155);
            rule__MyElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMyElement"


    // $ANTLR start "entryRuleMyFeature"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:116:1: entryRuleMyFeature : ruleMyFeature EOF ;
    public final void entryRuleMyFeature() throws RecognitionException {
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:117:1: ( ruleMyFeature EOF )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:118:1: ruleMyFeature EOF
            {
             before(grammarAccess.getMyFeatureRule()); 
            pushFollow(FOLLOW_ruleMyFeature_in_entryRuleMyFeature182);
            ruleMyFeature();

            state._fsp--;

             after(grammarAccess.getMyFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMyFeature189); 

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
    // $ANTLR end "entryRuleMyFeature"


    // $ANTLR start "ruleMyFeature"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:125:1: ruleMyFeature : ( ( rule__MyFeature__Group__0 ) ) ;
    public final void ruleMyFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:129:2: ( ( ( rule__MyFeature__Group__0 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:130:1: ( ( rule__MyFeature__Group__0 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:130:1: ( ( rule__MyFeature__Group__0 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:131:1: ( rule__MyFeature__Group__0 )
            {
             before(grammarAccess.getMyFeatureAccess().getGroup()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:132:1: ( rule__MyFeature__Group__0 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:132:2: rule__MyFeature__Group__0
            {
            pushFollow(FOLLOW_rule__MyFeature__Group__0_in_ruleMyFeature215);
            rule__MyFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMyFeature"


    // $ANTLR start "rule__MyElement__Group__0"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:146:1: rule__MyElement__Group__0 : rule__MyElement__Group__0__Impl rule__MyElement__Group__1 ;
    public final void rule__MyElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:150:1: ( rule__MyElement__Group__0__Impl rule__MyElement__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:151:2: rule__MyElement__Group__0__Impl rule__MyElement__Group__1
            {
            pushFollow(FOLLOW_rule__MyElement__Group__0__Impl_in_rule__MyElement__Group__0249);
            rule__MyElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MyElement__Group__1_in_rule__MyElement__Group__0252);
            rule__MyElement__Group__1();

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
    // $ANTLR end "rule__MyElement__Group__0"


    // $ANTLR start "rule__MyElement__Group__0__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:158:1: rule__MyElement__Group__0__Impl : ( 'myElement' ) ;
    public final void rule__MyElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:162:1: ( ( 'myElement' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:163:1: ( 'myElement' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:163:1: ( 'myElement' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:164:1: 'myElement'
            {
             before(grammarAccess.getMyElementAccess().getMyElementKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__MyElement__Group__0__Impl280); 
             after(grammarAccess.getMyElementAccess().getMyElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyElement__Group__0__Impl"


    // $ANTLR start "rule__MyElement__Group__1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:177:1: rule__MyElement__Group__1 : rule__MyElement__Group__1__Impl rule__MyElement__Group__2 ;
    public final void rule__MyElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:181:1: ( rule__MyElement__Group__1__Impl rule__MyElement__Group__2 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:182:2: rule__MyElement__Group__1__Impl rule__MyElement__Group__2
            {
            pushFollow(FOLLOW_rule__MyElement__Group__1__Impl_in_rule__MyElement__Group__1311);
            rule__MyElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MyElement__Group__2_in_rule__MyElement__Group__1314);
            rule__MyElement__Group__2();

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
    // $ANTLR end "rule__MyElement__Group__1"


    // $ANTLR start "rule__MyElement__Group__1__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:189:1: rule__MyElement__Group__1__Impl : ( ( rule__MyElement__NameAssignment_1 ) ) ;
    public final void rule__MyElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:193:1: ( ( ( rule__MyElement__NameAssignment_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:194:1: ( ( rule__MyElement__NameAssignment_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:194:1: ( ( rule__MyElement__NameAssignment_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:195:1: ( rule__MyElement__NameAssignment_1 )
            {
             before(grammarAccess.getMyElementAccess().getNameAssignment_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:196:1: ( rule__MyElement__NameAssignment_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:196:2: rule__MyElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MyElement__NameAssignment_1_in_rule__MyElement__Group__1__Impl341);
            rule__MyElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMyElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyElement__Group__1__Impl"


    // $ANTLR start "rule__MyElement__Group__2"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:206:1: rule__MyElement__Group__2 : rule__MyElement__Group__2__Impl rule__MyElement__Group__3 ;
    public final void rule__MyElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:210:1: ( rule__MyElement__Group__2__Impl rule__MyElement__Group__3 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:211:2: rule__MyElement__Group__2__Impl rule__MyElement__Group__3
            {
            pushFollow(FOLLOW_rule__MyElement__Group__2__Impl_in_rule__MyElement__Group__2371);
            rule__MyElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MyElement__Group__3_in_rule__MyElement__Group__2374);
            rule__MyElement__Group__3();

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
    // $ANTLR end "rule__MyElement__Group__2"


    // $ANTLR start "rule__MyElement__Group__2__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:218:1: rule__MyElement__Group__2__Impl : ( '{' ) ;
    public final void rule__MyElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:222:1: ( ( '{' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:223:1: ( '{' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:223:1: ( '{' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:224:1: '{'
            {
             before(grammarAccess.getMyElementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__MyElement__Group__2__Impl402); 
             after(grammarAccess.getMyElementAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyElement__Group__2__Impl"


    // $ANTLR start "rule__MyElement__Group__3"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:237:1: rule__MyElement__Group__3 : rule__MyElement__Group__3__Impl rule__MyElement__Group__4 ;
    public final void rule__MyElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:241:1: ( rule__MyElement__Group__3__Impl rule__MyElement__Group__4 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:242:2: rule__MyElement__Group__3__Impl rule__MyElement__Group__4
            {
            pushFollow(FOLLOW_rule__MyElement__Group__3__Impl_in_rule__MyElement__Group__3433);
            rule__MyElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MyElement__Group__4_in_rule__MyElement__Group__3436);
            rule__MyElement__Group__4();

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
    // $ANTLR end "rule__MyElement__Group__3"


    // $ANTLR start "rule__MyElement__Group__3__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:249:1: rule__MyElement__Group__3__Impl : ( ( rule__MyElement__SomeFeatureOfMyElementAssignment_3 )* ) ;
    public final void rule__MyElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:253:1: ( ( ( rule__MyElement__SomeFeatureOfMyElementAssignment_3 )* ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:254:1: ( ( rule__MyElement__SomeFeatureOfMyElementAssignment_3 )* )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:254:1: ( ( rule__MyElement__SomeFeatureOfMyElementAssignment_3 )* )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:255:1: ( rule__MyElement__SomeFeatureOfMyElementAssignment_3 )*
            {
             before(grammarAccess.getMyElementAccess().getSomeFeatureOfMyElementAssignment_3()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:256:1: ( rule__MyElement__SomeFeatureOfMyElementAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:256:2: rule__MyElement__SomeFeatureOfMyElementAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__MyElement__SomeFeatureOfMyElementAssignment_3_in_rule__MyElement__Group__3__Impl463);
            	    rule__MyElement__SomeFeatureOfMyElementAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getMyElementAccess().getSomeFeatureOfMyElementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyElement__Group__3__Impl"


    // $ANTLR start "rule__MyElement__Group__4"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:266:1: rule__MyElement__Group__4 : rule__MyElement__Group__4__Impl ;
    public final void rule__MyElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:270:1: ( rule__MyElement__Group__4__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:271:2: rule__MyElement__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MyElement__Group__4__Impl_in_rule__MyElement__Group__4494);
            rule__MyElement__Group__4__Impl();

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
    // $ANTLR end "rule__MyElement__Group__4"


    // $ANTLR start "rule__MyElement__Group__4__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:277:1: rule__MyElement__Group__4__Impl : ( '}' ) ;
    public final void rule__MyElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:281:1: ( ( '}' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:282:1: ( '}' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:282:1: ( '}' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:283:1: '}'
            {
             before(grammarAccess.getMyElementAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__MyElement__Group__4__Impl522); 
             after(grammarAccess.getMyElementAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyElement__Group__4__Impl"


    // $ANTLR start "rule__MyFeature__Group__0"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:306:1: rule__MyFeature__Group__0 : rule__MyFeature__Group__0__Impl rule__MyFeature__Group__1 ;
    public final void rule__MyFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:310:1: ( rule__MyFeature__Group__0__Impl rule__MyFeature__Group__1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:311:2: rule__MyFeature__Group__0__Impl rule__MyFeature__Group__1
            {
            pushFollow(FOLLOW_rule__MyFeature__Group__0__Impl_in_rule__MyFeature__Group__0563);
            rule__MyFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MyFeature__Group__1_in_rule__MyFeature__Group__0566);
            rule__MyFeature__Group__1();

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
    // $ANTLR end "rule__MyFeature__Group__0"


    // $ANTLR start "rule__MyFeature__Group__0__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:318:1: rule__MyFeature__Group__0__Impl : ( 'feature' ) ;
    public final void rule__MyFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:322:1: ( ( 'feature' ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:323:1: ( 'feature' )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:323:1: ( 'feature' )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:324:1: 'feature'
            {
             before(grammarAccess.getMyFeatureAccess().getFeatureKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__MyFeature__Group__0__Impl594); 
             after(grammarAccess.getMyFeatureAccess().getFeatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyFeature__Group__0__Impl"


    // $ANTLR start "rule__MyFeature__Group__1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:337:1: rule__MyFeature__Group__1 : rule__MyFeature__Group__1__Impl ;
    public final void rule__MyFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:341:1: ( rule__MyFeature__Group__1__Impl )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:342:2: rule__MyFeature__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MyFeature__Group__1__Impl_in_rule__MyFeature__Group__1625);
            rule__MyFeature__Group__1__Impl();

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
    // $ANTLR end "rule__MyFeature__Group__1"


    // $ANTLR start "rule__MyFeature__Group__1__Impl"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:348:1: rule__MyFeature__Group__1__Impl : ( ( rule__MyFeature__NameAssignment_1 ) ) ;
    public final void rule__MyFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:352:1: ( ( ( rule__MyFeature__NameAssignment_1 ) ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:353:1: ( ( rule__MyFeature__NameAssignment_1 ) )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:353:1: ( ( rule__MyFeature__NameAssignment_1 ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:354:1: ( rule__MyFeature__NameAssignment_1 )
            {
             before(grammarAccess.getMyFeatureAccess().getNameAssignment_1()); 
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:355:1: ( rule__MyFeature__NameAssignment_1 )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:355:2: rule__MyFeature__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MyFeature__NameAssignment_1_in_rule__MyFeature__Group__1__Impl652);
            rule__MyFeature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMyFeatureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyFeature__Group__1__Impl"


    // $ANTLR start "rule__Domain__ElementsAssignment"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:370:1: rule__Domain__ElementsAssignment : ( ruleMyElement ) ;
    public final void rule__Domain__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:374:1: ( ( ruleMyElement ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:375:1: ( ruleMyElement )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:375:1: ( ruleMyElement )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:376:1: ruleMyElement
            {
             before(grammarAccess.getDomainAccess().getElementsMyElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMyElement_in_rule__Domain__ElementsAssignment691);
            ruleMyElement();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getElementsMyElementParserRuleCall_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__MyElement__NameAssignment_1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:385:1: rule__MyElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MyElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:389:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:390:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:390:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:391:1: RULE_ID
            {
             before(grammarAccess.getMyElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MyElement__NameAssignment_1722); 
             after(grammarAccess.getMyElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyElement__NameAssignment_1"


    // $ANTLR start "rule__MyElement__SomeFeatureOfMyElementAssignment_3"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:400:1: rule__MyElement__SomeFeatureOfMyElementAssignment_3 : ( ruleMyFeature ) ;
    public final void rule__MyElement__SomeFeatureOfMyElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:404:1: ( ( ruleMyFeature ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:405:1: ( ruleMyFeature )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:405:1: ( ruleMyFeature )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:406:1: ruleMyFeature
            {
             before(grammarAccess.getMyElementAccess().getSomeFeatureOfMyElementMyFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMyFeature_in_rule__MyElement__SomeFeatureOfMyElementAssignment_3753);
            ruleMyFeature();

            state._fsp--;

             after(grammarAccess.getMyElementAccess().getSomeFeatureOfMyElementMyFeatureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyElement__SomeFeatureOfMyElementAssignment_3"


    // $ANTLR start "rule__MyFeature__NameAssignment_1"
    // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:415:1: rule__MyFeature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MyFeature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:419:1: ( ( RULE_ID ) )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:420:1: ( RULE_ID )
            {
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:420:1: ( RULE_ID )
            // ../fr.inria.diverse.hdl.ui/src-gen/fr/inria/diverse/hdl/ui/contentassist/antlr/internal/InternalHipsterDomainLanguage.g:421:1: RULE_ID
            {
             before(grammarAccess.getMyFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MyFeature__NameAssignment_1784); 
             after(grammarAccess.getMyFeatureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyFeature__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__ElementsAssignment_in_ruleDomain94 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleMyElement_in_entryRuleMyElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMyElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyElement__Group__0_in_ruleMyElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyFeature_in_entryRuleMyFeature182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMyFeature189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyFeature__Group__0_in_ruleMyFeature215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyElement__Group__0__Impl_in_rule__MyElement__Group__0249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MyElement__Group__1_in_rule__MyElement__Group__0252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__MyElement__Group__0__Impl280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyElement__Group__1__Impl_in_rule__MyElement__Group__1311 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__MyElement__Group__2_in_rule__MyElement__Group__1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyElement__NameAssignment_1_in_rule__MyElement__Group__1__Impl341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyElement__Group__2__Impl_in_rule__MyElement__Group__2371 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__MyElement__Group__3_in_rule__MyElement__Group__2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MyElement__Group__2__Impl402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyElement__Group__3__Impl_in_rule__MyElement__Group__3433 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__MyElement__Group__4_in_rule__MyElement__Group__3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyElement__SomeFeatureOfMyElementAssignment_3_in_rule__MyElement__Group__3__Impl463 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__MyElement__Group__4__Impl_in_rule__MyElement__Group__4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MyElement__Group__4__Impl522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyFeature__Group__0__Impl_in_rule__MyFeature__Group__0563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MyFeature__Group__1_in_rule__MyFeature__Group__0566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MyFeature__Group__0__Impl594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyFeature__Group__1__Impl_in_rule__MyFeature__Group__1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyFeature__NameAssignment_1_in_rule__MyFeature__Group__1__Impl652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyElement_in_rule__Domain__ElementsAssignment691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MyElement__NameAssignment_1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyFeature_in_rule__MyElement__SomeFeatureOfMyElementAssignment_3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MyFeature__NameAssignment_1784 = new BitSet(new long[]{0x0000000000000002L});

}
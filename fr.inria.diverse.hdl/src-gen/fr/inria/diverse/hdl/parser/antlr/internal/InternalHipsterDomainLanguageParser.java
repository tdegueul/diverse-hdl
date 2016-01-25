package fr.inria.diverse.hdl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.inria.diverse.hdl.services.HipsterDomainLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHipsterDomainLanguageParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g"; }



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



    // $ANTLR start "entryRuleDomain"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:67:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:68:2: (iv_ruleDomain= ruleDomain EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:69:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain75);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:76:1: ruleDomain returns [EObject current=null] : ( (lv_elements_0_0= ruleMyElement ) )* ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:79:28: ( ( (lv_elements_0_0= ruleMyElement ) )* )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:80:1: ( (lv_elements_0_0= ruleMyElement ) )*
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:80:1: ( (lv_elements_0_0= ruleMyElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:81:1: (lv_elements_0_0= ruleMyElement )
            	    {
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:81:1: (lv_elements_0_0= ruleMyElement )
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:82:3: lv_elements_0_0= ruleMyElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainAccess().getElementsMyElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMyElement_in_ruleDomain130);
            	    lv_elements_0_0=ruleMyElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"MyElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleMyElement"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:106:1: entryRuleMyElement returns [EObject current=null] : iv_ruleMyElement= ruleMyElement EOF ;
    public final EObject entryRuleMyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyElement = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:107:2: (iv_ruleMyElement= ruleMyElement EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:108:2: iv_ruleMyElement= ruleMyElement EOF
            {
             newCompositeNode(grammarAccess.getMyElementRule()); 
            pushFollow(FOLLOW_ruleMyElement_in_entryRuleMyElement166);
            iv_ruleMyElement=ruleMyElement();

            state._fsp--;

             current =iv_ruleMyElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMyElement176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMyElement"


    // $ANTLR start "ruleMyElement"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:115:1: ruleMyElement returns [EObject current=null] : (otherlv_0= 'myElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_someFeatureOfMyElement_3_0= ruleMyFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleMyElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_someFeatureOfMyElement_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:118:28: ( (otherlv_0= 'myElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_someFeatureOfMyElement_3_0= ruleMyFeature ) )* otherlv_4= '}' ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:119:1: (otherlv_0= 'myElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_someFeatureOfMyElement_3_0= ruleMyFeature ) )* otherlv_4= '}' )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:119:1: (otherlv_0= 'myElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_someFeatureOfMyElement_3_0= ruleMyFeature ) )* otherlv_4= '}' )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:119:3: otherlv_0= 'myElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_someFeatureOfMyElement_3_0= ruleMyFeature ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleMyElement213); 

                	newLeafNode(otherlv_0, grammarAccess.getMyElementAccess().getMyElementKeyword_0());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:124:1: (lv_name_1_0= RULE_ID )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMyElement230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMyElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMyElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleMyElement247); 

                	newLeafNode(otherlv_2, grammarAccess.getMyElementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:145:1: ( (lv_someFeatureOfMyElement_3_0= ruleMyFeature ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:146:1: (lv_someFeatureOfMyElement_3_0= ruleMyFeature )
            	    {
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:146:1: (lv_someFeatureOfMyElement_3_0= ruleMyFeature )
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:147:3: lv_someFeatureOfMyElement_3_0= ruleMyFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMyElementAccess().getSomeFeatureOfMyElementMyFeatureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMyFeature_in_ruleMyElement268);
            	    lv_someFeatureOfMyElement_3_0=ruleMyFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMyElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"someFeatureOfMyElement",
            	            		lv_someFeatureOfMyElement_3_0, 
            	            		"MyFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleMyElement281); 

                	newLeafNode(otherlv_4, grammarAccess.getMyElementAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMyElement"


    // $ANTLR start "entryRuleMyFeature"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:175:1: entryRuleMyFeature returns [EObject current=null] : iv_ruleMyFeature= ruleMyFeature EOF ;
    public final EObject entryRuleMyFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyFeature = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:176:2: (iv_ruleMyFeature= ruleMyFeature EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:177:2: iv_ruleMyFeature= ruleMyFeature EOF
            {
             newCompositeNode(grammarAccess.getMyFeatureRule()); 
            pushFollow(FOLLOW_ruleMyFeature_in_entryRuleMyFeature317);
            iv_ruleMyFeature=ruleMyFeature();

            state._fsp--;

             current =iv_ruleMyFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMyFeature327); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMyFeature"


    // $ANTLR start "ruleMyFeature"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:184:1: ruleMyFeature returns [EObject current=null] : (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMyFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:187:28: ( (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:188:1: (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:188:1: (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:188:3: otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleMyFeature364); 

                	newLeafNode(otherlv_0, grammarAccess.getMyFeatureAccess().getFeatureKeyword_0());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:192:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:193:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:193:1: (lv_name_1_0= RULE_ID )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:194:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMyFeature381); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMyFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMyFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMyFeature"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyElement_in_ruleDomain130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleMyElement_in_entryRuleMyElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMyElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMyElement213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMyElement230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMyElement247 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleMyFeature_in_ruleMyElement268 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleMyElement281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyFeature_in_entryRuleMyFeature317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMyFeature327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleMyFeature364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMyFeature381 = new BitSet(new long[]{0x0000000000000002L});

}
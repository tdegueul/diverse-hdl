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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHipsterDomainLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'{'", "'}'", "'relationship'", "'to'", "'required'", "'OneToMany'", "'ManyToOne'", "'OneToOne'", "'ManyToMany'", "'String'", "'Integer'", "'Long'", "'BigDecimal'", "'Float'", "'Double'", "'Enum'", "'Boolean'", "'LocalDate'", "'ZoneDateTime'"
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
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:68:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:69:2: (iv_ruleDomain= ruleDomain EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:70:2: iv_ruleDomain= ruleDomain EOF
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
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:77:1: ruleDomain returns [EObject current=null] : ( (lv_elements_0_0= ruleDomainElement ) )* ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:80:28: ( ( (lv_elements_0_0= ruleDomainElement ) )* )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:81:1: ( (lv_elements_0_0= ruleDomainElement ) )*
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:81:1: ( (lv_elements_0_0= ruleDomainElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:82:1: (lv_elements_0_0= ruleDomainElement )
            	    {
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:82:1: (lv_elements_0_0= ruleDomainElement )
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:83:3: lv_elements_0_0= ruleDomainElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainAccess().getElementsDomainElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDomainElement_in_ruleDomain130);
            	    lv_elements_0_0=ruleDomainElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"DomainElement");
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


    // $ANTLR start "entryRuleDomainElement"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:107:1: entryRuleDomainElement returns [EObject current=null] : iv_ruleDomainElement= ruleDomainElement EOF ;
    public final EObject entryRuleDomainElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainElement = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:108:2: (iv_ruleDomainElement= ruleDomainElement EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:109:2: iv_ruleDomainElement= ruleDomainElement EOF
            {
             newCompositeNode(grammarAccess.getDomainElementRule()); 
            pushFollow(FOLLOW_ruleDomainElement_in_entryRuleDomainElement166);
            iv_ruleDomainElement=ruleDomainElement();

            state._fsp--;

             current =iv_ruleDomainElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainElement176); 

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
    // $ANTLR end "entryRuleDomainElement"


    // $ANTLR start "ruleDomainElement"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:116:1: ruleDomainElement returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Relation_1= ruleRelation ) ;
    public final EObject ruleDomainElement() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Relation_1 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:119:28: ( (this_Entity_0= ruleEntity | this_Relation_1= ruleRelation ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:120:1: (this_Entity_0= ruleEntity | this_Relation_1= ruleRelation )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:120:1: (this_Entity_0= ruleEntity | this_Relation_1= ruleRelation )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:121:5: this_Entity_0= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getDomainElementAccess().getEntityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleDomainElement223);
                    this_Entity_0=ruleEntity();

                    state._fsp--;

                     
                            current = this_Entity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:131:5: this_Relation_1= ruleRelation
                    {
                     
                            newCompositeNode(grammarAccess.getDomainElementAccess().getRelationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRelation_in_ruleDomainElement250);
                    this_Relation_1=ruleRelation();

                    state._fsp--;

                     
                            current = this_Relation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleDomainElement"


    // $ANTLR start "entryRuleEntity"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:147:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:148:2: (iv_ruleEntity= ruleEntity EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:149:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity285);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity295); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:156:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:159:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' ) ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:160:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' ) )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:160:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:160:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleEntity332); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:164:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:165:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:165:1: (lv_name_1_0= RULE_ID )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:166:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity349); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:182:2: (otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:182:4: otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}'
            {
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity367); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2_0());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:186:1: ( (lv_fields_3_0= ruleField ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:187:1: (lv_fields_3_0= ruleField )
            	    {
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:187:1: (lv_fields_3_0= ruleField )
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:188:3: lv_fields_3_0= ruleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleEntity388);
            	    lv_fields_3_0=ruleField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_3_0, 
            	            		"Field");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleEntity401); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_2_2());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleRelation"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:216:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:217:2: (iv_ruleRelation= ruleRelation EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:218:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_ruleRelation_in_entryRuleRelation438);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelation448); 

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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:225:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'relationship' ( (lv_type_1_0= ruleRelationType ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '{' ( (lv_fromRelation_5_0= RULE_ID ) ) otherlv_6= '}' ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '{' ( (lv_toRelation_10_0= RULE_ID ) ) otherlv_11= '}' ) otherlv_12= '}' ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_fromRelation_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_toRelation_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:228:28: ( (otherlv_0= 'relationship' ( (lv_type_1_0= ruleRelationType ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '{' ( (lv_fromRelation_5_0= RULE_ID ) ) otherlv_6= '}' ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '{' ( (lv_toRelation_10_0= RULE_ID ) ) otherlv_11= '}' ) otherlv_12= '}' ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:229:1: (otherlv_0= 'relationship' ( (lv_type_1_0= ruleRelationType ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '{' ( (lv_fromRelation_5_0= RULE_ID ) ) otherlv_6= '}' ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '{' ( (lv_toRelation_10_0= RULE_ID ) ) otherlv_11= '}' ) otherlv_12= '}' )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:229:1: (otherlv_0= 'relationship' ( (lv_type_1_0= ruleRelationType ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '{' ( (lv_fromRelation_5_0= RULE_ID ) ) otherlv_6= '}' ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '{' ( (lv_toRelation_10_0= RULE_ID ) ) otherlv_11= '}' ) otherlv_12= '}' )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:229:3: otherlv_0= 'relationship' ( (lv_type_1_0= ruleRelationType ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '{' ( (lv_fromRelation_5_0= RULE_ID ) ) otherlv_6= '}' ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '{' ( (lv_toRelation_10_0= RULE_ID ) ) otherlv_11= '}' ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleRelation485); 

                	newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationshipKeyword_0());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:233:1: ( (lv_type_1_0= ruleRelationType ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:234:1: (lv_type_1_0= ruleRelationType )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:234:1: (lv_type_1_0= ruleRelationType )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:235:3: lv_type_1_0= ruleRelationType
            {
             
            	        newCompositeNode(grammarAccess.getRelationAccess().getTypeRelationTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRelationType_in_ruleRelation506);
            lv_type_1_0=ruleRelationType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"RelationType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRelation518); 

                	newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:255:1: ( (otherlv_3= RULE_ID ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:256:1: (otherlv_3= RULE_ID )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:256:1: (otherlv_3= RULE_ID )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:257:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelation538); 

            		newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getFromEntityCrossReference_3_0()); 
            	

            }


            }

            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:268:2: (otherlv_4= '{' ( (lv_fromRelation_5_0= RULE_ID ) ) otherlv_6= '}' )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:268:4: otherlv_4= '{' ( (lv_fromRelation_5_0= RULE_ID ) ) otherlv_6= '}'
            {
            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleRelation551); 

                	newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_4_0());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:272:1: ( (lv_fromRelation_5_0= RULE_ID ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:273:1: (lv_fromRelation_5_0= RULE_ID )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:273:1: (lv_fromRelation_5_0= RULE_ID )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:274:3: lv_fromRelation_5_0= RULE_ID
            {
            lv_fromRelation_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelation568); 

            			newLeafNode(lv_fromRelation_5_0, grammarAccess.getRelationAccess().getFromRelationIDTerminalRuleCall_4_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"fromRelation",
                    		lv_fromRelation_5_0, 
                    		"ID");
            	    

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleRelation585); 

                	newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_4_2());
                

            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleRelation598); 

                	newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getToKeyword_5());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:298:1: ( (otherlv_8= RULE_ID ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:299:1: (otherlv_8= RULE_ID )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:299:1: (otherlv_8= RULE_ID )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:300:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelation618); 

            		newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getToEntityCrossReference_6_0()); 
            	

            }


            }

            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:311:2: (otherlv_9= '{' ( (lv_toRelation_10_0= RULE_ID ) ) otherlv_11= '}' )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:311:4: otherlv_9= '{' ( (lv_toRelation_10_0= RULE_ID ) ) otherlv_11= '}'
            {
            otherlv_9=(Token)match(input,12,FOLLOW_12_in_ruleRelation631); 

                	newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_7_0());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:315:1: ( (lv_toRelation_10_0= RULE_ID ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:316:1: (lv_toRelation_10_0= RULE_ID )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:316:1: (lv_toRelation_10_0= RULE_ID )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:317:3: lv_toRelation_10_0= RULE_ID
            {
            lv_toRelation_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelation648); 

            			newLeafNode(lv_toRelation_10_0, grammarAccess.getRelationAccess().getToRelationIDTerminalRuleCall_7_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"toRelation",
                    		lv_toRelation_10_0, 
                    		"ID");
            	    

            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleRelation665); 

                	newLeafNode(otherlv_11, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_7_2());
                

            }

            otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleRelation678); 

                	newLeafNode(otherlv_12, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleField"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:349:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:350:2: (iv_ruleField= ruleField EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:351:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField714);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField724); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:358:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleJHipsterType ) ) ( (lv_required_2_0= 'required' ) )? ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_required_2_0=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:361:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleJHipsterType ) ) ( (lv_required_2_0= 'required' ) )? ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:362:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleJHipsterType ) ) ( (lv_required_2_0= 'required' ) )? )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:362:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleJHipsterType ) ) ( (lv_required_2_0= 'required' ) )? )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:362:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleJHipsterType ) ) ( (lv_required_2_0= 'required' ) )?
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:362:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:363:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:363:1: (lv_name_0_0= RULE_ID )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:364:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField766); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:380:2: ( (lv_type_1_0= ruleJHipsterType ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:381:1: (lv_type_1_0= ruleJHipsterType )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:381:1: (lv_type_1_0= ruleJHipsterType )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:382:3: lv_type_1_0= ruleJHipsterType
            {
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getTypeJHipsterTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJHipsterType_in_ruleField792);
            lv_type_1_0=ruleJHipsterType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"JHipsterType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:398:2: ( (lv_required_2_0= 'required' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:399:1: (lv_required_2_0= 'required' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:399:1: (lv_required_2_0= 'required' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:400:3: lv_required_2_0= 'required'
                    {
                    lv_required_2_0=(Token)match(input,16,FOLLOW_16_in_ruleField810); 

                            newLeafNode(lv_required_2_0, grammarAccess.getFieldAccess().getRequiredRequiredKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleField"


    // $ANTLR start "ruleRelationType"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:421:1: ruleRelationType returns [Enumerator current=null] : ( (enumLiteral_0= 'OneToMany' ) | (enumLiteral_1= 'ManyToOne' ) | (enumLiteral_2= 'OneToOne' ) | (enumLiteral_3= 'ManyToMany' ) ) ;
    public final Enumerator ruleRelationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:423:28: ( ( (enumLiteral_0= 'OneToMany' ) | (enumLiteral_1= 'ManyToOne' ) | (enumLiteral_2= 'OneToOne' ) | (enumLiteral_3= 'ManyToMany' ) ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:424:1: ( (enumLiteral_0= 'OneToMany' ) | (enumLiteral_1= 'ManyToOne' ) | (enumLiteral_2= 'OneToOne' ) | (enumLiteral_3= 'ManyToMany' ) )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:424:1: ( (enumLiteral_0= 'OneToMany' ) | (enumLiteral_1= 'ManyToOne' ) | (enumLiteral_2= 'OneToOne' ) | (enumLiteral_3= 'ManyToMany' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            case 20:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:424:2: (enumLiteral_0= 'OneToMany' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:424:2: (enumLiteral_0= 'OneToMany' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:424:4: enumLiteral_0= 'OneToMany'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_17_in_ruleRelationType874); 

                            current = grammarAccess.getRelationTypeAccess().getONE_TO_MANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRelationTypeAccess().getONE_TO_MANYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:430:6: (enumLiteral_1= 'ManyToOne' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:430:6: (enumLiteral_1= 'ManyToOne' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:430:8: enumLiteral_1= 'ManyToOne'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_18_in_ruleRelationType891); 

                            current = grammarAccess.getRelationTypeAccess().getMANY_TO_ONEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRelationTypeAccess().getMANY_TO_ONEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:436:6: (enumLiteral_2= 'OneToOne' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:436:6: (enumLiteral_2= 'OneToOne' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:436:8: enumLiteral_2= 'OneToOne'
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_19_in_ruleRelationType908); 

                            current = grammarAccess.getRelationTypeAccess().getONE_TO_ONEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRelationTypeAccess().getONE_TO_ONEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:442:6: (enumLiteral_3= 'ManyToMany' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:442:6: (enumLiteral_3= 'ManyToMany' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:442:8: enumLiteral_3= 'ManyToMany'
                    {
                    enumLiteral_3=(Token)match(input,20,FOLLOW_20_in_ruleRelationType925); 

                            current = grammarAccess.getRelationTypeAccess().getMANY_TO_MANYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getRelationTypeAccess().getMANY_TO_MANYEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleRelationType"


    // $ANTLR start "ruleJHipsterType"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:452:1: ruleJHipsterType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'BigDecimal' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Enum' ) | (enumLiteral_7= 'Boolean' ) | (enumLiteral_8= 'LocalDate' ) | (enumLiteral_9= 'ZoneDateTime' ) ) ;
    public final Enumerator ruleJHipsterType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;

         enterRule(); 
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:454:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'BigDecimal' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Enum' ) | (enumLiteral_7= 'Boolean' ) | (enumLiteral_8= 'LocalDate' ) | (enumLiteral_9= 'ZoneDateTime' ) ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:455:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'BigDecimal' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Enum' ) | (enumLiteral_7= 'Boolean' ) | (enumLiteral_8= 'LocalDate' ) | (enumLiteral_9= 'ZoneDateTime' ) )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:455:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'BigDecimal' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Enum' ) | (enumLiteral_7= 'Boolean' ) | (enumLiteral_8= 'LocalDate' ) | (enumLiteral_9= 'ZoneDateTime' ) )
            int alt6=10;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            case 24:
                {
                alt6=4;
                }
                break;
            case 25:
                {
                alt6=5;
                }
                break;
            case 26:
                {
                alt6=6;
                }
                break;
            case 27:
                {
                alt6=7;
                }
                break;
            case 28:
                {
                alt6=8;
                }
                break;
            case 29:
                {
                alt6=9;
                }
                break;
            case 30:
                {
                alt6=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:455:2: (enumLiteral_0= 'String' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:455:2: (enumLiteral_0= 'String' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:455:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_21_in_ruleJHipsterType970); 

                            current = grammarAccess.getJHipsterTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getJHipsterTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:461:6: (enumLiteral_1= 'Integer' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:461:6: (enumLiteral_1= 'Integer' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:461:8: enumLiteral_1= 'Integer'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_22_in_ruleJHipsterType987); 

                            current = grammarAccess.getJHipsterTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getJHipsterTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:467:6: (enumLiteral_2= 'Long' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:467:6: (enumLiteral_2= 'Long' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:467:8: enumLiteral_2= 'Long'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_23_in_ruleJHipsterType1004); 

                            current = grammarAccess.getJHipsterTypeAccess().getLONGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getJHipsterTypeAccess().getLONGEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:473:6: (enumLiteral_3= 'BigDecimal' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:473:6: (enumLiteral_3= 'BigDecimal' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:473:8: enumLiteral_3= 'BigDecimal'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_24_in_ruleJHipsterType1021); 

                            current = grammarAccess.getJHipsterTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getJHipsterTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:479:6: (enumLiteral_4= 'Float' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:479:6: (enumLiteral_4= 'Float' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:479:8: enumLiteral_4= 'Float'
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_25_in_ruleJHipsterType1038); 

                            current = grammarAccess.getJHipsterTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getJHipsterTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:485:6: (enumLiteral_5= 'Double' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:485:6: (enumLiteral_5= 'Double' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:485:8: enumLiteral_5= 'Double'
                    {
                    enumLiteral_5=(Token)match(input,26,FOLLOW_26_in_ruleJHipsterType1055); 

                            current = grammarAccess.getJHipsterTypeAccess().getDOUBLEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getJHipsterTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:491:6: (enumLiteral_6= 'Enum' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:491:6: (enumLiteral_6= 'Enum' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:491:8: enumLiteral_6= 'Enum'
                    {
                    enumLiteral_6=(Token)match(input,27,FOLLOW_27_in_ruleJHipsterType1072); 

                            current = grammarAccess.getJHipsterTypeAccess().getENUMEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getJHipsterTypeAccess().getENUMEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:497:6: (enumLiteral_7= 'Boolean' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:497:6: (enumLiteral_7= 'Boolean' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:497:8: enumLiteral_7= 'Boolean'
                    {
                    enumLiteral_7=(Token)match(input,28,FOLLOW_28_in_ruleJHipsterType1089); 

                            current = grammarAccess.getJHipsterTypeAccess().getBOOLEANEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getJHipsterTypeAccess().getBOOLEANEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:503:6: (enumLiteral_8= 'LocalDate' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:503:6: (enumLiteral_8= 'LocalDate' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:503:8: enumLiteral_8= 'LocalDate'
                    {
                    enumLiteral_8=(Token)match(input,29,FOLLOW_29_in_ruleJHipsterType1106); 

                            current = grammarAccess.getJHipsterTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getJHipsterTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:509:6: (enumLiteral_9= 'ZoneDateTime' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:509:6: (enumLiteral_9= 'ZoneDateTime' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:509:8: enumLiteral_9= 'ZoneDateTime'
                    {
                    enumLiteral_9=(Token)match(input,30,FOLLOW_30_in_ruleJHipsterType1123); 

                            current = grammarAccess.getJHipsterTypeAccess().getZONE_DATE_TIMEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getJHipsterTypeAccess().getZONE_DATE_TIMEEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleJHipsterType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainElement_in_ruleDomain130 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_ruleDomainElement_in_entryRuleDomainElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleDomainElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_ruleDomainElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleEntity332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity349 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity367 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleField_in_ruleEntity388 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleEntity401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelation448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleRelation485 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_ruleRelationType_in_ruleRelation506 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRelation518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelation538 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRelation551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelation568 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRelation585 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRelation598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelation618 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRelation631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelation648 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRelation665 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRelation678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField766 = new BitSet(new long[]{0x000000007FE00000L});
    public static final BitSet FOLLOW_ruleJHipsterType_in_ruleField792 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleField810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleRelationType874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleRelationType891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleRelationType908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRelationType925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleJHipsterType970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleJHipsterType987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleJHipsterType1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleJHipsterType1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleJHipsterType1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleJHipsterType1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleJHipsterType1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleJHipsterType1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleJHipsterType1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleJHipsterType1123 = new BitSet(new long[]{0x0000000000000002L});

}
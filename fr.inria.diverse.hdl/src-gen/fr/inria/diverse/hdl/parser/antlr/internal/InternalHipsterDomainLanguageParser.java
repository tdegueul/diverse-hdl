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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'{'", "'}'", "'relationship'", "'to'", "'enum'", "','", "'required'", "'OneToMany'", "'ManyToOne'", "'OneToOne'", "'ManyToMany'", "'String'", "'Integer'", "'Long'", "'BigDecimal'", "'Float'", "'Double'", "'Enum'", "'Boolean'", "'LocalDate'", "'ZoneDateTime'"
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

                if ( (LA1_0==11||LA1_0==14||LA1_0==16) ) {
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
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:116:1: ruleDomainElement returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Relation_1= ruleRelation | this_Enum_2= ruleEnum ) ;
    public final EObject ruleDomainElement() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Relation_1 = null;

        EObject this_Enum_2 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:119:28: ( (this_Entity_0= ruleEntity | this_Relation_1= ruleRelation | this_Enum_2= ruleEnum ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:120:1: (this_Entity_0= ruleEntity | this_Relation_1= ruleRelation | this_Enum_2= ruleEnum )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:120:1: (this_Entity_0= ruleEntity | this_Relation_1= ruleRelation | this_Enum_2= ruleEnum )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 16:
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
                case 3 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:141:5: this_Enum_2= ruleEnum
                    {
                     
                            newCompositeNode(grammarAccess.getDomainElementAccess().getEnumParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEnum_in_ruleDomainElement277);
                    this_Enum_2=ruleEnum();

                    state._fsp--;

                     
                            current = this_Enum_2; 
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
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:157:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:158:2: (iv_ruleEntity= ruleEntity EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:159:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity312);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity322); 

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
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:166:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:169:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' ) ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:170:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' ) )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:170:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:170:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleEntity359); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:174:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:175:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:175:1: (lv_name_1_0= RULE_ID )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:176:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity376); 

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

            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:192:2: (otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:192:4: otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}'
            {
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity394); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2_0());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:196:1: ( (lv_fields_3_0= ruleField ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:197:1: (lv_fields_3_0= ruleField )
            	    {
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:197:1: (lv_fields_3_0= ruleField )
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:198:3: lv_fields_3_0= ruleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleEntity415);
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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleEntity428); 

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
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:226:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:227:2: (iv_ruleRelation= ruleRelation EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:228:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_ruleRelation_in_entryRuleRelation465);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelation475); 

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
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:235:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'relationship' ( (lv_type_1_0= ruleRelationType ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '{' ( (lv_fromRelation_5_0= RULE_ID ) ) otherlv_6= '}' ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '{' ( (lv_toRelation_10_0= RULE_ID ) ) otherlv_11= '}' ) otherlv_12= '}' ) ;
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
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:238:28: ( (otherlv_0= 'relationship' ( (lv_type_1_0= ruleRelationType ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '{' ( (lv_fromRelation_5_0= RULE_ID ) ) otherlv_6= '}' ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '{' ( (lv_toRelation_10_0= RULE_ID ) ) otherlv_11= '}' ) otherlv_12= '}' ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:239:1: (otherlv_0= 'relationship' ( (lv_type_1_0= ruleRelationType ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '{' ( (lv_fromRelation_5_0= RULE_ID ) ) otherlv_6= '}' ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '{' ( (lv_toRelation_10_0= RULE_ID ) ) otherlv_11= '}' ) otherlv_12= '}' )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:239:1: (otherlv_0= 'relationship' ( (lv_type_1_0= ruleRelationType ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '{' ( (lv_fromRelation_5_0= RULE_ID ) ) otherlv_6= '}' ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '{' ( (lv_toRelation_10_0= RULE_ID ) ) otherlv_11= '}' ) otherlv_12= '}' )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:239:3: otherlv_0= 'relationship' ( (lv_type_1_0= ruleRelationType ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '{' ( (lv_fromRelation_5_0= RULE_ID ) ) otherlv_6= '}' ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '{' ( (lv_toRelation_10_0= RULE_ID ) ) otherlv_11= '}' ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleRelation512); 

                	newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationshipKeyword_0());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:243:1: ( (lv_type_1_0= ruleRelationType ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:244:1: (lv_type_1_0= ruleRelationType )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:244:1: (lv_type_1_0= ruleRelationType )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:245:3: lv_type_1_0= ruleRelationType
            {
             
            	        newCompositeNode(grammarAccess.getRelationAccess().getTypeRelationTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRelationType_in_ruleRelation533);
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRelation545); 

                	newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:265:1: ( (otherlv_3= RULE_ID ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:266:1: (otherlv_3= RULE_ID )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:266:1: (otherlv_3= RULE_ID )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:267:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelation565); 

            		newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getFromEntityCrossReference_3_0()); 
            	

            }


            }

            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:278:2: (otherlv_4= '{' ( (lv_fromRelation_5_0= RULE_ID ) ) otherlv_6= '}' )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:278:4: otherlv_4= '{' ( (lv_fromRelation_5_0= RULE_ID ) ) otherlv_6= '}'
            {
            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleRelation578); 

                	newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_4_0());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:282:1: ( (lv_fromRelation_5_0= RULE_ID ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:283:1: (lv_fromRelation_5_0= RULE_ID )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:283:1: (lv_fromRelation_5_0= RULE_ID )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:284:3: lv_fromRelation_5_0= RULE_ID
            {
            lv_fromRelation_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelation595); 

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

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleRelation612); 

                	newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_4_2());
                

            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleRelation625); 

                	newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getToKeyword_5());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:308:1: ( (otherlv_8= RULE_ID ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:309:1: (otherlv_8= RULE_ID )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:309:1: (otherlv_8= RULE_ID )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:310:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelation645); 

            		newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getToEntityCrossReference_6_0()); 
            	

            }


            }

            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:321:2: (otherlv_9= '{' ( (lv_toRelation_10_0= RULE_ID ) ) otherlv_11= '}' )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:321:4: otherlv_9= '{' ( (lv_toRelation_10_0= RULE_ID ) ) otherlv_11= '}'
            {
            otherlv_9=(Token)match(input,12,FOLLOW_12_in_ruleRelation658); 

                	newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_7_0());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:325:1: ( (lv_toRelation_10_0= RULE_ID ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:326:1: (lv_toRelation_10_0= RULE_ID )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:326:1: (lv_toRelation_10_0= RULE_ID )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:327:3: lv_toRelation_10_0= RULE_ID
            {
            lv_toRelation_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelation675); 

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

            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleRelation692); 

                	newLeafNode(otherlv_11, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_7_2());
                

            }

            otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleRelation705); 

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


    // $ANTLR start "entryRuleEnum"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:359:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:360:2: (iv_ruleEnum= ruleEnum EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:361:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum741);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum751); 

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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:368:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_literals_3_0=null;
        Token otherlv_4=null;
        Token lv_literals_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:371:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )* otherlv_6= '}' ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:372:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )* otherlv_6= '}' )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:372:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )* otherlv_6= '}' )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:372:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleEnum788); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:376:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:377:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:377:1: (lv_name_1_0= RULE_ID )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:378:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum805); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEnum822); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:398:1: ( (lv_literals_3_0= RULE_ID ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:399:1: (lv_literals_3_0= RULE_ID )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:399:1: (lv_literals_3_0= RULE_ID )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:400:3: lv_literals_3_0= RULE_ID
            {
            lv_literals_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum839); 

            			newLeafNode(lv_literals_3_0, grammarAccess.getEnumAccess().getLiteralsIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"literals",
                    		lv_literals_3_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:416:2: (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:416:4: otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleEnum857); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getCommaKeyword_4_0());
            	        
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:420:1: ( (lv_literals_5_0= RULE_ID ) )
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:421:1: (lv_literals_5_0= RULE_ID )
            	    {
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:421:1: (lv_literals_5_0= RULE_ID )
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:422:3: lv_literals_5_0= RULE_ID
            	    {
            	    lv_literals_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum874); 

            	    			newLeafNode(lv_literals_5_0, grammarAccess.getEnumAccess().getLiteralsIDTerminalRuleCall_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEnumRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"literals",
            	            		lv_literals_5_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleEnum893); 

                	newLeafNode(otherlv_6, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleField"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:450:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:451:2: (iv_ruleField= ruleField EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:452:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField929);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField939); 

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
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:459:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleHdlType ) ) ( (lv_required_2_0= 'required' ) )? ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_required_2_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:462:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleHdlType ) ) ( (lv_required_2_0= 'required' ) )? ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:463:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleHdlType ) ) ( (lv_required_2_0= 'required' ) )? )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:463:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleHdlType ) ) ( (lv_required_2_0= 'required' ) )? )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:463:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleHdlType ) ) ( (lv_required_2_0= 'required' ) )?
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:463:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:464:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:464:1: (lv_name_0_0= RULE_ID )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:465:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField981); 

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

            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:481:2: ( (lv_type_1_0= ruleHdlType ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:482:1: (lv_type_1_0= ruleHdlType )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:482:1: (lv_type_1_0= ruleHdlType )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:483:3: lv_type_1_0= ruleHdlType
            {
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getTypeHdlTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleHdlType_in_ruleField1007);
            lv_type_1_0=ruleHdlType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"HdlType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:499:2: ( (lv_required_2_0= 'required' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:500:1: (lv_required_2_0= 'required' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:500:1: (lv_required_2_0= 'required' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:501:3: lv_required_2_0= 'required'
                    {
                    lv_required_2_0=(Token)match(input,18,FOLLOW_18_in_ruleField1025); 

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


    // $ANTLR start "entryRuleHdlType"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:522:1: entryRuleHdlType returns [EObject current=null] : iv_ruleHdlType= ruleHdlType EOF ;
    public final EObject entryRuleHdlType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHdlType = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:523:2: (iv_ruleHdlType= ruleHdlType EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:524:2: iv_ruleHdlType= ruleHdlType EOF
            {
             newCompositeNode(grammarAccess.getHdlTypeRule()); 
            pushFollow(FOLLOW_ruleHdlType_in_entryRuleHdlType1075);
            iv_ruleHdlType=ruleHdlType();

            state._fsp--;

             current =iv_ruleHdlType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHdlType1085); 

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
    // $ANTLR end "entryRuleHdlType"


    // $ANTLR start "ruleHdlType"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:531:1: ruleHdlType returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_primitiveType_1_0= ruleJHipsterType ) ) ) ;
    public final EObject ruleHdlType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_primitiveType_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:534:28: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_primitiveType_1_0= ruleJHipsterType ) ) ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:535:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_primitiveType_1_0= ruleJHipsterType ) ) )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:535:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_primitiveType_1_0= ruleJHipsterType ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=23 && LA6_0<=32)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:535:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:535:2: ( (otherlv_0= RULE_ID ) )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:536:1: (otherlv_0= RULE_ID )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:536:1: (otherlv_0= RULE_ID )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:537:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getHdlTypeRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHdlType1130); 

                    		newLeafNode(otherlv_0, grammarAccess.getHdlTypeAccess().getEnumTypeEnumCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:549:6: ( (lv_primitiveType_1_0= ruleJHipsterType ) )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:549:6: ( (lv_primitiveType_1_0= ruleJHipsterType ) )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:550:1: (lv_primitiveType_1_0= ruleJHipsterType )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:550:1: (lv_primitiveType_1_0= ruleJHipsterType )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:551:3: lv_primitiveType_1_0= ruleJHipsterType
                    {
                     
                    	        newCompositeNode(grammarAccess.getHdlTypeAccess().getPrimitiveTypeJHipsterTypeEnumRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJHipsterType_in_ruleHdlType1157);
                    lv_primitiveType_1_0=ruleJHipsterType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHdlTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"primitiveType",
                            		lv_primitiveType_1_0, 
                            		"JHipsterType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleHdlType"


    // $ANTLR start "ruleRelationType"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:575:1: ruleRelationType returns [Enumerator current=null] : ( (enumLiteral_0= 'OneToMany' ) | (enumLiteral_1= 'ManyToOne' ) | (enumLiteral_2= 'OneToOne' ) | (enumLiteral_3= 'ManyToMany' ) ) ;
    public final Enumerator ruleRelationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:577:28: ( ( (enumLiteral_0= 'OneToMany' ) | (enumLiteral_1= 'ManyToOne' ) | (enumLiteral_2= 'OneToOne' ) | (enumLiteral_3= 'ManyToMany' ) ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:578:1: ( (enumLiteral_0= 'OneToMany' ) | (enumLiteral_1= 'ManyToOne' ) | (enumLiteral_2= 'OneToOne' ) | (enumLiteral_3= 'ManyToMany' ) )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:578:1: ( (enumLiteral_0= 'OneToMany' ) | (enumLiteral_1= 'ManyToOne' ) | (enumLiteral_2= 'OneToOne' ) | (enumLiteral_3= 'ManyToMany' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            case 22:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:578:2: (enumLiteral_0= 'OneToMany' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:578:2: (enumLiteral_0= 'OneToMany' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:578:4: enumLiteral_0= 'OneToMany'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_19_in_ruleRelationType1207); 

                            current = grammarAccess.getRelationTypeAccess().getONE_TO_MANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRelationTypeAccess().getONE_TO_MANYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:584:6: (enumLiteral_1= 'ManyToOne' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:584:6: (enumLiteral_1= 'ManyToOne' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:584:8: enumLiteral_1= 'ManyToOne'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_20_in_ruleRelationType1224); 

                            current = grammarAccess.getRelationTypeAccess().getMANY_TO_ONEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRelationTypeAccess().getMANY_TO_ONEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:590:6: (enumLiteral_2= 'OneToOne' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:590:6: (enumLiteral_2= 'OneToOne' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:590:8: enumLiteral_2= 'OneToOne'
                    {
                    enumLiteral_2=(Token)match(input,21,FOLLOW_21_in_ruleRelationType1241); 

                            current = grammarAccess.getRelationTypeAccess().getONE_TO_ONEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRelationTypeAccess().getONE_TO_ONEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:596:6: (enumLiteral_3= 'ManyToMany' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:596:6: (enumLiteral_3= 'ManyToMany' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:596:8: enumLiteral_3= 'ManyToMany'
                    {
                    enumLiteral_3=(Token)match(input,22,FOLLOW_22_in_ruleRelationType1258); 

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
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:606:1: ruleJHipsterType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'BigDecimal' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Enum' ) | (enumLiteral_7= 'Boolean' ) | (enumLiteral_8= 'LocalDate' ) | (enumLiteral_9= 'ZoneDateTime' ) ) ;
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
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:608:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'BigDecimal' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Enum' ) | (enumLiteral_7= 'Boolean' ) | (enumLiteral_8= 'LocalDate' ) | (enumLiteral_9= 'ZoneDateTime' ) ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:609:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'BigDecimal' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Enum' ) | (enumLiteral_7= 'Boolean' ) | (enumLiteral_8= 'LocalDate' ) | (enumLiteral_9= 'ZoneDateTime' ) )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:609:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'BigDecimal' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Enum' ) | (enumLiteral_7= 'Boolean' ) | (enumLiteral_8= 'LocalDate' ) | (enumLiteral_9= 'ZoneDateTime' ) )
            int alt8=10;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            case 26:
                {
                alt8=4;
                }
                break;
            case 27:
                {
                alt8=5;
                }
                break;
            case 28:
                {
                alt8=6;
                }
                break;
            case 29:
                {
                alt8=7;
                }
                break;
            case 30:
                {
                alt8=8;
                }
                break;
            case 31:
                {
                alt8=9;
                }
                break;
            case 32:
                {
                alt8=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:609:2: (enumLiteral_0= 'String' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:609:2: (enumLiteral_0= 'String' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:609:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_23_in_ruleJHipsterType1303); 

                            current = grammarAccess.getJHipsterTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getJHipsterTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:615:6: (enumLiteral_1= 'Integer' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:615:6: (enumLiteral_1= 'Integer' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:615:8: enumLiteral_1= 'Integer'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_24_in_ruleJHipsterType1320); 

                            current = grammarAccess.getJHipsterTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getJHipsterTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:621:6: (enumLiteral_2= 'Long' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:621:6: (enumLiteral_2= 'Long' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:621:8: enumLiteral_2= 'Long'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_25_in_ruleJHipsterType1337); 

                            current = grammarAccess.getJHipsterTypeAccess().getLONGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getJHipsterTypeAccess().getLONGEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:627:6: (enumLiteral_3= 'BigDecimal' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:627:6: (enumLiteral_3= 'BigDecimal' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:627:8: enumLiteral_3= 'BigDecimal'
                    {
                    enumLiteral_3=(Token)match(input,26,FOLLOW_26_in_ruleJHipsterType1354); 

                            current = grammarAccess.getJHipsterTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getJHipsterTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:633:6: (enumLiteral_4= 'Float' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:633:6: (enumLiteral_4= 'Float' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:633:8: enumLiteral_4= 'Float'
                    {
                    enumLiteral_4=(Token)match(input,27,FOLLOW_27_in_ruleJHipsterType1371); 

                            current = grammarAccess.getJHipsterTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getJHipsterTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:639:6: (enumLiteral_5= 'Double' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:639:6: (enumLiteral_5= 'Double' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:639:8: enumLiteral_5= 'Double'
                    {
                    enumLiteral_5=(Token)match(input,28,FOLLOW_28_in_ruleJHipsterType1388); 

                            current = grammarAccess.getJHipsterTypeAccess().getDOUBLEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getJHipsterTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:645:6: (enumLiteral_6= 'Enum' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:645:6: (enumLiteral_6= 'Enum' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:645:8: enumLiteral_6= 'Enum'
                    {
                    enumLiteral_6=(Token)match(input,29,FOLLOW_29_in_ruleJHipsterType1405); 

                            current = grammarAccess.getJHipsterTypeAccess().getENUMEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getJHipsterTypeAccess().getENUMEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:651:6: (enumLiteral_7= 'Boolean' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:651:6: (enumLiteral_7= 'Boolean' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:651:8: enumLiteral_7= 'Boolean'
                    {
                    enumLiteral_7=(Token)match(input,30,FOLLOW_30_in_ruleJHipsterType1422); 

                            current = grammarAccess.getJHipsterTypeAccess().getBOOLEANEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getJHipsterTypeAccess().getBOOLEANEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:657:6: (enumLiteral_8= 'LocalDate' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:657:6: (enumLiteral_8= 'LocalDate' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:657:8: enumLiteral_8= 'LocalDate'
                    {
                    enumLiteral_8=(Token)match(input,31,FOLLOW_31_in_ruleJHipsterType1439); 

                            current = grammarAccess.getJHipsterTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getJHipsterTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:663:6: (enumLiteral_9= 'ZoneDateTime' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:663:6: (enumLiteral_9= 'ZoneDateTime' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:663:8: enumLiteral_9= 'ZoneDateTime'
                    {
                    enumLiteral_9=(Token)match(input,32,FOLLOW_32_in_ruleJHipsterType1456); 

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
    public static final BitSet FOLLOW_ruleDomainElement_in_ruleDomain130 = new BitSet(new long[]{0x0000000000014802L});
    public static final BitSet FOLLOW_ruleDomainElement_in_entryRuleDomainElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleDomainElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_ruleDomainElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleDomainElement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleEntity359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity376 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity394 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleField_in_ruleEntity415 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleEntity428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelation475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleRelation512 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_ruleRelationType_in_ruleRelation533 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRelation545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelation565 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRelation578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelation595 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRelation612 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRelation625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelation645 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRelation658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelation675 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRelation692 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRelation705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleEnum788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum805 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEnum822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum839 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_17_in_ruleEnum857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum874 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleEnum893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField981 = new BitSet(new long[]{0x00000001FF800010L});
    public static final BitSet FOLLOW_ruleHdlType_in_ruleField1007 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleField1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHdlType_in_entryRuleHdlType1075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHdlType1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHdlType1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJHipsterType_in_ruleHdlType1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleRelationType1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRelationType1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleRelationType1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleRelationType1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleJHipsterType1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleJHipsterType1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleJHipsterType1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleJHipsterType1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleJHipsterType1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleJHipsterType1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleJHipsterType1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleJHipsterType1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleJHipsterType1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleJHipsterType1456 = new BitSet(new long[]{0x0000000000000002L});

}
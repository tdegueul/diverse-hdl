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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'{'", "'}'", "'relationship'", "'['", "']'", "'to'", "'enum'", "','", "'required'", "'minlength'", "'('", "')'", "'maxlength'", "'min'", "'max'", "'pattern'", "'OneToMany'", "'ManyToOne'", "'OneToOne'", "'ManyToMany'", "'String'", "'Integer'", "'Long'", "'BigDecimal'", "'Float'", "'Double'", "'Enum'", "'Boolean'", "'LocalDate'", "'ZoneDateTime'"
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
    public static final int T__40=40;
    public static final int T__41=41;
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

                if ( (LA1_0==11||LA1_0==14||LA1_0==18) ) {
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
            case 18:
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
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:235:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'relationship' ( (lv_type_1_0= ruleRelationType ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_fromRelationName_5_0= RULE_ID ) ) otherlv_6= ']' ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '[' ( (lv_toRelationName_10_0= RULE_ID ) ) otherlv_11= ']' ) otherlv_12= '}' ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_fromRelationName_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_toRelationName_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:238:28: ( (otherlv_0= 'relationship' ( (lv_type_1_0= ruleRelationType ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_fromRelationName_5_0= RULE_ID ) ) otherlv_6= ']' ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '[' ( (lv_toRelationName_10_0= RULE_ID ) ) otherlv_11= ']' ) otherlv_12= '}' ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:239:1: (otherlv_0= 'relationship' ( (lv_type_1_0= ruleRelationType ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_fromRelationName_5_0= RULE_ID ) ) otherlv_6= ']' ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '[' ( (lv_toRelationName_10_0= RULE_ID ) ) otherlv_11= ']' ) otherlv_12= '}' )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:239:1: (otherlv_0= 'relationship' ( (lv_type_1_0= ruleRelationType ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_fromRelationName_5_0= RULE_ID ) ) otherlv_6= ']' ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '[' ( (lv_toRelationName_10_0= RULE_ID ) ) otherlv_11= ']' ) otherlv_12= '}' )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:239:3: otherlv_0= 'relationship' ( (lv_type_1_0= ruleRelationType ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_fromRelationName_5_0= RULE_ID ) ) otherlv_6= ']' ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) (otherlv_9= '[' ( (lv_toRelationName_10_0= RULE_ID ) ) otherlv_11= ']' ) otherlv_12= '}'
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

            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:278:2: (otherlv_4= '[' ( (lv_fromRelationName_5_0= RULE_ID ) ) otherlv_6= ']' )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:278:4: otherlv_4= '[' ( (lv_fromRelationName_5_0= RULE_ID ) ) otherlv_6= ']'
            {
            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleRelation578); 

                	newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getLeftSquareBracketKeyword_4_0());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:282:1: ( (lv_fromRelationName_5_0= RULE_ID ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:283:1: (lv_fromRelationName_5_0= RULE_ID )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:283:1: (lv_fromRelationName_5_0= RULE_ID )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:284:3: lv_fromRelationName_5_0= RULE_ID
            {
            lv_fromRelationName_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelation595); 

            			newLeafNode(lv_fromRelationName_5_0, grammarAccess.getRelationAccess().getFromRelationNameIDTerminalRuleCall_4_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"fromRelationName",
                    		lv_fromRelationName_5_0, 
                    		"ID");
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleRelation612); 

                	newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getRightSquareBracketKeyword_4_2());
                

            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleRelation625); 

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

            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:321:2: (otherlv_9= '[' ( (lv_toRelationName_10_0= RULE_ID ) ) otherlv_11= ']' )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:321:4: otherlv_9= '[' ( (lv_toRelationName_10_0= RULE_ID ) ) otherlv_11= ']'
            {
            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleRelation658); 

                	newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getLeftSquareBracketKeyword_7_0());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:325:1: ( (lv_toRelationName_10_0= RULE_ID ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:326:1: (lv_toRelationName_10_0= RULE_ID )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:326:1: (lv_toRelationName_10_0= RULE_ID )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:327:3: lv_toRelationName_10_0= RULE_ID
            {
            lv_toRelationName_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelation675); 

            			newLeafNode(lv_toRelationName_10_0, grammarAccess.getRelationAccess().getToRelationNameIDTerminalRuleCall_7_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"toRelationName",
                    		lv_toRelationName_10_0, 
                    		"ID");
            	    

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleRelation692); 

                	newLeafNode(otherlv_11, grammarAccess.getRelationAccess().getRightSquareBracketKeyword_7_2());
                

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
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleEnum788); 

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

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:416:4: otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleEnum857); 

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
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:459:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleHdlTypeReference ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_validationRules_3_0= ruleValidationRule ) )* ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_required_2_0=null;
        EObject lv_type_1_0 = null;

        EObject lv_validationRules_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:462:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleHdlTypeReference ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_validationRules_3_0= ruleValidationRule ) )* ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:463:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleHdlTypeReference ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_validationRules_3_0= ruleValidationRule ) )* )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:463:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleHdlTypeReference ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_validationRules_3_0= ruleValidationRule ) )* )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:463:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleHdlTypeReference ) ) ( (lv_required_2_0= 'required' ) )? ( (lv_validationRules_3_0= ruleValidationRule ) )*
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

            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:481:2: ( (lv_type_1_0= ruleHdlTypeReference ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:482:1: (lv_type_1_0= ruleHdlTypeReference )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:482:1: (lv_type_1_0= ruleHdlTypeReference )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:483:3: lv_type_1_0= ruleHdlTypeReference
            {
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getTypeHdlTypeReferenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleHdlTypeReference_in_ruleField1007);
            lv_type_1_0=ruleHdlTypeReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"HdlTypeReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:499:2: ( (lv_required_2_0= 'required' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:500:1: (lv_required_2_0= 'required' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:500:1: (lv_required_2_0= 'required' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:501:3: lv_required_2_0= 'required'
                    {
                    lv_required_2_0=(Token)match(input,20,FOLLOW_20_in_ruleField1025); 

                            newLeafNode(lv_required_2_0, grammarAccess.getFieldAccess().getRequiredRequiredKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:514:3: ( (lv_validationRules_3_0= ruleValidationRule ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21||(LA6_0>=24 && LA6_0<=27)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:515:1: (lv_validationRules_3_0= ruleValidationRule )
            	    {
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:515:1: (lv_validationRules_3_0= ruleValidationRule )
            	    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:516:3: lv_validationRules_3_0= ruleValidationRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFieldAccess().getValidationRulesValidationRuleParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValidationRule_in_ruleField1060);
            	    lv_validationRules_3_0=ruleValidationRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"validationRules",
            	            		lv_validationRules_3_0, 
            	            		"ValidationRule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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


    // $ANTLR start "entryRuleValidationRule"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:540:1: entryRuleValidationRule returns [EObject current=null] : iv_ruleValidationRule= ruleValidationRule EOF ;
    public final EObject entryRuleValidationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidationRule = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:541:2: (iv_ruleValidationRule= ruleValidationRule EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:542:2: iv_ruleValidationRule= ruleValidationRule EOF
            {
             newCompositeNode(grammarAccess.getValidationRuleRule()); 
            pushFollow(FOLLOW_ruleValidationRule_in_entryRuleValidationRule1097);
            iv_ruleValidationRule=ruleValidationRule();

            state._fsp--;

             current =iv_ruleValidationRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidationRule1107); 

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
    // $ANTLR end "entryRuleValidationRule"


    // $ANTLR start "ruleValidationRule"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:549:1: ruleValidationRule returns [EObject current=null] : (this_ValueRange_0= ruleValueRange | this_Pattern_1= rulePattern ) ;
    public final EObject ruleValidationRule() throws RecognitionException {
        EObject current = null;

        EObject this_ValueRange_0 = null;

        EObject this_Pattern_1 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:552:28: ( (this_ValueRange_0= ruleValueRange | this_Pattern_1= rulePattern ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:553:1: (this_ValueRange_0= ruleValueRange | this_Pattern_1= rulePattern )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:553:1: (this_ValueRange_0= ruleValueRange | this_Pattern_1= rulePattern )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21||(LA7_0>=24 && LA7_0<=26)) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:554:5: this_ValueRange_0= ruleValueRange
                    {
                     
                            newCompositeNode(grammarAccess.getValidationRuleAccess().getValueRangeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleValueRange_in_ruleValidationRule1154);
                    this_ValueRange_0=ruleValueRange();

                    state._fsp--;

                     
                            current = this_ValueRange_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:564:5: this_Pattern_1= rulePattern
                    {
                     
                            newCompositeNode(grammarAccess.getValidationRuleAccess().getPatternParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePattern_in_ruleValidationRule1181);
                    this_Pattern_1=rulePattern();

                    state._fsp--;

                     
                            current = this_Pattern_1; 
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
    // $ANTLR end "ruleValidationRule"


    // $ANTLR start "entryRuleValueRange"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:580:1: entryRuleValueRange returns [EObject current=null] : iv_ruleValueRange= ruleValueRange EOF ;
    public final EObject entryRuleValueRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueRange = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:581:2: (iv_ruleValueRange= ruleValueRange EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:582:2: iv_ruleValueRange= ruleValueRange EOF
            {
             newCompositeNode(grammarAccess.getValueRangeRule()); 
            pushFollow(FOLLOW_ruleValueRange_in_entryRuleValueRange1216);
            iv_ruleValueRange=ruleValueRange();

            state._fsp--;

             current =iv_ruleValueRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueRange1226); 

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
    // $ANTLR end "entryRuleValueRange"


    // $ANTLR start "ruleValueRange"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:589:1: ruleValueRange returns [EObject current=null] : (this_MinSpecification_0= ruleMinSpecification | this_MaxSpecification_1= ruleMaxSpecification ) ;
    public final EObject ruleValueRange() throws RecognitionException {
        EObject current = null;

        EObject this_MinSpecification_0 = null;

        EObject this_MaxSpecification_1 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:592:28: ( (this_MinSpecification_0= ruleMinSpecification | this_MaxSpecification_1= ruleMaxSpecification ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:593:1: (this_MinSpecification_0= ruleMinSpecification | this_MaxSpecification_1= ruleMaxSpecification )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:593:1: (this_MinSpecification_0= ruleMinSpecification | this_MaxSpecification_1= ruleMaxSpecification )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21||LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==24||LA8_0==26) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:594:5: this_MinSpecification_0= ruleMinSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getValueRangeAccess().getMinSpecificationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMinSpecification_in_ruleValueRange1273);
                    this_MinSpecification_0=ruleMinSpecification();

                    state._fsp--;

                     
                            current = this_MinSpecification_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:604:5: this_MaxSpecification_1= ruleMaxSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getValueRangeAccess().getMaxSpecificationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMaxSpecification_in_ruleValueRange1300);
                    this_MaxSpecification_1=ruleMaxSpecification();

                    state._fsp--;

                     
                            current = this_MaxSpecification_1; 
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
    // $ANTLR end "ruleValueRange"


    // $ANTLR start "entryRuleMinSpecification"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:620:1: entryRuleMinSpecification returns [EObject current=null] : iv_ruleMinSpecification= ruleMinSpecification EOF ;
    public final EObject entryRuleMinSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinSpecification = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:621:2: (iv_ruleMinSpecification= ruleMinSpecification EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:622:2: iv_ruleMinSpecification= ruleMinSpecification EOF
            {
             newCompositeNode(grammarAccess.getMinSpecificationRule()); 
            pushFollow(FOLLOW_ruleMinSpecification_in_entryRuleMinSpecification1335);
            iv_ruleMinSpecification=ruleMinSpecification();

            state._fsp--;

             current =iv_ruleMinSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinSpecification1345); 

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
    // $ANTLR end "entryRuleMinSpecification"


    // $ANTLR start "ruleMinSpecification"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:629:1: ruleMinSpecification returns [EObject current=null] : (this_StringMinSpecification_0= ruleStringMinSpecification | this_IntegerMinSpecification_1= ruleIntegerMinSpecification ) ;
    public final EObject ruleMinSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_StringMinSpecification_0 = null;

        EObject this_IntegerMinSpecification_1 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:632:28: ( (this_StringMinSpecification_0= ruleStringMinSpecification | this_IntegerMinSpecification_1= ruleIntegerMinSpecification ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:633:1: (this_StringMinSpecification_0= ruleStringMinSpecification | this_IntegerMinSpecification_1= ruleIntegerMinSpecification )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:633:1: (this_StringMinSpecification_0= ruleStringMinSpecification | this_IntegerMinSpecification_1= ruleIntegerMinSpecification )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:634:5: this_StringMinSpecification_0= ruleStringMinSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getMinSpecificationAccess().getStringMinSpecificationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringMinSpecification_in_ruleMinSpecification1392);
                    this_StringMinSpecification_0=ruleStringMinSpecification();

                    state._fsp--;

                     
                            current = this_StringMinSpecification_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:644:5: this_IntegerMinSpecification_1= ruleIntegerMinSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getMinSpecificationAccess().getIntegerMinSpecificationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntegerMinSpecification_in_ruleMinSpecification1419);
                    this_IntegerMinSpecification_1=ruleIntegerMinSpecification();

                    state._fsp--;

                     
                            current = this_IntegerMinSpecification_1; 
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
    // $ANTLR end "ruleMinSpecification"


    // $ANTLR start "entryRuleMaxSpecification"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:660:1: entryRuleMaxSpecification returns [EObject current=null] : iv_ruleMaxSpecification= ruleMaxSpecification EOF ;
    public final EObject entryRuleMaxSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxSpecification = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:661:2: (iv_ruleMaxSpecification= ruleMaxSpecification EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:662:2: iv_ruleMaxSpecification= ruleMaxSpecification EOF
            {
             newCompositeNode(grammarAccess.getMaxSpecificationRule()); 
            pushFollow(FOLLOW_ruleMaxSpecification_in_entryRuleMaxSpecification1454);
            iv_ruleMaxSpecification=ruleMaxSpecification();

            state._fsp--;

             current =iv_ruleMaxSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxSpecification1464); 

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
    // $ANTLR end "entryRuleMaxSpecification"


    // $ANTLR start "ruleMaxSpecification"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:669:1: ruleMaxSpecification returns [EObject current=null] : (this_StringMaxSpecification_0= ruleStringMaxSpecification | this_IntegerMaxSpecification_1= ruleIntegerMaxSpecification ) ;
    public final EObject ruleMaxSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_StringMaxSpecification_0 = null;

        EObject this_IntegerMaxSpecification_1 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:672:28: ( (this_StringMaxSpecification_0= ruleStringMaxSpecification | this_IntegerMaxSpecification_1= ruleIntegerMaxSpecification ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:673:1: (this_StringMaxSpecification_0= ruleStringMaxSpecification | this_IntegerMaxSpecification_1= ruleIntegerMaxSpecification )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:673:1: (this_StringMaxSpecification_0= ruleStringMaxSpecification | this_IntegerMaxSpecification_1= ruleIntegerMaxSpecification )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:674:5: this_StringMaxSpecification_0= ruleStringMaxSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getMaxSpecificationAccess().getStringMaxSpecificationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringMaxSpecification_in_ruleMaxSpecification1511);
                    this_StringMaxSpecification_0=ruleStringMaxSpecification();

                    state._fsp--;

                     
                            current = this_StringMaxSpecification_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:684:5: this_IntegerMaxSpecification_1= ruleIntegerMaxSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getMaxSpecificationAccess().getIntegerMaxSpecificationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntegerMaxSpecification_in_ruleMaxSpecification1538);
                    this_IntegerMaxSpecification_1=ruleIntegerMaxSpecification();

                    state._fsp--;

                     
                            current = this_IntegerMaxSpecification_1; 
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
    // $ANTLR end "ruleMaxSpecification"


    // $ANTLR start "entryRuleStringMinSpecification"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:700:1: entryRuleStringMinSpecification returns [EObject current=null] : iv_ruleStringMinSpecification= ruleStringMinSpecification EOF ;
    public final EObject entryRuleStringMinSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringMinSpecification = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:701:2: (iv_ruleStringMinSpecification= ruleStringMinSpecification EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:702:2: iv_ruleStringMinSpecification= ruleStringMinSpecification EOF
            {
             newCompositeNode(grammarAccess.getStringMinSpecificationRule()); 
            pushFollow(FOLLOW_ruleStringMinSpecification_in_entryRuleStringMinSpecification1573);
            iv_ruleStringMinSpecification=ruleStringMinSpecification();

            state._fsp--;

             current =iv_ruleStringMinSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringMinSpecification1583); 

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
    // $ANTLR end "entryRuleStringMinSpecification"


    // $ANTLR start "ruleStringMinSpecification"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:709:1: ruleStringMinSpecification returns [EObject current=null] : (otherlv_0= 'minlength' otherlv_1= '(' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleStringMinSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_min_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:712:28: ( (otherlv_0= 'minlength' otherlv_1= '(' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:713:1: (otherlv_0= 'minlength' otherlv_1= '(' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:713:1: (otherlv_0= 'minlength' otherlv_1= '(' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ')' )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:713:3: otherlv_0= 'minlength' otherlv_1= '(' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleStringMinSpecification1620); 

                	newLeafNode(otherlv_0, grammarAccess.getStringMinSpecificationAccess().getMinlengthKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleStringMinSpecification1632); 

                	newLeafNode(otherlv_1, grammarAccess.getStringMinSpecificationAccess().getLeftParenthesisKeyword_1());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:721:1: ( (lv_min_2_0= RULE_INT ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:722:1: (lv_min_2_0= RULE_INT )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:722:1: (lv_min_2_0= RULE_INT )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:723:3: lv_min_2_0= RULE_INT
            {
            lv_min_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringMinSpecification1649); 

            			newLeafNode(lv_min_2_0, grammarAccess.getStringMinSpecificationAccess().getMinINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringMinSpecificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"min",
                    		lv_min_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleStringMinSpecification1666); 

                	newLeafNode(otherlv_3, grammarAccess.getStringMinSpecificationAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleStringMinSpecification"


    // $ANTLR start "entryRuleStringMaxSpecification"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:751:1: entryRuleStringMaxSpecification returns [EObject current=null] : iv_ruleStringMaxSpecification= ruleStringMaxSpecification EOF ;
    public final EObject entryRuleStringMaxSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringMaxSpecification = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:752:2: (iv_ruleStringMaxSpecification= ruleStringMaxSpecification EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:753:2: iv_ruleStringMaxSpecification= ruleStringMaxSpecification EOF
            {
             newCompositeNode(grammarAccess.getStringMaxSpecificationRule()); 
            pushFollow(FOLLOW_ruleStringMaxSpecification_in_entryRuleStringMaxSpecification1702);
            iv_ruleStringMaxSpecification=ruleStringMaxSpecification();

            state._fsp--;

             current =iv_ruleStringMaxSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringMaxSpecification1712); 

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
    // $ANTLR end "entryRuleStringMaxSpecification"


    // $ANTLR start "ruleStringMaxSpecification"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:760:1: ruleStringMaxSpecification returns [EObject current=null] : (otherlv_0= 'maxlength' otherlv_1= '(' ( (lv_max_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleStringMaxSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_max_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:763:28: ( (otherlv_0= 'maxlength' otherlv_1= '(' ( (lv_max_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:764:1: (otherlv_0= 'maxlength' otherlv_1= '(' ( (lv_max_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:764:1: (otherlv_0= 'maxlength' otherlv_1= '(' ( (lv_max_2_0= RULE_INT ) ) otherlv_3= ')' )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:764:3: otherlv_0= 'maxlength' otherlv_1= '(' ( (lv_max_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleStringMaxSpecification1749); 

                	newLeafNode(otherlv_0, grammarAccess.getStringMaxSpecificationAccess().getMaxlengthKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleStringMaxSpecification1761); 

                	newLeafNode(otherlv_1, grammarAccess.getStringMaxSpecificationAccess().getLeftParenthesisKeyword_1());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:772:1: ( (lv_max_2_0= RULE_INT ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:773:1: (lv_max_2_0= RULE_INT )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:773:1: (lv_max_2_0= RULE_INT )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:774:3: lv_max_2_0= RULE_INT
            {
            lv_max_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringMaxSpecification1778); 

            			newLeafNode(lv_max_2_0, grammarAccess.getStringMaxSpecificationAccess().getMaxINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringMaxSpecificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"max",
                    		lv_max_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleStringMaxSpecification1795); 

                	newLeafNode(otherlv_3, grammarAccess.getStringMaxSpecificationAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleStringMaxSpecification"


    // $ANTLR start "entryRuleIntegerMinSpecification"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:802:1: entryRuleIntegerMinSpecification returns [EObject current=null] : iv_ruleIntegerMinSpecification= ruleIntegerMinSpecification EOF ;
    public final EObject entryRuleIntegerMinSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerMinSpecification = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:803:2: (iv_ruleIntegerMinSpecification= ruleIntegerMinSpecification EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:804:2: iv_ruleIntegerMinSpecification= ruleIntegerMinSpecification EOF
            {
             newCompositeNode(grammarAccess.getIntegerMinSpecificationRule()); 
            pushFollow(FOLLOW_ruleIntegerMinSpecification_in_entryRuleIntegerMinSpecification1831);
            iv_ruleIntegerMinSpecification=ruleIntegerMinSpecification();

            state._fsp--;

             current =iv_ruleIntegerMinSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerMinSpecification1841); 

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
    // $ANTLR end "entryRuleIntegerMinSpecification"


    // $ANTLR start "ruleIntegerMinSpecification"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:811:1: ruleIntegerMinSpecification returns [EObject current=null] : (otherlv_0= 'min' otherlv_1= '(' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleIntegerMinSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_min_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:814:28: ( (otherlv_0= 'min' otherlv_1= '(' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:815:1: (otherlv_0= 'min' otherlv_1= '(' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:815:1: (otherlv_0= 'min' otherlv_1= '(' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ')' )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:815:3: otherlv_0= 'min' otherlv_1= '(' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleIntegerMinSpecification1878); 

                	newLeafNode(otherlv_0, grammarAccess.getIntegerMinSpecificationAccess().getMinKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleIntegerMinSpecification1890); 

                	newLeafNode(otherlv_1, grammarAccess.getIntegerMinSpecificationAccess().getLeftParenthesisKeyword_1());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:823:1: ( (lv_min_2_0= RULE_INT ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:824:1: (lv_min_2_0= RULE_INT )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:824:1: (lv_min_2_0= RULE_INT )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:825:3: lv_min_2_0= RULE_INT
            {
            lv_min_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerMinSpecification1907); 

            			newLeafNode(lv_min_2_0, grammarAccess.getIntegerMinSpecificationAccess().getMinINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerMinSpecificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"min",
                    		lv_min_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleIntegerMinSpecification1924); 

                	newLeafNode(otherlv_3, grammarAccess.getIntegerMinSpecificationAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleIntegerMinSpecification"


    // $ANTLR start "entryRuleIntegerMaxSpecification"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:853:1: entryRuleIntegerMaxSpecification returns [EObject current=null] : iv_ruleIntegerMaxSpecification= ruleIntegerMaxSpecification EOF ;
    public final EObject entryRuleIntegerMaxSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerMaxSpecification = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:854:2: (iv_ruleIntegerMaxSpecification= ruleIntegerMaxSpecification EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:855:2: iv_ruleIntegerMaxSpecification= ruleIntegerMaxSpecification EOF
            {
             newCompositeNode(grammarAccess.getIntegerMaxSpecificationRule()); 
            pushFollow(FOLLOW_ruleIntegerMaxSpecification_in_entryRuleIntegerMaxSpecification1960);
            iv_ruleIntegerMaxSpecification=ruleIntegerMaxSpecification();

            state._fsp--;

             current =iv_ruleIntegerMaxSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerMaxSpecification1970); 

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
    // $ANTLR end "entryRuleIntegerMaxSpecification"


    // $ANTLR start "ruleIntegerMaxSpecification"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:862:1: ruleIntegerMaxSpecification returns [EObject current=null] : (otherlv_0= 'max' otherlv_1= '(' ( (lv_max_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleIntegerMaxSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_max_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:865:28: ( (otherlv_0= 'max' otherlv_1= '(' ( (lv_max_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:866:1: (otherlv_0= 'max' otherlv_1= '(' ( (lv_max_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:866:1: (otherlv_0= 'max' otherlv_1= '(' ( (lv_max_2_0= RULE_INT ) ) otherlv_3= ')' )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:866:3: otherlv_0= 'max' otherlv_1= '(' ( (lv_max_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleIntegerMaxSpecification2007); 

                	newLeafNode(otherlv_0, grammarAccess.getIntegerMaxSpecificationAccess().getMaxKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleIntegerMaxSpecification2019); 

                	newLeafNode(otherlv_1, grammarAccess.getIntegerMaxSpecificationAccess().getLeftParenthesisKeyword_1());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:874:1: ( (lv_max_2_0= RULE_INT ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:875:1: (lv_max_2_0= RULE_INT )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:875:1: (lv_max_2_0= RULE_INT )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:876:3: lv_max_2_0= RULE_INT
            {
            lv_max_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerMaxSpecification2036); 

            			newLeafNode(lv_max_2_0, grammarAccess.getIntegerMaxSpecificationAccess().getMaxINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerMaxSpecificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"max",
                    		lv_max_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleIntegerMaxSpecification2053); 

                	newLeafNode(otherlv_3, grammarAccess.getIntegerMaxSpecificationAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleIntegerMaxSpecification"


    // $ANTLR start "entryRulePattern"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:904:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:905:2: (iv_rulePattern= rulePattern EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:906:2: iv_rulePattern= rulePattern EOF
            {
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_rulePattern_in_entryRulePattern2089);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePattern2099); 

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
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:913:1: rulePattern returns [EObject current=null] : (otherlv_0= 'pattern' otherlv_1= '(' ( (lv_regex_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_regex_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:916:28: ( (otherlv_0= 'pattern' otherlv_1= '(' ( (lv_regex_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:917:1: (otherlv_0= 'pattern' otherlv_1= '(' ( (lv_regex_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:917:1: (otherlv_0= 'pattern' otherlv_1= '(' ( (lv_regex_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:917:3: otherlv_0= 'pattern' otherlv_1= '(' ( (lv_regex_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_rulePattern2136); 

                	newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getPatternKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_rulePattern2148); 

                	newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getLeftParenthesisKeyword_1());
                
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:925:1: ( (lv_regex_2_0= RULE_STRING ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:926:1: (lv_regex_2_0= RULE_STRING )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:926:1: (lv_regex_2_0= RULE_STRING )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:927:3: lv_regex_2_0= RULE_STRING
            {
            lv_regex_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePattern2165); 

            			newLeafNode(lv_regex_2_0, grammarAccess.getPatternAccess().getRegexSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPatternRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"regex",
                    		lv_regex_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_rulePattern2182); 

                	newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleHdlTypeReference"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:955:1: entryRuleHdlTypeReference returns [EObject current=null] : iv_ruleHdlTypeReference= ruleHdlTypeReference EOF ;
    public final EObject entryRuleHdlTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHdlTypeReference = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:956:2: (iv_ruleHdlTypeReference= ruleHdlTypeReference EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:957:2: iv_ruleHdlTypeReference= ruleHdlTypeReference EOF
            {
             newCompositeNode(grammarAccess.getHdlTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleHdlTypeReference_in_entryRuleHdlTypeReference2218);
            iv_ruleHdlTypeReference=ruleHdlTypeReference();

            state._fsp--;

             current =iv_ruleHdlTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHdlTypeReference2228); 

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
    // $ANTLR end "entryRuleHdlTypeReference"


    // $ANTLR start "ruleHdlTypeReference"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:964:1: ruleHdlTypeReference returns [EObject current=null] : (this_EnumTypeReference_0= ruleEnumTypeReference | this_PrimitiveTypeReference_1= rulePrimitiveTypeReference ) ;
    public final EObject ruleHdlTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_EnumTypeReference_0 = null;

        EObject this_PrimitiveTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:967:28: ( (this_EnumTypeReference_0= ruleEnumTypeReference | this_PrimitiveTypeReference_1= rulePrimitiveTypeReference ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:968:1: (this_EnumTypeReference_0= ruleEnumTypeReference | this_PrimitiveTypeReference_1= rulePrimitiveTypeReference )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:968:1: (this_EnumTypeReference_0= ruleEnumTypeReference | this_PrimitiveTypeReference_1= rulePrimitiveTypeReference )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=32 && LA11_0<=41)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:969:5: this_EnumTypeReference_0= ruleEnumTypeReference
                    {
                     
                            newCompositeNode(grammarAccess.getHdlTypeReferenceAccess().getEnumTypeReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEnumTypeReference_in_ruleHdlTypeReference2275);
                    this_EnumTypeReference_0=ruleEnumTypeReference();

                    state._fsp--;

                     
                            current = this_EnumTypeReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:979:5: this_PrimitiveTypeReference_1= rulePrimitiveTypeReference
                    {
                     
                            newCompositeNode(grammarAccess.getHdlTypeReferenceAccess().getPrimitiveTypeReferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePrimitiveTypeReference_in_ruleHdlTypeReference2302);
                    this_PrimitiveTypeReference_1=rulePrimitiveTypeReference();

                    state._fsp--;

                     
                            current = this_PrimitiveTypeReference_1; 
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
    // $ANTLR end "ruleHdlTypeReference"


    // $ANTLR start "entryRuleEnumTypeReference"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:995:1: entryRuleEnumTypeReference returns [EObject current=null] : iv_ruleEnumTypeReference= ruleEnumTypeReference EOF ;
    public final EObject entryRuleEnumTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeReference = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:996:2: (iv_ruleEnumTypeReference= ruleEnumTypeReference EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:997:2: iv_ruleEnumTypeReference= ruleEnumTypeReference EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleEnumTypeReference_in_entryRuleEnumTypeReference2337);
            iv_ruleEnumTypeReference=ruleEnumTypeReference();

            state._fsp--;

             current =iv_ruleEnumTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumTypeReference2347); 

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
    // $ANTLR end "entryRuleEnumTypeReference"


    // $ANTLR start "ruleEnumTypeReference"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1004:1: ruleEnumTypeReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEnumTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1007:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1008:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1008:1: ( (otherlv_0= RULE_ID ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1009:1: (otherlv_0= RULE_ID )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1009:1: (otherlv_0= RULE_ID )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1010:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumTypeReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumTypeReference2391); 

            		newLeafNode(otherlv_0, grammarAccess.getEnumTypeReferenceAccess().getTypeEnumCrossReference_0()); 
            	

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
    // $ANTLR end "ruleEnumTypeReference"


    // $ANTLR start "entryRulePrimitiveTypeReference"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1029:1: entryRulePrimitiveTypeReference returns [EObject current=null] : iv_rulePrimitiveTypeReference= rulePrimitiveTypeReference EOF ;
    public final EObject entryRulePrimitiveTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeReference = null;


        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1030:2: (iv_rulePrimitiveTypeReference= rulePrimitiveTypeReference EOF )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1031:2: iv_rulePrimitiveTypeReference= rulePrimitiveTypeReference EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeReferenceRule()); 
            pushFollow(FOLLOW_rulePrimitiveTypeReference_in_entryRulePrimitiveTypeReference2426);
            iv_rulePrimitiveTypeReference=rulePrimitiveTypeReference();

            state._fsp--;

             current =iv_rulePrimitiveTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveTypeReference2436); 

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
    // $ANTLR end "entryRulePrimitiveTypeReference"


    // $ANTLR start "rulePrimitiveTypeReference"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1038:1: rulePrimitiveTypeReference returns [EObject current=null] : ( (lv_type_0_0= ruleJHipsterType ) ) ;
    public final EObject rulePrimitiveTypeReference() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1041:28: ( ( (lv_type_0_0= ruleJHipsterType ) ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1042:1: ( (lv_type_0_0= ruleJHipsterType ) )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1042:1: ( (lv_type_0_0= ruleJHipsterType ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1043:1: (lv_type_0_0= ruleJHipsterType )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1043:1: (lv_type_0_0= ruleJHipsterType )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1044:3: lv_type_0_0= ruleJHipsterType
            {
             
            	        newCompositeNode(grammarAccess.getPrimitiveTypeReferenceAccess().getTypeJHipsterTypeEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleJHipsterType_in_rulePrimitiveTypeReference2481);
            lv_type_0_0=ruleJHipsterType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrimitiveTypeReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"JHipsterType");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "rulePrimitiveTypeReference"


    // $ANTLR start "ruleRelationType"
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1068:1: ruleRelationType returns [Enumerator current=null] : ( (enumLiteral_0= 'OneToMany' ) | (enumLiteral_1= 'ManyToOne' ) | (enumLiteral_2= 'OneToOne' ) | (enumLiteral_3= 'ManyToMany' ) ) ;
    public final Enumerator ruleRelationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1070:28: ( ( (enumLiteral_0= 'OneToMany' ) | (enumLiteral_1= 'ManyToOne' ) | (enumLiteral_2= 'OneToOne' ) | (enumLiteral_3= 'ManyToMany' ) ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1071:1: ( (enumLiteral_0= 'OneToMany' ) | (enumLiteral_1= 'ManyToOne' ) | (enumLiteral_2= 'OneToOne' ) | (enumLiteral_3= 'ManyToMany' ) )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1071:1: ( (enumLiteral_0= 'OneToMany' ) | (enumLiteral_1= 'ManyToOne' ) | (enumLiteral_2= 'OneToOne' ) | (enumLiteral_3= 'ManyToMany' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt12=1;
                }
                break;
            case 29:
                {
                alt12=2;
                }
                break;
            case 30:
                {
                alt12=3;
                }
                break;
            case 31:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1071:2: (enumLiteral_0= 'OneToMany' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1071:2: (enumLiteral_0= 'OneToMany' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1071:4: enumLiteral_0= 'OneToMany'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_28_in_ruleRelationType2530); 

                            current = grammarAccess.getRelationTypeAccess().getONE_TO_MANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRelationTypeAccess().getONE_TO_MANYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1077:6: (enumLiteral_1= 'ManyToOne' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1077:6: (enumLiteral_1= 'ManyToOne' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1077:8: enumLiteral_1= 'ManyToOne'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_29_in_ruleRelationType2547); 

                            current = grammarAccess.getRelationTypeAccess().getMANY_TO_ONEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRelationTypeAccess().getMANY_TO_ONEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1083:6: (enumLiteral_2= 'OneToOne' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1083:6: (enumLiteral_2= 'OneToOne' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1083:8: enumLiteral_2= 'OneToOne'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_30_in_ruleRelationType2564); 

                            current = grammarAccess.getRelationTypeAccess().getONE_TO_ONEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRelationTypeAccess().getONE_TO_ONEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1089:6: (enumLiteral_3= 'ManyToMany' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1089:6: (enumLiteral_3= 'ManyToMany' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1089:8: enumLiteral_3= 'ManyToMany'
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_31_in_ruleRelationType2581); 

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
    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1099:1: ruleJHipsterType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'BigDecimal' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Enum' ) | (enumLiteral_7= 'Boolean' ) | (enumLiteral_8= 'LocalDate' ) | (enumLiteral_9= 'ZoneDateTime' ) ) ;
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
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1101:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'BigDecimal' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Enum' ) | (enumLiteral_7= 'Boolean' ) | (enumLiteral_8= 'LocalDate' ) | (enumLiteral_9= 'ZoneDateTime' ) ) )
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1102:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'BigDecimal' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Enum' ) | (enumLiteral_7= 'Boolean' ) | (enumLiteral_8= 'LocalDate' ) | (enumLiteral_9= 'ZoneDateTime' ) )
            {
            // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1102:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'BigDecimal' ) | (enumLiteral_4= 'Float' ) | (enumLiteral_5= 'Double' ) | (enumLiteral_6= 'Enum' ) | (enumLiteral_7= 'Boolean' ) | (enumLiteral_8= 'LocalDate' ) | (enumLiteral_9= 'ZoneDateTime' ) )
            int alt13=10;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt13=1;
                }
                break;
            case 33:
                {
                alt13=2;
                }
                break;
            case 34:
                {
                alt13=3;
                }
                break;
            case 35:
                {
                alt13=4;
                }
                break;
            case 36:
                {
                alt13=5;
                }
                break;
            case 37:
                {
                alt13=6;
                }
                break;
            case 38:
                {
                alt13=7;
                }
                break;
            case 39:
                {
                alt13=8;
                }
                break;
            case 40:
                {
                alt13=9;
                }
                break;
            case 41:
                {
                alt13=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1102:2: (enumLiteral_0= 'String' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1102:2: (enumLiteral_0= 'String' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1102:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_32_in_ruleJHipsterType2626); 

                            current = grammarAccess.getJHipsterTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getJHipsterTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1108:6: (enumLiteral_1= 'Integer' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1108:6: (enumLiteral_1= 'Integer' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1108:8: enumLiteral_1= 'Integer'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_33_in_ruleJHipsterType2643); 

                            current = grammarAccess.getJHipsterTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getJHipsterTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1114:6: (enumLiteral_2= 'Long' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1114:6: (enumLiteral_2= 'Long' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1114:8: enumLiteral_2= 'Long'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_34_in_ruleJHipsterType2660); 

                            current = grammarAccess.getJHipsterTypeAccess().getLONGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getJHipsterTypeAccess().getLONGEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1120:6: (enumLiteral_3= 'BigDecimal' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1120:6: (enumLiteral_3= 'BigDecimal' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1120:8: enumLiteral_3= 'BigDecimal'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_35_in_ruleJHipsterType2677); 

                            current = grammarAccess.getJHipsterTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getJHipsterTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1126:6: (enumLiteral_4= 'Float' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1126:6: (enumLiteral_4= 'Float' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1126:8: enumLiteral_4= 'Float'
                    {
                    enumLiteral_4=(Token)match(input,36,FOLLOW_36_in_ruleJHipsterType2694); 

                            current = grammarAccess.getJHipsterTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getJHipsterTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1132:6: (enumLiteral_5= 'Double' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1132:6: (enumLiteral_5= 'Double' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1132:8: enumLiteral_5= 'Double'
                    {
                    enumLiteral_5=(Token)match(input,37,FOLLOW_37_in_ruleJHipsterType2711); 

                            current = grammarAccess.getJHipsterTypeAccess().getDOUBLEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getJHipsterTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1138:6: (enumLiteral_6= 'Enum' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1138:6: (enumLiteral_6= 'Enum' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1138:8: enumLiteral_6= 'Enum'
                    {
                    enumLiteral_6=(Token)match(input,38,FOLLOW_38_in_ruleJHipsterType2728); 

                            current = grammarAccess.getJHipsterTypeAccess().getENUMEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getJHipsterTypeAccess().getENUMEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1144:6: (enumLiteral_7= 'Boolean' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1144:6: (enumLiteral_7= 'Boolean' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1144:8: enumLiteral_7= 'Boolean'
                    {
                    enumLiteral_7=(Token)match(input,39,FOLLOW_39_in_ruleJHipsterType2745); 

                            current = grammarAccess.getJHipsterTypeAccess().getBOOLEANEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getJHipsterTypeAccess().getBOOLEANEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1150:6: (enumLiteral_8= 'LocalDate' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1150:6: (enumLiteral_8= 'LocalDate' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1150:8: enumLiteral_8= 'LocalDate'
                    {
                    enumLiteral_8=(Token)match(input,40,FOLLOW_40_in_ruleJHipsterType2762); 

                            current = grammarAccess.getJHipsterTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getJHipsterTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1156:6: (enumLiteral_9= 'ZoneDateTime' )
                    {
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1156:6: (enumLiteral_9= 'ZoneDateTime' )
                    // ../fr.inria.diverse.hdl/src-gen/fr/inria/diverse/hdl/parser/antlr/internal/InternalHipsterDomainLanguage.g:1156:8: enumLiteral_9= 'ZoneDateTime'
                    {
                    enumLiteral_9=(Token)match(input,41,FOLLOW_41_in_ruleJHipsterType2779); 

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
    public static final BitSet FOLLOW_ruleDomainElement_in_ruleDomain130 = new BitSet(new long[]{0x0000000000044802L});
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
    public static final BitSet FOLLOW_14_in_ruleRelation512 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleRelationType_in_ruleRelation533 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRelation545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelation565 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRelation578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelation595 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRelation612 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRelation625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelation645 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRelation658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelation675 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRelation692 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRelation705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEnum788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum805 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEnum822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum839 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_19_in_ruleEnum857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum874 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_13_in_ruleEnum893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField981 = new BitSet(new long[]{0x000003FF00000010L});
    public static final BitSet FOLLOW_ruleHdlTypeReference_in_ruleField1007 = new BitSet(new long[]{0x000000000F300002L});
    public static final BitSet FOLLOW_20_in_ruleField1025 = new BitSet(new long[]{0x000000000F200002L});
    public static final BitSet FOLLOW_ruleValidationRule_in_ruleField1060 = new BitSet(new long[]{0x000000000F200002L});
    public static final BitSet FOLLOW_ruleValidationRule_in_entryRuleValidationRule1097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidationRule1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueRange_in_ruleValidationRule1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePattern_in_ruleValidationRule1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueRange_in_entryRuleValueRange1216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueRange1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinSpecification_in_ruleValueRange1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxSpecification_in_ruleValueRange1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinSpecification_in_entryRuleMinSpecification1335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinSpecification1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringMinSpecification_in_ruleMinSpecification1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerMinSpecification_in_ruleMinSpecification1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxSpecification_in_entryRuleMaxSpecification1454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxSpecification1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringMaxSpecification_in_ruleMaxSpecification1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerMaxSpecification_in_ruleMaxSpecification1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringMinSpecification_in_entryRuleStringMinSpecification1573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringMinSpecification1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleStringMinSpecification1620 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleStringMinSpecification1632 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringMinSpecification1649 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleStringMinSpecification1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringMaxSpecification_in_entryRuleStringMaxSpecification1702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringMaxSpecification1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleStringMaxSpecification1749 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleStringMaxSpecification1761 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringMaxSpecification1778 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleStringMaxSpecification1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerMinSpecification_in_entryRuleIntegerMinSpecification1831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerMinSpecification1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleIntegerMinSpecification1878 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntegerMinSpecification1890 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerMinSpecification1907 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleIntegerMinSpecification1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerMaxSpecification_in_entryRuleIntegerMaxSpecification1960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerMaxSpecification1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleIntegerMaxSpecification2007 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntegerMaxSpecification2019 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerMaxSpecification2036 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleIntegerMaxSpecification2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePattern_in_entryRulePattern2089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePattern2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePattern2136 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePattern2148 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePattern2165 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePattern2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHdlTypeReference_in_entryRuleHdlTypeReference2218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHdlTypeReference2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeReference_in_ruleHdlTypeReference2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypeReference_in_ruleHdlTypeReference2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeReference_in_entryRuleEnumTypeReference2337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeReference2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumTypeReference2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypeReference_in_entryRulePrimitiveTypeReference2426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeReference2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJHipsterType_in_rulePrimitiveTypeReference2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleRelationType2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleRelationType2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleRelationType2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleRelationType2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleJHipsterType2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleJHipsterType2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleJHipsterType2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleJHipsterType2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleJHipsterType2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleJHipsterType2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleJHipsterType2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleJHipsterType2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleJHipsterType2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleJHipsterType2779 = new BitSet(new long[]{0x0000000000000002L});

}
package gameoflife.parser.antlr.internal;

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
import gameoflife.services.GDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game'", "'Rules'", "'{'", "'}'", "'if'", "'neighbors'", "'Grid'", "'('", "','", "')'", "'Live'", "'Dead'", "'Die'", "'ToAlive'", "'<'", "'>'", "'='"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGDSL.g"; }



     	private GDSLGrammarAccess grammarAccess;

        public InternalGDSLParser(TokenStream input, GDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected GDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalGDSL.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalGDSL.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalGDSL.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGDSL.g:72:1: ruleModel returns [EObject current=null] : ( (lv_gol_0_0= ruleGOL ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_gol_0_0 = null;



        	enterRule();

        try {
            // InternalGDSL.g:78:2: ( ( (lv_gol_0_0= ruleGOL ) ) )
            // InternalGDSL.g:79:2: ( (lv_gol_0_0= ruleGOL ) )
            {
            // InternalGDSL.g:79:2: ( (lv_gol_0_0= ruleGOL ) )
            // InternalGDSL.g:80:3: (lv_gol_0_0= ruleGOL )
            {
            // InternalGDSL.g:80:3: (lv_gol_0_0= ruleGOL )
            // InternalGDSL.g:81:4: lv_gol_0_0= ruleGOL
            {

            				newCompositeNode(grammarAccess.getModelAccess().getGolGOLParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_gol_0_0=ruleGOL();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				set(
            					current,
            					"gol",
            					lv_gol_0_0,
            					"gameoflife.GDSL.GOL");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGOL"
    // InternalGDSL.g:101:1: entryRuleGOL returns [EObject current=null] : iv_ruleGOL= ruleGOL EOF ;
    public final EObject entryRuleGOL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGOL = null;


        try {
            // InternalGDSL.g:101:44: (iv_ruleGOL= ruleGOL EOF )
            // InternalGDSL.g:102:2: iv_ruleGOL= ruleGOL EOF
            {
             newCompositeNode(grammarAccess.getGOLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGOL=ruleGOL();

            state._fsp--;

             current =iv_ruleGOL; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGOL"


    // $ANTLR start "ruleGOL"
    // InternalGDSL.g:108:1: ruleGOL returns [EObject current=null] : (otherlv_0= 'Game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rules_2_0= ruleRules ) ) ( (lv_grid_3_0= ruleGrid ) ) ) ;
    public final EObject ruleGOL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_rules_2_0 = null;

        EObject lv_grid_3_0 = null;



        	enterRule();

        try {
            // InternalGDSL.g:114:2: ( (otherlv_0= 'Game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rules_2_0= ruleRules ) ) ( (lv_grid_3_0= ruleGrid ) ) ) )
            // InternalGDSL.g:115:2: (otherlv_0= 'Game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rules_2_0= ruleRules ) ) ( (lv_grid_3_0= ruleGrid ) ) )
            {
            // InternalGDSL.g:115:2: (otherlv_0= 'Game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rules_2_0= ruleRules ) ) ( (lv_grid_3_0= ruleGrid ) ) )
            // InternalGDSL.g:116:3: otherlv_0= 'Game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rules_2_0= ruleRules ) ) ( (lv_grid_3_0= ruleGrid ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGOLAccess().getGameKeyword_0());
            		
            // InternalGDSL.g:120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGDSL.g:121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGDSL.g:121:4: (lv_name_1_0= RULE_ID )
            // InternalGDSL.g:122:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGOLAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGOLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGDSL.g:138:3: ( (lv_rules_2_0= ruleRules ) )
            // InternalGDSL.g:139:4: (lv_rules_2_0= ruleRules )
            {
            // InternalGDSL.g:139:4: (lv_rules_2_0= ruleRules )
            // InternalGDSL.g:140:5: lv_rules_2_0= ruleRules
            {

            					newCompositeNode(grammarAccess.getGOLAccess().getRulesRulesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_rules_2_0=ruleRules();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGOLRule());
            					}
            					set(
            						current,
            						"rules",
            						lv_rules_2_0,
            						"gameoflife.GDSL.Rules");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGDSL.g:157:3: ( (lv_grid_3_0= ruleGrid ) )
            // InternalGDSL.g:158:4: (lv_grid_3_0= ruleGrid )
            {
            // InternalGDSL.g:158:4: (lv_grid_3_0= ruleGrid )
            // InternalGDSL.g:159:5: lv_grid_3_0= ruleGrid
            {

            					newCompositeNode(grammarAccess.getGOLAccess().getGridGridParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_grid_3_0=ruleGrid();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGOLRule());
            					}
            					set(
            						current,
            						"grid",
            						lv_grid_3_0,
            						"gameoflife.GDSL.Grid");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleGOL"


    // $ANTLR start "entryRuleRules"
    // InternalGDSL.g:180:1: entryRuleRules returns [EObject current=null] : iv_ruleRules= ruleRules EOF ;
    public final EObject entryRuleRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRules = null;


        try {
            // InternalGDSL.g:180:46: (iv_ruleRules= ruleRules EOF )
            // InternalGDSL.g:181:2: iv_ruleRules= ruleRules EOF
            {
             newCompositeNode(grammarAccess.getRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRules=ruleRules();

            state._fsp--;

             current =iv_ruleRules; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRules"


    // $ANTLR start "ruleRules"
    // InternalGDSL.g:187:1: ruleRules returns [EObject current=null] : (otherlv_0= 'Rules' otherlv_1= '{' ( (lv_rules_2_0= ruleRule ) )* otherlv_3= '}' ) ;
    public final EObject ruleRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rules_2_0 = null;



        	enterRule();

        try {
            // InternalGDSL.g:193:2: ( (otherlv_0= 'Rules' otherlv_1= '{' ( (lv_rules_2_0= ruleRule ) )* otherlv_3= '}' ) )
            // InternalGDSL.g:194:2: (otherlv_0= 'Rules' otherlv_1= '{' ( (lv_rules_2_0= ruleRule ) )* otherlv_3= '}' )
            {
            // InternalGDSL.g:194:2: (otherlv_0= 'Rules' otherlv_1= '{' ( (lv_rules_2_0= ruleRule ) )* otherlv_3= '}' )
            // InternalGDSL.g:195:3: otherlv_0= 'Rules' otherlv_1= '{' ( (lv_rules_2_0= ruleRule ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRulesAccess().getRulesKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRulesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGDSL.g:203:3: ( (lv_rules_2_0= ruleRule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=21 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGDSL.g:204:4: (lv_rules_2_0= ruleRule )
            	    {
            	    // InternalGDSL.g:204:4: (lv_rules_2_0= ruleRule )
            	    // InternalGDSL.g:205:5: lv_rules_2_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getRulesAccess().getRulesRuleParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_rules_2_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRulesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_2_0,
            	    						"gameoflife.GDSL.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRulesAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleRules"


    // $ANTLR start "entryRuleRule"
    // InternalGDSL.g:230:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalGDSL.g:230:45: (iv_ruleRule= ruleRule EOF )
            // InternalGDSL.g:231:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalGDSL.g:237:1: ruleRule returns [EObject current=null] : ( ( (lv_state_0_0= ruleState ) ) otherlv_1= 'if' otherlv_2= 'neighbors' ( (lv_operator_3_0= ruleCompare ) ) ( (lv_amount_4_0= RULE_INT ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_amount_4_0=null;
        Enumerator lv_state_0_0 = null;

        Enumerator lv_operator_3_0 = null;



        	enterRule();

        try {
            // InternalGDSL.g:243:2: ( ( ( (lv_state_0_0= ruleState ) ) otherlv_1= 'if' otherlv_2= 'neighbors' ( (lv_operator_3_0= ruleCompare ) ) ( (lv_amount_4_0= RULE_INT ) ) ) )
            // InternalGDSL.g:244:2: ( ( (lv_state_0_0= ruleState ) ) otherlv_1= 'if' otherlv_2= 'neighbors' ( (lv_operator_3_0= ruleCompare ) ) ( (lv_amount_4_0= RULE_INT ) ) )
            {
            // InternalGDSL.g:244:2: ( ( (lv_state_0_0= ruleState ) ) otherlv_1= 'if' otherlv_2= 'neighbors' ( (lv_operator_3_0= ruleCompare ) ) ( (lv_amount_4_0= RULE_INT ) ) )
            // InternalGDSL.g:245:3: ( (lv_state_0_0= ruleState ) ) otherlv_1= 'if' otherlv_2= 'neighbors' ( (lv_operator_3_0= ruleCompare ) ) ( (lv_amount_4_0= RULE_INT ) )
            {
            // InternalGDSL.g:245:3: ( (lv_state_0_0= ruleState ) )
            // InternalGDSL.g:246:4: (lv_state_0_0= ruleState )
            {
            // InternalGDSL.g:246:4: (lv_state_0_0= ruleState )
            // InternalGDSL.g:247:5: lv_state_0_0= ruleState
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getStateStateEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_state_0_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_0_0,
            						"gameoflife.GDSL.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getIfKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getNeighborsKeyword_2());
            		
            // InternalGDSL.g:272:3: ( (lv_operator_3_0= ruleCompare ) )
            // InternalGDSL.g:273:4: (lv_operator_3_0= ruleCompare )
            {
            // InternalGDSL.g:273:4: (lv_operator_3_0= ruleCompare )
            // InternalGDSL.g:274:5: lv_operator_3_0= ruleCompare
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getOperatorCompareEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_operator_3_0=ruleCompare();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_3_0,
            						"gameoflife.GDSL.Compare");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGDSL.g:291:3: ( (lv_amount_4_0= RULE_INT ) )
            // InternalGDSL.g:292:4: (lv_amount_4_0= RULE_INT )
            {
            // InternalGDSL.g:292:4: (lv_amount_4_0= RULE_INT )
            // InternalGDSL.g:293:5: lv_amount_4_0= RULE_INT
            {
            lv_amount_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_amount_4_0, grammarAccess.getRuleAccess().getAmountINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amount",
            						lv_amount_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleGrid"
    // InternalGDSL.g:313:1: entryRuleGrid returns [EObject current=null] : iv_ruleGrid= ruleGrid EOF ;
    public final EObject entryRuleGrid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrid = null;


        try {
            // InternalGDSL.g:313:45: (iv_ruleGrid= ruleGrid EOF )
            // InternalGDSL.g:314:2: iv_ruleGrid= ruleGrid EOF
            {
             newCompositeNode(grammarAccess.getGridRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrid=ruleGrid();

            state._fsp--;

             current =iv_ruleGrid; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGrid"


    // $ANTLR start "ruleGrid"
    // InternalGDSL.g:320:1: ruleGrid returns [EObject current=null] : (otherlv_0= 'Grid' otherlv_1= '{' ( (lv_cell_2_0= ruleCell ) )* otherlv_3= '}' ) ;
    public final EObject ruleGrid() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_cell_2_0 = null;



        	enterRule();

        try {
            // InternalGDSL.g:326:2: ( (otherlv_0= 'Grid' otherlv_1= '{' ( (lv_cell_2_0= ruleCell ) )* otherlv_3= '}' ) )
            // InternalGDSL.g:327:2: (otherlv_0= 'Grid' otherlv_1= '{' ( (lv_cell_2_0= ruleCell ) )* otherlv_3= '}' )
            {
            // InternalGDSL.g:327:2: (otherlv_0= 'Grid' otherlv_1= '{' ( (lv_cell_2_0= ruleCell ) )* otherlv_3= '}' )
            // InternalGDSL.g:328:3: otherlv_0= 'Grid' otherlv_1= '{' ( (lv_cell_2_0= ruleCell ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGridAccess().getGridKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getGridAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGDSL.g:336:3: ( (lv_cell_2_0= ruleCell ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGDSL.g:337:4: (lv_cell_2_0= ruleCell )
            	    {
            	    // InternalGDSL.g:337:4: (lv_cell_2_0= ruleCell )
            	    // InternalGDSL.g:338:5: lv_cell_2_0= ruleCell
            	    {

            	    					newCompositeNode(grammarAccess.getGridAccess().getCellCellParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_cell_2_0=ruleCell();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGridRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cell",
            	    						lv_cell_2_0,
            	    						"gameoflife.GDSL.Cell");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getGridAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleGrid"


    // $ANTLR start "entryRuleCell"
    // InternalGDSL.g:363:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // InternalGDSL.g:363:45: (iv_ruleCell= ruleCell EOF )
            // InternalGDSL.g:364:2: iv_ruleCell= ruleCell EOF
            {
             newCompositeNode(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCell=ruleCell();

            state._fsp--;

             current =iv_ruleCell; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalGDSL.g:370:1: ruleCell returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGDSL.g:376:2: ( (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalGDSL.g:377:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalGDSL.g:377:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalGDSL.g:378:3: otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCellAccess().getLeftParenthesisKeyword_0());
            		
            // InternalGDSL.g:382:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalGDSL.g:383:4: (lv_x_1_0= RULE_INT )
            {
            // InternalGDSL.g:383:4: (lv_x_1_0= RULE_INT )
            // InternalGDSL.g:384:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_x_1_0, grammarAccess.getCellAccess().getXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getCellAccess().getCommaKeyword_2());
            		
            // InternalGDSL.g:404:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalGDSL.g:405:4: (lv_y_3_0= RULE_INT )
            {
            // InternalGDSL.g:405:4: (lv_y_3_0= RULE_INT )
            // InternalGDSL.g:406:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_y_3_0, grammarAccess.getCellAccess().getYINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCellAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleCell"


    // $ANTLR start "ruleState"
    // InternalGDSL.g:430:1: ruleState returns [Enumerator current=null] : ( (enumLiteral_0= 'Live' ) | (enumLiteral_1= 'Dead' ) | (enumLiteral_2= 'Die' ) | (enumLiteral_3= 'ToAlive' ) ) ;
    public final Enumerator ruleState() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalGDSL.g:436:2: ( ( (enumLiteral_0= 'Live' ) | (enumLiteral_1= 'Dead' ) | (enumLiteral_2= 'Die' ) | (enumLiteral_3= 'ToAlive' ) ) )
            // InternalGDSL.g:437:2: ( (enumLiteral_0= 'Live' ) | (enumLiteral_1= 'Dead' ) | (enumLiteral_2= 'Die' ) | (enumLiteral_3= 'ToAlive' ) )
            {
            // InternalGDSL.g:437:2: ( (enumLiteral_0= 'Live' ) | (enumLiteral_1= 'Dead' ) | (enumLiteral_2= 'Die' ) | (enumLiteral_3= 'ToAlive' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 23:
                {
                alt3=3;
                }
                break;
            case 24:
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
                    // InternalGDSL.g:438:3: (enumLiteral_0= 'Live' )
                    {
                    // InternalGDSL.g:438:3: (enumLiteral_0= 'Live' )
                    // InternalGDSL.g:439:4: enumLiteral_0= 'Live'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getStateAccess().getLiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStateAccess().getLiveEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGDSL.g:446:3: (enumLiteral_1= 'Dead' )
                    {
                    // InternalGDSL.g:446:3: (enumLiteral_1= 'Dead' )
                    // InternalGDSL.g:447:4: enumLiteral_1= 'Dead'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getStateAccess().getDeadEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStateAccess().getDeadEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGDSL.g:454:3: (enumLiteral_2= 'Die' )
                    {
                    // InternalGDSL.g:454:3: (enumLiteral_2= 'Die' )
                    // InternalGDSL.g:455:4: enumLiteral_2= 'Die'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getStateAccess().getDieEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getStateAccess().getDieEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGDSL.g:462:3: (enumLiteral_3= 'ToAlive' )
                    {
                    // InternalGDSL.g:462:3: (enumLiteral_3= 'ToAlive' )
                    // InternalGDSL.g:463:4: enumLiteral_3= 'ToAlive'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getStateAccess().getToAliveEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getStateAccess().getToAliveEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleState"


    // $ANTLR start "ruleCompare"
    // InternalGDSL.g:473:1: ruleCompare returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '=' ) ) ;
    public final Enumerator ruleCompare() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGDSL.g:479:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '=' ) ) )
            // InternalGDSL.g:480:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '=' ) )
            {
            // InternalGDSL.g:480:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '=' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 27:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGDSL.g:481:3: (enumLiteral_0= '<' )
                    {
                    // InternalGDSL.g:481:3: (enumLiteral_0= '<' )
                    // InternalGDSL.g:482:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getCompareAccess().getLTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompareAccess().getLTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGDSL.g:489:3: (enumLiteral_1= '>' )
                    {
                    // InternalGDSL.g:489:3: (enumLiteral_1= '>' )
                    // InternalGDSL.g:490:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getCompareAccess().getGTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompareAccess().getGTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGDSL.g:497:3: (enumLiteral_2= '=' )
                    {
                    // InternalGDSL.g:497:3: (enumLiteral_2= '=' )
                    // InternalGDSL.g:498:4: enumLiteral_2= '='
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getCompareAccess().getEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompareAccess().getEQEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleCompare"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001E04000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});

}
package gol.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import gol.services.GDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Live'", "'Dead'", "'Die'", "'ToAlive'", "'<'", "'>'", "'='", "'Game'", "'Rules'", "'{'", "'}'", "'if'", "'neighbors'", "'Grid'", "'('", "','", "')'"
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

    	public void setGrammarAccess(GDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalGDSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalGDSL.g:54:1: ( ruleModel EOF )
            // InternalGDSL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGDSL.g:62:1: ruleModel : ( ( rule__Model__GolAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:66:2: ( ( ( rule__Model__GolAssignment ) ) )
            // InternalGDSL.g:67:2: ( ( rule__Model__GolAssignment ) )
            {
            // InternalGDSL.g:67:2: ( ( rule__Model__GolAssignment ) )
            // InternalGDSL.g:68:3: ( rule__Model__GolAssignment )
            {
             before(grammarAccess.getModelAccess().getGolAssignment()); 
            // InternalGDSL.g:69:3: ( rule__Model__GolAssignment )
            // InternalGDSL.g:69:4: rule__Model__GolAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__GolAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGolAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGOL"
    // InternalGDSL.g:78:1: entryRuleGOL : ruleGOL EOF ;
    public final void entryRuleGOL() throws RecognitionException {
        try {
            // InternalGDSL.g:79:1: ( ruleGOL EOF )
            // InternalGDSL.g:80:1: ruleGOL EOF
            {
             before(grammarAccess.getGOLRule()); 
            pushFollow(FOLLOW_1);
            ruleGOL();

            state._fsp--;

             after(grammarAccess.getGOLRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGOL"


    // $ANTLR start "ruleGOL"
    // InternalGDSL.g:87:1: ruleGOL : ( ( rule__GOL__Group__0 ) ) ;
    public final void ruleGOL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:91:2: ( ( ( rule__GOL__Group__0 ) ) )
            // InternalGDSL.g:92:2: ( ( rule__GOL__Group__0 ) )
            {
            // InternalGDSL.g:92:2: ( ( rule__GOL__Group__0 ) )
            // InternalGDSL.g:93:3: ( rule__GOL__Group__0 )
            {
             before(grammarAccess.getGOLAccess().getGroup()); 
            // InternalGDSL.g:94:3: ( rule__GOL__Group__0 )
            // InternalGDSL.g:94:4: rule__GOL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GOL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGOLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGOL"


    // $ANTLR start "entryRuleRules"
    // InternalGDSL.g:103:1: entryRuleRules : ruleRules EOF ;
    public final void entryRuleRules() throws RecognitionException {
        try {
            // InternalGDSL.g:104:1: ( ruleRules EOF )
            // InternalGDSL.g:105:1: ruleRules EOF
            {
             before(grammarAccess.getRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleRules();

            state._fsp--;

             after(grammarAccess.getRulesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRules"


    // $ANTLR start "ruleRules"
    // InternalGDSL.g:112:1: ruleRules : ( ( rule__Rules__Group__0 ) ) ;
    public final void ruleRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:116:2: ( ( ( rule__Rules__Group__0 ) ) )
            // InternalGDSL.g:117:2: ( ( rule__Rules__Group__0 ) )
            {
            // InternalGDSL.g:117:2: ( ( rule__Rules__Group__0 ) )
            // InternalGDSL.g:118:3: ( rule__Rules__Group__0 )
            {
             before(grammarAccess.getRulesAccess().getGroup()); 
            // InternalGDSL.g:119:3: ( rule__Rules__Group__0 )
            // InternalGDSL.g:119:4: rule__Rules__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rules__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRulesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRules"


    // $ANTLR start "entryRuleRule"
    // InternalGDSL.g:128:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalGDSL.g:129:1: ( ruleRule EOF )
            // InternalGDSL.g:130:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalGDSL.g:137:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:141:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalGDSL.g:142:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalGDSL.g:142:2: ( ( rule__Rule__Group__0 ) )
            // InternalGDSL.g:143:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalGDSL.g:144:3: ( rule__Rule__Group__0 )
            // InternalGDSL.g:144:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleGrid"
    // InternalGDSL.g:153:1: entryRuleGrid : ruleGrid EOF ;
    public final void entryRuleGrid() throws RecognitionException {
        try {
            // InternalGDSL.g:154:1: ( ruleGrid EOF )
            // InternalGDSL.g:155:1: ruleGrid EOF
            {
             before(grammarAccess.getGridRule()); 
            pushFollow(FOLLOW_1);
            ruleGrid();

            state._fsp--;

             after(grammarAccess.getGridRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGrid"


    // $ANTLR start "ruleGrid"
    // InternalGDSL.g:162:1: ruleGrid : ( ( rule__Grid__Group__0 ) ) ;
    public final void ruleGrid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:166:2: ( ( ( rule__Grid__Group__0 ) ) )
            // InternalGDSL.g:167:2: ( ( rule__Grid__Group__0 ) )
            {
            // InternalGDSL.g:167:2: ( ( rule__Grid__Group__0 ) )
            // InternalGDSL.g:168:3: ( rule__Grid__Group__0 )
            {
             before(grammarAccess.getGridAccess().getGroup()); 
            // InternalGDSL.g:169:3: ( rule__Grid__Group__0 )
            // InternalGDSL.g:169:4: rule__Grid__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Grid__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrid"


    // $ANTLR start "entryRuleCell"
    // InternalGDSL.g:178:1: entryRuleCell : ruleCell EOF ;
    public final void entryRuleCell() throws RecognitionException {
        try {
            // InternalGDSL.g:179:1: ( ruleCell EOF )
            // InternalGDSL.g:180:1: ruleCell EOF
            {
             before(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getCellRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalGDSL.g:187:1: ruleCell : ( ( rule__Cell__Group__0 ) ) ;
    public final void ruleCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:191:2: ( ( ( rule__Cell__Group__0 ) ) )
            // InternalGDSL.g:192:2: ( ( rule__Cell__Group__0 ) )
            {
            // InternalGDSL.g:192:2: ( ( rule__Cell__Group__0 ) )
            // InternalGDSL.g:193:3: ( rule__Cell__Group__0 )
            {
             before(grammarAccess.getCellAccess().getGroup()); 
            // InternalGDSL.g:194:3: ( rule__Cell__Group__0 )
            // InternalGDSL.g:194:4: rule__Cell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCell"


    // $ANTLR start "ruleState"
    // InternalGDSL.g:203:1: ruleState : ( ( rule__State__Alternatives ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:207:1: ( ( ( rule__State__Alternatives ) ) )
            // InternalGDSL.g:208:2: ( ( rule__State__Alternatives ) )
            {
            // InternalGDSL.g:208:2: ( ( rule__State__Alternatives ) )
            // InternalGDSL.g:209:3: ( rule__State__Alternatives )
            {
             before(grammarAccess.getStateAccess().getAlternatives()); 
            // InternalGDSL.g:210:3: ( rule__State__Alternatives )
            // InternalGDSL.g:210:4: rule__State__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__State__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "ruleCompare"
    // InternalGDSL.g:219:1: ruleCompare : ( ( rule__Compare__Alternatives ) ) ;
    public final void ruleCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:223:1: ( ( ( rule__Compare__Alternatives ) ) )
            // InternalGDSL.g:224:2: ( ( rule__Compare__Alternatives ) )
            {
            // InternalGDSL.g:224:2: ( ( rule__Compare__Alternatives ) )
            // InternalGDSL.g:225:3: ( rule__Compare__Alternatives )
            {
             before(grammarAccess.getCompareAccess().getAlternatives()); 
            // InternalGDSL.g:226:3: ( rule__Compare__Alternatives )
            // InternalGDSL.g:226:4: rule__Compare__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompareAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompare"


    // $ANTLR start "rule__State__Alternatives"
    // InternalGDSL.g:234:1: rule__State__Alternatives : ( ( ( 'Live' ) ) | ( ( 'Dead' ) ) | ( ( 'Die' ) ) | ( ( 'ToAlive' ) ) );
    public final void rule__State__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:238:1: ( ( ( 'Live' ) ) | ( ( 'Dead' ) ) | ( ( 'Die' ) ) | ( ( 'ToAlive' ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGDSL.g:239:2: ( ( 'Live' ) )
                    {
                    // InternalGDSL.g:239:2: ( ( 'Live' ) )
                    // InternalGDSL.g:240:3: ( 'Live' )
                    {
                     before(grammarAccess.getStateAccess().getLiveEnumLiteralDeclaration_0()); 
                    // InternalGDSL.g:241:3: ( 'Live' )
                    // InternalGDSL.g:241:4: 'Live'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getStateAccess().getLiveEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGDSL.g:245:2: ( ( 'Dead' ) )
                    {
                    // InternalGDSL.g:245:2: ( ( 'Dead' ) )
                    // InternalGDSL.g:246:3: ( 'Dead' )
                    {
                     before(grammarAccess.getStateAccess().getDeadEnumLiteralDeclaration_1()); 
                    // InternalGDSL.g:247:3: ( 'Dead' )
                    // InternalGDSL.g:247:4: 'Dead'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getStateAccess().getDeadEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGDSL.g:251:2: ( ( 'Die' ) )
                    {
                    // InternalGDSL.g:251:2: ( ( 'Die' ) )
                    // InternalGDSL.g:252:3: ( 'Die' )
                    {
                     before(grammarAccess.getStateAccess().getDieEnumLiteralDeclaration_2()); 
                    // InternalGDSL.g:253:3: ( 'Die' )
                    // InternalGDSL.g:253:4: 'Die'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getStateAccess().getDieEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGDSL.g:257:2: ( ( 'ToAlive' ) )
                    {
                    // InternalGDSL.g:257:2: ( ( 'ToAlive' ) )
                    // InternalGDSL.g:258:3: ( 'ToAlive' )
                    {
                     before(grammarAccess.getStateAccess().getToAliveEnumLiteralDeclaration_3()); 
                    // InternalGDSL.g:259:3: ( 'ToAlive' )
                    // InternalGDSL.g:259:4: 'ToAlive'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getStateAccess().getToAliveEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__State__Alternatives"


    // $ANTLR start "rule__Compare__Alternatives"
    // InternalGDSL.g:267:1: rule__Compare__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '=' ) ) );
    public final void rule__Compare__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:271:1: ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '=' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
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
                    // InternalGDSL.g:272:2: ( ( '<' ) )
                    {
                    // InternalGDSL.g:272:2: ( ( '<' ) )
                    // InternalGDSL.g:273:3: ( '<' )
                    {
                     before(grammarAccess.getCompareAccess().getLTEnumLiteralDeclaration_0()); 
                    // InternalGDSL.g:274:3: ( '<' )
                    // InternalGDSL.g:274:4: '<'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareAccess().getLTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGDSL.g:278:2: ( ( '>' ) )
                    {
                    // InternalGDSL.g:278:2: ( ( '>' ) )
                    // InternalGDSL.g:279:3: ( '>' )
                    {
                     before(grammarAccess.getCompareAccess().getGTEnumLiteralDeclaration_1()); 
                    // InternalGDSL.g:280:3: ( '>' )
                    // InternalGDSL.g:280:4: '>'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareAccess().getGTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGDSL.g:284:2: ( ( '=' ) )
                    {
                    // InternalGDSL.g:284:2: ( ( '=' ) )
                    // InternalGDSL.g:285:3: ( '=' )
                    {
                     before(grammarAccess.getCompareAccess().getEQEnumLiteralDeclaration_2()); 
                    // InternalGDSL.g:286:3: ( '=' )
                    // InternalGDSL.g:286:4: '='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareAccess().getEQEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Compare__Alternatives"


    // $ANTLR start "rule__GOL__Group__0"
    // InternalGDSL.g:294:1: rule__GOL__Group__0 : rule__GOL__Group__0__Impl rule__GOL__Group__1 ;
    public final void rule__GOL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:298:1: ( rule__GOL__Group__0__Impl rule__GOL__Group__1 )
            // InternalGDSL.g:299:2: rule__GOL__Group__0__Impl rule__GOL__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GOL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GOL__Group__1();

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
    // $ANTLR end "rule__GOL__Group__0"


    // $ANTLR start "rule__GOL__Group__0__Impl"
    // InternalGDSL.g:306:1: rule__GOL__Group__0__Impl : ( 'Game' ) ;
    public final void rule__GOL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:310:1: ( ( 'Game' ) )
            // InternalGDSL.g:311:1: ( 'Game' )
            {
            // InternalGDSL.g:311:1: ( 'Game' )
            // InternalGDSL.g:312:2: 'Game'
            {
             before(grammarAccess.getGOLAccess().getGameKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGOLAccess().getGameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOL__Group__0__Impl"


    // $ANTLR start "rule__GOL__Group__1"
    // InternalGDSL.g:321:1: rule__GOL__Group__1 : rule__GOL__Group__1__Impl rule__GOL__Group__2 ;
    public final void rule__GOL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:325:1: ( rule__GOL__Group__1__Impl rule__GOL__Group__2 )
            // InternalGDSL.g:326:2: rule__GOL__Group__1__Impl rule__GOL__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GOL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GOL__Group__2();

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
    // $ANTLR end "rule__GOL__Group__1"


    // $ANTLR start "rule__GOL__Group__1__Impl"
    // InternalGDSL.g:333:1: rule__GOL__Group__1__Impl : ( ( rule__GOL__NameAssignment_1 ) ) ;
    public final void rule__GOL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:337:1: ( ( ( rule__GOL__NameAssignment_1 ) ) )
            // InternalGDSL.g:338:1: ( ( rule__GOL__NameAssignment_1 ) )
            {
            // InternalGDSL.g:338:1: ( ( rule__GOL__NameAssignment_1 ) )
            // InternalGDSL.g:339:2: ( rule__GOL__NameAssignment_1 )
            {
             before(grammarAccess.getGOLAccess().getNameAssignment_1()); 
            // InternalGDSL.g:340:2: ( rule__GOL__NameAssignment_1 )
            // InternalGDSL.g:340:3: rule__GOL__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GOL__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGOLAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOL__Group__1__Impl"


    // $ANTLR start "rule__GOL__Group__2"
    // InternalGDSL.g:348:1: rule__GOL__Group__2 : rule__GOL__Group__2__Impl rule__GOL__Group__3 ;
    public final void rule__GOL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:352:1: ( rule__GOL__Group__2__Impl rule__GOL__Group__3 )
            // InternalGDSL.g:353:2: rule__GOL__Group__2__Impl rule__GOL__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__GOL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GOL__Group__3();

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
    // $ANTLR end "rule__GOL__Group__2"


    // $ANTLR start "rule__GOL__Group__2__Impl"
    // InternalGDSL.g:360:1: rule__GOL__Group__2__Impl : ( ( rule__GOL__RulesAssignment_2 ) ) ;
    public final void rule__GOL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:364:1: ( ( ( rule__GOL__RulesAssignment_2 ) ) )
            // InternalGDSL.g:365:1: ( ( rule__GOL__RulesAssignment_2 ) )
            {
            // InternalGDSL.g:365:1: ( ( rule__GOL__RulesAssignment_2 ) )
            // InternalGDSL.g:366:2: ( rule__GOL__RulesAssignment_2 )
            {
             before(grammarAccess.getGOLAccess().getRulesAssignment_2()); 
            // InternalGDSL.g:367:2: ( rule__GOL__RulesAssignment_2 )
            // InternalGDSL.g:367:3: rule__GOL__RulesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GOL__RulesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGOLAccess().getRulesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOL__Group__2__Impl"


    // $ANTLR start "rule__GOL__Group__3"
    // InternalGDSL.g:375:1: rule__GOL__Group__3 : rule__GOL__Group__3__Impl ;
    public final void rule__GOL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:379:1: ( rule__GOL__Group__3__Impl )
            // InternalGDSL.g:380:2: rule__GOL__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GOL__Group__3__Impl();

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
    // $ANTLR end "rule__GOL__Group__3"


    // $ANTLR start "rule__GOL__Group__3__Impl"
    // InternalGDSL.g:386:1: rule__GOL__Group__3__Impl : ( ( rule__GOL__GridAssignment_3 ) ) ;
    public final void rule__GOL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:390:1: ( ( ( rule__GOL__GridAssignment_3 ) ) )
            // InternalGDSL.g:391:1: ( ( rule__GOL__GridAssignment_3 ) )
            {
            // InternalGDSL.g:391:1: ( ( rule__GOL__GridAssignment_3 ) )
            // InternalGDSL.g:392:2: ( rule__GOL__GridAssignment_3 )
            {
             before(grammarAccess.getGOLAccess().getGridAssignment_3()); 
            // InternalGDSL.g:393:2: ( rule__GOL__GridAssignment_3 )
            // InternalGDSL.g:393:3: rule__GOL__GridAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GOL__GridAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGOLAccess().getGridAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOL__Group__3__Impl"


    // $ANTLR start "rule__Rules__Group__0"
    // InternalGDSL.g:402:1: rule__Rules__Group__0 : rule__Rules__Group__0__Impl rule__Rules__Group__1 ;
    public final void rule__Rules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:406:1: ( rule__Rules__Group__0__Impl rule__Rules__Group__1 )
            // InternalGDSL.g:407:2: rule__Rules__Group__0__Impl rule__Rules__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Rules__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rules__Group__1();

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
    // $ANTLR end "rule__Rules__Group__0"


    // $ANTLR start "rule__Rules__Group__0__Impl"
    // InternalGDSL.g:414:1: rule__Rules__Group__0__Impl : ( 'Rules' ) ;
    public final void rule__Rules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:418:1: ( ( 'Rules' ) )
            // InternalGDSL.g:419:1: ( 'Rules' )
            {
            // InternalGDSL.g:419:1: ( 'Rules' )
            // InternalGDSL.g:420:2: 'Rules'
            {
             before(grammarAccess.getRulesAccess().getRulesKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRulesAccess().getRulesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__0__Impl"


    // $ANTLR start "rule__Rules__Group__1"
    // InternalGDSL.g:429:1: rule__Rules__Group__1 : rule__Rules__Group__1__Impl rule__Rules__Group__2 ;
    public final void rule__Rules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:433:1: ( rule__Rules__Group__1__Impl rule__Rules__Group__2 )
            // InternalGDSL.g:434:2: rule__Rules__Group__1__Impl rule__Rules__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Rules__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rules__Group__2();

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
    // $ANTLR end "rule__Rules__Group__1"


    // $ANTLR start "rule__Rules__Group__1__Impl"
    // InternalGDSL.g:441:1: rule__Rules__Group__1__Impl : ( '{' ) ;
    public final void rule__Rules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:445:1: ( ( '{' ) )
            // InternalGDSL.g:446:1: ( '{' )
            {
            // InternalGDSL.g:446:1: ( '{' )
            // InternalGDSL.g:447:2: '{'
            {
             before(grammarAccess.getRulesAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRulesAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__1__Impl"


    // $ANTLR start "rule__Rules__Group__2"
    // InternalGDSL.g:456:1: rule__Rules__Group__2 : rule__Rules__Group__2__Impl rule__Rules__Group__3 ;
    public final void rule__Rules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:460:1: ( rule__Rules__Group__2__Impl rule__Rules__Group__3 )
            // InternalGDSL.g:461:2: rule__Rules__Group__2__Impl rule__Rules__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Rules__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rules__Group__3();

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
    // $ANTLR end "rule__Rules__Group__2"


    // $ANTLR start "rule__Rules__Group__2__Impl"
    // InternalGDSL.g:468:1: rule__Rules__Group__2__Impl : ( ( rule__Rules__RulesAssignment_2 )* ) ;
    public final void rule__Rules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:472:1: ( ( ( rule__Rules__RulesAssignment_2 )* ) )
            // InternalGDSL.g:473:1: ( ( rule__Rules__RulesAssignment_2 )* )
            {
            // InternalGDSL.g:473:1: ( ( rule__Rules__RulesAssignment_2 )* )
            // InternalGDSL.g:474:2: ( rule__Rules__RulesAssignment_2 )*
            {
             before(grammarAccess.getRulesAccess().getRulesAssignment_2()); 
            // InternalGDSL.g:475:2: ( rule__Rules__RulesAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=11 && LA3_0<=14)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGDSL.g:475:3: rule__Rules__RulesAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Rules__RulesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRulesAccess().getRulesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__2__Impl"


    // $ANTLR start "rule__Rules__Group__3"
    // InternalGDSL.g:483:1: rule__Rules__Group__3 : rule__Rules__Group__3__Impl ;
    public final void rule__Rules__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:487:1: ( rule__Rules__Group__3__Impl )
            // InternalGDSL.g:488:2: rule__Rules__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rules__Group__3__Impl();

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
    // $ANTLR end "rule__Rules__Group__3"


    // $ANTLR start "rule__Rules__Group__3__Impl"
    // InternalGDSL.g:494:1: rule__Rules__Group__3__Impl : ( '}' ) ;
    public final void rule__Rules__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:498:1: ( ( '}' ) )
            // InternalGDSL.g:499:1: ( '}' )
            {
            // InternalGDSL.g:499:1: ( '}' )
            // InternalGDSL.g:500:2: '}'
            {
             before(grammarAccess.getRulesAccess().getRightCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRulesAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalGDSL.g:510:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:514:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalGDSL.g:515:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalGDSL.g:522:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__StateAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:526:1: ( ( ( rule__Rule__StateAssignment_0 ) ) )
            // InternalGDSL.g:527:1: ( ( rule__Rule__StateAssignment_0 ) )
            {
            // InternalGDSL.g:527:1: ( ( rule__Rule__StateAssignment_0 ) )
            // InternalGDSL.g:528:2: ( rule__Rule__StateAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getStateAssignment_0()); 
            // InternalGDSL.g:529:2: ( rule__Rule__StateAssignment_0 )
            // InternalGDSL.g:529:3: rule__Rule__StateAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__StateAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getStateAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalGDSL.g:537:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:541:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalGDSL.g:542:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalGDSL.g:549:1: rule__Rule__Group__1__Impl : ( 'if' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:553:1: ( ( 'if' ) )
            // InternalGDSL.g:554:1: ( 'if' )
            {
            // InternalGDSL.g:554:1: ( 'if' )
            // InternalGDSL.g:555:2: 'if'
            {
             before(grammarAccess.getRuleAccess().getIfKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getIfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalGDSL.g:564:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:568:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalGDSL.g:569:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

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
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalGDSL.g:576:1: rule__Rule__Group__2__Impl : ( 'neighbors' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:580:1: ( ( 'neighbors' ) )
            // InternalGDSL.g:581:1: ( 'neighbors' )
            {
            // InternalGDSL.g:581:1: ( 'neighbors' )
            // InternalGDSL.g:582:2: 'neighbors'
            {
             before(grammarAccess.getRuleAccess().getNeighborsKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNeighborsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalGDSL.g:591:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:595:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalGDSL.g:596:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

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
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalGDSL.g:603:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__OperatorAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:607:1: ( ( ( rule__Rule__OperatorAssignment_3 ) ) )
            // InternalGDSL.g:608:1: ( ( rule__Rule__OperatorAssignment_3 ) )
            {
            // InternalGDSL.g:608:1: ( ( rule__Rule__OperatorAssignment_3 ) )
            // InternalGDSL.g:609:2: ( rule__Rule__OperatorAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getOperatorAssignment_3()); 
            // InternalGDSL.g:610:2: ( rule__Rule__OperatorAssignment_3 )
            // InternalGDSL.g:610:3: rule__Rule__OperatorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__OperatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getOperatorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalGDSL.g:618:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:622:1: ( rule__Rule__Group__4__Impl )
            // InternalGDSL.g:623:2: rule__Rule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__4__Impl();

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
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalGDSL.g:629:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__AmountAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:633:1: ( ( ( rule__Rule__AmountAssignment_4 ) ) )
            // InternalGDSL.g:634:1: ( ( rule__Rule__AmountAssignment_4 ) )
            {
            // InternalGDSL.g:634:1: ( ( rule__Rule__AmountAssignment_4 ) )
            // InternalGDSL.g:635:2: ( rule__Rule__AmountAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getAmountAssignment_4()); 
            // InternalGDSL.g:636:2: ( rule__Rule__AmountAssignment_4 )
            // InternalGDSL.g:636:3: rule__Rule__AmountAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Rule__AmountAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAmountAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Grid__Group__0"
    // InternalGDSL.g:645:1: rule__Grid__Group__0 : rule__Grid__Group__0__Impl rule__Grid__Group__1 ;
    public final void rule__Grid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:649:1: ( rule__Grid__Group__0__Impl rule__Grid__Group__1 )
            // InternalGDSL.g:650:2: rule__Grid__Group__0__Impl rule__Grid__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Grid__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__1();

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
    // $ANTLR end "rule__Grid__Group__0"


    // $ANTLR start "rule__Grid__Group__0__Impl"
    // InternalGDSL.g:657:1: rule__Grid__Group__0__Impl : ( 'Grid' ) ;
    public final void rule__Grid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:661:1: ( ( 'Grid' ) )
            // InternalGDSL.g:662:1: ( 'Grid' )
            {
            // InternalGDSL.g:662:1: ( 'Grid' )
            // InternalGDSL.g:663:2: 'Grid'
            {
             before(grammarAccess.getGridAccess().getGridKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getGridKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__0__Impl"


    // $ANTLR start "rule__Grid__Group__1"
    // InternalGDSL.g:672:1: rule__Grid__Group__1 : rule__Grid__Group__1__Impl rule__Grid__Group__2 ;
    public final void rule__Grid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:676:1: ( rule__Grid__Group__1__Impl rule__Grid__Group__2 )
            // InternalGDSL.g:677:2: rule__Grid__Group__1__Impl rule__Grid__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Grid__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__2();

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
    // $ANTLR end "rule__Grid__Group__1"


    // $ANTLR start "rule__Grid__Group__1__Impl"
    // InternalGDSL.g:684:1: rule__Grid__Group__1__Impl : ( '{' ) ;
    public final void rule__Grid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:688:1: ( ( '{' ) )
            // InternalGDSL.g:689:1: ( '{' )
            {
            // InternalGDSL.g:689:1: ( '{' )
            // InternalGDSL.g:690:2: '{'
            {
             before(grammarAccess.getGridAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__1__Impl"


    // $ANTLR start "rule__Grid__Group__2"
    // InternalGDSL.g:699:1: rule__Grid__Group__2 : rule__Grid__Group__2__Impl rule__Grid__Group__3 ;
    public final void rule__Grid__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:703:1: ( rule__Grid__Group__2__Impl rule__Grid__Group__3 )
            // InternalGDSL.g:704:2: rule__Grid__Group__2__Impl rule__Grid__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Grid__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__3();

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
    // $ANTLR end "rule__Grid__Group__2"


    // $ANTLR start "rule__Grid__Group__2__Impl"
    // InternalGDSL.g:711:1: rule__Grid__Group__2__Impl : ( ( rule__Grid__CellAssignment_2 )* ) ;
    public final void rule__Grid__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:715:1: ( ( ( rule__Grid__CellAssignment_2 )* ) )
            // InternalGDSL.g:716:1: ( ( rule__Grid__CellAssignment_2 )* )
            {
            // InternalGDSL.g:716:1: ( ( rule__Grid__CellAssignment_2 )* )
            // InternalGDSL.g:717:2: ( rule__Grid__CellAssignment_2 )*
            {
             before(grammarAccess.getGridAccess().getCellAssignment_2()); 
            // InternalGDSL.g:718:2: ( rule__Grid__CellAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGDSL.g:718:3: rule__Grid__CellAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Grid__CellAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getGridAccess().getCellAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__2__Impl"


    // $ANTLR start "rule__Grid__Group__3"
    // InternalGDSL.g:726:1: rule__Grid__Group__3 : rule__Grid__Group__3__Impl ;
    public final void rule__Grid__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:730:1: ( rule__Grid__Group__3__Impl )
            // InternalGDSL.g:731:2: rule__Grid__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Grid__Group__3__Impl();

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
    // $ANTLR end "rule__Grid__Group__3"


    // $ANTLR start "rule__Grid__Group__3__Impl"
    // InternalGDSL.g:737:1: rule__Grid__Group__3__Impl : ( '}' ) ;
    public final void rule__Grid__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:741:1: ( ( '}' ) )
            // InternalGDSL.g:742:1: ( '}' )
            {
            // InternalGDSL.g:742:1: ( '}' )
            // InternalGDSL.g:743:2: '}'
            {
             before(grammarAccess.getGridAccess().getRightCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__3__Impl"


    // $ANTLR start "rule__Cell__Group__0"
    // InternalGDSL.g:753:1: rule__Cell__Group__0 : rule__Cell__Group__0__Impl rule__Cell__Group__1 ;
    public final void rule__Cell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:757:1: ( rule__Cell__Group__0__Impl rule__Cell__Group__1 )
            // InternalGDSL.g:758:2: rule__Cell__Group__0__Impl rule__Cell__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Cell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__1();

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
    // $ANTLR end "rule__Cell__Group__0"


    // $ANTLR start "rule__Cell__Group__0__Impl"
    // InternalGDSL.g:765:1: rule__Cell__Group__0__Impl : ( '(' ) ;
    public final void rule__Cell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:769:1: ( ( '(' ) )
            // InternalGDSL.g:770:1: ( '(' )
            {
            // InternalGDSL.g:770:1: ( '(' )
            // InternalGDSL.g:771:2: '('
            {
             before(grammarAccess.getCellAccess().getLeftParenthesisKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__0__Impl"


    // $ANTLR start "rule__Cell__Group__1"
    // InternalGDSL.g:780:1: rule__Cell__Group__1 : rule__Cell__Group__1__Impl rule__Cell__Group__2 ;
    public final void rule__Cell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:784:1: ( rule__Cell__Group__1__Impl rule__Cell__Group__2 )
            // InternalGDSL.g:785:2: rule__Cell__Group__1__Impl rule__Cell__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Cell__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__2();

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
    // $ANTLR end "rule__Cell__Group__1"


    // $ANTLR start "rule__Cell__Group__1__Impl"
    // InternalGDSL.g:792:1: rule__Cell__Group__1__Impl : ( ( rule__Cell__XAssignment_1 ) ) ;
    public final void rule__Cell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:796:1: ( ( ( rule__Cell__XAssignment_1 ) ) )
            // InternalGDSL.g:797:1: ( ( rule__Cell__XAssignment_1 ) )
            {
            // InternalGDSL.g:797:1: ( ( rule__Cell__XAssignment_1 ) )
            // InternalGDSL.g:798:2: ( rule__Cell__XAssignment_1 )
            {
             before(grammarAccess.getCellAccess().getXAssignment_1()); 
            // InternalGDSL.g:799:2: ( rule__Cell__XAssignment_1 )
            // InternalGDSL.g:799:3: rule__Cell__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cell__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getXAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__1__Impl"


    // $ANTLR start "rule__Cell__Group__2"
    // InternalGDSL.g:807:1: rule__Cell__Group__2 : rule__Cell__Group__2__Impl rule__Cell__Group__3 ;
    public final void rule__Cell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:811:1: ( rule__Cell__Group__2__Impl rule__Cell__Group__3 )
            // InternalGDSL.g:812:2: rule__Cell__Group__2__Impl rule__Cell__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Cell__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__3();

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
    // $ANTLR end "rule__Cell__Group__2"


    // $ANTLR start "rule__Cell__Group__2__Impl"
    // InternalGDSL.g:819:1: rule__Cell__Group__2__Impl : ( ',' ) ;
    public final void rule__Cell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:823:1: ( ( ',' ) )
            // InternalGDSL.g:824:1: ( ',' )
            {
            // InternalGDSL.g:824:1: ( ',' )
            // InternalGDSL.g:825:2: ','
            {
             before(grammarAccess.getCellAccess().getCommaKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__2__Impl"


    // $ANTLR start "rule__Cell__Group__3"
    // InternalGDSL.g:834:1: rule__Cell__Group__3 : rule__Cell__Group__3__Impl rule__Cell__Group__4 ;
    public final void rule__Cell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:838:1: ( rule__Cell__Group__3__Impl rule__Cell__Group__4 )
            // InternalGDSL.g:839:2: rule__Cell__Group__3__Impl rule__Cell__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Cell__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__4();

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
    // $ANTLR end "rule__Cell__Group__3"


    // $ANTLR start "rule__Cell__Group__3__Impl"
    // InternalGDSL.g:846:1: rule__Cell__Group__3__Impl : ( ( rule__Cell__YAssignment_3 ) ) ;
    public final void rule__Cell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:850:1: ( ( ( rule__Cell__YAssignment_3 ) ) )
            // InternalGDSL.g:851:1: ( ( rule__Cell__YAssignment_3 ) )
            {
            // InternalGDSL.g:851:1: ( ( rule__Cell__YAssignment_3 ) )
            // InternalGDSL.g:852:2: ( rule__Cell__YAssignment_3 )
            {
             before(grammarAccess.getCellAccess().getYAssignment_3()); 
            // InternalGDSL.g:853:2: ( rule__Cell__YAssignment_3 )
            // InternalGDSL.g:853:3: rule__Cell__YAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Cell__YAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getYAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__3__Impl"


    // $ANTLR start "rule__Cell__Group__4"
    // InternalGDSL.g:861:1: rule__Cell__Group__4 : rule__Cell__Group__4__Impl ;
    public final void rule__Cell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:865:1: ( rule__Cell__Group__4__Impl )
            // InternalGDSL.g:866:2: rule__Cell__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Group__4__Impl();

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
    // $ANTLR end "rule__Cell__Group__4"


    // $ANTLR start "rule__Cell__Group__4__Impl"
    // InternalGDSL.g:872:1: rule__Cell__Group__4__Impl : ( ')' ) ;
    public final void rule__Cell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:876:1: ( ( ')' ) )
            // InternalGDSL.g:877:1: ( ')' )
            {
            // InternalGDSL.g:877:1: ( ')' )
            // InternalGDSL.g:878:2: ')'
            {
             before(grammarAccess.getCellAccess().getRightParenthesisKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__4__Impl"


    // $ANTLR start "rule__Model__GolAssignment"
    // InternalGDSL.g:888:1: rule__Model__GolAssignment : ( ruleGOL ) ;
    public final void rule__Model__GolAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:892:1: ( ( ruleGOL ) )
            // InternalGDSL.g:893:2: ( ruleGOL )
            {
            // InternalGDSL.g:893:2: ( ruleGOL )
            // InternalGDSL.g:894:3: ruleGOL
            {
             before(grammarAccess.getModelAccess().getGolGOLParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleGOL();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGolGOLParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GolAssignment"


    // $ANTLR start "rule__GOL__NameAssignment_1"
    // InternalGDSL.g:903:1: rule__GOL__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GOL__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:907:1: ( ( RULE_ID ) )
            // InternalGDSL.g:908:2: ( RULE_ID )
            {
            // InternalGDSL.g:908:2: ( RULE_ID )
            // InternalGDSL.g:909:3: RULE_ID
            {
             before(grammarAccess.getGOLAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGOLAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOL__NameAssignment_1"


    // $ANTLR start "rule__GOL__RulesAssignment_2"
    // InternalGDSL.g:918:1: rule__GOL__RulesAssignment_2 : ( ruleRules ) ;
    public final void rule__GOL__RulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:922:1: ( ( ruleRules ) )
            // InternalGDSL.g:923:2: ( ruleRules )
            {
            // InternalGDSL.g:923:2: ( ruleRules )
            // InternalGDSL.g:924:3: ruleRules
            {
             before(grammarAccess.getGOLAccess().getRulesRulesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRules();

            state._fsp--;

             after(grammarAccess.getGOLAccess().getRulesRulesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOL__RulesAssignment_2"


    // $ANTLR start "rule__GOL__GridAssignment_3"
    // InternalGDSL.g:933:1: rule__GOL__GridAssignment_3 : ( ruleGrid ) ;
    public final void rule__GOL__GridAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:937:1: ( ( ruleGrid ) )
            // InternalGDSL.g:938:2: ( ruleGrid )
            {
            // InternalGDSL.g:938:2: ( ruleGrid )
            // InternalGDSL.g:939:3: ruleGrid
            {
             before(grammarAccess.getGOLAccess().getGridGridParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGrid();

            state._fsp--;

             after(grammarAccess.getGOLAccess().getGridGridParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOL__GridAssignment_3"


    // $ANTLR start "rule__Rules__RulesAssignment_2"
    // InternalGDSL.g:948:1: rule__Rules__RulesAssignment_2 : ( ruleRule ) ;
    public final void rule__Rules__RulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:952:1: ( ( ruleRule ) )
            // InternalGDSL.g:953:2: ( ruleRule )
            {
            // InternalGDSL.g:953:2: ( ruleRule )
            // InternalGDSL.g:954:3: ruleRule
            {
             before(grammarAccess.getRulesAccess().getRulesRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRulesAccess().getRulesRuleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__RulesAssignment_2"


    // $ANTLR start "rule__Rule__StateAssignment_0"
    // InternalGDSL.g:963:1: rule__Rule__StateAssignment_0 : ( ruleState ) ;
    public final void rule__Rule__StateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:967:1: ( ( ruleState ) )
            // InternalGDSL.g:968:2: ( ruleState )
            {
            // InternalGDSL.g:968:2: ( ruleState )
            // InternalGDSL.g:969:3: ruleState
            {
             before(grammarAccess.getRuleAccess().getStateStateEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getStateStateEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__StateAssignment_0"


    // $ANTLR start "rule__Rule__OperatorAssignment_3"
    // InternalGDSL.g:978:1: rule__Rule__OperatorAssignment_3 : ( ruleCompare ) ;
    public final void rule__Rule__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:982:1: ( ( ruleCompare ) )
            // InternalGDSL.g:983:2: ( ruleCompare )
            {
            // InternalGDSL.g:983:2: ( ruleCompare )
            // InternalGDSL.g:984:3: ruleCompare
            {
             before(grammarAccess.getRuleAccess().getOperatorCompareEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCompare();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getOperatorCompareEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__OperatorAssignment_3"


    // $ANTLR start "rule__Rule__AmountAssignment_4"
    // InternalGDSL.g:993:1: rule__Rule__AmountAssignment_4 : ( RULE_INT ) ;
    public final void rule__Rule__AmountAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:997:1: ( ( RULE_INT ) )
            // InternalGDSL.g:998:2: ( RULE_INT )
            {
            // InternalGDSL.g:998:2: ( RULE_INT )
            // InternalGDSL.g:999:3: RULE_INT
            {
             before(grammarAccess.getRuleAccess().getAmountINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getAmountINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__AmountAssignment_4"


    // $ANTLR start "rule__Grid__CellAssignment_2"
    // InternalGDSL.g:1008:1: rule__Grid__CellAssignment_2 : ( ruleCell ) ;
    public final void rule__Grid__CellAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:1012:1: ( ( ruleCell ) )
            // InternalGDSL.g:1013:2: ( ruleCell )
            {
            // InternalGDSL.g:1013:2: ( ruleCell )
            // InternalGDSL.g:1014:3: ruleCell
            {
             before(grammarAccess.getGridAccess().getCellCellParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getGridAccess().getCellCellParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__CellAssignment_2"


    // $ANTLR start "rule__Cell__XAssignment_1"
    // InternalGDSL.g:1023:1: rule__Cell__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Cell__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:1027:1: ( ( RULE_INT ) )
            // InternalGDSL.g:1028:2: ( RULE_INT )
            {
            // InternalGDSL.g:1028:2: ( RULE_INT )
            // InternalGDSL.g:1029:3: RULE_INT
            {
             before(grammarAccess.getCellAccess().getXINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getXINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__XAssignment_1"


    // $ANTLR start "rule__Cell__YAssignment_3"
    // InternalGDSL.g:1038:1: rule__Cell__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__Cell__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGDSL.g:1042:1: ( ( RULE_INT ) )
            // InternalGDSL.g:1043:2: ( RULE_INT )
            {
            // InternalGDSL.g:1043:2: ( RULE_INT )
            // InternalGDSL.g:1044:3: RULE_INT
            {
             before(grammarAccess.getCellAccess().getYINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getYINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__YAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000207800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000007802L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});

}